package p;

import com.spotify.base.java.logging.Logger;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class exj0 implements xpw {
    public final hj91 N0;
    public final bpb1 O0;
    public final bpb1 P0;
    public final bpb1 Q0;
    public final js20 R0;
    public final ia00 S0;
    public final psw T0;
    public final fgk0 X;
    public r6h1 Y = r6h1.c;
    public final idd1 Z = new idd1(new z8i0(this, (byte) 22));
    public final d0r a;
    public final String b;
    public final koc0 c;
    public final kt91 d;
    public final rxj0 e;
    public final jjk0 f;
    public final h9k0 g;
    public final c9q h;
    public final yfc0 i;
    public final vek0 t;

    public exj0(d0r d0rVar, ov20 ov20Var, String str, z6k0 z6k0Var, zwz0 zwz0Var, koc0 koc0Var, mnk0 mnk0Var, kt91 kt91Var, rxj0 rxj0Var, jjk0 jjk0Var, d520 d520Var, tp91 tp91Var, h9k0 h9k0Var, c9q c9qVar, kdq kdqVar, jdq jdqVar, yfc0 yfc0Var, vek0 vek0Var, fgk0 fgk0Var) {
        this.a = d0rVar;
        this.b = str;
        this.c = koc0Var;
        this.d = kt91Var;
        this.e = rxj0Var;
        this.f = jjk0Var;
        this.g = h9k0Var;
        this.h = c9qVar;
        this.i = yfc0Var;
        this.t = vek0Var;
        this.X = fgk0Var;
        hj91 hj91VarA = tp91Var.a(new pp91((nn61) null, (qp91) null, 1, (ywv0) null, 103));
        this.N0 = hj91VarA;
        Boolean bool = Boolean.FALSE;
        mr20 mr20VarB = gio1.b(bool);
        this.O0 = mr20VarB;
        mr20 mr20VarB2 = gio1.b(bool);
        this.P0 = mr20VarB2;
        mr20 mr20VarB3 = gio1.b(bool);
        this.Q0 = mr20VarB3;
        p1e0 p1e0Var = new p1e0(d3p1.F(d0rVar, w3p1.o(new l4r(pwc0.e, 1, ktj0.Y0, new j4r(ktj0.W0), ktj0.Z0), ktj0.X0), str), (byte) 19);
        o3r o3rVarT = x2p1.t(str);
        this.R0 = x3p1.m(new wa3(new mr20[]{zwz0Var.b(), new zx60(yoi1.g(hj91VarA.d(str)), (byte) 26), p1e0Var, rqt0.u(new j5b0(((roc0) koc0Var).d(), (byte) 6)), mr20VarB, mr20VarB2, new f8f0(mnk0Var.a, (byte) 26), new p1e0(d3p1.F(d0rVar, o3rVarT, rih1.a), (byte) 18), new sii0(((bw20) ov20Var).a, this, (byte) 3), rqt0.u(new lt20(new e6s(fgk0Var.e.d(fgk0Var.f), (byte) 4), new i440(3, (lnm) null, (byte) 12), (byte) 0)), mr20VarB3, new yv8(d520Var.V(str), (byte) 5)}, (byte) 26), ktj0.V0, m2j0.O0, (o8n) null, new r7j0(this, (byte) 17), 8);
        this.S0 = n3o1.q(this).a(new pah0(this, (byte) 13), eej0.X0);
        j2i j2iVar = new j2i(-1090086061, new y3i0(this, (byte) 19), true);
        ien0 ien0Var = qsw.a;
        this.T0 = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.S0;
    }

    public final jsw c() {
        return this.T0;
    }

    public final void e(iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2019898943);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(this) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            ven0 ven0VarS = v8r.s(iu30Var, x340Var);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                oaj0 oaj0Var = new oaj0(new xd2(ven0VarS, (byte) 15));
                x340Var.s0(oaj0Var);
                objT = oaj0Var;
            }
            otw.c((oaj0) objT, rih1.a, (qim0) null, (ipb1) null, x340Var, 48, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nbf0(this, iu30Var, i, (byte) 11);
        }
    }

    public final void f(owj0 owj0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        saj0 saj0Var;
        g3d0 g3d0Var = owj0Var.f;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1918588827);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(owj0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            u2d0 u2d0Var = u2d0.a;
            if (g3d0Var == null || g3d0Var.equals(u2d0Var) || !owj0Var.d) {
                saj0Var = (g3d0Var == null || g3d0Var.equals(u2d0Var)) ? saj0.b : saj0.a;
            } else {
                saj0Var = saj0.c;
            }
            ven0 ven0VarS = v8r.s(iu30Var, x340Var);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                vaj0 vaj0Var = new vaj0(new loi0(saj0Var, ven0VarS, (byte) 5));
                x340Var.s0(vaj0Var);
                objT = vaj0Var;
            }
            otw.c((vaj0) objT, new taj0(saj0Var), (qim0) null, (ipb1) null, x340Var, 0, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pwj0(this, owj0Var, iu30Var, i, (byte) 0);
        }
    }

    public final void g(owj0 owj0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        Object obj;
        lnm lnmVar;
        qim0 qim0VarQ;
        qim0 qim0VarS;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1646501412);
        if ((i & 6) == 0) {
            i2 = (b0kVar2.i(owj0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar2.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar2.i(this) ? 256 : 128;
        }
        if (b0kVar2.Y(i2 & 1, (i2 & 147) != 146)) {
            nwj0 nwj0Var = owj0Var.a;
            Boolean bool = nwj0Var.a;
            Boolean bool2 = nwj0Var.a;
            Boolean bool3 = Boolean.TRUE;
            pex nexVar = u890.j(bool2, bool3) ? pex.b : new nex(8);
            Object obj2 = fkj0.X;
            pe peVarA = ef.a(b0kVar2);
            boolean zG = b0kVar2.g(peVarA);
            Object objT = b0kVar2.T();
            if (zG || objT == obj2) {
                objT = Boolean.valueOf(peVarA.b(5));
                b0kVar2.s0(objT);
            }
            boolean zBooleanValue = ((Boolean) objT).booleanValue();
            boolean zG2 = b0kVar2.g(peVarA);
            Object objT2 = b0kVar2.T();
            pex pexVar = nexVar;
            if (zG2 || objT2 == obj2) {
                objT2 = Boolean.valueOf(peVarA.b(3));
                b0kVar2.s0(objT2);
            }
            boolean zBooleanValue2 = ((Boolean) objT2).booleanValue();
            Object objT3 = b0kVar2.T();
            Object obj3 = objT3;
            if (objT3 == obj2) {
                q811 q811Var = new q811();
                q811Var.a = bool;
                b0kVar2.s0(q811Var);
                obj3 = q811Var;
            }
            q811 q811Var2 = (q811) obj3;
            tob1 tob1VarB = z95.b(u890.j(bool, bool3) ? 1.0f : 0.0f, (zBooleanValue || (q811Var2.a != null && zBooleanValue2)) ? irn1.o0(600, 0, klv.c, 2) : irn1.o0(0, 0, (dlv) null, 6), "rubberFadeAnimation", (iu30) null, b0kVar2, 3072, 20);
            if (bool == null) {
                b0kVar2.i0(1924125168);
                b0kVar2.r(false);
                obj = obj2;
                lnmVar = null;
            } else {
                b0kVar2.i0(1924125169);
                boolean zBooleanValue3 = bool.booleanValue();
                boolean zI = b0kVar2.i(q811Var2) | b0kVar2.h(zBooleanValue3);
                Object objT4 = b0kVar2.T();
                if (zI) {
                    obj = obj2;
                } else {
                    obj = obj2;
                    if (objT4 != obj) {
                        lnmVar = null;
                    }
                    qxd0.t(bool, b0kVar2, (vu30) objT4);
                    b0kVar2.r(false);
                }
                lnmVar = null;
                objT4 = new vtj0(q811Var2, zBooleanValue3, (lnm) null, (byte) 0);
                b0kVar2.s0(objT4);
                qxd0.t(bool, b0kVar2, (vu30) objT4);
                b0kVar2.r(false);
            }
            float fFloatValue = ((Number) tob1VarB.getValue()).floatValue();
            qim0 qim0Var = nim0.a;
            if (fFloatValue > 0.0f) {
                float fFloatValue2 = ((Number) tob1VarB.getValue()).floatValue();
                float f = qy31.a;
                qim0VarQ = exd0.q(qim0Var, new vbk0((byte) 16, fFloatValue2));
            } else {
                qim0VarQ = qim0Var;
            }
            boolean z = owj0Var.m && nwj0Var.b;
            List list = dz71.a;
            Object objT5 = b0kVar2.T();
            if (objT5 == obj) {
                objT5 = c97.b(0.0f);
                b0kVar2.s0(objT5);
            }
            o95 o95Var = (o95) objT5;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zH = b0kVar2.h(z) | b0kVar2.i(o95Var);
            Object objT6 = b0kVar2.T();
            if (zH || objT6 == obj) {
                objT6 = new yfy((byte) 2, o95Var, lnmVar, z);
                b0kVar2.s0(objT6);
            }
            qxd0.t(boolValueOf, b0kVar2, (vu30) objT6);
            if (z) {
                tw4 tw4VarA = ww4.a();
                o811 o811Var = new o811();
                o811Var.a = 0L;
                qim0VarS = exd0.s(qim0Var, new e971(o811Var, new m811(), tw4VarA, o95Var, (byte) 4));
            } else {
                qim0VarS = qim0Var;
            }
            ptx ptxVar = ptx.c;
            String strO0 = cwl1.o0(b0kVar2, 2131954769);
            int i3 = i2;
            t2g t2gVar = new t2g(u890.j(bool, bool3), false, pexVar, 2);
            String strO1 = cwl1.o0(b0kVar2, 2131954764);
            qim0 qim0VarThen = anm1.N("curation_tools_mixing_button_is_enabled_" + u890.j(bool, bool3), qim0Var).then(qim0VarQ).then(qim0VarS);
            boolean zI2 = b0kVar2.i(owj0Var) | ((i3 & 112) == 32) | b0kVar2.i(this);
            Object objT7 = b0kVar2.T();
            if (zI2 || objT7 == obj) {
                objT7 = new dvg0(owj0Var, iu30Var, this);
                b0kVar2.s0(objT7);
            }
            b0kVar2 = b0kVar2;
            kyo1.c(strO0, ptxVar, (Function0) objT7, qim0VarThen, false, strO1, t2gVar, (vu30) null, b0kVar2, ptx.d << 3, 144);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new pwj0(this, owj0Var, iu30Var, i, (byte) 1);
        }
    }

    public final mqw getBehavior() {
        return this.R0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object h(boolean z, onm onmVar) {
        rwj0 rwj0Var;
        if (onmVar instanceof rwj0) {
            rwj0Var = (rwj0) onmVar;
            int i = rwj0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                rwj0Var.d = i - Integer.MIN_VALUE;
            } else {
                rwj0Var = new rwj0(this, onmVar);
            }
        } else {
            rwj0Var = new rwj0(this, onmVar);
        }
        Object obj = rwj0Var.b;
        int i2 = rwj0Var.d;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                oy3 oy3Var = new oy3(this, z, (lnm) null, (byte) 10);
                rwj0Var.a = z;
                rwj0Var.d = 1;
                Object objM = rc2.M(5000L, oy3Var, rwj0Var);
                d9n d9nVar = d9n.a;
                z = d9nVar;
                if (objM == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z2 = rwj0Var.a;
                hm5.M(obj);
                z = z2;
            }
        } catch (TimeoutCancellationException e) {
            Logger.l(e, "Timeout waiting for FLA to reflect mix state=" + z, new Object[0]);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:129:0x02b0 A[Catch: all -> 0x027e, TRY_LEAVE, TryCatch #14 {all -> 0x027e, blocks: (B:110:0x0269, B:127:0x02aa, B:129:0x02b0), top: B:171:0x0269 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:144:0x0184 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x0189 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x015c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0166  */
    /* JADX WARN: Code duplicated, block: B:70:0x017c  */
    /* JADX WARN: Code duplicated, block: B:71:0x017d  */
    /* JADX WARN: Code duplicated, block: B:78:0x018e A[Catch: all -> 0x01e3, TryCatch #2 {all -> 0x01e3, blocks: (B:76:0x0189, B:78:0x018e, B:81:0x0194), top: B:148:0x0189 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0030  */
    /* JADX WARN: Code duplicated, block: B:88:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:93:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:94:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:96:0x0200 A[Catch: all -> 0x028a, TryCatch #7 {all -> 0x028a, blocks: (B:105:0x021f, B:96:0x0200, B:98:0x0204, B:102:0x020b, B:91:0x01e7), top: B:157:0x01e7 }] */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x012d, code lost:
    
        if (p.fc11.i(r0, r4) == r13) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(p.owj0 r29, boolean r30, p.tv80 r31, boolean r32, p.onm r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 757
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.exj0.i(p.owj0, boolean, p.tv80, boolean, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
    
        if (r10.c(r8, r1, r9, r0) == r5) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(p.tv80 r9, p.onm r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof p.vwj0
            if (r0 == 0) goto L13
            r0 = r10
            p.vwj0 r0 = (p.vwj0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.vwj0 r0 = new p.vwj0
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r10)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L74
            goto L7d
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return r4
        L31:
            p.tv80 r9 = r0.a
            p.hm5.M(r10)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L74
            goto L4c
        L37:
            p.hm5.M(r10)
            p.uwj0 r10 = new p.uwj0     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L74
            r10.<init>(r8, r4, r3)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L74
            r0.a = r9     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L74
            r0.d = r3     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L74
            r6 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r10 = p.rc2.M(r6, r10, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L74
            if (r10 != r5) goto L4c
            goto L73
        L4c:
            java.util.Map r10 = (java.util.Map) r10     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L74
            p.fgk0 r1 = r8.X     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L74
            p.z6k0 r1 = r1.a     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L74
            r1.getClass()     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L74
            java.lang.String r1 = "has-custom-transitions"
            java.lang.Object r10 = r10.get(r1)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L74
            java.lang.String r10 = (java.lang.String) r10     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L74
            boolean r10 = java.lang.Boolean.parseBoolean(r10)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L74
            if (r10 != 0) goto L7d
            p.h9k0 r10 = r8.g     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L74
            java.lang.String r8 = r8.b     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L74
            p.y8k0 r1 = p.y8k0.a     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L74
            r0.a = r4     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L74
            r0.d = r2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L74
            java.lang.Object r8 = r10.c(r8, r1, r9, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L74
            if (r8 != r5) goto L7d
        L73:
            return r5
        L74:
            r8 = move-exception
            r9 = 0
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.String r10 = "Timeout waiting for FLA to update after enabling mix"
            com.spotify.base.java.logging.Logger.l(r8, r10, r9)
        L7d:
            p.rih1 r8 = p.rih1.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.exj0.j(p.tv80, p.onm):java.lang.Object");
    }
}
