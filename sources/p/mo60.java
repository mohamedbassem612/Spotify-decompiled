package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mo60 extends hab0 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ qim0 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ cv30 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo60(un60 un60Var, c380 c380Var, gbx gbxVar, iu30 iu30Var, wj31 wj31Var, boolean z, boolean z2, qim0 qim0Var, boolean z3, vn60 vn60Var, int i) {
        super(2);
        this.g = un60Var;
        this.h = c380Var;
        this.i = gbxVar;
        this.t = iu30Var;
        this.X = wj31Var;
        this.b = z;
        this.c = z2;
        this.f = qim0Var;
        this.d = z3;
        this.Y = vn60Var;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.Y;
        Object obj4 = this.X;
        Function0 function0 = this.t;
        Object obj5 = this.i;
        Object obj6 = this.h;
        Object obj7 = this.g;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                vn60 vn60Var = (vn60) obj3;
                int iP = czo1.p(this.e | 1);
                so60.a((un60) obj7, (c380) obj6, (gbx) obj5, (iu30) function0, (wj31) obj4, this.b, this.c, this.f, this.d, vn60Var, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(9);
                boolean z = this.b;
                boolean z2 = this.c;
                boolean z3 = this.d;
                int i = this.e;
                zaf1.a((iv21) obj7, (u7h) obj6, (u7h) obj5, z, z2, z3, i, function0, (String) obj4, (String) obj3, this.f, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo60(iv21 iv21Var, u7h u7hVar, u7h u7hVar2, boolean z, boolean z2, boolean z3, int i, Function0 function0, String str, String str2, qim0 qim0Var, int i2) {
        super(2);
        this.g = iv21Var;
        this.h = u7hVar;
        this.i = u7hVar2;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = i;
        this.t = function0;
        this.X = str;
        this.Y = str2;
        this.f = qim0Var;
    }
}
