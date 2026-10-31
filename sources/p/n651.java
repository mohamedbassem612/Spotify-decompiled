package p;

import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class n651 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c751 b;

    public /* synthetic */ n651(c751 c751Var, byte b) {
        this.a = b;
        this.b = c751Var;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c751 c751Var = this.b;
        switch (b) {
            case 0:
                z651 z651Var = (z651) obj;
                boolean z = z651Var.a;
                boolean z2 = z651Var.b;
                c751Var.getClass();
                c751Var.a1 = new z651(z, z2);
                return rih1Var;
            default:
                q151 q151Var = (q151) obj;
                MobiusLoop mobiusLoop = c751Var.R0;
                if (mobiusLoop != null) {
                    mobiusLoop.a(q151Var);
                    return rih1Var;
                }
                u890.C("loop");
                throw null;
        }
    }
}
