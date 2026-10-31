package p;

import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class rws implements omv0 {
    public final /* synthetic */ exs a;
    public final /* synthetic */ zws b;

    public /* synthetic */ rws(exs exsVar, zws zwsVar) {
        this.a = exsVar;
        this.b = zwsVar;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0068 A[FALL_THROUGH] */
    public final boolean apply(Object obj) {
        exs exsVar;
        Boolean bool;
        pna1 pna1Var;
        pna1 pna1Var2;
        ie30 ie30Var = (ie30) obj;
        if (this.b.A0 && ((bool = (exsVar = this.a).k) == null || !bool.booleanValue())) {
            int i = ie30Var.J;
            if (i != -1 && i > 2) {
                String str = ie30Var.f66p;
                if (str != null) {
                    switch (str) {
                        case "audio/eac3-joc":
                        case "audio/ac3":
                        case "audio/ac4":
                        case "audio/eac3":
                            if (Build.VERSION.SDK_INT >= 32 && (pna1Var2 = exsVar.i) != null && pna1Var2.b) {
                            }
                        default:
                            if (Build.VERSION.SDK_INT >= 32) {
                                break;
                            }
                            return false;
                    }
                } else if (Build.VERSION.SDK_INT >= 32 || (pna1Var = exsVar.i) == null || !pna1Var.b || !pna1Var.c() || !exsVar.i.d() || !exsVar.i.a(exsVar.j, ie30Var)) {
                    return false;
                }
            }
        }
        return true;
    }
}
