package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nk1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public byte b;
    public final /* synthetic */ pk1 c;
    public final /* synthetic */ fcf0 d;
    public final /* synthetic */ fcf0 e;
    public final /* synthetic */ kbf0 f;
    public final /* synthetic */ ven0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk1(pk1 pk1Var, fcf0 fcf0Var, fcf0 fcf0Var2, kbf0 kbf0Var, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = pk1Var;
        this.d = fcf0Var;
        this.e = fcf0Var2;
        this.f = kbf0Var;
        this.g = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new nk1(this.f, this.d, this.c, this.e, this.g, lnmVar);
            default:
                return new nk1(this.c, this.d, this.e, this.f, this.g, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (p.lvx.y(r0, r3, 1.0f, r14, 12) == r11) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ac, code lost:
    
        if (p.lvx.y(r14.f, r3, r2, r14, 12) == r11) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.nk1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk1(kbf0 kbf0Var, fcf0 fcf0Var, pk1 pk1Var, fcf0 fcf0Var2, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.f = kbf0Var;
        this.d = fcf0Var;
        this.c = pk1Var;
        this.e = fcf0Var2;
        this.g = ven0Var;
    }
}
