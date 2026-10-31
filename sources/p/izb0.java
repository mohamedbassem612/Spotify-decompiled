package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class izb0 {
    public static final hzb0 Companion = new hzb0();
    public final String a;
    public final String b;
    public final int c;
    public final String d;

    public /* synthetic */ izb0(int i, int i2, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, gzb0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = i2;
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof izb0)) {
            return false;
        }
        izb0 izb0Var = (izb0) obj;
        return u890.j(this.a, izb0Var.a) && u890.j(this.b, izb0Var.b) && this.c == izb0Var.c && u890.j(this.d, izb0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public izb0(String str, String str2, int i, String str3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
    }
}
