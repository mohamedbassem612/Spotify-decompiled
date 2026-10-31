package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class eyx extends two1 {
    public static final eyx d = new eyx(0);
    public static final eyx e = new eyx(1);
    public final /* synthetic */ byte c;

    public /* synthetic */ eyx(byte b) {
        this.c = b;
    }

    @Override // p.two1
    public final zxx t(b0k b0kVar) {
        switch (this.c) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (x340) b0kVar;
                x340Var.i0(-675808376);
                uwr uwrVar = cbx.a;
                zxx zxxVar = new zxx(cbx.a(x340Var).b.a, cbx.a(x340Var).b.b, cbx.a(x340Var).b.b, cbx.a(x340Var).b.a, cbx.a(x340Var).d.b, cbx.a(x340Var).d.b, cbx.a(x340Var).b.c, cbx.a(x340Var).c.a, cbx.a(x340Var).a.b.c(), cbx.a(x340Var).b.d);
                x340Var.r(false);
                return zxxVar;
            default:
                x340 x340Var2 = (x340) b0kVar;
                x340Var2.i0(939287598);
                zxx zxxVarM = pwo1.m(x340Var2);
                x340Var2.r(false);
                return zxxVarM;
        }
    }
}
