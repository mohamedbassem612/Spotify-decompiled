package p;

import android.net.Uri;
import android.widget.FrameLayout;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import spotify.your_library.esperanto.proto.YourLibraryContainsRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gk0 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gk0(iu30 iu30Var, r9u0 r9u0Var, xym xymVar) {
        super(4);
        this.a = (byte) 17;
        this.d = iu30Var;
        this.b = r9u0Var;
        this.c = xymVar;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        zz zzVar;
        iob1 iob1Var = (iob1) obj3;
        c700 c700Var = (c700) obj4;
        hob1 hob1VarV = too1.v(iob1Var);
        w7h1 w7h1VarK = s110.k((yz7) obj, hob1VarV, c700Var, hob1VarV.d, true);
        l0x0 l0x0Var = (l0x0) this.b;
        kko kkoVar = (kko) this.c;
        klv0 klv0Var = (klv0) this.d;
        n1x n1xVar = ((mey0) obj2).g;
        if (n1xVar != null) {
            String str = iob1Var.b;
            if (c700Var.equals(kwz.a)) {
                l0x0Var.o(new qy(gho1.r(n1xVar), wgo1.w(n1xVar)));
                return w7h1VarK;
            }
            if (c700Var instanceof pwz) {
                l0x0Var.o(new z00(wgo1.x(n1xVar), gho1.r(n1xVar), ((pwz) c700Var).a));
                return w7h1VarK;
            }
            if (c700Var instanceof f300) {
                if (iob1Var.s) {
                    zzVar = zz.a;
                } else {
                    zzVar = iob1Var.t ? b00.a : a00.a;
                }
                l0x0Var.o(new d00(gho1.r(n1xVar), wgo1.w(n1xVar), zzVar));
                return w7h1VarK;
            }
            if (c700Var instanceof m300) {
                l0x0Var.o(new g00(gho1.r(n1xVar), new f00(((m300) c700Var).a ? wgo1.w(n1xVar) : z6x.a)));
                return w7h1VarK;
            }
            if (c700Var instanceof txz) {
                l0x0Var.o(new cz(gho1.r(n1xVar), wgo1.w(n1xVar), ((ijo) kkoVar.a().getValue()).a.contains(str) ? az.a : zy.a));
                return w7h1VarK;
            }
            if ((c700Var instanceof lxz) || c700Var.equals(nwz.a) || c700Var.equals(hzz.a)) {
                l0x0Var.o(new wy(gho1.r(n1xVar)));
            } else {
                if (c700Var instanceof mxz) {
                    l0x0Var.o(new xy(gho1.r(n1xVar)));
                    return w7h1VarK;
                }
                if (c700Var instanceof i300) {
                    l0x0Var.o(new e00(wgo1.w(n1xVar), gho1.r(n1xVar), u890.j(((elv0) klv0Var.a().getValue()).a.get(str), Boolean.TRUE)));
                    return w7h1VarK;
                }
                if (c700Var instanceof gzz) {
                    l0x0Var.o(new qy(gho1.r(n1xVar), wgo1.w(n1xVar)));
                    return w7h1VarK;
                }
            }
        }
        return w7h1VarK;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        e9w0 e9w0Var = (e9w0) ((e8w0) this.b).a.get(iIntValue);
        String str = e9w0Var.a;
        boolean z = (((iIntValue2 & 112) ^ 48) > 32 && x340Var.e(iIntValue)) || (iIntValue2 & 48) == 32;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new po60(iIntValue, (byte) 20);
            x340Var2.s0(objT);
        }
        dgo1.c(str, (iu30) objT, apo.r(-1896073386, new tbs0((smp0) this.c, e9w0Var, (vu30) this.d, (byte) 24), x340Var2), x340Var2, 384);
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        aqb0 aqb0Var = (aqb0) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (b0k) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        c380 c380Var = (c380) this.b;
        if (iIntValue == 0) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(960946644);
            ((j2i) this.c).J(aqb0Var, (y5c1) c380Var.get(iIntValue), x340Var2, Integer.valueOf(iIntValue2 & 14));
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(961032638);
            int i = (iIntValue - 1) * 2;
            int i2 = i + 1;
            int i3 = i + 3;
            int size = c380Var.size();
            if (i3 > size) {
                i3 = size;
            }
            ((j2i) this.d).c1(aqb0Var, c380Var.subList(i2, i3), Integer.valueOf(i2), x340Var3, Integer.valueOf(iIntValue2 & 14));
            x340Var3.r(false);
        }
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        lsc1 lsc1Var = (lsc1) obj2;
        ((Number) obj4).intValue();
        tva1 tva1Var = (tva1) this.b;
        String str = lsc1Var.b;
        x340 x340Var = (b0k) obj3;
        x340Var.i0(-547515421);
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = gio1.b(w7x.a);
            x340Var.s0(objT);
        }
        wen0 wen0Var = (wen0) objT;
        boolean zI = x340Var.i(wen0Var) | x340Var.i(lsc1Var);
        Object objT2 = x340Var.T();
        if (zI || objT2 == m4cVar) {
            objT2 = new kwb1(wen0Var, lsc1Var, null, (byte) 2);
            x340Var.s0(objT2);
        }
        qxd0.t(str, x340Var, (vu30) objT2);
        peq peqVar = (peq) this.c;
        Object objT3 = x340Var.T();
        if (objT3 == m4cVar) {
            objT3 = a8o.v(peqVar, wen0Var);
            x340Var.s0(objT3);
        }
        tva1Var.P0 = (k740) objT3;
        qeq qeqVar = (qeq) this.d;
        Object objT4 = x340Var.T();
        if (objT4 == m4cVar) {
            objT4 = qeqVar.a(wen0Var);
            x340Var.s0(objT4);
        }
        tva1Var.Q0 = (stt0) objT4;
        boolean zI2 = x340Var.i(tva1Var);
        Object objT5 = x340Var.T();
        if (zI2 || objT5 == m4cVar) {
            objT5 = new l5b1(tva1Var, (byte) 27);
            x340Var.s0(objT5);
        }
        qxd0.i(rih1.a, (iu30) objT5, x340Var);
        ay8 ay8VarH = d3p1.H(tva1Var.b, (o3r) tva1Var.c, lsc1Var);
        mwm1 mwm1Var = (mwm1) tva1Var.Z;
        ssm1 ssm1VarQ = YourLibraryContainsRequest.q();
        ssm1VarQ.q(str);
        xs4 xs4Var = new xs4(yoi1.g(mwm1Var.callStream("spotify.your_library_esperanto.proto.YourLibraryService", "StreamContains", ssm1VarQ.build()).map(s9x0.Y0)), str, (byte) 16);
        Object objT6 = x340Var.T();
        if (objT6 == m4cVar) {
            objT6 = new ap51(3, (lnm) null, (byte) 8);
            x340Var.s0(objT6);
        }
        ven0 ven0VarG = rwq.g(new x010(ay8VarH, xs4Var, (xu30) objT6, (byte) 1), new jsc1(new ksc1(null, ""), false), (o8n) null, x340Var, 0, 2);
        ksc1 ksc1Var = ((jsc1) ven0VarG.getValue()).a;
        msc1 msc1Var = new msc1(lsc1Var, ksc1Var.a, ksc1Var.b, ((jsc1) ven0VarG.getValue()).b);
        x340Var.r(false);
        return msc1Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object g(Object obj, Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
        s1f1 s1f1Var = (s1f1) obj2;
        x340 x340Var = (b0k) obj3;
        ((Number) obj4).intValue();
        if (s1f1Var instanceof r1f1) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(1314481357);
            ((vu30) this.b).invoke(x340Var2, 0);
            x340Var2.r(false);
        } else if (s1f1Var instanceof p1f1) {
            x340 x340Var3 = x340Var;
            x340Var3.i0(1314482699);
            ((vu30) this.c).invoke(x340Var3, 0);
            x340Var3.r(false);
        } else {
            if (!(s1f1Var instanceof q1f1)) {
                throw p3d1.k(x340Var, 1314479583, false);
            }
            x340 x340Var4 = x340Var;
            x340Var4.i0(1314484041);
            ((j2i) this.d).invoke(((q1f1) s1f1Var).a, x340Var4, 0);
            x340Var4.r(false);
        }
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        jfe jfeVarA;
        int iIntValue = ((Number) obj).intValue();
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        int iIntValue2 = ((Number) obj4).intValue();
        g7m1 g7m1Var = (g7m1) this.d;
        g7f1 g7f1Var = (g7f1) this.c;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (b0k) obj3;
        x340Var.i0(-814491508);
        jia jiaVar = (jia) ((kia) this.b).d.getValue();
        lnm lnmVar = null;
        if (jiaVar == null) {
            x340Var.i0(2048821436);
            x340Var.r(false);
            jfeVarA = null;
        } else {
            x340Var.i0(-1042287643);
            jfeVarA = jiaVar.a(iIntValue, iIntValue2 & 126, x340Var, zBooleanValue);
            x340Var.r(false);
        }
        if (jfeVarA == null) {
            x340Var.i0(-1042284350);
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = mno1.a(-2, 0, 6);
                x340Var.s0(objT);
            }
            jfeVarA = (jfe) objT;
            boolean zI = x340Var.i(jfeVarA);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new zw11(jfeVarA, (byte) 16);
                x340Var.s0(objT2);
            }
            qxd0.i(rih1.a, (iu30) objT2, x340Var);
        } else {
            x340Var.i0(-1042289093);
        }
        x340Var.r(false);
        ven0 ven0VarS = v8r.s(jfeVarA, x340Var);
        Integer numValueOf = Integer.valueOf(iIntValue);
        boolean zI2 = x340Var.i(g7f1Var) | x340Var.i(g7m1Var) | x340Var.g(ven0VarS);
        Object objT3 = x340Var.T();
        if (zI2 || objT3 == m4cVar) {
            q721 q721Var = new q721(g7f1Var, g7m1Var, ven0VarS, lnmVar, (byte) 21);
            x340Var.s0(q721Var);
            objT3 = q721Var;
        }
        qxd0.t(numValueOf, x340Var, (vu30) objT3);
        x340Var.r(false);
        return jfeVarA;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        jfe jfeVarA;
        int iIntValue = ((Number) obj).intValue();
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        int iIntValue2 = ((Number) obj4).intValue();
        g7m1 g7m1Var = (g7m1) this.d;
        jaf1 jaf1Var = (jaf1) this.c;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (b0k) obj3;
        x340Var.i0(-1067245399);
        jia jiaVar = (jia) ((kia) this.b).d.getValue();
        lnm lnmVar = null;
        if (jiaVar == null) {
            x340Var.i0(1335324543);
            x340Var.r(false);
            jfeVarA = null;
        } else {
            x340Var.i0(874358978);
            jfeVarA = jiaVar.a(iIntValue, iIntValue2 & 126, x340Var, zBooleanValue);
            x340Var.r(false);
        }
        if (jfeVarA == null) {
            x340Var.i0(874362271);
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = mno1.a(-2, 0, 6);
                x340Var.s0(objT);
            }
            jfeVarA = (jfe) objT;
            boolean zI = x340Var.i(jfeVarA);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new zw11(jfeVarA, (byte) 16);
                x340Var.s0(objT2);
            }
            qxd0.i(rih1.a, (iu30) objT2, x340Var);
        } else {
            x340Var.i0(874357528);
        }
        x340Var.r(false);
        ven0 ven0VarS = v8r.s(jfeVarA, x340Var);
        Integer numValueOf = Integer.valueOf(iIntValue);
        boolean zI2 = x340Var.i(jaf1Var) | x340Var.i(g7m1Var) | x340Var.g(ven0VarS);
        Object objT3 = x340Var.T();
        if (zI2 || objT3 == m4cVar) {
            q721 q721Var = new q721(jaf1Var, g7m1Var, ven0VarS, lnmVar, (byte) 23);
            x340Var.s0(q721Var);
            objT3 = q721Var;
        }
        qxd0.t(numValueOf, x340Var, (vu30) objT3);
        x340Var.r(false);
        return jfeVarA;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
        fqg0 fqg0VarU;
        String strN0;
        zam xamVar;
        Uri uri;
        c5g c5gVar;
        Uri uri2;
        String strK;
        jfe jfeVarA;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj5 = this.b;
        Object obj6 = this.c;
        Object obj7 = this.d;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj2).intValue();
                int iIntValue2 = ((Number) obj4).intValue();
                mj0 mj0Var = ((jk0) obj5).a;
                u1p1.h(iIntValue, (hj0) mj0Var.c.get(iIntValue), mj0Var.c.size(), (jkr0) obj6, (iu30) obj7, (b0k) obj3, (iIntValue2 >> 3) & 14);
                return rih1Var;
            case 1:
                hb30 hb30Var = (hb30) obj2;
                x340 x340Var = (b0k) obj3;
                int iIntValue3 = ((Number) obj4).intValue();
                kp5 kp5Var = (kp5) obj6;
                kb30 kb30Var = (kb30) obj5;
                rih1 rih1Var2 = rih1.a;
                boolean z = false;
                if (hb30Var != null) {
                    x340 x340Var2 = x340Var;
                    x340Var2.i0(847118447);
                    boolean z2 = kb30Var == kb30.f;
                    boolean zG = ((((iIntValue3 & 112) ^ 48) > 32 && x340Var2.e(hb30Var.ordinal())) || (iIntValue3 & 48) == 32) | x340Var2.g(kp5Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        xfx xfxVar = (xfx) kp5Var.a;
                        int iOrdinal = hb30Var.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal == 1) {
                                o671 o671Var = (o671) ((kly0) kp5Var.d).get();
                                qzh qzhVarU = voo1.u(xfxVar);
                                mym.q(qzhVarU);
                                fqg0VarU = q1o1.u(o671.a(o671Var, qzhVarU), (qim0) null, new FrameLayout.LayoutParams(z2 ? -2 : -1, -1), 3);
                            } else if (iOrdinal == 2) {
                                v3i0 v3i0Var = (v3i0) ((kly0) kp5Var.e).get();
                                z3i0 z3i0Var = new z3i0(v3i0Var.a, v3i0Var.b, v3i0Var.c, v3i0Var.d, v3i0Var.e, false);
                                z = false;
                                objT = z3i0Var;
                            } else {
                                if (iOrdinal != 3) {
                                    eg.o();
                                    return null;
                                }
                                fzg0 fzg0Var = (fzg0) ((kly0) kp5Var.f).get();
                                objT = fzg0Var.a.r() ? fzg0Var.b.a((w9u0) ((kly0) kp5Var.g).get()) : null;
                                z = false;
                            }
                            x340Var2.s0(objT);
                        } else {
                            v6z0 v6z0Var = (v6z0) ((kly0) kp5Var.c).get();
                            qzh qzhVarO = voo1.o(xfxVar);
                            mym.q(qzhVarO);
                            fqg0VarU = q1o1.u(v6z0Var.a(qzhVarO), (qim0) null, new FrameLayout.LayoutParams(z2 ? -2 : -1, -1), 3);
                        }
                        objT = fqg0VarU;
                        x340Var2.s0(objT);
                    } else {
                        z = false;
                    }
                    xpw xpwVar = (xpw) objT;
                    if (xpwVar != null) {
                        x340Var2.i0(847289319);
                        otw.c(xpwVar, rih1Var2, anm1.N(kb30Var.a, (qim0) obj7), (ipb1) null, x340Var2, 48, 8);
                        x340Var2.r(z);
                    } else {
                        x340Var2.i0(847390224);
                        x340Var2.r(z);
                    }
                    x340Var2.r(z);
                } else {
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(847396176);
                    x340Var3.r(false);
                }
                return rih1Var2;
            case 2:
                ((Number) obj2).intValue();
                x340 x340Var4 = (b0k) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                x340 x340Var5 = x340Var4;
                if (x340Var5.Y(iIntValue4 & 1, (iIntValue4 & 129) != 128)) {
                    zmo1.i(cwl1.o0(x340Var5, ((em0) obj5).W().b()), ((su6) obj6).j, (tob1) obj7, x340Var5, 384);
                } else {
                    x340Var5.b0();
                }
                return rih1Var;
            case 3:
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var6 = (b0k) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                c9n c9nVar = (c9n) obj7;
                m4c m4cVar = fkj0.X;
                jkr0 jkr0Var = (jkr0) obj6;
                float fAbs = Math.abs(((drr0) jkr0Var.d.d).s() + (((err0) jkr0Var.d.c).s() - iIntValue5));
                c380 c380Var = (c380) obj5;
                f27 f27Var = (f27) c380Var.get(iIntValue5);
                if (f27Var.c) {
                    x340 x340Var7 = x340Var6;
                    x340Var7.i0(-192033345);
                    strN0 = cwl1.n0(2131952768, new Object[]{Integer.valueOf(iIntValue5 + 1), Integer.valueOf(c380Var.size())}, x340Var7);
                    x340Var7.r(false);
                } else {
                    x340 x340Var8 = x340Var6;
                    x340Var8.i0(-191917560);
                    strN0 = cwl1.n0(2131952767, new Object[]{Integer.valueOf(iIntValue5 + 1), Integer.valueOf(c380Var.size())}, x340Var8);
                    x340Var8.r(false);
                }
                qim0 qim0VarR = u291.r(nim0Var, 142.0f);
                x340 x340Var9 = x340Var6;
                boolean zD = x340Var9.d(fAbs);
                Object objT2 = x340Var9.T();
                if (zD || objT2 == m4cVar) {
                    objT2 = new jc5((byte) 3, fAbs);
                    x340Var9.s0(objT2);
                }
                qim0 qim0VarC = i541.C(qim0VarR, (iu30) objT2);
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(x340Var9).f;
                qim0 qim0VarQ = i1p1.q(qim0VarC, er31.b(8.0f));
                int i = (iIntValue6 & 112) ^ 48;
                boolean zI = x340Var9.i(c9nVar) | x340Var9.i(jkr0Var) | ((i > 32 && x340Var9.e(iIntValue5)) || (iIntValue6 & 48) == 32);
                Object objT3 = x340Var9.T();
                if (zI || objT3 == m4cVar) {
                    objT3 = new wv1(c9nVar, jkr0Var, iIntValue5, (byte) 4);
                    x340Var9.s0(objT3);
                }
                qim0 qim0VarX = bin.x(qim0VarQ, false, (String) null, (pm31) null, (idn0) null, (Function0) objT3, 15);
                boolean zG2 = ((i > 32 && x340Var9.e(iIntValue5)) || (iIntValue6 & 48) == 32) | x340Var9.g(strN0) | x340Var9.i(jkr0Var);
                Object objT4 = x340Var9.T();
                if (zG2 || objT4 == m4cVar) {
                    objT4 = new gu2(strN0, iIntValue5, jkr0Var, (byte) 4);
                    x340Var9.s0(objT4);
                }
                qim0 qim0VarB = s161.b(qim0VarX, false, (iu30) objT4);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode = Long.hashCode(x340Var9.T);
                xos0 xos0VarM = x340Var9.m();
                qim0 qim0VarE = zr7.E(x340Var9, qim0VarB);
                hzj.A.getClass();
                if (x340Var9.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var9.m0();
                if (x340Var9.S) {
                    x340Var9.l(hmb0.t1);
                } else {
                    x340Var9.v0();
                }
                nko1.H(gfh0VarC, x340Var9, y580.O0);
                nko1.H(xos0VarM, x340Var9, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var9, y580.R0);
                nko1.F(x340Var9);
                nko1.H(qim0VarE, x340Var9, y580.Y);
                eso1.e(Uri.parse(f27Var.a), isl.a, h2c.a.b(nim0Var), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var9, 224304, 0, 4032);
                x340Var9.r(true);
                return rih1Var;
            case 4:
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var10 = (b0k) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                if ((iIntValue8 & 48) == 0) {
                    iIntValue8 |= x340Var10.e(iIntValue7) ? 32 : 16;
                }
                x340 x340Var11 = x340Var10;
                if (x340Var11.Y(iIntValue8 & 1, (iIntValue8 & 145) != 144)) {
                    ((j2a) obj5).b.a(392, (o0i) obj6, (z0i) ((dyc) obj7).a.get(iIntValue7), x340Var11, sgc1.H(2, nim0Var));
                } else {
                    x340Var11.b0();
                }
                return rih1Var;
            case 5:
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var12 = (b0k) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                gwd gwdVar = (gwd) ((List) obj5).get(iIntValue9);
                boolean z3 = ((err0) ((jkr0) obj6).d.c).s() == iIntValue9;
                boolean z4 = (((iIntValue10 & 112) ^ 48) > 32 && x340Var12.e(iIntValue9)) || (iIntValue10 & 48) == 32;
                iu30 iu30Var = (iu30) obj7;
                x340 x340Var13 = x340Var12;
                Object objT5 = x340Var13.T();
                if (z4 || objT5 == fkj0.X) {
                    objT5 = new ewd(new z0e(iu30Var, iIntValue9, (byte) 0));
                    x340Var13.s0(objT5);
                }
                otw.c((ewd) objT5, new gwd(gwdVar.a, gwdVar.b, gwdVar.c, gwdVar.d, gwdVar.e, gwdVar.f, z3), u291.d(nim0Var, 1.0f), (ipb1) null, x340Var13, 0, 8);
                return rih1Var;
            case 6:
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var14 = (b0k) obj3;
                ((Number) obj4).intValue();
                j2i j2iVar = (j2i) obj7;
                c380 c380Var2 = (c380) obj5;
                h5f h5fVar = (h5f) ((iIntValue11 < 0 || iIntValue11 >= c380Var2.size()) ? (h5f) o7h.A0(c380Var2) : c380Var2.get(iIntValue11));
                if (iIntValue11 < 0 || iIntValue11 >= c380Var2.size()) {
                    x340 x340Var15 = x340Var14;
                    x340Var15.i0(1900976565);
                    j2iVar.invoke(h5fVar, x340Var15, 0);
                    x340Var15.r(false);
                } else {
                    x340 x340Var16 = x340Var14;
                    x340Var16.i0(1900895810);
                    ((kd41) obj6).c(h5fVar, apo.r(-1532912915, new a7e(j2iVar, h5fVar, (byte) 14), x340Var16), x340Var16, 48);
                    x340Var16.r(false);
                }
                return rih1Var;
            case 7:
                iu30 iu30Var2 = (iu30) obj2;
                x340 x340Var17 = (b0k) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                int i2 = (iIntValue12 & 6) == 0 ? iIntValue12 | ((iIntValue12 & 8) == 0 ? x340Var17.g(obj) : x340Var17.i(obj) ? 4 : 2) : iIntValue12;
                if ((iIntValue12 & 48) == 0) {
                    i2 |= x340Var17.i(iu30Var2) ? 32 : 16;
                }
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(i2 & 1, (i2 & 147) != 146)) {
                    cir0 cir0Var = (cir0) obj5;
                    k2r0.a(cir0Var, apo.r(1358159328, new m(cir0Var, (yuj) obj6, (j2i) obj7, obj, iu30Var2, (byte) 29), x340Var18), x340Var18, 48);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 8:
                iu30 iu30Var3 = (iu30) obj2;
                x340 x340Var19 = (b0k) obj3;
                int iIntValue13 = ((Number) obj4).intValue();
                int i3 = (iIntValue13 & 6) == 0 ? iIntValue13 | ((iIntValue13 & 8) == 0 ? x340Var19.g(obj) : x340Var19.i(obj) ? 4 : 2) : iIntValue13;
                if ((iIntValue13 & 48) == 0) {
                    i3 |= x340Var19.i(iu30Var3) ? 32 : 16;
                }
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(i3 & 1, (i3 & 147) != 146)) {
                    cir0 cir0Var2 = (cir0) obj5;
                    k2r0.a(cir0Var2, apo.r(2001027895, new sxj(cir0Var2, (kyj) obj6, (j2i) obj7, obj, iu30Var3, (byte) 1), x340Var20), x340Var20, 48);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 9:
                aqb0 aqb0Var = (aqb0) obj;
                ((Number) obj2).intValue();
                x340 x340Var21 = (b0k) obj3;
                int iIntValue14 = ((Number) obj4).intValue();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= x340Var21.g(aqb0Var) ? 4 : 2;
                }
                x340 x340Var22 = x340Var21;
                boolean zY = x340Var22.Y(iIntValue14 & 1, (iIntValue14 & 131) != 130);
                j06 j06Var = x340Var22.a;
                if (!zY) {
                    x340Var22.b0();
                    return rih1Var;
                }
                scr scrVar = (scr) obj6;
                j2i j2iVar2 = (j2i) obj7;
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var22, 0);
                int iHashCode2 = Long.hashCode(x340Var22.T);
                xos0 xos0VarM2 = x340Var22.m();
                qim0 qim0VarE2 = zr7.E(x340Var22, nim0Var);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var22.m0();
                boolean z5 = x340Var22.S;
                n4k n4kVar = hmb0.t1;
                if (z5) {
                    x340Var22.l(n4kVar);
                } else {
                    x340Var22.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(mbhVarA, x340Var22, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM2, x340Var22, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode2);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var22, lljVar3);
                nko1.F(x340Var22);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE2, x340Var22, lljVar4);
                uwr uwrVar2 = cbx.a;
                long j = cbx.a(x340Var22).a.c;
                long jA = cbx.a(x340Var22).a.a.a();
                qim0 qim0VarF = dug.f(nim0Var, j, d4o1.a);
                int i4 = iIntValue14;
                gfh0 gfh0VarC2 = t1c.c(een.d, false);
                int iHashCode3 = Long.hashCode(x340Var22.T);
                xos0 xos0VarM3 = x340Var22.m();
                qim0 qim0VarE3 = zr7.E(x340Var22, qim0VarF);
                x340Var22.m0();
                if (x340Var22.S) {
                    x340Var22.l(n4kVar);
                } else {
                    x340Var22.v0();
                }
                nko1.H(gfh0VarC2, x340Var22, lljVar);
                nko1.H(xos0VarM3, x340Var22, lljVar2);
                x0d.q(iHashCode3, x340Var22, lljVar3, x340Var22);
                nko1.H(qim0VarE3, x340Var22, lljVar4);
                j2iVar2.invoke(aqb0Var, x340Var22, Integer.valueOf(i4 & 14));
                x340Var22.r(true);
                xtb0 xtb0Var = scrVar.b;
                int i5 = u7h.l;
                if (!z4h1.b(j, jA)) {
                    jA = u7h.b;
                }
                p6p1.p(this.b, xtb0Var, u7h.b(jA, 0.5f, 0.0f, 0.0f, 0.0f, 14), (qim0) null, x340Var22, 0);
                x340Var22.r(true);
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                ((Number) obj4).intValue();
                otw.c((g451) obj5, new f451(((rdv) obj6).a, ((hdv) obj7).X), (qim0) null, (ipb1) null, (b0k) obj3, 0, 12);
                return rih1Var;
            case 11:
                b0k b0kVar = (b0k) obj3;
                ((Number) obj4).intValue();
                mod.b(oi7.a.a(((wfx) obj5).a), apo.r(1319591994, new qfx((p811) obj6, (oih) obj7, (fih) obj, (iu30) obj2, (byte) 0), b0kVar), b0kVar, 56);
                return rih1Var;
            case 12:
                ((Number) obj3).intValue();
                return (n8h1) ((xu30) obj7).invoke(new pnl0((String) obj5, (String) obj6, (r6h1) obj4), obj, obj2);
            case 13:
                e340 e340Var = (e340) obj;
                iu30 iu30Var4 = (iu30) obj2;
                x340 x340Var23 = (b0k) obj3;
                int iIntValue15 = ((Number) obj4).intValue();
                int i6 = (iIntValue15 & 6) == 0 ? iIntValue15 | (x340Var23.g(e340Var) ? 4 : 2) : iIntValue15;
                if ((iIntValue15 & 48) == 0) {
                    i6 |= x340Var23.i(iu30Var4) ? 32 : 16;
                }
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(i6 & 1, (i6 & 147) != 146)) {
                    pe peVarA = ef.a(x340Var24);
                    g340 g340Var = (g340) obj5;
                    bjx bjxVar = new bjx(e340Var, iu30Var4, g340Var.a, g340Var.g, (txk0) obj6, (g5l0) obj7, (byte) 6);
                    List list = e340Var.i;
                    n5r0 n5r0Var = e340Var.g;
                    String str = n5r0Var.b;
                    int i7 = e340Var.e;
                    zy9 zy9Var = new zy9(str, i7 != 3);
                    int i8 = e340Var.d;
                    int size = e340Var.b.size();
                    Iterator it = list.iterator();
                    int i9 = 0;
                    while (it.hasNext()) {
                        i9 += ((r3z0) it.next()).d;
                    }
                    m360 m360Var = new m360(i8, size, i9, i7 != 1);
                    int iC = l1d.C(i7);
                    if (iC == 0) {
                        xamVar = new xam(n5r0Var.f);
                    } else {
                        if (iC != 1) {
                            if (iC == 2) {
                                ko41 ko41VarY = brl.y(e340Var);
                                r3z0 r3z0Var = (r3z0) o7h.C0(list);
                                int i10 = r3z0Var != null ? r3z0Var.d : 0;
                                Iterator it2 = e340Var.b().c.iterator();
                                do {
                                    if (it2.hasNext()) {
                                        c5gVar = (c5g) it2.next();
                                    } else {
                                        bhn0.t("Collection contains no element matching the predicate.");
                                    }
                                } while (!c5gVar.a.equals(e340Var.b().d));
                                long jA2 = ko41VarY.a();
                                String str2 = n5r0Var.a;
                                String str3 = c5gVar.b;
                                String str4 = c5gVar.c;
                                if (str4 == null || (uri2 = Uri.parse(str4)) == null) {
                                    uri2 = Uri.EMPTY;
                                }
                                Uri uri3 = uri2;
                                String str5 = (String) sqg0.G(ko41VarY, n5r0Var.d);
                                String str6 = (String) n5r0Var.c.get(brl.y(e340Var));
                                if (i10 > 0) {
                                    uri3.getClass();
                                    xamVar = new uam(str6, i10, str5, jA2, str2, str3, uri3);
                                } else {
                                    String str7 = n5r0Var.e;
                                    uri3.getClass();
                                    xamVar = new vam(str6, str5, str7, jA2, str2, str3, uri3);
                                }
                            } else {
                                eg.o();
                            }
                            return null;
                        }
                        int i11 = (int) e340Var.h;
                        ArrayList<c5g> arrayList = e340Var.b().c;
                        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                        for (c5g c5gVar2 : arrayList) {
                            String str8 = c5gVar2.a;
                            String str9 = c5gVar2.b;
                            String str10 = c5gVar2.c;
                            if (str10 == null || (uri = Uri.parse(str10)) == null) {
                                uri = Uri.EMPTY;
                            }
                            uri.getClass();
                            arrayList2.add(new o9g(uri, str8, str9));
                        }
                        xamVar = new yam(i11, mqo1.F(arrayList2));
                    }
                    sbl.l(new r340(zy9Var, m360Var, xamVar), bjxVar, peVarA.b(7), x340Var24, 0);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 14:
                int iIntValue16 = ((Number) obj2).intValue();
                x340 x340Var25 = (b0k) obj3;
                ((Number) obj4).intValue();
                kv70 kv70Var = (ov70) ((List) obj5).get(iIntValue16);
                if (kv70Var instanceof kv70) {
                    x340 x340Var26 = x340Var25;
                    x340Var26.i0(-288296573);
                    otw.c((tyq) obj6, kv70Var.a, (qim0) null, (ipb1) null, x340Var26, 0, 12);
                    x340Var26.r(false);
                } else {
                    x340 x340Var27 = x340Var25;
                    x340Var27.i0(-288224157);
                    otw.c((c491) obj7, new b491(i491.c), (qim0) null, (ipb1) null, x340Var27, 0, 12);
                    x340Var27.r(false);
                }
                return rih1Var;
            case 15:
                aqb0 aqb0Var2 = (aqb0) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                b0k b0kVar2 = (b0k) obj3;
                ((Number) obj4).intValue();
                iu30 iu30Var5 = (iu30) obj7;
                ((wq80) obj5).g(iu30Var5 != null ? iu30Var5.invoke(Integer.valueOf(iIntValue17)) : null, apo.r(1878821756, new bmu((j2i) obj6, aqb0Var2, iIntValue17, (byte) 2), b0kVar2), b0kVar2, 48);
                return rih1Var;
            case 16:
                int iIntValue18 = ((Number) obj2).intValue();
                b0k b0kVar3 = (b0k) obj3;
                ((Number) obj4).intValue();
                ix90 ix90Var = (ix90) ((List) obj5).get(iIntValue18);
                hqq0.r(ix90Var, (((jx90) obj6) instanceof hx90) && !ix90Var.d, (iu30) obj7, b0kVar3, 8);
                return rih1Var;
            case 17:
                iu30 iu30Var6 = (iu30) obj7;
                mb30 mb30Var = (ob30) obj2;
                x340 x340Var28 = (b0k) obj3;
                ((Number) obj4).intValue();
                if (mb30Var instanceof lb30) {
                    x340 x340Var29 = x340Var28;
                    x340Var29.i0(1833969147);
                    lb30 lb30Var = (lb30) mb30Var;
                    u7n0.h(lb30Var.b, lb30Var.a, lb30Var.c, iu30Var6, (r9u0) obj5, (xym) obj6, (qim0) null, x340Var29, 0);
                    x340Var29.r(false);
                } else if (mb30Var instanceof nb30) {
                    x340 x340Var30 = x340Var28;
                    x340Var30.i0(1833981910);
                    nb30 nb30Var = (nb30) mb30Var;
                    boolean z6 = nb30Var.a;
                    if (nb30Var.b) {
                        strK = x0d.k(x340Var30, 1019026215, 2131957888, x340Var30, false);
                    } else {
                        x340Var30.i0(1019139892);
                        x340Var30.r(false);
                        strK = null;
                    }
                    acq0.q(z6, (qim0) null, (String) null, strK, iu30Var6, x340Var30, 0, 6);
                    x340Var30.r(false);
                } else {
                    if (!(mb30Var instanceof mb30)) {
                        throw p3d1.k(x340Var28, 1833968601, false);
                    }
                    x340 x340Var31 = x340Var28;
                    x340Var31.i0(1833994511);
                    acq0.q(mb30Var.a, (qim0) null, cwl1.o0(x340Var31, 2131957887), cwl1.o0(x340Var31, 2131957888), iu30Var6, x340Var31, 0, 2);
                    x340Var31.r(false);
                }
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                x340 x340Var32 = (b0k) obj3;
                int iIntValue19 = ((Number) obj4).intValue();
                x340 x340Var33 = x340Var32;
                if (x340Var33.Y(iIntValue19 & 1, (iIntValue19 & 129) != 128)) {
                    o4o1.e((mah0) obj5, (ArrayList) obj6, (iu30) obj7, x340Var33, 0);
                } else {
                    x340Var33.b0();
                }
                return rih1Var;
            case 19:
                return a(obj, obj2, obj3, obj4);
            case 20:
                int iIntValue20 = ((Number) obj).intValue();
                int iIntValue21 = ((Number) obj4).intValue();
                ((j2i) obj5).Y((mey0) obj2, Integer.valueOf(iIntValue20), (igi0) obj6, (kgi0) obj7, (b0k) obj3, Integer.valueOf(((iIntValue21 >> 3) & 14) | ((iIntValue21 << 3) & 112)));
                return rih1Var;
            case 21:
                kwq0 kwq0Var = (kwq0) obj2;
                ((Number) obj4).intValue();
                x340 x340Var34 = (b0k) obj3;
                if (kwq0Var == null) {
                    x340Var34.i0(355917944);
                    x340Var34.r(false);
                } else {
                    x340Var34.i0(355917945);
                    kd41 kd41Var = (kd41) obj5;
                    mwq0 mwq0Var = (mwq0) obj6;
                    UUID uuid = kwq0Var.a;
                    kd41Var.c(uuid, apo.r(-660595712, new vvb((j2i) obj7, kwq0Var.b, (byte) 5), x340Var34), x340Var34, 48);
                    boolean zG3 = x340Var34.g(mwq0Var) | x340Var34.i(uuid) | x340Var34.i(kd41Var);
                    Object objT6 = x340Var34.T();
                    if (zG3 || objT6 == fkj0.X) {
                        objT6 = new mvn0((Object) mwq0Var, (Object) kd41Var, (Object) uuid, (byte) 12);
                        x340Var34.s0(objT6);
                    }
                    qxd0.i(uuid, (iu30) objT6, x340Var34);
                    x340Var34.r(false);
                }
                return rih1Var;
            case 22:
                return d(obj, obj2, obj3, obj4);
            case 23:
                b0k b0kVar4 = (b0k) obj3;
                jv71.a((pv71) obj5, (wa5) obj, apo.r(617035829, new yi81((aj81) obj2, (res) obj6, (iu30) obj7), b0kVar4), b0kVar4, 384 | ((((Number) obj4).intValue() << 3) & 112));
                return rih1Var;
            case 24:
                return e(obj, obj2, obj3, obj4);
            case 25:
                return f(obj, obj2, obj3, obj4);
            case 26:
                return g(obj, obj2, obj3, obj4);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return h(obj, obj2, obj3, obj4);
            case 28:
                return i(obj, obj2, obj3, obj4);
            default:
                int iIntValue22 = ((Number) obj).intValue();
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                int iIntValue23 = ((Number) obj4).intValue();
                g7m1 g7m1Var = (g7m1) obj7;
                xbf1 xbf1Var = (xbf1) obj6;
                m4c m4cVar2 = fkj0.X;
                x340 x340Var35 = (b0k) obj3;
                x340Var35.i0(-842776109);
                jia jiaVar = (jia) ((kia) obj5).d.getValue();
                lnm lnmVar = null;
                if (jiaVar == null) {
                    x340Var35.i0(1235863061);
                    x340Var35.r(false);
                    jfeVarA = null;
                } else {
                    x340Var35.i0(1840981868);
                    jfeVarA = jiaVar.a(iIntValue22, iIntValue23 & 126, x340Var35, zBooleanValue);
                    x340Var35.r(false);
                }
                if (jfeVarA == null) {
                    x340Var35.i0(1840985161);
                    Object objT7 = x340Var35.T();
                    if (objT7 == m4cVar2) {
                        objT7 = mno1.a(-2, 0, 6);
                        x340Var35.s0(objT7);
                    }
                    jfeVarA = (jfe) objT7;
                    boolean zI2 = x340Var35.i(jfeVarA);
                    Object objT8 = x340Var35.T();
                    if (zI2 || objT8 == m4cVar2) {
                        objT8 = new zw11(jfeVarA, (byte) 16);
                        x340Var35.s0(objT8);
                    }
                    qxd0.i(rih1Var, (iu30) objT8, x340Var35);
                } else {
                    x340Var35.i0(1840980418);
                }
                x340Var35.r(false);
                ven0 ven0VarS = v8r.s(jfeVarA, x340Var35);
                Integer numValueOf2 = Integer.valueOf(iIntValue22);
                boolean zI3 = x340Var35.i(xbf1Var) | x340Var35.i(g7m1Var) | x340Var35.g(ven0VarS);
                Object objT9 = x340Var35.T();
                if (zI3 || objT9 == m4cVar2) {
                    q721 q721Var = new q721(xbf1Var, g7m1Var, ven0VarS, lnmVar, (byte) 24);
                    x340Var35.s0(q721Var);
                    objT9 = q721Var;
                }
                qxd0.t(numValueOf2, x340Var35, (vu30) objT9);
                x340Var35.r(false);
                return jfeVarA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gk0(Object obj, Object obj2, Object obj3, byte b) {
        super(4);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gk0(wq80 wq80Var, iu30 iu30Var, j2i j2iVar) {
        super(4);
        this.a = (byte) 15;
        this.b = wq80Var;
        this.d = iu30Var;
        this.c = j2iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gk0(jkr0 jkr0Var, c380 c380Var, c9n c9nVar) {
        super(4);
        this.a = (byte) 3;
        this.c = jkr0Var;
        this.b = c380Var;
        this.d = c9nVar;
    }
}
