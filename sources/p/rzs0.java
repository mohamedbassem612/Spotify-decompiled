package p;

import com.google.protobuf.Empty;
import com.spotify.adsinternal.adscore.model.Format;
import com.spotify.checkout.proto.model.v1.proto.GetSpotifyCheckoutPageResponse;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;
import com.spotify.nowplayingmodes.adsmode.data.AdsModeModel;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rzs0 implements vzs0, Function, BiFunction, xkb, Predicate, Function3 {
    public static volatile v1k T0;
    public final /* synthetic */ byte a;
    public static final rzs0 b = new rzs0(0);
    public static final rzs0 c = new rzs0(1);
    public static final rzs0 d = new rzs0(2);
    public static final rzs0 e = new rzs0(3);
    public static final rzs0 f = new rzs0(5);
    public static final eg5 g = new eg5();
    public static final rzs0 h = new rzs0(7);
    public static final rzs0 i = new rzs0(8);
    public static final rzs0 t = new rzs0(9);
    public static final rzs0 X = new rzs0(10);
    public static final rzs0 Y = new rzs0(11);
    public static final rzs0 Z = new rzs0(12);
    public static final rzs0 N0 = new rzs0(13);
    public static final rzs0 O0 = new rzs0(14);
    public static final rzs0 P0 = new rzs0(15);
    public static final rzs0 Q0 = new rzs0(16);
    public static final rzs0 R0 = new rzs0(17);
    public static final rzs0 S0 = new rzs0(18);
    public static final rzs0 U0 = new rzs0(19);
    public static final rzs0 V0 = new rzs0(20);
    public static final rzs0 W0 = new rzs0(21);
    public static final rzs0 X0 = new rzs0(22);
    public static final rzs0 Y0 = new rzs0(23);
    public static final rzs0 Z0 = new rzs0(24);
    public static final rzs0 a1 = new rzs0(25);
    public static final rzs0 b1 = new rzs0(26);
    public static final rzs0 c1 = new rzs0(27);
    public static final rzs0 d1 = new rzs0(28);
    public static final rzs0 e1 = new rzs0(29);

    public /* synthetic */ rzs0(byte b2) {
        this.a = b2;
    }

    public static mmr0 c(s33 s33Var, String str, bwi0 bwi0Var) {
        jqf1 hqf1Var;
        ArrayList<awi0> arrayList = bwi0Var.c;
        String str2 = bwi0Var.a;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        for (awi0 awi0Var : arrayList) {
            if (awi0Var instanceof yvi0) {
                yvi0 yvi0Var = (yvi0) awi0Var;
                hqf1Var = new fqf1(yvi0Var.a, yvi0Var.b, yvi0Var.c, yvi0Var.d, new dqf1(yvi0Var.e));
            } else {
                if (!(awi0Var instanceof zvi0)) {
                    eg.o();
                    return null;
                }
                hqf1Var = new hqf1(((zvi0) awi0Var).a);
            }
            arrayList2.add(hqf1Var);
        }
        lqf1 lqf1Var = s33Var.c;
        ArrayList arrayListN0 = o7h.N0(arrayList2, lqf1Var != null ? lqf1Var.c : z6x.a);
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayListN0) {
            if (hashSet.add(((jqf1) obj).a())) {
                arrayList3.add(obj);
            }
        }
        lqf1 lqf1Var2 = new lqf1(str2, arrayList3);
        ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            arrayList4.add(((jqf1) it.next()).a());
        }
        return new mmr0(Collections.singleton(new k23(new axu0(s33Var.e.getSessionId(), arrayList4, str2, str, bwi0Var.b, s33Var.a))), lqf1Var2);
    }

    public static mka1 e(hyc hycVar) {
        while (hycVar instanceof jyc) {
            jyc jycVar = (jyc) hycVar;
            if (jycVar.getKind() != 2) {
                break;
            }
            hycVar = (jyc) o7h.W0(jycVar.l());
            if (hycVar == null) {
                return null;
            }
        }
        return hycVar.getSource();
    }

    public boolean a(n9r n9rVar, n9r n9rVar2, boolean z) {
        if ((n9rVar instanceof beg) && (n9rVar2 instanceof beg)) {
            return u890.j(((beg) n9rVar).g(), ((beg) n9rVar2).g());
        }
        if ((n9rVar instanceof y0h1) && (n9rVar2 instanceof y0h1)) {
            return b((y0h1) n9rVar, (y0h1) n9rVar2, z, q5.R0);
        }
        if (!(n9rVar instanceof hyc) || !(n9rVar2 instanceof hyc)) {
            return ((n9rVar instanceof dzq0) && (n9rVar2 instanceof dzq0)) ? u890.j(((dzq0) n9rVar).f, ((dzq0) n9rVar2).f) : u890.j(n9rVar, n9rVar2);
        }
        zji0 zji0Var = (hyc) n9rVar;
        zji0 zji0Var2 = (hyc) n9rVar2;
        if (!zji0Var.equals(zji0Var2)) {
            if (u890.j(zji0Var.getName(), zji0Var2.getName()) && ((!(zji0Var instanceof zji0) || !(zji0Var2 instanceof zji0) || zji0Var.Z() == zji0Var2.Z()) && ((!u890.j(zji0Var.k(), zji0Var2.k()) || (z && u890.j(e(zji0Var), e(zji0Var2)))) && !iht.m(zji0Var) && !iht.m(zji0Var2)))) {
                n9r n9rVarK = zji0Var.k();
                n9r n9rVarK2 = zji0Var2.k();
                if (((n9rVarK instanceof jyc) || (n9rVarK2 instanceof jyc)) ? false : a(n9rVarK, n9rVarK2, z)) {
                    exq0 exq0Var = new exq0(new oi(z, zji0Var, zji0Var2, (byte) 12));
                    if (exq0Var.m(zji0Var, zji0Var2, (beg) null, true).b() != 1 || exq0Var.m(zji0Var2, zji0Var, (beg) null, true).b() != 1) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public Object apply(Object obj) {
        String str;
        int i2;
        t7d1 t7d1Var;
        AdsModeModel.Format format;
        Long lD0;
        switch (this.a) {
            case 1:
                return zo.a;
            case 3:
                yvg1 yvg1Var = (yvg1) obj;
                ji0 ji0Var = (ji0) yvg1Var.a;
                PlayerState playerState = (PlayerState) yvg1Var.b;
                b380 b380Var = (b380) yvg1Var.c;
                ContextTrack contextTrack = (ContextTrack) playerState.track().b();
                Restrictions restrictions = playerState.restrictions();
                b380Var.getClass();
                Format format2 = ji0Var.Z;
                String str2 = (String) contextTrack.metadata().get("duration");
                long jLongValue = (str2 == null || (lD0 = nhc1.d0(10, str2)) == null) ? 0L : lD0.longValue();
                String str3 = (String) contextTrack.metadata().get("advertiser");
                if (str3 == null) {
                    str3 = "";
                    str = str3;
                } else {
                    str = "";
                }
                String str4 = ji0Var.i;
                String str5 = ji0Var.S0;
                if (str5 == null) {
                    str5 = str;
                }
                String str6 = ji0Var.T0;
                if (str6 == null) {
                    str6 = str;
                }
                String strR = ila0.r(ji0Var.g.a);
                if (strR == null) {
                    strR = str;
                }
                String str7 = ji0Var.U0;
                if (str7 == null) {
                    str7 = str;
                }
                String str8 = ji0Var.e;
                String str9 = ji0Var.h;
                String str10 = ji0Var.a;
                String str11 = ji0Var.t;
                int iK = sap1.k(b380Var);
                int iC = l1d.C(sap1.k(b380Var));
                if (iC == 0) {
                    i2 = 2131961427;
                } else {
                    if (iC != 1) {
                        eg.o();
                        return null;
                    }
                    i2 = 2131961428;
                }
                s4d1 s4d1VarK = l2p1.k(ji0Var);
                if (s4d1VarK != null) {
                    s7d1 s7d1Var = s4d1VarK.b;
                    t7d1Var = new t7d1(s7d1Var.a, s7d1Var.b);
                } else {
                    t7d1Var = null;
                }
                ti tiVarF = sap1.f(contextTrack, new x6d1(ji0Var, i2, false, t7d1Var));
                String str12 = ji0Var.R0;
                if (str12 == null) {
                    str12 = str;
                }
                x031 x031Var = restrictions.disallowSeekingReasons().isEmpty() ? x031.a : w031.a;
                n860 n860VarH = sap1.h(contextTrack);
                int i3 = ji0Var.Z0 ? 1 : 2;
                Format format3 = Format.VIDEO;
                if (format2 == format3 && y3o1.e0(contextTrack)) {
                    format = AdsModeModel.Format.VIDEO_AD_VERTICAL;
                } else {
                    format = format2 == format3 ? AdsModeModel.Format.VIDEO_AD_HORIZONTAL : AdsModeModel.Format.AUDIO_AD;
                }
                return new l62(jLongValue, str3, str4, str5, str6, strR, str7, str8, str9, str10, str11, iK, tiVarF, str12, x031Var, n860VarH, i3, format, l4o1.Q(contextTrack) ? AdsModeModel.Product.PODCAST : AdsModeModel.Product.MUSIC, ji0Var.N0, (u890.j(ji0Var.W0, "sponsored_playlist") && u890.j(ji0Var.Y0, jx0.b)) ? bw0.a : pzs0.d, contextTrack.uri());
            case 5:
                return Boolean.valueOf(((fg4) obj).a);
            case 8:
                return ((bf90) obj).a ? qmb.a : tmb.a;
            case 9:
                return Boolean.valueOf(!((dma1) obj).h(kt8.f, false));
            case 10:
                return Boolean.valueOf(((fkb) obj) == fkb.c);
            case 11:
                lta ltaVar = (Throwable) obj;
                return ltaVar instanceof lta ? Single.just(ltaVar.a) : Single.error(ltaVar);
            case 13:
                return (bmc) obj;
            case 15:
                return new k1h(((Integer) obj).intValue());
            case 19:
                return ((Completable) obj).w().onErrorResumeNext(qzs0.U0);
            case 22:
                return ((th61) obj).a;
            case 25:
                byte[] bArr = (byte[]) obj;
                try {
                    return Empty.q(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 26:
                return new zxz((GetSpotifyCheckoutPageResponse) obj);
            default:
                String str13 = (String) obj;
                str13.getClass();
                return new mef0(str13);
        }
    }

    public boolean b(y0h1 y0h1Var, y0h1 y0h1Var2, boolean z, vu30 vu30Var) {
        if (y0h1Var.equals(y0h1Var2)) {
            return true;
        }
        if (u890.j(y0h1Var.k(), y0h1Var2.k())) {
            return false;
        }
        n9r n9rVarK = y0h1Var.k();
        n9r n9rVarK2 = y0h1Var2.k();
        return (((n9rVarK instanceof jyc) || (n9rVarK2 instanceof jyc)) ? ((Boolean) vu30Var.invoke(n9rVarK, n9rVarK2)).booleanValue() : a(n9rVarK, n9rVarK2, z)) && y0h1Var.getIndex() == y0h1Var2.getIndex();
    }

    public i5m d(ozp ozpVar, s05 s05Var) {
        if (!s05Var.b()) {
            return null;
        }
        daq daqVar = ozpVar.a;
        teq teqVar = ozpVar.b;
        v1k v1kVar = T0;
        if (v1kVar == null) {
            synchronized (this) {
                v1kVar = T0;
                if (v1kVar == null) {
                    v1kVar = new v1k(new y48(new CosmosTransport(new sn0((RxRouter) daqVar.G1.get(), (byte) 12))));
                    T0 = v1kVar;
                }
            }
        }
        mr20 mr20Var = (mr20) daqVar.u5.get();
        kt91 kt91Var = (kt91) daqVar.f8.get();
        ruz ruzVarA = ((t8u0) daqVar.d9.get()).a(((f0i) ((dg30) teqVar.f.a)).a).a();
        int iA = s05Var.a();
        Integer numValueOf = Integer.valueOf(iA);
        if (iA < 0) {
            numValueOf = null;
        }
        return new i5m(v1kVar, mr20Var, kt91Var, ruzVarA, numValueOf != null ? Long.valueOf(((long) numValueOf.intValue()) * 1000) : null);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0058  */
    /* JADX WARN: Code duplicated, block: B:25:0x0064  */
    /* JADX WARN: Code duplicated, block: B:28:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x007b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:? A[LOOP:1: B:26:0x0068->B:38:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v4 java.lang.Object, still in use, count: 2, list:
          (r0v4 java.lang.Object) from 0x0037: PHI (r0 I:??) = (r0v1 java.lang.Object), (r0v4 java.lang.Object) binds: [B:12:0x0036, B:34:0x0037] A[DONT_GENERATE, DONT_INLINE]
          (r0v4 java.lang.Object) from 0x002d: CHECK_CAST (p.l0l) (r0v4 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public java.lang.Object n(java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
        /*
            r3 = this;
            byte r3 = r3.a
            switch(r3) {
                case 17: goto L15;
                default: goto L5;
            }
        L5:
            java.util.List r4 = (java.util.List) r4
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            java.util.List r6 = (java.util.List) r6
            p.qhm0 r3 = new p.qhm0
            boolean r5 = r5.booleanValue()
            r3.<init>(r4, r6, r5)
            return r3
        L15:
            p.spq0 r4 = (p.spq0) r4
            p.spq0 r5 = (p.spq0) r5
            java.util.List r6 = (java.util.List) r6
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r3 = r6.iterator()
        L21:
            boolean r0 = r3.hasNext()
            r1 = 0
            if (r0 == 0) goto L36
            java.lang.Object r0 = r3.next()
            r2 = r0
            p.l0l r2 = (p.l0l) r2
            boolean r2 = r2.f()
            if (r2 == 0) goto L21
            goto L37
        L36:
            r0 = r1
        L37:
            p.spq0 r3 = p.spq0.a(r0)
            boolean r0 = r3.c()
            if (r0 == 0) goto L42
            goto L80
        L42:
            java.lang.Object r3 = r4.h()
            p.l0l r3 = (p.l0l) r3
            java.lang.Object r4 = r5.h()
            p.l0l r4 = (p.l0l) r4
            if (r3 == 0) goto L58
            if (r4 == 0) goto L59
            boolean r5 = r3.l()
            if (r5 == 0) goto L59
        L58:
            r3 = r4
        L59:
            p.spq0 r3 = p.spq0.a(r3)
            boolean r4 = r3.c()
            if (r4 == 0) goto L64
            goto L80
        L64:
            java.util.Iterator r3 = r6.iterator()
        L68:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L7c
            java.lang.Object r4 = r3.next()
            r5 = r4
            p.l0l r5 = (p.l0l) r5
            boolean r5 = r5.l()
            if (r5 == 0) goto L68
            r1 = r4
        L7c:
            p.spq0 r3 = p.spq0.a(r1)
        L80:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p.rzs0.n(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 16:
                return ((th61) obj).a.length() > 0;
            case 21:
                return ((spq0) obj).c();
            case 23:
                return ((spq0) obj).c();
            default:
                wv00 wv00Var = (uv00) obj;
                return wv00Var.c() || !wv00Var.f;
        }
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 2:
                return new mmr0((String) obj, (Restrictions) obj2);
            default:
                return new x810(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
        }
    }
}
