package p;

import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/cke1;", "Lp/uim0;", "Lp/fke1;", "src_main_java_com_spotify_reprise_slatedialog-slatedialog"}, k = 1, mv = {2, 3, 0}, xi = StreamStartRequestOuterClass$StreamStartRequest.PREVIEW_IMPRESSION_URI_FIELD_NUMBER)
final class cke1 extends uim0 {
    public final Function0 a;
    public final long b;
    public final n8b1 c;

    public cke1(Function0 function0, long j, n8b1 n8b1Var) {
        this.a = function0;
        this.b = j;
        this.c = n8b1Var;
    }

    public final pim0 a() {
        return new fke1(this.a, this.b, this.c);
    }

    public final void b(pim0 pim0Var) {
        fke1 fke1Var = (fke1) pim0Var;
        fke1Var.Q0 = this.a;
        fke1Var.R0 = 45.0f;
        fke1Var.S0 = 0.4f;
        fke1Var.T0 = 125.0f;
        fke1Var.U0 = this.b;
        fke1Var.V0 = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cke1)) {
            return false;
        }
        cke1 cke1Var = (cke1) obj;
        return this.a == cke1Var.a && ofg1.a(this.b, cke1Var.b) && this.c.equals(cke1Var.c);
    }

    public final int hashCode() {
        int iF = x0d.f(x0d.f(x0d.f(this.a.hashCode() * 31, 31, 45.0f), 31, 0.4f), 31, 125.0f);
        int i = ofg1.c;
        return this.c.hashCode() + cy30.f(iF, this.b, 31);
    }
}
