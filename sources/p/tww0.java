package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class tww0 implements bh0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lzw0 b;

    public /* synthetic */ tww0(lzw0 lzw0Var, byte b) {
        this.a = b;
        this.b = lzw0Var;
    }

    public final void a(Object obj) {
        byte b = this.a;
        azw0 azw0Var = azw0.a;
        lzw0 lzw0Var = this.b;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) ((Map) obj).get("android.permission.CAMERA");
                if (bool != null) {
                    lzw0Var.b(new xyw0(bool.booleanValue()));
                }
                break;
            case 1:
                cys0 cys0Var = (cys0) obj;
                if (cys0Var instanceof bys0) {
                    lzw0Var.b(new bzw0(((bys0) cys0Var).a.toString()));
                    break;
                } else if (cys0Var instanceof ays0) {
                    lzw0Var.b(azw0Var);
                    break;
                } else if (!(cys0Var instanceof zxs0)) {
                    eg.o();
                    break;
                }
                break;
            case 2:
                Boolean bool2 = (Boolean) ((Map) obj).get("android.permission.CAMERA");
                if (bool2 != null) {
                    lzw0Var.b(new xyw0(bool2.booleanValue()));
                }
                break;
            default:
                cys0 cys0Var2 = (cys0) obj;
                if (cys0Var2 instanceof bys0) {
                    lzw0Var.b(new bzw0(((bys0) cys0Var2).a.toString()));
                    break;
                } else if (cys0Var2 instanceof ays0) {
                    lzw0Var.b(azw0Var);
                    break;
                } else if (!(cys0Var2 instanceof zxs0)) {
                    eg.o();
                    break;
                }
                break;
        }
    }
}
