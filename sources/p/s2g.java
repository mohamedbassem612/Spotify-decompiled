package p;

import com.spotify.mobius.functions.Consumer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s2g extends hab0 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ short e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s2g(String str, if5 if5Var, boolean z, gbx gbxVar, iu30 iu30Var, qim0 qim0Var, if5 if5Var2, lax laxVar, int i, int i2) {
        super(2);
        this.f = str;
        this.g = if5Var;
        this.b = z;
        this.h = gbxVar;
        this.c = iu30Var;
        this.i = qim0Var;
        this.t = if5Var2;
        this.X = laxVar;
        this.d = i;
        this.e = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        Object obj3 = this.X;
        Object obj4 = this.i;
        Object obj5 = this.t;
        Object obj6 = this.c;
        Object obj7 = this.h;
        Object obj8 = this.g;
        Object obj9 = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                short s = this.e;
                boolean z = this.b;
                kyo1.c((String) obj9, (hux) obj7, (Function0) obj6, (qim0) obj4, z, (String) obj8, (v2g) obj5, (vu30) obj3, (b0k) obj, iP, s);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                short s2 = this.e;
                boolean z2 = this.b;
                ey00.b(z2, (idh1) obj9, (j2i) obj8, (Function0) obj6, (Function0) obj7, (Function0) obj4, (jx00) obj5, (max) obj3, (b0k) obj, iP2, s2);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                short s3 = this.e;
                boolean z3 = this.b;
                bzn1.e((qim0) obj4, (vu30) obj3, z3, (vu30) obj9, (sgr0) obj8, (ngr0) obj7, (ygr0) obj5, (Function0) obj6, (b0k) obj, iP3, s3);
                break;
            case 3:
                ((Number) obj2).intValue();
                int iP4 = czo1.p(i | 1);
                short s4 = this.e;
                yoo1.t((j2i) obj9, (qim0) obj4, (vu30) obj3, (vu30) obj8, (vu30) obj7, (vu30) obj6, (vu30) obj5, this.b, (b0k) obj, iP4, s4);
                break;
            case 4:
                ((Number) obj2).intValue();
                int iP5 = czo1.p(i | 1);
                short s5 = this.e;
                boolean z4 = this.b;
                vxo1.g((String) obj9, (if5) obj8, z4, (gbx) obj7, (iu30) obj6, (qim0) obj4, (if5) obj5, (lax) obj3, (b0k) obj, iP5, s5);
                break;
            default:
                ((Number) obj2).intValue();
                int iP6 = czo1.p(i | 1);
                short s6 = this.e;
                boolean z5 = this.b;
                ila0.j((dbp) obj9, (cce) obj8, (q9l1) obj7, (z0i) obj6, (Consumer) obj5, z5, (qim0) obj4, (erl1) obj3, (b0k) obj, iP6, s6);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s2g(String str, hux huxVar, Function0 function0, qim0 qim0Var, boolean z, String str2, v2g v2gVar, vu30 vu30Var, int i, int i2) {
        super(2);
        this.f = str;
        this.h = huxVar;
        this.c = function0;
        this.i = qim0Var;
        this.b = z;
        this.g = str2;
        this.t = v2gVar;
        this.X = vu30Var;
        this.d = i;
        this.e = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s2g(j2i j2iVar, qim0 qim0Var, vu30 vu30Var, vu30 vu30Var2, vu30 vu30Var3, vu30 vu30Var4, vu30 vu30Var5, boolean z, int i, int i2) {
        super(2);
        this.f = j2iVar;
        this.i = qim0Var;
        this.X = vu30Var;
        this.g = vu30Var2;
        this.h = vu30Var3;
        this.c = vu30Var4;
        this.t = vu30Var5;
        this.b = z;
        this.d = i;
        this.e = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s2g(dbp dbpVar, cce cceVar, q9l1 q9l1Var, z0i z0iVar, Consumer consumer, boolean z, qim0 qim0Var, erl1 erl1Var, int i, int i2) {
        super(2);
        this.f = dbpVar;
        this.g = cceVar;
        this.h = q9l1Var;
        this.c = z0iVar;
        this.t = consumer;
        this.b = z;
        this.i = qim0Var;
        this.X = erl1Var;
        this.d = i;
        this.e = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s2g(qim0 qim0Var, vu30 vu30Var, boolean z, vu30 vu30Var2, sgr0 sgr0Var, ngr0 ngr0Var, ygr0 ygr0Var, Function0 function0, int i, int i2) {
        super(2);
        this.i = qim0Var;
        this.X = vu30Var;
        this.b = z;
        this.f = vu30Var2;
        this.g = sgr0Var;
        this.h = ngr0Var;
        this.t = ygr0Var;
        this.c = function0;
        this.d = i;
        this.e = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s2g(boolean z, idh1 idh1Var, j2i j2iVar, Function0 function0, Function0 function1, Function0 function2, jx00 jx00Var, max maxVar, int i, int i2) {
        super(2);
        this.b = z;
        this.f = idh1Var;
        this.g = j2iVar;
        this.c = function0;
        this.h = function1;
        this.i = function2;
        this.t = jx00Var;
        this.X = maxVar;
        this.d = i;
        this.e = i2;
    }
}
