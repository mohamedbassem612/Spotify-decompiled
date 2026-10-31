package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class uvr0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ byte f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ cv30 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public uvr0(int i, int i2, qim0 qim0Var, sgr0 sgr0Var, long j, Function0 function0, Function0 function1, int i3, int i4) {
        super(2);
        this.d = i;
        this.e = i2;
        this.b = qim0Var;
        this.g = sgr0Var;
        this.c = j;
        this.h = function0;
        this.i = function1;
        this.f = i4;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.i;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                Function0 function0 = (Function0) obj3;
                Function0 function1 = (Function0) iu30Var;
                int iP = czo1.p(1);
                byte b2 = this.f;
                int i = this.d;
                int i2 = this.e;
                qim0 qim0Var = this.b;
                eko1.m(i, i2, qim0Var, (sgr0) obj4, this.c, function0, function1, (b0k) obj, iP, b2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(this.e | 1);
                byte b3 = this.f;
                qim0 qim0Var2 = this.b;
                long j = this.c;
                int i3 = this.d;
                zzo1.i((c380) obj4, qim0Var2, (lee1) obj3, j, i3, iu30Var, (b0k) obj, iP2, b3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public uvr0(c380 c380Var, qim0 qim0Var, lee1 lee1Var, long j, int i, iu30 iu30Var, int i2, int i3) {
        super(2);
        this.g = c380Var;
        this.b = qim0Var;
        this.h = lee1Var;
        this.c = j;
        this.d = i;
        this.i = iu30Var;
        this.e = i2;
        this.f = i3;
    }
}
