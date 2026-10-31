package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ynn implements v5b1 {
    public static final bgc d = new bgc((byte) 10);
    public final xkg0 a;
    public final String b;
    public final String c;

    public ynn(xkg0 xkg0Var, String str, String str2) {
        this.a = xkg0Var;
        this.b = str;
        this.c = str2;
    }

    public final int a() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ynn)) {
            return false;
        }
        ynn ynnVar = (ynn) obj;
        return this.a.equals(ynnVar.a) && u890.j(this.b, ynnVar.b) && u890.j(this.c, ynnVar.c);
    }

    public final b3i1 getType() {
        return d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
