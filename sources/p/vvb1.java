package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vvb1 extends hab0 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vvb1(String str, tlc1 tlc1Var, float f, float f2, dzo1 dzo1Var, Function0 function0, idn0 idn0Var, String str2, int i, jxc1 jxc1Var) {
        super(2);
        this.f = str;
        this.g = tlc1Var;
        this.b = f;
        this.c = f2;
        this.h = dzo1Var;
        this.d = function0;
        this.i = idn0Var;
        this.t = str2;
        this.e = i;
        this.X = jxc1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.X;
        int i = this.e;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        Object obj7 = this.f;
        Object obj8 = this.t;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                r4o1.k((t5t0) obj7, (n511) obj6, (n511) obj5, this.b, this.c, (zu30) obj4, this.d, (iu30) obj8, (iu30) obj3, (b0k) obj, iP);
                break;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                String str = (String) obj7;
                tlc1 tlc1Var = (tlc1) obj6;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    boolean zG = x340Var2.g(str);
                    Object objT = x340Var2.T();
                    byte b2 = 11;
                    if (zG || objT == m4cVar) {
                        objT = new hqa1(str, b2);
                        x340Var2.s0(objT);
                    }
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarB = s161.b(nim0Var, false, (iu30) objT);
                    float f = this.b;
                    qim0 qim0VarS = u291.s(qim0VarB, tlc1Var.N0(f), tlc1Var.N0(this.c));
                    dzo1 dzo1Var = (dzo1) obj5;
                    Function0 function0 = this.d;
                    boolean zG2 = x340Var2.g(function0);
                    Object objT2 = x340Var2.T();
                    if (zG2 || objT2 == m4cVar) {
                        objT2 = new uuc1(function0, (byte) 3);
                        x340Var2.s0(objT2);
                    }
                    cwl1.b(qim0VarS, (tl3) null, (hw61) null, (pgx) null, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), (max) null, false, (idn0) obj4, jtr.g, new gbx(dzo1Var, (Function0) objT2), (gbx) null, apo.r(1881801704, new ut1(i, (jxc1) obj3, (byte) 11), x340Var2), x340Var2, 100663296, 48, 1134);
                    if (((String) obj8) == null) {
                        x340Var2.i0(-118801551);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-119160376);
                        qim0 qim0VarV = u291.v(nim0Var, tlc1Var.N0(f));
                        uwr uwrVar = cbx.a;
                        uwo1.e((String) obj8, qim0VarV, cbx.d(x340Var2).k, cbx.a(x340Var2).b.b, new a0e1(1), (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var2, 0, 0, 1696);
                        x340Var2.r(false);
                    }
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vvb1(t5t0 t5t0Var, n511 n511Var, n511 n511Var2, float f, float f2, zu30 zu30Var, Function0 function0, iu30 iu30Var, iu30 iu30Var2, int i) {
        super(2);
        this.f = t5t0Var;
        this.g = n511Var;
        this.h = n511Var2;
        this.b = f;
        this.c = f2;
        this.i = zu30Var;
        this.d = function0;
        this.t = iu30Var;
        this.X = iu30Var2;
        this.e = i;
    }
}
