package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n6f1 extends hab0 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ cv30 Y;
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6f1(c380 c380Var, float f, int i, int i2, boolean z, boolean z2, boolean z3, Function0 function0, qim0 qim0Var, j2i j2iVar, int i3) {
        super(2);
        this.t = c380Var;
        this.c = f;
        this.b = i;
        this.d = i2;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = function0;
        this.X = qim0Var;
        this.Y = j2iVar;
        this.i = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.i;
        Function0 function0 = this.Y;
        Object obj3 = this.X;
        Object obj4 = this.t;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                qim0 qim0Var = (qim0) obj3;
                j2i j2iVar = (j2i) function0;
                int iP = czo1.p(i | 1);
                smo1.a((c380) obj4, this.c, this.b, this.d, this.e, this.f, this.g, this.h, qim0Var, j2iVar, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                int i2 = this.b;
                float f = this.c;
                int i3 = this.d;
                boolean z = this.e;
                boolean z2 = this.f;
                boolean z3 = this.g;
                Function0 function1 = this.h;
                ((naf1) obj4).f((laf1) obj3, i2, f, i3, z, z2, z3, function1, function0, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6f1(naf1 naf1Var, laf1 laf1Var, int i, float f, int i2, boolean z, boolean z2, boolean z3, Function0 function0, Function0 function1, int i3) {
        super(2);
        this.t = naf1Var;
        this.X = laf1Var;
        this.b = i;
        this.c = f;
        this.d = i2;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = function0;
        this.Y = function1;
        this.i = i3;
    }
}
