package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zdw implements hiw {
    public final String a;
    public final String b;

    public zdw(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zdw)) {
            return false;
        }
        zdw zdwVar = (zdw) obj;
        return u890.j(this.a, zdwVar.a) && this.b.equals(zdwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
