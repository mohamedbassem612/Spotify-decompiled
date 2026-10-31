package p;

import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yw21 implements a930 {
    public final int a;
    public final FontWeight b;
    public final ja30 c;

    public yw21(int i, FontWeight fontWeight, ja30 ja30Var) {
        this.a = i;
        this.b = fontWeight;
        this.c = ja30Var;
    }

    @Override // p.a930
    public final int a() {
        return 0;
    }

    @Override // p.a930
    public final int b() {
        return 0;
    }

    public final ja30 c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yw21)) {
            return false;
        }
        yw21 yw21Var = (yw21) obj;
        return this.a == yw21Var.a && u890.j(this.b, yw21Var.b) && this.c.equals(yw21Var.c);
    }

    @Override // p.a930
    public final FontWeight getWeight() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.a.hashCode() + kaa0.f(0, kaa0.f(0, ((this.a * 31) + this.b.a) * 31, 31), 31);
    }

    public final String toString() {
        String strA = FontStyle.a(0);
        String strF = p8p1.F(0);
        StringBuilder sb = new StringBuilder("ResourceFont(resId=");
        sb.append(this.a);
        sb.append(", weight=");
        sb.append(this.b);
        sb.append(", style=");
        return rjx.o(sb, strA, ", loadingStrategy=", strF, ")");
    }
}
