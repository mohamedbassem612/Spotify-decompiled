package p;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jl1 implements shm {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public jl1(zeu zeuVar, mnk0 mnk0Var, me30 me30Var) {
        this.a = (byte) 2;
        this.b = zeuVar;
        this.d = mnk0Var;
        this.c = me30Var;
        this.e = w3p1.o(new l4r(pwc0.e, 1, rnv.S0, new j4r(rnv.Q0), rnv.T0), rnv.R0);
    }

    @Override // p.shm
    public final mr20 a(hti0 hti0Var, rzq rzqVar) {
        qxc0 qxc0Var;
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                return !f(hti0Var) ? new huz((Object) null, (byte) 10) : ((a42) obj2).e(hti0Var, rzqVar);
            case 1:
                return new huz(j(hti0Var), (byte) 10);
            case 2:
                String str = hti0Var.a;
                qxc0 qxc0Var2 = hti0Var.d;
                lnm lnmVar = null;
                if (qxc0Var2 == null) {
                    return new huz((Object) null, (byte) 10);
                }
                return !e(qxc0Var2) ? new huz((Object) null, (byte) 10) : h5p1.s(new vvu(vxo1.l(rzqVar, str), (byte) 4), ((mnk0) obj).a, new vvu(d3p1.F(rzqVar, (o3r) this.e, str), (byte) 5), new pov((Object) this, (Object) hti0Var, (Object) qxc0Var2, lnmVar, (byte) 0));
            case 3:
                String str2 = hti0Var.a;
                ((npm1) obj3).getClass();
                return (str2.equals("spotify:playlist:37i9dQZF1EYkqdzj48dyYq") && ((b1y) obj).a.j()) ? new ipr(((ov20) obj2).a("dj-voice-data-collection-eligibility", false), this, hti0Var, (byte) 9) : new huz((Object) null, (byte) 10);
            case 4:
                if (!((dp70) obj).a || (qxc0Var = hti0Var.d) == null || ((me30) obj3).a(qxc0Var.e) == le30.b) {
                    return new huz((Object) null, (byte) 10);
                }
                Flowable flowable = ((sun) obj2).b(hti0Var.a).toFlowable();
                vbm[] vbmVarArr = q601.a;
                return new ipr(new kge(flowable), this, hti0Var, (byte) 23);
            case 5:
                qxc0 qxc0VarD = d(hti0Var);
                return qxc0VarD == null ? new huz((Object) null, (byte) 10) : new sr0(((hp91) obj3).k(), this, hti0Var, qxc0VarD, (byte) 26);
            default:
                qxc0 qxc0Var3 = hti0Var.d;
                if (qxc0Var3 == null) {
                    return new huz((Object) null, (byte) 10);
                }
                if (g(qxc0Var3)) {
                    return h5p1.s(new cly0(d3p1.F(rzqVar, w3p1.n(new l4r(hvm.b, 1, ppg1.R0, new j4r(ppg1.V0), ppg1.S0), new l4r(b2v.a, 1, ppg1.T0, new j4r(ppg1.W0), ppg1.U0), lbg1.t), hti0Var.a), (byte) 17), new lt20(((a4q0) obj3).e(gtg1.b), new q8t0(3, (lnm) null, (byte) 26), (byte) 0), ((ov20) obj2).a, new l14(this, hti0Var, qxc0Var3, (lnm) null, (byte) 10));
                }
                return new huz((Object) null, (byte) 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0041  */
    /* JADX WARN: Code duplicated, block: B:38:0x009c  */
    /* JADX WARN: Code duplicated, block: B:64:0x010b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0160  */
    @Override // p.shm
    public final Object b(hti0 hti0Var, d0r d0rVar, lnm lnmVar) {
        r5y r5yVar;
        hti0 hti0Var2;
        yo70 yo70Var;
        qxc0 qxc0Var;
        jl1 jl1Var;
        String str;
        jqa1 jqa1Var;
        String str2;
        qxc0 qxc0Var2;
        jl1 jl1Var2;
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.b;
        Object obj3 = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (f(hti0Var)) {
                    return smo1.s(new ml1((a42) obj2, d0rVar, hti0Var, (lnm) null), (n0a0) lnmVar);
                }
                return null;
            case 1:
                return j(hti0Var);
            case 2:
                qxc0 qxc0Var3 = hti0Var.d;
                if (qxc0Var3 != null && e(qxc0Var3)) {
                    return smo1.s(new oov(this, hti0Var, qxc0Var3, d0rVar, (lnm) null), lnmVar);
                }
                return null;
            case 3:
                if (lnmVar instanceof r5y) {
                    r5yVar = (r5y) lnmVar;
                    int i = r5yVar.d;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        r5yVar.d = i - Integer.MIN_VALUE;
                    } else {
                        r5yVar = new r5y(this, (onm) lnmVar);
                    }
                } else {
                    r5yVar = new r5y(this, (onm) lnmVar);
                }
                Object objI = r5yVar.b;
                int i2 = r5yVar.d;
                if (i2 == 0) {
                    hm5.M(objI);
                    String str3 = hti0Var.a;
                    ((npm1) obj3).getClass();
                    if (str3.equals("spotify:playlist:37i9dQZF1EYkqdzj48dyYq") && ((b1y) obj).a.j()) {
                        mr20 mr20VarA = ((ov20) obj2).a("dj-voice-data-collection-eligibility", false);
                        r5yVar.a = hti0Var;
                        r5yVar.d = 1;
                        objI = b5p1.i(mr20VarA, r5yVar);
                        if (objI == d9nVar) {
                            return d9nVar;
                        }
                        hti0Var2 = hti0Var;
                        if (((Boolean) objI).booleanValue()) {
                            return c(hti0Var2);
                        }
                    }
                } else if (i2 == 1) {
                    hti0Var2 = r5yVar.a;
                    hm5.M(objI);
                    if (((Boolean) objI).booleanValue()) {
                        return c(hti0Var2);
                    }
                } else {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 4:
                if (lnmVar instanceof yo70) {
                    yo70Var = (yo70) lnmVar;
                    int i3 = yo70Var.e;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        yo70Var.e = i3 - Integer.MIN_VALUE;
                    } else {
                        yo70Var = new yo70(this, (onm) lnmVar);
                    }
                } else {
                    yo70Var = new yo70(this, (onm) lnmVar);
                }
                Object objJ = yo70Var.c;
                int i4 = yo70Var.e;
                if (i4 != 0) {
                    if (i4 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = yo70Var.b;
                    jl1Var = yo70Var.a;
                    hm5.M(objJ);
                    return ((st60) jl1Var.e).p(str, 2, ((Boolean) objJ).booleanValue());
                }
                hm5.M(objJ);
                if (((dp70) obj).a && (qxc0Var = hti0Var.d) != null && ((me30) obj3).a(qxc0Var.e) != le30.b) {
                    String str4 = hti0Var.a;
                    Single singleB = ((sun) obj2).b(str4);
                    yo70Var.a = this;
                    yo70Var.b = str4;
                    yo70Var.e = 1;
                    objJ = fc11.j(singleB, yo70Var);
                    if (objJ == d9nVar) {
                        return d9nVar;
                    }
                    jl1Var = this;
                    str = str4;
                    return ((st60) jl1Var.e).p(str, 2, ((Boolean) objJ).booleanValue());
                }
                return null;
            case 5:
                if (lnmVar instanceof jqa1) {
                    jqa1Var = (jqa1) lnmVar;
                    int i5 = jqa1Var.f;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        jqa1Var.f = i5 - Integer.MIN_VALUE;
                    } else {
                        jqa1Var = new jqa1(this, (onm) lnmVar);
                    }
                } else {
                    jqa1Var = new jqa1(this, (onm) lnmVar);
                }
                Object obj4 = jqa1Var.d;
                int i6 = jqa1Var.f;
                if (i6 != 0) {
                    if (i6 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qxc0Var2 = jqa1Var.c;
                    str2 = jqa1Var.b;
                    jl1Var2 = jqa1Var.a;
                    hm5.M(obj4);
                    return jl1Var2.h(str2, qxc0Var2, (bva1) obj4);
                }
                hm5.M(obj4);
                qxc0 qxc0VarD = d(hti0Var);
                if (qxc0VarD != null) {
                    str2 = hti0Var.a;
                    mr20 mr20VarK = ((hp91) obj3).k();
                    jqa1Var.a = this;
                    jqa1Var.b = str2;
                    jqa1Var.c = qxc0VarD;
                    jqa1Var.f = 1;
                    Object objI2 = b5p1.i(mr20VarK, jqa1Var);
                    if (objI2 == d9nVar) {
                        return d9nVar;
                    }
                    qxc0Var2 = qxc0VarD;
                    obj4 = objI2;
                    jl1Var2 = this;
                    return jl1Var2.h(str2, qxc0Var2, (bva1) obj4);
                }
                return null;
            default:
                qxc0 qxc0Var4 = hti0Var.d;
                if (qxc0Var4 != null && g(qxc0Var4)) {
                    return smo1.s(new u73(this, hti0Var, qxc0Var4, d0rVar, (lnm) null), lnmVar);
                }
                return null;
        }
    }

    public jhm c(hti0 hti0Var) {
        esg esgVar = (esg) this.e;
        return new jhm("endless_dj_voice_data_sharing", (hux) ttx.c, (fhm) null, (Integer) 2131954364, (String) null, false, (tm81) null, new ihm(new bhm(2), new ghm(x0y.Z, new oz6(hti0Var.b, (byte) 3)), new i5w(esgVar, (byte) 20)), 244);
    }

    public qxc0 d(hti0 hti0Var) {
        qxc0 qxc0Var;
        if (((oqa1) this.b).c) {
            nyu0 nyu0VarC = oxu0.a.c(hti0Var.a);
            if ((nyu0VarC instanceof nyu0 ? nyu0VarC : null) != null && (qxc0Var = hti0Var.d) != null && !qxc0Var.h) {
                return qxc0Var;
            }
        }
        return null;
    }

    public boolean e(qxc0 qxc0Var) {
        return (((me30) this.c).a(qxc0Var.e) == le30.g || !qxc0Var.t.b || gyo1.L(qxc0Var.O0)) ? false : true;
    }

    public boolean f(hti0 hti0Var) {
        if (((drp0) this.e).b()) {
            return false;
        }
        qxc0 qxc0Var = hti0Var.d;
        if (qxc0Var == null) {
            return true;
        }
        le30 le30VarA = ((me30) this.c).a(qxc0Var.e);
        return ((le30VarA == le30.b1 || le30VarA == le30.c1) && ((sp4) this.d).a() && qxc0Var.h) ? false : true;
    }

    public boolean g(qxc0 qxc0Var) {
        return (((drp0) this.e).b() || !((a4q0) this.c).a.g() || gyo1.H(qxc0Var.O0, dlc0.b) || Boolean.parseBoolean((String) qxc0Var.X.get("is_video_first"))) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x007e A[EDGE_INSN: B:29:0x007e->B:30:0x007f BREAK  A[LOOP:2: B:24:0x0064->B:60:?]] */
    /* JADX WARN: Code duplicated, block: B:58:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:? A[LOOP:2: B:24:0x0064->B:60:?, LOOP_END, SYNTHETIC] */
    public jhm h(String str, qxc0 qxc0Var, bva1 bva1Var) {
        Enum r12;
        Iterator it;
        int i;
        if (!bva1Var.equals(ava1.a)) {
            List list = qxc0Var.N0;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((ll81) obj).b == 1) {
                    arrayList.add(obj);
                }
            }
            boolean zIsEmpty = arrayList.isEmpty();
            Enum r5 = dwu0.b;
            if (zIsEmpty) {
                if (arrayList.isEmpty()) {
                    r12 = null;
                    break;
                }
                it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        r12 = null;
                        break;
                    }
                    if (u890.j(((ll81) it.next()).a, "speed-remove-opt-out")) {
                        r12 = dwu0.a;
                        break;
                    }
                }
            } else {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        if (arrayList.isEmpty()) {
                            r12 = null;
                            break;
                        }
                        it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                r12 = null;
                                break;
                            }
                            if (u890.j(((ll81) it.next()).a, "speed-remove-opt-out")) {
                                r12 = dwu0.a;
                                break;
                            }
                        }
                    } else if (u890.j(((ll81) it2.next()).a, "speed-opt-out")) {
                        r12 = r5;
                    }
                }
            }
            if (r12 != null) {
                phi0 phi0Var = (phi0) this.d;
                z6k0 z6k0Var = (z6k0) this.e;
                Map map = qxc0Var.X;
                z6k0Var.getClass();
                boolean zA = z6k0.a(map);
                p811 p811Var = new p811();
                boolean z = r12 == r5 && zA;
                Map mapJ = sqg0.J(new mmr0[]{new mmr0("type", "turn-off-speed-changes-confirmation"), new mmr0("playlist-uri", str)});
                String strF = f4i1.f("spotify:internal:playlist-speedcontrol-messaging", mapJ.isEmpty() ? "" : "?".concat(o7h.y0(mapJ.entrySet(), "&", (String) null, (String) null, svu0.V0, 30)), "");
                usx usxVar = usx.c;
                int iOrdinal = r12.ordinal();
                if (iOrdinal == 0) {
                    i = 2131962849;
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    i = 2131962848;
                }
                return new jhm("playlist_toggle_speed_changes", (hux) usxVar, (fhm) null, Integer.valueOf(i), (String) null, false, (tm81) null, new ihm(new ygm(2), new ghm(svu0.Q0, new o96(z, strF, p811Var, phi0Var, r12, (byte) 11)), new gdv((byte) 3, phi0Var, strF, p811Var, str, r12, z)), 244);
            }
        }
        return null;
    }

    public jhm i(hti0 hti0Var, qxc0 qxc0Var, vnb1 vnb1Var, h2v h2vVar, boolean z, Map map) {
        if (y7y0.t("offline", map) || !(y7y0.G(map) || !y7y0.L(map) || y7y0.F(map))) {
            return ((zeu) this.d).j(hti0Var.b, hti0Var.a, h2vVar, vnb1Var.a, qxc0Var.h, z);
        }
        return null;
    }

    public jhm j(hti0 hti0Var) {
        AccessibilityManager accessibilityManager;
        String m231Var;
        AccessibilityManager accessibilityManager2;
        idd1 idd1Var = (idd1) this.e;
        if (((l25) ((zwa) this.d).b).a()) {
            qxc0 qxc0Var = hti0Var.d;
            String str = hti0Var.a;
            if (qxc0Var != null && !gyo1.L(qxc0Var.O0) && ((accessibilityManager = (AccessibilityManager) idd1Var.getValue()) == null || !accessibilityManager.isEnabled() || (accessibilityManager2 = (AccessibilityManager) idd1Var.getValue()) == null || !accessibilityManager2.isTouchExplorationEnabled())) {
                try {
                    Set set = s4b1.f;
                    m231Var = uic.x(str).h();
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                if (m231Var instanceof m231) {
                    return null;
                }
                tbn tbnVar = (tbn) this.c;
                Set set2 = s4b1.f;
                String strConcat = "spotify:cover-art-snake:".concat(uic.x(str).h());
                return new jhm("cover_art_snake", (hux) jnx.c, (fhm) null, (Integer) 2131954622, (String) null, false, (tm81) null, new ihm(new ygm(2), new ghm(y6n.T0, new kak(strConcat, (byte) 20)), new kjk(tbnVar, strConcat, (byte) 22)), 244);
            }
        }
        return null;
    }

    public jl1(Context context, tbn tbnVar, zwa zwaVar) {
        this.a = (byte) 1;
        this.b = context;
        this.c = tbnVar;
        this.d = zwaVar;
        this.e = new idd1(new j3m(this, (byte) 21));
    }

    public /* synthetic */ jl1(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
