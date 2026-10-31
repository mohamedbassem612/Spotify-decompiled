package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class ash implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ vu30 d;
    public final /* synthetic */ int e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ash(qim0 qim0Var, vu30 vu30Var, int i, int i2) {
        this.a = (byte) 2;
        this.b = qim0Var;
        this.d = vu30Var;
        this.e = i;
        this.c = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.c;
        int i = this.e;
        j2i j2iVar = this.d;
        Object obj3 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Integer) obj2).getClass();
                w8p1.d((r7e1) obj3, z, j2iVar, (b0k) obj, czo1.p(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                d1o1.c((r7e1) obj3, z, j2iVar, (b0k) obj, czo1.p(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iP = czo1.p(i | 1);
                int i2 = z ? 1 : 0;
                ejo1.l(iP, i2, (b0k) obj, j2iVar, (qim0) obj3);
                break;
        }
        return rih1Var;
    }

    public /* synthetic */ ash(r7e1 r7e1Var, boolean z, j2i j2iVar, int i, byte b) {
        this.a = b;
        this.b = r7e1Var;
        this.c = z;
        this.d = j2iVar;
        this.e = i;
    }
}
