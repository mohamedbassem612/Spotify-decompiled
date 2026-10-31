package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xyz implements o700 {
    public final String a;
    public final String b;

    public xyz(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xyz)) {
            return false;
        }
        xyz xyzVar = (xyz) obj;
        return u890.j(this.a, xyzVar.a) && this.b.equals(xyzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
