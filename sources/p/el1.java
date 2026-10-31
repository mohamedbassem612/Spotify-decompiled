package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class el1 implements o1i {
    public final g7h a;
    public final s4w0 b;
    public final bcl1 c;
    public final lik1 d;
    public final tjq e;
    public final t75 f;
    public final hcl1 g;
    public final yp10 h;
    public xab1 i;

    public el1(g7h g7hVar, s4w0 s4w0Var, bcl1 bcl1Var, lik1 lik1Var, tjq tjqVar, t75 t75Var, hcl1 hcl1Var, yp10 yp10Var) {
        this.a = g7hVar;
        this.b = s4w0Var;
        this.c = bcl1Var;
        this.d = lik1Var;
        this.e = tjqVar;
        this.f = t75Var;
        this.g = hcl1Var;
        this.h = yp10Var;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void a(xk1 xk1Var, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        Observable map;
        Object dbVar;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1269525862);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(xk1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(o0iVar) : x340Var.i(o0iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            String str = xk1Var.a;
            Set set = s4b1.f;
            if (uic.g(str, blc0.de)) {
                map = this.b.b(str);
            } else {
                map = g7h.d(this.a, "", new String[]{str}).map(new oj80(this, str, (byte) 14));
                map.getClass();
            }
            ven0 ven0VarG = rwq.g(yoi1.g(map.onErrorComplete().distinctUntilChanged()), Boolean.FALSE, (o8n) null, x340Var, 48, 2);
            boolean zH = x340Var.h(((Boolean) ven0VarG.getValue()).booleanValue());
            Object objT = x340Var.T();
            if (zH || objT == m4cVar) {
                objT = new pk1(((Boolean) ven0VarG.getValue()).booleanValue() ? qk1.b : qk1.a, true, (String) null, (String) null, tk1.c, 12);
                x340Var.s0(objT);
            }
            pk1 pk1Var = (pk1) objT;
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean zI = x340Var.i(this) | (i3 == 32 || ((i2 & 64) != 0 && x340Var.i(o0iVar))) | x340Var.g(ven0VarG) | (i4 == 4);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                dbVar = new db(this, o0iVar, xk1Var, ven0VarG, (byte) 4);
                x340Var.s0(dbVar);
            } else {
                dbVar = objT2;
            }
            oto1.c(xk1Var, o0iVar, (iu30) dbVar, x340Var, i4 | 64 | i3);
            boolean zI2 = x340Var.i(this) | (i3 == 32 || ((i2 & 64) != 0 && x340Var.i(o0iVar))) | (i4 == 4) | x340Var.g(ven0VarG);
            Object objT3 = x340Var.T();
            if (zI2 || objT3 == m4cVar) {
                f80 f80Var = new f80(this, o0iVar, xk1Var, ven0VarG, (byte) 1);
                x340Var.s0(f80Var);
                objT3 = f80Var;
            }
            h7p1.a(pk1Var, new gbx(z50.c, (Function0) objT3), u291.r(qim0Var, 56.0f), (max) null, (gdx) null, x340Var, 0, 24);
            x340Var = x340Var;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l8(i, this, xk1Var, o0iVar, qim0Var, (byte) 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object d(o0i o0iVar, String str, boolean z, String str2, Function0 function0, Function0 function1, lnm lnmVar) {
        dl1 dl1Var;
        tv80 tv80Var;
        Function0 function2;
        o0i o0iVar2;
        String str3;
        Throwable th;
        Function0 function3;
        o0i o0iVar3;
        Function0 function4;
        Function0 function5;
        nj3 nj3Var;
        boolean z2;
        nj3 nj3Var2;
        boolean z3;
        yp10 yp10Var;
        if (lnmVar instanceof dl1) {
            dl1Var = (dl1) lnmVar;
            int i = dl1Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                dl1Var.h = i - Integer.MIN_VALUE;
            } else {
                dl1Var = new dl1(this, lnmVar);
            }
        } else {
            dl1Var = new dl1(this, lnmVar);
        }
        Object objJ = dl1Var.f;
        int i2 = dl1Var.h;
        if (i2 == 0) {
            hm5.M(objJ);
            tv80Var = !z ? (tv80) function0.invoke() : null;
            try {
                Single singleK = this.e.k(Collections.singletonList(str), this.d.a, z, str2, tv80Var);
                dl1Var.a = o0iVar;
                dl1Var.b = str;
                dl1Var.c = (hab0) function0;
                function2 = function1;
                try {
                    dl1Var.d = function2;
                    dl1Var.e = tv80Var;
                    dl1Var.h = 1;
                    objJ = fc11.j(singleK, dl1Var);
                    d9n d9nVar = d9n.a;
                    if (objJ == d9nVar) {
                        return d9nVar;
                    }
                    o0iVar3 = o0iVar;
                    str3 = str;
                    function4 = function0;
                    function5 = function2;
                } catch (Throwable th2) {
                    th = th2;
                    o0iVar2 = o0iVar;
                    str3 = str;
                    th = th;
                    function3 = function0;
                    nj3 m231Var = new m231(th);
                    o0iVar3 = o0iVar2;
                    function4 = function3;
                    nj3Var = m231Var;
                    function5 = function2;
                }
            } catch (Throwable th3) {
                th = th3;
                function2 = function1;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tv80 tv80Var2 = dl1Var.e;
            function5 = dl1Var.d;
            Function0 function6 = (Function0) dl1Var.c;
            String str4 = dl1Var.b;
            o0iVar3 = dl1Var.a;
            try {
                hm5.M(objJ);
                tv80Var = tv80Var2;
                function4 = function6;
                str3 = str4;
            } catch (Throwable th4) {
                tv80Var = tv80Var2;
                o0iVar2 = o0iVar3;
                th = th4;
                function3 = function6;
                str3 = str4;
                function2 = function5;
                nj3 m231Var2 = new m231(th);
                o0iVar3 = o0iVar2;
                function4 = function3;
                nj3Var = m231Var2;
                function5 = function2;
                z2 = nj3Var instanceof m231;
                if (!z2) {
                    nj3Var2 = z2 ? null : nj3Var;
                    z3 = nj3Var2 instanceof kj3;
                    yp10Var = this.h;
                    if (z3) {
                        if (tv80Var == null) {
                            function4.invoke();
                        }
                        function5.invoke();
                        yp10Var.a(2, Collections.singletonMap("itemUri", str3));
                    } else if (nj3Var2 instanceof lj3) {
                        bcl1.f(this.c, o0iVar3.e, "add_to_collection_button", str3, (String) null, new cl1(false, str3, (byte) 0), 8);
                        yp10Var.a(3, Collections.singletonMap("itemUri", str3));
                    } else if (nj3Var2 instanceof mj3) {
                        bcl1.f(this.c, o0iVar3.e, "add_to_collection_button", str3, (String) null, uh1.Z, 8);
                    }
                }
                return rih1.a;
            }
        }
        try {
            nj3Var = (nj3) objJ;
        } catch (Throwable th5) {
            o0i o0iVar4 = o0iVar3;
            th = th5;
            function3 = function4;
            o0iVar2 = o0iVar4;
            function2 = function5;
            nj3 m231Var3 = new m231(th);
            o0iVar3 = o0iVar2;
            function4 = function3;
            nj3Var = m231Var3;
            function5 = function2;
        }
        z2 = nj3Var instanceof m231;
        if (!z2) {
            nj3Var2 = z2 ? null : nj3Var;
            z3 = nj3Var2 instanceof kj3;
            yp10Var = this.h;
            if (z3) {
                if (tv80Var == null) {
                    function4.invoke();
                }
                function5.invoke();
                yp10Var.a(2, Collections.singletonMap("itemUri", str3));
            } else if (nj3Var2 instanceof lj3) {
                bcl1.f(this.c, o0iVar3.e, "add_to_collection_button", str3, (String) null, new cl1(false, str3, (byte) 0), 8);
                yp10Var.a(3, Collections.singletonMap("itemUri", str3));
            } else if (nj3Var2 instanceof mj3) {
                bcl1.f(this.c, o0iVar3.e, "add_to_collection_button", str3, (String) null, uh1.Z, 8);
            }
        }
        return rih1.a;
    }
}
