package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nbz0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ obz0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nbz0(obz0 obz0Var, byte b) {
        super(1);
        this.a = b;
        this.b = obz0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        obz0 obz0Var = this.b;
        switch (b) {
            case 0:
                hjf1 hjf1Var = (hjf1) obj;
                obz0Var.h.invoke(new s7z0(hjf1Var.f, hjf1Var.h));
                return rih1Var;
            case 1:
                hjf1 hjf1Var2 = (hjf1) obj;
                obz0Var.h.invoke(new c8z0(hjf1Var2.f, hjf1Var2.h));
                return rih1Var;
            default:
                hjf1 hjf1Var3 = (hjf1) obj;
                ContextTrack contextTrack = hjf1Var3.h;
                int i = hjf1Var3.f;
                int iC = l1d.C(hjf1Var3.l);
                if (iC == 0) {
                    obz0Var.h.invoke(new c8z0(i, contextTrack));
                    return rih1Var;
                }
                if (iC == 1) {
                    obz0Var.h.invoke(new s7z0(i, contextTrack));
                    return rih1Var;
                }
                if (iC == 2) {
                    obz0Var.h.invoke(new t7z0(i, contextTrack));
                    return rih1Var;
                }
                eg.o();
                return null;
        }
    }
}
