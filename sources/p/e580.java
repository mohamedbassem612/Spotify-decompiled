package p;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class e580 {
    public final int a;
    public final int b;
    public final List c;

    public e580(int i, int i2, CharSequence... charSequenceArr) {
        List listAsList = Arrays.asList(charSequenceArr);
        this.a = i;
        this.b = i2;
        this.c = listAsList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e580)) {
            return false;
        }
        e580 e580Var = (e580) obj;
        return this.a == e580Var.a && this.b == e580Var.b && this.c.equals(e580Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }
}
