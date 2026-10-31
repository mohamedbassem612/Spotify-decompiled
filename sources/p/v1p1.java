package p;

import android.content.res.Configuration;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.mobius.EventSource;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class v1p1 {
    public static b180 a;
    public static b180 b;

    public static final void a(tv70 tv70Var, bmt bmtVar, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        ven0 ven0Var;
        int i2;
        boolean z;
        qim0 qim0VarX;
        Function0 function1;
        llj lljVar = y580.Y;
        vu30 vu30Var = y580.R0;
        llj lljVar2 = y580.N0;
        llj lljVar3 = y580.O0;
        m4c m4cVar = fkj0.X;
        ArrayList arrayList = tv70Var.c;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1014207640);
        j06 j06Var = x340Var.a;
        int i3 = (i & 6) == 0 ? (x340Var.i(tv70Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= x340Var.i(bmtVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.i(function0) ? 256 : 128;
        }
        int i4 = i3 | 3072;
        if (x340Var.Y(i4 & 1, (i4 & 1171) != 1170)) {
            boolean zE = x340Var.e(arrayList.size());
            Object objT = x340Var.T();
            if (zE || objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var.s0(objT);
            }
            ven0 ven0Var2 = (ven0) objT;
            int height = ((View) x340Var.k(AndroidCompositionLocals_androidKt.f)).getHeight();
            int i5 = ((Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a)).screenWidthDp >= 600 ? 4 : 3;
            ArrayList arrayListS1 = o7h.s1(arrayList, i5, i5);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF);
            boolean zG = x340Var.g(arrayListS1) | x340Var.e(i5);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new s2k(arrayListS1, i5, (byte) 4);
                x340Var.s0(objT2);
            }
            qim0 qim0VarB = s161.b(qim0VarZ, false, (iu30) objT2);
            cvx cvxVar2 = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(8.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            Function0 function2 = hmb0.t1;
            if (z2) {
                x340Var.l(function2);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar3);
            nko1.H(xos0VarM, x340Var, lljVar2);
            nko1.H(Integer.valueOf(iHashCode), x340Var, vu30Var);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, lljVar);
            String str = tv70Var.d;
            lee1 lee1Var = cbx.d(x340Var).d;
            long j = cbx.a(x340Var).b.a;
            cvx cvxVar3 = cbx.b(x340Var).b;
            int i6 = i5;
            int i7 = height;
            Function0 function3 = function2;
            ven0 ven0Var3 = ven0Var2;
            int i8 = i4;
            float f = 1.0f;
            uwo1.e(str, uyn1.B(qim0Var3, 0.0f, 0.0f, 0.0f, 8.0f, 7), lee1Var, j, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
            x340Var = x340Var;
            x340Var.i0(-955696139);
            int i9 = 0;
            for (Object obj : arrayListS1) {
                int i10 = i9 + 1;
                if (i9 < 0) {
                    p7h.T();
                    throw null;
                }
                List list = (List) obj;
                boolean z3 = i9 == p7h.L(arrayListS1);
                qim0 qim0VarF2 = u291.f(qim0Var3, f);
                if (z3) {
                    x340Var.i0(1809430926);
                    ven0Var = ven0Var3;
                    i2 = i7;
                    boolean zI = x340Var.i(ven0Var) | x340Var.e(i2) | ((i8 & 896) == 256);
                    Object objT3 = x340Var.T();
                    if (zI || objT3 == m4cVar) {
                        z = false;
                        objT3 = new yv70(i2, function0, ven0Var, (byte) 0);
                        x340Var.s0(objT3);
                    } else {
                        z = false;
                    }
                    qim0VarX = ern1.x(qim0Var3, (iu30) objT3);
                    x340Var.r(z);
                } else {
                    ven0Var = ven0Var3;
                    i2 = i7;
                    z = false;
                    x340Var.i0(1809817775);
                    x340Var.r(false);
                    qim0VarX = qim0Var3;
                }
                qim0 qim0VarThen = qim0VarF2.then(qim0VarX);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar4 = cbx.b(x340Var).b;
                ven0 ven0Var4 = ven0Var;
                jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(z)), een.Z, x340Var, 0);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarThen);
                hzj.A.getClass();
                x340Var.m0();
                if (x340Var.S) {
                    function1 = function3;
                    x340Var.l(function1);
                } else {
                    function1 = function3;
                    x340Var.v0();
                }
                nko1.H(jw31VarA, x340Var, lljVar3);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                nko1.H(Integer.valueOf(iHashCode2), x340Var, vu30Var);
                nko1.F(x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar);
                x340Var.i0(-1240368715);
                Iterator it = list.iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        p7h.T();
                        throw null;
                    }
                    tlt tltVar = (tlt) next;
                    int i13 = i8;
                    Iterator it2 = it;
                    if (1.0f <= 0.0d) {
                        of80.a("invalid weight; must be greater than zero");
                    }
                    wnb0 wnb0Var = new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    boolean zE2 = x340Var.e(i9) | x340Var.e(i11);
                    Object objT4 = x340Var.T();
                    if (zE2 || objT4 == m4cVar) {
                        objT4 = new mun((byte) 3, i9, i11);
                        x340Var.s0(objT4);
                    }
                    qim0 qim0VarB2 = s161.b(wnb0Var, false, (iu30) objT4);
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    vu30 vu30Var2 = vu30Var;
                    int iHashCode3 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM3 = x340Var.m();
                    qim0 qim0VarE3 = zr7.E(x340Var, qim0VarB2);
                    hzj.A.getClass();
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(function1);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC, x340Var, lljVar3);
                    nko1.H(xos0VarM3, x340Var, lljVar2);
                    vu30Var = vu30Var2;
                    nko1.H(Integer.valueOf(iHashCode3), x340Var, vu30Var);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE3, x340Var, lljVar);
                    otw.c(bmtVar, tltVar, (qim0) null, (ipb1) null, x340Var, (i13 >> 3) & 14, 12);
                    x340Var.r(true);
                    i9 = i9;
                    i11 = i12;
                    i8 = i13;
                    it = it2;
                    i2 = i2;
                    function1 = function1;
                }
                int i14 = i8;
                i7 = i2;
                function3 = function1;
                x340Var.r(false);
                x340Var.i0(-1240352984);
                int size = i6 - list.size();
                for (int i15 = 0; i15 < size; i15++) {
                    if (1.0f <= 0.0d) {
                        of80.a("invalid weight; must be greater than zero");
                    }
                    op71.g(x340Var, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                }
                x340Var.r(false);
                x340Var.r(true);
                f = 1.0f;
                i9 = i10;
                ven0Var3 = ven0Var4;
                i8 = i14;
            }
            x340Var.r(false);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ke20(i, tv70Var, bmtVar, function0, qim0Var2, (byte) 17);
        }
    }

    public static final void b(int i, int i2, j2i j2iVar, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        int i3;
        qim0 qim0Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-858718506);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i3 = i | (x340Var.i(qim0Var2) ? 4 : 2);
        }
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            qim0 qim0Var4 = i4 != 0 ? nim0.a : qim0Var2;
            vzq0.a.getClass();
            cwl1.b(qim0Var4, (tl3) null, (hw61) null, (pgx) null, uzq0.b, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(303107213, new rv71(j2iVar, (byte) 27), x340Var), x340Var, i3 & 14, 48, 2030);
            qim0Var3 = qim0Var4;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rbh(qim0Var3, j2iVar, i, i2, (byte) 5);
        }
    }

    public static ArrayList c(mmr0... mmr0VarArr) {
        ArrayList arrayList = new ArrayList(mmr0VarArr.length);
        for (mmr0 mmr0Var : mmr0VarArr) {
            arrayList.add(new uk0((String) mmr0Var.a, ((Number) mmr0Var.b).intValue()));
        }
        return arrayList;
    }

    public static final wxj0 d(woo wooVar, wxj0 wxj0Var) {
        if (u890.j(wooVar, roo.a)) {
            return new wxj0((s69) null, (s69) null, (duk1) null, (gez) null, (gez) null, (jez) null, (r920) null, (r920) null, (ha20) null, (ox30) null, (ox30) null, (rx30) null);
        }
        if (wooVar instanceof voo) {
            voo vooVar = (voo) wooVar;
            s69 s69Var = vooVar.a;
            s69 s69Var2 = vooVar.b;
            duk1 duk1Var = wxj0Var.c;
            if (duk1Var == null) {
                duk1Var = vooVar.c;
            }
            return wxj0.a(wxj0Var, s69Var, s69Var2, duk1Var, (gez) null, (gez) null, (jez) null, (r920) null, (r920) null, (ha20) null, (ox30) null, (ox30) null, (rx30) null, 4088);
        }
        if (wooVar instanceof soo) {
            soo sooVar = (soo) wooVar;
            gez gezVar = sooVar.a;
            gez gezVar2 = sooVar.b;
            jez jezVar = wxj0Var.f;
            if (jezVar == null) {
                jezVar = sooVar.c;
            }
            return wxj0.a(wxj0Var, (s69) null, (s69) null, (duk1) null, gezVar, gezVar2, jezVar, (r920) null, (r920) null, (ha20) null, (ox30) null, (ox30) null, (rx30) null, 4039);
        }
        if (wooVar instanceof too) {
            too tooVar = (too) wooVar;
            r920 r920Var = tooVar.a;
            r920 r920Var2 = tooVar.b;
            ha20 ha20Var = wxj0Var.i;
            if (ha20Var == null) {
                ha20Var = tooVar.c;
            }
            return wxj0.a(wxj0Var, (s69) null, (s69) null, (duk1) null, (gez) null, (gez) null, (jez) null, r920Var, r920Var2, ha20Var, (ox30) null, (ox30) null, (rx30) null, 3647);
        }
        if (!(wooVar instanceof uoo)) {
            eg.o();
            return null;
        }
        uoo uooVar = (uoo) wooVar;
        ox30 ox30Var = uooVar.a;
        ox30 ox30Var2 = uooVar.b;
        rx30 rx30Var = wxj0Var.l;
        if (rx30Var == null) {
            rx30Var = uooVar.c;
        }
        return wxj0.a(wxj0Var, (s69) null, (s69) null, (duk1) null, (gez) null, (gez) null, (jez) null, (r920) null, (r920) null, (ha20) null, ox30Var, ox30Var2, rx30Var, 511);
    }

    public static goq e(zta1 zta1Var, ryj ryjVar, dua1 dua1Var, q7r0 q7r0Var, rih1 rih1Var) {
        zta1Var.getClass();
        ryjVar.getClass();
        rih1Var.getClass();
        return new goq(zta1Var, dua1Var, q7r0Var);
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0104  */
    public static jc11 f(Class cls) throws InvocationTargetException {
        at7 at7Var;
        vqv0 bb01Var;
        h6b0 h6b0Var;
        cb01 cb01Var = new cb01();
        cb01Var.a = null;
        cb01Var.b = null;
        boolean z = false;
        cb01Var.c = 0;
        cb01Var.d = null;
        cb01Var.e = null;
        cb01Var.f = null;
        cb01Var.g = null;
        cb01Var.h = null;
        for (Annotation annotation : cls.getDeclaredAnnotations()) {
            annotation.getClass();
            Class clsN = j2h1.s(annotation).n();
            heg hegVarA = bb11.a(clsN);
            kf30 kf30VarA = hegVarA.a();
            if (kf30VarA.equals(eia0.a)) {
                bb01Var = new vqv0(cb01Var, (byte) 14);
            } else if (kf30VarA.equals(eia0.q)) {
                bb01Var = new n0v0(cb01Var, (byte) 18);
            } else if (cb01.i || cb01Var.g != null || (h6b0Var = (h6b0) cb01.t.get(hegVarA)) == null) {
                bb01Var = null;
            } else {
                cb01Var.g = h6b0Var;
                bb01Var = new bb01(cb01Var, (byte) 0);
            }
            if (bb01Var != null) {
                o1p1.F(bb01Var, annotation, clsN);
            }
        }
        ava avaVar = joj0.g;
        if (cb01Var.g == null || cb01Var.a == null) {
            at7Var = null;
        } else {
            joj0 joj0Var = new joj0((cb01Var.c & 8) != 0, cb01Var.a);
            ava avaVar2 = joj0Var.f ? avaVar : joj0.h;
            int i = avaVar2.b;
            int i2 = avaVar.b;
            if (i > i2 || (i >= i2 && avaVar2.c > avaVar.c)) {
                avaVar = avaVar2;
            }
            int i3 = ((ava) joj0Var).c;
            int i4 = ((ava) joj0Var).b;
            if ((i4 != 1 || i3 != 0) && i4 != 0) {
                int i5 = avaVar.b;
                if (i4 > i5 || (i4 >= i5 && i3 > avaVar.c)) {
                    z = true;
                }
                z = !z;
            }
            if (z) {
                h6b0 h6b0Var2 = cb01Var.g;
                if ((h6b0Var2 == h6b0.d || h6b0Var2 == h6b0.e || h6b0Var2 == h6b0.h) && cb01Var.d == null) {
                    at7Var = null;
                }
            } else {
                cb01Var.f = cb01Var.d;
                cb01Var.d = null;
            }
            String[] strArr = cb01Var.h;
            if (strArr != null) {
                pwa.a(strArr);
            }
            at7Var = new at7(cb01Var.g, joj0Var, cb01Var.d, cb01Var.f, cb01Var.e, cb01Var.b, cb01Var.c, (byte) 3);
        }
        if (at7Var == null) {
            return null;
        }
        return new jc11(cls, at7Var);
    }

    public static m210 g(hkt0 hkt0Var) {
        String str = hkt0Var.a;
        String str2 = str.equals("e11b1a8713164f739d2a9d9fed5a4c01") ? "speaker" : "headphones";
        String str3 = hkt0Var.c;
        String str4 = str3 == null ? "" : str3;
        String str5 = hkt0Var.b;
        String str6 = str5 == null ? "" : str5;
        String str7 = hkt0Var.d;
        return new m210(1296, "spotify_one_touch", str, str7 == null ? "" : str7, "bluetooth", str2, str4, str6, (String) null, "spotify_go", (String) null);
    }

    public static final String h(rxd1 rxd1Var) {
        if (rxd1Var instanceof jx81) {
            return ((jx81) rxd1Var).a.c;
        }
        if (rxd1Var instanceof g080) {
            return ((g080) rxd1Var).a.c;
        }
        if (rxd1Var instanceof cai0) {
            return ((cai0) rxd1Var).a.c;
        }
        if (rxd1Var instanceof br70) {
            return ((br70) rxd1Var).a.c;
        }
        if (rxd1Var instanceof tbf) {
            return ((tbf) rxd1Var).a.c;
        }
        eg.o();
        return null;
    }

    public static String i(Long l) {
        if (l == null) {
            return "spotify:listeningstats:insights:current";
        }
        return "spotify:listeningstats:insights:" + l;
    }

    public static final wog j(uog uogVar, g471 g471Var, long j) {
        return new wog(uogVar.a, uogVar.b, g471Var.a(), g471Var.b(), g471Var.e(), 0, uogVar.d, j, uogVar.e, uogVar.f, uogVar.g, (String) null, uogVar.h, uogVar.i, uogVar.j, uogVar.k);
    }

    public static final go80 k(klm klmVar, zbp0 zbp0Var, zbp0 zbp0Var2, zbp0 zbp0Var3, zbp0 zbp0Var4, zbp0 zbp0Var5, zbp0 zbp0Var6, rbp0 rbp0Var, zbp0 zbp0Var7, zbp0 zbp0Var8) {
        return klmVar.a("PlaybackGrabberDaemon", new ang(zbp0Var, zbp0Var2, zbp0Var3, zbp0Var4, zbp0Var5, zbp0Var6, rbp0Var, zbp0Var7, zbp0Var8, (byte) 7));
    }

    public static final boolean l(a7k0 a7k0Var, a7k0 a7k0Var2) {
        if (!a7k0Var.b.a.equals(a7k0Var2.b.a)) {
            return false;
        }
        d0k0 d0k0Var = a7k0Var.a;
        d0k0 d0k0Var2 = a7k0Var2.a;
        return u890.j(d0k0Var.a, d0k0Var2.a) && m(d0k0Var.b, d0k0Var2.b) && m(d0k0Var.c, d0k0Var2.c) && m(d0k0Var.d, d0k0Var2.d) && d0k0Var.e == d0k0Var2.e && u890.j(d0k0Var.f, d0k0Var2.f);
    }

    public static final boolean m(lhg1 lhg1Var, lhg1 lhg1Var2) {
        if (lhg1Var == null || lhg1Var2 == null) {
            return u890.j(lhg1Var, lhg1Var2);
        }
        return u890.j(lhg1Var.a, lhg1Var2.a) && u890.j(lhg1Var.b, lhg1Var2.b);
    }

    public static Long n(String str) {
        Long lD0;
        if (str == null || (lD0 = nhc1.d0(10, str)) == null || lD0.longValue() <= 0) {
            return null;
        }
        return lD0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final EventSource o(Observable observable, ae9 ae9Var, gjb gjbVar, af9 af9Var, xg9 xg9Var) {
        return RxEventSources.a(new ObservableSource[]{observable, ae9Var.a().distinctUntilChanged().map(f331.e), gjbVar.e().map(zhm0.t).distinctUntilChanged(), af9Var.a.a().observeOn(af9Var.e).scan(new we9((qg9) null, new LinkedHashMap(), new LinkedHashMap()), mif1.X).filter(u321.Y).doOnNext(new xu(af9Var, (byte) 9)).flatMap(new fl1(af9Var, (byte) 29)).scan(new ye9((xe9) null, new LinkedHashMap()), uh21.Y).filter(j561.Y).doOnNext(new ze9(af9Var, (byte) 1)).doOnNext(new ze9(af9Var, (byte) 2)).map(new uq8(af9Var, (byte) 1)).filter(new mp8(af9Var, (byte) 1)).map(new yo31(af9Var, (byte) 26)).doOnNext(new ze9(af9Var, (byte) 0)).map(s321.Y).map(b6j0.t), xg9Var.a().ofType(xf9.class).map(ios.X), xg9Var.a().ofType(wf9.class).map(bbn.X), xg9Var.a().ofType(ag9.class).map(qz70.X), xg9Var.a().ofType(zf9.class).map(v560.X), xg9Var.a().ofType(yf9.class).map(fmv.X)});
    }

    public static String p(Long l) {
        if (l == null) {
            return "spotify:listeningstats:current";
        }
        return "spotify:listeningstats:" + l;
    }

    public static final String q(og9 og9Var, String str) {
        if (u890.j(og9Var, gg9.a)) {
            return "CharacteristicNotAvailable";
        }
        if (u890.j(og9Var, lg9.a)) {
            return "CharacteristicNotWritable";
        }
        if (u890.j(og9Var, hg9.a)) {
            return "ConnectionNotAvailable";
        }
        if (u890.j(og9Var, ng9.a)) {
            return "ServiceNotAvailable";
        }
        if (og9Var instanceof kg9) {
            return str + "InitiationFailed#" + ((kg9) og9Var).a;
        }
        if (og9Var instanceof jg9) {
            return l1d.k(((jg9) og9Var).a, str, "Failed#");
        }
        if (u890.j(og9Var, mg9.a)) {
            return str.concat("TimedOut");
        }
        if (og9Var instanceof ig9) {
            return f4i1.f(str, "Failed#", ((ig9) og9Var).a);
        }
        eg.o();
        return null;
    }

    public static final LinkedHashSet r(hcz0 hcz0Var) {
        List listS = s(hcz0Var);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listS.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(l4o1.c0((ContextTrack) it.next()));
        }
        return linkedHashSet;
    }

    public static final List s(hcz0 hcz0Var) {
        j380 j380VarMetadata;
        Map map = hcz0Var.B;
        boolean z = hcz0Var.o;
        List list = hcz0Var.d;
        List list2 = hcz0Var.c;
        boolean z2 = hcz0Var.C;
        ContextTrack contextTrack = hcz0Var.a;
        if (z2) {
            String str = null;
            if (!hcz0Var.z) {
                if (contextTrack != null && (j380VarMetadata = contextTrack.metadata()) != null) {
                    str = (String) j380VarMetadata.get("track_player");
                }
                if (u890.j(str, "video")) {
                    ArrayList arrayList = new ArrayList();
                    if (contextTrack != null) {
                        arrayList.add(contextTrack);
                    }
                    for (ContextTrack contextTrack2 : wlm.a(o7h.N0(list, list2), map, z)) {
                        if (!u890.j(hcz0Var.D.get(contextTrack2.uri()), Boolean.TRUE)) {
                            break;
                        }
                        arrayList.add(contextTrack2);
                    }
                    return arrayList;
                }
            } else if (contextTrack != null) {
                if (!u890.j(contextTrack.metadata().get("video_rendering_enabled"), "true")) {
                    contextTrack = null;
                }
                if (contextTrack != null) {
                    List listSingletonList = Collections.singletonList(contextTrack);
                    List listA = wlm.a(o7h.N0(list, list2), map, z);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : listA) {
                        if (!u890.j(((ContextTrack) obj).metadata().get("video_rendering_enabled"), "true")) {
                            break;
                        }
                        arrayList2.add(obj);
                    }
                    return o7h.N0(arrayList2, listSingletonList);
                }
            }
        }
        return z6x.a;
    }

    public static final lhg1 t(lhg1 lhg1Var, ntf1 ntf1Var) {
        return lhg1.a(lhg1Var, (q6w0) null, ruq0.a(lhg1Var.b, ntf1Var.a, ntf1Var.c, (String) null, (String) null, (String) null, (String) null, ntf1Var.b, ntf1Var.d, 0, 0, 0, (Float) null, (Float) null, (Integer) null, false, 0.0f, 0.0f, 0.0d, 0.0d, 524092), false, false, 13);
    }
}
