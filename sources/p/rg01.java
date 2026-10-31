package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class rg01 {
    public static final ng01 Companion = new ng01();
    public final String a;
    public final String b;

    public /* synthetic */ rg01(int i, String str, String str2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, mg01.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rg01)) {
            return false;
        }
        rg01 rg01Var = (rg01) obj;
        return u890.j(this.a, rg01Var.a) && u890.j(this.b, rg01Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public rg01(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
