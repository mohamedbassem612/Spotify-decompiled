package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class cny0 {
    public static final bny0 Companion = new bny0();
    public final String a;
    public final String b;
    public final long c;
    public final String d;

    public /* synthetic */ cny0(int i, long j, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, any0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = j;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cny0)) {
            return false;
        }
        cny0 cny0Var = (cny0) obj;
        return u890.j(this.a, cny0Var.a) && u890.j(this.b, cny0Var.b) && this.c == cny0Var.c && u890.j(this.d, cny0Var.d);
    }

    public final int hashCode() {
        int iF = cy30.f(cy30.d(this.a.hashCode() * 31, 31, this.b), this.c, 31);
        String str = this.d;
        return iF + (str == null ? 0 : str.hashCode());
    }

    public cny0(long j, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
    }
}
