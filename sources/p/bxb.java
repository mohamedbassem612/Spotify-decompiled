package p;

import android.content.res.Resources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bxb implements bv1 {
    public final cbr0 a;
    public final Resources b;
    public final av1 c;
    public nxb d;

    public bxb(cbr0 cbr0Var, nxb nxbVar, sua suaVar, Resources resources, av1 av1Var) {
        this.a = cbr0Var;
        this.b = resources;
        this.c = av1Var;
        this.d = nxbVar;
    }

    @Override // p.bv1
    public final int a(int i, int i2) {
        boolean z = this.c.t;
        Resources resources = this.b;
        int iP = resources.getDisplayMetrics().heightPixels;
        if (!z && resources.getConfiguration().fontScale <= 2.0f && i2 < iP / 2) {
            iP = yoi1.p(i, 0, iP);
        }
        boolean z2 = iP >= resources.getDisplayMetrics().heightPixels;
        nxb nxbVarA = nxb.a(this.d, Integer.valueOf(iP), z2 ? ixb.b : ixb.a, z2 ? 1 : 2, false, z2, 3828);
        if (u890.j(this.d, nxbVarA)) {
            return iP;
        }
        this.d = nxbVarA;
        this.a.a(nxbVarA);
        return iP;
    }
}
