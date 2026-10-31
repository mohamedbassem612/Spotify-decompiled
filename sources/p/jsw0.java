package p;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class jsw0 {
    static {
        qs10.c("ProcessUtils");
    }

    public static final boolean a(Context context) {
        String strB;
        Object next;
        if (Build.VERSION.SDK_INT >= 28) {
            strB = rh5.b();
        } else {
            strB = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, awl1.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(null, null);
                objInvoke.getClass();
                if (objInvoke instanceof String) {
                    strB = (String) objInvoke;
                } else {
                    int iMyPid = Process.myPid();
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
                    if (runningAppProcesses != null) {
                        Iterator<T> it = runningAppProcesses.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (((ActivityManager.RunningAppProcessInfo) next).pid != iMyPid);
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
                        if (runningAppProcessInfo != null) {
                            strB = runningAppProcessInfo.processName;
                        }
                    }
                }
            } catch (Throwable unused) {
                qs10.a().getClass();
            }
        }
        return u890.j(strB, context.getApplicationInfo().processName);
    }
}
