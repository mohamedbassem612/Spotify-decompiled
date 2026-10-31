package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s2w {
    public final String a;
    public final String b;

    public s2w(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2w)) {
            return false;
        }
        s2w s2wVar = (s2w) obj;
        return this.a.equals(s2wVar.a) && this.b.equals(s2wVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
