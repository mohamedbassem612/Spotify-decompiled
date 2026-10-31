package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s8b {
    public final String a;
    public final String b;
    public final Integer c;

    public s8b(String str, String str2, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s8b)) {
            return false;
        }
        s8b s8bVar = (s8b) obj;
        return this.a.equals(s8bVar.a) && this.b.equals(s8bVar.b) && u890.j(this.c, s8bVar.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        return iD + (num == null ? 0 : num.hashCode());
    }
}
