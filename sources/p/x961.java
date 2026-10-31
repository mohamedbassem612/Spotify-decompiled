package p;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import app.p000rive.semantics.SemanticState;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class x961 implements bhn {
    public final Context a;
    public final int b = Process.myUid();

    public x961(Context context) {
        this.a = context;
    }

    @Override // p.chn
    public final wk21 a() {
        StringBuilder sb = new StringBuilder(SemanticState.Modal);
        List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) this.a.getApplicationContext().getSystemService("activity")).getRunningServices(10000);
        ArrayList<ActivityManager.RunningServiceInfo> arrayList = new ArrayList();
        for (Object obj : runningServices) {
            if (((ActivityManager.RunningServiceInfo) obj).uid == this.b) {
                arrayList.add(obj);
            }
        }
        for (ActivityManager.RunningServiceInfo runningServiceInfo : arrayList) {
            sb.append("Service: ");
            sb.append(runningServiceInfo.service.getClassName());
            sb.append(" Client count: ");
            sb.append(runningServiceInfo.clientCount);
            sb.append(" Crash count: ");
            sb.append(runningServiceInfo.crashCount);
            sb.append(" Foreground state: ");
            sb.append(runningServiceInfo.foreground);
            sb.append('\n');
        }
        return new wk21("State of Services", "Lists the current state of our Services", sb.toString());
    }
}
