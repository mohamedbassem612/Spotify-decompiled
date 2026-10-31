package p;

import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tha extends eaa {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tha(til tilVar, byte b) {
        super(tilVar);
        this.b = b;
    }

    public final boolean b(vwl1 vwl1Var) {
        switch (this.b) {
            case 0:
                return vwl1Var.j.c;
            case 1:
                return vwl1Var.j.a == 2;
            case 2:
                return vwl1Var.j.a == 3;
            default:
                return vwl1Var.j.f;
        }
    }

    public final int d() {
        switch (this.b) {
            case 0:
                return 6;
            case 1:
                return 7;
            case 2:
                return 7;
            default:
                return 9;
        }
    }

    public final boolean e(Object obj) {
        boolean zBooleanValue;
        switch (this.b) {
            case 0:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                m8o0 m8o0Var = (m8o0) obj;
                return m8o0Var.e || !m8o0Var.a || (Build.VERSION.SDK_INT >= 26 && !m8o0Var.b);
            case 2:
                m8o0 m8o0Var2 = (m8o0) obj;
                return !m8o0Var2.a || m8o0Var2.c || m8o0Var2.e;
            default:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !zBooleanValue;
    }
}
