package p;

import android.net.Uri;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rb9 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 7;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb9(long j, j2i j2iVar, j2i j2iVar2, qim0 qim0Var, j2i j2iVar3, int i) {
        super(2);
        this.c = j;
        this.e = j2iVar;
        this.b = j2iVar2;
        this.d = qim0Var;
        this.f = j2iVar3;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.f;
        Object obj4 = this.d;
        Object obj5 = this.b;
        Object obj6 = this.e;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    qim0 qim0VarThen = i1p1.q((qim0) obj4, er31.a).then((qim0) obj6);
                    String str = (String) obj5;
                    String str2 = (String) obj3;
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarThen);
                    hzj.A.getClass();
                    if (x340Var2.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(hmb0.t1);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(gfh0VarC, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    bmq0.a(Uri.parse(str), (qim0) null, hcx.d, (String) null, str2, this.c, 0L, false, x340Var2, 384, 202);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                r2p1.b((String) obj5, this.c, (Function0) obj6, (Function0) obj3, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                tgp1.b((String) obj5, this.c, (String) obj3, (qim0) obj4, (Function0) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                ven0 ven0Var = (ven0) obj5;
                iu30 iu30Var = (iu30) obj6;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    iyj iyjVar = (iyj) obj4;
                    boolean z = !u890.j((ly31) ((ven0) obj3).getValue(), jy31.a);
                    boolean zG = x340Var4.g(iu30Var) | x340Var4.i(ven0Var);
                    Object objT = x340Var4.T();
                    if (zG || objT == fkj0.X) {
                        objT = new wq9(iu30Var, ven0Var, (byte) 10);
                        x340Var4.s0(objT);
                    }
                    iyjVar.f(0, this.c, (Function0) objT, x340Var4, z);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                jzn1.g((String) obj5, (String) obj3, (String) obj4, this.c, (iu30) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                don1.g((hux) obj4, this.c, (String) obj5, (String) obj3, (gbx) obj6, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                ((nm1) obj4).h((String) obj5, (String) obj3, (String) obj6, this.c, (b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                rqo1.a(this.c, (j2i) obj6, (j2i) obj5, (qim0) obj4, (j2i) obj3, (b0k) obj, czo1.p(25009));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb9(String str, long j, String str2, qim0 qim0Var, Function0 function0, int i) {
        super(2);
        this.b = str;
        this.c = j;
        this.f = str2;
        this.d = qim0Var;
        this.e = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb9(String str, long j, Function0 function0, Function0 function1, qim0 qim0Var, int i) {
        super(2);
        this.b = str;
        this.c = j;
        this.e = function0;
        this.f = function1;
        this.d = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb9(String str, String str2, String str3, long j, iu30 iu30Var, int i) {
        super(2);
        this.b = str;
        this.f = str2;
        this.d = str3;
        this.c = j;
        this.e = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb9(nm1 nm1Var, String str, String str2, String str3, long j, int i) {
        super(2);
        this.d = nm1Var;
        this.b = str;
        this.f = str2;
        this.e = str3;
        this.c = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb9(iyj iyjVar, long j, iu30 iu30Var, ven0 ven0Var, ven0 ven0Var2) {
        super(2);
        this.d = iyjVar;
        this.c = j;
        this.e = iu30Var;
        this.b = ven0Var;
        this.f = ven0Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb9(hux huxVar, long j, String str, String str2, gbx gbxVar, int i) {
        super(2);
        this.d = huxVar;
        this.c = j;
        this.b = str;
        this.f = str2;
        this.e = gbxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb9(qim0 qim0Var, qim0 qim0Var2, String str, String str2, long j) {
        super(2);
        this.d = qim0Var;
        this.e = qim0Var2;
        this.b = str;
        this.f = str2;
        this.c = j;
    }
}
