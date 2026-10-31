package p;

import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class e8f1 extends hab0 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ cv30 Y;
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Integer c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ qim0 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ int h;
    public final /* synthetic */ dtb1 i;
    public final /* synthetic */ Parcelable t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8f1(n8f1 n8f1Var, q8f1 q8f1Var, int i, Integer num, boolean z, vu30 vu30Var, vu30 vu30Var2, iu30 iu30Var, boolean z2, qim0 qim0Var, int i2) {
        super(2);
        this.i = n8f1Var;
        this.t = q8f1Var;
        this.b = i;
        this.c = num;
        this.d = z;
        this.X = vu30Var;
        this.Y = vu30Var2;
        this.e = iu30Var;
        this.g = z2;
        this.f = qim0Var;
        this.h = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.h;
        iu30 iu30Var = this.Y;
        Object obj3 = this.X;
        zff1 zff1Var = this.t;
        wff1 wff1Var = this.i;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                vu30 vu30Var = (vu30) iu30Var;
                int iP = czo1.p(i | 1);
                int i2 = this.b;
                Integer num = this.c;
                boolean z = this.d;
                nln.n((n8f1) wff1Var, (q8f1) zff1Var, i2, num, z, (vu30) obj3, vu30Var, this.e, this.g, this.f, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                int i3 = this.b;
                Integer num2 = this.c;
                boolean z2 = this.d;
                iu30 iu30Var2 = this.e;
                qim0 qim0Var = this.f;
                x760.m(wff1Var, zff1Var, i3, num2, z2, (srt0) obj3, iu30Var2, qim0Var, iu30Var, this.g, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8f1(wff1 wff1Var, zff1 zff1Var, int i, Integer num, boolean z, srt0 srt0Var, iu30 iu30Var, qim0 qim0Var, iu30 iu30Var2, boolean z2, int i2) {
        super(2);
        this.i = wff1Var;
        this.t = zff1Var;
        this.b = i;
        this.c = num;
        this.d = z;
        this.X = srt0Var;
        this.e = iu30Var;
        this.f = qim0Var;
        this.Y = iu30Var2;
        this.g = z2;
        this.h = i2;
    }
}
