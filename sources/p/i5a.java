package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i5a {
    public final String a;
    public final Integer b;
    public final iu30 c;

    public i5a(String str, iu30 iu30Var, int i) {
        str = (i & 1) != 0 ? null : str;
        Integer num = (i & 2) != 0 ? null : 2131952308;
        this.a = str;
        this.b = num;
        this.c = iu30Var;
    }

    public final String a() {
        return this.a;
    }

    public final Integer b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5a)) {
            return false;
        }
        i5a i5aVar = (i5a) obj;
        return u890.j(this.a, i5aVar.a) && u890.j(this.b, i5aVar.b) && this.c.equals(i5aVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        return this.c.hashCode() + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31);
    }
}
