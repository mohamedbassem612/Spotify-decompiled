package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qe5 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe5(o95 o95Var, boolean z, int i, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 2;
        this.d = o95Var;
        this.c = z;
        this.e = i;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new qe5(this.c, (o95) this.d, this.e, lnmVar, (byte) 0);
            case 1:
                return new qe5(this.c, (o95) this.d, this.e, lnmVar, (byte) 1);
            case 2:
                return new qe5((o95) this.d, this.c, this.e, lnmVar);
            default:
                return new qe5(this.c, (jkr0) this.d, this.e, lnmVar, (byte) 3);
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
            case 1:
                break;
            case 2:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c8, code lost:
    
        if (r0 == r9) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e5, code lost:
    
        if (r0 == r9) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0120, code lost:
    
        if (r0 == r9) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x013c, code lost:
    
        if (r0 == r9) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.qe5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qe5(boolean z, Object obj, int i, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = z;
        this.d = obj;
        this.e = i;
    }
}
