package p;

import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nv7 {
    public final Locale a;
    public final boolean b;

    public nv7(Locale locale, boolean z) {
        this.a = locale;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nv7)) {
            return false;
        }
        nv7 nv7Var = (nv7) obj;
        return this.a.equals(nv7Var.a) && this.b == nv7Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
