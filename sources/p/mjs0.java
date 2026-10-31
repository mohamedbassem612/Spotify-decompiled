package p;

import android.app.Application;
import android.os.Build;
import android.os.Process;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mjs0 extends uif1 {
    public final u1c b;
    public final esw0 c;

    public mjs0(g9x g9xVar, u1c u1cVar) {
        esw0 esw0Var;
        this.b = u1cVar;
        if (g9xVar.b) {
            esw0Var = g9x.d;
        } else {
            int iMyPid = Process.myPid();
            String processName = Build.VERSION.SDK_INT >= 28 ? Application.getProcessName() : gvg.e(iMyPid, "Process pid(", ")");
            synchronized (g9xVar.a) {
                if (!g9xVar.b) {
                    g9x.d = new esw0(g9xVar, iMyPid, processName);
                    g9xVar.b = true;
                }
            }
            esw0Var = g9x.d;
        }
        this.c = esw0Var;
    }
}
