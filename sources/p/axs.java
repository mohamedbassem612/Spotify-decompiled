package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class axs extends cxs implements Comparable {
    public final boolean N0;
    public final int X;
    public final int Y;
    public final int Z;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final int t;

    public axs(int i, pnf1 pnf1Var, int i2, zws zwsVar, int i3, String str, String str2) {
        int iH;
        super(i, pnf1Var, i2);
        int i4 = 0;
        this.f = jca.u(i3, false);
        int i5 = this.d.e;
        int i6 = zwsVar.C;
        bg11 bg11Var = zwsVar.y;
        int i7 = i5 & (~i6);
        this.g = (i7 & 1) != 0;
        this.h = (i7 & 2) != 0;
        bg11 bg11VarT = str2 != null ? b380.t(str2) : bg11Var.isEmpty() ? b380.t("") : bg11Var;
        int i8 = 0;
        while (true) {
            if (i8 >= bg11VarT.size()) {
                iH = 0;
                i8 = Integer.MAX_VALUE;
                break;
            } else {
                iH = exs.h(this.d, (String) bg11VarT.get(i8), zwsVar.D);
                if (iH > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.i = i8;
        this.t = iH;
        int i9 = str2 != null ? 1088 : zwsVar.A;
        int i10 = this.d.f;
        oqq0 oqq0Var = exs.l;
        int iBitCount = (i10 == 0 || i10 != i9) ? Integer.bitCount(i9 & i10) : Integer.MAX_VALUE;
        this.X = iBitCount;
        ie30 ie30Var = this.d;
        this.N0 = (1088 & ie30Var.f) != 0;
        int iG = exs.g(ie30Var, zwsVar.z);
        this.Y = iG;
        int iH2 = exs.h(this.d, str, exs.i(str) == null);
        this.Z = iH2;
        boolean z = iH > 0 || (bg11Var.isEmpty() && iBitCount > 0) || ((bg11Var.isEmpty() && iG != Integer.MAX_VALUE) || this.g || ((this.h && iH2 > 0) || zwsVar.x));
        if (jca.u(i3, zwsVar.B0) && z) {
            i4 = 1;
        }
        this.e = i4;
    }

    @Override // p.cxs
    public final int a() {
        return this.e;
    }

    @Override // p.cxs
    public final boolean b(cxs cxsVar) {
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(axs axsVar) {
        sxh sxhVarD = sxh.a.d(this.f, axsVar.f);
        Integer numValueOf = Integer.valueOf(this.i);
        Integer numValueOf2 = Integer.valueOf(axsVar.i);
        ann0 ann0Var = rd31.a;
        sxh sxhVarC = sxhVarD.c(numValueOf, numValueOf2, ann0Var);
        int i = axsVar.t;
        int i2 = this.t;
        sxh sxhVarA = sxhVarC.a(i2, i);
        int i3 = axsVar.X;
        int i4 = this.X;
        sxh sxhVarD2 = sxhVarA.a(i4, i3).c(Integer.valueOf(this.Y), Integer.valueOf(axsVar.Y), ann0Var).d(this.g, axsVar.g);
        Boolean boolValueOf = Boolean.valueOf(this.h);
        Boolean boolValueOf2 = Boolean.valueOf(axsVar.h);
        if (i2 == 0) {
            ann0Var = ann0.a;
        }
        sxh sxhVarA2 = sxhVarD2.c(boolValueOf, boolValueOf2, ann0Var).a(this.Z, axsVar.Z);
        if (i4 == 0) {
            sxhVarA2 = sxhVarA2.e(this.N0, axsVar.N0);
        }
        return sxhVarA2.f();
    }
}
