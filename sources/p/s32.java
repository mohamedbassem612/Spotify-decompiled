package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class s32 implements t32 {
    public final String a;
    public final j32 b;
    public final int c;
    public final wx10 d;

    public s32(String str, j32 j32Var, int i, wx10 wx10Var) {
        this.a = str;
        this.b = j32Var;
        this.c = i;
        this.d = wx10Var;
    }

    public final k32 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s32)) {
            return false;
        }
        s32 s32Var = (s32) obj;
        return this.a.equals(s32Var.a) && this.b.equals(s32Var.b) && this.c == s32Var.c && this.d.equals(s32Var.d);
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return ((this.d.hashCode() + kaa0.f(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31)) * 31) - 1745832608;
    }
}
