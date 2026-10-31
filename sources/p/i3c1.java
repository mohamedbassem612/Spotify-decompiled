package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@o661
public final class i3c1 {
    public static final h3c1 Companion = new h3c1();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ i3c1(String str, String str2, int i, String str3) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, g3c1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3c1)) {
            return false;
        }
        i3c1 i3c1Var = (i3c1) obj;
        return u890.j(this.a, i3c1Var.a) && u890.j(this.b, i3c1Var.b) && u890.j(this.c, i3c1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    public i3c1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public /* synthetic */ i3c1(String str) {
        this("error", str, "");
    }
}
