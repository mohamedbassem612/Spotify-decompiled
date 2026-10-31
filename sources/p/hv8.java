package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class hv8 implements iaa {
    public static final gv8 Companion = new gv8();
    public final boolean a;
    public final String b;
    public final String c;

    public /* synthetic */ hv8(int i, String str, String str2, boolean z) {
        if (1 != (i & 1)) {
            o6p1.t(i, 1, fv8.a.getDescriptor());
            throw null;
        }
        this.a = z;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public final String a(nfa0 nfa0Var) {
        return nfa0Var.b(Companion.serializer(), this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hv8)) {
            return false;
        }
        hv8 hv8Var = (hv8) obj;
        return this.a == hv8Var.a && u890.j(this.b, hv8Var.b) && u890.j(this.c, hv8Var.c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public hv8(boolean z, String str, String str2) {
        this.a = z;
        this.b = str;
        this.c = str2;
    }
}
