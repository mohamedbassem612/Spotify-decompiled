package p;

import androidx.compose.ui.geometry.Size;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class h8n implements hw61, n790 {
    public final k8n a;
    public final k8n b;
    public final k8n c;
    public final k8n d;

    public h8n(k8n k8nVar, k8n k8nVar2, k8n k8nVar3, k8n k8nVar4) {
        this.a = k8nVar;
        this.b = k8nVar2;
        this.c = k8nVar3;
        this.d = k8nVar4;
    }

    public static /* synthetic */ h8n d(h8n h8nVar, k8n k8nVar, k8n k8nVar2, k8n k8nVar3, k8n k8nVar4, int i) {
        if ((i & 1) != 0) {
            k8nVar = h8nVar.a;
        }
        if ((i & 2) != 0) {
            k8nVar2 = h8nVar.b;
        }
        if ((i & 4) != 0) {
            k8nVar3 = h8nVar.c;
        }
        if ((i & 8) != 0) {
            k8nVar4 = h8nVar.d;
        }
        return h8nVar.c(k8nVar, k8nVar2, k8nVar3, k8nVar4);
    }

    @Override // p.hw61
    public final z1a1 a(long j, flb0 flb0Var, wat watVar) {
        float fA = this.a.a(j, watVar);
        float fA2 = this.b.a(j, watVar);
        float fA3 = this.c.a(j, watVar);
        float fA4 = this.d.a(j, watVar);
        float fE = Size.e(j);
        float f = fA + fA4;
        if (f > fE) {
            float f2 = fE / f;
            fA *= f2;
            fA4 *= f2;
        }
        float f3 = fA2 + fA3;
        if (f3 > fE) {
            float f4 = fE / f3;
            fA2 *= f4;
            fA3 *= f4;
        }
        if (fA < 0.0f || fA2 < 0.0f || fA3 < 0.0f || fA4 < 0.0f) {
            StringBuilder sbM = gvg.m("Corner size in Px can't be negative(topStart = ", fA, ", topEnd = ", fA2, ", bottomEnd = ");
            sbM.append(fA3);
            sbM.append(", bottomStart = ");
            sbM.append(fA4);
            sbM.append(")!");
            tf80.a(sbM.toString());
        }
        return e(j, fA, fA2, fA3, fA4, flb0Var);
    }

    public h8n c(k8n k8nVar, k8n k8nVar2, k8n k8nVar3, k8n k8nVar4) {
        return new ato(k8nVar, k8nVar2, k8nVar3, k8nVar4);
    }

    public z1a1 e(long j, float f, float f2, float f3, float f4, flb0 flb0Var) {
        if (f + f2 + f4 + f3 == 0.0f) {
            return new itq0(anm1.g(0L, j));
        }
        tw4 tw4VarA = ww4.a();
        flb0 flb0Var2 = flb0.a;
        float f5 = flb0Var == flb0Var2 ? f : f2;
        tw4VarA.k(0.0f, f5);
        tw4VarA.j(f5, 0.0f);
        if (flb0Var == flb0Var2) {
            f = f2;
        }
        int i = (int) (j >> 32);
        tw4VarA.j(Float.intBitsToFloat(i) - f, 0.0f);
        tw4VarA.j(Float.intBitsToFloat(i), f);
        float f6 = flb0Var == flb0Var2 ? f3 : f4;
        int i2 = (int) (j & 4294967295L);
        tw4VarA.j(Float.intBitsToFloat(i), Float.intBitsToFloat(i2) - f6);
        tw4VarA.j(Float.intBitsToFloat(i) - f6, Float.intBitsToFloat(i2));
        if (flb0Var == flb0Var2) {
            f3 = f4;
        }
        tw4VarA.j(f3, Float.intBitsToFloat(i2));
        tw4VarA.j(0.0f, Float.intBitsToFloat(i2) - f3);
        tw4VarA.g();
        return new htq0(tw4VarA);
    }
}
