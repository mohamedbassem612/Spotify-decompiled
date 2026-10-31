package p;

import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/u0c;", "Lp/uim0;", "Lp/v0c;", "src_main_java_com_spotify_songdna_elements_collaboratormapelement-collaboratormapelement"}, k = 1, mv = {2, 3, 0}, xi = StreamStartRequestOuterClass$StreamStartRequest.PREVIEW_IMPRESSION_URI_FIELD_NUMBER)
final /* data */ class u0c extends uim0 {
    public final Function0 a;
    public final Function0 b;
    public final Function0 c;

    public u0c(Function0 function0, Function0 function1, Function0 function2) {
        this.a = function0;
        this.b = function1;
        this.c = function2;
    }

    public final pim0 a() {
        return new v0c(this.a, this.b, this.c);
    }

    public final void b(pim0 pim0Var) {
        v0c v0cVar = (v0c) pim0Var;
        v0cVar.O0 = this.a;
        v0cVar.P0 = this.b;
        v0cVar.Q0 = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0c)) {
            return false;
        }
        u0c u0cVar = (u0c) obj;
        return this.a.equals(u0cVar.a) && this.b.equals(u0cVar.b) && this.c.equals(u0cVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rjx.n(this.a.hashCode() * 31, 31, this.b);
    }
}
