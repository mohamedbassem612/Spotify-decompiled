package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class by00 extends hab0 implements vu30 {
    public final /* synthetic */ cv30 N0;
    public final /* synthetic */ cv30 O0;
    public final /* synthetic */ cv30 P0;
    public final /* synthetic */ cv30 Q0;
    public final /* synthetic */ xu30 R0;
    public final /* synthetic */ Object S0;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ cv30 Z;
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public by00(String str, boolean z, String str2, boolean z2, idh1 idh1Var, jx00 jx00Var, int i, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, j2i j2iVar, qim0 qim0Var, String str3, String str4, String str5, String str6, int i2) {
        super(2);
        this.e = str;
        this.b = z;
        this.f = str2;
        this.c = z2;
        this.X = idh1Var;
        this.Y = jx00Var;
        this.d = i;
        this.Z = function0;
        this.N0 = function1;
        this.O0 = function2;
        this.P0 = function3;
        this.Q0 = function4;
        this.R0 = j2iVar;
        this.S0 = qim0Var;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.t = str6;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.S0;
        xu30 xu30Var = this.Q0;
        xu30 xu30Var2 = this.P0;
        xu30 xu30Var3 = this.O0;
        xu30 xu30Var4 = this.N0;
        xu30 xu30Var5 = this.Z;
        Object obj4 = this.Y;
        Object obj5 = this.X;
        Object obj6 = this.t;
        Object obj7 = this.i;
        Object obj8 = this.h;
        Object obj9 = this.g;
        Object obj10 = this.f;
        Object obj11 = this.e;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(1);
                boolean z = this.b;
                boolean z2 = this.c;
                int i = this.d;
                ey00.a((String) obj11, z, (String) obj10, z2, (idh1) obj5, (jx00) obj4, i, (Function0) xu30Var5, (Function0) xu30Var4, (Function0) xu30Var3, (Function0) xu30Var2, (Function0) xu30Var, this.R0, (qim0) obj3, (String) obj9, (String) obj8, (String) obj7, (String) obj6, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(this.d | 1);
                boolean z3 = this.b;
                boolean z4 = this.c;
                xu30 xu30Var6 = this.R0;
                ((mta) obj11).a((j8e0) obj10, z3, z4, (iu30) obj9, (uw9) obj8, (xu30) obj7, (xu30) obj6, (xu30) obj5, (xu30) obj4, xu30Var5, xu30Var4, xu30Var3, xu30Var2, xu30Var, xu30Var6, (xu30) obj3, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public by00(mta mtaVar, j8e0 j8e0Var, boolean z, boolean z2, iu30 iu30Var, uw9 uw9Var, xu30 xu30Var, xu30 xu30Var2, xu30 xu30Var3, xu30 xu30Var4, xu30 xu30Var5, xu30 xu30Var6, xu30 xu30Var7, xu30 xu30Var8, xu30 xu30Var9, xu30 xu30Var10, xu30 xu30Var11, int i) {
        super(2);
        this.e = mtaVar;
        this.f = j8e0Var;
        this.b = z;
        this.c = z2;
        this.g = iu30Var;
        this.h = uw9Var;
        this.i = xu30Var;
        this.t = xu30Var2;
        this.X = xu30Var3;
        this.Y = xu30Var4;
        this.Z = xu30Var5;
        this.N0 = xu30Var6;
        this.O0 = xu30Var7;
        this.P0 = xu30Var8;
        this.Q0 = xu30Var9;
        this.R0 = xu30Var10;
        this.S0 = xu30Var11;
        this.d = i;
    }
}
