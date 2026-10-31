package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dfp0 implements x310 {
    public final /* synthetic */ byte a;
    public final uw0 b;
    public final Object c;

    public dfp0(uw0 uw0Var) {
        this.a = (byte) 0;
        this.b = uw0Var;
        this.c = p7h.M(new String[]{"com.oplus.games", "com.coloros.gamespaceui"});
    }

    public final boolean a(r9c r9cVar) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                return !r9cVar.h && o7h.i0((List) obj, r9cVar.c);
            default:
                if (!r9cVar.h) {
                    return false;
                }
                m210 m210Var = r9cVar.e;
                return r9cVar.f && ("com.android.systemui".equals(m210Var != null ? m210Var.k : null) && ((bw4) obj).a());
        }
    }

    public final w310 b(r9c r9cVar) {
        byte b = this.a;
        uw0 uw0Var = this.b;
        switch (b) {
            case 0:
                return uw0Var.n(6);
            default:
                return uw0Var.n(5);
        }
    }

    public dfp0(uw0 uw0Var, bw4 bw4Var) {
        this.a = (byte) 1;
        this.b = uw0Var;
        this.c = bw4Var;
    }
}
