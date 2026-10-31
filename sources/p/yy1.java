package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import io.reactivex.rxjava3.core.Observable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yy1 implements shm {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public yy1(mxr mxrVar) {
        this.a = (byte) 10;
        this.b = mxrVar;
        this.c = w3p1.o(new l4r(hvm.b, 1, z6t.Q0, new j4r(z6t.O0), z6t.R0), z6t.P0);
    }

    public static jhm c() {
        return new jhm("mix_track_order", (hux) kox.c, (fhm) null, (Integer) 2131958608, (String) null, false, (tm81) null, new ihm(new ygm(2), new ghm(ktj0.h, new nrj0(1, (byte) 5)), ktj0.i), 244);
    }

    public static qxc0 d(hti0 hti0Var) {
        qxc0 qxc0Var = hti0Var.d;
        if (qxc0Var == null) {
            return null;
        }
        boolean z = false;
        if (!Boolean.parseBoolean((String) qxc0Var.X.get("is_video_first")) && (!qxc0Var.i.a() || qxc0Var.h)) {
            z = !gyo1.L(qxc0Var.O0);
        }
        if (z) {
            return qxc0Var;
        }
        return null;
    }

    @Override // p.shm
    public final mr20 a(hti0 hti0Var, rzq rzqVar) {
        String str;
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        jhm jhmVarK = null;
        switch (b) {
            case 0:
                qxc0 qxc0Var = hti0Var.d;
                if (qxc0Var != null) {
                    qxc0 qxc0Var2 = gyo1.G(qxc0Var.O0, new dlc0[]{dlc0.d, dlc0.h, dlc0.g}) ? qxc0Var : null;
                    if (qxc0Var2 != null) {
                        return new sr0(((ov20) obj).a, this, hti0Var, qxc0Var2, (byte) 1);
                    }
                }
                return new huz((Object) null, (byte) 10);
            case 1:
                qxc0 qxc0VarD = d(hti0Var);
                return qxc0VarD == null ? new huz((Object) null, (byte) 10) : new sr0(new te1(d3p1.F(rzqVar, (o3r) obj2, hti0Var.a), (byte) 3), this, hti0Var, qxc0VarD, (byte) 3);
            case 2:
                return new huz(q(hti0Var), (byte) 10);
            case 3:
                return new huz(r(hti0Var), (byte) 10);
            case 4:
                return new huz(s(hti0Var), (byte) 10);
            case 5:
                return new huz(t(hti0Var), (byte) 10);
            case 6:
                return new huz(l(hti0Var), (byte) 10);
            case 7:
                return new huz(u(hti0Var), (byte) 10);
            case 8:
                return new huz(v(hti0Var), (byte) 10);
            case 9:
                return new huz(j(hti0Var), (byte) 10);
            case 10:
                qxc0 qxc0Var3 = hti0Var.d;
                return qxc0Var3 == null ? new huz((Object) null, (byte) 10) : new sr0(new te1(d3p1.F(rzqVar, (o3r) obj2, hti0Var.a), (byte) 29), qxc0Var3, this, hti0Var, (byte) 9);
            case 11:
                String str2 = hti0Var.a;
                ((npm1) obj).getClass();
                return new huz(str2.equals("spotify:playlist:37i9dQZF1EYkqdzj48dyYq") ? ((gmt) obj2).f(hti0Var.b) : null, (byte) 10);
            case 12:
                return new huz(m(hti0Var), (byte) 10);
            case 13:
                return new huz(n(hti0Var), (byte) 10);
            case 14:
                return !f(hti0Var) ? new huz((Object) null, (byte) 10) : new sii0(((mnk0) obj2).a, this, (byte) 2);
            case 15:
                ugo0 ugo0Var = hti0Var.f.a;
                if (ugo0Var != null) {
                    jhmVarK = ugo0Var.a ? ((kqi0) obj).k(ugo0Var) : ((dxy) obj2).s(ugo0Var);
                }
                return new huz(jhmVarK, (byte) 10);
            case 16:
                return new huz(o(hti0Var), (byte) 10);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new m441(new hgo0(this, hti0Var, rzqVar, (lnm) null, (byte) 5));
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                qxc0 qxc0Var4 = hti0Var.d;
                if (qxc0Var4 == null) {
                    return new huz((Object) null, (byte) 10);
                }
                if (!e(qxc0Var4)) {
                    return new huz((Object) null, (byte) 10);
                }
                String str3 = hti0Var.a;
                return new sr0(new p1e0(d3p1.F(rzqVar, w3p1.n(new l4r(hvm.b, 1, kex0.d, new j4r(kex0.f), kex0.e), new l4r(new xv00(rc11.a.b(qp31.class)), 2, kex0.b, new j4r(kex0.g), kex0.c), gbw0.Z), str3), (byte) 28), this, qxc0Var4, str3, (byte) 20);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                qxc0 qxc0Var5 = hti0Var.d;
                return (qxc0Var5 == null || !qxc0Var5.h || (str = qxc0Var5.g) == null || str.length() == 0) ? new huz((Object) null, (byte) 10) : new mpy0(yoi1.g(((kiu0) obj).a(true)), this, hti0Var, (byte) 4);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return !((drp0) obj2).b() ? new huz((Object) null, (byte) 10) : ((a42) obj).e(hti0Var, rzqVar);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new huz(k(hti0Var), (byte) 10);
            default:
                return new huz(p(hti0Var), (byte) 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x018f  */
    /* JADX WARN: Code duplicated, block: B:119:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:161:0x0258  */
    /* JADX WARN: Code duplicated, block: B:182:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0092  */
    /* JADX WARN: Code duplicated, block: B:41:0x0097  */
    /* JADX WARN: Code duplicated, block: B:88:0x0157  */
    @Override // p.shm
    public final Object b(hti0 hti0Var, d0r d0rVar, lnm lnmVar) {
        wy1 wy1Var;
        qxc0 qxc0Var;
        qj3 qj3Var;
        qxc0 qxc0Var2;
        a9t a9tVar;
        qxc0 qxc0Var3;
        quj0 quj0Var;
        h811 h811Var;
        String str;
        Boolean bool;
        boolean zBooleanValue;
        hti0 hti0Var2 = hti0Var;
        byte b = this.a;
        d9n d9nVar = d9n.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                if (lnmVar instanceof wy1) {
                    wy1Var = (wy1) lnmVar;
                    int i = wy1Var.f;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        wy1Var.f = i - Integer.MIN_VALUE;
                    } else {
                        wy1Var = new wy1(this, (onm) lnmVar);
                    }
                } else {
                    wy1Var = new wy1(this, (onm) lnmVar);
                }
                Object objI = wy1Var.d;
                int i2 = wy1Var.f;
                if (i2 != 0) {
                    if (i2 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qxc0 qxc0Var4 = wy1Var.c;
                    hti0Var2 = wy1Var.b;
                    yy1 yy1Var = wy1Var.a;
                    hm5.M(objI);
                    qxc0Var = qxc0Var4;
                    this = yy1Var;
                    return this.h(hti0Var2, qxc0Var, (Map) objI);
                }
                hm5.M(objI);
                qxc0Var = hti0Var2.d;
                if (qxc0Var != null) {
                    if (!gyo1.G(qxc0Var.O0, new dlc0[]{dlc0.d, dlc0.h, dlc0.g})) {
                        qxc0Var = null;
                    }
                    if (qxc0Var != null) {
                        ezc ezcVar = ((ov20) obj2).a;
                        wy1Var.a = this;
                        wy1Var.b = hti0Var2;
                        wy1Var.c = qxc0Var;
                        wy1Var.f = 1;
                        objI = b5p1.i(ezcVar, wy1Var);
                        if (objI == d9nVar) {
                            return d9nVar;
                        }
                        return this.h(hti0Var2, qxc0Var, (Map) objI);
                    }
                }
                return null;
            case 1:
                if (lnmVar instanceof qj3) {
                    qj3Var = (qj3) lnmVar;
                    int i3 = qj3Var.e;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        qj3Var.e = i3 - Integer.MIN_VALUE;
                    } else {
                        qj3Var = new qj3(this, (onm) lnmVar);
                    }
                } else {
                    qj3Var = new qj3(this, (onm) lnmVar);
                }
                Object obj3 = qj3Var.c;
                int i4 = qj3Var.e;
                if (i4 != 0) {
                    if (i4 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qxc0 qxc0Var5 = qj3Var.b;
                    hti0 hti0Var3 = qj3Var.a;
                    hm5.M(obj3);
                    qxc0Var2 = qxc0Var5;
                    hti0Var2 = hti0Var3;
                    return ((oj80) obj2).b(hti0Var2.a, (g3d0) obj3, qxc0Var2);
                }
                hm5.M(obj3);
                qxc0 qxc0VarD = d(hti0Var2);
                if (qxc0VarD != null) {
                    String str2 = hti0Var2.a;
                    qj3Var.a = hti0Var2;
                    qj3Var.b = qxc0VarD;
                    qj3Var.e = 1;
                    Object objP = exd0.p(d3p1.F(d0rVar, (o3r) obj, str2), qj3Var);
                    if (objP == d9nVar) {
                        return d9nVar;
                    }
                    qxc0Var2 = qxc0VarD;
                    obj3 = objP;
                    return ((oj80) obj2).b(hti0Var2.a, (g3d0) obj3, qxc0Var2);
                }
                return null;
            case 2:
                return q(hti0Var);
            case 3:
                return r(hti0Var);
            case 4:
                return s(hti0Var);
            case 5:
                return t(hti0Var);
            case 6:
                return l(hti0Var);
            case 7:
                return u(hti0Var);
            case 8:
                return v(hti0Var);
            case 9:
                return j(hti0Var);
            case 10:
                if (lnmVar instanceof a9t) {
                    a9tVar = (a9t) lnmVar;
                    int i5 = a9tVar.e;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        a9tVar.e = i5 - Integer.MIN_VALUE;
                    } else {
                        a9tVar = new a9t(this, (onm) lnmVar);
                    }
                } else {
                    a9tVar = new a9t(this, (onm) lnmVar);
                }
                Object obj4 = a9tVar.c;
                int i6 = a9tVar.e;
                if (i6 == 0) {
                    hm5.M(obj4);
                    qxc0 qxc0Var6 = hti0Var2.d;
                    if (qxc0Var6 != null) {
                        String str3 = hti0Var2.a;
                        a9tVar.a = hti0Var2;
                        a9tVar.b = qxc0Var6;
                        a9tVar.e = 1;
                        Object objH = ebp1.h(d3p1.F(d0rVar, (o3r) obj, str3), a9tVar);
                        if (objH == d9nVar) {
                            return d9nVar;
                        }
                        qxc0Var3 = qxc0Var6;
                        obj4 = objH;
                        vnb1 vnb1Var = (vnb1) obj4;
                        if (qxc0Var3.t.a) {
                            return ((mxr) obj2).i(hti0Var2.a, qxc0Var3.a);
                        }
                    }
                } else if (i6 == 1) {
                    qxc0 qxc0Var7 = a9tVar.b;
                    hti0 hti0Var4 = a9tVar.a;
                    hm5.M(obj4);
                    qxc0Var3 = qxc0Var7;
                    hti0Var2 = hti0Var4;
                    vnb1 vnb1Var2 = (vnb1) obj4;
                    if (qxc0Var3.t.a && vnb1Var2.a) {
                        return ((mxr) obj2).i(hti0Var2.a, qxc0Var3.a);
                    }
                } else {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 11:
                String str4 = hti0Var2.a;
                ((npm1) obj2).getClass();
                if (str4.equals("spotify:playlist:37i9dQZF1EYkqdzj48dyYq")) {
                    return ((gmt) obj).f(hti0Var2.b);
                }
                return null;
            case 12:
                return m(hti0Var);
            case 13:
                return n(hti0Var);
            case 14:
                if (lnmVar instanceof quj0) {
                    quj0Var = (quj0) lnmVar;
                    int i7 = quj0Var.c;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        quj0Var.c = i7 - Integer.MIN_VALUE;
                    } else {
                        quj0Var = new quj0(this, (onm) lnmVar);
                    }
                } else {
                    quj0Var = new quj0(this, (onm) lnmVar);
                }
                Object objI2 = quj0Var.a;
                int i8 = quj0Var.c;
                if (i8 == 0) {
                    hm5.M(objI2);
                    if (f(hti0Var)) {
                        mr20 mr20Var = ((mnk0) obj).a;
                        quj0Var.c = 1;
                        objI2 = b5p1.i(mr20Var, quj0Var);
                        if (objI2 == d9nVar) {
                            return d9nVar;
                        }
                        if (((ibk0) objI2).b()) {
                            return c();
                        }
                    }
                } else if (i8 == 1) {
                    hm5.M(objI2);
                    if (((ibk0) objI2).b()) {
                        return c();
                    }
                } else {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 15:
                ugo0 ugo0Var = hti0Var2.f.a;
                if (ugo0Var == null) {
                    return null;
                }
                return ugo0Var.a ? ((kqi0) obj2).k(ugo0Var) : ((dxy) obj).s(ugo0Var);
            case 16:
                return o(hti0Var);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                if (!((l35) obj2).a()) {
                    return null;
                }
                String str5 = hti0Var2.a;
                oxu0 oxu0Var = oxu0.a;
                nyu0 nyu0VarC = oxu0Var.c(str5);
                if ((nyu0VarC instanceof nyu0 ? nyu0VarC : null) == null) {
                    wyu0 wyu0VarC = oxu0Var.c(str5);
                    if ((wyu0VarC instanceof wyu0 ? wyu0VarC : null) == null) {
                        return null;
                    }
                }
                qxc0 qxc0Var8 = hti0Var2.d;
                if (qxc0Var8 == null || !qxc0Var8.h) {
                    return null;
                }
                String str6 = hti0Var2.a;
                return new jhm("playlist_stats", (hux) flx.c, (fhm) null, (Integer) 2131960085, (String) null, false, (tm81) null, new ihm(new ygm(2), new ghm(svu0.R0, new zqu0(rsm.b(str6), (byte) 4)), new aft0(this, str6, (byte) 26)), 244);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                qxc0 qxc0Var9 = hti0Var2.d;
                if (qxc0Var9 != null && e(qxc0Var9)) {
                    return smo1.s(new mpv0(this, qxc0Var9, hti0Var2.a, d0rVar, (lnm) null), lnmVar);
                }
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                if (lnmVar instanceof h811) {
                    h811Var = (h811) lnmVar;
                    int i9 = h811Var.d;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        h811Var.d = i9 - Integer.MIN_VALUE;
                    } else {
                        h811Var = new h811(this, (onm) lnmVar);
                    }
                } else {
                    h811Var = new h811(this, (onm) lnmVar);
                }
                Object objL = h811Var.b;
                int i10 = h811Var.d;
                if (i10 != 0) {
                    if (i10 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hti0Var2 = h811Var.a;
                    hm5.M(objL);
                    bool = (Boolean) objL;
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    return i(hti0Var2.a, zBooleanValue);
                }
                hm5.M(objL);
                qxc0 qxc0Var10 = hti0Var2.d;
                if (qxc0Var10 != null && qxc0Var10.h && (str = qxc0Var10.g) != null && str.length() != 0) {
                    Observable observableA = ((kiu0) obj2).a(true);
                    h811Var.a = hti0Var2;
                    h811Var.d = 1;
                    objL = fc11.l(observableA, 2, (Object) null, h811Var);
                    if (objL == d9nVar) {
                        return d9nVar;
                    }
                    bool = (Boolean) objL;
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    return i(hti0Var2.a, zBooleanValue);
                }
                return null;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                if (((drp0) obj).b()) {
                    return smo1.s(new ml1((a42) obj2, d0rVar, hti0Var2, (lnm) null), (n0a0) lnmVar);
                }
                return null;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return k(hti0Var);
            default:
                return p(hti0Var);
        }
    }

    public boolean e(qxc0 qxc0Var) {
        me30 me30Var = (me30) this.b;
        String str = qxc0Var.e;
        boolean z = qxc0Var.f;
        if (me30Var.a(str) == le30.b) {
            return false;
        }
        if (qxc0Var.i.a() && !z) {
            return false;
        }
        int iOrdinal = me30Var.a(qxc0Var.e).ordinal();
        return !(iOrdinal == 0 || iOrdinal == 20) || z;
    }

    public boolean f(hti0 hti0Var) {
        qxc0 qxc0Var;
        if (!((rxj0) this.b).T || (qxc0Var = hti0Var.d) == null) {
            return false;
        }
        List list = qxc0Var.N0;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (u890.j(((ll81) it.next()).a, "mix-auto-toggle-off")) {
                return true;
            }
        }
        return false;
    }

    public jhm g(qxc0 qxc0Var, String str, boolean z, boolean z2) {
        if (!z2) {
            return null;
        }
        if (!qxc0Var.h && !z) {
            return null;
        }
        haa0 haa0Var = (haa0) this.c;
        boolean z3 = qxc0Var.f;
        return new jhm("list_add_or_remove_from_profile", (hux) vtx.c, (fhm) null, Integer.valueOf(z3 ? 2131954423 : 2131954320), (String) null, false, (tm81) null, new ihm(new ygm(2), new ghm(puc0.d1, new cl1(z3, str, (byte) 21)), new c30((Object) haa0Var, z3, (Object) str, (byte) 20)), 244);
    }

    public jhm h(hti0 hti0Var, qxc0 qxc0Var, Map map) {
        boolean z = qxc0Var.U0 == r2q0.d;
        if (!y7y0.G(map) && !y7y0.L(map) && !z) {
            return null;
        }
        oy1 oy1Var = (oy1) this.c;
        String str = hti0Var.a;
        return new jhm("list_add_to_queue", (hux) vjx.c, (fhm) null, (Integer) 2131960078, (String) null, false, (tm81) null, new ihm(new ygm(2), new ghm(ny1.b, new v1(str, (byte) 15)), new d4((byte) 27, oy1Var, str)), 244);
    }

    public jhm i(String str, boolean z) {
        if (!z) {
            return null;
        }
        iae iaeVar = (iae) this.c;
        Set set = s4b1.f;
        String strZ = uic.x("spotify:ai-playlist:reedit:".concat(uic.x(str).h())).z();
        if (strZ == null) {
            strZ = "";
        }
        return new jhm("playlist_entity_refine", (hux) zmx.c, (fhm) null, (Integer) 2131959980, (String) null, false, new tm81(0, 10, "playlist_entity_refine", (iu30) null, true), new ihm(new ygm(2), new ghm(a411.Z, new q4z0(strZ, (byte) 16)), new nt01(iaeVar, strZ, (byte) 5)), 116);
    }

    public jhm j(hti0 hti0Var) {
        qxc0 qxc0Var = hti0Var.d;
        if (qxc0Var == null || ((me30) this.c).a(qxc0Var.e) != le30.h) {
            return null;
        }
        iae iaeVar = (iae) this.b;
        String str = hti0Var.a;
        return new jhm("celebrity_blend_view_story", (hux) ukx.c, (fhm) null, (Integer) 2131953509, (String) null, false, (tm81) null, new ihm(ahm.c, new ghm(new w8c(str, (byte) 13), new w8c(str, (byte) 14)), new ztb(str, iaeVar, (byte) 22)), 244);
    }

    public jhm k(hti0 hti0Var) {
        z0t z0tVar = (z0t) this.c;
        qxc0 qxc0Var = hti0Var.d;
        if (qxc0Var == null || !qxc0Var.t.b || !z0tVar.a.d() || !z0tVar.a.e()) {
            return null;
        }
        String str = hti0Var.a;
        Set set = s4b1.f;
        if (!uic.k(str, new b3i1[]{nyu0.e, wyu0.f})) {
            return null;
        }
        yx6 yx6Var = (yx6) this.b;
        String str2 = nik1.k1.a;
        return new jhm("set_default_save_location", (hux) jlx.c, (fhm) null, (Integer) 2131954431, (String) null, false, (tm81) null, new ihm(new ygm(2), new ghm(ec61.P0, new pg61(str2, (byte) 1)), new c861(yx6Var, str2, (byte) 3)), 244);
    }

    public jhm l(hti0 hti0Var) {
        qxc0 qxc0Var = hti0Var.d;
        if (qxc0Var != null && ((me30) this.c).a(qxc0Var.e) == le30.b) {
            String str = (String) qxc0Var.X.get("artistUris");
            List listQ0 = str != null ? ihc1.Q0(str, new String[]{","}, 0, 6) : null;
            List list = listQ0;
            if (list != null && !list.isEmpty() && listQ0.size() == 1 && !u890.j(o7h.q0(listQ0), "spotify:artist:0LyfQWJT6nXafLPZqxe9Of")) {
                return ((i6c) this.b).a((String) o7h.q0(listQ0), "");
            }
        }
        return null;
    }

    public jhm m(hti0 hti0Var) {
        qxc0 qxc0Var = hti0Var.d;
        if (qxc0Var == null) {
            return null;
        }
        hd71 hd71Var = (hd71) this.b;
        x7i1 x7i1Var = qxc0Var.t;
        wls0 wls0Var = qxc0Var.i;
        hd71Var.getClass();
        if (!hd71.a(x7i1Var, wls0Var, wls0.f)) {
            return null;
        }
        return new jhm("list_invite_collaborators", (hux) hnx.c, (fhm) null, (Integer) 2131960081, (String) null, false, (tm81) null, new ihm(new ygm(2), new ghm(o390.h, o390.i), new vq80((x390) this.c, hti0Var.a, (byte) 5)), 244);
    }

    public jhm n(hti0 hti0Var) {
        qxc0 qxc0Var = hti0Var.d;
        if (qxc0Var == null) {
            return null;
        }
        le30 le30VarA = ((me30) this.c).a(qxc0Var.e);
        if (!((le30VarA == le30.b || le30VarA == le30.k1) ? true : u890.j(qxc0Var.X.get("editorial.series"), "this-is"))) {
            return null;
        }
        return new jhm("playlist_entity_live_events_tos", (hux) ynx.c, (fhm) null, (Integer) 2131959949, (String) null, false, (tm81) null, new ihm(zgm.c, new ghm(god0.b, god0.c), new l6d0((hod0) ((ikp) this.b).get(), (byte) 11)), 244);
    }

    public jhm o(hti0 hti0Var) {
        qxc0 qxc0Var = hti0Var.d;
        if (qxc0Var == null || !((wmu0) this.c).a(qxc0Var.t)) {
            return null;
        }
        xmu0 xmu0Var = (xmu0) this.b;
        String str = hti0Var.a;
        String strQ = t5p1.q(str);
        return new jhm("playlist_history", (hux) urx.c, (fhm) null, Integer.valueOf(((m980) xmu0Var.b).b ? 2131960131 : 2131960016), (String) null, false, (tm81) null, new ihm(zgm.c, new ghm(rku0.h, new atp0(strQ, (byte) 27)), new aft0(xmu0Var, str, (byte) 20)), 244);
    }

    public jhm p(hti0 hti0Var) {
        qxc0 qxc0Var;
        if (!((drp0) this.b).b() || (qxc0Var = hti0Var.d) == null || !gyo1.G(qxc0Var.O0, new dlc0[]{dlc0.d, dlc0.h}) || Boolean.parseBoolean((String) qxc0Var.X.get("is_video_first"))) {
            return null;
        }
        qeh1 qeh1Var = (qeh1) this.c;
        String str = hti0Var.a;
        return new jhm("playlist_entity_reinventfree_download", (hux) tmx.c, (fhm) null, (Integer) 2131959981, (String) null, false, new tm81(1, 6, "playlist_entity_reinventfree_download", (iu30) null, false), new ihm(new ygm(2), new ghm(osh1.P0, new ysf1(str, (byte) 16)), new rsc1(qxc0Var, qeh1Var, str, (byte) 25)), 116);
    }

    public jhm q(hti0 hti0Var) {
        qxc0 qxc0Var = hti0Var.d;
        if (qxc0Var == null || ((me30) this.c).a(qxc0Var.e) != le30.g) {
            return null;
        }
        gza gzaVar = (gza) this.b;
        String str = hti0Var.a;
        return new jhm("blend_add_members", (hux) hnx.c, (fhm) null, (Integer) 2131952731, (String) null, false, (tm81) null, new ihm(new ygm(2), new ghm(new nb9(str, (byte) 11), yda.c1), new kd8(gzaVar, str, (byte) 17)), 244);
    }

    public jhm r(hti0 hti0Var) {
        qxc0 qxc0Var = hti0Var.d;
        if (qxc0Var == null || ((me30) this.c).a(qxc0Var.e) != le30.g) {
            return null;
        }
        kba kbaVar = (kba) this.b;
        String str = qxc0Var.a;
        String str2 = hti0Var.a;
        Set set = s4b1.f;
        String strZ = uic.x("spotify:blend:edit:".concat(uic.x(str2).h())).z();
        return new jhm("blend_edit", (hux) xmx.c, (fhm) null, (Integer) 2131952735, (String) null, false, (tm81) null, new ihm(new ygm(2), new ghm(new nb9(str2, (byte) 12), new nb9(strZ, (byte) 13)), new oo6(kbaVar, strZ, str, (byte) 14)), 244);
    }

    public jhm s(hti0 hti0Var) {
        qxc0 qxc0Var = hti0Var.d;
        if (qxc0Var == null || ((me30) this.c).a(qxc0Var.e) != le30.g) {
            return null;
        }
        fta ftaVar = (fta) this.b;
        String str = hti0Var.a;
        return new jhm("blend_leave", (hux) tkx.c, (fhm) null, (Integer) 2131952739, (String) null, false, (tm81) null, new ihm(new ygm(3), new ghm(new nb9(str, (byte) 14), new nb9(str, (byte) 15)), new kd8(ftaVar, str, (byte) 20)), 244);
    }

    public jhm t(hti0 hti0Var) {
        qxc0 qxc0Var = hti0Var.d;
        if (qxc0Var == null || ((me30) this.c).a(qxc0Var.e) != le30.g) {
            return null;
        }
        t2 t2Var = (t2) this.b;
        String str = hti0Var.a;
        Set set = s4b1.f;
        String strConcat = "spotify:blend:story:".concat(uic.x(str).h());
        return new jhm("blend_view_story", (hux) ukx.c, (fhm) null, (Integer) 2131952756, (String) null, false, (tm81) null, new ihm(zgm.c, new ghm(new nb9(str, (byte) 16), new nb9(strConcat, (byte) 17)), new kd8(t2Var, strConcat, (byte) 21)), 244);
    }

    public jhm u(hti0 hti0Var) {
        qxc0 qxc0Var = hti0Var.d;
        if (qxc0Var != null && ((me30) this.c).a(qxc0Var.e) == le30.b) {
            String str = (String) qxc0Var.X.get("artistUris");
            List listQ0 = str != null ? ihc1.Q0(str, new String[]{","}, 0, 6) : null;
            List list = listQ0;
            if (list != null && !list.isEmpty() && listQ0.size() != 1) {
                return ((ic9) this.b).d(listQ0);
            }
        }
        return null;
    }

    public jhm v(hti0 hti0Var) {
        qxc0 qxc0Var = hti0Var.d;
        if (qxc0Var == null || ((me30) this.c).a(qxc0Var.e) != le30.h) {
            return null;
        }
        fta ftaVar = (fta) this.b;
        String str = hti0Var.a;
        return new jhm("celebrity_blend_leave", (hux) tkx.c, (fhm) null, (Integer) 2131953507, (String) null, false, (tm81) null, new ihm(new ygm(3), new ghm(new w8c(str, (byte) 12), jzd.R0), new ztb(ftaVar, str, (byte) 21)), 244);
    }

    public /* synthetic */ yy1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public yy1(oj80 oj80Var) {
        this.a = (byte) 1;
        this.b = oj80Var;
        this.c = w3p1.o(new l4r(pwc0.e, 1, we3.Z0, new j4r(we3.X0), we3.a1), we3.Y0);
    }
}
