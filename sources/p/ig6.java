package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ig6 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ig6(Object obj, int i, int i2, boolean z, boolean z2, qim0 qim0Var, int i3, byte b) {
        super(2);
        this.a = b;
        this.f = obj;
        this.c = i;
        this.e = i2;
        this.b = z;
        this.d = z2;
        this.g = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = this.e;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                boolean z = this.b;
                int i2 = this.c;
                boolean z2 = this.d;
                tx9.a((hg6) obj4, z, i2, z2, (qim0) obj3, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                boolean z3 = this.b;
                int i3 = this.c;
                boolean z4 = this.d;
                ioo1.q((String) obj4, z3, i3, z4, (iu30) obj3, (b0k) obj, iP2);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(1);
                int i4 = this.c;
                int i5 = this.e;
                boolean z5 = this.b;
                boolean z6 = this.d;
                yto.h((wi90) obj4, i4, i5, z5, z6, (qim0) obj3, (b0k) obj, iP3);
                break;
            default:
                ((Number) obj2).intValue();
                int iP4 = czo1.p(1);
                int i6 = this.c;
                int i7 = this.e;
                boolean z7 = this.b;
                boolean z8 = this.d;
                k1u.k((g9e1) obj4, i6, i7, z7, z8, (qim0) obj3, (b0k) obj, iP4);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ig6(Object obj, boolean z, int i, boolean z2, Object obj2, int i2, byte b) {
        super(2);
        this.a = b;
        this.f = obj;
        this.b = z;
        this.c = i;
        this.d = z2;
        this.g = obj2;
        this.e = i2;
    }
}
