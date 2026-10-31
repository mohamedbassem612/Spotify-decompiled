package p;

import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kx2 {
    public final String a;
    public final String b;
    public final String c;
    public final Locale d;

    public kx2(String str, String str2, String str3, Locale locale) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = locale;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kx2)) {
            return false;
        }
        kx2 kx2Var = (kx2) obj;
        return this.a.equals(kx2Var.a) && this.b.equals(kx2Var.b) && this.c.equals(kx2Var.c) && this.d.equals(kx2Var.d);
    }

    public final int hashCode() {
        return (this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
    }
}
