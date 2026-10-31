package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pnu extends hab0 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ cv30 Z;
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ cv30 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ qim0 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pnu(String str, dr41 dr41Var, iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3, iu30 iu30Var4, Function0 function0, iu30 iu30Var5, Function0 function1, qim0 qim0Var, iu30 iu30Var6, int i) {
        super(2);
        this.h = str;
        this.i = dr41Var;
        this.b = iu30Var;
        this.c = iu30Var2;
        this.t = iu30Var3;
        this.X = iu30Var4;
        this.d = function0;
        this.Y = iu30Var5;
        this.e = function1;
        this.f = qim0Var;
        this.Z = iu30Var6;
        this.g = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = this.g;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.Z;
        Object obj3 = this.Y;
        Function0 function1 = this.c;
        Object obj4 = this.X;
        Object obj5 = this.t;
        Object obj6 = this.i;
        Object obj7 = this.h;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(65);
                int i2 = this.g;
                iu30 iu30Var = this.b;
                Function0 function2 = this.d;
                qim0 qim0Var = this.f;
                exd0.c((dou) obj7, (rm0) obj6, (ngs0) obj5, (tm) obj4, i2, iu30Var, (iu30) function1, function2, (zeu) obj3, qim0Var, (vu30) function0, this.e, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                iu30 iu30Var2 = (iu30) function0;
                int iP2 = czo1.p(i | 1);
                iu30 iu30Var3 = this.b;
                Function0 function3 = this.d;
                vvm1.r((String) obj7, (dr41) obj6, iu30Var3, (iu30) function1, (iu30) obj5, (iu30) obj4, function3, (iu30) obj3, this.e, this.f, iu30Var2, (b0k) obj, iP2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                iu30 iu30Var4 = this.b;
                Function0 function4 = this.d;
                Function0 function5 = this.e;
                p1p1.u((fdj1) obj7, (jbj1) obj6, (j2i) obj5, iu30Var4, function4, function5, (Function0) obj4, function1, (Function0) obj3, function0, this.f, (b0k) obj, iP3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pnu(dou douVar, rm0 rm0Var, ngs0 ngs0Var, tm tmVar, int i, iu30 iu30Var, iu30 iu30Var2, Function0 function0, zeu zeuVar, qim0 qim0Var, vu30 vu30Var, Function0 function1, int i2) {
        super(2);
        this.h = douVar;
        this.i = rm0Var;
        this.t = ngs0Var;
        this.X = tmVar;
        this.g = i;
        this.b = iu30Var;
        this.c = iu30Var2;
        this.d = function0;
        this.Y = zeuVar;
        this.f = qim0Var;
        this.Z = vu30Var;
        this.e = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pnu(fdj1 fdj1Var, jbj1 jbj1Var, j2i j2iVar, iu30 iu30Var, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, Function0 function5, qim0 qim0Var, int i) {
        super(2);
        this.h = fdj1Var;
        this.i = jbj1Var;
        this.t = j2iVar;
        this.b = iu30Var;
        this.d = function0;
        this.e = function1;
        this.X = function2;
        this.c = function3;
        this.Y = function4;
        this.Z = function5;
        this.f = qim0Var;
        this.g = i;
    }
}
