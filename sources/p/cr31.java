package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cr31 extends h8n {
    @Override // p.n790
    public final Object b(float f, Object obj) {
        if (u890.j(obj, d4o1.a) || obj == null) {
            cr31 cr31Var = er31.a;
            tyy0 tyy0VarF = nko1.f(0.0f);
            obj = new cr31(tyy0VarF, tyy0VarF, tyy0VarF, tyy0VarF);
        }
        if (!(obj instanceof cr31)) {
            return null;
        }
        cr31 cr31Var2 = (cr31) obj;
        cr31 cr31Var3 = er31.a;
        return new cr31(new dr31(f, this.a, cr31Var2.a), new dr31(f, this.b, cr31Var2.b), new dr31(f, this.c, cr31Var2.c), new dr31(f, this.d, cr31Var2.d));
    }

    @Override // p.h8n
    public final h8n c(k8n k8nVar, k8n k8nVar2, k8n k8nVar3, k8n k8nVar4) {
        return new cr31(k8nVar, k8nVar2, k8nVar3, k8nVar4);
    }

    @Override // p.h8n
    public final z1a1 e(long j, float f, float f2, float f3, float f4, flb0 flb0Var) {
        if (f + f2 + f3 + f4 == 0.0f) {
            return new itq0(anm1.g(0L, j));
        }
        n511 n511VarG = anm1.g(0L, j);
        flb0 flb0Var2 = flb0.a;
        float f5 = flb0Var == flb0Var2 ? f : f2;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) & 4294967295L) | (((long) Float.floatToRawIntBits(f5)) << 32);
        float f6 = flb0Var == flb0Var2 ? f2 : f;
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f6)) & 4294967295L) | (((long) Float.floatToRawIntBits(f6)) << 32);
        float f7 = flb0Var == flb0Var2 ? f3 : f4;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f7)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L);
        float f8 = flb0Var == flb0Var2 ? f4 : f3;
        return new jtq0(ila0.f(n511VarG, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cr31)) {
            return false;
        }
        cr31 cr31Var = (cr31) obj;
        return u890.j(this.a, cr31Var.a) && u890.j(this.b, cr31Var.b) && u890.j(this.c, cr31Var.c) && u890.j(this.d, cr31Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ")";
    }
}
