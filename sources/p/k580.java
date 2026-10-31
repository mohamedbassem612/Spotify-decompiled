package p;

import java.util.Currency;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class k580 {
    public final String a;
    public final double b;
    public final Currency c;

    public k580(String str, double d, Currency currency) {
        this.a = str;
        this.b = d;
        this.c = currency;
    }

    public final double a() {
        return this.b;
    }

    public final Currency b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k580)) {
            return false;
        }
        k580 k580Var = (k580) obj;
        return u890.j(this.a, k580Var.a) && Double.compare(this.b, k580Var.b) == 0 && u890.j(this.c, k580Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.e(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "InAppPurchase(eventName=" + this.a + ", amount=" + this.b + ", currency=" + this.c + ')';
    }
}
