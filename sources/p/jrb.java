package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jrb implements nrb {
    public final String a;
    public final boolean b;

    public jrb(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jrb)) {
            return false;
        }
        jrb jrbVar = (jrb) obj;
        return u890.j(this.a, jrbVar.a) && this.b == jrbVar.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
