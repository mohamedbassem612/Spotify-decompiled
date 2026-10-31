package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class ogo implements iaa {
    public static final ngo Companion = new ngo();
    public final String a;
    public final String b;
    public final boolean c;
    public final tv80 d;

    public /* synthetic */ ogo(int i, String str, String str2, boolean z, tv80 tv80Var) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, mgo.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = z;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = tv80Var;
        }
    }

    public final String a(nfa0 nfa0Var) {
        return nfa0Var.b(Companion.serializer(), this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ogo)) {
            return false;
        }
        ogo ogoVar = (ogo) obj;
        return u890.j(this.a, ogoVar.a) && u890.j(this.b, ogoVar.b) && this.c == ogoVar.c && u890.j(this.d, ogoVar.d);
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        tv80 tv80Var = this.d;
        return iG + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
