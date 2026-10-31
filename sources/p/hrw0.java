package p;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hrw0 {
    public static final hrw0 a = new hrw0();

    public static ArrayList a(Context context) {
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = z6x.a;
        }
        ArrayList arrayListO0 = o7h.o0(runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : arrayListO0) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            a09 a09Var = new a09();
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                bhn0.i("Null processName");
                return null;
            }
            a09Var.a = str2;
            a09Var.b = runningAppProcessInfo.pid;
            byte b = (byte) (a09Var.e | 1);
            a09Var.c = runningAppProcessInfo.importance;
            a09Var.e = (byte) (b | 2);
            a09Var.d = u890.j(str2, str);
            a09Var.e = (byte) (a09Var.e | 4);
            arrayList2.add(a09Var.a());
        }
        return arrayList2;
    }

    public final kin b(Context context) {
        Object next;
        String processName;
        int iMyPid = Process.myPid();
        Iterator it = a(context).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((b09) ((kin) next)).b != iMyPid);
        kin kinVar = (kin) next;
        if (kinVar != null) {
            return kinVar;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            processName = Process.myProcessName();
        } else if (i < 28 || (processName = Application.getProcessName()) == null) {
            processName = "";
        }
        a09 a09Var = new a09();
        a09Var.a = processName;
        a09Var.b = iMyPid;
        byte b = (byte) (a09Var.e | 1);
        a09Var.c = 0;
        a09Var.d = false;
        a09Var.e = (byte) (((byte) (b | 2)) | 4);
        return a09Var.a();
    }
}
