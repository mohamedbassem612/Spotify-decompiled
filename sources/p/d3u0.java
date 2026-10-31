package p;

import com.spotify.betamax.player.exception.PlaybackKilledException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class d3u0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p3u0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d3u0(p3u0 p3u0Var, byte b) {
        super(1);
        this.a = b;
        this.b = p3u0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        p3u0 p3u0Var = this.b;
        switch (b) {
            case 0:
                p3u0Var.D0(new PlaybackKilledException("Playback killed due to error in logger", xjz.ERROR_PLAYBACK_KILLED, (Throwable) obj));
                break;
            case 1:
                ((Number) obj).longValue();
                p3u0Var.h.t(p3u0Var.i);
                break;
            case 2:
                p3u0Var.h.H(p3u0Var.i, ((Number) obj).longValue());
                break;
            case 3:
                ((Number) obj).longValue();
                p3u0Var.h.A(p3u0Var.i);
                break;
            case 4:
                ((Number) obj).longValue();
                p3u0Var.h.y(p3u0Var.i, p3u0Var.c.F());
                break;
            case 5:
                p3u0Var.h.p(p3u0Var.i, ((Number) obj).longValue());
                break;
            case 6:
                p3u0Var.h.O(p3u0Var.i, p3u0Var.Y0(((Number) obj).longValue()));
                break;
            case 7:
                long jLongValue = ((Number) obj).longValue();
                p3u0Var.h.I(p3u0Var.i, (jLongValue >= 0 || p3u0Var.c.B0()) ? jLongValue : 0L);
                break;
            case 8:
                p3u0Var.h.V(p3u0Var.i, ((Number) obj).longValue());
                break;
            case 9:
                ((Number) obj).longValue();
                q590 q590Var = p3u0Var.c;
                m0u0 m0u0Var = p3u0Var.i;
                lgy lgyVar = p3u0Var.h;
                if (q590Var.getDuration() >= 0) {
                    if (!q590Var.B0()) {
                        lgyVar.v(m0u0Var, q590Var.getDuration());
                    }
                    oqe1 oqe1VarM = q590Var.M();
                    if (oqe1VarM != null) {
                        lgyVar.L(m0u0Var, new ko51(zoi1.n0(oqe1VarM.p), zoi1.n0(oqe1VarM.m)));
                    }
                }
                break;
            case 10:
                ((Number) obj).longValue();
                p3u0Var.h.S(p3u0Var.i);
                break;
            case 11:
                p3u0Var.h.C(p3u0Var.i, ((Number) obj).longValue());
                break;
            case 12:
                p3u0Var.h.K(p3u0Var.i, ((Number) obj).longValue());
                break;
            case 13:
                ((Number) obj).longValue();
                p3u0Var.h.E(p3u0Var.i);
                break;
            default:
                int iIntValue = ((Number) obj).intValue();
                boolean z = p3u0Var.S0;
                q590 q590Var2 = p3u0Var.c;
                if (!z) {
                    p3u0Var.h.R(p3u0Var.i, iIntValue, q590Var2.v());
                } else {
                    q590Var2.m0(new i3u0(p3u0Var, iIntValue, (byte) 3));
                }
                break;
        }
        return rih1Var;
    }
}
