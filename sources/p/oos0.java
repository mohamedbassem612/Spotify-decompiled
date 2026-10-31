package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class oos0 {
    public static final nos0 Companion = new nos0();
    public final String a;
    public final String b;
    public final int c;

    public /* synthetic */ oos0(int i, String str, String str2, int i2) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, mos0.a.getDescriptor());
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
        if (!(obj instanceof oos0)) {
            return false;
        }
        oos0 oos0Var = (oos0) obj;
        return u890.j(this.a, oos0Var.a) && u890.j(this.b, oos0Var.b) && this.c == oos0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    public oos0(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }
}
