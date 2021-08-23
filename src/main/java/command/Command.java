package command;

import duke.Storage;
import duke.TaskList;
import duke.Ui;
import duke.exception.DukeException;

public abstract class Command {
    /**
     * A method to check whether the command is an ExitCommand.
     *
     * @return A boolean value indicating whether the command is an ExitCommand.
     */
    public boolean isExit() {
        return false;
    }

    /**
     * An abstract method that allows the command to be executed.
     *
     * @param taskList The given Duke TaskList.
     * @param ui The given Duke Ui.
     * @param storage The given Duke Storage.
     * @throws DukeException
     */
    public abstract void execute(TaskList taskList, Ui ui, Storage storage) throws DukeException;
}
