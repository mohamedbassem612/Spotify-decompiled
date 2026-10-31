package p;

import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class l {
    public static final int a = Process.myUid();
    public static final ScheduledExecutorService b = Executors.newSingleThreadScheduledExecutor();
    public static String c = "";
    public static final k d = new k((byte) 0);

    public static final void a(ActivityManager activityManager) {
        if (dhn.a.contains(l.class)) {
            return;
        }
        try {
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState != null) {
                for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                    if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == a) {
                        Thread thread = Looper.getMainLooper().getThread();
                        StackTraceElement[] stackTrace = thread.getStackTrace();
                        JSONArray jSONArray = new JSONArray();
                        for (StackTraceElement stackTraceElement : stackTrace) {
                            jSONArray.put(stackTraceElement.toString());
                        }
                        String string = jSONArray.toString();
                        if (!u890.j(string, c) && fap1.j(thread)) {
                            c = string;
                            v9p1.x(processErrorStateInfo.shortMsg, string).b();
                        }
                    }
                }
            }
        } catch (Throwable th) {
            dhn.a(l.class, th);
        }
    }
}
