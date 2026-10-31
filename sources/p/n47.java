package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@o661
public final class n47 {
    public static final m47 Companion = new m47();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ n47(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            o6p1.t(i, 15, l47.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n47)) {
            return false;
        }
        n47 n47Var = (n47) obj;
        return u890.j(this.a, n47Var.a) && u890.j(this.b, n47Var.b) && u890.j(this.c, n47Var.c) && u890.j(this.d, n47Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public n47(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }
}
