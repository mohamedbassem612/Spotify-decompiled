package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@o661
public final class bxf {
    public static final axf Companion = new axf();
    public final String a;
    public final String b;
    public final double c;

    public /* synthetic */ bxf(int i, String str, String str2, double d) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, zwf.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxf)) {
            return false;
        }
        bxf bxfVar = (bxf) obj;
        return u890.j(this.a, bxfVar.a) && u890.j(this.b, bxfVar.b) && Double.compare(this.c, bxfVar.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    public bxf(String str, double d) {
        this.a = str;
        this.b = "USD";
        this.c = d;
    }
}
