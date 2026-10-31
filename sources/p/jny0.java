package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class jny0 {
    public static final iny0 Companion = new iny0();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ jny0(String str, String str2, int i, String str3) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, hny0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jny0)) {
            return false;
        }
        jny0 jny0Var = (jny0) obj;
        return u890.j(this.a, jny0Var.a) && u890.j(this.b, jny0Var.b) && u890.j(this.c, jny0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    public jny0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
