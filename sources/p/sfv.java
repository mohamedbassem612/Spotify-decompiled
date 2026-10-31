package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class sfv {
    public final String a;
    public final int b;

    public sfv(String str, int i, int i2) {
        i = (i2 & 2) != 0 ? 2 : i;
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sfv)) {
            return false;
        }
        sfv sfvVar = (sfv) obj;
        return u890.j(this.a, sfvVar.a) && this.b == sfvVar.b;
    }

    public final int hashCode() {
        return ab80.k(this.b, this.a.hashCode() * 31, 31);
    }
}
