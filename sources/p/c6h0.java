package p;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcelable;
import app.rive.ViewModelInstance;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.musicquizservice.v1.GetShareCardForQuizResponse;
import com.spotify.wrapped.v1.proto.ClassicContent;
import com.spotify.wrapped.v1.proto.StoryCard;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c6h0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6h0(c9n c9nVar, bs91 bs91Var, String str, Function0 function0, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 29;
        this.e = c9nVar;
        this.c = bs91Var;
        this.d = str;
        this.b = function0;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.d;
        Object obj3 = this.b;
        Object obj4 = this.e;
        switch (b) {
            case 0:
                return new c6h0(this.c, obj2, obj3, obj4, lnmVar, (byte) 0);
            case 1:
                return new c6h0((iu30) obj3, (ven0) this.c, (ven0) obj2, (ven0) obj4, lnmVar);
            case 2:
                c6h0 c6h0Var = new c6h0(obj2, obj3, obj4, lnmVar, (byte) 2);
                c6h0Var.c = obj;
                return c6h0Var;
            case 3:
                return new c6h0(this.c, obj2, obj3, obj4, lnmVar, (byte) 3);
            case 4:
                return new c6h0(this.c, obj2, obj3, obj4, lnmVar, (byte) 4);
            case 5:
                return new c6h0(this.c, obj2, obj3, obj4, lnmVar, (byte) 5);
            case 6:
                return new c6h0(this.c, obj2, obj3, obj4, lnmVar, (byte) 6);
            case 7:
                return new c6h0(this.c, obj2, obj3, obj4, lnmVar, (byte) 7);
            case 8:
                return new c6h0(this.c, (iu30) obj3, obj2, (ven0) obj4, lnmVar, (byte) 8);
            case 9:
                return new c6h0(this.c, obj2, obj3, obj4, lnmVar, (byte) 9);
            case 10:
                c6h0 c6h0Var2 = new c6h0(obj2, obj3, obj4, lnmVar, (byte) 10);
                c6h0Var2.c = obj;
                return c6h0Var2;
            case 11:
                c6h0 c6h0Var3 = new c6h0(obj2, obj3, obj4, lnmVar, (byte) 11);
                c6h0Var3.c = obj;
                return c6h0Var3;
            case 12:
                c6h0 c6h0Var4 = new c6h0(obj2, obj3, obj4, lnmVar, (byte) 12);
                c6h0Var4.c = obj;
                return c6h0Var4;
            case 13:
                return new c6h0(this.c, (iu30) obj3, obj2, (ven0) obj4, lnmVar, (byte) 13);
            case 14:
                c6h0 c6h0Var5 = new c6h0((iu30) obj3, obj2, obj4, lnmVar, (byte) 14);
                c6h0Var5.c = obj;
                return c6h0Var5;
            case 15:
                c6h0 c6h0Var6 = new c6h0(this.d, obj3, (String) obj4, lnmVar, (byte) 15);
                c6h0Var6.c = obj;
                return c6h0Var6;
            case 16:
                c6h0 c6h0Var7 = new c6h0(this.d, obj3, (String) obj4, lnmVar, (byte) 16);
                c6h0Var7.c = obj;
                return c6h0Var7;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new c6h0(this.c, (iu30) obj3, obj2, (ven0) obj4, lnmVar, (byte) 17);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                c6h0 c6h0Var8 = new c6h0((iu30) obj3, obj2, obj4, lnmVar, (byte) 18);
                c6h0Var8.c = obj;
                return c6h0Var8;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new c6h0(this.c, (iu30) obj3, obj2, (ven0) obj4, lnmVar, (byte) 19);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new c6h0(this.c, obj2, obj3, obj4, lnmVar, (byte) 20);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new c6h0(this.c, obj2, obj3, obj4, lnmVar, (byte) 21);
            case 22:
                return new c6h0(this.c, obj2, obj3, obj4, lnmVar, (byte) 22);
            case 23:
                return new c6h0(this.c, obj2, obj3, obj4, lnmVar, (byte) 23);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                c6h0 c6h0Var9 = new c6h0(obj2, obj3, obj4, lnmVar, (byte) 24);
                c6h0Var9.c = obj;
                return c6h0Var9;
            case 25:
                c6h0 c6h0Var10 = new c6h0(obj2, obj3, obj4, lnmVar, (byte) 25);
                c6h0Var10.c = obj;
                return c6h0Var10;
            case 26:
                c6h0 c6h0Var11 = new c6h0(this.d, obj3, obj4, lnmVar, (byte) 26);
                c6h0Var11.c = obj;
                return c6h0Var11;
            case 27:
                return new c6h0((Parcelable) this.c, (hl71) obj2, obj4, (iu30) obj3, lnmVar, (byte) 27);
            case 28:
                return new c6h0((Parcelable) this.c, (hl71) obj2, obj4, (iu30) obj3, lnmVar, (byte) 28);
            default:
                return new c6h0((c9n) obj4, (bs91) this.c, (String) obj2, (Function0) obj3, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 4:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 5:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 6:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 7:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 8:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 9:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((Map) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 13:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 14:
                create((v0y0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 15:
                create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 16:
                create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                create((gdy0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 22:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 23:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 25:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 26:
                create((cen0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 27:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 28:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    public final Object invokeSuspend(Object obj) {
        VideoSurfaceView videoSurfaceView;
        Object xzx0Var;
        Object pcy0Var;
        ClassicContent classicContentR;
        int i;
        zuj1 zuj1Var;
        Function0 function0;
        byte b = this.a;
        z6x z6xVar = null;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.d;
        Object obj3 = this.b;
        Object obj4 = this.e;
        switch (b) {
            case 0:
                hm5.M(obj);
                if (!((a6h0) this.c).d) {
                    new LinkedHashMap();
                }
                return rih1Var;
            case 1:
                hm5.M(obj);
                if (((Boolean) ((ven0) this.c).getValue()).booleanValue()) {
                    ((ven0) obj2).setValue(Boolean.FALSE);
                    ((iu30) obj3).invoke((tv80) ((ven0) obj4).getValue());
                }
                return rih1Var;
            case 2:
                c9n c9nVar = (c9n) this.c;
                hm5.M(obj);
                n8b1 n8b1Var = (n8b1) obj3;
                fn31.T(c9nVar, (o8n) null, 0, new lxm0((o95) obj2, n8b1Var, null, (byte) 0), 3);
                return fn31.T(c9nVar, (o8n) null, 0, new lxm0((o95) obj4, n8b1Var, null, (byte) 1), 3);
            case 3:
                hm5.M(obj);
                ((f1n0) this.c).a.a((String) obj2, (tv80) obj3, (Bundle) obj4);
                return rih1Var;
            case 4:
                hm5.M(obj);
                GetShareCardForQuizResponse getShareCardForQuizResponse = (GetShareCardForQuizResponse) this.c;
                xh71.b((xh71) ((p410) obj3).c, new wa71((String) obj2, (String) null, mqo1.G(sqg0.J(new mmr0[]{new mmr0("challenge_id", getShareCardForQuizResponse.o().n()), new mmr0("fallback", "getapp")})), (dqi1) null, getShareCardForQuizResponse.p(), (String) null, (Bundle) null, 106), mno1.h(new mmr0[]{new mmr0("music_quiz.share.completion_id", getShareCardForQuizResponse.n())}), new vm71("music-quiz-challenge"), (tv80) obj4, (List) null, 16);
                return rih1Var;
            case 5:
                hm5.M(obj);
                lsm0 lsm0Var = (lsm0) this.c;
                if (lsm0Var != null) {
                    AtomicLong atomicLong = bcn0.a;
                    r091 r091Var = (r091) ((tob1) obj2).getValue();
                    if (r091Var != null && (videoSurfaceView = (VideoSurfaceView) ((ven0) obj3).getValue()) != null && !((Boolean) ((ven0) obj4).getValue()).booleanValue()) {
                        r091Var.i(videoSurfaceView);
                        r091Var.c();
                        if (!(((i091) r091Var.g.getValue()).h instanceof k091)) {
                            r091Var.j();
                        }
                        r091Var.b(lsm0Var);
                        r091.f(r091Var, (tv80) null, (Long) null, hky0.a, 7);
                    }
                }
                return rih1Var;
            case 6:
                Map map = (Map) obj2;
                hm5.M(obj);
                mhg1 mhg1Var = (mhg1) this.c;
                Object objP0 = mhg1Var.a.P0();
                hrr0 hrr0Var = mhg1Var.d;
                if (u890.j(objP0, hrr0Var.getValue())) {
                    uvj uvjVar = (uvj) obj4;
                    Iterator it = ((List) ((tob1) obj3).getValue()).iterator();
                    while (it.hasNext()) {
                        uvjVar.m((hnn0) it.next());
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : map.entrySet()) {
                        if (!u890.j(entry.getKey(), ((hnn0) hrr0Var.getValue()).f)) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    Iterator it2 = linkedHashMap.entrySet().iterator();
                    while (it2.hasNext()) {
                        map.remove(((Map.Entry) it2.next()).getKey());
                    }
                }
                return rih1Var;
            case 7:
                ven0 ven0Var = (ven0) obj4;
                hm5.M(obj);
                if (((kmp0) this.c).e && !((Boolean) ven0Var.getValue()).booleanValue()) {
                    ven0Var.setValue(Boolean.TRUE);
                    ((gmt) ((pt) obj2).e).o((g471) obj3, false);
                }
                return rih1Var;
            case 8:
                mwq0 mwq0Var = (mwq0) this.c;
                hm5.M(obj);
                ven0 ven0Var2 = (ven0) obj4;
                if (((Boolean) ven0Var2.getValue()).booleanValue() && !mwq0Var.a()) {
                    ((iu30) obj3).invoke((Object) null);
                    ((Function0) obj2).invoke();
                }
                ven0Var2.setValue(Boolean.valueOf(mwq0Var.a()));
                return rih1Var;
            case 9:
                hm5.M(obj);
                ((b1r0) this.c).a.n((String) obj2, (String) obj3, (Bundle) obj4, false);
                return rih1Var;
            case 10:
                c9n c9nVar2 = (c9n) this.c;
                hm5.M(obj);
                return fn31.q(c9nVar2, (o8n) null, 0, new glu0(obj2, obj3, obj4, (lnm) null, (byte) 0), 3);
            case 11:
                Map map2 = (Map) this.c;
                hm5.M(obj);
                String str = (String) obj3;
                oqc0 oqc0Var = (oqc0) obj4;
                String str2 = oqc0Var.a;
                int i2 = oqc0Var.b;
                List list = oqc0Var.c;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it3 = list.iterator();
                while (true) {
                    boolean zHasNext = it3.hasNext();
                    wls0 wls0Var = wls0.b;
                    if (!zHasNext) {
                        return new iqi0(str, str2, i2, new x7i1(false, (exc0) null, (rc50) null, false, false, false, false, false, 8191), wls0Var, arrayList);
                    }
                    nqc0 nqc0Var = (nqc0) it3.next();
                    x4i1 x4i1Var = nqc0Var.a;
                    boolean z = nqc0Var.b;
                    int i3 = nqc0Var.d;
                    int i4 = nqc0Var.e;
                    cji0 cji0Var = (cji0) map2.get(x4i1Var.a);
                    if (cji0Var == null) {
                        cji0Var = cji0.a;
                    }
                    arrayList.add(new fji0(x4i1Var, i3, z, i4, cji0Var, wls0Var));
                }
                break;
            case 12:
                c9n c9nVar3 = (c9n) this.c;
                hm5.M(obj);
                gfw0 gfw0Var = (gfw0) obj2;
                String str3 = (String) obj3;
                p731 p731Var = gfw0Var.d;
                if (p731Var != null) {
                    p731Var.e(str3, new hzu0(gfw0Var, str3, (byte) 21));
                }
                jr30 jr30Var = gfw0Var.I;
                jr30Var.getClass();
                fn31.T(c9nVar3, (o8n) null, 0, new gr30((r091) obj4, jr30Var, str3, c9nVar3, (lnm) null), 3);
                return rih1Var;
            case 13:
                hm5.M(obj);
                ((ven0) obj4).setValue(((g431) ((bsn) ((pt) this.c).g).get()).a(i7w0.c, new mff((byte) 3, (c0y0) obj2, (iu30) obj3)));
                return rih1Var;
            case 14:
                v0y0 v0y0Var = (v0y0) this.c;
                hm5.M(obj);
                iu30 iu30Var = (iu30) obj3;
                c0y0 c0y0Var = (c0y0) obj2;
                wzx0 wzx0Var = (wzx0) obj4;
                ArrayList arrayList2 = wzx0Var.c;
                String str4 = wzx0Var.a;
                String str5 = wzx0Var.b;
                if (v0y0Var instanceof u0y0) {
                    u0y0 u0y0Var = (u0y0) v0y0Var;
                    xzx0Var = new yzx0(c0y0Var.a(), u0y0Var.a, false, u0y0Var.b, u0y0Var.d);
                } else if (v0y0Var instanceof t0y0) {
                    xzx0Var = new a0y0(c0y0Var.a(), ((t0y0) v0y0Var).b);
                } else if (v0y0Var instanceof r0y0) {
                    xzx0Var = new b0y0(str5, arrayList2, str4);
                } else {
                    if (!(v0y0Var instanceof s0y0)) {
                        eg.o();
                        return null;
                    }
                    s0y0 s0y0Var = (s0y0) v0y0Var;
                    xzx0Var = w0y0.a[l1d.C(s0y0Var.c)] == 1 ? new xzx0(c0y0Var.a(), s0y0Var.a, s0y0Var.b) : new b0y0(str5, arrayList2, str4);
                }
                iu30Var.invoke(xzx0Var);
                return rih1Var;
            case 15:
                hm5.M(obj);
                ((sb7) obj3).a((String) obj4, ((v1y0) obj2).a);
                return rih1Var;
            case 16:
                hm5.M(obj);
                s3y0 s3y0Var = (s3y0) obj2;
                ktv.b((ktv) obj3, (String) obj4, s3y0Var.a, s3y0Var.b, s3y0Var.c, 8);
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                hm5.M(obj);
                ((ven0) obj4).setValue(((g431) ((bsn) ((cm0) this.c).e).get()).a(i7w0.c, new mff((byte) 4, (ncy0) obj2, (iu30) obj3)));
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                gdy0 gdy0Var = (gdy0) this.c;
                hm5.M(obj);
                iu30 iu30Var2 = (iu30) obj3;
                tcy0 tcy0Var = (tcy0) ((tob1) obj4).getValue();
                ncy0 ncy0Var = (ncy0) obj2;
                String str6 = ncy0Var.a;
                if (gdy0Var instanceof cdy0) {
                    ocy0 ocy0Var = tcy0Var instanceof ocy0 ? (ocy0) tcy0Var : null;
                    if (ocy0Var != null) {
                        if (!o7h.d1(ocy0Var.c, 4).equals(o7h.d1(((cdy0) gdy0Var).b, 4))) {
                            ocy0Var = null;
                        }
                        if (ocy0Var != null) {
                            z6xVar = ocy0Var.d;
                        }
                    }
                    if (z6xVar == null) {
                        z6xVar = z6x.a;
                    }
                    String str7 = ncy0Var.b;
                    if (str7 == null) {
                        str7 = ((cdy0) gdy0Var).a;
                    }
                    pcy0Var = new ocy0(str6, str7, ((cdy0) gdy0Var).b, z6xVar);
                } else if (gdy0Var instanceof edy0) {
                    pcy0Var = new rcy0(str6, ((edy0) gdy0Var).a);
                } else if (gdy0Var instanceof ddy0) {
                    qcy0 qcy0Var = tcy0Var instanceof qcy0 ? (qcy0) tcy0Var : null;
                    if (qcy0Var == null || !u890.j(qcy0Var.c, ((ddy0) gdy0Var).b)) {
                        qcy0Var = null;
                    }
                    ddy0 ddy0Var = (ddy0) gdy0Var;
                    pcy0Var = new qcy0(str6, ddy0Var.a, ddy0Var.b, ddy0Var.c, ddy0Var.d, ddy0Var.e, qcy0Var != null ? qcy0Var.g : null, qcy0Var != null ? qcy0Var.h : null, qcy0Var != null ? qcy0Var.i : false, false);
                } else {
                    if (!(gdy0Var instanceof fdy0)) {
                        eg.o();
                        return null;
                    }
                    fdy0 fdy0Var = (fdy0) gdy0Var;
                    pcy0Var = new pcy0(str6, fdy0Var.a, fdy0Var.b);
                }
                iu30Var2.invoke(pcy0Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                hm5.M(obj);
                ((cir0) this.c).j(new wiz0((iu30) obj3, (ven0) obj2, (ven0) obj4));
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                hm5.M(obj);
                if (((String) this.c) != null) {
                    StoryCard storyCard = ((wgm1) ((ven0) obj3).getValue()).a;
                    if ((storyCard == null || (classicContentR = storyCard.r()) == null || !classicContentR.G()) ? false : true) {
                        ven0 ven0Var3 = (ven0) obj4;
                        rhz0 rhz0Var = (rhz0) ven0Var3.getValue();
                        ven0Var3.setValue(new rhz0(rhz0Var.a, rhz0Var.b, rhz0Var.c, rhz0Var.d, rhz0Var.e, rhz0Var.f, (String) this.c, rhz0Var.h, rhz0Var.i, rhz0Var.j));
                    }
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                hm5.M(obj);
                wmy wmyVar = (wmy) this.c;
                b431 b431Var = (b431) wmyVar.f;
                ou80 ou80Var = (ou80) obj2;
                z6xVar = ou80Var != null ? ou80Var.a : null;
                String str8 = (String) obj3;
                tgf tgfVar = (tgf) wmyVar.d;
                List<gxz0> list2 = (List) obj4;
                ArrayList arrayList3 = new ArrayList(q7h.U(list2, 10));
                for (gxz0 gxz0Var : list2) {
                    boolean zJ = u890.j(gxz0Var.c.a, tgfVar.c);
                    w4i1 w4i1Var = gxz0Var.c;
                    arrayList3.add(new c401(new b401(w4i1Var.a, w4i1Var.b, w4i1Var.d, w4i1Var.c), gxz0Var.b, zJ, zJ || !tgfVar.g));
                }
                b431Var.a(new d401(str8, arrayList3), z6xVar);
                return rih1Var;
            case 22:
                hm5.M(obj);
                for (z830 z830Var : ((fcf0) this.c).f.values()) {
                    Context context = (Context) obj2;
                    z830Var.getClass();
                    String str9 = z830Var.c;
                    try {
                        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), xcg1.i((String) obj3, z830Var.a, (String) obj4));
                        try {
                            typefaceCreateFromAsset.getClass();
                            boolean zH0 = ihc1.h0(str9, "Italic", false);
                            boolean zH1 = ihc1.h0(str9, "Bold", false);
                            if (zH0 && zH1) {
                                i = 3;
                            } else if (zH0) {
                                i = 2;
                            } else {
                                i = zH1 ? 1 : 0;
                            }
                            if (typefaceCreateFromAsset.getStyle() != i) {
                                typefaceCreateFromAsset = Typeface.create(typefaceCreateFromAsset, i);
                            }
                            z830Var.d = typefaceCreateFromAsset;
                        } catch (Exception unused) {
                            nue0.b();
                        }
                    } catch (Exception unused2) {
                        nue0.b();
                    }
                }
                return rih1Var;
            case 23:
                ven0 ven0Var4 = (ven0) obj3;
                hm5.M(obj);
                ven0 ven0Var5 = (ven0) this.c;
                if ((((xuj1) ven0Var5.getValue()).a instanceof ruj1) && (function0 = (Function0) ((ven0) obj2).getValue()) != null) {
                    function0.invoke();
                }
                tuj1 tuj1Var = ((xuj1) ven0Var5.getValue()).a;
                if ((tuj1Var instanceof uuj1) || (tuj1Var instanceof puj1) || (tuj1Var instanceof suj1)) {
                    zuj1Var = evj1.a;
                } else if ((tuj1Var instanceof ruj1) || (tuj1Var instanceof quj1)) {
                    zuj1Var = dvj1.a;
                } else if (tuj1Var instanceof tuj1) {
                    zuj1Var = ((xuj1) ven0Var5.getValue()).b != null ? new zuj1(tuj1Var.a) : bvj1.a;
                } else {
                    if (!(tuj1Var instanceof vuj1)) {
                        eg.o();
                        return null;
                    }
                    zuj1Var = avj1.a;
                }
                if (!zuj1Var.equals((fvj1) ven0Var4.getValue())) {
                    ven0Var4.setValue(zuj1Var);
                    iu30 iu30Var3 = (iu30) ((ven0) obj4).getValue();
                    if (iu30Var3 != null) {
                        iu30Var3.invoke(zuj1Var);
                    }
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                c9n c9nVar4 = (c9n) this.c;
                hm5.M(obj);
                vj31 vj31Var = (vj31) obj2;
                mm31 mm31Var = (mm31) obj3;
                ViewModelInstance viewModelInstance = (ViewModelInstance) obj4;
                for (Map.Entry entry2 : vj31Var.a.entrySet()) {
                    fn31.T(c9nVar4, (o8n) null, 0, new km31(mm31Var, viewModelInstance, (String) entry2.getKey(), (ven0) entry2.getValue(), (lnm) null, (byte) 0), 3);
                }
                for (Map.Entry entry3 : vj31Var.b.entrySet()) {
                    fn31.T(c9nVar4, (o8n) null, 0, new km31(mm31Var, viewModelInstance, (String) entry3.getKey(), (ven0) entry3.getValue(), (lnm) null, (byte) 1), 3);
                }
                for (Map.Entry entry4 : vj31Var.c.entrySet()) {
                    fn31.T(c9nVar4, (o8n) null, 0, new km31(mm31Var, viewModelInstance, (String) entry4.getKey(), (ven0) entry4.getValue(), (lnm) null, (byte) 2), 3);
                }
                for (Map.Entry entry5 : vj31Var.d.entrySet()) {
                    fn31.T(c9nVar4, (o8n) null, 0, new km31(mm31Var, viewModelInstance, (String) entry5.getKey(), (ven0) entry5.getValue(), (lnm) null, (byte) 3), 3);
                }
                for (Map.Entry entry6 : vj31Var.e.entrySet()) {
                    fn31.T(c9nVar4, (o8n) null, 0, new km31(mm31Var, viewModelInstance, (String) entry6.getKey(), (ven0) entry6.getValue(), (lnm) null, (byte) 4), 3);
                }
                return rih1Var;
            case 25:
                c9n c9nVar5 = (c9n) this.c;
                hm5.M(obj);
                q741 q741Var = (q741) obj2;
                slc0 slc0Var = (slc0) obj3;
                fn31.T(c9nVar5, (o8n) null, 0, new o741(q741Var, slc0Var, (f841) obj4, (lnm) null, (byte) 0), 3);
                q741Var.d.startActivityForResult(((a741) q741Var.c.get()).a(slc0Var), 5436);
                return rih1Var;
            case 26:
                hm5.M(obj);
                cen0 cen0Var = (cen0) this.c;
                mnv0 mnv0Var = (mnv0) obj3;
                if (obj2 != null) {
                    cen0Var.a(mnv0Var, obj2);
                } else {
                    if (cen0Var.b.get()) {
                        eg.m("Do mutate preferences once returned to DataStore.");
                        return null;
                    }
                    cen0Var.a.remove(mnv0Var);
                }
                mnv0 mnv0Var2 = nm61.c;
                ((nm61) obj4).c(cen0Var);
                return rih1Var;
            case 27:
                hl71 hl71Var = (hl71) obj2;
                te71 te71Var = ((ei71) obj4).g;
                hm5.M(obj);
                gi71 gi71Var = (ii71) this.c;
                if (gi71Var instanceof gi71) {
                    gi71 gi71Var2 = gi71Var;
                    if (!u890.j(gi71Var2.a, hl71Var) || !u890.j(gi71Var2.h, te71Var)) {
                        ((iu30) obj3).invoke(gi71.a(gi71Var2, hl71Var, (ArrayList) null, te71Var, 126));
                    }
                }
                return rih1Var;
            case 28:
                te71 te71Var2 = ((ri71) obj4).e;
                hl71 hl71Var2 = (hl71) obj2;
                hm5.M(obj);
                ui71 ui71Var = (wi71) this.c;
                if (ui71Var instanceof ui71) {
                    ui71 ui71Var2 = ui71Var;
                    if (!u890.j(ui71Var2.b, hl71Var2) || !u890.j(ui71Var2.h, te71Var2)) {
                        ((iu30) obj3).invoke(new ui71(ui71Var2.a, hl71Var2, ui71Var2.c, ui71Var2.d, ui71Var2.e, ui71Var2.f, ui71Var2.g, te71Var2));
                    }
                }
                return rih1Var;
            default:
                hm5.M(obj);
                fn31.T((c9n) obj4, (o8n) null, 0, new uk71((bs91) this.c, (String) obj2, (Function0) obj3, (lnm) null, (byte) 1), 3);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c6h0(Object obj, Object obj2, Object obj3, Object obj4, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
        this.e = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c6h0(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.e = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c6h0(Object obj, Object obj2, String str, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.e = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c6h0(Object obj, iu30 iu30Var, Object obj2, ven0 ven0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.b = iu30Var;
        this.d = obj2;
        this.e = ven0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c6h0(Parcelable parcelable, hl71 hl71Var, Object obj, iu30 iu30Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = parcelable;
        this.d = hl71Var;
        this.e = obj;
        this.b = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c6h0(iu30 iu30Var, Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = iu30Var;
        this.d = obj;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6h0(iu30 iu30Var, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 1;
        this.b = iu30Var;
        this.c = ven0Var;
        this.d = ven0Var2;
        this.e = ven0Var3;
    }
}
