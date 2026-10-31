package p;

import com.spotify.premiumdestination.destination.mobius.domain.JsonException;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pt60 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nfa0 b;

    public /* synthetic */ pt60(nfa0 nfa0Var, byte b) {
        this.a = b;
        this.b = nfa0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.premiumdestination.destination.mobius.domain.JsonException */
    public final Object apply(Object obj) throws JsonException {
        ys60 ys60Var;
        byte b = this.a;
        nfa0 nfa0Var = this.b;
        switch (b) {
            case 0:
                sy21 sy21Var = (sy21) obj;
                if (sy21Var.a.Q0) {
                    return new ju60((ns60) null);
                }
                uz21 uz21Var = sy21Var.c;
                kv60 kv60VarB = uz21Var != null ? ut60.b(uz21Var, nfa0Var) : null;
                if (kv60VarB != null) {
                    ys60Var = new ys60(u890.j(kv60VarB.b, "REQUEST_NOT_FOUND") ? 1 : 2);
                } else {
                    ys60Var = new ys60(2);
                }
                return new fu60(ys60Var);
            default:
                try {
                    return (re70) nfa0Var.a((String) obj, se70.a);
                } catch (Exception e) {
                    throw new JsonException(e);
                }
        }
    }
}
