package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mnn1 extends kuh {
    public final /* synthetic */ byte f;
    public final /* synthetic */ rpn1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mnn1(rpn1 rpn1Var, byte b) {
        super(rpn1Var);
        this.f = b;
        this.g = rpn1Var;
    }

    @Override // p.kuh
    public final Object b(int i) {
        byte b = this.f;
        rpn1 rpn1Var = this.g;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Object obj = rpn1.t;
                return rpn1Var.b()[i];
            case 1:
                return new zon1(rpn1Var, i);
            default:
                Object obj2 = rpn1.t;
                return rpn1Var.c()[i];
        }
    }
}
