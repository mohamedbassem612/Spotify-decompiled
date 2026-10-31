package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class ljk1 extends l660 {
    public int w0 = 0;
    public int x0 = 0;
    public int y0 = 0;
    public int z0 = 0;
    public int A0 = 0;
    public int B0 = 0;
    public boolean C0 = false;
    public int D0 = 0;
    public int E0 = 0;
    public final uda F0 = new uda();
    public vda G0 = null;

    @Override // p.l660
    public final void Y() {
        for (int i = 0; i < this.v0; i++) {
            cjl cjlVar = this.u0[i];
            if (cjlVar != null) {
                cjlVar.G = true;
            }
        }
    }

    public void Z(int i, int i2, int i3, int i4) {
        int iS = this.A0 + this.B0;
        int iM = this.w0 + this.x0;
        if (this.v0 > 0) {
            iS += this.u0[0].s();
            iM += this.u0[0].m();
        }
        int iMax = Math.max(this.d0, iS);
        int iMax2 = Math.max(this.e0, iM);
        if (i != 1073741824) {
            if (i == Integer.MIN_VALUE) {
                i2 = Math.min(iMax, i2);
            } else {
                i2 = i == 0 ? iMax : 0;
            }
        }
        if (i3 != 1073741824) {
            if (i3 == Integer.MIN_VALUE) {
                i4 = Math.min(iMax2, i4);
            } else {
                i4 = i3 == 0 ? iMax2 : 0;
            }
        }
        this.D0 = i2;
        this.E0 = i4;
        T(i2);
        O(i4);
        this.C0 = this.v0 > 0;
    }

    public final void a0(cjl cjlVar, bjl bjlVar, int i, bjl bjlVar2, int i2) {
        vda vdaVar;
        cjl cjlVar2;
        while (true) {
            vdaVar = this.G0;
            if (vdaVar != null || (cjlVar2 = this.V) == null) {
                break;
            } else {
                this.G0 = ((djl) cjlVar2).y0;
            }
        }
        uda udaVar = this.F0;
        udaVar.a = bjlVar;
        udaVar.b = bjlVar2;
        udaVar.c = i;
        udaVar.d = i2;
        vdaVar.b(cjlVar, udaVar);
        cjlVar.T(udaVar.e);
        cjlVar.O(udaVar.f);
        cjlVar.F = udaVar.h;
        cjlVar.K(udaVar.g);
    }
}
