package p;

import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import com.spotify.encore.image.EncoreImageView;
import com.spotify.mobius.EventSource;
import com.spotify.mobius.First;
import com.spotify.mobius.MergedEventSource;
import com.spotify.mobius.Next;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.nowplaying.scroll.ScrollCardType;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hzw extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hzw(i7d i7dVar, if00 if00Var, int i) {
        super(2);
        this.a = (byte) 19;
        this.b = i7dVar;
    }

    /* JADX WARN: Code duplicated, block: B:367:0x0c53  */
    /* JADX WARN: Code duplicated, block: B:368:0x0c59  */
    /* JADX WARN: Code duplicated, block: B:370:0x0c5d  */
    /* JADX WARN: Code duplicated, block: B:372:0x0c60 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:373:0x0c62  */
    /* JADX WARN: Code duplicated, block: B:374:0x0c65  */
    /* JADX WARN: Code duplicated, block: B:377:0x0c6c  */
    /* JADX WARN: Code duplicated, block: B:378:0x0c6e  */
    /* JADX WARN: Code duplicated, block: B:380:0x0c74  */
    /* JADX WARN: Code duplicated, block: B:386:0x0c83  */
    /* JADX WARN: Code duplicated, block: B:389:0x0cc3  */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v32 */
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        ji0 ji0Var;
        String str;
        String str2;
        boolean zEquals;
        ad80 ad80Var;
        boolean z3;
        Long lValueOf;
        String str3;
        String str4;
        String string;
        boolean z4;
        goj0 goj0VarA;
        vn71 vn71Var;
        ?? r8;
        lee1 lee1Var;
        byte b = this.a;
        h2c h2cVar = h2c.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                qey0 qey0Var = (qey0) obj;
                ad80 ad80Var2 = (g0x) obj2;
                pzw pzwVar = (pzw) obj3;
                q1x q1xVar = ((z1x) pzwVar.X).p;
                if (q1xVar != null) {
                    z = true;
                    if (!q1xVar.b || (ad80Var2 instanceof dih1)) {
                    }
                    f0x f0xVar = (f0x) pzwVar.h;
                    z2 = ad80Var2 instanceof ad80;
                    if (z2) {
                        ji0Var = ad80Var2.a;
                    } else {
                        if (ad80Var2 instanceof dih1) {
                            eg.o();
                            return null;
                        }
                        ji0Var = null;
                    }
                    if (z2) {
                        if (ji0Var != null) {
                            str = ji0Var.a;
                        } else {
                            str = null;
                        }
                        str2 = qey0Var.a.a;
                        if (str == null) {
                            zEquals = false;
                        } else {
                            zEquals = str.equals(str2);
                        }
                        if (zEquals) {
                            ad80Var = ad80Var2;
                            if (ad80Var.i && ad80Var.n) {
                                z3 = false;
                            } else {
                                z3 = z;
                            }
                            First firstB = First.b(ad80.f(ad80Var, (LinkedHashSet) null, (Object) null, z3, 0L, (e441) null, false, 16127));
                            mmr0 mmr0VarB = f0x.b(ad80Var2, (g0x) firstB.d(), firstB.a());
                            return First.c(mmr0VarB.a, (Set) mmr0VarB.b);
                        }
                    }
                    Next nextC = f0xVar.c(qey0Var, ad80Var2);
                    return First.c(nextC.g(), nextC.b());
                }
                z = true;
                d1x.b((d1x) pzwVar.t, 1, qey0Var.a, (Map) null, (String) null, 12);
                f0x f0xVar2 = (f0x) pzwVar.h;
                z2 = ad80Var2 instanceof ad80;
                if (z2) {
                    ji0Var = ad80Var2.a;
                } else {
                    if (ad80Var2 instanceof dih1) {
                        eg.o();
                        return null;
                    }
                    ji0Var = null;
                }
                if (z2) {
                    if (ji0Var != null) {
                        str = ji0Var.a;
                    } else {
                        str = null;
                    }
                    str2 = qey0Var.a.a;
                    if (str == null) {
                        zEquals = false;
                    } else {
                        zEquals = str.equals(str2);
                    }
                    if (zEquals) {
                        ad80Var = ad80Var2;
                        if (ad80Var.i) {
                            z3 = z;
                        } else {
                            z3 = z;
                        }
                        First firstB2 = First.b(ad80.f(ad80Var, (LinkedHashSet) null, (Object) null, z3, 0L, (e441) null, false, 16127));
                        mmr0 mmr0VarB2 = f0x.b(ad80Var2, (g0x) firstB2.d(), firstB2.a());
                        return First.c(mmr0VarB2.a, (Set) mmr0VarB2.b);
                    }
                }
                Next nextC2 = f0xVar2.c(qey0Var, ad80Var2);
                return First.c(nextC2.g(), nextC2.b());
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                ad80 ad80Var3 = (g0x) obj3;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ad80 ad80Var4 = ad80Var3;
                    if (ad80Var4.j) {
                        x340Var2.i0(2076898014);
                        oho1.d((qim0) null, x340Var2, 0);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(2076977343);
                        qim0 qim0VarA = h2cVar.a(nim0Var, een.h);
                        String str5 = ad80Var4.b;
                        vgo1.a(str5 != null ? Uri.parse(str5) : null, qim0VarA, x340Var2, 0);
                        x340Var2.r(false);
                    }
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    uwo1.e(((r9x) obj3).b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var4, 0, 0, 2046);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 3:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    cwl1.d(0, 58, 0L, een.h, x340Var6, (xu30) obj3, (qim0) null, (lee1) null);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    uwo1.e(((ygx) obj3).a, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var8, 0, 0, 2046);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 5:
                qim0 qim0Var = (qim0) obj;
                float f = ((p3v) obj2).a;
                ecx ecxVar = (ecx) obj3;
                if (ecxVar != null) {
                    float f2 = ecxVar.a;
                    if (f2 != 1.0f) {
                        return f2 > 1.0f ? u291.v(qim0Var, f) : u291.h(qim0Var, f);
                    }
                }
                return u291.r(qim0Var, f);
            case 6:
                ((Number) obj2).intValue();
                ((EncoreImageView) obj3).a((b0k) obj, czo1.p(1));
                return rih1Var;
            case 7:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    irn1.u((qim0) null, emi.a, (vu30) null, (erl1) null, apo.r(-608064608, new o8x((d9y) obj3, (byte) 4), x340Var10), x340Var10, 24624, 13);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 8:
                u9y u9yVar = (u9y) obj2;
                v9y v9yVar = (v9y) jhc1.t((Bundle) obj, "enhanced-share-card-element-state-key", v9y.class);
                return v9yVar == null ? ((z9y) obj3).f(u9yVar) : v9yVar;
            case 9:
                j3z j3zVar = (j3z) obj3;
                return new jpg0(j3zVar.b.a(new hyn(2, 3, 12, false, false), j3zVar.d, new epb1((zob1) obj)), lyy.O0);
            case 10:
                sve0 sve0Var = (sve0) obj;
                wto wtoVar = (wto) obj2;
                mxr mxrVar = ((c7z) obj3).f;
                n3z n3zVar = (n3z) wtoVar.e;
                String str6 = n3zVar.a;
                kr60 kr60Var = (kr60) mxrVar.a;
                qns0 qns0Var = (qns0) kr60Var.b;
                sve0Var.b(tb2.class, new fe2(RxEventSources.a(new ObservableSource[]{yoi1.i(qns0Var.c(), qns0Var.a).map(pbo1.d).startWithItem(rih1Var).switchMap(new gid(kr60Var, str6, (byte) 21))}), (byte) 0));
                sve0Var.a(tb2.class, gb2.class, rih1.class, new tb2((Integer) null, false), new ob2((byte) 0));
                jc9 jc9Var = (jc9) mxrVar.b;
                whx0 whx0Var = new whx0(b7x.a);
                ull ullVar = new ull(jc9Var);
                EventSource eventSourceA = RxEventSources.a(new ObservableSource[]{Observable.just(str6).map(vap1.Q0)});
                sve0Var.a(whx0.class, ahx0.class, kgx0.class, whx0Var, ullVar);
                sve0Var.b(whx0.class, new fe2(eventSourceA, (byte) 1));
                ouz ouzVar = (ouz) mxrVar.c;
                p4g p4gVar = new p4g(n3zVar.f);
                ob2 ob2Var = new ob2((byte) 8);
                acl aclVar = new acl((iir) ouzVar.b, str6);
                sve0Var.a(p4g.class, n4g.class, rih1.class, p4gVar, ob2Var);
                sve0Var.b(p4g.class, new ku1(aclVar, (byte) 14));
                ytp0 ytp0Var = (ytp0) mxrVar.d;
                String str7 = n3zVar.a;
                boolean z5 = n3zVar.g;
                vto vtoVar = wtoVar.c;
                String str8 = vtoVar != null ? vtoVar.a : "";
                String str9 = (vtoVar == null || (str4 = vtoVar.b) == null || (string = ihc1.e1(str4).toString()) == null) ? "" : string;
                uto utoVar = (uto) o7h.s0(wtoVar.b);
                String str10 = (utoVar == null || (str3 = utoVar.b) == null) ? "" : str3;
                String str11 = wtoVar.f.a;
                r4z r4zVar = new r4z(z5, str7, str8, str9, str10, str11 == null ? "" : str11, str11, n3zVar.i, n3zVar.h, n3zVar.b == 2);
                int i = (int) n3zVar.d;
                p1p1 p1p1VarM = cpn1.m(false, z5, r4zVar);
                ytw0 ytw0Var = jfv.b;
                ngv ngvVar = ngv.e;
                long jH = jfv.h(fdg1.k0(i, ngvVar));
                jar0 jar0Var = (jar0) ytp0Var.b;
                gw8 gw8Var = jar0Var.b;
                g7z g7zVar = jar0Var.a;
                String str12 = g7zVar.a;
                Bundle bundle = gw8Var.b;
                boolean zJ = u890.j(bundle != null ? bundle.getString("cwp_episode_autoplay_key") : null, str12);
                ebp1 wp21Var = xp21.c;
                if (!zJ || gw8Var.b == null) {
                    Long l = g7zVar.g;
                    Long lValueOf2 = l != null ? Long.valueOf(jfv.h(fdg1.l0(l.longValue(), ngvVar))) : null;
                    Long l2 = g7zVar.d;
                    if (l2 != null) {
                        lValueOf = Long.valueOf(jfv.h(fdg1.l0(l2.longValue(), ngvVar)));
                    } else {
                        Long l3 = g7zVar.e;
                        lValueOf = l3 != null ? l3 : null;
                    }
                    if (lValueOf2 != null) {
                        wp21Var = new vp21(lValueOf2.longValue());
                    } else if (lValueOf != null) {
                        long jLongValue = lValueOf.longValue();
                        Long l4 = g7zVar.f;
                        wp21Var = new wp21(jLongValue, l4 != null ? jfv.h(fdg1.l0(l4.longValue(), ngvVar)) : -1L);
                    }
                }
                cot0 cot0Var = new cot0(r4zVar, jH, p1p1VarM, wp21Var, false);
                ull ullVar2 = new ull(ytp0Var, r4zVar);
                gep gepVar = (gep) ytp0Var.c;
                Scheduler scheduler = (Scheduler) ((yrg0) ytp0Var.f).b;
                pxr pxrVar = (pxr) ((e7z) ((f9p) gepVar.a.c).X).h0.get();
                c8o.l(pxrVar);
                MergedEventSource mergedEventSourceB = MergedEventSource.b(new acl(str7, pxrVar, scheduler), new EventSource[]{(acl) ytp0Var.d});
                sve0Var.a(cot0.class, ljt0.class, lht0.class, cot0Var, ullVar2);
                sve0Var.b(cot0.class, new ku1(mergedEventSourceB, (byte) 26));
                return rih1Var;
            case 11:
                return t5p1.j(new p3t(((tzo) obj3).c((String) obj), (byte) 16), 3);
            case 12:
                t671 t671Var = (t671) obj;
                ioj0 ioj0Var = (ioj0) obj2;
                String str13 = t671Var.a;
                hoj0 hoj0VarC = ioj0Var.c(vn71.class, str13);
                if (hoj0VarC == null || (goj0VarA = hoj0VarC.a()) == null || (vn71Var = (vn71) goj0VarA.a) == null) {
                    z4 = ioj0Var.c(vn71.class, str13) == null && !((d771) obj3).a;
                } else {
                    z4 = !vn71Var.a.isEmpty();
                }
                return new ka10(new t671(str13, t671Var.b, t671Var.f, t671Var.c, t671Var.d, z4), true);
            case 13:
                return t5p1.j(new ld2(((kwn) obj3).a(), (String) obj, (byte) 11), 3);
            case 14:
                List list = (List) obj;
                return Boolean.valueOf((((eb8) obj3).c.isEmpty() || list == null || !(list.isEmpty() ^ true) || u890.j((Boolean) obj2, Boolean.FALSE)) ? false : true);
            case 15:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                pfz pfzVar = (pfz) obj3;
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    boolean z6 = pfzVar.c.b;
                    boolean zI = x340Var12.i(pfzVar);
                    Object objT = x340Var12.T();
                    if (zI || objT == m4cVar) {
                        objT = new ofz(pfzVar, (byte) 0);
                        x340Var12.s0(objT);
                    }
                    Function0 function0 = (Function0) objT;
                    boolean zI2 = x340Var12.i(pfzVar);
                    Object objT2 = x340Var12.T();
                    if (zI2 || objT2 == m4cVar) {
                        objT2 = new ofz(pfzVar, (byte) 1);
                        x340Var12.s0(objT2);
                    }
                    ern1.e(0, function0, (Function0) objT2, x340Var12, (qim0) null, z6);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 16:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                biz bizVar = (biz) obj3;
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    tep tepVar = bizVar.c;
                    cir0 cir0Var = (cir0) x340Var14.k(k2r0.a);
                    g1i g1iVar = (g1i) tepVar.a.c;
                    hf2 hf2Var = new hf2((uep) ((jly0) g1iVar.d).get(), (vep) ((jly0) g1iVar.e).get(), ((Boolean) ((ciz) g1iVar.b).b.get()).booleanValue(), cir0Var);
                    eiz eizVar = bizVar.b;
                    otw.c(hf2Var, new diz(eizVar.a, eizVar.c, eizVar.d, eizVar.e, eizVar.f), (qim0) null, (ipb1) null, x340Var14, 0, 12);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 17:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                vjz vjzVar = (vjz) obj3;
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    boolean zI3 = x340Var16.i(vjzVar);
                    Object objT3 = x340Var16.T();
                    if (zI3 || objT3 == fkj0.X) {
                        objT3 = new pdy(vjzVar, (byte) 18);
                        x340Var16.s0(objT3);
                    }
                    jzn1.e((Function0) objT3, x340Var16, 0);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 18:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    j2p1.i((wen0) ((xe00) obj3).c.getValue(), (qim0) null, x340Var18, 0);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                ((i7d) obj3).b((if00) null, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 20:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    String str14 = ((ci00) obj3).d;
                    uwr uwrVar = cbx.a;
                    uwo1.e(str14, (qim0) null, cbx.d(x340Var20).k, cbx.a(x340Var20).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var20, 0, 0, 2034);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                dhm0 dhm0Var = (dhm0) obj2;
                boolean z7 = ((az00) obj3).i;
                mbe0 mbe0Var = dhm0Var.O0;
                if (u890.j(mbe0Var, tbe0.a)) {
                    mbe0Var = mbe0.a;
                }
                return First.b(dhm0.a(dhm0Var, (String) null, false, false, (String) null, false, z7, false, (Set) null, (Set) null, false, (Set) null, false, mbe0Var, false, false, (List) null, (wuz) null, 2080703));
            case 22:
                le10 le10Var = (le10) obj2;
                if (((ke10) obj).b != 1) {
                    return First.b(le10Var);
                }
                je10 je10Var = le10Var.Y;
                je10 je10Var2 = ge10.a;
                if (!u890.j(je10Var, je10Var2)) {
                    je10Var2 = he10.a;
                }
                return First.c(le10.a(le10Var, (String) null, (String) null, (Integer) null, (String) null, (xd10) null, 0, (String) null, (String) null, (String) null, false, je10Var2, (List) null, 6143), Collections.singleton(new zd10(((re10) obj3).d)));
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                pf10 pf10Var = (pf10) obj3;
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    j0f0 j0f0Var = (j0f0) pf10Var.N1.getValue();
                    if (j0f0Var == null) {
                        x340Var22.i0(-1888938512);
                        x340Var22.r(false);
                    } else {
                        x340Var22.i0(-1888938511);
                        boolean zI4 = x340Var22.i(pf10Var);
                        Object objT4 = x340Var22.T();
                        if (zI4 || objT4 == fkj0.X) {
                            r8 = 0;
                            objT4 = new of10(pf10Var, (byte) 0);
                            x340Var22.s0(objT4);
                        } else {
                            r8 = 0;
                        }
                        yoi1.e(j0f0Var, (Function0) objT4, (int) r8, x340Var22, 8);
                        x340Var22.r((boolean) r8);
                    }
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                hk10 hk10Var = (hk10) obj3;
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    WeakHashMap weakHashMap = osl1.x;
                    kuo1.g(lhc.g(x340Var24).c.f(), hk10Var.d, x340Var24, 0);
                    pt ptVar = hk10Var.c;
                    jk10 jk10Var = hk10Var.b;
                    otw.c(ptVar, new wj10(jk10Var.d, jk10Var.a, jk10Var.e, jk10Var.c), (qim0) null, (ipb1) null, x340Var24, 0, 12);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                uwr uwrVar2 = cbx.a;
                x340 x340Var25 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                x340 x340Var26 = x340Var25;
                boolean zY = x340Var26.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2);
                j06 j06Var = x340Var26.a;
                if (!zY) {
                    x340Var26.b0();
                    return rih1Var;
                }
                Object objT5 = x340Var26.T();
                m4c m4cVar2 = fkj0.X;
                if (objT5 == m4cVar2) {
                    objT5 = bb00.h(0, x340Var26);
                }
                err0 err0Var = (hdn0) objT5;
                float fM0 = ((wat) x340Var26.k(t4k.h)).M0(err0Var.s());
                boolean z8 = p3v.b(fM0, 90.0f) <= 0;
                if (p3v.b(fM0, 140.0f) > 0) {
                    x340Var26.i0(-1465050744);
                    lee1Var = cbx.d(x340Var26).c;
                    x340Var26.r(false);
                } else if (p3v.b(fM0, 90.0f) > 0) {
                    x340Var26.i0(-1465048887);
                    lee1Var = cbx.d(x340Var26).d;
                    x340Var26.r(false);
                } else {
                    x340Var26.i0(-1465047349);
                    lee1Var = cbx.d(x340Var26).k;
                    x340Var26.r(false);
                }
                lee1 lee1Var2 = lee1Var;
                nim0 nim0Var2 = nim0.a;
                qim0 qim0VarD = u291.d(nim0Var2, 1.0f);
                boolean zI5 = x340Var26.i(err0Var);
                Object objT6 = x340Var26.T();
                if (zI5 || objT6 == m4cVar2) {
                    objT6 = new tu9(err0Var, (byte) 18);
                    x340Var26.s0(objT6);
                }
                qim0 qim0VarU = lrn1.u(qim0VarD, (iu30) objT6);
                yzg yzgVar = (yzg) obj3;
                era eraVar = een.P0;
                f36 f36Var = h36.c;
                mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var26, 0);
                int iHashCode = Long.hashCode(x340Var26.T);
                xos0 xos0VarM = x340Var26.m();
                qim0 qim0VarE = zr7.E(x340Var26, qim0VarU);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var26.m0();
                boolean z9 = x340Var26.S;
                n4k n4kVar = hmb0.t1;
                if (z9) {
                    x340Var26.l(n4kVar);
                } else {
                    x340Var26.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(mbhVarA, x340Var26, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var26, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var26, lljVar3);
                nko1.F(x340Var26);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var26, lljVar4);
                pbh pbhVar = pbh.a;
                qim0 qim0VarF = u291.f(pbhVar.a(0.45f, nim0Var2, true), 1.0f);
                gfh0 gfh0VarC = t1c.c(een.h, false);
                int iHashCode2 = Long.hashCode(x340Var26.T);
                xos0 xos0VarM2 = x340Var26.m();
                qim0 qim0VarE2 = zr7.E(x340Var26, qim0VarF);
                x340Var26.m0();
                if (x340Var26.S) {
                    x340Var26.l(n4kVar);
                } else {
                    x340Var26.v0();
                }
                nko1.H(gfh0VarC, x340Var26, lljVar);
                nko1.H(xos0VarM2, x340Var26, lljVar2);
                x0d.q(iHashCode2, x340Var26, lljVar3, x340Var26);
                nko1.H(qim0VarE2, x340Var26, lljVar4);
                cvx cvxVar = cbx.b(x340Var26).b;
                ouo1.F(0, yzgVar.a, x340Var26, d7e.r(1.0f, u291.f(uyn1.B(nim0Var2, 0.0f, 16.0f, 0.0f, 0.0f, 13), 0.63f), false));
                ouo1.B(0, yzgVar.b, x340Var26, h2cVar.a(nim0Var2, een.d));
                x340Var26.r(true);
                qim0 qim0VarF2 = u291.f(pbhVar.a(0.55f, nim0Var2, true), 1.0f);
                cvx cvxVar2 = cbx.b(x340Var26).b;
                qim0 qim0VarZ = uyn1.z(8.0f, 0.0f, 2, qim0VarF2);
                mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var26, 0);
                int iHashCode3 = Long.hashCode(x340Var26.T);
                xos0 xos0VarM3 = x340Var26.m();
                qim0 qim0VarE3 = zr7.E(x340Var26, qim0VarZ);
                x340Var26.m0();
                if (x340Var26.S) {
                    x340Var26.l(n4kVar);
                } else {
                    x340Var26.v0();
                }
                nko1.H(mbhVarA2, x340Var26, lljVar);
                nko1.H(xos0VarM3, x340Var26, lljVar2);
                x0d.q(iHashCode3, x340Var26, lljVar3, x340Var26);
                nko1.H(qim0VarE3, x340Var26, lljVar4);
                op71.g(x340Var26, pbhVar.a(1.0f, nim0Var2, true));
                qim0 qim0VarF3 = u291.f(nim0Var2, 1.0f);
                String strF = yzgVar.c;
                if (!z8) {
                    List listQ0 = ihc1.Q0(strF, new String[]{" "}, 0, 6);
                    if (listQ0.size() > 1) {
                        int size = listQ0.size() / 2;
                        List list2 = listQ0;
                        strF = f4i1.f(o7h.y0(o7h.d1(list2, size), " ", (String) null, (String) null, (iu30) null, 62), "\n", o7h.y0(o7h.k0(list2, size), " ", (String) null, (String) null, (iu30) null, 62));
                    }
                }
                uwo1.e(strF, qim0VarF3, lee1Var2, d9p1.o(yzgVar.d, x340Var26, 0), new a0e1(5), (iu30) null, 2, false, new cjc0(z8 ? 1 : 2), 0, (qx8) null, x340Var26, 0, 0, 1696);
                op71.g(x340Var26, pbhVar.a(1.0f, nim0Var2, true));
                uwo1.e(yzgVar.e, u291.f(nim0Var2, 1.0f), cbx.d(x340Var26).p, d9p1.o(yzgVar.f, x340Var26, 0), new a0e1(5), (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var26, 0, 0, 1696);
                uwo1.e(yzgVar.g, u291.f(nim0Var2, 1.0f), cbx.d(x340Var26).o, d9p1.o(yzgVar.h, x340Var26, 0), new a0e1(5), (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var26, 0, 0, 1696);
                if (z8) {
                    x340Var26.i0(-365595344);
                    x340Var26.r(false);
                } else {
                    x340Var26.i0(-365688561);
                    cvx cvxVar3 = cbx.b(x340Var26).b;
                    x0d.s(nim0Var2, 4.0f, x340Var26, false);
                }
                boolean z10 = z8;
                ouo1.j(yzgVar.i, yzgVar.j, yzgVar.k, yzgVar.l, yzgVar.m, u291.f(nim0Var2, 1.0f), z10, x340Var26, 0);
                if (z10) {
                    x340Var26.i0(-365120176);
                    x340Var26.r(false);
                } else {
                    x340Var26.i0(-365213393);
                    cvx cvxVar4 = cbx.b(x340Var26).b;
                    x0d.s(nim0Var2, 2.0f, x340Var26, false);
                }
                x340Var26.r(true);
                x340Var26.r(true);
                return rih1Var;
            case 26:
                yk10 yk10Var = (yk10) ((ur6) obj3).b;
                epb1 epb1Var = new epb1((zob1) obj);
                ihp ihpVar = (ihp) yk10Var.a.a.get();
                ihpVar.getClass();
                z2p z2pVar = (z2p) ihpVar.a.b;
                z710 z710Var = (z710) ((w2z) z2pVar.b).b;
                c8o.l(z710Var);
                gw70 gw70Var = (gw70) ((w2z) z2pVar.b).c;
                c8o.l(gw70Var);
                return new jpg0(f6o1.A(new xk10(z710Var, gw70Var, epb1Var), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), xc10.Y);
            case 27:
                gy5 gy5Var = (gy5) obj3;
                return new sma1(new jpg0(zu70.a(gy5Var.b, new epb1((zob1) obj), gy5Var.e, gy5Var.c, gy5Var.d, tbo0.b, 4032), xc10.N0), new rma1((Integer) null, 2131167033, (Integer) null, 13));
            case 28:
                x340 x340Var27 = (b0k) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                x340 x340Var28 = x340Var27;
                if (x340Var28.Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    qim0 qim0VarN = anm1.N("PAGE_TITLE", nim0Var);
                    String str15 = ((pm10) obj3).b;
                    uwr uwrVar3 = cbx.a;
                    uwo1.e(str15, qim0VarN, cbx.d(x340Var28).h, cbx.a(x340Var28).b.a, (a0e1) null, (iu30) null, 2, false, (djc0) null, 1, (qx8) null, x340Var28, 806879232, 0, 1456);
                } else {
                    x340Var28.b0();
                }
                return rih1Var;
            default:
                gy5 gy5Var2 = (gy5) obj3;
                return new sma1(new jpg0(zu70.a(gy5Var2.b, new epb1((zob1) obj), gy5Var2.e, gy5Var2.c, gy5Var2.d, tbo0.b, 4032), xc10.T0), new rma1((Integer) null, 2131167033, (Integer) null, 13));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hzw(Object obj, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hzw(EncoreImageView encoreImageView, int i) {
        super(2);
        this.a = (byte) 6;
        this.b = encoreImageView;
    }
}
