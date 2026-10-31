package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/mz20;", "Lp/uim0;", "Lp/oz20;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class mz20 extends uim0 {
    public final lz20 a;

    public mz20(lz20 lz20Var) {
        this.a = lz20Var;
    }

    public final pim0 a() {
        oz20 oz20Var = new oz20();
        oz20Var.O0 = this.a;
        return oz20Var;
    }

    public final void b(pim0 pim0Var) {
        oz20 oz20Var = (oz20) pim0Var;
        oz20Var.O0.a.k(oz20Var);
        lz20 lz20Var = this.a;
        oz20Var.O0 = lz20Var;
        lz20Var.a.b(oz20Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mz20) && u890.j(this.a, ((mz20) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.a + ")";
    }
}
