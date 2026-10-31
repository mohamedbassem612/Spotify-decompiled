package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oli0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int g;
    public final /* synthetic */ byte h;
    public final /* synthetic */ cv30 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oli0(String str, String str2, qim0 qim0Var, boolean z, boolean z2, iu30 iu30Var, int i, int i2) {
        super(2);
        this.c = str;
        this.d = str2;
        this.e = qim0Var;
        this.b = z;
        this.f = z2;
        this.i = iu30Var;
        this.g = i;
        this.h = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.g;
        j2i j2iVar = this.i;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                byte b2 = this.h;
                qim0 qim0Var = this.e;
                boolean z = this.b;
                boolean z2 = this.f;
                gto1.f((String) obj4, (String) obj3, qim0Var, z, z2, (iu30) j2iVar, (b0k) obj, iP, b2);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                byte b3 = this.h;
                boolean z3 = this.b;
                e4p1.f(z3, (Function0) j2iVar, (String) obj4, (String) obj3, this.e, this.f, (b0k) obj, iP2, b3);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                byte b4 = this.h;
                boolean z4 = this.b;
                boolean z5 = this.f;
                qim0 qim0Var2 = this.e;
                n3o1.g(z4, (Function0) obj4, z5, (Function0) obj3, qim0Var2, j2iVar, (b0k) obj, iP3, b4);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oli0(boolean z, Function0 function0, String str, String str2, qim0 qim0Var, boolean z2, int i, int i2) {
        super(2);
        this.b = z;
        this.i = function0;
        this.c = str;
        this.d = str2;
        this.e = qim0Var;
        this.f = z2;
        this.g = i;
        this.h = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oli0(boolean z, Function0 function0, boolean z2, Function0 function1, qim0 qim0Var, j2i j2iVar, int i, int i2) {
        super(2);
        this.b = z;
        this.c = function0;
        this.f = z2;
        this.d = function1;
        this.e = qim0Var;
        this.i = j2iVar;
        this.g = i;
        this.h = i2;
    }
}
