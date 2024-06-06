package ru.job4j.tracker.input;

import org.junit.jupiter.api.Test;
import ru.job4j.tracker.output.Output;
import ru.job4j.tracker.output.StubOutput;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ValidateInputTest {

    @Test
    void whenInvalidInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[]{"one", "1"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    void whenValidateInputIsRight() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[]{"3"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(3);
    }

    @Test
    void whenMultipleInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[]{"1", "2", "3"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected1 = input.askInt("Enter menu:");
        assertThat(selected1).isEqualTo(1);
        int selected2 = input.askInt("Enter menu:");
        assertThat(selected2).isEqualTo(2);
        int selected3 = input.askInt("Enter menu:");
        assertThat(selected3).isEqualTo(3);
    }

    @Test
    void whenNegativeInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[]{"-1"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected1 = input.askInt("Enter menu:");
        assertThat(selected1).isEqualTo(-1);
    }
}
