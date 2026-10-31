package p;

import android.view.Surface;
import androidx.media3.exoplayer.ExoPlayer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class h390 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r390 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h390(r390 r390Var, byte b) {
        super(1);
        this.a = b;
        this.b = r390Var;
    }

    public final Object invoke(Object obj) {
        String str;
        switch (this.a) {
            case 0:
                g0g1 g0g1Var = (g0g1) obj;
                r390 r390Var = this.b;
                if (r390Var.f) {
                    r390Var.b1.add(g0g1Var);
                    r390Var.I0();
                }
                return rih1.a;
            case 1:
                g0g1 g0g1Var2 = (g0g1) obj;
                r390 r390Var2 = this.b;
                if (r390Var2.f) {
                    r390Var2.b1.remove(g0g1Var2);
                }
                return rih1.a;
            case 2:
                ExoPlayer exoPlayer = (ExoPlayer) obj;
                long jF0 = r390.F0(exoPlayer, exoPlayer.v());
                Long lValueOf = Long.valueOf(jF0);
                this.b.N0 = jF0;
                return lValueOf;
            case 3:
                return Boolean.valueOf(this.b.H0());
            case 4:
                ExoPlayer exoPlayer2 = (ExoPlayer) obj;
                r390 r390Var3 = this.b;
                if (r390Var3.Q0.a == null) {
                    return null;
                }
                r390Var3.G0(exoPlayer2, new i390((Surface) null, (l291) null, 7));
                return rih1.a;
            case 5:
                u5u0 u5u0Var = this.b.V0;
                hfs hfsVar = u5u0Var.a;
                synchronized (hfsVar) {
                    str = hfsVar.f;
                }
                t5u0 t5u0Var = str == null ? null : (t5u0) u5u0Var.b.get(str);
                Long lA = t5u0Var != null ? t5u0Var.a(false) : null;
                return lA != null ? new p590(((s5u0) lA).N[3]) : new p590();
            case 6:
                ExoPlayer exoPlayer3 = (ExoPlayer) obj;
                r390 r390Var4 = this.b;
                bjh0 bjh0Var = r390Var4.b;
                u4b1 u4b1Var = r390Var4.T0;
                x3b1 x3b1Var = u4b1Var instanceof x3b1 ? (x3b1) u4b1Var : null;
                return l0o1.h(exoPlayer3, bjh0Var, x3b1Var != null ? Long.valueOf(x3b1Var.H) : null);
            default:
                ((ExoPlayer) obj).g(this.b.g1);
                return rih1.a;
        }
    }
}
