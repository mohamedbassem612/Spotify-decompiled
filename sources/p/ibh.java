package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ibh extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ j2i d;
    public final /* synthetic */ int e;
    public final /* synthetic */ byte f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ibh(gt40 gt40Var, int i, int i2, j2i j2iVar, int i3, int i4) {
        super(2);
        this.g = gt40Var;
        this.b = i;
        this.c = i2;
        this.d = j2iVar;
        this.e = i3;
        this.f = i4;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        Object obj3 = this.g;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                byte b2 = this.f;
                boolean z = this.b;
                boolean z2 = this.c;
                j2i j2iVar = this.d;
                eqr0.a((gt40) obj3, z ? 1 : 0, z2 ? 1 : 0, j2iVar, (b0k) obj, i | 1, b2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                byte b3 = this.f;
                boolean z3 = this.b;
                w3p1.c(z3, (qim0) obj3, this.c, this.d, (b0k) obj, iP, b3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ibh(boolean z, qim0 qim0Var, boolean z2, j2i j2iVar, int i, int i2) {
        super(2);
        this.b = z;
        this.g = qim0Var;
        this.c = z2;
        this.d = j2iVar;
        this.e = i;
        this.f = i2;
    }
}
