package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class kzq implements iaa {
    public static final jzq Companion = new jzq();
    public final boolean a;
    public final String b;

    public /* synthetic */ kzq(String str, int i, boolean z) {
        if (1 != (i & 1)) {
            o6p1.t(i, 1, izq.a.getDescriptor());
            throw null;
        }
        this.a = z;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final String a(nfa0 nfa0Var) {
        return nfa0Var.b(Companion.serializer(), this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kzq)) {
            return false;
        }
        kzq kzqVar = (kzq) obj;
        return this.a == kzqVar.a && u890.j(this.b, kzqVar.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public kzq(boolean z, String str) {
        this.a = z;
        this.b = str;
    }
}
