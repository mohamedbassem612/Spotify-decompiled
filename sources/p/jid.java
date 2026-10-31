package p;

import com.spotify.betamax.player.exception.BetamaxException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jid implements c0u0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jid(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void L(BetamaxException betamaxException, long j, long j2) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                kid kidVar = (kid) obj;
                kidVar.g1.setVisibility(8);
                l62 l62Var = kidVar.k1;
                if (l62Var != null) {
                    kidVar.L(l62Var.f);
                }
                break;
            case 1:
                ((k0t) obj).e();
                break;
            default:
                ((Function0) ((ven0) obj).getValue()).invoke();
                break;
        }
    }

    public final void i(BetamaxException betamaxException, long j, long j2) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                kid kidVar = (kid) obj;
                kidVar.g1.setVisibility(8);
                l62 l62Var = kidVar.k1;
                if (l62Var != null) {
                    kidVar.L(l62Var.f);
                }
                break;
            case 1:
                ((k0t) obj).e();
                break;
            default:
                ((Function0) ((ven0) obj).getValue()).invoke();
                break;
        }
    }
}
