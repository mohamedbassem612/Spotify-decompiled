package p;

import io.reactivex.rxjava3.core.Single;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fmg implements xpw {
    public final ia00 X;
    public final oai1 a;
    public final f7i0 b;
    public final imm1 c;
    public final oj3 d;
    public final dma1 e;
    public final tbr0 f;
    public final String g;
    public final bp9 h;
    public final ljm0 i;
    public final psw t;

    public fmg(oai1 oai1Var, f7i0 f7i0Var, imm1 imm1Var, oj3 oj3Var, dma1 dma1Var, tbr0 tbr0Var, String str, bp9 bp9Var) {
        this.a = oai1Var;
        this.b = f7i0Var;
        this.c = imm1Var;
        this.d = oj3Var;
        this.e = dma1Var;
        this.f = tbr0Var;
        this.g = str;
        this.h = bp9Var;
        fns fnsVar = igu.a;
        bs50 bs50Var = pyf0.a;
        syf syfVar = new syf(this, (byte) 12);
        j2i j2iVar = new j2i(171105184, new sw1(this, (byte) 5), true);
        xas xasVar = new xas();
        xasVar.a(tzf.N0, eqe.d1);
        this.i = new ljm0(xasVar, syfVar, bs50Var, j2iVar);
        j2i j2iVar2 = new j2i(-1439698808, new gtd(this, (byte) 26), true);
        ien0 ien0Var = qsw.a;
        this.t = new psw(j2iVar2, (byte) 0);
        this.X = n3o1.q(this).a(r0f.N0, r0f.O0);
    }

    public final rqw a() {
        return this.X;
    }

    public final jsw c() {
        return this.t;
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v5 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public final void e(boolean r24, boolean r25, boolean r26, boolean r27, boolean r28, boolean r29, boolean r30, p.iu30 r31, p.b0k r32, int r33) {
        /*
            Method dump skipped, instruction units count: 804
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.fmg.e(boolean, boolean, boolean, boolean, boolean, boolean, boolean, p.iu30, p.b0k, int):void");
    }

    public final void f(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1357664069);
        int i2 = i & 1;
        if (x340Var.Y(i2, i2 != 0)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = nyf.t;
                x340Var.s0(objT);
            }
            anm1.a((Function0) objT, new i3u(3, false, false, false), vci.d, x340Var, 390, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new du0(this, i, (byte) 12);
        }
    }

    public final void g(int i, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-245742784);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? 256 : 128;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            gbx gbxVar = new gbx(z50.c, function0);
            jdx jdxVar = jdx.c;
            gdx gdxVarR = yla.r(b0kVar3);
            uwr uwrVar = cbx.a;
            float f = cbx.b(b0kVar3).b.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            b0kVar2 = b0kVar3;
            foo1.c(gbxVar, jdxVar, anm1.N("preview_button", qim0Var), (max) null, gdxVarR, new zzq0(f, 8.0f, f, 8.0f), (idn0) null, (ga80) null, apo.r(297425616, new dr0((byte) 8, z), b0kVar3), (vu30) null, vci.c, b0kVar2, 805306368, 48, 1432);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new d30(this, z, function0, qim0Var, i, (byte) 10);
        }
    }

    public final mqw getBehavior() {
        return this.i;
    }

    public final void h(int i, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z, boolean z2) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-141427799);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.h(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? 2048 : 1024;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0VarN = anm1.N("create_clip_controls_element", qim0Var);
            gdx gdxVarR = yla.r(b0kVar3);
            uwr uwrVar = cbx.a;
            float f = cbx.b(b0kVar3).b.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            zzq0 zzq0Var = new zzq0(f, 8.0f, f, 8.0f);
            String strO0 = cwl1.o0(b0kVar3, z ? 2131954525 : 2131961408);
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                b0kVar2 = b0kVar3;
                foo1.c(new gbx(new y50(strO0), function0), new idx(4), qim0VarN, (max) null, gdxVarR, zzq0Var, (idn0) null, (ga80) null, (z || z2) ? null : vci.a, (vu30) null, apo.r(131656296, new dr0((byte) 9, z), b0kVar3), b0kVar2, 0, 48, 1432);
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bmg(this, z, z2, function0, qim0Var, i, (byte) 0);
        }
    }

    public final void i(int i, Function0 function0, b0k b0kVar, boolean z) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1093406418);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.h(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            pm31 pm31Var = new pm31(1);
            boolean z2 = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new vj0(function0, (byte) 18);
                x340Var.s0(objT);
            }
            nim0 nim0Var = nim0.a;
            qim0 qim0VarN = anm1.N("save_to_clips_toggle", qmo1.D(nim0Var, z, false, pm31Var, (iu30) objT, 10));
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarN, 0.0f, 16.0f, 0.0f, 0.0f, 13);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            w0h1.a(z ? klx.c : irx.c, isl.a, (qim0) null, 0L, 0L, false, x340Var, 56, 60);
            String strO0 = cwl1.o0(x340Var, 2131961419);
            cvx cvxVar2 = cbx.b(x340Var).b;
            uwo1.e(strO0, uyn1.B(nim0Var, 12.0f, 0.0f, 0.0f, 0.0f, 14), cbx.d(x340Var).h, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2040);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e30(this, z, function0, i, (byte) 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0103  */
    /* JADX WARN: Code duplicated, block: B:40:0x010a A[PHI: r10
      0x010a: PHI (r10v4 p.t6i0) = (r10v3 p.t6i0), (r10v5 p.t6i0) binds: [B:27:0x00bf, B:38:0x0101] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object j(String str, cmg cmgVar, boolean z, tv80 tv80Var, onm onmVar) {
        emg emgVar;
        tv80 tv80Var2;
        boolean z2;
        String str2;
        Object obj;
        t6i0 t6i0Var;
        t6i0 t6i0Var2;
        nj3 m231Var;
        boolean z3;
        cmg cmgVar2 = cmgVar;
        if (onmVar instanceof emg) {
            emgVar = (emg) onmVar;
            int i = emgVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                emgVar.h = i - Integer.MIN_VALUE;
            } else {
                emgVar = new emg(this, onmVar);
            }
        } else {
            emgVar = new emg(this, onmVar);
        }
        Object objJ = emgVar.f;
        int i2 = emgVar.h;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objJ);
            n5f0 n5f0Var = cmgVar2.a;
            trn trnVar = new trn(n5f0Var.a, n5f0Var.b, str);
            emgVar.a = str;
            emgVar.b = cmgVar2;
            tv80Var2 = tv80Var;
            emgVar.c = tv80Var2;
            z2 = z;
            emgVar.e = z2;
            emgVar.h = 1;
            Object objA = this.a.a(trnVar, emgVar);
            if (objA != d9nVar) {
                str2 = str;
                obj = objA;
            }
            return d9nVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            t6i0Var2 = emgVar.d;
            try {
                hm5.M(objJ);
                m231Var = (nj3) objJ;
            } catch (Throwable th) {
                th = th;
                m231Var = new m231(th);
            }
            t6i0Var = t6i0Var2;
            if (m231Var instanceof m231) {
                n57.s("Failed to curate clip");
                z3 = false;
            } else {
                this.f.a(new y231(t6i0Var));
                z3 = true;
            }
            return Boolean.valueOf(z3);
        }
        boolean z4 = emgVar.e;
        tv80Var2 = emgVar.c;
        cmg cmgVar3 = emgVar.b;
        String str3 = emgVar.a;
        hm5.M(objJ);
        obj = ((e331) objJ).a;
        z2 = z4;
        cmgVar2 = cmgVar3;
        str2 = str3;
        Throwable thA = e331.a(obj);
        if (thA != null) {
            n57.t("Unexpected error creating highlight", thA);
            return Boolean.FALSE;
        }
        urn urnVar = (urn) obj;
        String str4 = urnVar.a;
        n5f0 n5f0Var2 = cmgVar2.a;
        t6i0Var = new t6i0(str4, str2, n5f0Var2);
        long j = n5f0Var2.a;
        long j2 = n5f0Var2.b;
        f7i0 f7i0Var = this.b;
        ConcurrentHashMap concurrentHashMap = f7i0Var.a;
        azt aztVar = azt.e;
        String str5 = this.g;
        String str6 = str2;
        ((jfe) concurrentHashMap.computeIfAbsent(str5, aztVar)).l(new e7i0(j, j2, str4, str6));
        ((jfe) f7i0Var.b.computeIfAbsent(str5, azt.f)).l(t6i0Var);
        if (z2) {
            try {
                Single singleC = this.d.c(Collections.singletonList(urnVar.a), nik1.Y2.a, str6, false, new gj3(25, tv80Var2));
                emgVar.a = null;
                emgVar.b = null;
                emgVar.c = null;
                emgVar.d = t6i0Var;
                emgVar.e = z2;
                emgVar.h = 2;
                objJ = fc11.j(singleC, emgVar);
                if (objJ != d9nVar) {
                    t6i0Var2 = t6i0Var;
                    m231Var = (nj3) objJ;
                    t6i0Var = t6i0Var2;
                    if (m231Var instanceof m231) {
                        n57.s("Failed to curate clip");
                        z3 = false;
                    } else {
                        this.f.a(new y231(t6i0Var));
                        z3 = true;
                    }
                }
                return d9nVar;
            } catch (Throwable th2) {
                th = th2;
                t6i0Var2 = t6i0Var;
                m231Var = new m231(th);
            }
        } else {
            this.f.a(new y231(t6i0Var));
            z3 = true;
        }
        return Boolean.valueOf(z3);
    }
}
