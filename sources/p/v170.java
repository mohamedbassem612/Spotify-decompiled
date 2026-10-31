package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class v170 {
    public int a;
    public Object b = new zy31[32];
    public Object c = new float[32];
    public Serializable d = new byte[32];
    public Object e;
    public Object f;

    /* JADX WARN: Type inference failed for: r0v1, types: [byte[], java.io.Serializable] */
    public v170() {
        oen0 oen0Var = ij41.a;
        this.e = new oen0();
        this.f = new oen0();
    }

    public void a(zy31 zy31Var) {
        int iP0 = f46.p0((zy31[]) this.b, zy31Var);
        if (iP0 >= 0) {
            zy31[] zy31VarArr = (zy31[]) this.b;
            int i = iP0 + 1;
            f46.Q(iP0, i, this.a, zy31VarArr, zy31VarArr);
            zy31[] zy31VarArr2 = (zy31[]) this.b;
            int i2 = this.a;
            zy31VarArr2[i2 - 1] = null;
            float[] fArr = (float[]) this.c;
            f46.S(fArr, fArr, iP0, i, i2);
            byte[] bArr = (byte[]) this.d;
            f46.O(iP0, i, this.a, bArr, bArr);
            this.a--;
        }
    }
}
