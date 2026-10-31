package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class u0w implements bh0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m0w b;

    public /* synthetic */ u0w(m0w m0wVar, byte b) {
        this.a = b;
        this.b = m0wVar;
    }

    public final void a(Object obj) {
        byte b = this.a;
        m0w m0wVar = this.b;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) ((Map) obj).get("android.permission.CAMERA");
                if (bool != null) {
                    m0wVar.a(new ozv(bool.booleanValue()));
                }
                break;
            default:
                cys0 cys0Var = (cys0) obj;
                if (cys0Var instanceof bys0) {
                    m0wVar.a(new a0w(((bys0) cys0Var).a.toString()));
                    break;
                } else if (cys0Var instanceof ays0) {
                    m0wVar.a(zzv.a);
                    break;
                } else if (!(cys0Var instanceof zxs0)) {
                    eg.o();
                    break;
                }
                break;
        }
    }
}
