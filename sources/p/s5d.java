package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s5d implements u5d {
    public final boolean a;
    public final String b;
    public final String c;

    public s5d(boolean z, String str, String str2) {
        this.a = z;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5d)) {
            return false;
        }
        s5d s5dVar = (s5d) obj;
        return this.a == s5dVar.a && this.b.equals(s5dVar.b) && u890.j(this.c, s5dVar.c);
    }

    public final int hashCode() {
        int iD = cy30.d(Boolean.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
