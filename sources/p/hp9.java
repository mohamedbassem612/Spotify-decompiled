package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hp9 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hp9(Object obj, byte b) {
        super(4);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:208:0x0657  */
    /* JADX WARN: Code duplicated, block: B:212:0x066a  */
    /* JADX WARN: Code duplicated, block: B:216:0x067a  */
    /* JADX WARN: Code duplicated, block: B:220:0x068b  */
    /* JADX WARN: Code duplicated, block: B:223:0x0693  */
    /* JADX WARN: Code duplicated, block: B:224:0x0695  */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        Object obj5;
        w7h1 w7h1Var;
        Object obj6;
        dx9 ex9Var;
        tob1 tob1Var;
        boolean z;
        enb enbVar;
        dnb dnbVar;
        fnb fnbVar;
        fnb fnbVar2;
        boolean z2;
        eob eobVar;
        dob dobVar;
        jo70 jo70Var;
        io70 io70Var;
        String strY0;
        i861 h861Var;
        Object obj7;
        Object obj8;
        Single singleJust;
        Single map;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        byte b2 = 2;
        byte b3 = 1;
        b3 = 1;
        String str = null;
        Object obj9 = this.b;
        switch (b) {
            case 0:
                ill0 ill0Var = (ill0) obj;
                fp9 fp9Var = (fp9) obj3;
                String str2 = ((ip9) obj9).b.a.h;
                if (str2 != null) {
                    return fp9Var.a ? ill0Var.e(str2) : ill0Var.i(str2);
                }
                return null;
            case 1:
                uil0 uil0Var = (uil0) obj;
                Object value = ((ip9) obj9).b.u.a.getValue();
                jp9 jp9Var = value instanceof jp9 ? (jp9) value : null;
                return uil0Var.e(Integer.valueOf((int) (jp9Var != null ? jp9Var.a : 0L)));
            case 2:
                vil0 vil0Var = (vil0) obj;
                Object value2 = ((ip9) obj9).b.u.a.getValue();
                jp9 jp9Var2 = value2 instanceof jp9 ? (jp9) value2 : null;
                return vil0Var.e(Integer.valueOf((int) (jp9Var2 != null ? jp9Var2.a : 0L)));
            case 3:
                return ((pil0) obj).e(Integer.valueOf((int) ((sq9) obj4).a), Integer.valueOf((int) ((tq9) obj3).a(((yqg) ((tm) obj9).e).b())));
            case 4:
                cs9 cs9Var = (cs9) obj;
                bs9 bs9Var = (bs9) obj3;
                zr9 zr9Var = (zr9) obj4;
                rm9 rm9Var = ((ds9) obj9).a;
                boolean z3 = zr9Var instanceof yr9;
                b7x b7xVar = b7x.a;
                if (!z3) {
                    if (zr9Var.equals(xr9.a)) {
                        String str3 = rm9Var.a.h;
                        if (str3 != null) {
                            y6h1 y6h1Var = y6h1.i;
                            x6h1 x6h1VarI = i3o1.i();
                            x6h1VarI.h = "music";
                            x6h1VarI.a = "mobile-byom-npv";
                            x6h1VarI.f = "1.2.0";
                            x6h1VarI.g = "22.0.0";
                            x6h1VarI.d = str3;
                            x6h1 x6h1VarR = kk0.r(x6h1VarI, "byom/nowplaying");
                            x6h1VarR.i.add(new a7h1("end_session_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarR.j = false;
                            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("stop", 1, Collections.singletonMap("item_to_be_stopped", str3)), x6h1VarR.a(), r6h1.c, System.currentTimeMillis());
                        }
                        obj5 = null;
                    } else if (zr9Var instanceof wr9) {
                        String str4 = rm9Var.a.h;
                        if (str4 != null) {
                            y6h1 y6h1Var2 = y6h1.i;
                            x6h1 x6h1VarI2 = i3o1.i();
                            x6h1VarI2.h = "music";
                            x6h1VarI2.a = "mobile-byom-npv";
                            x6h1VarI2.f = "1.2.0";
                            x6h1VarI2.g = "22.0.0";
                            x6h1VarI2.d = str4;
                            y6h1 y6h1VarA = x6h1VarI2.a();
                            Collections.singletonList("byom/nowplaying");
                            int iC = l1d.C(bs9Var.a);
                            if (iC == 0) {
                                x6h1 x6h1VarC = y6h1VarA.c();
                                x6h1VarC.i.add(new a7h1("video_player", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC.j = false;
                                y6h1 y6h1VarA2 = x6h1VarC.a();
                                w7h1Var = ((wr9) zr9Var).a ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA2, r6h1.c, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA2, r6h1.c, System.currentTimeMillis());
                            } else if (iC == 1) {
                                r6h1 r6h1Var = r6h1.c;
                                r6h1 r6h1Var2 = new r6h1(kk0.l(y6h1VarA), (u8h1) null);
                                x6h1 x6h1VarI3 = i3o1.i();
                                x6h1VarI3.h = "music";
                                x6h1VarI3.a = "mobile-byom-fullscreen";
                                x6h1VarI3.f = "2.0.0";
                                x6h1VarI3.g = "22.0.0";
                                x6h1VarI3.d = str4;
                                x6h1 x6h1VarC2 = x6h1VarI3.a().c();
                                x6h1VarC2.i.add(new a7h1("video_player", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC2.j = false;
                                y6h1 y6h1VarA3 = x6h1VarC2.a();
                                w7h1Var = ((wr9) zr9Var).a ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA3, r6h1Var2, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA3, r6h1Var2, System.currentTimeMillis());
                            } else {
                                obj5 = null;
                                eg.o();
                            }
                        } else {
                            obj5 = null;
                        }
                    } else {
                        obj5 = null;
                        eg.o();
                    }
                    return obj5;
                }
                r6h1 r6h1Var3 = cs9Var.a;
                y6h1 y6h1Var3 = y6h1.i;
                x6h1 x6h1VarI4 = i3o1.i();
                x6h1VarI4.h = "music";
                x6h1VarI4.a = "mobile-nowplaying-enter-fullscreen-button";
                x6h1VarI4.f = "2.0.0";
                x6h1VarI4.g = "22.0.0";
                y6h1 y6h1VarA4 = x6h1VarI4.a();
                Collections.singletonList("nowplaying");
                w7h1Var = ((yr9) zr9Var).a ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA4, r6h1Var3, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA4, r6h1Var3, System.currentTimeMillis());
                return w7h1Var;
            case 5:
                hx9 hx9Var = (hx9) obj2;
                int iIntValue = ((Number) obj4).intValue();
                x340 x340Var = (b0k) obj3;
                x340Var.i0(-1500991962);
                pt ptVar = (pt) obj9;
                ven0 ven0VarH = rwq.h(((gkd) ptVar.d).c, x340Var, 0);
                ven0 ven0VarG = rwq.g((mr20) ((toj0) ptVar.e).g, (Object) null, (o8n) null, x340Var, 48, 2);
                yu3 yu3Var = (yu3) ptVar.i;
                long j = hx9Var.b;
                FlowableMap flowableMap = (FlowableMap) yu3Var.e;
                vbm[] vbmVarArr = q601.a;
                ven0 ven0VarG2 = rwq.g(rqt0.u(new pv5(new x010(new kge(flowableMap), rqt0.w(new kge(((Flowable) yu3Var.d).J(zp8.Y)), new ps20(new n811(), (byte) 0), rqt0.b), new ax9(3, (lnm) null, (byte) 0), (byte) 1), yu3Var, j, (byte) 1)), new u7h(j), (o8n) null, x340Var, 0, 2);
                String str5 = hx9Var.a;
                boolean zI = x340Var.i(ptVar);
                if ((((iIntValue & 112) ^ 48) <= 32 || !x340Var.g(hx9Var)) && (iIntValue & 48) != 32) {
                    b3 = 0;
                }
                int i = (zI ? 1 : 0) | b3;
                Object objT = x340Var.T();
                if (i != 0 || objT == fkj0.X) {
                    obj6 = objT;
                    ry5 ry5Var = new ry5(ptVar, hx9Var, null, (byte) 23);
                    x340Var.s0(ry5Var);
                    obj6 = ry5Var;
                }
                obj6 = objT;
                qxd0.t(str5, x340Var, (vu30) obj6);
                boolean zBooleanValue = ((Boolean) ven0VarH.getValue()).booleanValue();
                dlb dlbVar = (dlb) ven0VarG.getValue();
                if (!hap1.q(dlbVar)) {
                    dlbVar = null;
                }
                if (dlbVar instanceof blb) {
                    blb blbVar = (blb) dlbVar;
                    ex9Var = new dx9(blbVar.a, blbVar.b);
                } else if (dlbVar instanceof clb) {
                    clb clbVar = (clb) dlbVar;
                    ex9Var = new ex9(clbVar.a, clbVar.b);
                } else {
                    ex9Var = fx9.a;
                }
                ix9 ix9Var = new ix9(zBooleanValue, ex9Var, ((u7h) ven0VarG2.getValue()).a);
                x340Var.r(false);
                return ix9Var;
            case 6:
                return new x3a((bs0) obj9, (iu30) obj4);
            case 7:
                int iIntValue2 = ((Number) obj).intValue();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                int iIntValue3 = ((Number) obj4).intValue();
                b0k b0kVar = (x340) ((b0k) obj3);
                b0kVar.i0(1118223433);
                jfe jfeVarA = ((jia) obj9).a(iIntValue2, iIntValue3 & 126, b0kVar, zBooleanValue2);
                b0kVar.r(false);
                return jfeVarA;
            case 8:
                aua auaVar = (aua) obj;
                iu30 iu30Var = (iu30) obj2;
                x340 x340Var2 = (b0k) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i2 = (iIntValue4 & 6) == 0 ? iIntValue4 | (x340Var2.g(auaVar) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i2 |= x340Var2.i(iu30Var) ? 32 : 16;
                }
                x340 x340Var3 = x340Var2;
                if (x340Var3.Y(i2 & 1, (i2 & 147) != 146)) {
                    auaVar.getClass();
                    pdp1.c(auaVar, iu30Var, ((dua) obj9).d, (qim0) null, x340Var3, i2 & 112);
                } else {
                    x340Var3.b0();
                }
                return rih1Var;
            case 9:
                wzn wznVar = (wzn) ((j0b) obj9).d.a.c;
                RetrofitMaker retrofitMaker = (RetrofitMaker) ((k0b) wznVar.a).c.get();
                c8o.l(retrofitMaker);
                i0b i0bVar = (i0b) retrofitMaker.createWebgateService(i0b.class, "android-blend-edit");
                k0b k0bVar = (k0b) wznVar.a;
                lzn0 lzn0Var = (lzn0) k0bVar.b.get();
                c8o.l(lzn0Var);
                iyc0 iyc0Var = (iyc0) k0bVar.d.get();
                c8o.l(iyc0Var);
                i8h1 i8h1Var = (i8h1) k0bVar.e.get();
                c8o.l(i8h1Var);
                return new r0b((LayoutInflater) obj2, (ViewGroup) obj3, i0bVar, lzn0Var, iyc0Var, new it8(i8h1Var, (byte) 13));
            case 10:
                ((Number) obj3).intValue();
                fyk0 fyk0Var = (fyk0) ((ynb0) ((rwj) obj9).e).get();
                fyk0Var.getClass();
                return new ayk0(fyk0Var);
            case 11:
                bnb bnbVar = (bnb) obj2;
                ((Number) obj4).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var4 = (b0k) obj3;
                x340Var4.i0(-1815883930);
                String str6 = bnbVar.a;
                boolean zG = x340Var4.g(str6);
                cnb cnbVar = (cnb) obj9;
                Object objT2 = x340Var4.T();
                Object obj10 = objT2;
                if (zG || objT2 == m4cVar) {
                    m441 m441Var = new m441(new us0(cnbVar, bnbVar, (lnm) null, (byte) 11));
                    x340Var4.s0(m441Var);
                    obj10 = m441Var;
                }
                Boolean bool = Boolean.FALSE;
                ven0 ven0VarG3 = rwq.g((mr20) obj10, bool, (o8n) null, x340Var4, 48, 2);
                boolean zG2 = x340Var4.g(str6);
                Object objT3 = x340Var4.T();
                if (zG2 || objT3 == m4cVar) {
                    sjq0 sjq0Var = cnbVar.d;
                    sii0 sii0Var = new sii0(new xs4(yoi1.g(((uu00) sjq0Var.c).b(new oi("page-match", false, new atp0(str6, (byte) 6)))), str6, (byte) 12), sjq0Var, (byte) 29);
                    x340Var4.s0(sii0Var);
                    objT3 = sii0Var;
                }
                tob1 tob1VarG = rwq.g((mr20) objT3, bool, (o8n) null, x340Var4, 48, 2);
                boolean zG3 = x340Var4.g(str6);
                Object objT4 = x340Var4.T();
                Object obj11 = objT4;
                if (zG3 || objT4 == m4cVar) {
                    ay8 ay8VarF = d3p1.F(cnbVar.t, cnbVar.X, bnbVar);
                    x340Var4.s0(ay8VarF);
                    obj11 = ay8VarF;
                }
                j1r j1rVar = j1r.a;
                ven0 ven0VarG4 = rwq.g((mr20) obj11, j1rVar, (o8n) null, x340Var4, 0, 2);
                ven0 ven0VarG5 = rwq.g(cnbVar.Y, j1rVar, (o8n) null, x340Var4, 0, 2);
                i1r i1rVar = (k1r) ven0VarG4.getValue();
                i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                boolean z4 = i1rVar2 != null && ((Boolean) i1rVar2.a).booleanValue();
                i1r i1rVar3 = (k1r) ven0VarG5.getValue();
                i1r i1rVar4 = i1rVar3 instanceof i1r ? i1rVar3 : null;
                iix0 iix0Var = i1rVar4 != null ? (iix0) i1rVar4.a : null;
                if (iix0Var != null) {
                    if (iix0Var instanceof hix0) {
                        z2 = ((hix0) iix0Var).a;
                        tob1Var = tob1VarG;
                    } else {
                        if (!(iix0Var instanceof gix0)) {
                            eg.o();
                            return null;
                        }
                        gix0 gix0Var = (gix0) iix0Var;
                        tob1Var = tob1VarG;
                        z2 = gix0Var.c >= gix0Var.b;
                    }
                    boolean z5 = z2;
                    if (z4 || z5) {
                        z = false;
                    } else {
                        z = true;
                    }
                    enbVar = new enb(str6);
                    if (!((Boolean) ven0VarG3.getValue()).booleanValue()) {
                        enbVar = null;
                    }
                    Set set = s4b1.f;
                    String strJ = uic.x(str6).j();
                    dnbVar = new dnb(str6, strJ != null ? strJ : "");
                    if (!((Boolean) tob1Var.getValue()).booleanValue()) {
                        dnbVar = null;
                    }
                    fnbVar = new fnb(str6);
                    if (z) {
                        fnbVar2 = fnbVar;
                    } else {
                        fnbVar2 = null;
                    }
                    c380 c380VarA = mqo1.A(f46.i0(new gnb[]{enbVar, dnbVar, fnbVar2}));
                    x340Var4.r(false);
                    return c380VarA;
                }
                tob1Var = tob1VarG;
                if (z4) {
                    z = false;
                } else {
                    z = false;
                }
                enbVar = new enb(str6);
                if (!((Boolean) ven0VarG3.getValue()).booleanValue()) {
                    enbVar = null;
                }
                Set set2 = s4b1.f;
                String strJ2 = uic.x(str6).j();
                dnbVar = new dnb(str6, strJ2 != null ? strJ2 : "");
                if (!((Boolean) tob1Var.getValue()).booleanValue()) {
                    dnbVar = null;
                }
                fnbVar = new fnb(str6);
                if (z) {
                    fnbVar2 = fnbVar;
                } else {
                    fnbVar2 = null;
                }
                c380 c380VarA2 = mqo1.A(f46.i0(new gnb[]{enbVar, dnbVar, fnbVar2}));
                x340Var4.r(false);
                return c380VarA2;
            case 12:
                jjm0 jjm0Var = (jjm0) obj;
                int iIntValue5 = ((Number) obj4).intValue();
                m4c m4cVar2 = fkj0.X;
                String str7 = ((bob) obj2).a;
                x340 x340Var5 = (b0k) obj3;
                x340Var5.i0(-1895718542);
                fob fobVar = (fob) obj9;
                boolean zI2 = x340Var5.i(fobVar);
                Object objT5 = x340Var5.T();
                Object obj12 = objT5;
                if (zI2 || objT5 == m4cVar2) {
                    w63 w63Var = new w63(fobVar, (lnm) null, (byte) 2);
                    x340Var5.s0(w63Var);
                    obj12 = w63Var;
                }
                jjm0Var.a((zu30) obj12, x340Var5, (iIntValue5 << 3) & 112);
                boolean z6 = fobVar.c;
                hob hobVar = j561.N0;
                x340Var5.i0(841489750);
                boolean zG4 = x340Var5.g(str7);
                Object objT6 = x340Var5.T();
                Object obj13 = objT6;
                if (zG4 || objT6 == m4cVar2) {
                    ay8 ay8VarF2 = d3p1.F(fobVar.b, fobVar.d, str7);
                    x340Var5.s0(ay8VarF2);
                    obj13 = ay8VarF2;
                }
                i1r i1rVar5 = (k1r) rwq.h((zob1) obj13, x340Var5, 0).getValue();
                i1r i1rVar6 = i1rVar5 instanceof i1r ? i1rVar5 : null;
                if (i1rVar6 == null || (dobVar = (dob) i1rVar6.a) == null) {
                    eobVar = new eob();
                } else {
                    zc8 zc8Var = dobVar.a;
                    String str8 = zc8Var.i;
                    String str9 = zc8Var.h;
                    if (!ihc1.y0(str9)) {
                        if (!z6 || ihc1.y0(str8)) {
                            String str10 = zc8Var.g;
                            int length = str10.length();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= length) {
                                    i3 = -1;
                                } else if (!Character.isDigit(str10.charAt(i3))) {
                                    i3++;
                                }
                            }
                            if (i3 == -1) {
                                strY0 = null;
                            } else {
                                String strSubstring = str10.substring(i3);
                                int length2 = strSubstring.length();
                                for (int i4 = 0; i4 < length2; i4++) {
                                    char cCharAt = strSubstring.charAt(i4);
                                    if (!Character.isDigit(cCharAt) && cCharAt != '.' && cCharAt != '-') {
                                        strSubstring = strSubstring.substring(0, i4);
                                        strY0 = o7h.y0(ihc1.Q0(strSubstring, new String[]{"-"}, 0, 6), "-", (String) null, (String) null, p761.Z, 30);
                                        if (strY0.length() == 0) {
                                            strY0 = null;
                                        }
                                    }
                                }
                                strY0 = o7h.y0(ihc1.Q0(strSubstring, new String[]{"-"}, 0, 6), "-", (String) null, (String) null, p761.Z, 30);
                                if (strY0.length() == 0) {
                                    strY0 = null;
                                }
                            }
                            h861Var = strY0 != null ? new h861(strY0) : null;
                        } else {
                            h861Var = new g861(str8);
                        }
                        if (h861Var != null) {
                            hobVar = new hob(h861Var, str9);
                        }
                    }
                    if (z6 && (jo70Var = dobVar.b) != null && (io70Var = jo70Var.e) != null) {
                        String str11 = io70Var.b;
                        if (!ihc1.y0(str11)) {
                            str = str11;
                        }
                    }
                    eobVar = new eob(hobVar, str);
                }
                x340Var5.r(false);
                x340Var5.r(false);
                return eobVar;
            case 13:
                ((Number) obj2).intValue();
                b0k b0kVar2 = (b0k) obj3;
                ((Number) obj4).intValue();
                g9c g9cVar = (g9c) obj9;
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                uwr uwrVar = cbx.a;
                qim0 qim0VarZ = uyn1.z(0.0f, 8.0f, 1, dug.f(qim0VarF, cbx.a(b0kVar2).a.c, d4o1.a));
                rih1 rih1Var2 = rih1.a;
                otw.c(g9cVar, rih1Var2, qim0VarZ, (ipb1) null, b0kVar2, 56, 8);
                return rih1Var2;
            case 14:
                int iIntValue6 = ((Number) obj4).intValue();
                i8c i8cVar = (i8c) obj9;
                i8cVar.b.g(i8cVar.c, (o5e0) obj, anm1.N("browse_clientnative_root", nim0Var), (Function0) obj2, i8cVar.d, (b0k) obj3, ((iIntValue6 << 3) & 112) | ((iIntValue6 << 6) & 7168));
                return rih1Var;
            case 15:
                ug3 ug3Var = (ug3) obj9;
                return new p9c((Context) obj2, (iac0) ug3Var.b, (n9c) ug3Var.c, (lal1) ug3Var.e, (lal1) ug3Var.d);
            case 16:
                ((Number) obj3).intValue();
                return new e6m0((l6m0) ((cac) obj9).b);
            case 17:
                ((Number) obj3).intValue();
                uzl0 uzl0Var = ((rdc) obj9).b;
                uzl0Var.getClass();
                return new lzl0(uzl0Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                w3d w3dVar = (w3d) obj2;
                ((Number) obj4).intValue();
                vu30 vu30Var = w3dVar.g;
                iu30 iu30Var2 = w3dVar.e;
                Function0 function0 = w3dVar.d;
                x340 x340Var6 = (b0k) obj3;
                x340Var6.i0(-1568332244);
                Object y3dVar = ((o4d) rwq.h(((a4d) obj9).a.c, x340Var6, 0).getValue()).a.equals(cat.c) ? new y3d(w3dVar.a, w3dVar.b, w3dVar.c, w3dVar.f, function0, iu30Var2, vu30Var, w3dVar.h, w3dVar.i) : new x3d(function0, iu30Var2, vu30Var);
                x340Var6.r(false);
                return y3dVar;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ryl0 ryl0Var = (ryl0) obj;
                x5d x5dVar = (x5d) obj2;
                n1x n1xVar = x5dVar.j;
                if (n1xVar != null) {
                    ((l0x0) ((pt) obj9).h).o(new qy(gho1.r(n1xVar), wgo1.w(n1xVar)));
                }
                return ryl0Var.a(x5dVar.f);
            case 20:
                rwz rwzVar = (rwz) obj4;
                n1x n1xVar2 = ((d6d) obj2).d;
                if (n1xVar2 != null) {
                    ((a6d) obj9).d.o(new z00(wgo1.x(n1xVar2), gho1.r(n1xVar2), rwzVar.a));
                }
                return null;
            case 21:
                jjm0 jjm0Var2 = (jjm0) obj;
                fbd fbdVar = (fbd) obj2;
                int iIntValue7 = ((Number) obj4).intValue();
                x340 x340Var7 = (b0k) obj3;
                x340Var7.i0(-1959111240);
                hbd hbdVar = (hbd) obj9;
                boolean zI3 = x340Var7.i(hbdVar);
                Object objT7 = x340Var7.T();
                if (zI3 || objT7 == fkj0.X) {
                    obj7 = objT7;
                    vd2 vd2Var = new vd2(hbdVar, (lnm) null, (byte) 5);
                    x340Var7.s0(vd2Var);
                    obj7 = vd2Var;
                }
                obj7 = objT7;
                jjm0Var2.a((zu30) obj7, x340Var7, (iIntValue7 << 3) & 112);
                gbd gbdVarE = hbd.e(fbdVar);
                x340Var7.r(false);
                return gbdVarE;
            case 22:
                ((Number) obj3).intValue();
                return new fvl0(new qgl0(((ufd) obj9).b, ((tfd) obj).a));
            case 23:
                wmd wmdVar = (wmd) obj2;
                int iIntValue8 = ((Number) obj4).intValue();
                x340 x340Var8 = (b0k) obj3;
                x340Var8.i0(-1404201507);
                and andVar = ((ymd) obj9).a;
                int i5 = (iIntValue8 >> 3) & 14;
                af5 af5Var = new af5("");
                boolean zI4 = x340Var8.i(andVar) | x340Var8.i(wmdVar);
                Object objT8 = x340Var8.T();
                if (zI4 || objT8 == fkj0.X) {
                    obj8 = objT8;
                    f530 f530Var = new f530(andVar, wmdVar, (lnm) null, (byte) 14);
                    x340Var8.s0(f530Var);
                    obj8 = f530Var;
                }
                obj8 = objT8;
                xmd xmdVar = new xmd(wmdVar, (af5) yto.o(af5Var, wmdVar, andVar, (vu30) obj8, x340Var8, (i5 << 3) & 1008).getValue());
                x340Var8.r(false);
                return xmdVar;
            case 24:
                ind indVar = (ind) obj2;
                lnd lndVar = (lnd) obj3;
                pnd pndVar = (pnd) obj9;
                if (!(indVar instanceof dnd)) {
                    return CompletableEmpty.a;
                }
                if (lndVar instanceof knd) {
                    dnd dndVar = (dnd) indVar;
                    String str12 = dndVar.a;
                    List list = dndVar.b.b;
                    blc0[] blc0VarArr = pnd.Z;
                    if (list.size() < 2) {
                        singleJust = Single.just(new cnd(list, (hpc1) o7h.s0(list)));
                    } else {
                        String str13 = (String) pndVar.i.get(str12);
                        if (str13 == null || (map = Single.just(str13)) == null) {
                            map = pndVar.e.a(Collections.singletonList(str12)).map(qbo1.Z);
                        }
                        singleJust = map.map(new cab((Object) list, (Object) pndVar, (Object) str12, (byte) 20));
                    }
                } else {
                    singleJust = Single.just(new cnd(((dnd) indVar).b.b, null));
                }
                Completable completableFlatMapCompletable = singleJust.flatMapCompletable(new cfd(pndVar, indVar, b2));
                completableFlatMapCompletable.getClass();
                return completableFlatMapCompletable.o(Functions.h);
            case 25:
                ((Number) obj3).intValue();
                return new brk0(new nqk0(((byd) obj9).a), Integer.valueOf(((zxd) obj2).b));
            case 26:
                bs0 bs0Var = (bs0) obj9;
                return new u3((Context) obj2, (ViewGroup) obj3, bs0Var, new ne(3, new gyd(bs0Var, b3)), (iu30) obj4);
            case 27:
                ((Number) obj3).intValue();
                return new ark0(((zzd) obj9).a);
            case 28:
                return new u3((Context) obj2, (ViewGroup) obj3, (bs0) obj9);
            default:
                rde rdeVar = (rde) obj;
                iu30 iu30Var3 = (iu30) obj2;
                x340 x340Var9 = (b0k) obj3;
                int iIntValue9 = ((Number) obj4).intValue();
                int i6 = (iIntValue9 & 6) == 0 ? iIntValue9 | ((iIntValue9 & 8) == 0 ? x340Var9.g(rdeVar) : x340Var9.i(rdeVar) ? 4 : 2) : iIntValue9;
                if ((iIntValue9 & 48) == 0) {
                    i6 |= x340Var9.i(iu30Var3) ? 32 : 16;
                }
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(i6 & 1, (i6 & 147) != 146)) {
                    rdeVar.getClass();
                    nko1.b(rdeVar, iu30Var3, ((tde) obj9).c, (qim0) null, x340Var10, i6 & 112);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
        }
    }
}
