package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cla extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cla(ze21 ze21Var, int i, boolean z, boolean z2, qim0 qim0Var, int i2) {
        super(2);
        this.a = (byte) 9;
        this.e = ze21Var;
        this.d = i;
        this.b = z;
        this.c = z2;
        this.f = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = this.d;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                boolean z = this.b;
                boolean z2 = this.c;
                i9p1.m((dhz0) obj4, z, z2, (qim0) obj3, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                iu30 iu30Var = (iu30) obj3;
                int iP2 = czo1.p(i | 1);
                boolean z3 = this.b;
                boolean z4 = this.c;
                g2p1.v(z3, z4, (xxq) obj4, iu30Var, (b0k) obj, iP2);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                boolean z5 = this.b;
                boolean z6 = this.c;
                ((kp5) obj4).h(z5, z6, (iu30) obj3, (b0k) obj, iP3);
                break;
            case 3:
                ((Number) obj2).intValue();
                int iP4 = czo1.p(i | 1);
                h7p1.c(iP4, (Function0) obj4, (Function0) obj3, (b0k) obj, this.b, this.c);
                break;
            case 4:
                ((Number) obj2).intValue();
                int iP5 = czo1.p(i | 1);
                nln.g((i2c) obj4, (mq20) obj3, this.b, this.c, (b0k) obj, iP5);
                break;
            case 5:
                ((Number) obj2).intValue();
                Function0 function0 = (Function0) obj3;
                int iP6 = czo1.p(i | 1);
                boolean z7 = this.b;
                boolean z8 = this.c;
                ltn1.d(z7, z8, (iu30) obj4, function0, (b0k) obj, iP6);
                break;
            case 6:
                ((Number) obj2).intValue();
                int iP7 = czo1.p(i | 1);
                boolean z9 = this.b;
                oqo1.b((p2c0) obj4, z9, (iu30) obj3, this.c, (b0k) obj, iP7);
                break;
            case 7:
                ((Number) obj2).intValue();
                qim0 qim0Var = (qim0) obj3;
                int iP8 = czo1.p(i | 1);
                boolean z10 = this.b;
                boolean z11 = this.c;
                g0p1.m(z10, z11, (iu30) obj4, qim0Var, (b0k) obj, iP8);
                break;
            case 8:
                ((Number) obj2).intValue();
                int iP9 = czo1.p(i | 1);
                boolean z12 = this.b;
                boolean z13 = this.c;
                omo1.g((phz0) obj4, z12, z13, (qim0) obj3, (b0k) obj, iP9);
                break;
            default:
                ((Number) obj2).intValue();
                int iP10 = czo1.p(1);
                int i2 = this.d;
                boolean z14 = this.b;
                boolean z15 = this.c;
                ((ze21) obj4).r(i2, z14, z15, (qim0) obj3, (b0k) obj, iP10);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cla(i2c i2cVar, mq20 mq20Var, boolean z, boolean z2, int i) {
        super(2);
        this.a = (byte) 4;
        this.e = i2cVar;
        this.f = mq20Var;
        this.b = z;
        this.c = z2;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cla(p2c0 p2c0Var, boolean z, iu30 iu30Var, boolean z2, int i) {
        super(2);
        this.a = (byte) 6;
        this.e = p2c0Var;
        this.b = z;
        this.f = iu30Var;
        this.c = z2;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cla(Object obj, boolean z, boolean z2, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.e = obj;
        this.b = z;
        this.c = z2;
        this.f = obj2;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cla(boolean z, boolean z2, Object obj, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.b = z;
        this.c = z2;
        this.e = obj;
        this.f = obj2;
        this.d = i;
    }
}
