package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class j9m extends hab0 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ Integer c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ cv30 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [byte, int] */
    public j9m(String str, iu30 iu30Var, iu30 iu30Var2, Function0 function0, qim0 qim0Var, Integer num, String str2, long j, tr80 tr80Var, n5f0 n5f0Var, int i) {
        super(2);
        this.d = str;
        this.i = iu30Var;
        this.t = iu30Var2;
        this.f = function0;
        this.b = qim0Var;
        this.c = num;
        this.e = str2;
        this.h = (int) j;
        this.X = tr80Var;
        this.Y = n5f0Var;
        this.g = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.g;
        Object obj3 = this.Y;
        Object obj4 = this.X;
        vu30 vu30Var = this.t;
        Object obj5 = this.i;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                String str = this.d;
                irn1.b(str, (iu30) obj5, (iu30) vu30Var, this.f, this.b, this.c, this.e, this.h, (tr80) obj4, (n5f0) obj3, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                byte b2 = this.h;
                u1p1.o((m5a) obj5, this.b, this.c, this.d, vu30Var, this.e, (vu30) obj4, (c380) obj3, this.f, (b0k) obj, iP2, b2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j9m(m5a m5aVar, qim0 qim0Var, Integer num, String str, vu30 vu30Var, String str2, vu30 vu30Var2, c380 c380Var, Function0 function0, int i, int i2) {
        super(2);
        this.i = m5aVar;
        this.b = qim0Var;
        this.c = num;
        this.d = str;
        this.t = vu30Var;
        this.e = str2;
        this.X = vu30Var2;
        this.Y = c380Var;
        this.f = function0;
        this.g = i;
        this.h = i2;
    }
}
