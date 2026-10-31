package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u3a implements tey0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public u3a(String str, String str2, int i, String str3) {
        str2 = (i & 2) != 0 ? null : str2;
        boolean z = (i & 16) == 0;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3a)) {
            return false;
        }
        u3a u3aVar = (u3a) obj;
        return u890.j(this.a, u3aVar.a) && u890.j(this.b, u3aVar.b) && this.c.equals(u3aVar.c) && this.d == u3aVar.d;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return Boolean.hashCode(this.d) + xcg1.g(cy30.d((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.c), 31, true);
    }
}
