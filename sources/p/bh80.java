package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class bh80 {
    public static final ah80 Companion = new ah80();
    public final String a;
    public final String b;
    public final int c;

    public /* synthetic */ bh80(int i, String str, String str2, int i2) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, zg80.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bh80)) {
            return false;
        }
        bh80 bh80Var = (bh80) obj;
        return u890.j(this.a, bh80Var.a) && u890.j(this.b, bh80Var.b) && this.c == bh80Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Integer.hashCode(this.c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public bh80(String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = 3;
    }
}
