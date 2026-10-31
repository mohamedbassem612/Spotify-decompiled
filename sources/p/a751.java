package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class a751 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c751 b;

    public /* synthetic */ a751(c751 c751Var, byte b) {
        this.a = b;
        this.b = c751Var;
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                z551 z551Var = (z551) obj;
                c751 c751Var = this.b;
                z551Var.getClass();
                od51 od51VarN = c751Var.h.n(new id51(c751Var.W0, z551Var, (od51) c751Var.Y0.getValue()));
                od51 od51Var = (od51) c751Var.Y0.getValue();
                lw41 lw41Var = od51Var != null ? od51Var.a : null;
                if (lw41Var != null && u890.j(od51VarN.a, lw41Var)) {
                    od51VarN = new od51(lw41Var, od51VarN.b, od51VarN.c, od51VarN.d, od51VarN.e, od51VarN.f, od51VarN.g, od51VarN.h);
                }
                lw41 lw41Var2 = od51VarN.a;
                if (lw41Var2 != lw41Var) {
                    c751Var.Z.f(c751Var.Y, lw41Var2, od51VarN.f);
                }
                bpb1 bpb1Var = c751Var.Y0;
                bpb1Var.getClass();
                bpb1Var.m((Object) null, od51VarN);
                c751Var.W0 = z551Var;
                break;
            default:
                hd51 hd51Var = (hd51) obj;
                bbc bbcVar = this.b.Z0;
                hd51Var.getClass();
                if (bbcVar.l(hd51Var) instanceof pge) {
                    Logger.k("SearchPageResource: ViewEffect dropped: %s", new Object[]{hd51Var});
                }
                break;
        }
    }
}
