package duke.handlers;

import duke.exceptions.DukeException;
import duke.models.DukeResponse;
import duke.models.TaskList;
import duke.models.Todo;

import java.util.Objects;

public class AddTodoCommand implements DukeCommand {
    public DukeResponse run (TaskList taskList, String s) throws DukeException {
        if (Objects.equals(s, "")) {
            throw new DukeException("Todo must not be empty!");
        }
        Todo todo = new Todo(s);
        taskList.addTask(todo);
        return new DukeResponse("Added a todo: " + todo);
    }
}
