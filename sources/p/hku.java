package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/hku;", "Lp/uim0;", "Lp/iku;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class hku extends uim0 {
    public final bsb0 a;

    public hku(bsb0 bsb0Var) {
        this.a = bsb0Var;
    }

    public final pim0 a() {
        iku ikuVar = new iku();
        ikuVar.O0 = this.a;
        return ikuVar;
    }

    public final void b(pim0 pim0Var) {
        iku ikuVar = (iku) pim0Var;
        bsb0 bsb0Var = ikuVar.O0;
        bsb0 bsb0Var2 = this.a;
        if (u890.j(bsb0Var, bsb0Var2) || !((pim0) ikuVar).a.N0) {
            return;
        }
        bsb0 bsb0Var3 = ikuVar.O0;
        bsb0Var3.e();
        bsb0Var3.b = null;
        bsb0Var3.c = -1;
        bsb0Var2.j = ikuVar;
        ikuVar.O0 = bsb0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hku) && u890.j(this.a, ((hku) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.a + ")";
    }
}
