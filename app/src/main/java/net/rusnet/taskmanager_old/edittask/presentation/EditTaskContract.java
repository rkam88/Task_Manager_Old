package net.rusnet.taskmanager_old.edittask.presentation;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import net.rusnet.taskmanager_old.commons.domain.model.DateType;
import net.rusnet.taskmanager_old.commons.domain.model.Task;
import net.rusnet.taskmanager_old.commons.domain.model.TaskType;

import java.util.Date;

public interface EditTaskContract {

    interface View {
        void onTaskSavingFinished();

        void updateView(Task task);

        void updateTaskAlarm(long taskId);

        void showLoadingScreen();

        void hideLoadingScreen();
    }

    interface Presenter {
        void createNewTask(@NonNull String name,
                           @NonNull TaskType taskType,
                           @NonNull DateType dateType,
                           @Nullable Date endDate,
                           @Nullable Date reminderDate);

        void loadTask(long taskId);

        void updateTask(@NonNull Task task);
    }
}
