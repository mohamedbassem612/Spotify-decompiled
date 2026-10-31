package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class qri1 {
    public static final pyp0 a = new pyp0(gyp0.a, 0, 0, (byte) 11);

    public static final cgg1 a(elk1 elk1Var, af5 af5Var) {
        cgg1 cgg1VarD = elk1Var.d(af5Var);
        int length = af5Var.b.length();
        af5 af5Var2 = cgg1VarD.a;
        hyp0 hyp0Var = cgg1VarD.b;
        int length2 = af5Var2.b.length();
        int iMin = Math.min(length, 100);
        for (int i = 0; i < iMin; i++) {
            b(hyp0Var.o(i), length2, i);
        }
        b(hyp0Var.o(length), length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i2 = 0; i2 < iMin2; i2++) {
            c(hyp0Var.i(i2), length, i2);
        }
        c(hyp0Var.i(length2), length, length2);
        return new cgg1(af5Var2, new pyp0(hyp0Var, af5Var.b.length(), af5Var2.b.length(), (byte) 11));
    }

    public static final void b(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbQ = cy30.q(i3, i, "OffsetMapping.originalToTransformed returned invalid mapping: ", " -> ", " is not in range of transformed text [0, ");
        sbQ.append(i2);
        sbQ.append("]");
        tf80.c(sbQ.toString());
    }

    public static final void c(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbQ = cy30.q(i3, i, "OffsetMapping.transformedToOriginal returned invalid mapping: ", " -> ", " is not in range of original text [0, ");
        sbQ.append(i2);
        sbQ.append("]");
        tf80.c(sbQ.toString());
    }
}
