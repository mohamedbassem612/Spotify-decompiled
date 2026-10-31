package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pi91 extends mod {
    public final String e;
    public final int f;

    public pi91(String str, int i) {
        this.e = str;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pi91)) {
            return false;
        }
        pi91 pi91Var = (pi91) obj;
        return u890.j(this.e, pi91Var.e) && this.f == pi91Var.f;
    }

    public final int hashCode() {
        return l1d.C(this.f) + (this.e.hashCode() * 31);
    }
}
