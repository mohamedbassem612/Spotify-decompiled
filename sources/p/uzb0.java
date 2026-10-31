package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/uzb0;", "Lp/uim0;", "Lp/vzb0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class uzb0 extends uim0 {
    public final ml4 a;
    public final r1c0 b;
    public final x6e1 c;

    public uzb0(ml4 ml4Var, r1c0 r1c0Var, x6e1 x6e1Var) {
        this.a = ml4Var;
        this.b = r1c0Var;
        this.c = x6e1Var;
    }

    public final pim0 a() {
        return new vzb0(this.a, this.b, this.c);
    }

    public final void b(pim0 pim0Var) {
        vzb0 vzb0Var = (vzb0) pim0Var;
        if (((pim0) vzb0Var).N0) {
            vzb0Var.O0.b();
            vzb0Var.O0.k(vzb0Var);
        }
        ml4 ml4Var = this.a;
        vzb0Var.O0 = ml4Var;
        if (((pim0) vzb0Var).N0) {
            if (ml4Var.a != null) {
                tf80.c("Expected textInputModifierNode to be null");
            }
            ml4Var.a = vzb0Var;
        }
        vzb0Var.P0 = this.b;
        vzb0Var.Q0 = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uzb0) {
            uzb0 uzb0Var = (uzb0) obj;
            return u890.j(this.a, uzb0Var.a) && this.b == uzb0Var.b && this.c == uzb0Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.a + ", legacyTextFieldState=" + this.b + ", textFieldSelectionManager=" + this.c + ")";
    }
}
