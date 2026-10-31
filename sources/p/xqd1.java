package p;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/xqd1;", "Lp/uim0;", "Lp/yqd1;", "src_main_java_com_spotify_campaigns_wrapped_content_impl-impl"}, k = 1, mv = {2, 3, 0}, xi = 48)
final /* data */ class xqd1 extends uim0 {
    public final Function0 a;

    public xqd1(Function0 function0) {
        this.a = function0;
    }

    public final pim0 a() {
        yqd1 yqd1Var = new yqd1();
        yqd1Var.Q0 = this.a;
        yqd1Var.H1(f8d1.a(new ae4(yqd1Var, (byte) 10)));
        return yqd1Var;
    }

    public final void b(pim0 pim0Var) {
        ((yqd1) pim0Var).Q0 = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xqd1) && u890.j(this.a, ((xqd1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
