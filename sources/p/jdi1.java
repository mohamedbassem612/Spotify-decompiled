package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class jdi1 implements iaa {
    public static final idi1 Companion = new idi1();
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;

    public /* synthetic */ jdi1(int i, String str, String str2, boolean z, String str3) {
        if (4 != (i & 4)) {
            o6p1.t(i, 4, hdi1.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        this.c = z;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
    }

    public final String a(nfa0 nfa0Var) {
        return nfa0Var.b(Companion.serializer(), this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jdi1)) {
            return false;
        }
        jdi1 jdi1Var = (jdi1) obj;
        return u890.j(this.a, jdi1Var.a) && u890.j(this.b, jdi1Var.b) && this.c == jdi1Var.c && u890.j(this.d, jdi1Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iG = xcg1.g((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c);
        String str3 = this.d;
        return iG + (str3 != null ? str3.hashCode() : 0);
    }

    public jdi1(String str, String str2, boolean z, String str3, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 8) != 0 ? null : str3;
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
    }
}
