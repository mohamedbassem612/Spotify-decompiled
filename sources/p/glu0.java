package p;

import android.os.Bundle;
import com.ravelin.core.model.ErrorMetadata;
import com.ravelin.core.model.RavelinError;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformItemsRequest;
import com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.messages.ActivePlaylistEntityPlugins;
import com.spotify.mobius.functions.Consumer;
import com.spotify.playlist.policy.proto.PlaylistEpisodeDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import io.reactivex.rxjava3.internal.operators.completable.CompletableObserveOn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class glu0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ glu0(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [boolean, p.c9n] */
    private final Object e(Object obj) {
        avz0 avz0Var = (avz0) this.e;
        pvz0 pvz0Var = (pvz0) this.d;
        ?? r3 = this.b;
        try {
            if (r3 == 0) {
                hm5.M(obj);
                c9n c9nVar = (c9n) this.c;
                kvg kvgVar = pvz0Var.i;
                if (kvgVar == null) {
                    u890.C("rateLimit");
                    throw null;
                }
                wdp0 wdp0Var = (wdp0) kvgVar.b.get("fingerprint emitter");
                dt71 dt71Var = wdp0Var != null ? wdp0Var.a : null;
                if (dt71Var != null) {
                    xdp0 xdp0Var = new xdp0(avz0Var);
                    this.c = c9nVar;
                    this.b = true;
                    Object objEmit = dt71Var.emit(xdp0Var, this);
                    d9n d9nVar = d9n.a;
                    if (objEmit == d9nVar) {
                        return d9nVar;
                    }
                }
            } else {
                if (r3 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (Exception e) {
            op71.x(r3.J());
            RavelinError ravelinError = new RavelinError(e.getMessage(), (String) null, 2, (DefaultConstructorMarker) null);
            ErrorMetadata errorMetadata = new ErrorMetadata(101, "Tracking", "An error occurred while generating the fingerprint", (String) null, b0o1.b(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null);
            uic uicVar = pvz0.n;
            pvz0Var.e(ravelinError, errorMetadata, avz0Var);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x009d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x009e A[RETURN] */
    private final Object g(Object obj) {
        rih1 rih1Var;
        d9n d9nVar;
        Object objT;
        boolean z = this.b;
        rih1 rih1Var2 = rih1.a;
        if (z) {
            if (z) {
                hm5.M(obj);
                return rih1Var2;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        lyz0 lyz0Var = (lyz0) this.c;
        String str = lyz0Var.a;
        String str2 = ((jyz0) ((kyz0) this.d)).a.a;
        String str3 = lyz0Var.b;
        boolean z2 = lyz0Var.d;
        String str4 = lyz0Var.e;
        cm0 cm0Var = (cm0) this.e;
        this.b = true;
        boolean zY0 = ihc1.y0(str2);
        d9n d9nVar2 = d9n.a;
        if (zY0 || ihc1.y0(str3)) {
            rih1Var = rih1Var2;
            d9nVar = d9nVar2;
        } else {
            long jB = ((yqg) cm0Var.c).b() / 1000;
            rih1Var = rih1Var2;
            d9nVar = d9nVar2;
            lpl lplVar = new lpl(str, (bc71) null, (String) null, new bpl(str2, str3), (hmp0) null, (String) null, (String) null, 118);
            if (!z2) {
                objT = cm0Var.t(lplVar, jB, str3, str4, this);
                if (objT != d9nVar) {
                }
                if (objT == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            }
            mjv mjvVar = ((g310) ((kly0) cm0Var.i).get()).b;
            ((g310) mjvVar.b).a.a(new a310(new c310(lplVar), jB));
        }
        objT = rih1Var;
        if (objT == d9nVar) {
            return d9nVar;
        }
        return rih1Var;
    }

    private final Object h(Object obj) {
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            n2u0 n2u0Var = ((o0i) this.c).c.b;
            if (n2u0Var == null) {
                hhg1.n("Required value was null.");
                return null;
            }
            ezc ezcVarG = yoi1.g(((obl1) this.d).b(yoi1.i(new mt(n2u0Var.c, (byte) 23), o6x.a)));
            mp0 mp0Var = new mp0((ven0) this.e, (byte) 20);
            this.b = true;
            Object objCollect = ezcVarG.collect(mp0Var, this);
            d9n d9nVar = d9n.a;
            if (objCollect == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }

    private final Object i(Object obj) {
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            n2u0 n2u0Var = ((o0i) this.c).c.b;
            if (n2u0Var == null) {
                hhg1.n("Required value was null.");
                return null;
            }
            lt0 lt0VarA = hu20.a(z4p1.F(new f5y0(new mt(n2u0Var.c, (byte) 24), (sd5) this.d, (byte) 12), 1), new zio0(2, (lnm) null, (byte) 28));
            mp0 mp0Var = new mp0((ven0) this.e, (byte) 21);
            this.b = true;
            Object objCollect = lt0VarA.collect(mp0Var, this);
            d9n d9nVar = d9n.a;
            if (objCollect == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }

    private final Object j(Object obj) {
        boolean z = this.b;
        rih1 rih1Var = rih1.a;
        if (z) {
            if (z) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        ewn0 ewn0Var = ((uh01) this.c).i;
        String str = (String) this.d;
        w4h w4hVar = (w4h) ewn0Var.b;
        u4h u4hVarQ = CollectionPlatformItemsRequest.q();
        u4hVarQ.t(w5h.g);
        u4hVarQ.r(str);
        u4hVarQ.s();
        qt20 qt20VarV = z4p1.v(yoi1.g(w4hVar.callStream("spotify.collection_platform_esperanto.proto.CollectionPlatformService", "StreamGet", u4hVarQ.build()).map(b6j0.O0)), 1);
        mp0 mp0Var = new mp0((ven0) this.e, (byte) 23);
        this.b = true;
        Object objCollect = qt20VarV.collect(new gtp0(mp0Var, (byte) 14), this);
        d9n d9nVar = d9n.a;
        if (objCollect != d9nVar) {
            objCollect = rih1Var;
        }
        return objCollect == d9nVar ? d9nVar : rih1Var;
    }

    private final Object m(Object obj) {
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            long jH = jfv.h(do01.b) - (((yqg) this.c).b() - (((long) ((co01) this.d).c) * 1000));
            if (jH < 0) {
                jH = 0;
            }
            this.b = true;
            Object objI = hap1.i(jH, this);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        ven0 ven0Var = (ven0) this.e;
        float f = bo01.a;
        ven0Var.setValue(Boolean.FALSE);
        return rih1.a;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                return new glu0(this.c, this.d, obj2, lnmVar, (byte) 0);
            case 1:
                return new glu0(this.c, this.d, obj2, lnmVar, (byte) 1);
            case 2:
                glu0 glu0Var = new glu0((byte) 2, obj2, (String) this.d, lnmVar);
                glu0Var.c = obj;
                return glu0Var;
            case 3:
                glu0 glu0Var2 = new glu0((byte) 3, obj2, (String) this.d, lnmVar);
                glu0Var2.c = obj;
                return glu0Var2;
            case 4:
                return new glu0(this.d, obj2, lnmVar, (byte) 4);
            case 5:
                return new glu0(this.c, this.d, obj2, lnmVar, (byte) 5);
            case 6:
                glu0 glu0Var3 = new glu0(this.d, obj2, lnmVar, (byte) 6);
                glu0Var3.c = obj;
                return glu0Var3;
            case 7:
                return new glu0(this.c, this.d, obj2, lnmVar, (byte) 7);
            case 8:
                glu0 glu0Var4 = new glu0(this.d, lnmVar, (pdw0) obj2);
                glu0Var4.c = obj;
                return glu0Var4;
            case 9:
                return new glu0(this.c, this.d, obj2, lnmVar, (byte) 9);
            case 10:
                return new glu0(this.c, obj2, (String) this.d, lnmVar, (byte) 10);
            case 11:
                return new glu0(this.c, this.d, obj2, lnmVar, (byte) 11);
            case 12:
                return new glu0(obj2, lnmVar, (byte) 12);
            case 13:
                glu0 glu0Var5 = new glu0(this.d, obj2, lnmVar, (byte) 13);
                glu0Var5.c = obj;
                return glu0Var5;
            case 14:
                return new glu0(this.c, this.d, obj2, lnmVar, (byte) 14);
            case 15:
                glu0 glu0Var6 = new glu0(obj2, lnmVar, (byte) 15);
                glu0Var6.d = obj;
                return glu0Var6;
            case 16:
                glu0 glu0Var7 = new glu0(this.d, obj2, lnmVar, (byte) 16);
                glu0Var7.c = obj;
                return glu0Var7;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new glu0(this.c, this.d, obj2, lnmVar, (byte) 17);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                glu0 glu0Var8 = new glu0((byte) 18, obj2, (String) this.d, lnmVar);
                glu0Var8.c = obj;
                return glu0Var8;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new glu0(this.c, this.d, obj2, lnmVar, (byte) 19);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new glu0(this.c, this.d, obj2, lnmVar, (byte) 20);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new glu0(this.c, this.d, obj2, lnmVar, (byte) 21);
            case 22:
                glu0 glu0Var9 = new glu0(this.d, obj2, lnmVar, (byte) 22);
                glu0Var9.c = obj;
                return glu0Var9;
            case 23:
                return new glu0(this.c, this.d, obj2, lnmVar, (byte) 23);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new glu0(this.c, obj2, (String) this.d, lnmVar, (byte) 24);
            case 25:
                return new glu0(this.c, this.d, obj2, lnmVar, (byte) 25);
            case 26:
                return new glu0(this.c, this.d, obj2, lnmVar, (byte) 26);
            case 27:
                return new glu0(this.c, this.d, obj2, lnmVar, (byte) 27);
            case 28:
                return new glu0(this.c, this.d, obj2, lnmVar, (byte) 28);
            default:
                return new glu0(this.c, this.d, obj2, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((String) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:137:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:138:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:140:0x02da  */
    /* JADX WARN: Code duplicated, block: B:141:0x02fa  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v129 */
    /* JADX WARN: Type inference failed for: r1v130 */
    /* JADX WARN: Type inference failed for: r1v85, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v86, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v89, types: [java.lang.Iterable] */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF;
        prc0 prc0Var;
        String str;
        String str2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        String str3;
        String str4;
        Object objU;
        p811 p811Var;
        Object objA;
        Object objY;
        kkw0 kkw0Var;
        xgn0 xgn0Var;
        mfd m231Var;
        Object objB;
        Object objB2;
        mzc0 mzc0Var;
        Object objA2;
        tbr0 tbr0Var;
        Throwable thA;
        Object value;
        Object value2;
        Object objI;
        Object value3;
        Object value4;
        byte b = this.a;
        byte b2 = 2;
        boolean z = false;
        z = false;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.e;
        d9n d9nVar = d9n.a;
        ubc0 ubc0Var = null;
        switch (b) {
            case 0:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    rsc0 rsc0Var = ((hlu0) this.c).a;
                    String str5 = (String) this.d;
                    Set setSingleton = Collections.singleton(wqc0.a);
                    rrc0 rrc0Var = new rrc0(f46.S0(new dlc0[]{dlc0.b, dlc0.d, dlc0.g}));
                    hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
                    iou0 iou0VarV = PlaylistItemDecorationPolicy.v();
                    iou0VarV.D(true);
                    hru0VarS.v(iou0VarV);
                    vwu0 vwu0VarR = PlaylistTrackDecorationPolicy.r();
                    vwu0VarR.C(TrackDecorationPolicy.newBuilder().setLink(true));
                    hru0VarS.z(vwu0VarR);
                    llu0 llu0VarR = PlaylistEpisodeDecorationPolicy.r();
                    llu0VarR.s(EpisodeDecorationPolicy.newBuilder().setLink(true));
                    hru0VarS.t(llu0VarR);
                    trc0 trc0Var = new trc0(hru0VarS.build(), (g3d0) obj2, setSingleton, false, rrc0Var, hqz0.a, (prc0) null, 0, (List) null, 456);
                    this.b = true;
                    objF = rsc0Var.f(str5, trc0Var, this);
                    if (objF == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objF = obj;
                }
                List list = ((wsc0) ((py21) objF).d()).e;
                ArrayList arrayList4 = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList4.add(((zuc0) it.next()).c);
                }
                return arrayList4;
            case 1:
                c6h1 c6h1Var = (c6h1) obj2;
                y131 y131Var = (y131) this.d;
                qzu0 qzu0Var = (qzu0) this.c;
                l5d0 l5d0Var = qzu0Var.d;
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    c8c0 c8c0Var = y131Var.h;
                    t45 t45Var = l5d0Var.b;
                    if (t45Var != null) {
                        t45Var.b("formatListType", y131Var.f);
                        t45Var.b("licenseLayout", y131Var.h.toString());
                    }
                    jtk jtkVar = qzu0Var.q;
                    Map map = y131Var.g;
                    uap uapVar = (uap) jtkVar.c.a.c;
                    uly0 uly0Var = (uly0) uapVar.A.get();
                    luk lukVarA = ((zyc0) uapVar.I).a();
                    c8o.l(lukVarA);
                    ao4 ao4Var = new ao4(false, true, lukVarA);
                    int iOrdinal = c8c0Var.ordinal();
                    if (iOrdinal != 0) {
                        prc0Var = iOrdinal != 3 ? prc0.a : prc0.c;
                    } else {
                        prc0Var = prc0.b;
                    }
                    prc0 prc0Var2 = prc0Var;
                    c8c0 c8c0Var2 = c8c0.d;
                    Boolean bool = c8c0Var == c8c0Var2 ? Boolean.TRUE : null;
                    boolean z4 = (ao4Var.a() && y7y0.t("disable-blocked-content", map)) ? false : true;
                    boolean z5 = a3r.a[c8c0Var.ordinal()] == 1;
                    boolean z6 = uly0Var.a.b() && !y7y0.t("has-podcasts-available", map);
                    boolean z7 = c8c0Var == c8c0.a;
                    boolean z8 = z5;
                    l5d0Var.c(h5d0.o1, new odp0(qzu0Var, y131Var, c6h1Var, new z2r((y2r) l5d0Var.d(h5d0.B1, new mvn0(qzu0Var, new z2r(new y2r(c8c0Var == c8c0Var2, bool, false, prc0Var2, false, null, w7x.a), z8, true, z6, z4, z7), new gzu0(), (byte) 29)), z8, true, z6, z4, z7), (byte) 6));
                    l5d0Var.c(h5d0.O0, new mzu0(qzu0Var, y131Var, c6h1Var, z ? (byte) 1 : (byte) 0));
                    l5d0Var.c(h5d0.t, new jzu0(qzu0Var, b2));
                    lvc lvcVar = qzu0Var.i;
                    List list2 = qzu0Var.G;
                    List list3 = qzu0Var.H;
                    List list4 = qzu0Var.I;
                    String str6 = y131Var.f;
                    String string = c8c0Var.toString();
                    j0v0 j0v0Var = qzu0Var.K;
                    if (j0v0Var == null || (str = j0v0Var.b) == null) {
                        str = "none";
                    }
                    List list5 = qzu0Var.Z;
                    ArrayList arrayList5 = new ArrayList(q7h.U(list5, 10));
                    Iterator it2 = list5.iterator();
                    while (it2.hasNext()) {
                        arrayList5.add(((j0v0) it2.next()).b);
                    }
                    j0v0 j0v0Var2 = qzu0Var.Y;
                    if (j0v0Var2 == null || (str2 = j0v0Var2.b) == null) {
                        str2 = "none";
                    }
                    List list6 = qzu0Var.g0;
                    ArrayList arrayList6 = new ArrayList(q7h.U(list6, 10));
                    Iterator it3 = list6.iterator();
                    while (it3.hasNext()) {
                        arrayList6.add(((j0v0) it3.next()).b);
                    }
                    String string2 = y131Var.e.c.toString();
                    List list7 = qzu0Var.i0;
                    ArrayList arrayList7 = new ArrayList(q7h.U(list7, 10));
                    Iterator it4 = list7.iterator();
                    while (it4.hasNext()) {
                        arrayList7.add(((j0v0) it4.next()).b);
                    }
                    List list8 = qzu0Var.j0;
                    ArrayList arrayList8 = new ArrayList(q7h.U(list8, 10));
                    Iterator it5 = list8.iterator();
                    while (it5.hasNext()) {
                        arrayList8.add(((j0v0) it5.next()).b);
                    }
                    List list9 = qzu0Var.l0;
                    ArrayList arrayList9 = new ArrayList(q7h.U(list9, 10));
                    Iterator it6 = list9.iterator();
                    while (it6.hasNext()) {
                        arrayList9.add(((j0v0) it6.next()).b);
                    }
                    List list10 = qzu0Var.a0;
                    ArrayList arrayList10 = z6x.a;
                    if (list10 != null) {
                        List list11 = list10;
                        arrayList = arrayList10;
                        arrayList2 = new ArrayList(q7h.U(list11, 10));
                        Iterator it7 = list11.iterator();
                        while (it7.hasNext()) {
                            arrayList2.add(((j0v0) it7.next()).b);
                        }
                    } else {
                        arrayList = arrayList10;
                        arrayList2 = arrayList;
                    }
                    List list12 = qzu0Var.c0;
                    if (list12 != null) {
                        List list13 = list12;
                        arrayList3 = new ArrayList(q7h.U(list13, 10));
                        Iterator it8 = list13.iterator();
                        while (it8.hasNext()) {
                            arrayList3.add(((j0v0) it8.next()).b);
                        }
                    } else {
                        arrayList3 = arrayList;
                    }
                    List list14 = qzu0Var.q0;
                    ArrayList arrayList11 = arrayList3;
                    ArrayList arrayList12 = new ArrayList(q7h.U(list14, 10));
                    Iterator it9 = list14.iterator();
                    while (it9.hasNext()) {
                        arrayList12.add(((j0v0) it9.next()).b);
                    }
                    j0v0 j0v0Var3 = qzu0Var.k0;
                    if (j0v0Var3 == null || (str3 = j0v0Var3.b) == null) {
                        str3 = "default";
                    }
                    List list15 = qzu0Var.p0;
                    ArrayList arrayList13 = new ArrayList(q7h.U(list15, 10));
                    Iterator it10 = list15.iterator();
                    while (it10.hasNext()) {
                        arrayList13.add(((j0v0) it10.next()).b);
                    }
                    j0v0 j0v0Var4 = qzu0Var.r0;
                    if (j0v0Var4 == null || (str4 = j0v0Var4.b) == null) {
                        str4 = "default";
                    }
                    List list16 = qzu0Var.s0;
                    if (list16 != null) {
                        List list17 = list16;
                        ArrayList arrayList14 = new ArrayList(q7h.U(list17, 10));
                        Iterator it11 = list17.iterator();
                        while (it11.hasNext()) {
                            arrayList14.add(((j0v0) it11.next()).b);
                        }
                        arrayList = arrayList14;
                    }
                    gc0 gc0VarX = ActivePlaylistEntityPlugins.x();
                    gc0VarX.C(str);
                    gc0VarX.J();
                    gc0VarX.K(string);
                    gc0VarX.t(list2);
                    gc0VarX.L(str2);
                    gc0VarX.r(arrayList2);
                    gc0VarX.w(list3);
                    gc0VarX.x(list4);
                    gc0VarX.y();
                    gc0VarX.M(str6);
                    gc0VarX.A();
                    gc0VarX.n();
                    gc0VarX.v(arrayList11);
                    gc0VarX.B(string2);
                    gc0VarX.z(str3);
                    gc0VarX.u(arrayList12);
                    String str7 = (String) o7h.s0(arrayList5);
                    if (str7 == null) {
                        str7 = "none";
                    }
                    gc0VarX.H(str7);
                    gc0VarX.s(arrayList);
                    gc0VarX.q(arrayList13);
                    String str8 = (String) o7h.s0(arrayList6);
                    if (str8 == null) {
                        str8 = "none";
                    }
                    gc0VarX.D(str8);
                    String str9 = (String) o7h.s0(arrayList7);
                    if (str9 == null) {
                        str9 = "none";
                    }
                    gc0VarX.E(str9);
                    String str10 = (String) o7h.s0(arrayList8);
                    if (str10 == null) {
                        str10 = "none";
                    }
                    gc0VarX.G(str10);
                    gc0VarX.I(str4);
                    String str11 = (String) o7h.s0(arrayList9);
                    gc0VarX.F(str11 == null ? "none" : str11);
                    lvcVar.a.a(gc0VarX.build());
                    qzu0Var.C0 = y131Var;
                    this.b = true;
                    if (qzu0Var.f(this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            case 2:
                boolean z9 = this.b;
                try {
                    if (!z9) {
                        hm5.M(obj);
                        xyc0 xyc0Var = (iyc0) obj2;
                        String str12 = (String) this.d;
                        ddd1 ddd1Var = ddd1.T0;
                        this.c = null;
                        this.b = true;
                        objU = xyc0Var.u(str12, ddd1Var, this);
                        if (objU == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z9) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objU = obj;
                    }
                    return rih1Var;
                } catch (Throwable unused) {
                    return rih1Var;
                }
            case 3:
                xmu0 xmu0Var = (xmu0) obj2;
                vr20 vr20Var = (vr20) this.c;
                boolean z10 = this.b;
                if (z10) {
                    if (z10) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p811 p811VarU = cy30.u(obj);
                fpo fpoVar = new fpo((gh40) xmu0Var.b, (String) this.d, (lnm) null, (byte) 11);
                m441 m441Var = new m441(new ary(new m441(new rzu(fpoVar, fpoVar, ubc0Var, (byte) 14)), (lnm) null, xmu0Var, p811VarU, (String) this.d));
                this.c = null;
                this.b = true;
                return l4p1.s(vr20Var, m441Var, this) == d9nVar ? d9nVar : rih1Var;
            case 4:
                boolean z11 = this.b;
                if (!z11) {
                    hm5.M(obj);
                    p811Var = (p811) this.d;
                    this.c = p811Var;
                    this.b = true;
                    objA = ((adv0) obj2).a(this);
                    if (objA == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z11) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p811Var = (p811) this.c;
                    hm5.M(obj);
                    objA = obj;
                }
                p811Var.a = objA;
                return rih1Var;
            case 5:
                oev0 oev0Var = (oev0) this.d;
                boolean z12 = this.b;
                try {
                    if (!z12) {
                        l811 l811VarY = l1d.y(obj);
                        mr20 mr20VarU = rqt0.u((mr20) this.c);
                        uqs0 uqs0Var = new uqs0(oev0Var, l811VarY, (qa2) obj2, (byte) 6);
                        this.b = true;
                        if (mr20VarU.collect(uqs0Var, this) == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z12) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    oev0Var.d = null;
                    return rih1Var;
                } catch (Throwable th) {
                    oev0Var.d = null;
                    throw th;
                }
            case 6:
                vr20 vr20Var2 = (vr20) this.c;
                boolean z13 = this.b;
                if (z13) {
                    if (z13) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                elu0 elu0Var = new elu0((ggv0) this.d, (oei1) obj2, vr20Var2, null, (byte) 4);
                this.c = null;
                this.b = true;
                return smo1.s(elu0Var, this) == d9nVar ? d9nVar : rih1Var;
            case 7:
                zuv0 zuv0Var = (zuv0) this.c;
                boolean z14 = this.b;
                if (!z14) {
                    hm5.M(obj);
                    fns fnsVar = igu.a;
                    cqu0 cqu0Var = new cqu0((wuv0) this.d, (avv0) obj2, null, (byte) 5);
                    this.b = true;
                    objY = fn31.Y(fnsVar, cqu0Var, this);
                    if (objY == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z14) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objY = obj;
                }
                zuv0Var.t.m((List) objY);
                zuv0Var.Z.b.post(new an90(zuv0Var, (byte) 24));
                return rih1Var;
            case 8:
                boolean z15 = this.b;
                if (z15) {
                    if (!z15) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    return rih1Var;
                }
                hm5.M(obj);
                vr20 vr20Var3 = (vr20) this.c;
                zbw0 zbw0Var = (zbw0) this.d;
                this.c = null;
                this.b = true;
                return ((pdw0) obj2).b(vr20Var3, zbw0Var, this) == d9nVar ? d9nVar : rih1Var;
            case 9:
                boolean z16 = this.b;
                if (z16) {
                    if (z16) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                gfw0 gfw0Var = (gfw0) this.c;
                iac0 iac0Var = (iac0) this.d;
                oew0 oew0Var = new oew0(gfw0Var, (sbw0) obj2, (lnm) null, (byte) 0);
                this.b = true;
                Object objT = z8p1.t(iac0Var.getLifecycle(), w8c0.d, new dt40((vu30) oew0Var, (lnm) null, (byte) 5), this);
                if (objT != d9nVar) {
                    objT = rih1Var;
                }
                return objT == d9nVar ? d9nVar : rih1Var;
            case 10:
                boolean z17 = this.b;
                if (z17) {
                    if (z17) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ht20 ht20Var = new ht20(((r091) this.c).g, new zio0(2, (lnm) null, (byte) 16), (byte) 2);
                l4f0 l4f0Var = new l4f0((gfw0) obj2, (String) this.d, (lnm) null, (byte) 22);
                this.b = true;
                return l4p1.q(ht20Var, l4f0Var, this) == d9nVar ? d9nVar : rih1Var;
            case 11:
                drr0 drr0Var = (drr0) obj2;
                siw0 siw0Var = (siw0) this.c;
                long j = siw0Var.b;
                boolean z18 = this.b;
                if (!z18) {
                    hm5.M(obj);
                    if (j <= 0) {
                        drr0Var.t(0.0f);
                        return rih1Var;
                    }
                } else {
                    if (!z18) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                do {
                    drr0Var.t((siw0Var.c + (((yqg) ((yeu0) this.d).b).b() - siw0Var.a)) / j);
                    this.b = true;
                } while (hap1.i(50L, this) != d9nVar);
                return d9nVar;
            case 12:
                boolean z19 = this.b;
                if (!z19) {
                    hm5.M(obj);
                    kkw0Var = (kkw0) obj2;
                    xgn0Var = kkw0Var.e;
                    this.c = xgn0Var;
                    this.d = kkw0Var;
                    this.b = true;
                    if (xgn0Var.a(this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z19) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kkw0Var = (kkw0) this.d;
                    xgn0Var = (xgn0) this.c;
                    hm5.M(obj);
                }
                try {
                    r091 r091Var = (r091) kkw0Var.c.getValue();
                    if (r091Var != null) {
                        r091Var.c();
                        r091Var.j();
                        break;
                    }
                    return rih1Var;
                } finally {
                    xgn0Var.c((Object) null);
                }
            case 13:
                boolean z20 = this.b;
                try {
                    if (!z20) {
                        hm5.M(obj);
                        bfd bfdVar = (bfd) this.d;
                        String str13 = ((r1x0) obj2).h;
                        this.c = null;
                        this.b = true;
                        objB = bfd.b(bfdVar, str13, this);
                        if (objB == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z20) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objB = obj;
                    }
                    m231Var = (mfd) objB;
                    break;
                } catch (Throwable th2) {
                    m231Var = new m231(th2);
                }
                Throwable thA2 = e331.a(m231Var);
                if (thA2 != null && (thA2 instanceof CancellationException)) {
                    throw thA2;
                }
                if (m231Var instanceof m231) {
                    m231Var = null;
                }
                mfd mfdVar = m231Var;
                if (mfdVar != null && mfdVar.b) {
                    z = true;
                }
                return new r2x0(z, mfdVar != null ? mfdVar.c : null);
            case 14:
                j4x0 j4x0Var = (j4x0) this.d;
                boolean z21 = this.b;
                if (!z21) {
                    hm5.M(obj);
                    bfd bfdVar2 = (bfd) this.c;
                    String str14 = j4x0Var.e;
                    this.b = true;
                    objB2 = bfd.b(bfdVar2, str14, this);
                    if (objB2 == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z21) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objB2 = obj;
                }
                mfd mfdVar2 = (mfd) objB2;
                if (mfdVar2 != null) {
                    ((mwv0) obj2).invoke(new r2x0(mfdVar2.b, mfdVar2.c));
                }
                return new x5x0(mfdVar2 != null ? Boolean.valueOf(mfdVar2.b) : null, j4x0Var.e, j4x0Var.f, j4x0Var.g, mfdVar2 != null ? mfdVar2.c : null);
            case 15:
                c9n c9nVar = (c9n) this.d;
                ?? r1 = this.b;
                try {
                    if (r1 == 0) {
                        ArrayList arrayListJ = hrt.j(obj);
                        hkx0 hkx0Var = (hkx0) obj2;
                        mr20 mr20Var = hkx0Var.f;
                        uqs0 uqs0Var2 = new uqs0(arrayListJ, hkx0Var, c9nVar, (byte) 10);
                        this.d = null;
                        this.c = arrayListJ;
                        this.b = true;
                        r1 = arrayListJ;
                        if (mr20Var.collect(uqs0Var2, this) == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (r1 != 1) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ArrayList arrayList15 = (ArrayList) this.c;
                        hm5.M(obj);
                        r1 = arrayList15;
                    }
                    Iterator it12 = r1.iterator();
                    while (it12.hasNext()) {
                        ((c0r) it12.next()).dispose();
                    }
                    return rih1Var;
                } catch (Throwable th3) {
                    Iterator it13 = r1.iterator();
                    while (it13.hasNext()) {
                        ((c0r) it13.next()).dispose();
                    }
                    throw th3;
                }
            case 16:
                mpx0 mpx0Var = (mpx0) this.d;
                opx0 opx0Var = mpx0Var.b;
                String str15 = (String) this.c;
                boolean z22 = this.b;
                if (z22) {
                    if (!z22) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objA2 = ((e331) obj).a;
                    tbr0Var = (tbr0) obj2;
                    thA = e331.a(objA2);
                    if (thA == null) {
                        tbr0Var.a(new y231(new brr0(str15)));
                        return rih1Var;
                    }
                    if (thA instanceof hyx0) {
                        tbr0Var.a(l231.a);
                        return rih1Var;
                    }
                    a1r0 a1r0Var = mpx0Var.c;
                    String str16 = nik1.m6.a;
                    Bundle bundle = new Bundle();
                    bundle.putStringArrayList("error_messages", p7h.H(new String[]{((hyx0) thA).a}));
                    a1r0.m(a1r0Var, str16, (tv80) null, bundle, 8);
                    return rih1Var;
                }
                hm5.M(obj);
                i8h1 i8h1Var = mpx0Var.f;
                x6h1 x6h1VarC = mpx0Var.g.b.c();
                x6h1VarC.i.add(new a7h1("submit_prompt_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                b7x b7xVar = b7x.a;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("submit", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                int iC = l1d.C(opx0Var.c);
                if (iC == 0) {
                    mzc0Var = mpx0Var.d;
                } else {
                    if (iC != 1) {
                        eg.o();
                        return null;
                    }
                    mzc0Var = mpx0Var.e;
                }
                String str17 = opx0Var.a;
                this.c = str15;
                this.b = true;
                objA2 = mzc0Var.a(str15, str17, this);
                if (objA2 == d9nVar) {
                    return d9nVar;
                }
                tbr0Var = (tbr0) obj2;
                thA = e331.a(objA2);
                if (thA == null) {
                    tbr0Var.a(new y231(new brr0(str15)));
                    return rih1Var;
                }
                if (thA instanceof hyx0) {
                    tbr0Var.a(l231.a);
                    return rih1Var;
                }
                a1r0 a1r0Var2 = mpx0Var.c;
                String str18 = nik1.m6.a;
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("error_messages", p7h.H(new String[]{((hyx0) thA).a}));
                a1r0.m(a1r0Var2, str18, (tv80) null, bundle2, 8);
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                boolean z23 = this.b;
                if (!z23) {
                    hm5.M(obj);
                    vu30 vu30Var = (vu30) this.c;
                    String string3 = ((y7e1) this.d).d().d.toString();
                    this.b = true;
                    if (vu30Var.invoke(string3, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z23) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((ven0) obj2).setValue(Boolean.FALSE);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                String str19 = (String) this.d;
                i4z0 i4z0Var = (i4z0) obj2;
                c9n c9nVar2 = (c9n) this.c;
                boolean z24 = this.b;
                try {
                    try {
                        if (!z24) {
                            hm5.M(obj);
                            eg40 eg40Var = i4z0Var.f;
                            mri1 mri1Var = new mri1(i4z0Var.d.c, str19);
                            this.c = c9nVar2;
                            this.b = true;
                            objI = eg40Var.i(mri1Var, this);
                            if (objI == d9nVar) {
                                return d9nVar;
                            }
                        } else {
                            if (!z24) {
                                eg.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            hm5.M(obj);
                            objI = obj;
                        }
                        if (((nri1) objI).a) {
                            bpb1 bpb1Var = i4z0Var.t;
                            do {
                                value4 = bpb1Var.getValue();
                                break;
                            } while (!bpb1Var.k(value4, i4z0Var.k((o4z0) value4, str19)));
                        }
                        bpb1 bpb1Var2 = i4z0Var.t;
                        do {
                            value3 = bpb1Var2.getValue();
                        } while (!bpb1Var2.k(value3, o4z0.a((o4z0) value3, (ArrayList) null, (String) null, false, 7)));
                        return rih1Var;
                    } catch (Exception unused2) {
                        op71.x(c9nVar2.J());
                        bpb1 bpb1Var3 = i4z0Var.t;
                        do {
                            value2 = bpb1Var3.getValue();
                        } while (!bpb1Var3.k(value2, o4z0.a((o4z0) value2, (ArrayList) null, (String) null, false, 7)));
                        return rih1Var;
                    }
                } catch (Throwable th4) {
                    bpb1 bpb1Var4 = i4z0Var.t;
                    do {
                        value = bpb1Var4.getValue();
                    } while (!bpb1Var4.k(value, o4z0.a((o4z0) value, (ArrayList) null, (String) null, false, 7)));
                    throw th4;
                }
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                boolean z25 = this.b;
                if (z25) {
                    if (z25) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                oy1 oy1Var = (oy1) this.c;
                aas aasVar = oy1Var.b;
                String str20 = (String) this.d;
                y6r0 y6r0Var = oy1Var.c.get();
                ubc0Var = y6r0Var != null ? y6r0Var.a : null;
                CompletableObserveOn completableObserveOnB = aasVar.b(str20, ubc0Var != null ? ubc0Var : "", 2, ((tv80) obj2).a.a);
                this.b = true;
                return fc11.i(completableObserveOnB, this) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                boolean z26 = this.b;
                if (z26) {
                    if (z26) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                jge jgeVarE = hu20.e((bpb1) this.c, new t4o0((lnm) ubc0Var, this.d, (byte) 27));
                h8c h8cVar = new h8c((Consumer) obj2, (byte) 8);
                this.b = true;
                return jgeVarE.collect(h8cVar, this) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                boolean z27 = this.b;
                if (z27) {
                    if (z27) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                oy1 oy1Var2 = (oy1) this.c;
                aas aasVar2 = oy1Var2.b;
                List list18 = (List) this.d;
                y6r0 y6r0Var2 = oy1Var2.c.get();
                ubc0Var = y6r0Var2 != null ? y6r0Var2.a : null;
                CompletableObserveOn completableObserveOnA = aasVar2.a(2, ubc0Var != null ? ubc0Var : "", ((tv80) obj2).a.a, list18);
                this.b = true;
                return fc11.i(completableObserveOnA, this) == d9nVar ? d9nVar : rih1Var;
            case 22:
                return e(obj);
            case 23:
                return g(obj);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                boolean z28 = this.b;
                if (z28) {
                    if (z28) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                cm0 cm0Var = (cm0) this.c;
                lyz0 lyz0Var = (lyz0) obj2;
                String str21 = (String) this.d;
                this.b = true;
                Object objA3 = b1r0.a((b1r0) cm0Var.f, "spotify:listening-activity-pick-custom-reaction", str21, uj1.d(new kqo(new gfm0(lyz0Var.a, lyz0Var.b, !lyz0Var.d, lyz0Var.e))), this, 8);
                if (objA3 != d9nVar) {
                    objA3 = rih1Var;
                }
                return objA3 == d9nVar ? d9nVar : rih1Var;
            case 25:
                return h(obj);
            case 26:
                return i(obj);
            case 27:
                return j(obj);
            case 28:
                return m(obj);
            default:
                boolean z29 = this.b;
                if (z29) {
                    if (z29) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ccc0 ccc0Var = ((gx01) this.c).c;
                String str22 = (String) this.d;
                tv80 tv80Var = (tv80) obj2;
                ubc0Var = tv80Var != null ? new ubc0(tv80Var) : null;
                this.b = true;
                return ccc0.c(ccc0Var, str22, false, ubc0Var, this) == d9nVar ? d9nVar : rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ glu0(byte b, Object obj, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.d = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ glu0(Object obj, Object obj2, String str, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.e = obj2;
        this.d = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ glu0(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ glu0(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public glu0(Object obj, lnm lnmVar, pdw0 pdw0Var) {
        super(2, lnmVar);
        this.a = (byte) 8;
        this.d = obj;
        this.e = pdw0Var;
    }
}
