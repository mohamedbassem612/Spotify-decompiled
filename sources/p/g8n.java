package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class g8n {
    public final n511 a;

    public g8n(long j, long j2, vzq0 vzq0Var, wat watVar, flb0 flb0Var) {
        int iI0 = watVar.i0(vzq0Var.b(flb0Var));
        int iI1 = watVar.i0(vzq0Var.d());
        int iI2 = (((int) (j >> 32)) - ((int) (j2 >> 32))) - watVar.i0(vzq0Var.c(flb0Var));
        int iI3 = (((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L))) - watVar.i0(vzq0Var.a());
        this.a = new n511(iI0, iI1, iI2 >= iI0 ? iI2 : iI0, iI3 >= iI1 ? iI3 : iI1);
    }

    public final long a(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        n511 n511Var = this.a;
        float fO = yoi1.o(fIntBitsToFloat, n511Var.a, n511Var.c);
        float fO2 = yoi1.o(Float.intBitsToFloat((int) (j & 4294967295L)), n511Var.b, n511Var.d);
        return (((long) Float.floatToRawIntBits(fO)) << 32) | (((long) Float.floatToRawIntBits(fO2)) & 4294967295L);
    }

    public final long b(f8n f8nVar) {
        boolean z = f8nVar.b;
        n511 n511Var = this.a;
        float f = z ? n511Var.a : n511Var.c;
        return (((long) Float.floatToRawIntBits(f8nVar.a ? n511Var.b : n511Var.d)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32);
    }
}
