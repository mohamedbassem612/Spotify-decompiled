package p;

import android.os.Parcelable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bxy extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxy(evh1 evh1Var, dvh1 dvh1Var, int i, int i2, bih1 bih1Var, qim0 qim0Var, iu30 iu30Var, int i3) {
        super(2);
        this.a = (byte) 8;
        this.f = evh1Var;
        this.g = dvh1Var;
        this.b = i;
        this.e = i2;
        this.h = bih1Var;
        this.d = qim0Var;
        this.c = iu30Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        int i = this.e;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.c;
        Object obj4 = this.d;
        Object obj5 = this.h;
        Object obj6 = this.g;
        Object obj7 = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                int i2 = this.b;
                ((lz9) obj7).h((ela1) obj6, (u771) obj5, i2, (iu30) obj3, (qim0) obj4, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                int i3 = this.b;
                kqn1.g((w4i1) obj7, (c380) obj6, i3, (String) obj5, (iu30) obj3, (qim0) obj4, (b0k) obj, iP2);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                blo1.g((r960) obj7, (zfx) obj6, (srt0) obj5, (iu30) obj3, (iu30) obj4, this.b, (b0k) obj, iP3);
                break;
            case 3:
                ((Number) obj2).intValue();
                int iP4 = czo1.p(i | 1);
                int i4 = this.b;
                up30.d((okm0) obj7, (srt0) obj6, i4, (vu30) obj5, (vu30) obj3, (qim0) obj4, (b0k) obj, iP4);
                break;
            case 4:
                ((Number) obj2).intValue();
                int iP5 = czo1.p(1);
                int i5 = this.b;
                int i6 = this.e;
                zc01.f((sb01) obj7, (Function0) obj6, (hc01) obj5, (wux) obj3, i5, i6, (qim0) obj4, (b0k) obj, iP5);
                break;
            case 5:
                ((Number) obj2).intValue();
                int iP6 = czo1.p(1);
                int i7 = this.b;
                int i8 = this.e;
                zro1.i(i7, i8, (iu30) obj3, (iu30) obj7, (Function0) obj6, (Function0) obj5, (qim0) obj4, (b0k) obj, iP6);
                break;
            case 6:
                ((Number) obj2).intValue();
                int iP7 = czo1.p(1);
                int i9 = this.b;
                int i10 = this.e;
                zro1.j(i9, i10, (iu30) obj3, (iu30) obj7, (Function0) obj6, (Function0) obj5, (Function0) obj4, (b0k) obj, iP7);
                break;
            case 7:
                ((Number) obj2).intValue();
                int iP8 = czo1.p(i | 1);
                int i11 = this.b;
                rwo1.i((g7d1) obj7, (e6d1) obj6, (f6d1) obj5, i11, (qim0) obj4, (iu30) obj3, (b0k) obj, iP8);
                break;
            default:
                ((Number) obj2).intValue();
                int iP9 = czo1.p(1);
                int i12 = this.b;
                int i13 = this.e;
                eko1.r((evh1) obj7, (dvh1) obj6, i12, i13, (bih1) obj5, (qim0) obj4, (iu30) obj3, (b0k) obj, iP9);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bxy(Parcelable parcelable, Object obj, int i, Object obj2, cv30 cv30Var, qim0 qim0Var, int i2, byte b) {
        super(2);
        this.a = b;
        this.f = parcelable;
        this.g = obj;
        this.b = i;
        this.h = obj2;
        this.c = cv30Var;
        this.d = qim0Var;
        this.e = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxy(lz9 lz9Var, ela1 ela1Var, u771 u771Var, int i, iu30 iu30Var, qim0 qim0Var, int i2) {
        super(2);
        this.a = (byte) 0;
        this.f = lz9Var;
        this.g = ela1Var;
        this.h = u771Var;
        this.b = i;
        this.c = iu30Var;
        this.d = qim0Var;
        this.e = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxy(r960 r960Var, zfx zfxVar, srt0 srt0Var, iu30 iu30Var, iu30 iu30Var2, int i, int i2) {
        super(2);
        this.a = (byte) 2;
        this.f = r960Var;
        this.g = zfxVar;
        this.h = srt0Var;
        this.c = iu30Var;
        this.d = iu30Var2;
        this.b = i;
        this.e = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxy(sb01 sb01Var, Function0 function0, hc01 hc01Var, wux wuxVar, int i, int i2, qim0 qim0Var, int i3) {
        super(2);
        this.a = (byte) 4;
        this.f = sb01Var;
        this.g = function0;
        this.h = hc01Var;
        this.c = wuxVar;
        this.b = i;
        this.e = i2;
        this.d = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxy(g7d1 g7d1Var, e6d1 e6d1Var, f6d1 f6d1Var, int i, qim0 qim0Var, iu30 iu30Var, int i2) {
        super(2);
        this.a = (byte) 7;
        this.f = g7d1Var;
        this.g = e6d1Var;
        this.h = f6d1Var;
        this.b = i;
        this.d = qim0Var;
        this.c = iu30Var;
        this.e = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bxy(int i, int i2, iu30 iu30Var, iu30 iu30Var2, Function0 function0, Function0 function1, Object obj, int i3, byte b) {
        super(2);
        this.a = b;
        this.b = i;
        this.e = i2;
        this.c = iu30Var;
        this.f = iu30Var2;
        this.g = function0;
        this.h = function1;
        this.d = obj;
    }
}
