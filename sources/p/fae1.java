package p;

import android.content.Intent;
import android.net.Uri;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.base.java.logging.Logger;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor$Companion;
import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.WeakHashMap;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public abstract class fae1 {
    public static final z9 a = new z9((byte) 0);
    public static b180 b;
    public static b180 c;

    public static final Next A(ecs0 ecs0Var, h400 h400Var) {
        String strL = ecs0Var.L();
        if (strL == null ? false : strL.equals(h400Var.a)) {
            return Next.j();
        }
        if (ecs0Var instanceof bcs0) {
            return Next.h(bcs0.a((bcs0) ecs0Var, (String) null, (c380) null, h400Var.a, (v7u) null, 55));
        }
        if (ecs0Var instanceof ccs0) {
            return Next.h(ccs0.a((ccs0) ecs0Var, (tcs0) null, (String) null, (ee30) null, (tqw0) null, (String) null, (Integer) null, false, false, false, false, (i3g1) null, (c380) null, (v7u) null, h400Var.a, (t2c0) null, (String) null, (String) null, (hes0) null, (imr0) null, 516095));
        }
        if (ecs0Var instanceof dcs0) {
            return Next.h(dcs0.a((dcs0) ecs0Var, (String) null, (c380) null, h400Var.a, (v7u) null, 55));
        }
        eg.o();
        return null;
    }

    public static final Next B(xsk1 xsk1Var, isk1 isk1Var) {
        xl61 xl61Var = isk1Var.a;
        l0l l0lVar = xsk1Var.c;
        Double d = xsk1Var.a;
        if (bno1.v(l0lVar)) {
            double d2 = xl61Var.a;
            String str = xl61Var.b;
            if (zmo1.y(Double.valueOf(d2), str, xl61Var.c) != null && bno1.r(d, d2)) {
                return Next.i(xsk1.a(xsk1Var, (Double) null, (Double) null, (l0l) null, 0, (h06) null, true, 0, false, (Map) null, (Set) null, 2015), Effects.a(new rrk1[]{hrk1.a, new lrk1(xl61Var, d), new krk1(new prk1(d2, false), str)}));
            }
        }
        return Next.a(Effects.a(new grk1[]{new grk1(xl61Var)}));
    }

    public static final qim0 C(qim0 qim0Var, y9e1 y9e1Var, boolean z, Function0 function0, boolean z2, iu30 iu30Var) {
        return qim0Var.then((!z || y9e1Var == null) ? nim0.a : new jae1(y9e1Var, iu30Var, function0, z2));
    }

    public static final Next D(ecs0 ecs0Var, q500 q500Var) {
        uas0 uas0Var = q500Var.a;
        c380 c380VarA = mqo1.A(uas0Var.f);
        if (ecs0Var instanceof bcs0) {
            return Next.h(bcs0.a((bcs0) ecs0Var, uas0Var.b, c380VarA, (String) null, uas0Var.g, 41));
        }
        if (ecs0Var instanceof ccs0) {
            return Next.h(ccs0.a((ccs0) ecs0Var, (tcs0) null, (String) null, (ee30) null, (tqw0) null, (String) null, (Integer) null, false, false, false, false, (i3g1) null, c380VarA, uas0Var.g, (String) null, (t2c0) null, (String) null, (String) null, (hes0) null, (imr0) null, 518143));
        }
        if (ecs0Var instanceof dcs0) {
            return Next.h(dcs0.a((dcs0) ecs0Var, uas0Var.b, c380VarA, (String) null, uas0Var.g, 41));
        }
        eg.o();
        return null;
    }

    public static final Next E(ecs0 ecs0Var, t500 t500Var) {
        String str = t500Var.a;
        if (ecs0Var instanceof ccs0) {
            ccs0 ccs0Var = (ccs0) ecs0Var;
            tcs0 tcs0Var = ccs0Var.a;
            if (u890.j(tcs0Var.a, str)) {
                return Next.j();
            }
            if (ccs0Var.h && ccs0Var.d == null) {
                return H(ccs0.a(ccs0Var, tcs0.a(tcs0Var, str, (c380) null, 62), (String) null, (ee30) null, (tqw0) null, (String) null, (Integer) null, false, false, false, false, (i3g1) null, (c380) null, (v7u) null, (String) null, (t2c0) null, (String) null, (String) null, (hes0) null, (imr0) null, 523838));
            }
            String str2 = t500Var.a;
            String str3 = tcs0Var.b;
            return Next.i(new dcs0(str2, str3, ccs0Var.Y, ccs0Var.N0, ccs0Var.Z, (String) null), Collections.singleton(new lbw(str2, str3)));
        }
        if (ecs0Var instanceof dcs0) {
            dcs0 dcs0Var = (dcs0) ecs0Var;
            if (u890.j(dcs0Var.a, str)) {
                return Next.j();
            }
            String str4 = t500Var.a;
            String str5 = dcs0Var.b;
            return Next.i(new dcs0(str4, str5, dcs0Var.c, dcs0Var.d, dcs0Var.e, (String) null), Collections.singleton(new lbw(str4, str5)));
        }
        if (!(ecs0Var instanceof bcs0)) {
            eg.o();
            return null;
        }
        String str6 = t500Var.a;
        bcs0 bcs0Var = (bcs0) ecs0Var;
        String str7 = bcs0Var.b;
        return Next.i(new dcs0(str6, str7, bcs0Var.c, bcs0Var.d, bcs0Var.e, (String) null), Collections.singleton(new lbw(str6, str7)));
    }

    public static final xwa F(b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        if (objT == fkj0.X) {
            objT = new xwa();
            x340Var.s0(objT);
        }
        return (xwa) objT;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00cc -> B:37:0x00d2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object G(p.pj71 r8, p.k371 r9, p.onm r10) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.fae1.G(p.pj71, p.k371, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:233:0x059e  */
    /* JADX WARN: Code duplicated, block: B:87:0x01de  */
    public static final Next H(ccs0 ccs0Var) {
        Object next;
        boolean z;
        t2c0 t2c0Var;
        Integer num;
        hes0 hes0Var;
        ihs0 ihs0Var;
        String str;
        tcs0 tcs0Var;
        String str2;
        fhs0 fhs0Var;
        boolean z2;
        ccs0 ccs0VarA;
        boolean z3;
        c380<t220> c380Var;
        cqs0 cqs0VarB;
        fhs0 fhs0Var2;
        String str3;
        Set setSingleton;
        ccs0 ccs0VarA2;
        ccs0 ccs0VarK;
        kes0 kes0Var;
        mmr0 mmr0Var;
        c380 c380Var2;
        ccs0 ccs0VarK2;
        c380 c380Var3;
        String str4 = ccs0Var.Q0;
        t2c0 t2c0Var2 = ccs0Var.O0;
        Integer num2 = ccs0Var.f;
        hes0 hes0Var2 = ccs0Var.R0;
        ihs0 ihs0Var2 = ccs0Var.d;
        String str5 = ccs0Var.b;
        tcs0 tcs0Var2 = ccs0Var.a;
        if (str4 != null) {
            return Next.j();
        }
        c380 c380Var4 = tcs0Var2.f;
        String str6 = tcs0Var2.a;
        Iterator it = c380Var4.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(str5 == null ? false : u890.j(((xbs0) next).a, str5)));
        xbs0 xbs0Var = (xbs0) next;
        if ((xbs0Var != null ? xbs0Var.t : null) != null) {
            imr0 imr0Var = xbs0Var.t;
            if (imr0Var == null) {
                return Next.j();
            }
            c380 c380Var5 = tcs0Var2.f;
            ArrayList arrayList = new ArrayList();
            for (Object obj : c380Var5) {
                if (!(str5 == null ? false : u890.j(((xbs0) obj).a, str5))) {
                    arrayList.add(obj);
                }
            }
            return Next.i(ccs0.a(ccs0Var, tcs0.a(tcs0Var2, (String) null, mqo1.A(arrayList), 31), (String) null, (ee30) null, (tqw0) null, (String) null, (Integer) null, false, false, false, false, (i3g1) null, (c380) null, (v7u) null, (String) null, (t2c0) null, (String) null, (String) null, (hes0) null, imr0Var, 262140), Collections.singleton(new qfw(xbs0Var.a)));
        }
        boolean z4 = ihs0Var2 instanceof ihs0;
        ihs0 ihs0Var3 = z4 ? ihs0Var2 : null;
        fhs0 fhs0Var3 = ihs0Var3 != null ? ihs0Var3.f : null;
        xbs0 xbs0VarH = ccs0Var.h();
        c380 c380Var6 = xbs0VarH != null ? xbs0VarH.i : null;
        if (c380Var6 == null) {
            c380Var6 = z6x.a;
        }
        c380 c380VarA = mqo1.A(o7h.N0(ccs0Var.Y, (Collection) c380Var6));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : c380VarA) {
            q2c0 q2c0Var = ((p2c0) obj2).a;
            if (q2c0Var == q2c0.a || q2c0Var == q2c0.d) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.isEmpty()) {
            z = false;
            break;
        }
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z = false;
                break;
            }
            if (!u890.j(t2c0Var2.b.get((p2c0) it2.next()), Boolean.TRUE)) {
                z = true;
                break;
            }
        }
        if (z) {
            cqs0 cqs0Var = t2c0Var2.b;
            t2c0Var2.getClass();
            num = num2;
            hes0Var = hes0Var2;
            str = str5;
            tcs0Var = tcs0Var2;
            str2 = str6;
            fhs0Var = fhs0Var3;
            t2c0Var = t2c0Var2;
            z2 = true;
            ihs0Var = ihs0Var2;
            ccs0VarA = ccs0.a(ccs0Var, (tcs0) null, (String) null, (ee30) null, (tqw0) null, (String) null, (Integer) null, false, false, false, false, (i3g1) null, (c380) null, (v7u) null, (String) null, new t2c0(true, cqs0Var), (String) null, (String) null, (hes0) null, (imr0) null, 507903);
        } else {
            t2c0Var = t2c0Var2;
            num = num2;
            hes0Var = hes0Var2;
            ihs0Var = ihs0Var2;
            str = str5;
            tcs0Var = tcs0Var2;
            str2 = str6;
            fhs0Var = fhs0Var3;
            z2 = true;
            ccs0VarA = ccs0Var;
        }
        ee30 ee30VarB = ccs0Var.b();
        Map mapK = (ee30VarB == null || (c380Var3 = ee30VarB.e) == null) ? null : k(c380Var3);
        if (mapK != null && (mapK.isEmpty() ^ z2) == z2) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            ee30 ee30VarG = ccs0VarA.g();
            if (ee30VarG == null) {
                ccs0VarK2 = null;
            } else {
                ee30 ee30Var = ee30VarG instanceof ee30 ? ee30VarG : null;
                if (ee30Var != null) {
                    ccs0VarK2 = K(ccs0VarA, ee30.a(ee30Var, false, S(ee30Var.e, mapK, new d0e0(linkedHashSet, ccs0VarA, (byte) 9)), 15));
                } else {
                    ccs0VarK2 = null;
                }
            }
            return ccs0VarK2 == null ? Next.j() : Next.i(ccs0VarK2, linkedHashSet);
        }
        if (z) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                t2c0 t2c0Var3 = t2c0Var;
                jgw jgwVarS = !u890.j(t2c0Var3.b.get((p2c0) it3.next()), Boolean.TRUE) ? c921.s(ccs0Var, "legal_term", "required") : null;
                if (jgwVarS != null) {
                    arrayList3.add(jgwVarS);
                }
                t2c0Var = t2c0Var3;
            }
            return Next.i(ccs0VarA, o7h.p1(arrayList3));
        }
        fhs0 fhs0Var4 = fhs0Var;
        if (fhs0Var4 != null) {
            c380 c380Var7 = fhs0Var4.c;
            Map mapK2 = k(c380Var7);
            if (!mapK2.isEmpty()) {
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                return Next.i(ccs0.a(ccs0Var, (tcs0) null, (String) null, (ee30) null, ihs0.a(ihs0Var, fhs0.a(fhs0Var4, S(c380Var7, mapK2, new qae0(linkedHashSet2, ccs0Var, fhs0Var4.a, (byte) 7))), 223), (String) null, (Integer) null, false, false, false, false, (i3g1) null, (c380) null, (v7u) null, (String) null, (t2c0) null, (String) null, (String) null, (hes0) null, (imr0) null, 524279), linkedHashSet2);
            }
        }
        ihs0 ihs0Var4 = ihs0Var;
        if (!ccs0Var.g) {
            return Next.i(ccs0Var, Collections.singleton(new zgw(str2)));
        }
        String str7 = str2;
        if (ccs0Var.N0 == null) {
            Duration duration = ove0.a;
            ccs0 ccs0VarA3 = ccs0.a(ccs0Var, (tcs0) null, (String) null, (ee30) null, (tqw0) null, (String) null, (Integer) null, false, false, false, false, (i3g1) null, (c380) null, (v7u) null, "", (t2c0) null, (String) null, (String) null, (hes0) null, (imr0) null, 516095);
            String str8 = ((v4t) v4t.b.i1()).a;
            return Next.i(ccs0.a(ccs0VarA3, (tcs0) null, (String) null, (ee30) null, (tqw0) null, (String) null, (Integer) null, false, false, false, false, (i3g1) null, (c380) null, (v7u) null, (String) null, (t2c0) null, str8, (String) null, (hes0) null, (imr0) null, 491519), Collections.singleton(new tfw(ccs0VarA3.a.a, str8, duration)));
        }
        ee30 ee30VarB2 = ccs0Var.b();
        if (ee30VarB2 != null && (c380Var2 = ee30VarB2.e) != null && !c380Var2.isEmpty()) {
            Iterator it4 = c380Var2.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    z3 = false;
                    break;
                }
                if (((w220) it4.next()) instanceof t220) {
                    z3 = z2;
                    break;
                }
            }
        } else {
            z3 = false;
            break;
        }
        hes0 hes0Var3 = hes0Var;
        if (z3 && (hes0Var == null || hes0Var3.b != z2)) {
            String str9 = ((jes0) jes0.b.i1()).a;
            boolean z5 = z2;
            ccs0 ccs0VarA4 = ccs0.a(ccs0Var, (tcs0) null, (String) null, (ee30) null, (tqw0) null, (String) null, (Integer) null, false, false, false, false, (i3g1) null, (c380) null, (v7u) null, (String) null, (t2c0) null, (String) null, (String) null, hes0.a(hes0Var3 == null ? new hes0((String) null, 15) : hes0Var3, (kes0) null, true, str9, (String) null, 8), (imr0) null, 393215);
            niw uhwVar = new uhw(str7);
            niw xewVar = new xew(str7, str9);
            niw[] niwVarArr = new niw[2];
            niwVarArr[0] = uhwVar;
            niwVarArr[z5 ? 1 : 0] = xewVar;
            return Next.i(ccs0VarA4, f46.S0(niwVarArr));
        }
        boolean z6 = z2;
        if (z3) {
            if ((hes0Var3 != null ? hes0Var3.a : null) == null) {
                return Next.j();
            }
        }
        ee30 ee30VarB3 = ccs0Var.b();
        if (ee30VarB3 == null || (c380Var = ee30VarB3.e) == null) {
            c380Var = fhs0Var4 != null ? fhs0Var4.c : null;
        }
        if (c380Var != null) {
            ArrayList arrayList4 = new ArrayList();
            for (t220 t220Var : c380Var) {
                if (t220Var instanceof s220) {
                    s220 s220Var = (s220) t220Var;
                    mmr0Var = new mmr0(s220Var.a, s220Var.i);
                } else if (t220Var instanceof q220) {
                    q220 q220Var = (q220) t220Var;
                    mmr0Var = new mmr0(q220Var.b, q220Var.d);
                } else if (t220Var instanceof p220) {
                    p220 p220Var = (p220) t220Var;
                    mmr0Var = new mmr0(p220Var.b, p220Var.d);
                } else if (t220Var instanceof o220) {
                    o220 o220Var = (o220) t220Var;
                    mmr0Var = new mmr0(o220Var.a, String.valueOf(o220Var.d));
                } else if (t220Var instanceof v220) {
                    mmr0Var = null;
                } else {
                    if (t220Var instanceof t220) {
                        if (hes0Var3 != null && (kes0Var = hes0Var3.a) != null) {
                            mmr0Var = new mmr0(t220Var.a, kes0Var.a);
                        }
                    } else if (!(t220Var instanceof r220)) {
                        eg.o();
                        return null;
                    }
                    mmr0Var = null;
                }
                if (mmr0Var != null) {
                    arrayList4.add(mmr0Var);
                }
            }
            cqs0VarB = mqo1.B(sqg0.T(arrayList4));
        } else {
            cqs0VarB = null;
        }
        String str10 = ((bp21) bp21.b.i1()).a;
        if (ihs0Var4 == null) {
            String str11 = tcs0Var.b;
            i3g1 i3g1Var = ccs0Var.X;
            bma1 bma1Var = xcs0.f;
            String strConcat = "https://www.spotify.com/api/payment-sdk/android/v3/cancel/?payment-session-id=".concat(str7);
            str.getClass();
            ee30 ee30Var2 = ccs0Var.c;
            String str12 = ee30Var2 != null ? ee30Var2.a : null;
            str12.getClass();
            cqs0VarB.getClass();
            fhs0Var2 = null;
            setSingleton = Collections.singleton(new vfw(str7, str11, i3g1Var, strConcat, str, str12, cqs0VarB, ccs0Var.N0, str10));
            str3 = str10;
        } else {
            fhs0Var2 = null;
            tcs0 tcs0Var3 = tcs0Var;
            if (ihs0Var4 instanceof ee30) {
                String str13 = tcs0Var3.a;
                str.getClass();
                String str14 = ((ee30) ihs0Var4).a;
                num.getClass();
                int iIntValue = num.intValue();
                cqs0VarB.getClass();
                str3 = str10;
                setSingleton = Collections.singleton(new wfw(str13, str, str14, iIntValue, cqs0VarB, str3));
            } else {
                String str15 = str;
                if (ihs0Var4 instanceof ths0) {
                    str3 = str10;
                    str15.getClass();
                    num.getClass();
                    setSingleton = Collections.singleton(new xfw(str7, str15, num.intValue(), str3));
                } else {
                    if (!(ihs0Var4 instanceof ihs0)) {
                        str3 = str10;
                        eg.o();
                        return null;
                    }
                    String str16 = tcs0Var3.a;
                    if (fhs0Var4 != null) {
                        str15.getClass();
                        String str17 = fhs0Var4.a;
                        num.getClass();
                        int iIntValue2 = num.intValue();
                        if (cqs0VarB == null) {
                            str3 = str10;
                            cqs0VarB = dqs0.e;
                        }
                        str3 = str10;
                        setSingleton = Collections.singleton(new wfw(str16, str15, str17, iIntValue2, cqs0VarB, str3));
                    } else {
                        str3 = str10;
                        str15.getClass();
                        num.getClass();
                        setSingleton = Collections.singleton(new xfw(str16, str15, num.intValue(), str3));
                    }
                }
            }
        }
        ee30 ee30VarB4 = ccs0Var.b();
        if (ee30VarB4 != null && (ccs0VarK = K(ccs0Var, ee30.a(ee30VarB4, z6, fhs0Var2, 23))) != null) {
            return Next.i(ccs0.a(ccs0VarK, (tcs0) null, (String) null, (ee30) null, (tqw0) null, (String) null, (Integer) null, false, false, false, false, (i3g1) null, (c380) null, (v7u) null, (String) null, (t2c0) null, (String) null, str3, (hes0) null, (imr0) null, 458751), setSingleton);
        }
        String str18 = str3;
        ihs0 ihs0Var5 = z4 ? ihs0Var4 : fhs0Var2;
        if (ihs0Var5 == null) {
            ccs0VarA2 = ccs0Var;
        } else {
            if (((ihs0) ihs0Var5).f == null) {
                ihs0Var5 = fhs0Var2;
            }
            if (ihs0Var5 != null) {
                ccs0VarA2 = ccs0.a(ccs0Var, (tcs0) null, (String) null, (ee30) null, ihs0.a(ihs0Var5, fhs0Var2, 127), (String) null, (Integer) null, false, false, false, false, (i3g1) null, (c380) null, (v7u) null, (String) null, (t2c0) null, (String) null, (String) null, (hes0) null, (imr0) null, 524279);
            } else {
                ccs0VarA2 = ccs0Var;
            }
        }
        return Next.i(ccs0.a(ccs0VarA2, (tcs0) null, (String) null, (ee30) null, (tqw0) null, (String) null, (Integer) null, false, false, false, false, (i3g1) null, (c380) null, (v7u) null, (String) null, (t2c0) null, (String) null, str18, (hes0) null, (imr0) null, 458751), setSingleton);
    }

    public static final Next I(Duration duration, ccs0 ccs0Var, Set set) {
        String str = ((v4t) v4t.b.i1()).a;
        sfw sfwVar = new sfw(ccs0Var.a.a, str, duration);
        return Next.i(ccs0.a(ccs0Var, (tcs0) null, (String) null, (ee30) null, (tqw0) null, (String) null, (Integer) null, false, false, false, false, (i3g1) null, (c380) null, (v7u) null, (String) null, (t2c0) null, str, (String) null, (hes0) null, (imr0) null, 491519), set != null ? dm61.x0(sfwVar, set) : Collections.singleton(sfwVar));
    }

    public static final Next J(xsk1 xsk1Var, qsk1 qsk1Var) {
        jrk1 jrk1Var;
        fj50 fj50VarU;
        boolean z = xsk1Var.h;
        int i = xsk1Var.g;
        Double d = xsk1Var.b;
        w7x w7xVar = xsk1Var.k;
        Map map = xsk1Var.j;
        if (qsk1Var instanceof csk1) {
            return Next.h(xsk1.a(xsk1Var, (Double) null, (Double) null, (l0l) null, 0, ((csk1) qsk1Var).a, false, 0, false, (Map) null, (Set) null, 2031));
        }
        boolean z2 = false;
        if (qsk1Var instanceof xrk1) {
            xrk1 xrk1Var = (xrk1) qsk1Var;
            boolean z3 = xsk1Var.f;
            l0l l0lVar = xsk1Var.c;
            if (z3) {
                String strD = l0lVar != null ? l0lVar.d() : null;
                l0l l0lVar2 = xrk1Var.a;
                if (u890.j(strD, l0lVar2 != null ? l0lVar2.d() : null)) {
                    z2 = true;
                }
            }
            l0l l0lVar3 = xrk1Var.a;
            xsk1 xsk1VarA = xsk1.a(xsk1Var, (Double) null, (Double) null, l0lVar3, 0, (h06) null, false, 0, false, (Map) null, (Set) null, 2043);
            if (!z2) {
                if (l0lVar3 == null || !bno1.v(l0lVar3)) {
                    xsk1VarA = xsk1.a(xsk1VarA, (Double) null, (Double) null, (l0l) null, 0, (h06) null, false, 0, false, (Map) null, (Set) null, 2046);
                } else {
                    double dB = wmo1.B(l0lVar3.c());
                    if (bno1.r(xsk1Var.a, dB)) {
                        xsk1VarA = xsk1.a(xsk1VarA, Double.valueOf(dB), (Double) null, (l0l) null, 0, (h06) null, false, 0, false, (Map) null, (Set) null, 2014);
                    }
                }
            }
            xsk1 xsk1Var2 = xsk1VarA;
            boolean zJ = u890.j(l0lVar != null ? l0lVar.d() : null, l0lVar3 != null ? l0lVar3.d() : null);
            List<lk50> list = (l0lVar3 == null || (fj50VarU = l0lVar3.u()) == null) ? null : fj50VarU.a;
            if (list == null) {
                list = z6x.a;
            }
            ArrayList arrayList = new ArrayList();
            for (lk50 lk50Var : list) {
                rk50 rk50Var = lk50Var.g;
                mmr0 mmr0Var = rk50Var != null ? new mmr0(lk50Var.a.a, new wk50(rk50Var.a, rk50Var.b)) : null;
                if (mmr0Var != null) {
                    arrayList.add(mmr0Var);
                }
            }
            Map mapT = sqg0.T(arrayList);
            if (!zJ) {
                w7xVar = w7x.a;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (w7xVar.contains((String) entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return Next.h(xsk1.a(xsk1Var2, (Double) null, (Double) null, (l0l) null, 0, (h06) null, false, 0, false, sqg0.O(mapT, linkedHashMap), w7xVar, NativeMediaProcessor$Companion.PROCESS_SAMPLE_RESULT_INVALID_BUFFER_CAPACITY));
        }
        if (qsk1Var instanceof psk1) {
            psk1 psk1Var = (psk1) qsk1Var;
            p811 p811Var = new p811();
            p811Var.a = Next.j();
            double d2 = psk1Var.a;
            o8e1 o8e1Var = new o8e1(psk1Var, xsk1Var, p811Var, (byte) 24);
            if (d == null || Math.abs(d.doubleValue() - d2) > 0.001d) {
                o8e1Var.invoke();
            }
            return (Next) p811Var.a;
        }
        if (qsk1Var instanceof bsk1) {
            b32 b32Var = ((bsk1) qsk1Var).a;
            Set setW0 = dm61.w0(new rrk1[]{new erk1(b32Var, z)});
            if (d != null) {
                setW0.add(new krk1(new ork1(d.doubleValue(), b32Var.a), b32Var.b));
            }
            return Next.a(setW0);
        }
        if (qsk1Var instanceof lsk1) {
            xl61 xl61Var = ((lsk1) qsk1Var).a;
            return Next.a(Effects.a(new rrk1[]{new nrk1(xl61Var, z), new krk1(new prk1(xl61Var.a, true), xl61Var.b)}));
        }
        if (qsk1Var instanceof osk1) {
            osk1 osk1Var = (osk1) qsk1Var;
            if (!osk1Var.b) {
                return Next.j();
            }
            int i2 = xsk1Var.d;
            Double d3 = osk1Var.d;
            jrk1Var = d3 != null ? new jrk1(osk1Var.a.b, d3.doubleValue(), Double.valueOf(osk1Var.c), i2) : null;
            return Next.i(xsk1.a(xsk1Var, (Double) null, osk1Var.d, (l0l) null, 0, (h06) null, false, 0, false, (Map) null, (Set) null, 2045), jrk1Var != null ? Effects.a(new jrk1[]{jrk1Var}) : Effects.a(new jrk1[0]));
        }
        if (qsk1Var instanceof nsk1) {
            nsk1 nsk1Var = (nsk1) qsk1Var;
            if (!nsk1Var.b) {
                return Next.j();
            }
            int i3 = xsk1Var.d;
            Double d4 = nsk1Var.d;
            jrk1Var = d4 != null ? new jrk1(nsk1Var.a.b, d4.doubleValue(), Double.valueOf(nsk1Var.c), i3) : null;
            return Next.i(xsk1.a(xsk1Var, (Double) null, nsk1Var.d, (l0l) null, 0, (h06) null, false, 0, false, (Map) null, (Set) null, 2045), jrk1Var != null ? Effects.a(new jrk1[]{jrk1Var}) : Effects.a(new jrk1[0]));
        }
        if (qsk1Var instanceof hsk1) {
            return Next.h(xsk1.a(xsk1Var, (Double) null, (Double) null, (l0l) null, ((hsk1) qsk1Var).a, (h06) null, false, 0, false, (Map) null, (Set) null, 2039));
        }
        if (qsk1Var instanceof dsk1) {
            dsk1 dsk1Var = (dsk1) qsk1Var;
            return dsk1Var.b ? Next.h(xsk1.a(xsk1Var, Double.valueOf(dsk1Var.c), (Double) null, (l0l) null, 0, (h06) null, false, 0, false, (Map) null, (Set) null, 2046)) : Next.j();
        }
        if (qsk1Var instanceof yrk1) {
            return u(xsk1Var, (yrk1) qsk1Var);
        }
        if (qsk1Var instanceof isk1) {
            return B(xsk1Var, (isk1) qsk1Var);
        }
        if (qsk1Var instanceof wrk1) {
            return Next.h(xsk1.a(xsk1Var, (Double) null, (Double) null, (l0l) null, 0, (h06) null, false, ((wrk1) qsk1Var).a, false, (Map) null, (Set) null, 1983));
        }
        if (qsk1Var instanceof ask1) {
            b32 b32Var2 = ((ask1) qsk1Var).a;
            int iC = l1d.C(i);
            if (iC != 0) {
                if (iC == 1) {
                    return u(xsk1Var, new yrk1(b32Var2));
                }
                eg.o();
                return null;
            }
            Set setW1 = dm61.w0(new rrk1[]{new erk1(b32Var2, z)});
            if (d != null) {
                setW1.add(new krk1(new ork1(d.doubleValue(), b32Var2.a), b32Var2.b));
            }
            return Next.a(setW1);
        }
        if (qsk1Var instanceof ksk1) {
            xl61 xl61Var2 = ((ksk1) qsk1Var).a;
            int iC2 = l1d.C(i);
            if (iC2 == 0) {
                return Next.a(Effects.a(new rrk1[]{new nrk1(xl61Var2, z), new krk1(new prk1(xl61Var2.a, true), xl61Var2.b)}));
            }
            if (iC2 == 1) {
                return B(xsk1Var, new isk1(xl61Var2));
            }
            eg.o();
            return null;
        }
        if (qsk1Var instanceof esk1) {
            return Next.h(xsk1.a(xsk1Var, (Double) null, (Double) null, (l0l) null, 0, (h06) null, false, 0, false, (Map) null, (Set) null, 2015));
        }
        if (qsk1Var instanceof msk1) {
            return Next.h(xsk1.a(xsk1Var, (Double) null, (Double) null, (l0l) null, 0, (h06) null, false, 0, ((msk1) qsk1Var).a, (Map) null, (Set) null, 1919));
        }
        if (qsk1Var instanceof jsk1) {
            jsk1 jsk1Var = (jsk1) qsk1Var;
            xl61 xl61Var3 = jsk1Var.b;
            double d5 = xl61Var3.a;
            String str = jsk1Var.a;
            wk50 wk50Var = (wk50) map.get(str);
            if (wk50Var == null) {
                return Next.j();
            }
            return (zmo1.y(Double.valueOf(d5), xl61Var3.b, xl61Var3.c) == null || !bno1.r(Double.valueOf(wk50Var.a), d5)) ? Next.j() : Next.i(xsk1.a(xsk1Var, (Double) null, (Double) null, (l0l) null, 0, (h06) null, false, 0, false, sqg0.P(map, new mmr0(str, new wk50(d5, wk50Var.b))), dm61.x0(str, w7xVar), NativeMediaProcessor$Companion.PROCESS_SAMPLE_RESULT_INVALID_BUFFER_CAPACITY), Effects.a(new rrk1[]{new irk1(str), new mrk1(str, xl61Var3)}));
        }
        if (qsk1Var instanceof zrk1) {
            zrk1 zrk1Var = (zrk1) qsk1Var;
            String str2 = zrk1Var.a;
            b32 b32Var3 = zrk1Var.b;
            wk50 wk50Var2 = (wk50) map.get(str2);
            if (wk50Var2 == null) {
                return Next.j();
            }
            Integer num = wk50Var2.b;
            if (num == null) {
                return Next.j();
            }
            int iIntValue = num.intValue();
            return iIntValue <= 0 ? Next.j() : Next.i(xsk1.a(xsk1Var, (Double) null, (Double) null, (l0l) null, 0, (h06) null, false, 0, false, sqg0.P(map, new mmr0(str2, new wk50(O(wk50Var2.a, iIntValue, b32Var3.a), num))), dm61.x0(str2, w7xVar), NativeMediaProcessor$Companion.PROCESS_SAMPLE_RESULT_INVALID_BUFFER_CAPACITY), Effects.a(new rrk1[]{new irk1(str2), new drk1(str2, b32Var3)}));
        }
        if (!(qsk1Var instanceof fsk1)) {
            if (qsk1Var instanceof gsk1) {
                return Next.h(xsk1.a(xsk1Var, (Double) null, (Double) null, (l0l) null, 0, (h06) null, false, 0, false, (Map) null, dm61.u0(((gsk1) qsk1Var).a, w7xVar), 1023));
            }
            eg.o();
            return null;
        }
        fsk1 fsk1Var = (fsk1) qsk1Var;
        boolean z4 = fsk1Var.c;
        String str3 = fsk1Var.a;
        if (!z4) {
            return Next.j();
        }
        wk50 wk50Var3 = (wk50) map.get(str3);
        return wk50Var3 == null ? Next.j() : Next.h(xsk1.a(xsk1Var, (Double) null, (Double) null, (l0l) null, 0, (h06) null, false, 0, false, sqg0.P(map, new mmr0(str3, new wk50(fsk1Var.b, wk50Var3.b))), (Set) null, 1535));
    }

    public static final ccs0 K(ccs0 ccs0Var, ee30 ee30Var) {
        if (ccs0Var.d != null) {
            return ccs0.a(ccs0Var, (tcs0) null, (String) null, (ee30) null, ee30Var, (String) null, (Integer) null, false, false, false, false, (i3g1) null, (c380) null, (v7u) null, (String) null, (t2c0) null, (String) null, (String) null, (hes0) null, (imr0) null, 524279);
        }
        if (ccs0Var.c != null) {
            return ccs0.a(ccs0Var, (tcs0) null, (String) null, ee30Var, (tqw0) null, (String) null, (Integer) null, false, false, false, false, (i3g1) null, (c380) null, (v7u) null, (String) null, (t2c0) null, (String) null, (String) null, (hes0) null, (imr0) null, 524283);
        }
        return null;
    }

    public static final ccs0 L(ccs0 ccs0Var, String str, String str2, String str3) {
        ihs0 ihs0Var = ccs0Var.d;
        if (!(ihs0Var instanceof ihs0)) {
            ee30 ee30VarB = ccs0Var.b();
            if (ee30VarB != null) {
                return K(ccs0Var, ee30.a(ee30VarB, false, P(str, str2, str3, ee30VarB.e), 15));
            }
            return null;
        }
        ihs0 ihs0Var2 = ihs0Var;
        fhs0 fhs0Var = ihs0Var2.f;
        if (fhs0Var == null) {
            return null;
        }
        return ccs0.a(ccs0Var, (tcs0) null, (String) null, (ee30) null, ihs0.a(ihs0Var2, fhs0.a(fhs0Var, P(str, str2, str3, fhs0Var.c)), 223), (String) null, (Integer) null, false, false, false, false, (i3g1) null, (c380) null, (v7u) null, (String) null, (t2c0) null, (String) null, (String) null, (hes0) null, (imr0) null, 524279);
    }

    public static final Next M(ccs0 ccs0Var, rz21 rz21Var, String str, tqw0 tqw0Var) {
        ehs0 ehs0Var;
        fhs0 fhs0Var;
        bz21 bz21Var;
        ehs0 ehs0Var2;
        v7u v7uVar = ccs0Var.Z;
        if (rz21Var instanceof yy21) {
            return Next.a(Collections.singleton(ciw.a));
        }
        if (rz21Var instanceof iz21) {
            return Next.i(ccs0.a(ccs0Var, (tcs0) null, (String) null, (ee30) null, (tqw0) null, ((iz21) rz21Var).a, (Integer) null, false, false, false, false, (i3g1) null, (c380) null, (v7u) null, (String) null, (t2c0) null, (String) null, (String) null, (hes0) null, (imr0) null, 524263), Collections.singleton(c921.t(ccs0Var, 5)));
        }
        if (rz21Var instanceof az21) {
            return Next.i(ccs0.a(ccs0Var, (tcs0) null, (String) null, (ee30) null, (tqw0) null, v7uVar != null ? nhc1.W(nhc1.W(((az21) rz21Var).b, "{fullPriceUrl}", "REQUEST_FULL_PRICE_OFFER"), "{productName}", v7uVar.a) : ((az21) rz21Var).a, (Integer) null, false, false, false, false, (i3g1) null, (c380) null, (v7u) null, (String) null, (t2c0) null, (String) null, (String) null, (hes0) null, (imr0) null, 524263), Collections.singleton(c921.t(ccs0Var, 6)));
        }
        if (rz21Var instanceof mz21) {
            return Next.i(ccs0.a(ccs0Var, (tcs0) null, (String) null, (ee30) null, (tqw0) null, v7uVar != null ? nhc1.W(nhc1.W(((mz21) rz21Var).b, "{fullPriceUrl}", "REQUEST_FULL_PRICE_OFFER"), "{productName}", v7uVar.a) : ((mz21) rz21Var).a, (Integer) null, false, false, false, false, (i3g1) null, (c380) null, (v7u) null, (String) null, (t2c0) null, (String) null, (String) null, (hes0) null, (imr0) null, 524263), Collections.singleton(c921.t(ccs0Var, 7)));
        }
        if (rz21Var instanceof xy21) {
            return Next.i(ccs0.a(ccs0Var, (tcs0) null, (String) null, (ee30) null, (tqw0) null, ((xy21) rz21Var).a, (Integer) null, false, false, false, false, (i3g1) null, (c380) null, (v7u) null, (String) null, (t2c0) null, (String) null, (String) null, (hes0) null, (imr0) null, 524263), Collections.singleton(c921.t(ccs0Var, 8)));
        }
        boolean z = rz21Var instanceof pz21;
        ths0 ths0Var = ths0.a;
        if (z) {
            return (tqw0Var == null || !((tqw0Var instanceof ths0) || (tqw0Var instanceof ihs0))) ? I(((pz21) rz21Var).a, ccs0.a(ccs0Var, (tcs0) null, (String) null, (ee30) null, ths0Var, (String) null, (Integer) null, false, false, false, false, (i3g1) null, (c380) null, (v7u) null, (String) null, (t2c0) null, (String) null, (String) null, (hes0) null, (imr0) null, 524279), null) : I(((pz21) rz21Var).a, ccs0Var, null);
        }
        if (rz21Var instanceof lz21) {
            lz21 lz21Var = (lz21) rz21Var;
            return I(lz21Var.a, ccs0.a(ccs0Var, (tcs0) null, (String) null, (ee30) null, ths0Var, (String) null, (Integer) null, false, false, false, true, (i3g1) null, (c380) null, (v7u) null, (String) null, (t2c0) null, (String) null, (String) null, (hes0) null, (imr0) null, 523767), Collections.singleton(new ghw(str, lz21Var.b, lz21Var.c)));
        }
        if (rz21Var instanceof vy21) {
            return Next.a(Collections.singleton(dhw.a));
        }
        if (rz21Var instanceof kz21) {
            return x(ccs0Var);
        }
        if (rz21Var instanceof hz21) {
            String str2 = ccs0Var.b;
            if (str2 == null) {
                str2 = "";
            }
            return Next.a(Collections.singleton(new bhw(str, str2)));
        }
        if (rz21Var instanceof nz21) {
            nz21 nz21Var = (nz21) rz21Var;
            return Next.a(Collections.singleton(new rhw(str, nz21Var.a, nz21Var.b)));
        }
        if (rz21Var instanceof wy21) {
            return Next.a(Collections.singleton(new ygw(str, ((wy21) rz21Var).a)));
        }
        if (!(rz21Var instanceof gz21)) {
            eg.o();
            return null;
        }
        gz21 gz21Var = (gz21) rz21Var;
        cz21 cz21Var = gz21Var.d;
        String str3 = gz21Var.b;
        String str4 = gz21Var.a;
        c380<fz21> c380Var = gz21Var.c;
        ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
        for (fz21 fz21Var : c380Var) {
            arrayList.add(new hhs0(fz21Var.c, fz21Var.a, fz21Var.b));
        }
        c380 c380VarA = mqo1.A(arrayList);
        ez21 ez21Var = gz21Var.e;
        ghs0 ghs0Var = ez21Var != null ? new ghs0(ez21Var.a, ez21Var.b) : null;
        if (cz21Var == null || (bz21Var = cz21Var.b) == null) {
            ehs0Var = null;
        } else {
            ihs0 ihs0Var = ccs0Var.d;
            ihs0 ihs0Var2 = ihs0Var instanceof ihs0 ? ihs0Var : null;
            ehs0Var = new ehs0((ihs0Var2 == null || (ehs0Var2 = ihs0Var2.e) == null) ? bz21Var.a : ehs0Var2.a, bz21Var.b);
        }
        dz21 dz21Var = gz21Var.f;
        if (dz21Var != null) {
            String str5 = dz21Var.a;
            String str6 = dz21Var.b;
            c380 c380Var2 = dz21Var.c;
            String str7 = dz21Var.d;
            ee30 ee30Var = ccs0Var.c;
            String str8 = ee30Var != null ? ee30Var.b : null;
            xbs0 xbs0VarH = ccs0Var.h();
            fhs0Var = new fhs0(str5, str6, c380Var2, str7, str8, xbs0VarH != null ? xbs0VarH.g : null);
        } else {
            fhs0Var = null;
        }
        ccs0 ccs0VarA = ccs0.a(ccs0Var, (tcs0) null, (String) null, (ee30) null, new ihs0(str3, str4, c380VarA, ghs0Var, ehs0Var, fhs0Var, gz21Var.g, false), (String) null, (Integer) null, false, false, false, false, (i3g1) null, (c380) null, (v7u) null, (String) null, (t2c0) null, (String) null, (String) null, (hes0) null, (imr0) null, 524279);
        return cz21Var != null ? I(cz21Var.a, ccs0VarA, null) : Next.h(ccs0VarA);
    }

    public static final b320 N(String str, c380 c380Var) {
        b320 b320Var;
        Iterator it = c380Var.iterator();
        do {
            b320Var = null;
            if (it.hasNext()) {
                kk80 kk80Var = (kk80) it.next();
                if (kk80Var instanceof gk80) {
                    gk80 gk80Var = (gk80) kk80Var;
                    if (str.length() > gk80Var.a) {
                        b320Var = new b320(gk80Var.b, "maxLength");
                    }
                } else if (kk80Var instanceof ik80) {
                    ik80 ik80Var = (ik80) kk80Var;
                    if (!Pattern.compile(ik80Var.a).matcher(str).matches()) {
                        b320Var = new b320(ik80Var.b, "regex");
                    }
                } else if (kk80Var instanceof jk80) {
                    if (str.length() == 0) {
                        b320Var = new b320(((jk80) kk80Var).a, "required");
                    }
                } else if (kk80Var instanceof fk80) {
                    Duration duration = ove0.a;
                    String strO = cy30.o("\\D", str, "");
                    if (strO.length() != 11 || hfb.p(9, strO) != eth.n(strO.charAt(9)) || hfb.p(10, strO) != eth.n(strO.charAt(10))) {
                        b320Var = new b320(((fk80) kk80Var).a, "cpfInvalid");
                    }
                } else if (kk80Var instanceof hk80) {
                    Duration duration2 = ove0.a;
                    String strO2 = cy30.o("\\D", str, "");
                    if (strO2.length() >= 13 && strO2.length() <= 19) {
                        int i = 0;
                        boolean z = false;
                        for (int length = strO2.length() - 1; -1 < length; length--) {
                            int iN = eth.n(strO2.charAt(length));
                            if (z && (iN = iN * 2) > 9) {
                                iN -= 9;
                            }
                            i += iN;
                            z = !z;
                        }
                        if (i % 10 == 0) {
                            b320Var = new b320(((hk80) kk80Var).a, "noCardNumber");
                        }
                    }
                } else {
                    eg.o();
                }
            }
            return null;
        } while (b320Var == null);
        return b320Var;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c A[PHI: r12
      0x001c: PHI (r12v5 double) = (r12v1 double), (r12v7 double) binds: [B:16:0x0029, B:10:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    public static final double O(double d, int i, int i2) {
        double d2;
        double d3 = 1.0d;
        double d4 = 1.0d / ((double) (i < 24 ? i : 24));
        double d5 = 1.0d / ((double) i);
        int iC = l1d.C(i2);
        if (iC == 0) {
            d2 = d - d4;
            if (d2 < 0.0d) {
                d3 = 0.0d;
            } else {
                d3 = d2;
            }
        } else {
            if (iC != 1) {
                eg.o();
                return 0.0d;
            }
            d2 = d + d4;
            if (d2 <= 1.0d) {
                d3 = d2;
            }
        }
        return yoi1.n(((double) jch0.S(d3 / d5)) * d5, 0.0d, 1.0d);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0031  */
    /* JADX WARN: Code duplicated, block: B:12:0x0035  */
    /* JADX WARN: Code duplicated, block: B:14:0x0040  */
    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:18:0x004f  */
    /* JADX WARN: Code duplicated, block: B:20:0x005a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0068  */
    /* JADX WARN: Code duplicated, block: B:25:0x0073  */
    /* JADX WARN: Code duplicated, block: B:33:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0081 A[SYNTHETIC] */
    public static final c380 P(String str, String str2, String str3, c380 c380Var) {
        o220 o220Var;
        String str4;
        p220 p220Var;
        String str5;
        w220 p220Var2;
        q220 q220Var;
        String str6;
        ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
        Iterator it = c380Var.iterator();
        while (it.hasNext()) {
            w220 o220Var2 = (w220) it.next();
            if (o220Var2 instanceof s220) {
                s220 s220Var = (s220) o220Var2;
                if (u890.j(s220Var.a, str)) {
                    o220Var2 = s220.a(s220Var, str3, str2, 127);
                } else if (o220Var2 instanceof q220) {
                    q220Var = (q220) o220Var2;
                    str6 = q220Var.b;
                    if (u890.j(str6, str)) {
                        p220Var2 = new q220(q220Var.a, str6, str2, q220Var.c);
                    } else {
                        if (o220Var2 instanceof p220) {
                            p220Var = (p220) o220Var2;
                            str5 = p220Var.b;
                            if (u890.j(str5, str)) {
                                p220Var2 = new p220(p220Var.a, str5, str2, p220Var.c);
                            }
                        }
                        if (o220Var2 instanceof o220) {
                            o220Var = (o220) o220Var2;
                            str4 = o220Var.a;
                            if (u890.j(str4, str)) {
                                o220Var2 = new o220(str4, o220Var.b, o220Var.c, Boolean.parseBoolean(str2));
                            }
                        }
                    }
                    o220Var2 = p220Var2;
                } else {
                    if (o220Var2 instanceof p220) {
                        p220Var = (p220) o220Var2;
                        str5 = p220Var.b;
                        if (u890.j(str5, str)) {
                            p220Var2 = new p220(p220Var.a, str5, str2, p220Var.c);
                            o220Var2 = p220Var2;
                        }
                    }
                    if (o220Var2 instanceof o220) {
                        o220Var = (o220) o220Var2;
                        str4 = o220Var.a;
                        if (u890.j(str4, str)) {
                            o220Var2 = new o220(str4, o220Var.b, o220Var.c, Boolean.parseBoolean(str2));
                        }
                    }
                }
            } else if (o220Var2 instanceof q220) {
                q220Var = (q220) o220Var2;
                str6 = q220Var.b;
                if (u890.j(str6, str)) {
                    p220Var2 = new q220(q220Var.a, str6, str2, q220Var.c);
                } else {
                    if (o220Var2 instanceof p220) {
                        p220Var = (p220) o220Var2;
                        str5 = p220Var.b;
                        if (u890.j(str5, str)) {
                            p220Var2 = new p220(p220Var.a, str5, str2, p220Var.c);
                        }
                    }
                    if (o220Var2 instanceof o220) {
                        o220Var = (o220) o220Var2;
                        str4 = o220Var.a;
                        if (u890.j(str4, str)) {
                            o220Var2 = new o220(str4, o220Var.b, o220Var.c, Boolean.parseBoolean(str2));
                        }
                    }
                }
                o220Var2 = p220Var2;
            } else {
                if (o220Var2 instanceof p220) {
                    p220Var = (p220) o220Var2;
                    str5 = p220Var.b;
                    if (u890.j(str5, str)) {
                        p220Var2 = new p220(p220Var.a, str5, str2, p220Var.c);
                        o220Var2 = p220Var2;
                    }
                }
                if (o220Var2 instanceof o220) {
                    o220Var = (o220) o220Var2;
                    str4 = o220Var.a;
                    if (u890.j(str4, str)) {
                        o220Var2 = new o220(str4, o220Var.b, o220Var.c, Boolean.parseBoolean(str2));
                    }
                }
            }
            arrayList.add(o220Var2);
        }
        return mqo1.A(arrayList);
    }

    public static final ccs0 Q(ccs0 ccs0Var, iu30 iu30Var) {
        ee30 ee30VarB = ccs0Var.b();
        if (ee30VarB != null) {
            c380<w220> c380Var = ee30VarB.e;
            ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
            for (w220 w220Var : c380Var) {
                if (w220Var instanceof t220) {
                    w220Var = (w220) iu30Var.invoke(w220Var);
                }
                arrayList.add(w220Var);
            }
            ccs0 ccs0VarK = K(ccs0Var, ee30.a(ee30VarB, false, mqo1.A(arrayList), 15));
            if (ccs0VarK != null) {
                return ccs0VarK;
            }
        }
        return ccs0Var;
    }

    public static final ee30 R(ee30 ee30Var) {
        c380<t220> c380Var = ee30Var.e;
        ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
        for (t220 t220VarA : c380Var) {
            if (t220VarA instanceof t220) {
                t220VarA = t220.a(t220VarA, 1, 0.0d, 1023);
            }
            arrayList.add(t220VarA);
        }
        return ee30.a(ee30Var, false, mqo1.A(arrayList), 15);
    }

    public static final c380 S(c380 c380Var, Map map, vu30 vu30Var) {
        ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
        Iterator it = c380Var.iterator();
        while (it.hasNext()) {
            w220 w220VarA = (w220) it.next();
            if (w220VarA instanceof s220) {
                s220 s220Var = (s220) w220VarA;
                String str = s220Var.a;
                if (map.containsKey(str)) {
                    b320 b320Var = (b320) sqg0.G(str, map);
                    vu30Var.invoke(str, b320Var.b);
                    w220VarA = s220.a(s220Var, b320Var.a, null, 383);
                }
            }
            arrayList.add(w220VarA);
        }
        return mqo1.A(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:148:0x032a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    public static final void a(vme0 vme0Var, iu30 iu30Var, fad0 fad0Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        Object obj;
        boolean z;
        int i3;
        int i4;
        boolean z2;
        g36 g36Var;
        char c2;
        char c3;
        boolean z3;
        int i5;
        qim0 qim0Var3;
        int i6;
        int i7;
        int i8;
        ?? r6;
        m4c m4cVar;
        m4c m4cVar2;
        int i9;
        int i10;
        Object obj2;
        Object obj3;
        fad0 fad0Var2 = fad0Var;
        int i11 = vme0Var.c;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1611629046);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(vme0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & NativeMediaProcessor$Companion.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) == 0 ? x340Var.g(fad0Var2) : x340Var.i(fad0Var2) ? 256 : 128;
        }
        int i12 = i2 | 3072;
        if (x340Var.Y(i12 & 1, (i12 & 1171) != 1170)) {
            ((cir0) x340Var.k(k2r0.a)).j(new yef(iu30Var, (byte) 1));
            Object objT = x340Var.T();
            m4c m4cVar3 = fkj0.X;
            if (objT == m4cVar3) {
                obj = objT;
                hrr0 hrr0VarQ = v8r.q((Object) null);
                x340Var.s0(hrr0VarQ);
                obj = hrr0VarQ;
            }
            obj = objT;
            ven0 ven0Var = (ven0) obj;
            xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
            List list = vme0Var.a;
            boolean zI = x340Var.i(xtb0VarA);
            Object objT2 = x340Var.T();
            Object obj4 = objT2;
            if (zI || objT2 == m4cVar3) {
                pw1 pw1Var = new pw1(xtb0VarA, (lnm) null, (byte) 1);
                x340Var.s0(pw1Var);
                obj4 = pw1Var;
            }
            qxd0.t(list, x340Var, (vu30) obj4);
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var4, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            int iC = l1d.C(i11);
            if (iC == 0) {
                z = false;
                i3 = 1135417699;
                i4 = 2131957655;
            } else if (iC == 1) {
                z = false;
                i3 = 1135420297;
                i4 = 2131957658;
            } else {
                if (iC != 2) {
                    throw p3d1.k(x340Var, 1135416631, false);
                }
                i3 = 1135422982;
                i4 = 2131957657;
                z = false;
            }
            ome0 ome0Var = new ome0(x0d.k(x340Var, i3, i4, x340Var, z), i11 != 1);
            int i13 = i12 & 896;
            int i14 = i12 & 112;
            boolean z4 = (i13 == 256 || ((i12 & NativeMediaProcessor$Companion.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0 && x340Var.i(fad0Var2))) | (i14 == 32);
            Object objT3 = x340Var.T();
            Object obj5 = objT3;
            if (z4 || objT3 == m4cVar3) {
                puh puhVar = new puh(fad0Var2, iu30Var, (byte) 21);
                x340Var.s0(puhVar);
                obj5 = puhVar;
            }
            i9p1.h(ome0Var, (iu30) obj5, (qim0) null, x340Var, 0);
            if (vme0Var.b == 2) {
                x340Var.i0(-1923477197);
                qim0 qim0VarB = uyn1.B(u291.d(qim0Var4, 1.0f), 0.0f, 48.0f, 0.0f, 0.0f, 13);
                fgz fgzVar = new fgz(ggz.a, (dgz) null, 6);
                Object objT4 = x340Var.T();
                if (objT4 == m4cVar3) {
                    obj3 = objT4;
                    cjj cjjVar = cjj.Z;
                    x340Var.s0(cjjVar);
                    obj3 = cjjVar;
                }
                obj3 = objT4;
                irn1.m(fgzVar, (iu30) obj3, qim0VarB, x340Var, 48);
                x340Var.r(false);
                i7 = i12;
                qim0Var3 = qim0Var4;
                i8 = 6;
                i6 = i13;
                i5 = i14;
                r6 = 0;
            } else {
                x340Var.i0(-1923075592);
                qim0 qim0VarF = u291.f(qim0Var4, 1.0f);
                u85 u85Var = (erl1) x340Var.k(szf0.b);
                if (u85Var == null) {
                    x340Var.i0(-241884180);
                    WeakHashMap weakHashMap = osl1.x;
                    u85Var = lhc.g(x340Var).g;
                    z2 = false;
                } else {
                    z2 = false;
                    x340Var.i0(-241885792);
                }
                x340Var.r(z2);
                hdh hdhVarN = lnn1.n(hqq0.C(u85Var, x340Var), uyn1.j(0.0f, 16.0f, 0.0f, 0.0f, 13));
                g36 d36Var = new d36(8.0f, true, new um5(false));
                boolean zI2 = x340Var.i(vme0Var) | (i13 == 256 || ((i12 & NativeMediaProcessor$Companion.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0 && x340Var.i(fad0Var2))) | (i14 == 32) | x340Var.i(ven0Var);
                Object objT5 = x340Var.T();
                if (zI2 || objT5 == m4cVar3) {
                    g36Var = d36Var;
                    c2 = ' ';
                    c3 = 256;
                    z3 = false;
                    ggh gghVar = new ggh(vme0Var, fad0Var2, iu30Var, ven0Var, (byte) 7);
                    x340Var.s0(gghVar);
                    objT5 = gghVar;
                } else {
                    g36Var = d36Var;
                    c2 = ' ';
                    c3 = 256;
                    z3 = false;
                }
                iu30 iu30Var2 = (iu30) objT5;
                i5 = i14;
                boolean z5 = z3;
                qim0Var3 = qim0Var4;
                i6 = i13;
                i7 = i12;
                i8 = 6;
                ujo1.d(qim0VarF, xtb0VarA, hdhVarN, false, g36Var, (nl3) null, (iq20) null, false, (hxq0) null, iu30Var2, x340Var, 0, 488);
                x340Var = x340Var;
                x340Var.r(z5);
                r6 = z5;
            }
            ?? r10 = 1;
            r10 = 1;
            x340Var.r(true);
            jj40 jj40Var = (jj40) ven0Var.getValue();
            if (jj40Var == null) {
                x340Var.i0(1405871219);
                x340Var.r((boolean) r6);
            } else {
                x340Var.i0(1405871220);
                String str = (String) o7h.s0(ihc1.Q0(jj40Var.a, new String[]{","}, (int) r6, i8));
                if (str == null) {
                    str = "";
                }
                String str2 = str;
                boolean z6 = ((((i5 == 32 ? 1 : r6) | ((i6 == 256 || ((i7 & NativeMediaProcessor$Companion.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0 && x340Var.i(fad0Var2))) ? 1 : r6)) == true ? 1 : 0) | (x340Var.i(jj40Var) ? 1 : 0) ? 1 : 0) | (x340Var.i(ven0Var) ? 1 : 0);
                Object objT6 = x340Var.T();
                if (z6 == 0) {
                    m4cVar = m4cVar3;
                    if (objT6 != m4cVar) {
                        i9 = i7;
                        m4cVar2 = m4cVar;
                    }
                    Function0 function0 = (Function0) objT6;
                    if (i6 != 256 && ((i9 & NativeMediaProcessor$Companion.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) == 0 || !x340Var.i(fad0Var2))) {
                        r10 = r6;
                    }
                    i10 = (x340Var.i(ven0Var) ? 1 : 0) | r10;
                    Object objT7 = x340Var.T();
                    obj2 = objT7;
                    if (i10 == 0 || objT7 == m4cVar2) {
                        gmj gmjVar = new gmj(fad0Var2, ven0Var, (byte) 5);
                        x340Var.s0(gmjVar);
                        obj2 = gmjVar;
                    }
                    crm0.a(str2, function0, (Function0) obj2, x340Var, (int) r6);
                    x340Var.r((boolean) r6);
                } else {
                    m4cVar = m4cVar3;
                }
                m4cVar2 = m4cVar;
                i9 = i7;
                f80 f80Var = new f80(fad0Var2, iu30Var, jj40Var, ven0Var, (byte) 22);
                fad0Var2 = fad0Var2;
                x340Var.s0(f80Var);
                objT6 = f80Var;
                Function0 function1 = (Function0) objT6;
                if (i6 != 256) {
                    r10 = r6;
                }
                i10 = (x340Var.i(ven0Var) ? 1 : 0) | r10;
                Object objT8 = x340Var.T();
                obj2 = objT8;
                if (i10 == 0) {
                    gmj gmjVar2 = new gmj(fad0Var2, ven0Var, (byte) 5);
                    x340Var.s0(gmjVar2);
                    obj2 = gmjVar2;
                } else {
                    gmj gmjVar3 = new gmj(fad0Var2, ven0Var, (byte) 5);
                    x340Var.s0(gmjVar3);
                    obj2 = gmjVar3;
                }
                crm0.a(str2, function1, (Function0) obj2, x340Var, (int) r6);
                x340Var.r((boolean) r6);
            }
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c2i(i, vme0Var, iu30Var, fad0Var2, qim0Var2, (byte) 4);
        }
    }

    public static final void b(rat ratVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(746915395);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(ratVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            String str = ratVar.a;
            uwr uwrVar = cbx.a;
            uwo1.e(str, u291.f(qim0Var3, 1.0f), cbx.d(x340Var).k, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
            uwo1.e(ratVar.b, u291.f(qim0Var3, 1.0f), cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bkh(ratVar, qim0Var2, i, (byte) 17);
        }
    }

    public static final void c(ym90 ym90Var, gw70 gw70Var, b0k b0kVar, int i) {
        ym90 ym90Var2;
        hrr0 hrr0Var = ym90Var.c;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-393390020);
        int i2 = (i & 6) == 0 ? i | (b0kVar2.i(ym90Var) ? 4 : 2) : i;
        if ((i & 48) == 0) {
            i2 |= b0kVar2.i(gw70Var) ? 32 : 16;
        }
        if (b0kVar2.Y(i2 & 1, (i2 & 19) != 18)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(uyn1.z(0.0f, 16.0f, 1, nim0Var), 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarF);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            afa0 afa0Var = (afa0) hrr0Var.getValue();
            fj70 fj70Var = afa0Var.c;
            List listSingletonList = Collections.singletonList(afa0Var.b);
            List list = q110.a;
            List listSingletonList2 = Collections.singletonList(new td10(fj70Var.c, fj70Var.a, fj70Var.b, (sd10) null));
            List<b0s0> list2 = listSingletonList;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            for (b0s0 b0s0Var : list2) {
                arrayList.add(new td10(b0s0Var.c, b0s0Var.a, b0s0Var.b, (sd10) null));
            }
            sto1.c(gw70Var, new se10(6, o7h.N0(arrayList, listSingletonList2), q110.a), (qim0) null, b0kVar2, (i2 >> 3) & 14);
            op71.g(b0kVar2, u291.h(nim0Var, 16.0f));
            qim0 qim0VarZ = uyn1.z(24.0f, 0.0f, 2, nim0Var);
            uwr uwrVar = cbx.a;
            uwo1.e(((afa0) hrr0Var.getValue()).a, qim0VarZ, lee1.a(cbx.d(b0kVar2).e, 0L, fc11.G(18), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213), 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2024);
            op71.g(b0kVar2, u291.h(nim0Var, 12.0f));
            uwo1.e(cwl1.o0(b0kVar2, 2131956130), uyn1.z(16.0f, 0.0f, 2, nim0Var), cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2016);
            b0kVar2 = b0kVar2;
            op71.g(b0kVar2, u291.h(nim0Var, 16.0f));
            ym90Var2 = ym90Var;
            gfx.g(13, apo.r(1592915039, new rr10(ym90Var2, (byte) 16), b0kVar2), b0kVar2, 54);
            b0kVar2.r(true);
        } else {
            ym90Var2 = ym90Var;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new say(ym90Var2, gw70Var, i, (byte) 14);
        }
    }

    public static final void d(int i, String str, String str2, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        qim0 qim0Var2;
        qrx qrxVar;
        boolean z2;
        long jA;
        boolean z3;
        long j;
        qrx qrxVar2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1654831440);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | 3072 | (x340Var.h(z) ? 16384 : 8192) | 196608;
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            if (str2 != null) {
                switch (str2.toLowerCase(Locale.ROOT)) {
                    case "create":
                        qrxVar2 = ujx.c;
                        break;
                    case "explore":
                        qrxVar2 = rmx.c;
                        break;
                    case "dj":
                        qrxVar2 = smx.c;
                        break;
                    case "ask":
                        qrxVar2 = tsx.c;
                        break;
                    case "play":
                        qrxVar2 = xpx.c;
                        break;
                    case "steer":
                        qrxVar2 = qrx.c;
                        break;
                    default:
                        qrxVar2 = null;
                        break;
                }
                qrxVar = qrxVar2;
            } else {
                qrxVar = null;
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarThen = bin.x(u291.f(qim0Var3, 1.0f), z, (String) null, new pm31(0), (idn0) null, function0, 10).then(z ? qim0Var3 : d9y0.k(qim0Var3, 0.5f));
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarThen, 16.0f, 6.0f);
            fra fraVar = een.N0;
            cvx cvxVar3 = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z4 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z4) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            if (qrxVar != null) {
                x340Var.i0(369394219);
                zov0 zov0Var = cbx.b(x340Var).g;
                cvx cvxVar4 = cbx.b(x340Var).b;
                qim0 qim0VarR = u291.r(qim0Var3, 40.0f);
                if (str2.equalsIgnoreCase("dj")) {
                    x340Var.i0(566111642);
                    x340Var.r(false);
                    jA = ((xex) ((gmt) zex.a.c).b).s;
                } else {
                    x340Var.i0(566113560);
                    jA = cbx.a(x340Var).a.b.a();
                    x340Var.r(false);
                }
                qim0 qim0VarN = anm1.N("IntentSuggestionRow.Icon", dug.f(qim0VarR, jA, er31.a));
                gfh0 gfh0VarC = t1c.c(een.h, false);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarN);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC, x340Var, lljVar);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar4);
                zov0 zov0Var2 = cbx.b(x340Var).g;
                qim0 qim0VarR2 = u291.r(qim0Var3, 16.0f);
                if (str2.equalsIgnoreCase("dj")) {
                    x340Var.i0(327027303);
                    z3 = false;
                    x340Var.r(false);
                    j = ((vex) zex.a.b).n;
                } else {
                    z3 = false;
                    x340Var.i0(327029113);
                    j = cbx.a(x340Var).b.a;
                    x340Var.r(false);
                }
                z2 = true;
                w0h1.a(qrxVar, isl.a, qim0VarR2, j, 0L, false, x340Var, 56, 48);
                x340Var.r(true);
                x340Var.r(z3);
            } else {
                z2 = true;
                x340Var.i0(370135150);
                x340Var.r(false);
            }
            uwo1.e(str, anm1.N("IntentSuggestionRow.Text", new wnb0(1.0f, z2)), cbx.d(x340Var).g, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, x340Var, i2 & 458766, 0, 1680);
            x340Var = x340Var;
            x340Var.r(z2);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new br30(str, str2, function0, qim0Var2, z, i);
        }
    }

    public static final void e(ine0 ine0Var, iu30 iu30Var, b0k b0kVar, int i) {
        ine0 ine0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1117401086);
        int i2 = (x340Var.g(ine0Var) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            ven0 ven0VarS = v8r.s(iu30Var, x340Var);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = new jne0(new f4g(ven0VarS, (byte) 15));
                x340Var.s0(objT);
            }
            ine0Var2 = ine0Var;
            otw.c((jne0) objT, ine0Var2, (qim0) null, (ipb1) null, x340Var, 8 | ((i2 << 3) & 112), 12);
        } else {
            ine0Var2 = ine0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l2i(ine0Var2, iu30Var, i, (byte) 24);
        }
    }

    public static final void f(eov0 eov0Var, iu30 iu30Var, b0k b0kVar, int i) {
        eov0 eov0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1558495451);
        int i2 = (x340Var.g(eov0Var) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            ven0 ven0VarS = v8r.s(iu30Var, x340Var);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = new fov0(new f4g(ven0VarS, (byte) 16));
                x340Var.s0(objT);
            }
            eov0Var2 = eov0Var;
            otw.c((fov0) objT, eov0Var2, (qim0) null, (ipb1) null, x340Var, 8 | ((i2 << 3) & 112), 12);
        } else {
            eov0Var2 = eov0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l2i(eov0Var2, iu30Var, i, (byte) 25);
        }
    }

    public static final void g(boolean z, iu30 iu30Var, b0k b0kVar, int i) {
        Function0 function0;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1272692142);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            zov0 zov0Var = cbx.b(x340Var).g;
            boolean z2 = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z2 || objT == m4cVar) {
                objT = c13.l(z, x340Var);
            }
            ven0 ven0Var = (ven0) objT;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            Function0 function1 = hmb0.t1;
            if (z3) {
                x340Var.l(function1);
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
            uwo1.e(cwl1.o0(x340Var, 2131960233), uyn1.z(16.0f, 0.0f, 2, uyn1.B(nim0Var, 0.0f, cvxVar.c, 0.0f, 0.0f, 13)), cbx.d(x340Var).e, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
            fra fraVar = een.N0;
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            pm31 pm31Var = new pm31(2);
            boolean zI = x340Var.i(ven0Var) | ((i2 & 112) == 32);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new rc21(iu30Var, ven0Var, (byte) 5);
                x340Var.s0(objT2);
            }
            qim0 qim0VarB = uyn1.B(bin.x(qim0VarF2, false, (String) null, pm31Var, (idn0) null, (Function0) objT2, 11), 0.0f, 16.0f, 0.0f, 0.0f, 13);
            gex0 gex0Var = h36.a;
            jw31 jw31VarA = ew31.a(gex0Var, fraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB);
            x340Var.m0();
            if (x340Var.S) {
                function0 = function1;
                x340Var.l(function0);
            } else {
                function0 = function1;
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            Function0 function2 = function0;
            uwo1.e(cwl1.o0(x340Var, 2131960235), uyn1.B(new wnb0(1.0f, true), 16.0f, 0.0f, 0.0f, 0.0f, 14), cbx.d(x340Var).g, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
            anm1.c(((Boolean) ven0Var.getValue()).booleanValue(), (iu30) null, uyn1.z(16.0f, 0.0f, 2, nim0Var), (max) null, (idn0) null, x340Var, 48, 24);
            x340Var.r(true);
            uwo1.e(cwl1.o0(x340Var, 2131960232), uyn1.y(nim0Var, 16.0f, 8.0f), cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
            qim0 qim0VarZ = uyn1.z(0.0f, 8.0f, 1, nim0Var);
            jw31 jw31VarA2 = ew31.a(gex0Var, fraVar, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarZ);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function2);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            nl70.c(i3o1.n(2131232024, x340Var, 0), (String) null, u291.r(uyn1.B(nim0Var, 16.0f, 0.0f, 0.0f, 0.0f, 14), 12.0f), cbx.a(x340Var).b.a, x340Var, 56, 0);
            uwo1.e(cwl1.o0(x340Var, 2131960234), uyn1.B(nim0Var, 4.0f, 0.0f, 16.0f, 0.0f, 10), cbx.d(x340Var).m, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
            x340Var = x340Var;
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zm9((byte) 5, i, iu30Var, z);
        }
    }

    public static final void h(nue1 nue1Var, ggv ggvVar, qim0 qim0Var, sm51 sm51Var, zge1 zge1Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(766048566);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(nue1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(ggvVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(sm51Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(zge1Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(iu30Var) ? 131072 : 65536;
        }
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            mod.b(t4k.n.a(flb0.a), apo.r(2045361654, new wyy0(qim0Var, sm51Var, nue1Var, zge1Var, ggvVar, iu30Var), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ryb1(nue1Var, ggvVar, qim0Var, sm51Var, zge1Var, iu30Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007e A[LOOP:0: B:33:0x007c->B:34:0x007e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x009f  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final ep21 i(ln21 ln21Var, long j) {
        int i;
        v360 v360Var;
        TreeSet treeSet;
        int size;
        int i2;
        LinkedHashMap linkedHashMap;
        int iS;
        pka1 pka1Var;
        String str;
        String strC;
        String str2 = ln21Var.b;
        switch (str2.hashCode()) {
            case -531492226:
                if (!str2.equals("OPTIONS")) {
                    eg.m("Unsupported HTTP method.");
                    return 0;
                }
                i = 8;
                String str3 = ln21Var.a.i;
                v360Var = ln21Var.c;
                treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                size = v360Var.size();
                for (i2 = 0; i2 < size; i2++) {
                    treeSet.add(m5n1.h(v360Var, i2));
                }
                Set setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
                iS = zno1.s(q7h.U(setUnmodifiableSet, 10));
                if (iS < 16) {
                    iS = 16;
                }
                linkedHashMap = new LinkedHashMap(iS);
                for (Object obj : setUnmodifiableSet) {
                    strC = v360Var.c((String) obj);
                    if (strC == null) {
                        strC = "";
                    }
                    linkedHashMap.put(obj, strC);
                }
                pka1Var = (pka1) ln21Var.c(pka1.class);
                if (pka1Var != null) {
                    str = pka1Var.a;
                } else {
                    str = null;
                }
                return new ep21(i, str3, linkedHashMap, j, str != null ? str : null, b7x.a);
            case 70454:
                if (!str2.equals("GET")) {
                    eg.m("Unsupported HTTP method.");
                    return 0;
                }
                i = 1;
                String str4 = ln21Var.a.i;
                v360Var = ln21Var.c;
                treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                size = v360Var.size();
                while (i2 < size) {
                    treeSet.add(m5n1.h(v360Var, i2));
                }
                Set setUnmodifiableSet2 = Collections.unmodifiableSet(treeSet);
                iS = zno1.s(q7h.U(setUnmodifiableSet2, 10));
                if (iS < 16) {
                    iS = 16;
                }
                linkedHashMap = new LinkedHashMap(iS);
                while (r5.hasNext()) {
                    strC = v360Var.c((String) obj);
                    if (strC == null) {
                        strC = "";
                    }
                    linkedHashMap.put(obj, strC);
                }
                pka1Var = (pka1) ln21Var.c(pka1.class);
                if (pka1Var != null) {
                    str = pka1Var.a;
                } else {
                    str = null;
                }
                if (str != null) {
                }
                return new ep21(i, str4, linkedHashMap, j, str != null ? str : null, b7x.a);
            case 79599:
                if (!str2.equals("PUT")) {
                    eg.m("Unsupported HTTP method.");
                    return 0;
                }
                i = 3;
                String str5 = ln21Var.a.i;
                v360Var = ln21Var.c;
                treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                size = v360Var.size();
                while (i2 < size) {
                    treeSet.add(m5n1.h(v360Var, i2));
                }
                Set setUnmodifiableSet3 = Collections.unmodifiableSet(treeSet);
                iS = zno1.s(q7h.U(setUnmodifiableSet3, 10));
                if (iS < 16) {
                    iS = 16;
                }
                linkedHashMap = new LinkedHashMap(iS);
                while (r5.hasNext()) {
                    strC = v360Var.c((String) obj);
                    if (strC == null) {
                        strC = "";
                    }
                    linkedHashMap.put(obj, strC);
                }
                pka1Var = (pka1) ln21Var.c(pka1.class);
                if (pka1Var != null) {
                    str = pka1Var.a;
                } else {
                    str = null;
                }
                if (str != null) {
                }
                return new ep21(i, str5, linkedHashMap, j, str != null ? str : null, b7x.a);
            case 2213344:
                if (!str2.equals("HEAD")) {
                    eg.m("Unsupported HTTP method.");
                    return 0;
                }
                i = 6;
                String str6 = ln21Var.a.i;
                v360Var = ln21Var.c;
                treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                size = v360Var.size();
                while (i2 < size) {
                    treeSet.add(m5n1.h(v360Var, i2));
                }
                Set setUnmodifiableSet4 = Collections.unmodifiableSet(treeSet);
                iS = zno1.s(q7h.U(setUnmodifiableSet4, 10));
                if (iS < 16) {
                    iS = 16;
                }
                linkedHashMap = new LinkedHashMap(iS);
                while (r5.hasNext()) {
                    strC = v360Var.c((String) obj);
                    if (strC == null) {
                        strC = "";
                    }
                    linkedHashMap.put(obj, strC);
                }
                pka1Var = (pka1) ln21Var.c(pka1.class);
                if (pka1Var != null) {
                    str = pka1Var.a;
                } else {
                    str = null;
                }
                if (str != null) {
                }
                return new ep21(i, str6, linkedHashMap, j, str != null ? str : null, b7x.a);
            case 2461856:
                if (!str2.equals("POST")) {
                    eg.m("Unsupported HTTP method.");
                    return 0;
                }
                i = 2;
                String str7 = ln21Var.a.i;
                v360Var = ln21Var.c;
                treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                size = v360Var.size();
                while (i2 < size) {
                    treeSet.add(m5n1.h(v360Var, i2));
                }
                Set setUnmodifiableSet5 = Collections.unmodifiableSet(treeSet);
                iS = zno1.s(q7h.U(setUnmodifiableSet5, 10));
                if (iS < 16) {
                    iS = 16;
                }
                linkedHashMap = new LinkedHashMap(iS);
                while (r5.hasNext()) {
                    strC = v360Var.c((String) obj);
                    if (strC == null) {
                        strC = "";
                    }
                    linkedHashMap.put(obj, strC);
                }
                pka1Var = (pka1) ln21Var.c(pka1.class);
                if (pka1Var != null) {
                    str = pka1Var.a;
                } else {
                    str = null;
                }
                if (str != null) {
                }
                return new ep21(i, str7, linkedHashMap, j, str != null ? str : null, b7x.a);
            case 75900968:
                if (!str2.equals("PATCH")) {
                    eg.m("Unsupported HTTP method.");
                    return 0;
                }
                i = 4;
                String str8 = ln21Var.a.i;
                v360Var = ln21Var.c;
                treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                size = v360Var.size();
                while (i2 < size) {
                    treeSet.add(m5n1.h(v360Var, i2));
                }
                Set setUnmodifiableSet6 = Collections.unmodifiableSet(treeSet);
                iS = zno1.s(q7h.U(setUnmodifiableSet6, 10));
                if (iS < 16) {
                    iS = 16;
                }
                linkedHashMap = new LinkedHashMap(iS);
                while (r5.hasNext()) {
                    strC = v360Var.c((String) obj);
                    if (strC == null) {
                        strC = "";
                    }
                    linkedHashMap.put(obj, strC);
                }
                pka1Var = (pka1) ln21Var.c(pka1.class);
                if (pka1Var != null) {
                    str = pka1Var.a;
                } else {
                    str = null;
                }
                if (str != null) {
                }
                return new ep21(i, str8, linkedHashMap, j, str != null ? str : null, b7x.a);
            case 80083237:
                if (!str2.equals("TRACE")) {
                    eg.m("Unsupported HTTP method.");
                    return 0;
                }
                i = 9;
                String str9 = ln21Var.a.i;
                v360Var = ln21Var.c;
                treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                size = v360Var.size();
                while (i2 < size) {
                    treeSet.add(m5n1.h(v360Var, i2));
                }
                Set setUnmodifiableSet7 = Collections.unmodifiableSet(treeSet);
                iS = zno1.s(q7h.U(setUnmodifiableSet7, 10));
                if (iS < 16) {
                    iS = 16;
                }
                linkedHashMap = new LinkedHashMap(iS);
                while (r5.hasNext()) {
                    strC = v360Var.c((String) obj);
                    if (strC == null) {
                        strC = "";
                    }
                    linkedHashMap.put(obj, strC);
                }
                pka1Var = (pka1) ln21Var.c(pka1.class);
                if (pka1Var != null) {
                    str = pka1Var.a;
                } else {
                    str = null;
                }
                if (str != null) {
                }
                return new ep21(i, str9, linkedHashMap, j, str != null ? str : null, b7x.a);
            case 1669334218:
                if (!str2.equals("CONNECT")) {
                    eg.m("Unsupported HTTP method.");
                    return 0;
                }
                i = 7;
                String str10 = ln21Var.a.i;
                v360Var = ln21Var.c;
                treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                size = v360Var.size();
                while (i2 < size) {
                    treeSet.add(m5n1.h(v360Var, i2));
                }
                Set setUnmodifiableSet8 = Collections.unmodifiableSet(treeSet);
                iS = zno1.s(q7h.U(setUnmodifiableSet8, 10));
                if (iS < 16) {
                    iS = 16;
                }
                linkedHashMap = new LinkedHashMap(iS);
                while (r5.hasNext()) {
                    strC = v360Var.c((String) obj);
                    if (strC == null) {
                        strC = "";
                    }
                    linkedHashMap.put(obj, strC);
                }
                pka1Var = (pka1) ln21Var.c(pka1.class);
                if (pka1Var != null) {
                    str = pka1Var.a;
                } else {
                    str = null;
                }
                if (str != null) {
                }
                return new ep21(i, str10, linkedHashMap, j, str != null ? str : null, b7x.a);
            case 2012838315:
                if (!str2.equals("DELETE")) {
                    eg.m("Unsupported HTTP method.");
                    return 0;
                }
                i = 5;
                String str11 = ln21Var.a.i;
                v360Var = ln21Var.c;
                treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                size = v360Var.size();
                while (i2 < size) {
                    treeSet.add(m5n1.h(v360Var, i2));
                }
                Set setUnmodifiableSet9 = Collections.unmodifiableSet(treeSet);
                iS = zno1.s(q7h.U(setUnmodifiableSet9, 10));
                if (iS < 16) {
                    iS = 16;
                }
                linkedHashMap = new LinkedHashMap(iS);
                while (r5.hasNext()) {
                    strC = v360Var.c((String) obj);
                    if (strC == null) {
                        strC = "";
                    }
                    linkedHashMap.put(obj, strC);
                }
                pka1Var = (pka1) ln21Var.c(pka1.class);
                if (pka1Var != null) {
                    str = pka1Var.a;
                } else {
                    str = null;
                }
                if (str != null) {
                }
                return new ep21(i, str11, linkedHashMap, j, str != null ? str : null, b7x.a);
            default:
                eg.m("Unsupported HTTP method.");
                return 0;
        }
    }

    public static final j4g1 j(gxc gxcVar, boolean z) {
        long j;
        mxc mxcVar = gxcVar.b;
        List list = mxcVar.a;
        j4g1 j4g1Var = null;
        if (list.isEmpty()) {
            return null;
        }
        List<sp21> list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (sp21 sp21Var : list2) {
            Long l = sp21Var.n;
            long jLongValue = 0;
            long jLongValue2 = l != null ? l.longValue() : 0L;
            Long l2 = sp21Var.o;
            long jLongValue3 = l2 != null ? l2.longValue() : 0L;
            Long l3 = sp21Var.p;
            if (l3 != null) {
                jLongValue = l3.longValue();
            }
            arrayList.add(new s7g1(jLongValue2, jLongValue3, jLongValue, sp21Var.c, sp21Var.e, sp21Var.d, sp21Var.f, sp21Var.g, sp21Var.h, sp21Var.i, sp21Var.j, sp21Var.k, sp21Var.s, sp21Var.q, sp21Var.r, sp21Var.t));
            j4g1Var = j4g1Var;
            list2 = list2;
        }
        List<sp21> list3 = list2;
        j4g1 j4g1Var2 = j4g1Var;
        Iterator it = list3.iterator();
        if (!it.hasNext()) {
            hhg1.k();
            return j4g1Var2;
        }
        long j2 = ((sp21) it.next()).a;
        loop1: while (true) {
            j = j2;
            do {
                if (!it.hasNext()) {
                    break loop1;
                }
                j2 = ((sp21) it.next()).a;
            } while (j <= j2);
        }
        ArrayList arrayList2 = new ArrayList();
        for (sp21 sp21Var2 : list3) {
            Long l4 = (Long) o7h.D0(f46.i0(new Long[]{sp21Var2.k, sp21Var2.l, sp21Var2.m}));
            if (l4 != null) {
                arrayList2.add(l4);
            }
        }
        Long l5 = (Long) o7h.D0(arrayList2);
        if (l5 == null) {
            n57.s("No end timestamp available when building connection metrics");
            return j4g1Var2;
        }
        Iterator it2 = list3.iterator();
        if (!it2.hasNext()) {
            hhg1.k();
            return j4g1Var2;
        }
        voe1 voe1Var = ((sp21) it2.next()).b;
        while (it2.hasNext()) {
            voe1 voe1Var2 = ((sp21) it2.next()).b;
            if (jap1.o(voe1Var, voe1Var2) > 0) {
                voe1Var = voe1Var2;
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            voe1 voe1Var3 = ((sp21) it3.next()).u;
            if (voe1Var3 != null) {
                arrayList3.add(voe1Var3);
            }
        }
        voe1 voe1VarD0 = o7h.D0(arrayList3);
        if (voe1VarD0 == null) {
            n57.s("No call end monotonic mark available when building connection metrics");
            return j4g1Var2;
        }
        long j3 = voe1VarD0.a;
        long j4 = voe1Var.a;
        int i = sjm0.b;
        double dH = jfv.h(kkn.A(j3, j4));
        if (dH < 0.0d && !z) {
            n57.s("Incorrect duration http call duration detected: " + dH);
        }
        return new j4g1(Math.max(0.0d, dH), Integer.valueOf(mxcVar.b), j, l5.longValue(), arrayList);
    }

    public static final Map k(c380 c380Var) {
        b320 b320VarN;
        ArrayList arrayList = new ArrayList();
        Iterator it = c380Var.iterator();
        while (it.hasNext()) {
            w220 w220Var = (w220) it.next();
            mmr0 mmr0Var = null;
            if (w220Var instanceof s220) {
                s220 s220Var = (s220) w220Var;
                if (s220Var.c != 5 && (b320VarN = N(s220Var.i, s220Var.f)) != null) {
                    mmr0Var = new mmr0(s220Var.a, b320VarN);
                }
            }
            if (mmr0Var != null) {
                arrayList.add(mmr0Var);
            }
        }
        return sqg0.T(arrayList);
    }

    public static final n4g1 l(gxc gxcVar, ln21 ln21Var, ry21 ry21Var) {
        long j;
        mxc mxcVar = gxcVar.b;
        mxcVar.f = ry21Var.f;
        List list = mxcVar.a;
        Iterator it = list.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            Long l = ((sp21) it.next()).n;
            jLongValue += l != null ? l.longValue() : 0L;
        }
        ep21 ep21VarI = i(ln21Var, jLongValue);
        int i = ry21Var.d;
        Iterator it2 = list.iterator();
        long jLongValue2 = 0;
        while (it2.hasNext()) {
            Long l2 = ((sp21) it2.next()).p;
            jLongValue2 += l2 != null ? l2.longValue() : 0L;
        }
        xz21 xz21Var = new xz21(i, jLongValue2);
        Iterator it3 = list.iterator();
        if (!it3.hasNext()) {
            hhg1.k();
            return null;
        }
        long j2 = ((sp21) it3.next()).a;
        loop2: while (true) {
            j = j2;
            do {
                if (!it3.hasNext()) {
                    break loop2;
                }
                j2 = ((sp21) it3.next()).a;
            } while (j <= j2);
        }
        j4g1 j4g1VarJ = j(gxcVar, false);
        j4g1 j4g1Var = j4g1VarJ == null ? new j4g1(0.0d, 0, j, j, z6x.a) : j4g1VarJ;
        return new n4g1(gxcVar.a, j4g1Var.d, ep21VarI, xz21Var, j4g1Var);
    }

    public static lik1 n() {
        return jf2.b;
    }

    public static final Next o(y600 y600Var, String str, String str2) {
        if (u890.j(str, str2)) {
            return null;
        }
        String simpleName = y600Var.getClass().getSimpleName();
        String strA = ucs0.a(str);
        String strA2 = ucs0.a(str2);
        StringBuilder sbN = gvg.n("Received ", simpleName, " for session id ", strA, " that does not match the current session id ");
        sbN.append(strA2);
        Logger.d(sbN.toString(), new Object[0]);
        return Next.j();
    }

    public static final Next p(ccs0 ccs0Var, String str, Throwable th, int i, String str2) {
        ee30 ee30Var = ccs0Var.c;
        ccs0 ccs0VarA = ccs0.a(ccs0Var, (tcs0) null, (String) null, ee30Var != null ? R(ee30.a(ee30Var, false, (c380) null, 23)) : null, (tqw0) null, str2 == null ? ccs0Var.a.c.a : str2, (Integer) null, false, false, false, false, (i3g1) null, (c380) null, (v7u) null, (String) null, (t2c0) null, (String) null, (String) null, (hes0) null, (imr0) null, 327651);
        return Next.i(ccs0VarA, dm61.B0(new niw[]{c921.t(ccs0VarA, i), th != null ? new fgw(str, zjy.g(i), th) : null}));
    }

    public static /* synthetic */ Next q(ccs0 ccs0Var, String str, Throwable th, int i, String str2, int i2) {
        if ((i2 & 4) != 0) {
            th = null;
        }
        if ((i2 & 16) != 0) {
            str2 = null;
        }
        return p(ccs0Var, str, th, i, str2);
    }

    public static final Next r(ecs0 ecs0Var, y600 y600Var) {
        Logger.d("Received " + y600Var + " with incompatible model " + ecs0Var, new Object[0]);
        return Next.j();
    }

    public static boolean s(Intent intent) {
        String path;
        Uri data = intent.getData();
        if (data == null || (path = data.getPath()) == null) {
            return false;
        }
        return nhc1.R(ihc1.g1(path, new char[]{'/'}), "/account/parental-consent", false);
    }

    public static ksk0 t() {
        return new ksk0((byte) 19);
    }

    public static final Next u(xsk1 xsk1Var, yrk1 yrk1Var) {
        double d;
        double d2;
        Double dValueOf;
        b32 b32Var = yrk1Var.a;
        l0l l0lVar = xsk1Var.c;
        Double d3 = xsk1Var.a;
        if (d3 != null && l0lVar != null && bno1.v(l0lVar)) {
            if (xsk1Var.i) {
                dValueOf = Double.valueOf(O(d3.doubleValue(), l0lVar.A(), b32Var.a));
            } else {
                double dDoubleValue = d3.doubleValue();
                int iA = l0lVar.A();
                if (iA <= 0) {
                    Logger.k(f4i1.c(iA, "Volume steps is lower or 0: "), new Object[0]);
                    d = 0.0d;
                } else {
                    d = 1.0d / ((double) iA);
                }
                int iC = l1d.C(b32Var.a);
                if (iC == 0) {
                    d2 = dDoubleValue - d;
                } else {
                    if (iC != 1) {
                        eg.o();
                        return null;
                    }
                    d2 = dDoubleValue + d;
                }
                Double dValueOf2 = Double.valueOf(d2);
                String str = b32Var.b;
                String str2 = b32Var.c;
                double d4 = 1.0d + d;
                if (0.0d - d > d2 || d2 > d4) {
                    StringBuilder sbN = gvg.n("Invalid volume[featureName: ", str, ", interactionId: ", str2, ", volume: ");
                    sbN.append(dValueOf2);
                    sbN.append(", volumeStep: ");
                    sbN.append(d);
                    sbN.append("]");
                    n57.e(sbN.toString());
                    dValueOf2 = null;
                }
                dValueOf = dValueOf2 != null ? Double.valueOf(yoi1.n(dValueOf2.doubleValue(), 0.0d, 1.0d)) : null;
            }
            if (dValueOf != null) {
                return Next.i(xsk1.a(xsk1Var, dValueOf, (Double) null, (l0l) null, 0, (h06) null, true, 0, false, (Map) null, (Set) null, 2014), Effects.a(new rrk1[]{hrk1.a, new crk1(b32Var, dValueOf.doubleValue(), d3), new krk1(new prk1(dValueOf.doubleValue(), false), b32Var.b)}));
            }
        }
        return Next.a(Effects.a(new frk1[]{new frk1(b32Var, Double.valueOf(d3 != null ? d3.doubleValue() : -1.0d))}));
    }

    public static final Next v(dcs0 dcs0Var, xxz xxzVar) {
        Next nextO = o(xxzVar, xxzVar.a, dcs0Var.a);
        if (nextO != null) {
            return nextO;
        }
        String str = xxzVar.a;
        bcs0 bcs0Var = new bcs0(str, dcs0Var.b, dcs0Var.c, dcs0Var.d, dcs0Var.e, xxzVar.c);
        Throwable th = xxzVar.b;
        return Next.i(bcs0Var, dm61.A0(th != null ? new fgw(str, "load-failed", th) : null));
    }

    public static final Next w(dcs0 dcs0Var, ayz ayzVar) {
        String str;
        tcs0 tcs0Var = ayzVar.a;
        Next nextO = o(ayzVar, tcs0Var.a, dcs0Var.a);
        if (nextO != null) {
            return nextO;
        }
        String str2 = ((dyf) dyf.b.i1()).a;
        i3g1 i3g1Var = new i3g1(str2, (String) null, (String) null);
        c380 c380Var = dcs0Var.c;
        v7u v7uVar = dcs0Var.e;
        iz21 iz21Var = ayzVar.b;
        if (iz21Var == null || (str = iz21Var.a) == null) {
            str = dcs0Var.f;
        }
        ccs0 ccs0Var = new ccs0(tcs0Var, (String) null, (ee30) null, (tqw0) null, str, (Integer) null, false, false, false, false, i3g1Var, c380Var, v7uVar, dcs0Var.d, new t2c0(false, dqs0.e), (String) null, (String) null, (hes0) null, (imr0) null);
        ArrayList arrayListV = c921.v(ccs0Var);
        xbs0 xbs0Var = (xbs0) o7h.s0(arrayListV);
        String str3 = xbs0Var != null ? xbs0Var.b : null;
        String str4 = tcs0Var.e;
        c380 c380Var2 = tcs0Var.f;
        String str5 = tcs0Var.b;
        String str6 = tcs0Var.d;
        boolean z = !arrayListV.isEmpty();
        int size = arrayListV.size();
        ArrayList arrayList = new ArrayList(q7h.U(c380Var2, 10));
        Iterator it = c380Var2.iterator();
        while (it.hasNext()) {
            arrayList.add(new zbs0(((xbs0) it.next()).a));
        }
        String str7 = tcs0Var.a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : c380Var2) {
            if (((xbs0) obj).e != null) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new zbs0(((xbs0) it2.next()).a));
        }
        niw ggwVar = new ggw(str2, str4, str5, str6, z, str3, size, arrayList, str7, arrayList3);
        niw lhwVar = new lhw(new c8e0(str2));
        String str8 = tcs0Var.e;
        tcs0 tcs0Var2 = ccs0Var.a;
        return Next.i(ccs0Var, f46.S0(new niw[]{ggwVar, lhwVar, new whw(str8, tcs0Var2.b, tcs0Var.a), new caw(tcs0Var2.a)}));
    }

    public static final Next x(ecs0 ecs0Var) {
        Set setSingleton = Collections.singleton(fhw.a);
        boolean z = ecs0Var instanceof ccs0;
        if (z) {
            ccs0 ccs0Var = (ccs0) ecs0Var;
            if (ccs0Var.d == null) {
                return Next.i(ccs0.a(ccs0Var, (tcs0) null, (String) null, (ee30) null, (tqw0) null, (String) null, (Integer) null, false, true, true, false, (i3g1) null, (c380) null, (v7u) null, (String) null, (t2c0) null, (String) null, (String) null, (hes0) null, (imr0) null, 523903), setSingleton);
            }
        }
        return z ? Next.i(ccs0.a((ccs0) ecs0Var, (tcs0) null, (String) null, (ee30) null, (tqw0) null, (String) null, (Integer) null, false, false, true, false, (i3g1) null, (c380) null, (v7u) null, (String) null, (t2c0) null, (String) null, (String) null, (hes0) null, (imr0) null, 524031), setSingleton) : Next.a(setSingleton);
    }

    public static final Next y(ccs0 ccs0Var) {
        return Next.h(ccs0.a(ccs0Var, (tcs0) null, (String) null, (ee30) null, (tqw0) null, (String) null, (Integer) null, false, false, false, false, (i3g1) null, (c380) null, (v7u) null, (String) null, (t2c0) null, (String) null, (String) null, (hes0) null, (imr0) null, 262143));
    }

    public static final Next z(bcs0 bcs0Var) {
        String str = bcs0Var.a;
        String str2 = bcs0Var.b;
        return Next.i(new dcs0(str, str2, bcs0Var.c, bcs0Var.d, bcs0Var.e, (String) null), Collections.singleton(new lbw(str, str2)));
    }

    public abstract String m();
}
