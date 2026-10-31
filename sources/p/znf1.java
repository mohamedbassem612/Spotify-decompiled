package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class znf1 {
    public final String a;
    public final String b;

    public znf1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof znf1)) {
            return false;
        }
        znf1 znf1Var = (znf1) obj;
        return u890.j(this.a, znf1Var.a) && this.b.equals(znf1Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
