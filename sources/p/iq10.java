package p;

import com.spotify.martini.martinidata.model.Mode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class iq10 {
    public final String a;
    public final Mode b;

    public iq10(String str, Mode mode) {
        this.a = str;
        this.b = mode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iq10)) {
            return false;
        }
        iq10 iq10Var = (iq10) obj;
        return u890.j(this.a, iq10Var.a) && this.b == iq10Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
