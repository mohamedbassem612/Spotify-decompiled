package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.ObservableEmitter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class j0z0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public j0z0(fjk0 fjk0Var, c9n c9nVar) {
        this.a = (byte) 5;
        this.b = fjk0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10, types: [int] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v2 */
    public Object b(boolean z, lnm lnmVar) {
        zxz0 zxz0Var;
        Throwable th;
        ?? r11;
        ?? r12;
        m231 m231Var;
        ?? r13;
        fjk0 fjk0Var = (fjk0) this.b;
        String str = (String) fjk0Var.e;
        if (lnmVar instanceof zxz0) {
            zxz0Var = (zxz0) lnmVar;
            int i = zxz0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                zxz0Var.d = i - Integer.MIN_VALUE;
            } else {
                zxz0Var = new zxz0(this, lnmVar);
            }
        } else {
            zxz0Var = new zxz0(this, lnmVar);
        }
        zxz0 zxz0Var2 = zxz0Var;
        Object objP = zxz0Var2.b;
        int i2 = zxz0Var2.d;
        m231 m231Var2 = rih1.a;
        if (i2 == 0) {
            hm5.M(objP);
            ?? r5 = (((vp4) fjk0Var.b).b() && z) ? 1 : 0;
            try {
                xyc0 xyc0Var = (iyc0) fjk0Var.d;
                zxz0Var2.a = r5;
                zxz0Var2.d = 1;
                objP = xyc0Var.p(str, "reaction", (boolean) r5, false, zxz0Var2);
                d9n d9nVar = d9n.a;
                if (objP == d9nVar) {
                    return d9nVar;
                }
                r12 = r5;
            } catch (Throwable th2) {
                th = th2;
                r11 = r5;
                m231Var = new m231(th);
                r13 = r11;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r12 = zxz0Var2.a;
            try {
                hm5.M(objP);
                r12 = r12;
            } catch (Throwable th3) {
                th = th3;
                r11 = r12;
                m231Var = new m231(th);
                r13 = r11;
            }
        }
        ((py21) objP).d();
        m231Var = m231Var2;
        r13 = r12;
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            Logger.e(thA, "Failed to set lens reaction to " + (r13 != 0) + " on list " + str, new Object[0]);
        }
        return m231Var2;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        w7h1 w7h1Var;
        String str;
        Map mapJ;
        String str2;
        Set set;
        Object objS;
        Long lA;
        Object objI;
        Object objB;
        byte b = this.a;
        int i = 10;
        b7x b7xVar = b7x.a;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                jn41 jn41Var = (ln41) obj;
                n8d1 n8d1Var = ((k0z0) obj2).c;
                if (jn41Var instanceof jn41) {
                    m8d1.a(n8d1Var.d, new e0z0(jn41Var.a));
                } else {
                    if (!(jn41Var instanceof kn41)) {
                        eg.o();
                        return null;
                    }
                    m8d1.a(n8d1Var.d, g0z0.a);
                }
                return rih1Var;
            case 1:
                i4z0 i4z0Var = (i4z0) obj2;
                hyy0 hyy0Var = i4z0Var.g;
                y6h1 y6h1Var = ((h7l0) hyy0Var.c).b;
                int iOrdinal = ((gv50) obj).ordinal();
                if (iOrdinal == 0) {
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("continue_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:internal:personal-podcast:onboarding")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC2 = y6h1Var.c();
                    x6h1VarC2.i.add(new a7h1("skip_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
                }
                ((i8h1) ((ykq) hyy0Var.b).get()).m(w7h1Var, (xj61) null);
                tso tsoVar = i4z0Var.e;
                o4z0 o4z0Var = (o4z0) i4z0Var.t.getValue();
                String str3 = i4z0Var.d.c;
                List list = o4z0Var.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (obj3 instanceof f4z0) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : arrayList) {
                    if (((f4z0) obj4).d) {
                        arrayList2.add(obj4);
                    }
                }
                ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((f4z0) it.next()).a);
                }
                List list2 = o4z0Var.b;
                ArrayList<g4z0> arrayList4 = new ArrayList();
                for (Object obj5 : list2) {
                    if (obj5 instanceof g4z0) {
                        arrayList4.add(obj5);
                    }
                }
                ArrayList arrayList5 = new ArrayList(q7h.U(arrayList4, 10));
                for (g4z0 g4z0Var : arrayList4) {
                    arrayList5.add(new r6i1(g4z0Var.a, g4z0Var.b));
                }
                ((iu30) tsoVar.d.getValue()).invoke(new n4z0(str3, arrayList3, arrayList5));
                return rih1Var;
            case 2:
                ((ibz0) obj2).c();
                return rih1Var;
            case 3:
                bn70 bn70Var = (bn70) obj;
                ojz0 ojz0Var = (ojz0) obj2;
                Set set2 = ojz0Var.X;
                llm llmVar = ojz0Var.e;
                n6r0 n6r0Var = bn70Var != null ? bn70Var.a : null;
                if (n6r0Var != null || !o7h.i0(set2, ojz0Var.h)) {
                    n6r0 n6r0Var2 = ojz0Var.h;
                    Set set3 = set2;
                    if (o7h.i0(set3, n6r0Var2) && !o7h.i0(set3, n6r0Var)) {
                        if (u890.j(ojz0Var.g, Boolean.TRUE)) {
                            fn31.T(llmVar, (o8n) null, 0, new njz0(ojz0Var, (lnm) null, (byte) 3), 3);
                        }
                        ojz0Var.g = null;
                    } else if (!o7h.i0(set3, n6r0Var2) && o7h.i0(set3, n6r0Var)) {
                        if (ojz0Var.g == null) {
                            ojz0Var.g = ojz0Var.f;
                        }
                        if (u890.j(ojz0Var.f, Boolean.TRUE)) {
                            c921.y(llmVar, (o8n) null, 0, new njz0(ojz0Var, (lnm) null, (byte) 2), 3);
                        }
                    } else if (o7h.i0(set3, n6r0Var) && u890.j(ojz0Var.f, Boolean.TRUE)) {
                        c921.y(llmVar, (o8n) null, 0, new njz0(ojz0Var, (lnm) null, (byte) 2), 3);
                    }
                    ojz0Var.h = n6r0Var;
                }
                return rih1Var;
            case 4:
                twz0 twz0Var = (uwz0) obj;
                kdy0 kdy0Var = (kdy0) obj2;
                ihp0 ihp0Var = (ihp0) kdy0Var.e;
                vwz0 vwz0Var = (vwz0) kdy0Var.d;
                if (twz0Var instanceof twz0) {
                    w7x w7xVar = twz0Var.a;
                    if (w7xVar == null) {
                        w7xVar = w7x.a;
                    }
                    mapJ = sqg0.J(new mmr0[]{new mmr0("connection_type", ((r3b1) kdy0Var.c).a().d), new mmr0("expensive", String.valueOf(w7xVar.contains(a7o0.c))), new mmr0("constrained", String.valueOf(w7xVar.contains(a7o0.d))), new mmr0("os_internet_validation", ((frq0) vwz0Var.invoke()).a)});
                    str2 = "REACHABLE";
                } else {
                    if (!(twz0Var instanceof swz0)) {
                        eg.o();
                        return null;
                    }
                    fho0 fho0Var = ((swz0) twz0Var).a;
                    if (fho0Var instanceof dho0) {
                        str = "forced_offline";
                    } else {
                        if (!(fho0Var instanceof eho0)) {
                            eg.o();
                            return null;
                        }
                        str = "no_internet";
                    }
                    mapJ = sqg0.J(new mmr0[]{new mmr0("reason", str), new mmr0("os_internet_validation", ((frq0) vwz0Var.invoke()).a)});
                    str2 = "NOT_REACHABLE";
                }
                ihp0Var.n(new yob1("network.reachability", str2, mapJ));
                return rih1Var;
            case 5:
                return b(((Boolean) obj).booleanValue(), lnmVar);
            case 6:
                mmr0 mmr0Var = (mmr0) obj;
                if (((Number) mmr0Var.a).intValue() > ((Number) mmr0Var.b).intValue() - 15) {
                    ((fv01) obj2).d.g(new ks01());
                }
                return rih1Var;
            case 7:
                dxy dxyVar = ((hi11) obj2).X;
                if (dxyVar == null) {
                    u890.C("handler");
                    throw null;
                }
                Object objZ = ((dxy) dxyVar.f).z(lnmVar);
                if (objZ != d9nVar) {
                    objZ = rih1Var;
                }
                return objZ == d9nVar ? objZ : rih1Var;
            case 8:
                o5e0 o5e0Var = (o5e0) obj;
                vw11 vw11Var = (vw11) obj2;
                if (o5e0Var.h()) {
                    vw11Var.i();
                } else if (!o5e0Var.b()) {
                    vw11Var.g();
                }
                return rih1Var;
            case 9:
                twz0 twz0Var2 = (uwz0) obj;
                if (!(twz0Var2 instanceof twz0) || (set = twz0Var2.a) == null || set.contains(a7o0.b)) {
                    hma1 hma1VarEdit = ((g5s) ((oj70) obj2).e).a.edit();
                    hma1VarEdit.a(h5s.a, false);
                    hma1VarEdit.g();
                }
                return rih1Var;
            case 10:
                ((ObservableEmitter) obj2).onNext(obj);
                return rih1Var;
            case 11:
                qt80 qt80Var = (qt80) obj;
                hg41 hg41Var = (hg41) obj2;
                if (qt80Var instanceof r9w0) {
                    objS = smo1.s(new gg41(hg41Var, (lnm) null, (byte) 1), lnmVar);
                    if (objS != d9nVar) {
                        objS = rih1Var;
                    }
                    if (objS != d9nVar) {
                        return rih1Var;
                    }
                } else if (qt80Var instanceof s9w0) {
                    objS = smo1.s(new gg41(hg41Var, (lnm) null, (byte) 0), lnmVar);
                    if (objS != d9nVar) {
                        objS = rih1Var;
                    }
                    if (objS != d9nVar) {
                        return rih1Var;
                    }
                } else {
                    if (!(qt80Var instanceof q9w0)) {
                        return rih1Var;
                    }
                    objS = smo1.s(new gg41(hg41Var, (lnm) null, (byte) 0), lnmVar);
                    if (objS != d9nVar) {
                        objS = rih1Var;
                    }
                    if (objS != d9nVar) {
                        return rih1Var;
                    }
                }
                return objS;
            case 12:
                cce1 cce1Var = (cce1) obj;
                dj41 dj41Var = (dj41) obj2;
                bpb1 bpb1Var = dj41Var.j;
                if (cce1Var instanceof ybe1) {
                    ti41 ti41Var = new ti41(((ybe1) cce1Var).a);
                    bpb1Var.getClass();
                    bpb1Var.m((Object) null, ti41Var);
                } else if (cce1Var instanceof zbe1) {
                    ui41 ui41Var = new ui41(((zbe1) cce1Var).a);
                    bpb1Var.getClass();
                    bpb1Var.m((Object) null, ui41Var);
                } else if (u890.j(cce1Var, ace1.a)) {
                    bpb1Var.getClass();
                    bpb1Var.m((Object) null, wi41.a);
                } else if (u890.j(cce1Var, ace1.b)) {
                    bpb1Var.getClass();
                    bpb1Var.m((Object) null, xi41.a);
                } else {
                    if (!(cce1Var instanceof bce1)) {
                        eg.o();
                        return null;
                    }
                    iae1 iae1Var = dj41Var.g;
                    bce1 bce1Var = (bce1) cce1Var;
                    ArrayList arrayList6 = bce1Var.a;
                    int i2 = bce1Var.b;
                    int i3 = bce1Var.c;
                    int i4 = bce1Var.d;
                    iae1Var.getClass();
                    List<dce1> listA1 = o7h.a1(arrayList6, new xvd(iae1Var, (byte) 28));
                    ArrayList arrayList7 = new ArrayList();
                    for (dce1 dce1Var : listA1) {
                        ArrayList<fce1> arrayList8 = dce1Var.a;
                        ArrayList arrayList9 = new ArrayList(q7h.U(arrayList8, i));
                        for (fce1 fce1Var : arrayList8) {
                            arrayList9.add(new gae1(fce1Var.a, fce1Var.c, dce1Var.c));
                        }
                        r7h.W(arrayList9, arrayList7);
                        i = 10;
                    }
                    boolean z = i4 == 90 || i4 == 270;
                    int i5 = z ? i3 : i2;
                    if (!z) {
                        i2 = i3;
                    }
                    Object objEmit = iae1Var.c.emit(new lae1(arrayList7, i5, i2), lnmVar);
                    Object obj6 = objEmit == d9nVar ? objEmit : rih1Var;
                    if (obj6 == d9nVar) {
                        return obj6;
                    }
                }
                return rih1Var;
            case 13:
                gr41 gr41Var = (gr41) obj;
                fr41 fr41Var = (fr41) obj2;
                gr41Var.getClass();
                int i6 = gr41Var.a;
                fr41Var.f = i6;
                Integer num = fr41Var.e;
                if (num != null) {
                    fr41Var.d = Math.abs(i6 - num.intValue()) + fr41Var.d;
                }
                fr41Var.e = Integer.valueOf(i6);
                bpb1 bpb1Var2 = fr41Var.b;
                if (fr41Var.d < fr41Var.a) {
                    Boolean bool = Boolean.FALSE;
                    bpb1Var2.getClass();
                    bpb1Var2.m((Object) null, bool);
                } else if (fr41Var.f <= 8) {
                    fr41Var.d = 0;
                    fr41Var.e = null;
                    Boolean bool2 = Boolean.FALSE;
                    bpb1Var2.getClass();
                    bpb1Var2.m((Object) null, bool2);
                } else {
                    Boolean bool3 = Boolean.TRUE;
                    bpb1Var2.getClass();
                    bpb1Var2.m((Object) null, bool3);
                }
                return rih1Var;
            case 14:
                zfr zfrVar = (zfr) ((e821) obj2).b;
                i8h1 i8h1Var = (i8h1) zfrVar.b;
                r6h1 r6h1Var = ((o2p0) zfrVar.c).a;
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-now-playing-view-nova-scroll";
                x6h1VarI.f = "2.1.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.b = null;
                x6h1VarI.e = null;
                x6h1VarI.d = (String) obj;
                y6h1 y6h1VarA = x6h1VarI.a();
                Collections.singletonList("nowplaying");
                i8h1Var.m(new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA, r6h1Var, System.currentTimeMillis()), (xj61) null);
                return rih1Var;
            case 15:
                ((j6p0) obj2).o();
                return rih1Var;
            case 16:
                p7s.g((p7s) ((lu51) obj2).d);
                return rih1Var;
            case 17:
                l0l l0lVar = (l0l) obj;
                p7s p7sVar = ((zu51) obj2).a;
                if (l0lVar == null || l0lVar.l()) {
                    p7sVar.c();
                    owh0.b();
                    if (!((Boolean) e130.v(owh0.c().h(), p7sVar.f).q.getValue()).booleanValue()) {
                        p7s.g(p7sVar);
                    }
                }
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                mmr0 mmr0Var2 = (mmr0) obj;
                ((LinkedHashMap) obj2).put((String) mmr0Var2.a, (zuc0) mmr0Var2.b);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ((nd61) obj2).c.set((sj20) obj);
                return rih1Var;
            case 20:
                oa71 oa71Var = (oa71) obj2;
                k5u0 k5u0VarA = oa71Var.a();
                if (k5u0VarA != null && (lA = k5u0VarA.a(oa71Var.N0.b())) != null) {
                    oa71Var.U(lA.longValue());
                }
                return rih1Var;
            case 21:
                dlw0 dlw0Var = (elw0) obj;
                if (!(dlw0Var instanceof dlw0)) {
                    return rih1Var;
                }
                dlw0 dlw0Var2 = dlw0Var;
                o571 o571Var = dlw0Var2.a;
                q6q0 q6q0Var = dlw0Var2.b;
                return (kyo1.r(o571Var) && q6q0Var != null && (objI = ((aj71) obj2).i(q6q0Var, o571Var, lnmVar)) == d9nVar) ? objI : rih1Var;
            case 22:
                Object objA = ((flw0) obj2).a(new rhw0(((Number) obj).floatValue()), lnmVar);
                return objA == d9nVar ? objA : rih1Var;
            case 23:
                ((drr0) obj2).t(((rhw0) obj).a);
                return rih1Var;
            case 24:
                ((Boolean) obj).getClass();
                mta mtaVar = fh81.B1;
                ((fh81) obj2).y();
                return rih1Var;
            case 25:
                Boolean bool4 = (Boolean) obj;
                bool4.getClass();
                wh81 wh81Var = (wh81) obj2;
                mma0[] mma0VarArr = wh81.R0;
                wh81Var.e.c(wh81.R0[0], wh81Var, bool4);
                return rih1Var;
            case 26:
                mmr0 mmr0Var3 = (mmr0) obj;
                zkv zkvVar = (zkv) ((n381) obj2).b;
                e090 e090Var = (e090) mmr0Var3.a;
                boolean z2 = ((e090) mmr0Var3.b) instanceof zz80;
                if (z2) {
                    objB = zkvVar.b(alv.c, lnmVar);
                    if (objB != d9nVar) {
                        return rih1Var;
                    }
                } else if (!(e090Var instanceof zz80) || z2 || (objB = zkvVar.b(alv.b, lnmVar)) != d9nVar) {
                    return rih1Var;
                }
                return objB;
            case 27:
                vi11 vi11Var = (vi11) obj2;
                bpb1 bpb1Var3 = (wen0) vi11Var.c;
                bpb1Var3.getClass();
                bpb1Var3.m((Object) null, a090.a);
                Object objI2 = fc11.i(((h1y) vi11Var.e).a(new f1y(new rzx("your-dj"), (ou80) null, (y6r0) null)), lnmVar);
                return objI2 == d9nVar ? objI2 : rih1Var;
            case 28:
                ((j0d1) obj2).d((CancellationException) null);
                return rih1Var;
            default:
                c8a1 c8a1Var = (c8a1) obj2;
                Throwable thA = e331.a(((e331) obj).a);
                if (thA == null) {
                    c8a1Var.i();
                } else {
                    c8a1Var.h(thA);
                }
                return rih1Var;
        }
    }

    public /* synthetic */ j0z0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
