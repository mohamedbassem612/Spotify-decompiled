package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/zq71;", "Lp/uim0;", "Lp/yq71;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class zq71 extends uim0 {
    public final ys71 a;

    public zq71(ys71 ys71Var) {
        this.a = ys71Var;
    }

    public final pim0 a() {
        return new yq71(this.a);
    }

    public final void b(pim0 pim0Var) {
        yq71 yq71Var = (yq71) pim0Var;
        ys71 ys71Var = yq71Var.S0;
        ys71 ys71Var2 = this.a;
        if (ys71Var2 != ys71Var) {
            ys71Var.s(false);
            yq71Var.S0 = ys71Var2;
            ys71Var2.s(((pim0) yq71Var).N0);
            if (((pim0) yq71Var).N0) {
                yq71Var.K1();
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zq71) && this.a == ((zq71) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SharedBoundsNodeElement(sharedElementState=" + this.a + ")";
    }
}
