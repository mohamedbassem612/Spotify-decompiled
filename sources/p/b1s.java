package p;

import android.os.Bundle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class b1s extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1s(vrs vrsVar, gia1 gia1Var) {
        super(3);
        this.a = (byte) 21;
        this.b = gia1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object sp3Var;
        int i;
        jix lixVar;
        Object yo3Var;
        ou80 ou80Var;
        byte b = this.a;
        np3 np3Var = np3.a;
        String str = null;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                og60 og60Var = (og60) obj;
                tqw tqwVar = (tqw) obj3;
                String str2 = og60Var.a;
                ft30 ft30Var = (ft30) ((ldo) obj4).d;
                int iOrdinal = ((ng60) obj2).ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    sp3Var = new sp3(str2, og60Var.b, cvl1.d(tqwVar));
                } else {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    sp3Var = new tp3(str2);
                }
                ft30Var.invoke(sp3Var);
                return rih1Var;
            case 1:
                o6a o6aVar = (o6a) obj2;
                tqw tqwVar2 = (tqw) obj3;
                umf0 umf0Var = (umf0) obj4;
                ft30 ft30Var2 = (ft30) umf0Var.e;
                k6c0 k6c0Var = (k6c0) umf0Var.d;
                n6c0 n6c0Var = ((dhy) obj).b;
                if (o6aVar instanceof l6a) {
                    l6a l6aVar = (l6a) o6aVar;
                    e8a e8aVar = l6aVar.b;
                    if (e8aVar == e8a.a) {
                        k6c0Var.a(l6aVar.a, e8aVar, 1);
                    }
                } else if (o6aVar instanceof m6a) {
                    if (tqwVar2 != null) {
                        tv80 tv80VarY = n3o1.y(tqwVar2);
                        m6a m6aVar = (m6a) o6aVar;
                        k6c0Var.a(m6aVar.c, m6aVar.d, 2);
                        ft30Var2.invoke(new aq3(m6aVar.a, m6aVar.b, n6c0Var, tv80VarY));
                    }
                } else if (o6aVar instanceof n6a) {
                    n6a n6aVar = (n6a) o6aVar;
                    k6c0Var.a(n6c0Var.f, n6aVar.b, 4);
                    ft30Var2.invoke(new bq3(n6aVar.a, n6c0Var));
                } else {
                    if (!(o6aVar instanceof k6a)) {
                        eg.o();
                        return null;
                    }
                    k6a k6aVar = (k6a) o6aVar;
                    k6c0Var.a(k6aVar.b, k6aVar.c, 3);
                    ft30Var2.invoke(new zp3(k6aVar.a, n6c0Var));
                }
                return rih1Var;
            case 2:
                Boolean bool = (Boolean) obj2;
                boolean zBooleanValue = bool.booleanValue();
                jde0 jde0Var = (jde0) ((ogr) obj4).b;
                hma1 hma1VarEdit = jde0Var.a.edit();
                hma1VarEdit.a(kde0.a, zBooleanValue);
                hma1VarEdit.h();
                xid xidVar = (xid) jde0Var.b.b;
                i8h1 i8h1Var = (i8h1) xidVar.b;
                x6h1 x6h1VarC = ((txk0) ((l2a) xidVar.c).b).b.c();
                x6h1VarC.i.add(new a7h1("local_device_toggle", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                b7x b7xVar = b7x.a;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("no_action", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                return new it61(bool);
            case 3:
                wwi0 wwi0Var = (wwi0) obj2;
                tqw tqwVar3 = (tqw) obj3;
                zdz0 zdz0Var = ((xwi0) obj).a;
                tqwVar3.getClass();
                tv80 tv80VarY2 = n3o1.y(tqwVar3);
                if (wwi0Var.equals(twi0.a)) {
                    uvi0 uvi0Var = zdz0Var.a.d;
                    if (uvi0Var instanceof uvi0) {
                        uvi0Var.b.invoke(tv80VarY2);
                    } else if (uvi0Var instanceof tvi0) {
                        ((tvi0) uvi0Var).b.invoke(tv80VarY2);
                    }
                } else if (wwi0Var.equals(uwi0.a)) {
                    fwi0 fwi0Var = zdz0Var.a;
                    if (fwi0Var.g) {
                        f8s f8sVar = (f8s) ((qj0) obj4).d;
                        f8sVar.f.a(f8sVar.c.x(qzs0.X0).J(rzs0.X0).z().subscribe(new lgr(f8sVar, fwi0Var.a, (byte) 6)));
                    }
                    zdz0Var.b.invoke(new j5j0(zdz0Var.a));
                } else if (!wwi0Var.equals(vwi0.a)) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case 4:
                l8j0 l8j0Var = (n8j0) obj2;
                tqw tqwVar4 = (tqw) obj3;
                paj0 paj0Var = (paj0) ((ldo) obj4).c;
                MessageResponseToken messageResponseToken = ((o8j0) obj).a;
                if (l8j0Var instanceof l8j0) {
                    if (tqwVar4 != null) {
                        l8j0Var.c.putSerializable("UBI_INTERACTION_LOGGING_RESULT", n3o1.y(tqwVar4));
                    }
                    l8j0 l8j0Var2 = l8j0Var;
                    paj0Var.h(l8j0Var2.c, l8j0Var2.b, messageResponseToken, l8j0Var2.a);
                } else if (l8j0Var instanceof m8j0) {
                    if (tqwVar4 != null) {
                        ((m8j0) l8j0Var).c.putSerializable("UBI_INTERACTION_LOGGING_RESULT", n3o1.y(tqwVar4));
                    }
                    m8j0 m8j0Var = (m8j0) l8j0Var;
                    paj0Var.h(m8j0Var.c, m8j0Var.b, messageResponseToken, m8j0Var.a);
                } else if (l8j0Var instanceof i8j0) {
                    if (tqwVar4 != null) {
                        ((i8j0) l8j0Var).c.putSerializable("UBI_INTERACTION_LOGGING_RESULT", n3o1.y(tqwVar4));
                    }
                    i8j0 i8j0Var = (i8j0) l8j0Var;
                    paj0Var.h(i8j0Var.c, i8j0Var.b, messageResponseToken, i8j0Var.a);
                } else if (l8j0Var instanceof j8j0) {
                    if (tqwVar4 != null) {
                        ((j8j0) l8j0Var).c.putSerializable("UBI_INTERACTION_LOGGING_RESULT", n3o1.y(tqwVar4));
                    }
                    j8j0 j8j0Var = (j8j0) l8j0Var;
                    paj0Var.h(j8j0Var.c, j8j0Var.b, messageResponseToken, j8j0Var.a);
                } else if (l8j0Var instanceof h8j0) {
                    paj0Var.f(messageResponseToken, ((h8j0) l8j0Var).a);
                } else {
                    if (!(l8j0Var instanceof k8j0)) {
                        eg.o();
                        return null;
                    }
                    paj0Var.c(messageResponseToken);
                }
                return rih1Var;
            case 5:
                u8j0 u8j0Var = (x8j0) obj2;
                tqw tqwVar5 = (tqw) obj3;
                paj0 paj0Var2 = (paj0) ((umf0) obj4).d;
                MessageResponseToken messageResponseToken2 = ((y8j0) obj).a;
                if (u8j0Var instanceof u8j0) {
                    if (tqwVar5 != null) {
                        u8j0Var.c.putSerializable("UBI_INTERACTION_LOGGING_RESULT", n3o1.y(tqwVar5));
                    }
                    u8j0 u8j0Var2 = u8j0Var;
                    paj0Var2.h(u8j0Var2.c, u8j0Var2.b, messageResponseToken2, u8j0Var2.a);
                } else if (u8j0Var instanceof v8j0) {
                    if (tqwVar5 != null) {
                        ((v8j0) u8j0Var).c.putSerializable("UBI_INTERACTION_LOGGING_RESULT", n3o1.y(tqwVar5));
                    }
                    v8j0 v8j0Var = (v8j0) u8j0Var;
                    paj0Var2.h(v8j0Var.c, v8j0Var.b, messageResponseToken2, v8j0Var.a);
                } else if (u8j0Var instanceof t8j0) {
                    paj0Var2.c(messageResponseToken2);
                } else {
                    if (!(u8j0Var instanceof w8j0)) {
                        eg.o();
                        return null;
                    }
                    if (tqwVar5 != null) {
                        ((w8j0) u8j0Var).b.putSerializable("UBI_INTERACTION_LOGGING_RESULT", n3o1.y(tqwVar5));
                    }
                    w8j0 w8j0Var = (w8j0) u8j0Var;
                    paj0.b(paj0Var2, messageResponseToken2, w8j0Var.a, w8j0Var.b, 8);
                }
                return rih1Var;
            case 6:
                cbj0 cbj0Var = (ebj0) obj2;
                tqw tqwVar6 = (tqw) obj3;
                paj0 paj0Var3 = (paj0) ((qj0) obj4).d;
                MessageResponseToken messageResponseToken3 = ((fbj0) obj).a;
                if (cbj0Var instanceof cbj0) {
                    if (tqwVar6 != null) {
                        cbj0Var.c.putSerializable("UBI_INTERACTION_LOGGING_RESULT", n3o1.y(tqwVar6));
                    }
                    cbj0 cbj0Var2 = cbj0Var;
                    paj0Var3.h(cbj0Var2.c, cbj0Var2.b, messageResponseToken3, cbj0Var2.a);
                } else if (cbj0Var instanceof dbj0) {
                    if (tqwVar6 != null) {
                        ((dbj0) cbj0Var).c.putSerializable("UBI_INTERACTION_LOGGING_RESULT", n3o1.y(tqwVar6));
                    }
                    dbj0 dbj0Var = (dbj0) cbj0Var;
                    paj0Var3.h(dbj0Var.c, dbj0Var.b, messageResponseToken3, dbj0Var.a);
                } else if (cbj0Var instanceof abj0) {
                    if (tqwVar6 != null) {
                        ((abj0) cbj0Var).c.putSerializable("UBI_INTERACTION_LOGGING_RESULT", n3o1.y(tqwVar6));
                    }
                    abj0 abj0Var = (abj0) cbj0Var;
                    paj0Var3.h(abj0Var.c, abj0Var.b, messageResponseToken3, abj0Var.a);
                } else {
                    if (!(cbj0Var instanceof bbj0)) {
                        eg.o();
                        return null;
                    }
                    paj0Var3.c(messageResponseToken3);
                }
                return rih1Var;
            case 7:
                hbj0 hbj0Var = (kbj0) obj2;
                tqw tqwVar7 = (tqw) obj3;
                paj0 paj0Var4 = (paj0) ((ldo) obj4).c;
                MessageResponseToken messageResponseToken4 = ((lbj0) obj).a;
                if (hbj0Var instanceof hbj0) {
                    if (tqwVar7 != null) {
                        hbj0Var.c.putSerializable("UBI_INTERACTION_LOGGING_RESULT", n3o1.y(tqwVar7));
                    }
                    hbj0 hbj0Var2 = hbj0Var;
                    paj0Var4.h(hbj0Var2.c, hbj0Var2.b, messageResponseToken4, hbj0Var2.a);
                } else if (hbj0Var instanceof ibj0) {
                    paj0Var4.f(messageResponseToken4, ((ibj0) hbj0Var).a);
                } else {
                    if (!(hbj0Var instanceof jbj0)) {
                        eg.o();
                        return null;
                    }
                    paj0Var4.c(messageResponseToken4);
                }
                return rih1Var;
            case 8:
                gdj0 gdj0Var = (idj0) obj2;
                tqw tqwVar8 = (tqw) obj3;
                paj0 paj0Var5 = (paj0) ((umf0) obj4).d;
                MessageResponseToken messageResponseToken5 = ((jdj0) obj).a;
                if (gdj0Var instanceof gdj0) {
                    if (tqwVar8 != null) {
                        gdj0Var.c.putSerializable("UBI_INTERACTION_LOGGING_RESULT", n3o1.y(tqwVar8));
                    }
                    gdj0 gdj0Var2 = gdj0Var;
                    paj0Var5.h(gdj0Var2.c, gdj0Var2.b, messageResponseToken5, gdj0Var2.a);
                } else if (gdj0Var instanceof hdj0) {
                    if (tqwVar8 != null) {
                        ((hdj0) gdj0Var).c.putSerializable("UBI_INTERACTION_LOGGING_RESULT", n3o1.y(tqwVar8));
                    }
                    hdj0 hdj0Var = (hdj0) gdj0Var;
                    paj0Var5.h(hdj0Var.c, hdj0Var.b, messageResponseToken5, hdj0Var.a);
                } else if (gdj0Var instanceof edj0) {
                    if (tqwVar8 != null) {
                        ((edj0) gdj0Var).c.putSerializable("UBI_INTERACTION_LOGGING_RESULT", n3o1.y(tqwVar8));
                    }
                    edj0 edj0Var = (edj0) gdj0Var;
                    paj0Var5.h(edj0Var.c, edj0Var.b, messageResponseToken5, edj0Var.a);
                } else if (gdj0Var instanceof fdj0) {
                    paj0Var5.c(messageResponseToken5);
                } else {
                    if (!(gdj0Var instanceof ddj0)) {
                        eg.o();
                        return null;
                    }
                    paj0Var5.e();
                }
                return rih1Var;
            case 9:
                lfj0 lfj0Var = (ofj0) obj2;
                tqw tqwVar9 = (tqw) obj3;
                paj0 paj0Var6 = (paj0) ((qj0) obj4).e;
                MessageResponseToken messageResponseToken6 = ((pfj0) obj).a;
                if (lfj0Var instanceof lfj0) {
                    if (tqwVar9 != null) {
                        lfj0Var.c.putSerializable("UBI_INTERACTION_LOGGING_RESULT", n3o1.y(tqwVar9));
                    }
                    lfj0 lfj0Var2 = lfj0Var;
                    paj0Var6.h(lfj0Var2.c, lfj0Var2.b, messageResponseToken6, lfj0Var2.a);
                } else if (lfj0Var instanceof mfj0) {
                    paj0Var6.f(messageResponseToken6, ((mfj0) lfj0Var).a);
                } else {
                    if (!(lfj0Var instanceof nfj0)) {
                        eg.o();
                        return null;
                    }
                    paj0Var6.c(messageResponseToken6);
                }
                return rih1Var;
            case 10:
                wfj0 wfj0Var = (yfj0) obj2;
                tqw tqwVar10 = (tqw) obj3;
                paj0 paj0Var7 = (paj0) ((ldo) obj4).c;
                MessageResponseToken messageResponseToken7 = ((zfj0) obj).a;
                if (wfj0Var instanceof wfj0) {
                    if (tqwVar10 != null) {
                        wfj0Var.c.putSerializable("UBI_INTERACTION_LOGGING_RESULT", n3o1.y(tqwVar10));
                    }
                    wfj0 wfj0Var2 = wfj0Var;
                    paj0Var7.h(wfj0Var2.c, wfj0Var2.b, messageResponseToken7, wfj0Var2.a);
                } else {
                    if (!(wfj0Var instanceof xfj0)) {
                        eg.o();
                        return null;
                    }
                    paj0Var7.c(messageResponseToken7);
                }
                return rih1Var;
            case 11:
                ((Number) obj3).intValue();
                uwo1.e(((fom0) obj4).b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (b0k) obj2, 0, 0, 2046);
                return rih1Var;
            case 12:
                ((Number) obj3).intValue();
                uwo1.e(((nom0) obj4).b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, new cjc0(2), 0, (qx8) null, (b0k) obj2, 0, 0, 1790);
                return rih1Var;
            case 13:
                i3n0 i3n0Var = (i3n0) obj2;
                tqw tqwVar11 = (tqw) obj3;
                String str3 = i3n0Var.a;
                tv80 tv80VarY3 = tqwVar11 != null ? n3o1.y(tqwVar11) : null;
                ((na9) obj4).b.i(new dwn0(str3, "", false, false, 0, 0, false, (a690) null, (Bundle) null, tv80VarY3 != null ? new bwn0(tv80VarY3) : null), mno1.h(new mmr0[]{new mmr0("music_guesser_playlist_uri", i3n0Var.b)}));
                return rih1Var;
            case 14:
                gbq0 gbq0Var = (gbq0) obj;
                tqw tqwVar12 = (tqw) obj3;
                ft30 ft30Var3 = (ft30) ((br0) obj4).c;
                if (jds.a[((fbq0) obj2).ordinal()] == 1) {
                    ft30Var3.invoke(new lq3(gbq0Var.a, cvl1.d(tqwVar12)));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 15:
                ggq0 ggq0Var = (ggq0) obj;
                tqw tqwVar13 = (tqw) obj3;
                ft30 ft30Var4 = (ft30) ((umf0) obj4).e;
                if (sds.a[((fgq0) obj2).ordinal()] == 1) {
                    ft30Var4.invoke(new lq3(ggq0Var.a, cvl1.d(tqwVar13)));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 16:
                ((Number) obj3).intValue();
                zw51 zw51Var = (zw51) obj4;
                x340 x340Var = (b0k) obj2;
                Object objT = x340Var.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = mls.b;
                    x340Var.s0(objT);
                }
                iu30 iu30Var = (iu30) objT;
                boolean zE = x340Var.e(zw51Var.ordinal());
                Object objT2 = x340Var.T();
                if (zE || objT2 == m4cVar) {
                    objT2 = new vas(zw51Var, (byte) 11);
                    x340Var.s0(objT2);
                }
                dm5.a(iu30Var, (qim0) null, (iu30) objT2, x340Var, 6, 2);
                return rih1Var;
            case 17:
                x340 x340Var2 = (b0k) obj2;
                ((Number) obj3).intValue();
                xq41 xq41Var = (xq41) obj4;
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
                x340 x340Var3 = x340Var2;
                int iHashCode = Long.hashCode(x340Var3.T);
                xos0 xos0VarM = x340Var3.m();
                nim0 nim0Var = nim0.a;
                qim0 qim0VarE = zr7.E(x340Var2, nim0Var);
                hzj.A.getClass();
                x340 x340Var4 = x340Var2;
                if (x340Var4.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var4.m0();
                if (x340Var4.S) {
                    x340Var4.l(hmb0.t1);
                } else {
                    x340Var4.v0();
                }
                nko1.H(mbhVarA, x340Var2, y580.O0);
                nko1.H(xos0VarM, x340Var2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                nko1.F(x340Var2);
                nko1.H(qim0VarE, x340Var2, y580.Y);
                t8p1.c(0, xq41Var.d, xq41Var.a, x340Var2, (qim0) null);
                t8p1.b(0, xq41Var.b, xq41Var.c, x340Var2, uyn1.y(nim0Var, 16.0f, 20.0f));
                x340Var4.r(true);
                return rih1Var;
            case 18:
                d451 d451Var = (d451) obj2;
                iu30 iu30Var2 = ((kns) obj4).b;
                if (d451Var.equals(a451.a)) {
                    iu30Var2.invoke(zo3.a);
                } else if (!d451Var.equals(b451.a)) {
                    if (!(d451Var instanceof c451)) {
                        eg.o();
                        return null;
                    }
                    iu30Var2.invoke(new rq3(((c451) d451Var).a));
                }
                return rih1Var;
            case 19:
                ((fqs) obj4).a.invoke(((s591) obj2).a);
                return rih1Var;
            case 20:
                ((vrs) obj4).a.invoke(((fia1) obj2).a);
                return rih1Var;
            case 21:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                switch (((gia1) obj4).b.ordinal()) {
                    case 0:
                        i = 2131964153;
                        break;
                    case 1:
                        i = 2131964154;
                        break;
                    case 2:
                        i = 2131964155;
                        break;
                    case 3:
                        i = 2131964156;
                        break;
                    case 4:
                        i = 2131964157;
                        break;
                    case 5:
                        i = 2131964161;
                        break;
                    case 6:
                        i = 2131964158;
                        break;
                    case 7:
                        i = 2131964160;
                        break;
                    case 8:
                        i = 2131964159;
                        break;
                    case 9:
                        i = 2131964162;
                        break;
                    default:
                        eg.o();
                        return null;
                }
                uwo1.e(cwl1.o0(b0kVar, i), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, b0kVar, 0, 0, 1790);
                return rih1Var;
            case 22:
                zia1 zia1Var = (zia1) obj;
                tqw tqwVar14 = (tqw) obj3;
                ft30 ft30Var5 = ((dtr) obj4).b;
                int iOrdinal2 = ((yia1) obj2).ordinal();
                if (iOrdinal2 == 0) {
                    ft30Var5.invoke(br3.a);
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        eg.o();
                        return null;
                    }
                    ft30Var5.invoke(lp3.a);
                } else if (!zia1Var.d) {
                    ft30Var5.invoke(qp3.a);
                } else if (tqwVar14 != null) {
                    ft30Var5.invoke(new wp3(n3o1.y(tqwVar14)));
                }
                return rih1Var;
            case 23:
                rwk1 rwk1Var = (rwk1) obj;
                tqw tqwVar15 = (tqw) obj3;
                if (rwk1Var instanceof nwk1) {
                    ldo ldoVar = (ldo) obj4;
                    nwk1 nwk1Var = (nwk1) rwk1Var;
                    String str4 = nwk1Var.b.d;
                    String str5 = nwk1Var.e;
                    if (str4 != null && !ihc1.y0(str4)) {
                        tv80 tv80VarY4 = tqwVar15 != null ? n3o1.y(tqwVar15) : null;
                        dwn0 dwn0Var = new dwn0(str4, "", false, false, 0, 0, false, (a690) null, (Bundle) null, tv80VarY4 != null ? new bwn0(tv80VarY4) : null);
                        Bundle bundle = new Bundle();
                        if (!ihc1.y0(str5)) {
                            bundle.putString("voting-playlist-uri", str5);
                        }
                        ((lzn0) ldoVar.c).i(dwn0Var, bundle);
                    }
                } else if (!(rwk1Var instanceof owk1)) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case 24:
                boolean z = ((utm1) obj2).a;
                x0t x0tVar = (x0t) obj4;
                nix nixVar = ((vtm1) obj).a;
                if (nixVar instanceof nix) {
                    lixVar = z ? new jix(nixVar) : new iix(nixVar);
                } else {
                    if (!(nixVar instanceof oix)) {
                        eg.o();
                        return null;
                    }
                    lixVar = z ? new lix((oix) nixVar) : new kix((oix) nixVar);
                }
                vas vasVar = x0tVar.a;
                if (lixVar.equals(gix.a)) {
                    vasVar.invoke(np3Var);
                } else if (!lixVar.equals(hix.a)) {
                    if (lixVar instanceof iix) {
                        vasVar.invoke(x0t.e(x0t.f(((iix) lixVar).a), false));
                    } else if (lixVar instanceof jix) {
                        vasVar.invoke(x0t.e(x0t.f(lixVar.a), true));
                    } else if (lixVar instanceof kix) {
                        vasVar.invoke(x0t.e(x0t.f(((kix) lixVar).a), false));
                    } else {
                        if (!(lixVar instanceof lix)) {
                            eg.o();
                            return null;
                        }
                        vasVar.invoke(x0t.e(x0t.f(((lix) lixVar).a), true));
                    }
                }
                return rih1Var;
            case 25:
                ytm1 ytm1Var = (ytm1) obj2;
                tqw tqwVar16 = (tqw) obj3;
                iu30 iu30Var3 = ((y0t) obj4).c;
                if (ytm1Var instanceof wtm1) {
                    iu30Var3.invoke(np3Var);
                } else {
                    if (!(ytm1Var instanceof xtm1)) {
                        eg.o();
                        return null;
                    }
                    if (tqwVar16 != null) {
                        iu30Var3.invoke(new zq3(n3o1.y(tqwVar16)));
                    }
                }
                return rih1Var;
            case 26:
                tqw tqwVar17 = (tqw) obj3;
                h1t h1tVar = (h1t) obj4;
                iu30 iu30Var4 = h1tVar.f;
                int iOrdinal3 = ((mvm1) obj2).ordinal();
                if (iOrdinal3 != 0) {
                    if (iOrdinal3 == 1) {
                        yo3Var = rp3.a;
                    } else if (iOrdinal3 != 2) {
                        if (iOrdinal3 != 3) {
                            if (iOrdinal3 != 4) {
                                if (iOrdinal3 != 5) {
                                    eg.o();
                                    return null;
                                }
                                if (tqwVar17 != null) {
                                    yo3Var = new kp3(n3o1.y(tqwVar17));
                                }
                            } else if (tqwVar17 != null) {
                                yo3Var = new pq3(n3o1.y(tqwVar17));
                            }
                        } else if (tqwVar17 != null) {
                            yo3Var = new sq3(n3o1.y(tqwVar17));
                        }
                    } else if (tqwVar17 != null) {
                        yo3Var = new gp3(n3o1.y(tqwVar17));
                    }
                    iu30Var4.invoke(yo3Var);
                } else if (tqwVar17 != null) {
                    yo3Var = new yo3((String) h1tVar.g.getValue(), n3o1.y(tqwVar17));
                    iu30Var4.invoke(yo3Var);
                }
                return rih1Var;
            case 27:
                j6t j6tVar = (j6t) obj;
                tqw tqwVar18 = (tqw) obj3;
                if (!((i6t) obj2).equals(i6t.a)) {
                    eg.o();
                    return null;
                }
                vu30 vu30Var = ((k6t) obj4).a;
                String str6 = j6tVar.a;
                if (tqwVar18 != null && (ou80Var = n3o1.y(tqwVar18).a) != null) {
                    str = ou80Var.a;
                }
                vu30Var.invoke(str6, str);
                return rih1Var;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                j8t j8tVar = (j8t) obj;
                ((Number) obj3).intValue();
                x340 x340Var5 = (b0k) obj2;
                tbr0 tbr0VarC = ((cir0) x340Var5.k(k2r0.a)).c();
                e8t e8tVar = (e8t) obj4;
                Object objT3 = x340Var5.T();
                if (objT3 == fkj0.X) {
                    objT3 = new j7t(e8tVar.c, tbr0VarC);
                    x340Var5.s0(objT3);
                }
                otw.c((j7t) objT3, new i7t(e8tVar.b.a, j8tVar.a, j8tVar.b), (qim0) null, (ipb1) null, x340Var5, 0, 12);
                return rih1Var;
            default:
                kat katVar = (kat) obj;
                x340 x340Var6 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var6.g(katVar) ? 4 : 2;
                }
                x340 x340Var7 = x340Var6;
                if (x340Var7.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    tgp1.c(((lat) obj4).d, katVar, (qim0) null, x340Var7, (iIntValue << 3) & 112);
                } else {
                    x340Var7.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1s(Object obj, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
    }
}
