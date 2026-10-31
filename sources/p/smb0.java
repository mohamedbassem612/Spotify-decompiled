package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class smb0 extends fmb0 {
    public final /* synthetic */ vmb0 b;
    public final /* synthetic */ vu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public smb0(vmb0 vmb0Var, vu30 vu30Var, String str) {
        super(str);
        this.b = vmb0Var;
        this.c = vu30Var;
    }

    @Override // p.gfh0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final hfh0 mo23measure3p2s80s(ifh0 ifh0Var, List list, long j) {
        vmb0 vmb0Var = this.b;
        pmb0 pmb0Var = vmb0Var.h;
        pmb0Var.a = ifh0Var.getLayoutDirection();
        pmb0Var.b = ifh0Var.h();
        pmb0Var.c = ifh0Var.U0();
        boolean zW = ifh0Var.W();
        vu30 vu30Var = this.c;
        if (zW || vmb0Var.a.i == null) {
            vmb0Var.d = 0;
            hfh0 hfh0Var = (hfh0) vu30Var.invoke(pmb0Var, new hjl(j));
            return new rmb0(hfh0Var, vmb0Var, vmb0Var.d, hfh0Var);
        }
        vmb0Var.e = 0;
        hfh0 hfh0Var2 = (hfh0) vu30Var.invoke(vmb0Var.i, new hjl(j));
        return new qmb0(hfh0Var2, vmb0Var, vmb0Var.e, hfh0Var2);
    }
}
