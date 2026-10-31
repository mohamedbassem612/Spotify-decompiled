package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p0g0 {
    public static final df41 e = new df41(dvf0.N0, ujf0.Z);
    public final v0g0 a;
    public final bpb1 b;
    public final xe01 c;
    public final mre0 d;

    public p0g0(v0g0 v0g0Var) {
        this.a = v0g0Var;
        bpb1 bpb1VarB = gio1.b(v0g0Var);
        this.b = bpb1VarB;
        this.c = d5p1.h(bpb1VarB);
        this.d = new mre0(this, (byte) 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0g0) && u890.j(this.a, ((p0g0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
