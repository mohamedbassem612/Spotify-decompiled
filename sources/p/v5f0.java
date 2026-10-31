package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class v5f0 implements wat {
    public boolean a;
    public long b = 9223372034707292159L;
    public long c = 0;
    public final /* synthetic */ x5f0 d;

    public v5f0(x5f0 x5f0Var) {
        this.d = x5f0Var;
    }

    @Override // p.wat
    public final float U0() {
        return this.d.U0();
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [byte[], java.io.Serializable] */
    public final void a(zy31 zy31Var, float f) {
        x5f0 x5f0Var = this.d;
        v170 v170Var = x5f0Var.Q0;
        if (v170Var == null) {
            v170Var = new v170();
            x5f0Var.Q0 = v170Var;
        }
        int iP0 = f46.p0((zy31[]) v170Var.b, zy31Var);
        if (iP0 >= 0) {
            float[] fArr = (float[]) v170Var.c;
            if (fArr[iP0] != f) {
                fArr[iP0] = f;
                ((byte[]) v170Var.d)[iP0] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) v170Var.d;
                if (bArr[iP0] == 2) {
                    bArr[iP0] = 0;
                    return;
                }
                return;
            }
        }
        int i = v170Var.a;
        zy31[] zy31VarArr = (zy31[]) v170Var.b;
        if (i == zy31VarArr.length) {
            int i2 = i * 2;
            v170Var.b = (zy31[]) Arrays.copyOf(zy31VarArr, i2);
            v170Var.c = Arrays.copyOf((float[]) v170Var.c, i2);
            v170Var.d = Arrays.copyOf((byte[]) v170Var.d, i2);
        }
        ((zy31[]) v170Var.b)[i] = zy31Var;
        ((byte[]) v170Var.d)[i] = 3;
        ((float[]) v170Var.c)[i] = f;
        v170Var.a++;
    }

    @Override // p.wat
    public final float h() {
        return this.d.h();
    }
}
