package p;

import io.reactivex.rxjava3.core.Flowable;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wty {
    public final d0r a;
    public final kl1 b;
    public final k9q c;
    public final rmr d;
    public final rdp e;

    public wty(d0r d0rVar, kl1 kl1Var, k9q k9qVar, rmr rmrVar, rdp rdpVar) {
        this.a = d0rVar;
        this.b = kl1Var;
        this.c = k9qVar;
        this.d = rmrVar;
        this.e = rdpVar;
    }

    public final void a(lik1 lik1Var, String str, c380 c380Var, qim0 qim0Var, rty rtyVar, vzq0 vzq0Var, iu30 iu30Var, b0k b0kVar, int i, int i2) {
        lik1 lik1Var2;
        int i3;
        vzq0 vzq0Var2;
        iu30 iu30Var2;
        wty wtyVar;
        rty rtyVar2;
        b0k b0kVar2;
        iu30 iu30Var3;
        vzq0 vzq0VarH;
        iu30 iu30Var4;
        vzq0 vzq0Var3;
        int i4;
        c380 c380VarA;
        c380 c380Var2;
        jty jtyVar;
        b0k b0kVar3;
        Integer num = rtyVar.a;
        Object obj = fkj0.X;
        b0k b0kVar4 = (x340) b0kVar;
        b0kVar4.k0(-783064522);
        if ((i & 6) == 0) {
            lik1Var2 = lik1Var;
            i3 = (b0kVar4.g(lik1Var2) ? 4 : 2) | i;
        } else {
            lik1Var2 = lik1Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar4.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= b0kVar4.g(c380Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= b0kVar4.i(qim0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= (32768 & i) == 0 ? b0kVar4.g(rtyVar) : b0kVar4.i(rtyVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                vzq0Var2 = vzq0Var;
                int i5 = b0kVar4.i(vzq0Var2) ? 131072 : 65536;
                i3 |= i5;
            } else {
                vzq0Var2 = vzq0Var;
            }
            i3 |= i5;
        } else {
            vzq0Var2 = vzq0Var;
        }
        int i6 = i2 & 64;
        if (i6 != 0) {
            i3 |= 1572864;
            iu30Var2 = iu30Var;
        } else {
            iu30Var2 = iu30Var;
            if ((i & 1572864) == 0) {
                i3 |= b0kVar4.i(iu30Var2) ? 1048576 : 524288;
            }
        }
        if ((i & 12582912) == 0) {
            i3 |= b0kVar4.i(this) ? 8388608 : 4194304;
        }
        if (b0kVar4.Y(i3 & 1, (i3 & 4793491) != 4793490)) {
            b0kVar4.d0();
            if ((i & 1) == 0 || b0kVar4.E()) {
                if ((i2 & 32) != 0) {
                    vzq0VarH = uyn1.h(3, 0.0f, 0.0f);
                    i3 &= -458753;
                } else {
                    vzq0VarH = vzq0Var2;
                }
                if (i6 != 0) {
                    Object objT = b0kVar4.T();
                    if (objT == obj) {
                        objT = rqy.c1;
                        b0kVar4.s0(objT);
                    }
                    iu30Var2 = (iu30) objT;
                }
                iu30Var4 = iu30Var2;
                vzq0Var3 = vzq0VarH;
                i4 = i3;
            } else {
                b0kVar4.b0();
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                }
                iu30Var4 = iu30Var2;
                i4 = i3;
                vzq0Var3 = vzq0Var2;
            }
            b0kVar4.s();
            xtb0 xtb0VarA = vpb1.A(b0kVar4);
            Object objT2 = b0kVar4.T();
            if (objT2 == obj) {
                objT2 = qxd0.M(o6x.a, b0kVar4);
                b0kVar4.s0(objT2);
            }
            c9n c9nVar = (c9n) objT2;
            qty qtyVar = rtyVar.d;
            boolean zG = ((i4 & 896) == 256) | b0kVar4.g(num);
            Object objT3 = b0kVar4.T();
            if (zG || objT3 == obj) {
                objT3 = (num == null || (c380VarA = mqo1.A(o7h.d1(c380Var, num.intValue()))) == null) ? c380Var : c380VarA;
                b0kVar4.s0(objT3);
            }
            c380 c380Var3 = (c380) objT3;
            boolean zG2 = ((i4 & 112) == 32) | b0kVar4.g(c9nVar);
            Object objT4 = b0kVar4.T();
            if (zG2 || objT4 == obj) {
                objT4 = this.c.a(str, this.a, c9nVar);
                b0kVar4.s0(objT4);
            }
            xq51 xq51Var = (xq51) objT4;
            b0kVar4.f0(-905699829, b0kVar4.K(xtb0VarA, c380Var3));
            iac0 iac0Var = (iac0) b0kVar4.k(jfe0.a);
            sdp sdpVar = (sdp) this.d.b;
            byte b = sdpVar.a;
            rdp rdpVar = this.e;
            switch (b) {
                case 0:
                    c380Var2 = c380Var3;
                    c21 c21Var = (c21) ((lbp) sdpVar.b).c;
                    yqg yqgVar = (yqg) ((nsy) c21Var.c).b.get();
                    c8o.l(yqgVar);
                    zs11 zs11Var = (zs11) ((nsy) c21Var.c).G.get();
                    c8o.l(zs11Var);
                    zwp zwpVar = (zwp) ((nsy) c21Var.c).o.get();
                    c8o.l(zwpVar);
                    ycm ycmVar = (ycm) ((nsy) c21Var.c).n.get();
                    c8o.l(ycmVar);
                    xh71 xh71Var = (xh71) ((nsy) c21Var.c).f23p.get();
                    c8o.l(xh71Var);
                    t8u0 t8u0Var = (t8u0) ((nsy) c21Var.c).i.get();
                    c8o.l(t8u0Var);
                    Flowable flowable = (Flowable) ((nsy) c21Var.c).f.get();
                    c8o.l(flowable);
                    uu00 uu00Var = (uu00) ((nsy) c21Var.c).j.get();
                    c8o.l(uu00Var);
                    vbs vbsVar = (vbs) ((nsy) c21Var.c).k.get();
                    c8o.l(vbsVar);
                    e7p0 e7p0Var = (e7p0) ((nsy) c21Var.c).l.get();
                    c8o.l(e7p0Var);
                    b7r0 b7r0Var = (b7r0) ((nsy) c21Var.c).m.get();
                    c8o.l(b7r0Var);
                    d0r d0rVar = (d0r) ((jly0) c21Var.e).get();
                    uvy uvyVar = (uvy) ((nsy) c21Var.c).D.get();
                    c8o.l(uvyVar);
                    xrc0 xrc0Var = (xrc0) ((nsy) c21Var.c).E.get();
                    c8o.l(xrc0Var);
                    jtyVar = new jty(yqgVar, zs11Var, zwpVar, ycmVar, xh71Var, t8u0Var, flowable, uu00Var, vbsVar, e7p0Var, b7r0Var, d0rVar, uvyVar, xrc0Var, ((Boolean) ((nsy) c21Var.c).B.get()).booleanValue(), ((Boolean) ((nsy) c21Var.c).C.get()).booleanValue(), lik1Var, str, c380Var2, rdpVar, xq51Var, iac0Var);
                    break;
                case 1:
                    c380Var2 = c380Var3;
                    x2p x2pVar = (x2p) sdpVar.b.c;
                    yqg yqgVar2 = ((kty) x2pVar.c).j;
                    c8o.l(yqgVar2);
                    zs11 zs11Var2 = ((kty) x2pVar.c).k;
                    c8o.l(zs11Var2);
                    zwp zwpVar2 = ((kty) x2pVar.c).l;
                    c8o.l(zwpVar2);
                    ycm ycmVar2 = ((kty) x2pVar.c).m;
                    c8o.l(ycmVar2);
                    xh71 xh71Var2 = ((kty) x2pVar.c).n;
                    c8o.l(xh71Var2);
                    t8u0 t8u0Var2 = ((kty) x2pVar.c).d;
                    c8o.l(t8u0Var2);
                    Flowable flowable2 = ((kty) x2pVar.c).e;
                    c8o.l(flowable2);
                    uu00 uu00Var2 = ((kty) x2pVar.c).f;
                    c8o.l(uu00Var2);
                    vbs vbsVar2 = ((kty) x2pVar.c).g;
                    c8o.l(vbsVar2);
                    e7p0 e7p0Var2 = ((kty) x2pVar.c).h;
                    c8o.l(e7p0Var2);
                    b7r0 b7r0Var2 = ((kty) x2pVar.c).i;
                    c8o.l(b7r0Var2);
                    kty ktyVar = (kty) x2pVar.c;
                    d0r d0rVar2 = ktyVar.c;
                    uvy uvyVar2 = ktyVar.w;
                    c8o.l(uvyVar2);
                    xrc0 xrc0Var2 = ((kty) x2pVar.c).x;
                    c8o.l(xrc0Var2);
                    kty ktyVar2 = (kty) x2pVar.c;
                    jtyVar = new jty(yqgVar2, zs11Var2, zwpVar2, ycmVar2, xh71Var2, t8u0Var2, flowable2, uu00Var2, vbsVar2, e7p0Var2, b7r0Var2, d0rVar2, uvyVar2, xrc0Var2, ktyVar2.u, ktyVar2.v, lik1Var, str, c380Var2, rdpVar, xq51Var, iac0Var);
                    break;
                default:
                    c21 c21Var2 = (c21) ((lbp) sdpVar.b).c;
                    yqg yqgVar3 = (yqg) ((puy) c21Var2.d).b.get();
                    c8o.l(yqgVar3);
                    zs11 zs11Var3 = (zs11) ((puy) c21Var2.d).G.get();
                    c8o.l(zs11Var3);
                    zwp zwpVar3 = (zwp) ((puy) c21Var2.d).o.get();
                    c8o.l(zwpVar3);
                    ycm ycmVar3 = (ycm) ((puy) c21Var2.d).n.get();
                    c8o.l(ycmVar3);
                    xh71 xh71Var3 = (xh71) ((puy) c21Var2.d).f28p.get();
                    c8o.l(xh71Var3);
                    t8u0 t8u0Var3 = (t8u0) ((puy) c21Var2.d).i.get();
                    c8o.l(t8u0Var3);
                    Flowable flowable3 = (Flowable) ((puy) c21Var2.d).f.get();
                    c8o.l(flowable3);
                    uu00 uu00Var3 = (uu00) ((puy) c21Var2.d).j.get();
                    c8o.l(uu00Var3);
                    vbs vbsVar3 = (vbs) ((puy) c21Var2.d).k.get();
                    c8o.l(vbsVar3);
                    e7p0 e7p0Var3 = (e7p0) ((puy) c21Var2.d).l.get();
                    c8o.l(e7p0Var3);
                    b7r0 b7r0Var3 = (b7r0) ((puy) c21Var2.d).m.get();
                    c8o.l(b7r0Var3);
                    d0r d0rVar3 = (d0r) ((jly0) c21Var2.e).get();
                    uvy uvyVar3 = (uvy) ((puy) c21Var2.d).z.get();
                    c8o.l(uvyVar3);
                    xrc0 xrc0Var3 = (xrc0) ((puy) c21Var2.d).A.get();
                    c8o.l(xrc0Var3);
                    c380Var2 = c380Var3;
                    jtyVar = new jty(yqgVar3, zs11Var3, zwpVar3, ycmVar3, xh71Var3, t8u0Var3, flowable3, uu00Var3, vbsVar3, e7p0Var3, b7r0Var3, d0rVar3, uvyVar3, xrc0Var3, ((Boolean) ((puy) c21Var2.d).D.get()).booleanValue(), ((Boolean) ((puy) c21Var2.d).E.get()).booleanValue(), lik1Var2, str, c380Var2, rdpVar, xq51Var, iac0Var);
                    break;
            }
            x2p x2pVar2 = new x2p(jtyVar);
            lik1 lik1Var3 = jtyVar.q;
            c8o.l(lik1Var3);
            String str2 = jtyVar.r;
            c8o.l(str2);
            d0r d0rVar4 = jtyVar.l;
            c8o.l(d0rVar4);
            dnc0 dnc0Var = new dnc0(d0rVar4, (Function0) null, (Function0) null, (cc9) null, (guh0) null, 126);
            ogr ogrVarV = g7y.v((udp) x2pVar2.b.get());
            qdp qdpVar = (qdp) ((jly0) x2pVar2.d).get();
            rdp rdpVar2 = jtyVar.t;
            c8o.l(rdpVar2);
            byp bypVar = new byp(lik1Var3, str2, jtyVar.s, dnc0Var, ogrVarV, qdpVar, rdpVar2, jtyVar.u, new fjb((byte) 9), jtyVar.v);
            dnc0Var.b(new gj50(new hty(bypVar, (byte) 0), false), new hty(bypVar, (byte) 2));
            q1d0 q1d0VarN = jyo1.n(xtb0VarA, dnc0Var.a(), (h3h1) null, b0kVar4, 4);
            b0kVar4.r(false);
            qim0 qim0VarZ = u291.z(nim0.a, (fra) null, 3);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(((x340) b0kVar4).T);
            xos0 xos0VarM = b0kVar4.m();
            qim0 qim0VarE = zr7.E(b0kVar4, qim0VarZ);
            hzj.A.getClass();
            if (((x340) b0kVar4).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar4.m0();
            if (((x340) b0kVar4).S) {
                b0kVar4.l(hmb0.t1);
            } else {
                b0kVar4.v0();
            }
            nko1.H(gfh0VarC, b0kVar4, y580.O0);
            nko1.H(xos0VarM, b0kVar4, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar4, y580.R0);
            nko1.F(b0kVar4);
            nko1.H(qim0VarE, b0kVar4, y580.Y);
            vzq0 vzq0Var4 = vzq0Var3;
            iu30 iu30Var5 = iu30Var4;
            rtyVar2 = rtyVar;
            vzq0Var2 = vzq0Var4;
            mod.b(jxq0.a.a((Object) null), apo.r(1501895856, new k40(rtyVar, qim0Var, xtb0VarA, vzq0Var4, iu30Var5, q1d0VarN), b0kVar4), b0kVar4, 56);
            if (rtyVar2.c instanceof uty) {
                b0kVar4.i0(1909851322);
                wtyVar = this;
                wtyVar.c(xtb0VarA, null, b0kVar4, ((i4 >> 12) & 7168) | 6);
                b0kVar4.r(false);
            } else {
                wtyVar = this;
                b0kVar4.i0(1909905138);
                b0kVar4.r(false);
            }
            b0kVar4.r(true);
            if (qtyVar instanceof pty) {
                b0kVar4.i0(1989621725);
                boolean zI = b0kVar4.i(xq51Var);
                Object objT5 = b0kVar4.T();
                if (zI || objT5 == obj) {
                    objT5 = new sty(1, xq51Var, xq51.class, "getPresentationTimestampRangeFlow", "getPresentationTimestampRangeFlow(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", 0, (byte) 0);
                    b0kVar4.s0(objT5);
                }
                b0kVar3 = b0kVar4;
                y9g1.d(str, c380Var2, wtyVar.b, (iu30) objT5, xtb0VarA, true, b0kVar3, (i4 >> 3) & 14, 0);
                b0kVar3.r(false);
            } else {
                b0kVar3 = b0kVar4;
                b0kVar3.i0(1990005164);
                b0kVar3.r(false);
            }
            b0kVar2 = b0kVar3;
            iu30Var3 = iu30Var5;
        } else {
            wtyVar = this;
            rtyVar2 = rtyVar;
            b0kVar4.b0();
            b0kVar2 = b0kVar4;
            iu30Var3 = iu30Var2;
        }
        vzq0 vzq0Var5 = vzq0Var2;
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new fdx(wtyVar, lik1Var, str, c380Var, qim0Var, rtyVar2, vzq0Var5, iu30Var3, i, i2);
        }
    }

    public final void b(int i, b0k b0kVar, qim0 qim0Var, boolean z) {
        int i2;
        List listM;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1051089321);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.h(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            if (z) {
                x340Var.i0(-1604360599);
                uwr uwrVar = cbx.a;
                listM = p7h.M(new u7h[]{new u7h(cbx.a(x340Var).a.a.a()), new u7h(u7h.b(cbx.a(x340Var).a.a.a(), 0.0f, 0.0f, 0.0f, 0.0f, 14))});
                x340Var.r(false);
            } else {
                x340Var.i0(-1604148311);
                uwr uwrVar2 = cbx.a;
                listM = p7h.M(new u7h[]{new u7h(u7h.b(cbx.a(x340Var).a.a.a(), 0.0f, 0.0f, 0.0f, 0.0f, 14)), new u7h(cbx.a(x340Var).a.a.a())});
                x340Var.r(false);
            }
            t1c.a(dug.e(qim0Var, v9c.s(listM, 0.0f, 0.0f, 14), (hw61) null, 0.0f, 6), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e30((Object) this, z, (Object) qim0Var, i, (byte) 14);
        }
    }

    public final void c(xtb0 xtb0Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(684972997);
        int i3 = i & 6;
        h2c h2cVar = h2c.a;
        if (i3 == 0) {
            i2 = (x340Var.i(h2cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(xtb0Var) ? 32 : 16;
        }
        int i4 = i2 | 384;
        if ((i & 3072) == 0) {
            i4 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i4 & 1, (i4 & 1171) != 1170)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = yv91.a(new ih1(xtb0Var, (byte) 20));
                x340Var.s0(objT);
            }
            tob1 tob1Var = (tob1) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = yv91.a(new ih1(xtb0Var, (byte) 19));
                x340Var.s0(objT2);
            }
            tob1 tob1Var2 = (tob1) objT2;
            boolean zBooleanValue = ((Boolean) tob1Var.getValue()).booleanValue();
            qim0 qim0Var3 = nim0.a;
            if (zBooleanValue) {
                x340Var.i0(641665343);
                qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(x340Var).g;
                b(((i4 >> 3) & 896) | 6, x340Var, h2cVar.a(u291.h(qim0VarF, 32.0f), een.d), true);
                x340Var.r(false);
            } else {
                x340Var.i0(641884637);
                x340Var.r(false);
            }
            if (((Boolean) tob1Var2.getValue()).booleanValue()) {
                x340Var.i0(641929339);
                qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
                uwr uwrVar2 = cbx.a;
                zov0 zov0Var2 = cbx.b(x340Var).g;
                b(((i4 >> 3) & 896) | 6, x340Var, h2cVar.a(u291.h(qim0VarF2, 32.0f), een.t), false);
                x340Var.r(false);
            } else {
                x340Var.i0(642152477);
                x340Var.r(false);
            }
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x8t((Object) this, (Object) xtb0Var, (Object) qim0Var2, i, (byte) 25);
        }
    }
}
