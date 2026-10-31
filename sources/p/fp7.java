package p;

import android.content.Context;
import android.net.Uri;
import com.spotify.mobius.functions.Function;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fp7 implements Function {
    public final Context a;
    public boolean b;

    public /* synthetic */ fp7(Context context, boolean z) {
        this.a = context;
        this.b = z;
    }

    public static uvx m(b0k b0kVar) {
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(b0kVar).b;
        x340 x340Var = (x340) b0kVar;
        boolean zD = x340Var.d(4.0f);
        Object objT = x340Var.T();
        if (zD || objT == fkj0.X) {
            uvx uvxVar = new uvx(1, null, 3, null, uyn1.h(2, 4.0f, 0.0f), null, null, 0, null, 490);
            x340Var.s0(uvxVar);
            objT = uvxVar;
        }
        return (uvx) objT;
    }

    public void a(String str, Float f, String str2, int i, xu30 xu30Var, qim0 qim0Var, b0k b0kVar, int i2) throws Throwable {
        Float f2;
        Throwable th;
        ven0 ven0Var;
        String str3;
        boolean z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(557072293);
        int i3 = i2 | (x340Var.g(str) ? 4 : 2) | (x340Var.g(f) ? 32 : 16) | (x340Var.g(str2) ? 256 : 128) | (x340Var.e(i == 0 ? -1 : l1d.C(i)) ? 2048 : 1024) | (x340Var.i(xu30Var) ? 16384 : 8192) | (x340Var.g(qim0Var) ? 131072 : 65536);
        if (x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(z6x.a);
                x340Var.s0(objT);
            }
            ven0 ven0Var2 = (ven0) objT;
            boolean z2 = ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                f2 = f;
                th = null;
                hb1 hb1Var = new hb1(ven0Var2, f2, str, (lnm) null, (byte) 20);
                ven0Var = ven0Var2;
                str3 = str;
                x340Var.s0(hb1Var);
                objT2 = hb1Var;
            } else {
                str3 = str;
                f2 = f;
                th = null;
                ven0Var = ven0Var2;
            }
            qxd0.s(str3, f2, (vu30) objT2, x340Var);
            era eraVar = een.P0;
            mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            Throwable th2 = th;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw th2;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            boolean zY0 = ihc1.y0(str2);
            nim0 nim0Var = nim0.a;
            if (zY0) {
                z = true;
                x340Var.i0(148343751);
                x340Var.r(false);
            } else {
                x340Var.i0(148068657);
                cjc0 cjc0Var = new cjc0(2);
                uwr uwrVar = cbx.a;
                z = true;
                uwo1.e(str2, anm1.N("audio_book_row_body", nim0Var), cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 2, false, cjc0Var, 0, (qx8) null, x340Var, ((i3 >> 6) & 14) | 1572912, 0, 1712);
                x340Var = x340Var;
                x340Var.r(false);
            }
            qim0 qim0VarB = uyn1.B(u291.f(nim0Var, 1.0f), 0.0f, !ihc1.y0(str2) ? 4.0f : 0.0f, 0.0f, 0.0f, 13);
            uwr uwrVar2 = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            k5p1.d(qim0VarB, new d36(4.0f, z, new g21(eraVar, (byte) 29)), (g36) null, (pl3) null, 0, 0, apo.r(2128990784, new xo7(i, f2, ven0Var, xu30Var, (byte) 0), x340Var), x340Var, 1572864, 60);
            x340Var.r(z);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wc0(this, str, f, str2, i, xu30Var, qim0Var, i2);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    public java.lang.Object apply(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r29v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    public void b(int i, boolean z, xu30 xu30Var, xu30 xu30Var2, xu30 xu30Var3, xu30 xu30Var4, xu30 xu30Var5, xu30 xu30Var6, boolean z2, b0k b0kVar, int i2) {
        xu30 xu30Var7;
        boolean z3;
        h2c h2cVar;
        boolean z4;
        boolean z5;
        h2c h2cVar2;
        xu30 xu30Var8 = xu30Var;
        xu30 xu30Var9 = xu30Var4;
        gra graVar = een.d;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(959075750);
        j06 j06Var = x340Var.a;
        int i3 = i2 | (x340Var.e(l1d.C(i)) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.i(xu30Var8) ? 256 : 128) | (x340Var.i(xu30Var2) ? 2048 : 1024) | (x340Var.i(xu30Var3) ? 16384 : 8192) | (x340Var.i(xu30Var9) ? 131072 : 65536) | (x340Var.i(xu30Var5) ? 1048576 : 524288) | (x340Var.i(xu30Var6) ? 8388608 : 4194304) | (x340Var.h(z2) ? 67108864 : 33554432);
        if (x340Var.Y(i3 & 1, (38347923 & i3) != 38347922)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z6 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z6) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarD = u291.d(qim0Var, 1.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 48);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarD);
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            h2c h2cVar3 = h2c.a;
            if (z2) {
                x340Var.i0(-1719439012);
                if (1.0f <= 0.0d) {
                    of80.a("invalid weight; must be greater than zero");
                }
                op71.g(x340Var, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                if (xu30Var6 != null) {
                    x340Var.i0(-1719362907);
                    qim0 qim0VarN = anm1.N("audio_book_row_context_menu_button", qim0Var);
                    gfh0 gfh0VarC = t1c.c(graVar, false);
                    int iHashCode3 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM3 = x340Var.m();
                    qim0 qim0VarE3 = zr7.E(x340Var, qim0VarN);
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC, x340Var, lljVar);
                    nko1.H(xos0VarM3, x340Var, lljVar2);
                    x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE3, x340Var, lljVar4);
                    h2cVar2 = h2cVar3;
                    hrt.k(6 | ((i3 >> 18) & 112), xu30Var6, h2cVar2, x340Var, true);
                    z4 = false;
                    x340Var.r(false);
                } else {
                    h2cVar2 = h2cVar3;
                    z4 = false;
                    x340Var.i0(-1719254314);
                    x340Var.r(false);
                }
                if (xu30Var3 != null) {
                    x340Var.i0(-1719214510);
                    qim0 qim0VarN2 = anm1.N("audio_book_row_share_button", qim0Var);
                    gfh0 gfh0VarC2 = t1c.c(graVar, z4);
                    int iHashCode4 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM4 = x340Var.m();
                    qim0 qim0VarE4 = zr7.E(x340Var, qim0VarN2);
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var, lljVar);
                    nko1.H(xos0VarM4, x340Var, lljVar2);
                    x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE4, x340Var, lljVar4);
                    hrt.k(6 | ((i3 >> 9) & 112), xu30Var3, h2cVar2, x340Var, true);
                    z4 = false;
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1719118410);
                    x340Var.r(z4);
                }
                if (xu30Var5 != null) {
                    x340Var.i0(-1719075444);
                    qim0 qim0VarN3 = anm1.N("audio_book_row_download_button", qim0Var);
                    gfh0 gfh0VarC3 = t1c.c(graVar, z4);
                    int iHashCode5 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM5 = x340Var.m();
                    qim0 qim0VarE5 = zr7.E(x340Var, qim0VarN3);
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC3, x340Var, lljVar);
                    nko1.H(xos0VarM5, x340Var, lljVar2);
                    x0d.q(iHashCode5, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE5, x340Var, lljVar4);
                    hrt.k(6 | ((i3 >> 15) & 112), xu30Var5, h2cVar2, x340Var, true);
                    z4 = false;
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1718973578);
                    x340Var.r(z4);
                }
                if (xu30Var2 != null) {
                    x340Var.i0(-1718933836);
                    qim0 qim0VarN4 = anm1.N("audio_book_row_add_button", qim0Var);
                    gfh0 gfh0VarC4 = t1c.c(graVar, z4);
                    int iHashCode6 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM6 = x340Var.m();
                    qim0 qim0VarE6 = zr7.E(x340Var, qim0VarN4);
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC4, x340Var, lljVar);
                    nko1.H(xos0VarM6, x340Var, lljVar2);
                    x0d.q(iHashCode6, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE6, x340Var, lljVar4);
                    xu30Var7 = xu30Var2;
                    hrt.k(6 | ((i3 >> 6) & 112), xu30Var7, h2cVar2, x340Var, true);
                    z4 = false;
                    x340Var.r(false);
                } else {
                    xu30Var7 = xu30Var2;
                    x340Var.i0(-1718839658);
                    x340Var.r(z4);
                }
                x340Var.r(z4);
                h2cVar = h2cVar2;
            } else {
                qim0Var = qim0Var;
                xu30Var7 = xu30Var2;
                x340Var.i0(-1718804132);
                if (xu30Var7 != null) {
                    x340Var.i0(-1718783052);
                    qim0 qim0VarN5 = anm1.N("audio_book_row_add_button", qim0Var);
                    gfh0 gfh0VarC5 = t1c.c(graVar, false);
                    int iHashCode7 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM7 = x340Var.m();
                    qim0 qim0VarE7 = zr7.E(x340Var, qim0VarN5);
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC5, x340Var, lljVar);
                    nko1.H(xos0VarM7, x340Var, lljVar2);
                    x0d.q(iHashCode7, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE7, x340Var, lljVar4);
                    hrt.k(6 | ((i3 >> 6) & 112), xu30Var7, h2cVar3, x340Var, true);
                    z3 = false;
                    x340Var.r(false);
                } else {
                    z3 = false;
                    x340Var.i0(-1718688874);
                    x340Var.r(false);
                }
                if (xu30Var5 != null) {
                    x340Var.i0(-1718645908);
                    qim0 qim0VarN6 = anm1.N("audio_book_row_download_button", qim0Var);
                    gfh0 gfh0VarC6 = t1c.c(graVar, z3);
                    int iHashCode8 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM8 = x340Var.m();
                    qim0 qim0VarE8 = zr7.E(x340Var, qim0VarN6);
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC6, x340Var, lljVar);
                    nko1.H(xos0VarM8, x340Var, lljVar2);
                    x0d.q(iHashCode8, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE8, x340Var, lljVar4);
                    h2cVar = h2cVar3;
                    hrt.k(6 | ((i3 >> 15) & 112), xu30Var5, h2cVar, x340Var, true);
                    z3 = false;
                    x340Var.r(false);
                } else {
                    h2cVar = h2cVar3;
                    x340Var.i0(-1718544042);
                    x340Var.r(z3);
                }
                if (xu30Var3 != null) {
                    x340Var.i0(-1718504238);
                    qim0 qim0VarN7 = anm1.N("audio_book_row_share_button", qim0Var);
                    gfh0 gfh0VarC7 = t1c.c(graVar, z3);
                    int iHashCode9 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM9 = x340Var.m();
                    qim0 qim0VarE9 = zr7.E(x340Var, qim0VarN7);
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC7, x340Var, lljVar);
                    nko1.H(xos0VarM9, x340Var, lljVar2);
                    x0d.q(iHashCode9, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE9, x340Var, lljVar4);
                    hrt.k(6 | ((i3 >> 9) & 112), xu30Var3, h2cVar, x340Var, true);
                    z3 = false;
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1718408138);
                    x340Var.r(z3);
                }
                if (xu30Var6 != null) {
                    x340Var.i0(-1718361979);
                    qim0 qim0VarN8 = anm1.N("audio_book_row_context_menu_button", qim0Var);
                    gfh0 gfh0VarC8 = t1c.c(graVar, z3);
                    int iHashCode10 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM10 = x340Var.m();
                    qim0 qim0VarE10 = zr7.E(x340Var, qim0VarN8);
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC8, x340Var, lljVar);
                    nko1.H(xos0VarM10, x340Var, lljVar2);
                    x0d.q(iHashCode10, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE10, x340Var, lljVar4);
                    hrt.k(6 | ((i3 >> 18) & 112), xu30Var6, h2cVar, x340Var, true);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1718253386);
                    x340Var.r(z3);
                }
                if (1.0f <= 0.0d) {
                    of80.a("invalid weight; must be greater than zero");
                }
                op71.g(x340Var, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                z4 = false;
                x340Var.r(false);
            }
            if (xu30Var4 != null) {
                x340Var.i0(-1718155054);
                qim0 qim0VarN9 = anm1.N("audio_book_row_profile_button", qim0Var);
                gfh0 gfh0VarC9 = t1c.c(graVar, z4);
                int iHashCode11 = Long.hashCode(x340Var.T);
                xos0 xos0VarM11 = x340Var.m();
                qim0 qim0VarE11 = zr7.E(x340Var, qim0VarN9);
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC9, x340Var, lljVar);
                nko1.H(xos0VarM11, x340Var, lljVar2);
                x0d.q(iHashCode11, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE11, x340Var, lljVar4);
                xu30Var9 = xu30Var4;
                hrt.k(6 | ((i3 >> 12) & 112), xu30Var9, h2cVar, x340Var, true);
                z4 = false;
                x340Var.r(false);
            } else {
                xu30Var9 = xu30Var4;
                x340Var.i0(-1718058954);
                x340Var.r(z4);
            }
            if (xu30Var != null) {
                x340Var.i0(-1718018251);
                qim0 qim0VarN10 = anm1.N("audio_book_row_play_button", pqo.h(qim0Var, i == 2 ? true : z4));
                gfh0 gfh0VarC10 = t1c.c(graVar, z4);
                int iHashCode12 = Long.hashCode(x340Var.T);
                xos0 xos0VarM12 = x340Var.m();
                qim0 qim0VarE12 = zr7.E(x340Var, qim0VarN10);
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC10, x340Var, lljVar);
                nko1.H(xos0VarM12, x340Var, lljVar2);
                x0d.q(iHashCode12, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE12, x340Var, lljVar4);
                xu30Var8 = xu30Var;
                z5 = true;
                hrt.k(6 | ((i3 >> 3) & 112), xu30Var8, h2cVar, x340Var, true);
                x340Var.r(false);
            } else {
                boolean z7 = z4;
                z5 = true;
                xu30Var8 = xu30Var;
                x340Var.i0(-1717802026);
                x340Var.r(z7);
            }
            x340Var.r(z5);
            if (z) {
                x340Var.i0(-2083629337);
                qim0 qim0VarH = u291.h(uyn1.y(u291.f(qim0Var, 1.0f), 8.0f, 4.0f), 1.0f);
                uwr uwrVar = cbx.a;
                t1c.a(anm1.N("audio_book_row_bottom_divider", dug.f(qim0VarH, cbx.a(x340Var).b.b, d4o1.a).then(new tq60(een.Q0))), x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(-2083311246);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            xu30Var7 = xu30Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yo7(this, i, z, xu30Var8, xu30Var7, xu30Var3, xu30Var9, xu30Var5, xu30Var6, z2, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:158:0x025a  */
    /* JADX WARN: Code duplicated, block: B:165:0x026c  */
    /* JADX WARN: Code duplicated, block: B:167:0x0272  */
    /* JADX WARN: Code duplicated, block: B:168:0x0274  */
    /* JADX WARN: Code duplicated, block: B:198:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:201:0x0300  */
    /* JADX WARN: Code duplicated, block: B:212:0x032d  */
    /* JADX WARN: Code duplicated, block: B:215:0x033f  */
    /* JADX WARN: Code duplicated, block: B:216:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:218:0x03f4  */
    public void c(dob1 dob1Var, k8e0 k8e0Var, iu30 iu30Var, xu30 xu30Var, xu30 xu30Var2, xu30 xu30Var3, xu30 xu30Var4, xu30 xu30Var5, xu30 xu30Var6, xu30 xu30Var7, xu30 xu30Var8, xu30 xu30Var9, xu30 xu30Var10, b0k b0kVar, int i) {
        int i2;
        xu30 xu30Var11;
        b0k b0kVar2;
        int i3;
        Object next;
        int i4;
        String str;
        int i5;
        boolean z;
        Object objT;
        Function0 function0;
        gbx gbxVar;
        int i6;
        String strO0;
        boolean z2;
        Object objT2;
        Function0 function1;
        fp7 fp7Var = this;
        m4c m4cVar = fkj0.X;
        tu00 tu00Var = k8e0Var.l;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(709377580);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? b0kVar3.g(dob1Var) : b0kVar3.i(dob1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(k8e0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(xu30Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            xu30Var11 = xu30Var2;
            i2 |= b0kVar3.i(xu30Var11) ? 16384 : 8192;
        } else {
            xu30Var11 = xu30Var2;
        }
        if ((i & 196608) == 0) {
            i2 |= b0kVar3.i(xu30Var3) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= b0kVar3.i(xu30Var4) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= b0kVar3.i(xu30Var5) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= b0kVar3.i(xu30Var6) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= b0kVar3.i(xu30Var7) ? 536870912 : 268435456;
        }
        int i7 = i2;
        int i8 = (b0kVar3.i(xu30Var8) ? 4 : 2) | (b0kVar3.i(xu30Var9) ? 32 : 16) | (b0kVar3.i(xu30Var10) ? 256 : 128) | (b0kVar3.i(fp7Var) ? 2048 : 1024);
        if (b0kVar3.Y(i7 & 1, ((i7 & 306783379) == 306783378 && (i8 & 1171) == 1170) ? false : true)) {
            v6v0 v6v0VarA = tu00Var.a(v6v0.class);
            boolean zG = b0kVar3.g(tu00Var);
            Object objT3 = b0kVar3.T();
            if (zG || objT3 == m4cVar) {
                objT3 = (zc8) tu00Var.a(zc8.class);
                b0kVar3.s0(objT3);
            }
            zc8 zc8Var = (zc8) objT3;
            boolean zG2 = b0kVar3.g(tu00Var);
            Object objT4 = b0kVar3.T();
            if (zG2 || objT4 == m4cVar) {
                objT4 = (va81) tu00Var.a(va81.class);
                b0kVar3.s0(objT4);
            }
            va81 va81Var = (va81) objT4;
            boolean zG3 = b0kVar3.g(tu00Var);
            Object objT5 = b0kVar3.T();
            if (zG3 || objT5 == m4cVar) {
                objT5 = (den) tu00Var.a(den.class);
                b0kVar3.s0(objT5);
            }
            den denVar = (den) objT5;
            boolean zG4 = b0kVar3.g(tu00Var);
            Object objT6 = b0kVar3.T();
            if (zG4 || objT6 == m4cVar) {
                l98 l98VarA = tu00Var.a(l98.class);
                if (l98VarA != null) {
                    Iterator it = l98VarA.a.iterator();
                    if (it.hasNext()) {
                        next = it.next();
                        if (it.hasNext()) {
                            int i9 = ((k98) next).c;
                            while (true) {
                                Object next2 = it.next();
                                i3 = i8;
                                int i10 = ((k98) next2).c;
                                if (i9 > i10) {
                                    i9 = i10;
                                    next = next2;
                                }
                                if (!it.hasNext()) {
                                    break;
                                } else {
                                    i8 = i3;
                                }
                            }
                        } else {
                            i3 = i8;
                        }
                    } else {
                        i3 = i8;
                        next = null;
                    }
                    k98 k98Var = (k98) next;
                    if (k98Var != null) {
                        objT6 = k98Var.a;
                    }
                    b0kVar3.s0(objT6);
                } else {
                    i3 = i8;
                }
                objT6 = null;
                b0kVar3.s0(objT6);
            } else {
                i3 = i8;
            }
            String str2 = (String) objT6;
            boolean zG5 = b0kVar3.g(tu00Var);
            Object objT7 = b0kVar3.T();
            if (zG5 || objT7 == m4cVar) {
                objT7 = (w281) tu00Var.a(w281.class);
                b0kVar3.s0(objT7);
            }
            w281 w281Var = (w281) objT7;
            boolean zG6 = b0kVar3.g(tu00Var);
            Object objT8 = b0kVar3.T();
            if (zG6 || objT8 == m4cVar) {
                objT8 = (z070) tu00Var.a(z070.class);
                b0kVar3.s0(objT8);
            }
            z070 z070Var = (z070) objT8;
            i7e0 i7e0Var = dob1Var.a;
            if (!dob1Var.b) {
                if (!u890.j(i7e0Var instanceof k8e0 ? ((k8e0) i7e0Var).m : null, iwp0.c)) {
                    i4 = 4;
                } else if (!(i7e0Var instanceof k8e0)) {
                    if (tro1.s(i7e0Var)) {
                        i4 = 1;
                    } else {
                        i4 = 2;
                    }
                } else if (tro1.s(i7e0Var)) {
                    i4 = 2;
                } else {
                    i4 = 1;
                }
            } else if (!(i7e0Var instanceof k8e0) && ((k8e0) i7e0Var).j == 2 && dob1Var.e) {
                i4 = 3;
            } else if (tro1.s(i7e0Var)) {
                i4 = 2;
            } else {
                i4 = 1;
            }
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            int i11 = 1;
            if (i4 != 1) {
                qim0VarF = s161.b(qim0VarF, false, new ym(fp7Var, i4, (byte) 5));
                i11 = 1;
            }
            if (i4 == i11) {
                str = "ENABLED";
            } else if (i4 == 2) {
                str = "DISABLED";
            } else if (i4 != 3) {
                str = i4 != 4 ? "null" : "DISABLED_NOT_AVAILABLE_OFFLINE";
            } else {
                str = "DISABLED_EXPLICIT";
            }
            qim0 qim0VarN = anm1.N("audio_book_row_enabled_state_".concat(str), qim0VarF);
            uvx uvxVarM = m(b0kVar3);
            int i12 = ((i7 >> 6) & 14) | ((i3 >> 6) & 112);
            String strO1 = cwl1.o0(b0kVar3, 2131952607);
            int i13 = (i12 & 14) ^ 6;
            if (i13 <= 4 || !b0kVar3.g(iu30Var)) {
                i5 = i12;
                if ((i5 & 6) != 4) {
                    z = false;
                }
                objT = b0kVar3.T();
                if (z || objT == m4cVar) {
                    objT = new ge3(iu30Var, (byte) 26);
                    b0kVar3.s0(objT);
                }
                function0 = (Function0) objT;
                if (!ihc1.y0(strO1)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                i6 = i4;
                gbxVar = new gbx(new y50(strO1), function0);
                strO0 = cwl1.o0(b0kVar3, 2131952607);
                z2 = (i13 <= 4 && b0kVar3.g(iu30Var)) || (i5 & 6) == 4;
                objT2 = b0kVar3.T();
                if (z2 || objT2 == m4cVar) {
                    objT2 = new ge3(iu30Var, (byte) 27);
                    b0kVar3.s0(objT2);
                }
                function1 = (Function0) objT2;
                if (!ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                } else {
                    fp7Var = this;
                    b0kVar2 = b0kVar3;
                    jto1.b(qim0VarN, uvxVarM, (max) null, false, (idn0) null, (ga80) null, gbxVar, new gbx(new y50(strO0), function1), xu30Var, apo.r(-1658943331, new xo7(i6, denVar, va81Var, this, (byte) 1), b0kVar3), apo.r(-468295395, new xo7(i6, va81Var, this, w281Var, (byte) 2), b0kVar3), apo.r(-1995499490, new zo7(i6, zc8Var, this, (byte) 0), b0kVar3), (xu30) null, apo.r(-754940384, new ap7(this, v6v0VarA, k8e0Var, i6, xu30Var3, z070Var, va81Var, str2, xu30Var10, xu30Var11), b0kVar3), apo.r(2012822817, new ap7(xu30Var3, k8e0Var, this, i6, xu30Var4, xu30Var5, xu30Var6, xu30Var7, xu30Var8, xu30Var9), b0kVar3), apo.r(485618722, new xo7(dob1Var, zc8Var, i6, fp7Var), b0kVar3), b0kVar2, 805306432 | ((i7 << 15) & 234881024), 224310, 4156);
                }
            } else {
                i5 = i12;
            }
            z = true;
            objT = b0kVar3.T();
            if (z) {
                objT = new ge3(iu30Var, (byte) 26);
                b0kVar3.s0(objT);
            } else {
                objT = new ge3(iu30Var, (byte) 26);
                b0kVar3.s0(objT);
            }
            function0 = (Function0) objT;
            if (!ihc1.y0(strO1)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            i6 = i4;
            gbxVar = new gbx(new y50(strO1), function0);
            strO0 = cwl1.o0(b0kVar3, 2131952607);
            if (i13 <= 4) {
            }
            objT2 = b0kVar3.T();
            if (z2) {
                objT2 = new ge3(iu30Var, (byte) 27);
                b0kVar3.s0(objT2);
            } else {
                objT2 = new ge3(iu30Var, (byte) 27);
                b0kVar3.s0(objT2);
            }
            function1 = (Function0) objT2;
            if (!ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                fp7Var = this;
                b0kVar2 = b0kVar3;
                jto1.b(qim0VarN, uvxVarM, (max) null, false, (idn0) null, (ga80) null, gbxVar, new gbx(new y50(strO0), function1), xu30Var, apo.r(-1658943331, new xo7(i6, denVar, va81Var, this, (byte) 1), b0kVar3), apo.r(-468295395, new xo7(i6, va81Var, this, w281Var, (byte) 2), b0kVar3), apo.r(-1995499490, new zo7(i6, zc8Var, this, (byte) 0), b0kVar3), (xu30) null, apo.r(-754940384, new ap7(this, v6v0VarA, k8e0Var, i6, xu30Var3, z070Var, va81Var, str2, xu30Var10, xu30Var11), b0kVar3), apo.r(2012822817, new ap7(xu30Var3, k8e0Var, this, i6, xu30Var4, xu30Var5, xu30Var6, xu30Var7, xu30Var8, xu30Var9), b0kVar3), apo.r(485618722, new xo7(dob1Var, zc8Var, i6, fp7Var), b0kVar3), b0kVar2, 805306432 | ((i7 << 15) & 234881024), 224310, 4156);
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bp7(fp7Var, dob1Var, k8e0Var, iu30Var, xu30Var, xu30Var2, xu30Var3, xu30Var4, xu30Var5, xu30Var6, xu30Var7, xu30Var8, xu30Var9, xu30Var10, i);
        }
    }

    public void d(b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1105308849);
        int i2 = (b0kVar3.i(this) ? 4 : 2) | i;
        if (b0kVar3.Y(i2 & 1, (i2 & 3) != 2)) {
            b0kVar2 = b0kVar3;
            jto1.b(anm1.N("audio_book_row_loading", u291.f(nim0.a, 1.0f)), m(b0kVar3), (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, apo.r(248955944, new cp7(this, (byte) 0), b0kVar3), apo.r(519814312, new cp7(this, (byte) 1), b0kVar3), apo.r(1098580457, new cp7(this, (byte) 2), b0kVar3), (xu30) null, apo.r(-2038854549, new cp7(this, (byte) 3), b0kVar3), apo.r(-1460088404, new cp7(this, (byte) 4), b0kVar3), apo.r(-881322259, new cp7(this, (byte) 5), b0kVar3), b0kVar2, 805306438, 224310, 4604);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new mu6(this, i, (byte) 8);
        }
    }

    public void e(int i, String str, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(906741965);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.g(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            as80 as80Var = mif1.P0;
            Uri uri = str != null ? Uri.parse(str) : Uri.EMPTY;
            uri.getClass();
            fwx fwxVarE = hso1.E(2131232444, 0L, true, 0L, x340Var, 384, 10);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            cso1.d(uri, isl.a, xcg1.k(cbx.a, i1p1.q(qim0Var, er31.b(4.0f))), as80Var, fwxVarE, (jmr0) null, (tl3) null, x340Var, 35888, 224);
            x340Var = x340Var;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dp7(this, str, qim0Var, i, (byte) 0);
        }
    }

    public void f(int i, String str, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-806780544);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(qim0Var) ? 32 : 16);
        if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.b0();
        } else if (str == null) {
            x340Var.i0(-162112141);
            x340Var.r(false);
        } else {
            x340Var.i0(-162112140);
            cjc0 cjc0Var = new cjc0(1);
            uwr uwrVar = cbx.a;
            uwo1.e(str, anm1.N("audio_book_row_pre_title", qim0Var), (lee1) null, cbx.a(x340Var).b.c, (a0e1) null, (iu30) null, 2, false, cjc0Var, 0, (qx8) null, x340Var, 1572864, 0, 1716);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dp7(this, str, qim0Var, i, (byte) 1);
        }
    }

    public void g(float f, float f2, float f3, b0k b0kVar, int i, int i2) {
        float f4;
        int i3;
        float f5;
        float f6;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1109517167);
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 = i | 384;
            f4 = f3;
        } else if ((i & 384) == 0) {
            f4 = f3;
            i3 = (x340Var.d(f4) ? 256 : 128) | i;
        } else {
            f4 = f3;
            i3 = i;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            float f7 = i4 != 0 ? 0.0f : f4;
            f5 = f2;
            qim0 qim0VarN = anm1.N("audio_book_row_shimmer_box", uyn1.B(u291.h(u291.v(nim0.a, f), f5), 0.0f, f7, 0.0f, 0.0f, 13));
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.b.a();
            cua cuaVar = cbx.b(x340Var).f;
            t1c.a(cwl1.l0(dug.f(qim0VarN, jA, er31.b(4.0f)), 0L, (hw61) null, 15), x340Var, 0);
            f6 = f7;
        } else {
            f5 = f2;
            x340Var.b0();
            f6 = f4;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ep7(this, f, f5, f6, i, i2, (byte) 0);
        }
    }

    public void h(c380 c380Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(782768872);
        int i2 = i | (x340Var.g(c380Var) ? 4 : 2) | (x340Var.g(qim0Var) ? 32 : 16) | (x340Var.i(this) ? 256 : 128);
        if (!x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.b0();
        } else if (c380Var != null) {
            x340Var.i0(2090131648);
            int i3 = i2 >> 3;
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 48);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            i(o7h.y0(c380Var, ", ", (String) null, (String) null, (iu30) null, 62), x340Var, i3 & 112);
            x340Var.r(true);
            x340Var.r(false);
        } else {
            x340Var.i0(2090285594);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zt6(this, c380Var, qim0Var, i, (byte) 4);
        }
    }

    public void i(String str, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1102115335);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwo1.e(xcg1.i(cwl1.o0(x340Var, 2131952608), " • ", str), anm1.N("audio_book_row_subtitle", nim0.a), (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var, 1572912, 0, 1724);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g90(this, str, i, (byte) 17);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void j(int i, int i2, String str, b0k b0kVar, qim0 qim0Var) throws NoWhenBranchMatchedException {
        qim0 qim0Var2;
        long j;
        zkt0 zkt0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1495317130);
        int i3 = i2 | (x340Var.g(str) ? 4 : 2) | (x340Var.e(l1d.C(i)) ? 32 : 16) | (x340Var.g(qim0Var) ? 256 : 128);
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 48);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            qim0 qim0Var3 = nim0.a;
            if (i != 3) {
                x340Var.i0(204934712);
                int iC = l1d.C(i);
                if (iC == 0) {
                    zkt0Var = zkt0.a;
                } else if (iC == 1) {
                    zkt0Var = zkt0.b;
                } else {
                    if (iC != 2) {
                        eg.o();
                        return;
                    }
                    zkt0Var = zkt0.c;
                }
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                qim0 qim0VarB = uyn1.B(qim0Var3, 0.0f, 0.0f, 4.0f, 0.0f, 11);
                zov0 zov0Var = cbx.b(x340Var).g;
                zkt0 zkt0Var2 = zkt0Var;
                qim0Var2 = qim0Var3;
                wkt0.a(zkt0Var2, anm1.N("audio_book_row_play_indicator", u291.r(qim0VarB, 12.0f)), (ksl) null, 0L, false, x340Var, 0, 28);
                x340Var.r(false);
            } else {
                qim0Var2 = qim0Var3;
                x340Var.i0(205430588);
                x340Var.r(false);
            }
            cjc0 cjc0Var = new cjc0(2);
            qim0 qim0VarN = anm1.N("audio_book_row_title", qim0Var2);
            int iC2 = l1d.C(i);
            if (iC2 == 0) {
                x340Var.i0(976471186);
                uwr uwrVar2 = cbx.a;
                j = cbx.a(x340Var).b.c;
                x340Var.r(false);
            } else if (iC2 == 1) {
                x340Var.i0(976468850);
                uwr uwrVar3 = cbx.a;
                j = cbx.a(x340Var).b.c;
                x340Var.r(false);
            } else {
                if (iC2 != 2) {
                    throw p3d1.k(x340Var, 976464595, false);
                }
                x340Var.i0(976466794);
                uwr uwrVar4 = cbx.a;
                j = cbx.a(x340Var).b.a;
                x340Var.r(false);
            }
            uwo1.e(str, qim0VarN, (lee1) null, j, (a0e1) null, (iu30) null, 2, false, cjc0Var, 0, (qx8) null, x340Var, (i3 & 14) | 1572912, 0, 1716);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xx(this, str, i, qim0Var, i2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x0073  */
    public String k(String str) {
        String string;
        Context context = this.a;
        if (str != null) {
            switch (str) {
                case "SINGLE":
                    string = context.getString(2131952199);
                    break;
                case "AUDIOBOOK":
                    string = context.getString(2131952195);
                    break;
                case "EP":
                    string = context.getString(2131952197);
                    break;
                case "ALBUM":
                    string = context.getString(2131952194);
                    break;
                case "COMPILATION":
                    string = context.getString(2131952196);
                    break;
                case "PODCAST":
                    string = context.getString(2131952198);
                    break;
                default:
                    string = context.getString(2131952194);
                    break;
            }
        } else {
            string = context.getString(2131952194);
        }
        string.getClass();
        return string;
    }

    public k7s l() {
        dm5.y(!this.b);
        k7s k7sVar = new k7s(this);
        this.b = true;
        return k7sVar;
    }

    public fp7(Context context) {
        this.a = context;
        int i = k7s.b;
    }
}
