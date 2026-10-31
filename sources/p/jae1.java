package p;

import com.spotify.messages.BetamaxPlaybackSession;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/jae1;", "Lp/uim0;", "Lp/eae1;", "src_main_java_com_spotify_lyrics_textvisibility-textvisibility"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
final /* data */ class jae1 extends uim0 {
    public final y9e1 a;
    public final iu30 b;
    public final Function0 c;
    public final boolean d;

    public jae1(y9e1 y9e1Var, iu30 iu30Var, Function0 function0, boolean z) {
        this.a = y9e1Var;
        this.b = iu30Var;
        this.c = function0;
        this.d = z;
    }

    public final pim0 a() {
        return new eae1(this.a, this.b, this.c, this.d);
    }

    public final void b(pim0 pim0Var) {
        elb0 elb0Var;
        eae1 eae1Var = (eae1) pim0Var;
        String str = eae1Var.O0.a.a.b;
        y9e1 y9e1Var = this.a;
        boolean zJ = u890.j(str, y9e1Var.a.a.b);
        if (!zJ) {
            xab1 xab1Var = eae1Var.V0;
            if (xab1Var != null) {
                xab1Var.d((CancellationException) null);
            }
            eae1Var.S0.clear();
        }
        eae1Var.O0 = y9e1Var;
        if (!zJ && (elb0Var = eae1Var.Z0) != null) {
            elb0 elb0Var2 = elb0Var.a() ? elb0Var : null;
            if (elb0Var2 != null) {
                eae1Var.E(elb0Var2);
            }
        }
        eae1Var.P0 = this.b;
        eae1Var.Q0 = this.c;
        eae1Var.R0 = this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jae1.class != obj.getClass()) {
            return false;
        }
        jae1 jae1Var = (jae1) obj;
        return u890.j(this.a, jae1Var.a) && this.b == jae1Var.b && this.c == jae1Var.c && this.d == jae1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + rjx.n(ktd.g(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }
}
