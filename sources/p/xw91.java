package p;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.mobius.MobiusLoop;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xw91 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw91(ArrayList arrayList, vi11 vi11Var) {
        super(3);
        this.a = (byte) 11;
        this.c = arrayList;
        this.b = vi11Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006d  */
    private final Object a(Object obj, Object obj2, Object obj3) {
        boolean z;
        pef1 pef1Var = (pef1) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        cvt0 cvt0Var = pef1Var.c;
        byte b = 4;
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var.g(pef1Var) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
            PlayerState playerState = (PlayerState) ((tob1) this.c).getValue();
            if (playerState == null || !playerState.isPlaying()) {
                z = false;
            } else {
                if (!u890.j(playerState.contextUri(), cvt0Var.e)) {
                    ContextTrack contextTrack = (ContextTrack) playerState.track().h();
                    if (!u890.j(contextTrack != null ? contextTrack.uri() : null, cvt0Var.e)) {
                        z = false;
                    }
                }
                z = true;
            }
            String str = pef1Var.b;
            boolean z2 = (iIntValue & 14) == 4;
            Object objT = x340Var2.T();
            if (z2 || objT == fkj0.X) {
                objT = new ibf1(pef1Var, b);
                x340Var2.s0(objT);
            }
            dgo1.c(str, (iu30) objT, apo.r(-263426496, new ene1((uef1) this.b, pef1Var, z), x340Var2), x340Var2, 384);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        b0k b0kVar = (b0k) obj2;
        ((Number) obj3).intValue();
        String strO0 = cwl1.o0(b0kVar, 2131963625);
        Function0 function0 = (Function0) this.c;
        if (ihc1.y0(strO0)) {
            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            return null;
        }
        gbx gbxVar = new gbx(new y50(strO0), function0);
        ldx ldxVar = ldx.c;
        yla.r(b0kVar);
        yla.r(b0kVar);
        yla.r(b0kVar);
        wro1.h(gbxVar, ldxVar, anm1.N(String.format("track-list-context-menu-%s", Arrays.copyOf(new Object[]{((crf1) this.b).a}, 1)), nim0.a), (max) null, (gdx) null, uyn1.j(12.0f, 12.0f, 0.0f, 12.0f, 4), false, (idn0) null, (ga80) null, unj.a, b0kVar, 0, 6, 952);
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        qim0 qim0VarF = u291.f(nim0.a, 1.0f);
        d2g1 d2g1Var = (d2g1) this.c;
        xpw xpwVar = (xpw) this.b;
        mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
        hzj.A.getClass();
        x340 x340Var3 = x340Var;
        if (x340Var3.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var3.m0();
        if (x340Var3.S) {
            x340Var3.l(hmb0.t1);
        } else {
            x340Var3.v0();
        }
        nko1.H(mbhVarA, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        x340Var3.i0(-2050832604);
        Iterator it = d2g1Var.f.iterator();
        while (it.hasNext()) {
            otw.c(xpwVar, (plf1) it.next(), (qim0) null, (ipb1) null, x340Var, 0, 12);
        }
        x340Var3.r(false);
        x340Var3.r(true);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object f(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        x340 x340Var;
        lee1 lee1Var;
        iu30 iu30Var = (iu30) this.b;
        i2c i2cVar = (i2c) obj;
        x340 x340Var2 = (b0k) obj2;
        ((Number) obj3).intValue();
        Object obj4 = fkj0.X;
        q9g1 q9g1Var = (q9g1) this.c;
        boolean z = false;
        if (q9g1Var.i) {
            x340Var = x340Var2;
            x340Var.i0(-531122705);
            uwr uwrVar = cbx.a;
            lee1Var = cbx.d(x340Var).k;
        } else {
            x340Var = x340Var2;
            x340Var.i0(-531121520);
            uwr uwrVar2 = cbx.a;
            lee1Var = cbx.d(x340Var).h;
        }
        x340Var.r(false);
        lee1 lee1Var2 = lee1Var;
        x340 x340Var3 = x340Var2;
        wat watVar = (wat) x340Var3.k(t4k.h);
        g930 g930Var = (f930) x340Var3.k(t4k.k);
        zma1 zma1Var = lee1Var2.a;
        FontFamily fontFamily = zma1Var.f;
        FontWeight fontWeight = zma1Var.c;
        if (fontWeight == null) {
            fontWeight = FontWeight.t;
        }
        FontStyle fontStyle = zma1Var.d;
        int i = fontStyle != null ? fontStyle.a : 0;
        FontSynthesis fontSynthesis = zma1Var.e;
        Typeface typeface = (Typeface) g930Var.a(fontFamily, fontWeight, i, fontSynthesis != null ? fontSynthesis.a : 65535).getValue();
        boolean zG = x340Var3.g(lee1Var2) | x340Var3.g(watVar) | x340Var3.g(typeface);
        Object objT = x340Var3.T();
        if (zG || objT == obj4) {
            objT = new xdt0(lee1Var2, watVar, typeface);
            x340Var3.s0(objT);
        }
        xdt0 xdt0Var = (xdt0) objT;
        Integer numValueOf = Integer.valueOf(hjl.i(i2cVar.b));
        boolean zI = x340Var3.i(q9g1Var) | x340Var3.g(iu30Var) | x340Var3.i(i2cVar) | x340Var3.i(xdt0Var);
        Object objT2 = x340Var3.T();
        if (zI || objT2 == obj4) {
            wba1 wba1Var = new wba1(q9g1Var, iu30Var, i2cVar, xdt0Var, null, (byte) 10);
            x340Var3.s0(wba1Var);
            objT2 = wba1Var;
        }
        qxd0.s(numValueOf, lee1Var2, (vu30) objT2, x340Var3);
        n9g1 n9g1Var = q9g1Var.h;
        if (u890.j(n9g1Var, o9g1.a)) {
            x340Var3.i0(-306063913);
            x340Var3.r(false);
        } else {
            if (!(n9g1Var instanceof n9g1)) {
                throw p3d1.k(x340Var3, 544315853, false);
            }
            x340Var3.i0(-305972215);
            jyv0 jyv0Var = n9g1Var.a;
            if (jyv0Var.a.isEmpty()) {
                z = false;
                x340Var3.i0(-304273415);
                x340Var3.r(false);
            } else {
                x340Var3.i0(-305860987);
                boolean zG2 = x340Var3.g(jyv0Var);
                Object objT3 = x340Var3.T();
                if (zG2 || objT3 == obj4) {
                    objT3 = v8r.q(lcg1.c);
                    x340Var3.s0(objT3);
                }
                ven0 ven0Var = (ven0) objT3;
                ven0 ven0VarS = v8r.s(Long.valueOf(q9g1Var.b), x340Var3);
                ven0 ven0VarS2 = v8r.s(Long.valueOf(q9g1Var.c), x340Var3);
                Boolean boolValueOf = Boolean.valueOf(q9g1Var.d);
                boolean zI2 = x340Var3.i(q9g1Var) | x340Var3.i(jyv0Var) | x340Var3.i(ven0VarS) | x340Var3.i(ven0VarS2) | x340Var3.i(ven0Var);
                Object objT4 = x340Var3.T();
                if (zI2 || objT4 == obj4) {
                    qt61 qt61Var = new qt61(q9g1Var, jyv0Var, ven0VarS, ven0VarS2, ven0Var, (lnm) null);
                    x340Var3.s0(qt61Var);
                    objT4 = qt61Var;
                }
                qxd0.s(jyv0Var, boolValueOf, (vu30) objT4, x340Var3);
                vex vexVar = (vex) zex.a.e;
                nb51.n(((lcg1) ven0Var.getValue()).a.a, ((lcg1) ven0Var.getValue()).a.b, ((lcg1) ven0Var.getValue()).b.a, ((lcg1) ven0Var.getValue()).b.b, u7h.f, vexVar.j, q9g1Var.e ? vexVar.d : u7h.j, q9g1Var.j, lee1Var2, x340Var3, 0);
                x340Var3.r(z);
            }
            x340Var3.r(z);
        }
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        otw.c((mxf0) this.c, new jxf0((String) this.b, true, false), (qim0) null, (ipb1) null, (b0k) obj2, 0, 12);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        int i;
        byte b = this.a;
        byte b2 = 22;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                tw91 tw91Var = (tw91) obj5;
                otw.c((ers) obj4, new qw91(tw91Var.a, tw91Var.b, tw91Var.c), (qim0) null, (ipb1) null, (b0k) obj2, 0, 12);
                return rih1Var;
            case 1:
                ((Number) obj3).intValue();
                tw91 tw91Var2 = (tw91) obj5;
                otw.c((lrs) obj4, new bx91(tw91Var2.a, tw91Var2.b, tw91Var2.c), (qim0) null, (ipb1) null, (b0k) obj2, 0, 12);
                return rih1Var;
            case 2:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                nyx.a(2, (wux) null, apo.r(-1565043382, new t0a1((xu30) obj4, (ym90) obj5, (byte) 0), b0kVar), b0kVar, 3078, 6);
                return rih1Var;
            case 3:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                a8a1 a8a1Var = (a8a1) obj4;
                u7h u7hVar = a8a1Var.d;
                uwr uwrVar = cbx.a;
                gaa1.a(u7hVar, cbx.a(b0kVar2).a.c, ((vex) zex.a.e).c, qim0VarF, true, null, apo.r(1863103938, new m7a1(a8a1Var, (iu30) obj5, (byte) 0), b0kVar2), b0kVar2, 1597440, 32);
                return rih1Var;
            case 4:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarN = anm1.N((String) obj4, u291.f(nim0Var, 1.0f));
                cca1 cca1Var = (cca1) obj5;
                gfh0 gfh0VarC = t1c.c(een.d, false);
                x340 x340Var2 = x340Var;
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
                hzj.A.getClass();
                x340 x340Var3 = x340Var;
                if (x340Var3.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(n4kVar);
                } else {
                    x340Var3.v0();
                }
                nko1.H(gfh0VarC, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                crm0.p(cca1Var.a, x340Var, 0);
                x340Var3.r(true);
                return rih1Var;
            case 5:
                x340 x340Var4 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarN2 = anm1.N((String) obj4, u291.f(aqb0.c((aqb0) obj), 1.0f));
                aca1 aca1Var = (aca1) obj5;
                gfh0 gfh0VarC2 = t1c.c(een.d, false);
                x340 x340Var5 = x340Var4;
                int iHashCode2 = Long.hashCode(x340Var5.T);
                xos0 xos0VarM2 = x340Var5.m();
                qim0 qim0VarE2 = zr7.E(x340Var4, qim0VarN2);
                hzj.A.getClass();
                x340 x340Var6 = x340Var4;
                if (x340Var6.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var6.m0();
                if (x340Var6.S) {
                    x340Var6.l(n4kVar);
                } else {
                    x340Var6.v0();
                }
                nko1.H(gfh0VarC2, x340Var4, y580.O0);
                nko1.H(xos0VarM2, x340Var4, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var4, y580.R0);
                nko1.F(x340Var4);
                nko1.H(qim0VarE2, x340Var4, y580.Y);
                u7n0.p(aca1Var.b, x340Var4, 0);
                x340Var6.r(true);
                return rih1Var;
            case 6:
                i2c i2cVar = (i2c) obj;
                ((Number) obj3).intValue();
                eab1 eab1Var = (eab1) obj4;
                ekt ektVar = eab1Var.b;
                gra graVar = een.t;
                x340 x340Var7 = (b0k) obj2;
                x340Var7.i0(599345081);
                for (int i2 = 2; -1 < i2; i2--) {
                    int[] iArrH = l1d.H(3);
                    int length = iArrH.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length) {
                            int i4 = iArrH[i3];
                            if (td6.d(i4) == i2) {
                                i = i4;
                            } else {
                                i3++;
                            }
                        } else {
                            i = 0;
                        }
                    }
                    if (i == 0) {
                        x340Var7.i0(1399888499);
                        x340Var7.r(false);
                    } else {
                        x340Var7.i0(1399888500);
                        rrn1.c(i, (o17) o7h.t0(td6.d(i), eab1Var.a), i2cVar.d(), ektVar != null, i2cVar.a(u291.d(nim0Var, 1.0f), een.d), x340Var7, 0);
                        x340Var7.r(false);
                    }
                }
                x340Var7.r(false);
                if (ektVar instanceof ekt) {
                    x340Var7.i0(599365889);
                    rrn1.g((Drawable) ((iu30) obj5).invoke(ektVar.d), i2cVar.d(), i2cVar.a(nim0Var, graVar), x340Var7, 0);
                    x340Var7.r(false);
                } else if (ektVar instanceof hkt) {
                    x340Var7.i0(599375313);
                    rrn1.h(((hkt) ektVar).d, i2cVar.d(), i2cVar.a(nim0Var, graVar), x340Var7, 0);
                    x340Var7.r(false);
                } else {
                    boolean z = ektVar instanceof ikt;
                    hcx hcxVar = hcx.b;
                    if (z) {
                        x340Var7.i0(1401027037);
                        ikt iktVar = (ikt) ektVar;
                        bmq0.a(Uri.parse(iktVar.d), u291.m(i2cVar.a(nim0Var, graVar), i2cVar.d() * 0.373f), hcxVar, iktVar.e, iktVar.f, 0L, 0L, false, x340Var7, 384, 224);
                        x340Var7.r(false);
                    } else if (ektVar instanceof gkt) {
                        x340Var7.i0(1401493494);
                        ArrayList<ikt> arrayList = ((gkt) ektVar).d;
                        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                        for (ikt iktVar2 : arrayList) {
                            arrayList2.add(new phx(8, 0L, iktVar2.d, iktVar2.e, iktVar2.f));
                        }
                        shx.a(mqo1.A(arrayList2), u291.m(i2cVar.a(nim0Var, graVar), i2cVar.d() * 0.373f), hcxVar, (idn0) null, x340Var7, 392, 56);
                        x340Var7.r(false);
                    } else {
                        if (ektVar != null) {
                            throw p3d1.k(x340Var7, 599363122, false);
                        }
                        x340Var7.i0(599417949);
                        x340Var7.r(false);
                    }
                }
                return rih1Var;
            case 7:
                x340 x340Var8 = (b0k) obj2;
                ((Number) obj3).intValue();
                if (((f371) obj4) instanceof e371) {
                    x340 x340Var9 = x340Var8;
                    x340Var9.i0(103682657);
                    f3o1.d(0, (Function0) obj5, x340Var9, (qim0) null);
                    x340Var9.r(false);
                } else {
                    x340 x340Var10 = x340Var8;
                    x340Var10.i0(103739356);
                    x340Var10.r(false);
                }
                return rih1Var;
            case 8:
                x340 x340Var11 = (b0k) obj2;
                ((Number) obj3).intValue();
                iu30 iu30Var = (iu30) obj5;
                String strO0 = cwl1.o0(x340Var11, 2131963810);
                boolean z2 = ((bsc1) obj4).a == null;
                x340 x340Var12 = x340Var11;
                boolean zG = x340Var12.g(iu30Var);
                Object objT = x340Var12.T();
                if (zG || objT == fkj0.X) {
                    objT = new pba1(iu30Var, (byte) 28);
                    x340Var12.s0(objT);
                }
                gbx gbxVar = new gbx(z50.c, (Function0) objT);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar = cbx.b(x340Var12).b;
                ozn1.f(strO0, gbxVar, uyn1.z(8.0f, 0.0f, 2, nim0Var), z2, x340Var12, 0);
                return rih1Var;
            case 9:
                ((Number) obj3).intValue();
                ((q7r0) obj4).d(dj20.d(28, ((hsc1) obj5).b.a, "UNKNOWN", (String) null, (sg90) null), (tv80) null, (Bundle) null);
                return rih1Var;
            case 10:
                x340 x340Var13 = (b0k) obj2;
                ((Number) obj3).intValue();
                era eraVar = een.Q0;
                uwr uwrVar3 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var13).b;
                d36 d36Var = new d36(16.0f, true, new um5(false));
                qim0 qim0Var = (qim0) ((iu30) obj4).invoke(u291.d(nim0Var, 1.0f));
                j2i j2iVar = (j2i) obj5;
                mbh mbhVarA = jbh.a(d36Var, eraVar, x340Var13, 0);
                x340 x340Var14 = x340Var13;
                int iHashCode3 = Long.hashCode(x340Var14.T);
                xos0 xos0VarM3 = x340Var14.m();
                qim0 qim0VarE3 = zr7.E(x340Var13, qim0Var);
                hzj.A.getClass();
                x340 x340Var15 = x340Var13;
                if (x340Var15.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var15.m0();
                if (x340Var15.S) {
                    x340Var15.l(n4kVar);
                } else {
                    x340Var15.v0();
                }
                nko1.H(mbhVarA, x340Var13, y580.O0);
                nko1.H(xos0VarM3, x340Var13, y580.N0);
                nko1.H(Integer.valueOf(iHashCode3), x340Var13, y580.R0);
                nko1.F(x340Var13);
                nko1.H(qim0VarE3, x340Var13, y580.Y);
                j2iVar.invoke(x340Var13, 0);
                x340Var15.r(true);
                return rih1Var;
            case 11:
                vi11 vi11Var = (vi11) obj5;
                ArrayList arrayList3 = (ArrayList) obj4;
                vzq0 vzq0Var = (vzq0) obj;
                x340 x340Var16 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if (u1p1.y(x340Var16)) {
                    x340 x340Var17 = x340Var16;
                    x340Var17.i0(470875925);
                    xto1.v(arrayList3, vi11Var, vzq0Var, x340Var17, (iIntValue << 6) & 896);
                    x340Var17.r(false);
                } else {
                    x340 x340Var18 = x340Var16;
                    x340Var18.i0(471045495);
                    gto1.j(arrayList3, vi11Var, vzq0Var, x340Var18, (iIntValue << 6) & 896);
                    x340Var18.r(false);
                }
                return rih1Var;
            case 12:
                int iIntValue2 = ((Number) obj).intValue();
                x340 x340Var19 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                ryc1 ryc1Var = (ryc1) obj5;
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= x340Var19.e(iIntValue2) ? 4 : 2;
                }
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    qyc1 qyc1Var = (qyc1) ((Map) obj4).get(Integer.valueOf(iIntValue2));
                    Integer numValueOf = Integer.valueOf(iIntValue2);
                    int i5 = iIntValue3 & 14;
                    boolean zE = x340Var20.e(qyc1Var == null ? -1 : qyc1Var.ordinal()) | x340Var20.i(ryc1Var) | (i5 == 4);
                    Object objT2 = x340Var20.T();
                    if (zE || objT2 == m4cVar) {
                        objT2 = new ju01(qyc1Var, ryc1Var, iIntValue2, (byte) 9);
                        x340Var20.s0(objT2);
                    }
                    iu30 iu30Var2 = (iu30) objT2;
                    ryc1 ryc1Var2 = (ryc1) obj5;
                    boolean zI = x340Var20.i(ryc1Var2);
                    Object objT3 = x340Var20.T();
                    if (zI || objT3 == m4cVar) {
                        objT3 = new k7b1(1, ryc1Var2, ryc1.class, "stopImpression", "stopImpression(Lcom/spotify/ubi/logger/ImpressionToken;)V", 0, (byte) 7);
                        x340Var20.s0(objT3);
                    }
                    yhm1.a(numValueOf, iu30Var2, (iu30) objT3, x340Var20, i5);
                    ven0 ven0VarS = v8r.s(x340Var20.k(yhm1.a), x340Var20);
                    Object objT4 = x340Var20.T();
                    if (objT4 == m4cVar) {
                        objT4 = bb00.h(iIntValue2, x340Var20);
                    }
                    hdn0 hdn0Var = (hdn0) objT4;
                    Integer numValueOf2 = Integer.valueOf(iIntValue2);
                    boolean zE2 = x340Var20.e(qyc1Var != null ? qyc1Var.ordinal() : -1) | x340Var20.g(ven0VarS) | (i5 == 4) | x340Var20.i(ryc1Var);
                    ryc1 ryc1Var3 = (ryc1) obj5;
                    Object objT5 = x340Var20.T();
                    if (zE2 || objT5 == m4cVar) {
                        objT5 = new yi3(iIntValue2, ven0VarS, qyc1Var, ryc1Var3, hdn0Var, (lnm) null);
                        x340Var20.s0(objT5);
                    }
                    qxd0.t(numValueOf2, x340Var20, (vu30) objT5);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 13:
                ((Number) obj3).intValue();
                mf60 mf60Var = (mf60) obj4;
                x340 x340Var21 = (b0k) obj2;
                boolean zG2 = x340Var21.g(mf60Var);
                vi11 vi11Var2 = (vi11) obj5;
                Object objT6 = x340Var21.T();
                if (zG2 || objT6 == fkj0.X) {
                    objT6 = hso1.s(mf60Var, vi11Var2);
                    x340Var21.s0(objT6);
                }
                xpw xpwVar = (xpw) objT6;
                if (xpwVar == null) {
                    x340Var21.i0(828521632);
                    x340Var21.r(false);
                } else {
                    x340Var21.i0(828521633);
                    otw.c(xpwVar, (mf60) obj4, u291.f(nim0Var, 1.0f), (ipb1) null, x340Var21, 64, 8);
                    x340Var21.r(false);
                }
                return rih1Var;
            case 14:
                apd apdVar = (apd) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                ouk0 ouk0Var = (ouk0) obj3;
                y6h1 y6h1Var = ouk0Var.b;
                qhd1 qhd1Var = (qhd1) obj4;
                yod yodVarB = ((fpd) obj5).b();
                t64 t64Var = qhd1Var.X;
                i8h1 i8h1Var = qhd1Var.i;
                if (yodVarB != null) {
                    qhd1Var.Z.o(new qy(qyo1.G(yodVarB), yodVarB.a));
                }
                j80 j80Var = apdVar.d;
                boolean z3 = j80Var instanceof n80;
                b7x b7xVar = b7x.a;
                if (z3) {
                    if (j80Var instanceof j80) {
                        j80 j80Var2 = j80Var;
                        String str = j80Var2.b;
                        if (str == null) {
                            str = j80Var2.a;
                        }
                        String str2 = str;
                        Integer numValueOf3 = Integer.valueOf(iIntValue4);
                        x6h1 x6h1VarC = y6h1Var.c();
                        x6h1VarC.i.add(new a7h1("item", (String) null, numValueOf3, str2, (String) null));
                        x6h1VarC.j = true;
                        w7h1 w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str2 != null ? str2 : "")), x6h1VarC.a(), ouk0Var.a, System.currentTimeMillis());
                        tv80 tv80VarM = i8h1Var.m(w7h1Var, (xj61) null);
                        t64Var.a(w7h1Var, tv80VarM.a);
                        MobiusLoop mobiusLoop = qhd1Var.T0;
                        if (mobiusLoop != null) {
                            mym.l(mobiusLoop, new pgd1(j80Var2, qhd1Var.h().a(), tv80VarM));
                        }
                    }
                } else if (j80Var instanceof g80) {
                    g80 g80Var = (g80) j80Var;
                    String uri = g80Var.a.getUri();
                    Integer numValueOf4 = Integer.valueOf(iIntValue4);
                    x6h1 x6h1VarC2 = y6h1Var.c();
                    x6h1VarC2.i.add(new a7h1("item", (String) null, numValueOf4, uri, (String) null));
                    x6h1VarC2.j = true;
                    w7h1 w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", uri != null ? uri : "")), x6h1VarC2.a(), ouk0Var.a, System.currentTimeMillis());
                    ou80 ou80Var = i8h1Var.m(w7h1Var2, (xj61) null).a;
                    t64Var.a(w7h1Var2, ou80Var);
                    MobiusLoop mobiusLoop2 = qhd1Var.T0;
                    if (mobiusLoop2 != null) {
                        mym.l(mobiusLoop2, new lgd1(g80Var, ou80Var));
                    }
                } else if (!(j80Var instanceof o80)) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case 15:
                nbh nbhVar = (nbh) obj;
                x340 x340Var22 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar4 = cbx.a;
                op71.g(x340Var22, u291.h(nim0Var, cbx.b(x340Var22).b.c));
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                cua cuaVar = cbx.b(x340Var22).f;
                qim0 qim0VarQ = i1p1.q(qim0VarF2, er31.b(8.0f));
                Uri uri2 = Uri.parse("https://cdn-spotify-gen-alpha.spotifycdn.com/kids-graduation/TeenAccessAt16.webp");
                as80 as80Var = mif1.P0;
                cbx.a.getClass();
                eso1.e(uri2, isl.a, qim0VarQ, (p3v) null, (zvx) null, uwr.d(), as80Var, (tl3) null, (ColorFilter) null, oux.a, false, false, x340Var22, 3120, 0, 3472);
                cvx cvxVar3 = cbx.b(x340Var22).b;
                String strN = eqq.n(nim0Var, 16.0f, x340Var22, 2131963115, x340Var22);
                lee1 lee1Var = cbx.d(x340Var22).c;
                long j = cbx.a(x340Var22).b.a;
                qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
                x340 x340Var23 = x340Var22;
                Object objT7 = x340Var23.T();
                if (objT7 == fkj0.X) {
                    objT7 = pod1.a1;
                    x340Var23.s0(objT7);
                }
                uwo1.e(strN, s161.b(qim0VarF3, false, (iu30) objT7), lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var22, 0, 0, 2032);
                cvx cvxVar4 = cbx.b(x340Var22).b;
                uwo1.e(eqq.n(nim0Var, 8.0f, x340Var22, 2131963113, x340Var22), u291.f(nim0Var, 1.0f), cbx.d(x340Var22).e, cbx.a(x340Var22).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var22, 0, 0, 2032);
                op71.g(x340Var22, u291.h(nim0Var, cbx.b(x340Var22).b.b));
                cvx cvxVar5 = cbx.b(x340Var22).b;
                mbh mbhVarA2 = jbh.a(new d36(16.0f, true, new um5(false)), een.P0, x340Var22, 0);
                int iHashCode4 = Long.hashCode(x340Var23.T);
                xos0 xos0VarM4 = x340Var23.m();
                qim0 qim0VarE4 = zr7.E(x340Var22, nim0Var);
                hzj.A.getClass();
                if (x340Var23.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var23.m0();
                if (x340Var23.S) {
                    x340Var23.l(n4kVar);
                } else {
                    x340Var23.v0();
                }
                nko1.H(mbhVarA2, x340Var22, y580.O0);
                nko1.H(xos0VarM4, x340Var22, y580.N0);
                nko1.H(Integer.valueOf(iHashCode4), x340Var22, y580.R0);
                nko1.F(x340Var22);
                nko1.H(qim0VarE4, x340Var22, y580.Y);
                n1p1.c(uox.c, 2131963112, 2131963111, x340Var22, uox.d);
                n1p1.c(tnx.c, 2131963110, 2131963109, x340Var22, tnx.d);
                x340Var23.r(true);
                op71.g(x340Var22, nbhVar.a(1.0f, nim0Var, true));
                foo1.c(new gbx(z50.c, (Function0) obj4), new idx(6), anm1.N("teen_access_message_button", uyn1.B(nbhVar.c(een.Q0, nim0Var), 0.0f, cbx.b(x340Var22).b.b, 0.0f, 0.0f, 13)), (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, qmj.a, x340Var22, 0, 48, 2040);
                cvx cvxVar6 = cbx.b(x340Var22).b;
                String strN2 = eqq.n(nim0Var, 8.0f, x340Var22, 2131963114, x340Var22);
                i8p1.i(cwl1.n0(2131963108, new Object[]{strN2}, x340Var22), mqo1.s(new mae1[]{new mae1(strN2, "https://support.spotify.com/article/managed-accounts/plain/")}), (iu30) obj5, u291.f(nim0Var, 1.0f), lee1.a(cbx.d(x340Var22).m, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 3, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16744447), 0L, cbx.a(x340Var22).b.b, x340Var22, 0, 32);
                return rih1Var;
            case 16:
                i2c i2cVar2 = (i2c) obj;
                x340 x340Var24 = (b0k) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= x340Var24.g(i2cVar2) ? 4 : 2;
                }
                x340 x340Var25 = x340Var24;
                if (x340Var25.Y(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    p3v p3vVarJ = zjy.j(i2cVar2.c(), new p3v(i2cVar2.d() / 0.9735099f));
                    yk4 yk4Var = new yk4(((yj41) obj4).a);
                    cbx.a.getClass();
                    ecx ecxVar = new ecx(0.9735099f);
                    uwr uwrVar5 = cbx.a;
                    cua cuaVar2 = cbx.b(x340Var25).f;
                    cua cuaVar3 = cbx.b(x340Var25).f;
                    eso1.f(yk4Var, isl.a, (qim0) obj5, p3vVarJ, new zvx(), ecxVar, (j6m) null, (tl3) null, (ColorFilter) null, x340Var25, 48, 448);
                } else {
                    x340Var25.b0();
                }
                return rih1Var;
            case 17:
                ((Number) obj3).intValue();
                nln.h((q8f1) obj4, (Integer) obj5, (qim0) null, (b0k) obj2, 8);
                return rih1Var;
            case 18:
                x340 x340Var26 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                WeakHashMap weakHashMap = osl1.x;
                qim0 qim0VarH = l6o1.H(uyn1.z(16.0f, 0.0f, 2, uyn1.w(voo1.y(too1.j(qim0VarD, lhc.g(x340Var26).g), voo1.f), (vzq0) obj)), l6o1.C(0, 0, 1, x340Var26), false, 14);
                era eraVar2 = een.Q0;
                j2i j2iVar2 = (j2i) obj4;
                xu30 xu30Var = (xu30) obj5;
                f36 f36Var = h36.c;
                mbh mbhVarA3 = jbh.a(f36Var, eraVar2, x340Var26, 0);
                x340 x340Var27 = x340Var26;
                int iHashCode5 = Long.hashCode(x340Var27.T);
                xos0 xos0VarM5 = x340Var27.m();
                qim0 qim0VarE5 = zr7.E(x340Var26, qim0VarH);
                hzj.A.getClass();
                x340 x340Var28 = x340Var26;
                if (x340Var28.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var28.m0();
                if (x340Var28.S) {
                    x340Var28.l(n4kVar);
                } else {
                    x340Var28.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(mbhVarA3, x340Var26, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM5, x340Var26, lljVar2);
                Integer numValueOf5 = Integer.valueOf(iHashCode5);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf5, x340Var26, lljVar3);
                nko1.F(x340Var26);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE5, x340Var26, lljVar4);
                x340Var28.i0(894744700);
                x340Var28.r(false);
                pbh pbhVar = pbh.a;
                op71.g(x340Var26, pbhVar.a(1.0f, nim0Var, true));
                mbh mbhVarA4 = jbh.a(f36Var, eraVar2, x340Var26, 0);
                int iHashCode6 = Long.hashCode(x340Var28.T);
                xos0 xos0VarM6 = x340Var28.m();
                qim0 qim0VarE6 = zr7.E(x340Var26, nim0Var);
                x340Var28.m0();
                if (x340Var28.S) {
                    x340Var28.l(n4kVar);
                } else {
                    x340Var28.v0();
                }
                nko1.H(mbhVarA4, x340Var26, lljVar);
                nko1.H(xos0VarM6, x340Var26, lljVar2);
                i3a.l(iHashCode6, x340Var26, lljVar3, x340Var26);
                nko1.H(qim0VarE6, x340Var26, lljVar4);
                j2iVar2.invoke(pbhVar, x340Var26, 6);
                boolean z4 = true;
                x340Var28.r(true);
                op71.g(x340Var26, pbhVar.a(1.0f, nim0Var, true));
                if (xu30Var != null) {
                    x340Var28.i0(895114623);
                    qim0 qim0VarZ = uyn1.z(0.0f, 16.0f, 1, nim0Var);
                    mbh mbhVarA5 = jbh.a(f36Var, eraVar2, x340Var26, 0);
                    int iHashCode7 = Long.hashCode(x340Var28.T);
                    xos0 xos0VarM7 = x340Var28.m();
                    qim0 qim0VarE7 = zr7.E(x340Var26, qim0VarZ);
                    x340Var28.m0();
                    if (x340Var28.S) {
                        x340Var28.l(n4kVar);
                    } else {
                        x340Var28.v0();
                    }
                    nko1.H(mbhVarA5, x340Var26, lljVar);
                    nko1.H(xos0VarM7, x340Var26, lljVar2);
                    i3a.l(iHashCode7, x340Var26, lljVar3, x340Var26);
                    nko1.H(qim0VarE7, x340Var26, lljVar4);
                    xu30Var.invoke(pbhVar, x340Var26, 6);
                    z4 = true;
                    x340Var28.r(true);
                    x340Var28.r(false);
                } else {
                    x340Var28.i0(895296252);
                    x340Var28.r(false);
                }
                x340Var28.r(z4);
                return rih1Var;
            case 19:
                i2c i2cVar3 = (i2c) obj;
                x340 x340Var29 = (b0k) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                tob1 tob1Var = (tob1) obj5;
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= x340Var29.g(i2cVar3) ? 4 : 2;
                }
                x340 x340Var30 = x340Var29;
                if (x340Var30.Y(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    p3v p3vVarJ2 = zjy.j(i2cVar3.c(), new p3v(i2cVar3.d()));
                    yk4 yk4Var2 = new yk4(((gcf1) ((thd0) obj4).c).a.a);
                    cbx.a.getClass();
                    ecx ecxVarA = uwr.a();
                    boolean zG3 = x340Var30.g(tob1Var);
                    Object objT8 = x340Var30.T();
                    if (zG3 || objT8 == fkj0.X) {
                        objT8 = new ctd1(tob1Var, (byte) 22);
                        x340Var30.s0(objT8);
                    }
                    eso1.f(yk4Var2, isl.a, i541.C(nim0Var, (iu30) objT8), p3vVarJ2, (zvx) null, ecxVarA, (j6m) null, (tl3) null, (ColorFilter) null, x340Var30, 24624, 448);
                } else {
                    x340Var30.b0();
                }
                return rih1Var;
            case 20:
                i2c i2cVar4 = (i2c) obj;
                x340 x340Var31 = (b0k) obj2;
                int iIntValue7 = ((Number) obj3).intValue();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= x340Var31.g(i2cVar4) ? 4 : 2;
                }
                x340 x340Var32 = x340Var31;
                if (x340Var32.Y(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    f311 f311Var = (f311) ((ce6) obj4).c;
                    rk41 rk41Var = (rk41) obj5;
                    Object objT9 = x340Var32.T();
                    if (objT9 == fkj0.X) {
                        objT9 = q9f1.f;
                        x340Var32.s0(objT9);
                    }
                    f311Var.a(i2cVar4, 0, rk41Var, (Function0) objT9, x340Var32, (iIntValue7 & 14) | 3120);
                } else {
                    x340Var32.b0();
                }
                return rih1Var;
            case 21:
                x340 x340Var33 = (b0k) obj2;
                int iIntValue8 = ((Number) obj3).intValue();
                htg0 htg0Var = (htg0) obj4;
                x340 x340Var34 = x340Var33;
                if (x340Var34.Y(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    String str3 = htg0Var.b;
                    boolean zG4 = x340Var34.g(htg0Var);
                    iu30 iu30Var3 = (iu30) obj5;
                    Object objT10 = x340Var34.T();
                    if (zG4 || objT10 == fkj0.X) {
                        objT10 = new x0e1(iu30Var3, htg0Var, b2);
                        x340Var34.s0(objT10);
                    }
                    mp10.i(0, str3, (Function0) objT10, x340Var34);
                } else {
                    x340Var34.b0();
                }
                return rih1Var;
            case 22:
                return a(obj, obj2, obj3);
            case 23:
                ((Number) obj3).intValue();
                x760.i((zff1) obj4, (Integer) obj5, (qim0) null, (b0k) obj2, 8);
                return rih1Var;
            case 24:
                return d(obj, obj2, obj3);
            case 25:
                ((Number) obj3).intValue();
                crm0.s((crf1) obj4, (srt0) obj5, (qim0) null, (b0k) obj2, 8);
                return rih1Var;
            case 26:
                return e(obj, obj2, obj3);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return f(obj, obj2, obj3);
            case 28:
                return g(obj, obj2, obj3);
            default:
                b0k b0kVar3 = (b0k) obj2;
                ((Number) obj3).intValue();
                px6 px6Var = new px6(((gtc1) ((psy) obj4).f).a, (byte) 9);
                qim0 qim0VarF4 = u291.f(nim0Var, 1.0f);
                uwr uwrVar6 = cbx.a;
                cvx cvxVar7 = cbx.b(b0kVar3).b;
                otw.c(q1o1.u(px6Var, eqr0.D(-16.0f, 0.0f, 2, qim0VarF4), new FrameLayout.LayoutParams(-1, -2), 2), (nzf1) obj5, (qim0) null, (ipb1) null, b0kVar3, 0, 12);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xw91(Object obj, Object obj2, byte b) {
        super(3);
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }
}
