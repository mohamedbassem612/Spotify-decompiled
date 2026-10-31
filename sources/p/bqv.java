package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bqv extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ vqv b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ htv d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ u380 g;
    public final /* synthetic */ c380 h;
    public final /* synthetic */ iu30 i;
    public final /* synthetic */ iu30 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqv(vqv vqvVar, boolean z, htv htvVar, Function0 function0, Function0 function1, u380 u380Var, c380 c380Var, iu30 iu30Var, iu30 iu30Var2, int i) {
        super(2);
        this.b = vqvVar;
        this.c = z;
        this.d = htvVar;
        this.e = function0;
        this.f = function1;
        this.g = u380Var;
        this.h = c380Var;
        this.i = iu30Var;
        this.t = iu30Var2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        jax haxVar;
        boolean z;
        a90 a90Var;
        a90 a90Var2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = 1;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    if (this.c) {
                        x340Var2.i0(-1381443992);
                        x340Var2.r(false);
                        haxVar = jax.a;
                    } else {
                        x340Var2.i0(-1381441336);
                        haxVar = new hax(cwl1.o0(x340Var2, 2131955222));
                        x340Var2.r(false);
                    }
                    jax jaxVar = haxVar;
                    c380<ktb> c380Var = this.h;
                    if (c380Var == null || !c380Var.isEmpty()) {
                        Iterator it = c380Var.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                ktb ktbVar = (ktb) it.next();
                                if ((ktbVar instanceof gtb) || (ktbVar instanceof htb)) {
                                    z = true;
                                }
                            } else {
                                z = false;
                            }
                        }
                    } else {
                        z = false;
                    }
                    x340Var2.i0(-1381429862);
                    ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
                    for (ktb ktbVar2 : c380Var) {
                        vqv vqvVar = this.b;
                        String str = vqvVar.a;
                        m4c m4cVar = fkj0.X;
                        if (u890.j(ktbVar2, gtb.a)) {
                            x340Var2.i0(-1366959919);
                            String strO0 = cwl1.o0(x340Var2, 2131955242);
                            boolean zI = x340Var2.i(vqvVar);
                            Function0 function0 = this.f;
                            boolean zG = zI | x340Var2.g(function0);
                            Object objT = x340Var2.T();
                            if (zG || objT == m4cVar) {
                                objT = new tqv(vqvVar, function0, (byte) 0);
                                x340Var2.s0(objT);
                            }
                            a90Var2 = new a90("select", strO0, (Function0) objT, (hux) null, (max) null, (jsl) null, 120);
                            x340Var2.r(false);
                        } else {
                            boolean z2 = ktbVar2 instanceof htb;
                            iu30 iu30Var = this.t;
                            if (z2) {
                                x340Var2.i0(-1366950291);
                                a90Var = new b90("smart_reorder", apo.r(-762163388, new n7m(vqvVar, (htb) ktbVar2, str, iu30Var, (byte) 21), x340Var2));
                                x340Var2.r(false);
                            } else {
                                boolean zJ = u890.j(ktbVar2, dtb.a);
                                Function0 function1 = this.e;
                                if (zJ) {
                                    x340Var2.i0(574505744);
                                    fux fuxVar = fux.c;
                                    jsl jslVar = new jsl(cwl1.o0(x340Var2, 2131955219));
                                    boolean zI2 = x340Var2.i(vqvVar) | x340Var2.g(function1);
                                    Object objT2 = x340Var2.T();
                                    if (zI2 || objT2 == m4cVar) {
                                        objT2 = new tqv(vqvVar, function1, b2);
                                        x340Var2.s0(objT2);
                                    }
                                    a90Var2 = new a90("exit", (String) null, (Function0) objT2, fuxVar, (max) null, jslVar, 50);
                                    x340Var2.r(false);
                                } else {
                                    boolean zJ2 = u890.j(ktbVar2, etb.a);
                                    iu30 iu30Var2 = this.i;
                                    if (zJ2) {
                                        x340Var2.i0(574893058);
                                        String strO1 = cwl1.o0(x340Var2, 2131955228);
                                        boolean zI3 = x340Var2.i(vqvVar) | x340Var2.g(iu30Var2);
                                        Object objT3 = x340Var2.T();
                                        if (zI3 || objT3 == m4cVar) {
                                            objT3 = new pqv(vqvVar, iu30Var2, (byte) 3);
                                            x340Var2.s0(objT3);
                                        }
                                        a90Var = new a90("move", strO1, (Function0) objT3, (hux) null, jaxVar, (jsl) null, 88);
                                        x340Var2.r(false);
                                    } else {
                                        boolean zJ3 = u890.j(ktbVar2, ftb.a);
                                        htv htvVar = this.d;
                                        u380 u380Var = this.g;
                                        if (zJ3) {
                                            x340Var2.i0(575241281);
                                            String strO2 = cwl1.o0(x340Var2, 2131955238);
                                            boolean zG2 = x340Var2.g(htvVar) | x340Var2.g(u380Var) | x340Var2.i(vqvVar) | x340Var2.g(iu30Var) | x340Var2.g(function1);
                                            Object objT4 = x340Var2.T();
                                            if (zG2 || objT4 == m4cVar) {
                                                uqv uqvVar = new uqv(htvVar, vqvVar, iu30Var, function1, u380Var);
                                                x340Var2.s0(uqvVar);
                                                objT4 = uqvVar;
                                            }
                                            a90Var = new a90("remove", strO2, (Function0) objT4, (hux) null, jaxVar, (jsl) null, 88);
                                            x340Var2.r(false);
                                        } else if (u890.j(ktbVar2, ctb.a)) {
                                            x340Var2.i0(575798568);
                                            olx olxVar = olx.c;
                                            jsl jslVar2 = new jsl(cwl1.o0(x340Var2, 2131955214));
                                            boolean zI4 = x340Var2.i(vqvVar) | x340Var2.g(iu30Var2);
                                            Object objT5 = x340Var2.T();
                                            if (zI4 || objT5 == m4cVar) {
                                                objT5 = new pqv(vqvVar, iu30Var2, (byte) 4);
                                                x340Var2.s0(objT5);
                                            }
                                            a90 a90Var3 = new a90("back", (String) null, (Function0) objT5, olxVar, (max) null, jslVar2, 50);
                                            x340Var2.r(false);
                                            a90Var = a90Var3;
                                        } else if (u890.j(ktbVar2, jtb.a)) {
                                            x340Var2.i0(576198809);
                                            String strO3 = cwl1.o0(x340Var2, 2131955232);
                                            boolean zI5 = x340Var2.i(vqvVar) | x340Var2.g(iu30Var) | x340Var2.g(u380Var) | x340Var2.g(htvVar) | x340Var2.g(function1);
                                            Object objT6 = x340Var2.T();
                                            if (zI5 || objT6 == m4cVar) {
                                                uqv uqvVar2 = new uqv(vqvVar, iu30Var, u380Var, htvVar, function1);
                                                x340Var2.s0(uqvVar2);
                                                objT6 = uqvVar2;
                                            }
                                            a90Var = new a90("to_top", strO3, (Function0) objT6, (hux) null, jaxVar, (jsl) null, 88);
                                            x340Var2.r(false);
                                        } else {
                                            if (!u890.j(ktbVar2, itb.a)) {
                                                throw p3d1.k(x340Var2, -1366959288, false);
                                            }
                                            x340Var2.i0(576676581);
                                            String strO4 = cwl1.o0(x340Var2, 2131955231);
                                            boolean zI6 = x340Var2.i(vqvVar) | x340Var2.g(iu30Var) | x340Var2.g(u380Var) | x340Var2.g(function1);
                                            Object objT7 = x340Var2.T();
                                            if (zI6 || objT7 == m4cVar) {
                                                objT7 = new jzm(vqvVar, iu30Var, u380Var, function1);
                                                x340Var2.s0(objT7);
                                            }
                                            a90Var = new a90("to_bottom", strO4, (Function0) objT7, (hux) null, jaxVar, (jsl) null, 88);
                                            x340Var2.r(false);
                                        }
                                    }
                                }
                            }
                            arrayList.add(a90Var);
                            b2 = 1;
                        }
                        a90Var = a90Var2;
                        arrayList.add(a90Var);
                        b2 = 1;
                    }
                    x340Var2.r(false);
                    c380 c380VarA = mqo1.A(arrayList);
                    l90 l90Var = z ? l90.b : l90.a;
                    qim0 qim0VarF = u291.f(nim0.a, 1.0f);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    cvx cvxVar2 = cbx.b(x340Var2).b;
                    qim0 qim0VarY = uyn1.y(qim0VarF, 16.0f, 8.0f);
                    WeakHashMap weakHashMap = osl1.x;
                    m0p1.b(c380VarA, uyn1.B(qim0VarY, 0.0f, 0.0f, 0.0f, poo1.x(lhc.g(x340Var2).e, x340Var2).a(), 7), l90Var, (xtb0) null, (vzq0) null, 4, x340Var2, 196608, 24);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                this.b.a(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqv(boolean z, c380 c380Var, vqv vqvVar, htv htvVar, Function0 function0, Function0 function1, u380 u380Var, iu30 iu30Var, iu30 iu30Var2) {
        super(2);
        this.c = z;
        this.h = c380Var;
        this.b = vqvVar;
        this.d = htvVar;
        this.e = function0;
        this.f = function1;
        this.g = u380Var;
        this.i = iu30Var;
        this.t = iu30Var2;
    }
}
