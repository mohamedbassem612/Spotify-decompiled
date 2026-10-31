package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dix extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ byte e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public dix(String str, String str2, int i, String str3, qim0 qim0Var, boolean z, int i2, int i3) {
        super(2);
        this.f = str;
        this.g = str2;
        this.b = i;
        this.h = str3;
        this.i = qim0Var;
        this.c = z;
        this.d = i2;
        this.e = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                boolean z = this.c;
                byte b2 = this.e;
                int i2 = this.b;
                iro1.h((xtb0) obj6, z, b2, i2, (ll10) obj5, (iu30) obj4, (Function0) obj3, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                byte b3 = this.e;
                int i3 = this.b;
                xto1.m((String) obj6, (String) obj5, i3, (String) obj4, (qim0) obj3, this.c, (b0k) obj, iP2, b3);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                byte b4 = this.e;
                int i4 = this.b;
                e130.m((btb1) obj6, (xsb1) obj5, (usb1) obj4, i4, (nsq) obj3, this.c, (b0k) obj, iP3, b4);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public dix(xtb0 xtb0Var, boolean z, int i, int i2, ll10 ll10Var, iu30 iu30Var, Function0 function0, int i3) {
        super(2);
        this.f = xtb0Var;
        this.c = z;
        this.e = i;
        this.b = i2;
        this.g = ll10Var;
        this.h = iu30Var;
        this.i = function0;
        this.d = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public dix(btb1 btb1Var, xsb1 xsb1Var, usb1 usb1Var, int i, nsq nsqVar, boolean z, int i2, int i3) {
        super(2);
        this.f = btb1Var;
        this.g = xsb1Var;
        this.h = usb1Var;
        this.b = i;
        this.i = nsqVar;
        this.c = z;
        this.d = i2;
        this.e = i3;
    }
}
