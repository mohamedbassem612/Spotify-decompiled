package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class w8a extends une {
    @Override // p.une, p.zg70
    public final i960 a(float f, float f2) {
        i960 i960VarA = super.a(f, f2);
        if (i960VarA == null) {
            return null;
        }
        q8a q8aVar = this.a;
        vi11 vi11Var = q8aVar.y1;
        vi11Var.getClass();
        cuf0 cuf0Var = (cuf0) cuf0.d.b();
        cuf0Var.b = 0.0d;
        cuf0Var.c = 0.0d;
        vi11Var.x(f, f2, cuf0Var);
        ((u8a) q8aVar.getBarData().b(i960VarA.e)).getClass();
        cuf0.b(cuf0Var);
        return i960VarA;
    }

    @Override // p.une
    public final z8a b() {
        return this.a.getBarData();
    }

    @Override // p.une
    public final float c(float f, float f2, float f3, float f4) {
        return Math.abs(f - f3);
    }
}
