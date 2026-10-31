package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class m5d implements u5d {
    public final boolean a;
    public final String b;
    public final String c;

    public m5d(boolean z, String str, String str2) {
        this.a = z;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5d)) {
            return false;
        }
        m5d m5dVar = (m5d) obj;
        return this.a == m5dVar.a && this.b.equals(m5dVar.b) && u890.j(this.c, m5dVar.c);
    }

    public final int hashCode() {
        int iD = cy30.d(Boolean.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
