package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vci0 extends hab0 implements vu30 {
    public final /* synthetic */ znb0 N0;
    public final /* synthetic */ znb0 O0;
    public final /* synthetic */ znb0 P0;
    public final /* synthetic */ iu30 X;
    public final /* synthetic */ ven0 Y;
    public final /* synthetic */ xpw Z;
    public final /* synthetic */ float a;
    public final /* synthetic */ hob1 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ i091 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ yqg h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ vu30 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vci0(float f, hob1 hob1Var, Function0 function0, Function0 function1, String str, i091 i091Var, boolean z, yqg yqgVar, boolean z2, vu30 vu30Var, iu30 iu30Var, ven0 ven0Var, xpw xpwVar, znb0 znb0Var, znb0 znb0Var2, znb0 znb0Var3) {
        super(2);
        this.a = f;
        this.b = hob1Var;
        this.c = function0;
        this.d = function1;
        this.e = str;
        this.f = i091Var;
        this.g = z;
        this.h = yqgVar;
        this.i = z2;
        this.t = vu30Var;
        this.X = iu30Var;
        this.Y = ven0Var;
        this.Z = xpwVar;
        this.N0 = znb0Var;
        this.O0 = znb0Var2;
        this.P0 = znb0Var3;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x011f  */
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = bb00.h(0, x340Var2);
            }
            err0 err0Var = (hdn0) objT;
            qim0 qim0VarO = bth.o(u291.f(uyn1.B(nim0.a, 0.0f, 0.0f, 0.0f, 8.0f, 7), 1.0f), this.a, this.b.h);
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                objT2 = ktd.n(x340Var2);
            }
            idn0 idn0Var = (idn0) objT2;
            jtr jtrVar = jtr.c;
            pm31 pm31Var = new pm31(0);
            Function0 function0 = this.c;
            boolean zG = x340Var2.g(function0);
            Object objT3 = x340Var2.T();
            if (zG || objT3 == m4cVar) {
                objT3 = new tze0(function0, (byte) 22);
                x340Var2.s0(objT3);
            }
            Function0 function1 = (Function0) objT3;
            Function0 function2 = this.d;
            boolean zG2 = x340Var2.g(function2);
            Object objT4 = x340Var2.T();
            if (zG2 || objT4 == m4cVar) {
                objT4 = new tze0(function2, (byte) 23);
                x340Var2.s0(objT4);
            }
            qim0 qim0VarN = anm1.N("cardClickableArea", bin.y(qim0VarO, idn0Var, jtrVar, false, (String) null, pm31Var, (String) null, function1, (Function0) objT4, 428));
            String str = this.e;
            if (str != null) {
                qim0VarN = s161.b(qim0VarN, false, new atp0(str, (byte) 4));
            }
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarN);
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
            ven0 ven0Var = this.Y;
            boolean zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
            hob1 hob1Var = this.b;
            i091 i091Var = this.f;
            if (zBooleanValue) {
                if (!(i091Var != null ? ebp1.q(i091Var) : false) || hob1Var.f) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            int iS = err0Var.s();
            boolean z2 = this.g;
            xpw xpwVar = this.Z;
            yqg yqgVar = this.h;
            j2i j2iVarR = apo.r(987305377, new sci0(hob1Var, i091Var, z2, xpwVar, ven0Var, yqgVar, (byte) 0), x340Var2);
            znb0 znb0Var = this.N0;
            iu30 iu30Var = this.X;
            j2i j2iVarR2 = apo.r(1213554082, new tci0(hob1Var, znb0Var, iu30Var, (byte) 0), x340Var2);
            j2i j2iVarR3 = apo.r(1439802787, new uci0(hob1Var, this.O0, i091Var, yqgVar, iu30Var, (byte) 0), x340Var2);
            j2i j2iVarR4 = apo.r(1666051492, new rvg0(this.P0, i091Var, iu30Var, (byte) 12), x340Var2);
            boolean zG3 = x340Var2.g(iu30Var);
            Object objT5 = x340Var2.T();
            if (zG3 || objT5 == m4cVar) {
                objT5 = new msh0(iu30Var, (byte) 12);
                x340Var2.s0(objT5);
            }
            loo1.g(hob1Var, iS, j2iVarR, j2iVarR2, j2iVarR3, j2iVarR4, (qim0) null, z2, yqgVar, z, i091Var, this.i, this.t, (Function0) objT5, x340Var2, 224640);
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
