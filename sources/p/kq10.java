package p;

import com.spotify.martini.martinidata.model.Mode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kq10 {
    public final String a;
    public final Mode b;

    public kq10(String str, Mode mode) {
        this.a = str;
        this.b = mode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kq10)) {
            return false;
        }
        kq10 kq10Var = (kq10) obj;
        return u890.j(this.a, kq10Var.a) && this.b == kq10Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
