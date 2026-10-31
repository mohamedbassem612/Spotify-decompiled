package p;

import com.spotify.wrapped.v1.proto.StoryCard;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class c7f1 extends f311 {
    public final t6f1 a;
    public final boolean b;
    public final boolean c;
    public final ard1 d;
    public final nda1 e;
    public final k7b1 f;
    public final qk41 g;

    public c7f1(t6f1 t6f1Var, boolean z, boolean z2, ard1 ard1Var, nda1 nda1Var, k7b1 k7b1Var) {
        this.a = t6f1Var;
        this.b = z;
        this.c = z2;
        this.d = ard1Var;
        this.e = nda1Var;
        this.f = k7b1Var;
        this.g = (!z || t6f1Var.b.size() <= 1) ? pk41.a : new ok41(2600);
    }

    @Override // p.f311
    public final void d(i2c i2cVar, rk41 rk41Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        h311 h311VarV;
        y6f1 y6f1Var;
        Object ku91Var;
        c380 c380Var;
        hdn0 hdn0Var;
        boolean z;
        ven0 ven0Var;
        boolean z2;
        float f;
        boolean z3;
        ven0 ven0VarS;
        vu30 vu30Var;
        hsi1 hsi1Var;
        c7f1 c7f1Var = this;
        rk41 rk41Var2 = rk41Var;
        m4c m4cVar = fkj0.X;
        Float fValueOf = Float.valueOf(0.0f);
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(663391757);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(i2cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(rk41Var2) : x340Var.i(rk41Var2) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(c7f1Var) ? 2048 : 1024;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 1043) != 1042)) {
            t6f1 t6f1Var = c7f1Var.a;
            c380 c380Var2 = t6f1Var.b;
            if (c380Var2.size() <= 1) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    y6f1Var = new y6f1(c7f1Var, i2cVar, rk41Var2, function0, i, (byte) 0);
                }
            } else {
                lnm lnmVar = null;
                s6f1 s6f1Var = c7f1Var.c ? null : t6f1Var.d;
                int i4 = i3 & 112;
                boolean zI = x340Var.i(c7f1Var) | x340Var.i(c380Var2) | (i4 == 32 || ((i3 & 64) != 0 && x340Var.i(rk41Var2)));
                Object objT = x340Var.T();
                if (zI || objT == m4cVar) {
                    c380Var = c380Var2;
                    ku91Var = new ku91(c7f1Var, c380Var, rk41Var2, lnmVar, (byte) 12);
                    x340Var.s0(ku91Var);
                } else {
                    ku91Var = objT;
                    c380Var = c380Var2;
                }
                qxd0.t(rih1.a, x340Var, (vu30) ku91Var);
                Object objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = bb00.h(0, x340Var);
                }
                hdn0 hdn0Var2 = (hdn0) objT2;
                Object objT3 = x340Var.T();
                if (objT3 == m4cVar) {
                    objT3 = bb00.h(0, x340Var);
                }
                err0 err0Var = (hdn0) objT3;
                Object objT4 = x340Var.T();
                if (objT4 == m4cVar) {
                    objT4 = v8r.q(Boolean.FALSE);
                    x340Var.s0(objT4);
                }
                ven0 ven0Var2 = (ven0) objT4;
                Object objT5 = x340Var.T();
                if (objT5 == m4cVar) {
                    objT5 = v8r.q(Boolean.FALSE);
                    x340Var.s0(objT5);
                }
                ven0 ven0Var3 = (ven0) objT5;
                ven0 ven0VarH = rwq.h(((xgm1) rk41Var2.c).getState(), x340Var, 0);
                boolean z4 = ((wgm1) ven0VarH.getValue()).c.a;
                ven0 ven0VarS2 = v8r.s(x340Var.k(yhm1.a), x340Var);
                err0 err0Var2 = (err0) hdn0Var2;
                Integer numValueOf = Integer.valueOf(err0Var2.s());
                boolean zI2 = x340Var.i(c380Var) | x340Var.i(c7f1Var);
                Object objT6 = x340Var.T();
                if (zI2 || objT6 == m4cVar) {
                    objT6 = new rsc1(c380Var, hdn0Var2, c7f1Var);
                    x340Var.s0(objT6);
                }
                iu30 iu30Var = (iu30) objT6;
                ard1 ard1Var = c7f1Var.d;
                boolean zI3 = x340Var.i(ard1Var);
                Object objT7 = x340Var.T();
                if (zI3 || objT7 == m4cVar) {
                    objT7 = new k7b1(1, ard1Var, ard1.class, "stopImpression", "stopImpression(Lcom/spotify/ubi/logger/ImpressionToken;)V", 0, (byte) 25);
                    x340Var.s0(objT7);
                }
                yhm1.a(numValueOf, iu30Var, (iu30) objT7, x340Var, 0);
                Boolean boolValueOf = Boolean.valueOf(rk41Var2.a);
                StoryCard storyCard = ((wgm1) ven0VarH.getValue()).a;
                String id = storyCard != null ? storyCard.getId() : null;
                Boolean boolValueOf2 = Boolean.valueOf(z4);
                boolean zG = (i4 == 32 || ((i3 & 64) != 0 && x340Var.i(rk41Var2))) | x340Var.g(ven0VarH) | x340Var.i(c7f1Var) | x340Var.h(z4) | x340Var.i(c380Var);
                Object objT8 = x340Var.T();
                if (zG || objT8 == m4cVar) {
                    hdn0Var = hdn0Var2;
                    c380 c380Var3 = c380Var;
                    bj81 bj81Var = new bj81(rk41Var2, c7f1Var, z4, c380Var3, ven0VarH, hdn0Var, (lnm) null);
                    rk41Var2 = rk41Var2;
                    c7f1Var = c7f1Var;
                    c380Var = c380Var3;
                    x340Var.s0(bj81Var);
                    objT8 = bj81Var;
                } else {
                    hdn0Var = hdn0Var2;
                }
                qxd0.r(boolValueOf, id, boolValueOf2, (vu30) objT8, x340Var);
                float fD = i2cVar.d() * 0.68f;
                int iL = p7h.L(c380Var);
                List list = k6f1.a;
                float f2 = (-((gjn) list.get(Math.min(iL, p7h.L(list)))).b) / 267.0f;
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                float f3 = cbx.b(x340Var).b.b;
                float f4 = cbx.b(x340Var).b.b;
                cvx cvxVar2 = cbx.b(x340Var).b;
                float fC = i2cVar.c() * 0.05f;
                cvx cvxVar3 = cbx.b(x340Var).b;
                float f5 = cbx.b(x340Var).e.c;
                err0 err0Var3 = err0Var;
                int iS = err0Var3.s();
                boolean z5 = s6f1Var != null;
                boolean z6 = rk41Var2.a;
                ven0 ven0VarS3 = v8r.s(fValueOf, x340Var);
                boolean z7 = z5 && iS == 0;
                x340Var.i0(-177229297);
                ceo ceoVar = x6f1.a;
                int i5 = iS == 0 ? 900 : 350;
                ceo ceoVar2 = x6f1.d;
                s6f1 s6f1Var2 = s6f1Var;
                boolean z8 = c7f1Var.b;
                ven0 ven0VarW = brl.w(iS, i5, 700, "highlightEntry", x340Var, ceoVar2, z6, z8);
                ven0 ven0VarW2 = brl.w(iS, iS == 0 ? 900 : 350, 700, "albumNameEntry", x340Var, ceoVar2, z6, z8);
                int i6 = iS == 0 ? 1600 : 1150;
                ceo ceoVar3 = x6f1.f;
                ven0 ven0VarW3 = brl.w(iS, i6, StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, "artistNameEntry", x340Var, ceoVar3, z6, z8);
                ven0 ven0VarW4 = brl.w(iS, iS == 0 ? 1600 : 1150, StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, "subtitleEntry", x340Var, ceoVar3, z6, z8);
                if (z7) {
                    x340Var.i0(778040521);
                    ven0 ven0VarW5 = brl.w(iS, 2600, StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, "swipeHintEntry", x340Var, x6f1.g, z6, z8);
                    z = false;
                    x340Var.r(false);
                    ven0Var = ven0VarW5;
                } else {
                    z = false;
                    x340Var.i0(778228536);
                    x340Var.r(false);
                    ven0Var = ven0VarS3;
                }
                if (z7) {
                    x340Var.i0(778331828);
                    z2 = z;
                    ven0VarS3 = brl.w(iS, 2600, 800, "swipeHintArrow", x340Var, mlv.d, z6, z8);
                    x340Var.r(z2);
                } else {
                    z2 = z;
                    x340Var.i0(778509272);
                    x340Var.r(z2);
                }
                iyd iydVar = new iyd(ven0VarW, ven0VarW2, ven0VarW3, ven0VarW4, ven0Var, ven0VarS3);
                x340Var.r(z2);
                int iS2 = err0Var2.s();
                int iS3 = err0Var3.s();
                boolean z9 = rk41Var2.a;
                Float fValueOf2 = Float.valueOf(1.0f);
                if (iS3 == 0) {
                    x340Var.i0(2092717516);
                    tzg1 tzg1Var = rno1.a;
                    if (iS2 != 0) {
                        z3 = false;
                        hsi1Var = new hsi1(f4i1.c(iS3, "swipeHintCollapse-"), fValueOf2, fValueOf, irn1.o0(300, 0, (dlv) null, 6), tzg1Var);
                    } else {
                        z3 = false;
                        hsi1Var = new hsi1("swipeHintShown", fValueOf2, fValueOf2, irn1.j0(), tzg1Var);
                    }
                    f = 1.0f;
                    ven0VarS = zod.S(hsi1Var, z9, c7f1Var.b, (Function0) null, x340Var, 8, 8);
                    x340Var.r(z3);
                } else {
                    f = 1.0f;
                    z3 = false;
                    x340Var.i0(2092662367);
                    ven0VarS = v8r.s(fValueOf, x340Var);
                    x340Var.r(false);
                }
                ven0 ven0Var4 = ven0VarS;
                qim0 qim0VarA = i2cVar.a(u291.c(u291.f(nim0.a, f), 0.75f), een.h);
                if (
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r9v7 ??
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 1041
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.c7f1.d(p.i2c, p.rk41, kotlin.jvm.functions.Function0, p.b0k, int):void");
            }

            @Override // p.qj41
            public final qk41 getDuration() {
                return this.g;
            }
        }
