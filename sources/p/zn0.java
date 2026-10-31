package p;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import com.spotify.adsinternal.adscore.model.Format;
import com.spotify.aipartner.aipartnerapi.proto.Entity;
import com.spotify.aipartner.aipartnerapi.proto.ResolveIntentRequest;
import com.spotify.aipartner.aipartnerapi.proto.ResolveIntentResponse;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.playlist.proto.CreationInfo;
import com.spotify.playlist.proto.ModificationRequest;
import com.spotify.playlist.proto.b;
import io.reactivex.rxjava3.core.Single;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function0;
import spotify.playlist.esperanto.proto.ResponseStatus;
import spotify.playlist.esperanto.proto.RootlistModificationRequest;
import spotify.playlist.esperanto.proto.RootlistModificationResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zn0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn0(String str, List list, np31 np31Var, pp31 pp31Var, String str2, String str3, String str4, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 17;
        this.c = str;
        this.f = list;
        this.g = np31Var;
        this.h = pp31Var;
        this.d = str2;
        this.e = str3;
        this.i = str4;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00bd A[LOOP:0: B:33:0x00b7->B:35:0x00bd, LOOP_END] */
    private final Object e(Object obj) throws Throwable {
        Throwable th;
        ArrayList arrayList;
        Iterator it;
        List list = (List) this.d;
        c9n c9nVar = (c9n) this.c;
        d9n d9nVar = d9n.a;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            if (list.isEmpty()) {
                return rih1.a;
            }
            List list2 = list;
            xk90 xk90Var = (xk90) this.e;
            vhc1 vhc1Var = (vhc1) this.g;
            ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((rzq) xk90Var.a.d).c(((pk90) ((s1v0) it2.next()).b).c().b().a(vhc1Var)));
            }
            try {
                ven0 ven0Var = (ven0) this.h;
                Function0 function0 = (Function0) this.i;
                try {
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        fn31.T(c9nVar, (o8n) null, 0, new f530((c0r) it3.next(), ven0Var, function0, (lnm) null, (byte) 26), 3);
                    }
                    this.c = null;
                    this.f = arrayList2;
                    this.b = true;
                    hap1.f(this);
                    return d9nVar;
                } catch (Throwable th2) {
                    th = th2;
                    arrayList = arrayList2;
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((c0r) it.next()).dispose();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = (ArrayList) this.f;
            try {
                hm5.M(obj);
                throw new KotlinNothingValueException();
            } catch (Throwable th4) {
                th = th4;
            }
        }
        it = arrayList.iterator();
        while (it.hasNext()) {
            ((c0r) it.next()).dispose();
        }
        throw th;
    }

    private final Object g(Object obj) {
        xtb0 xtb0Var = (xtb0) this.e;
        ven0 ven0Var = (ven0) this.c;
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
        Integer num = (Integer) ((ven0) this.f).getValue();
        if (num != null) {
            int iIntValue = num.intValue();
            if (((Boolean) ven0Var.getValue()).booleanValue() && ((hdn0) this.d).s() > 0) {
                mr20 mr20VarU = rqt0.u(rwq.q(new nxb0(xtb0Var, (byte) 8)));
                kyg0 kyg0Var = new kyg0(xtb0Var, iIntValue, (wat) this.g, ven0Var, (ven0) this.h, (hdn0) this.d, (ven0) this.i, null);
                this.b = true;
                Object objQ = l4p1.q(mr20VarU, kyg0Var, this);
                d9n d9nVar = d9n.a;
                if (objQ == d9nVar) {
                    return d9nVar;
                }
            }
        }
        return rih1Var;
    }

    private final Object h(Object obj) {
        d9n d9nVar = d9n.a;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            if (!((is20) this.c).f) {
                bv30 bv30Var = ((poy0) this.d).d.f;
                Object obj2 = ((is20) this.e).d;
                Object state = ((h141) this.g).getState();
                Object obj3 = this.h;
                tqw tqwVar = (tqw) this.i;
                this.f = null;
                this.b = true;
                if (bv30Var.c1(obj2, state, obj3, tqwVar, this) == d9nVar) {
                    return d9nVar;
                }
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
        CreationInfo creationInfoBuild;
        String str = (String) this.d;
        List list = (List) this.f;
        pp31 pp31Var = (pp31) this.h;
        dmr dmrVar = pp31Var.a;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            b bVarR = ModificationRequest.r();
            bVarR.B("create");
            bVarR.C(true);
            bVarR.A((String) this.c);
            bVarR.w("start");
            bVarR.q(list);
            np31 np31Var = (np31) this.g;
            if (np31Var instanceof mp31) {
                fsn fsnVarN = CreationInfo.n();
                fsnVarN.n(hsn.c);
                creationInfoBuild = (CreationInfo) fsnVarN.build();
            } else {
                if (!(np31Var instanceof lp31)) {
                    eg.o();
                    return null;
                }
                fsn fsnVarN2 = CreationInfo.n();
                fsnVarN2.n(hsn.d);
                fsnVarN2.q(((lp31) np31Var).a);
                creationInfoBuild = fsnVarN2.build();
            }
            bVarR.y(creationInfoBuild);
            ModificationRequest modificationRequestBuild = bVarR.build();
            jn7 jn7Var = pp31Var.c;
            jp31 jp31VarN = RootlistModificationRequest.n();
            jp31VarN.q(modificationRequestBuild);
            jp31VarN.n(str == null ? "" : str);
            RootlistModificationRequest rootlistModificationRequestBuild = jp31VarN.build();
            this.b = true;
            obj = jn7Var.O(rootlistModificationRequestBuild, this);
            d9n d9nVar = d9n.a;
            if (obj == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        RootlistModificationResponse rootlistModificationResponse = (RootlistModificationResponse) obj;
        ResponseStatus responseStatusO = rootlistModificationResponse.o();
        if (str == null) {
            str = "";
        }
        oy21 oy21VarL = i2x0.l(responseStatusO, str, new l130(rootlistModificationResponse, (byte) 1));
        if (oy21VarL instanceof oy21) {
            String str2 = (String) oy21VarL.a;
            Object obj2 = this.e;
            Object obj3 = this.i;
            dmrVar.b(str2, (String) obj2, (String) obj3);
            if (!list.isEmpty()) {
                dmrVar.a(str2, (String) obj2, true, (String) obj3, (List) this.f);
            }
        }
        return oy21VarL;
    }

    private final Object j(Object obj) {
        iu30 iu30Var;
        fl71 fl71Var = (hl71) this.e;
        aj71 aj71Var = (aj71) this.c;
        ven0 ven0Var = (ven0) this.i;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            j7d j7dVar = (j7d) ven0Var.getValue();
            ti71 ti71VarJ = j7dVar != null ? aj71.j(j7dVar) : null;
            ui71 ui71Var = (wi71) this.d;
            ui71 ui71Var2 = ui71Var instanceof ui71 ? ui71Var : null;
            boolean zJ = u890.j(ui71Var2 != null ? ui71Var2.b : null, fl71Var);
            boolean z2 = (ui71Var2 != null ? ui71Var2.g : null) != ti71VarJ;
            if ((fl71Var instanceof fl71) && ti71VarJ != null && (!zJ || z2)) {
                iu30 iu30Var2 = (iu30) this.g;
                fl71 fl71Var2 = fl71Var;
                ri71 ri71Var = (ri71) this.h;
                j7d j7dVar2 = (j7d) ven0Var.getValue();
                j7dVar2.getClass();
                ti71 ti71VarJ2 = aj71.j(j7dVar2);
                this.f = iu30Var2;
                this.b = true;
                Object objA = aj71Var.Z.a("sharing.on_platform_destinations_loading", (Object) null, new sew0((Object) aj71Var, (Object) ri71Var, (Object) fl71Var2, (Object) ti71VarJ2, (lnm) null, (byte) 27), this);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
                obj = objA;
                iu30Var = iu30Var2;
            }
            return rih1.a;
        }
        if (!z) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        iu30Var = (iu30) this.f;
        hm5.M(obj);
        iu30Var.invoke(obj);
        return rih1.a;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.h;
        Object obj3 = this.g;
        Object obj4 = this.i;
        Object obj5 = this.e;
        switch (b) {
            case 0:
                return new zn0((ao0) this.f, (String) this.c, (String) this.d, (Long) obj3, (ji0) obj2, (co0) obj4, (String) obj5, lnmVar);
            case 1:
                return new zn0((gx2) this.f, (String) this.c, (tt2) obj3, (List) obj2, (String) this.d, (String) obj5, (dt2) obj4, lnmVar);
            case 2:
                return new zn0((gx2) this.f, (String) this.c, (tt2) obj3, (String) this.d, (String) obj5, (dt2) obj2, (us2) obj4, lnmVar);
            case 3:
                return new zn0(this.f, this.d, (String) this.c, obj5, (Function0) obj3, obj2, obj4, lnmVar, (byte) 3);
            case 4:
                zn0 zn0Var = new zn0(this.c, this.d, obj5, obj3, obj2, obj4, lnmVar, (byte) 4);
                zn0Var.f = obj;
                return zn0Var;
            case 5:
                return new zn0(this.f, this.d, (String) this.c, obj5, (Function0) obj3, obj2, obj4, lnmVar, (byte) 5);
            case 6:
                return new zn0((String) this.c, (Function0) this.f, (pdl) this.d, (kb4) obj5, (ihg0) obj3, (ven0) obj2, (ven0) obj4, lnmVar);
            case 7:
                return new zn0(this.c, this.d, obj5, obj3, obj2, obj4, lnmVar, (byte) 7);
            case 8:
                return new zn0(this.f, this.c, this.d, obj5, obj3, obj2, obj4, lnmVar, (byte) 8);
            case 9:
                return new zn0(this.f, this.c, this.d, obj5, this.g, obj2, obj4, lnmVar, (byte) 9);
            case 10:
                zn0 zn0Var2 = new zn0((q6z) obj5, (u6z) obj3, (String) this.c, (lik1) obj2, (r6z) obj4, lnmVar);
                zn0Var2.d = obj;
                return zn0Var2;
            case 11:
                return new zn0(this.f, this.c, this.d, obj5, obj3, obj2, obj4, lnmVar, (byte) 11);
            case 12:
                zn0 zn0Var3 = new zn0((lqw) this.c, lnmVar, (mqw) this.d, (lqw) obj5, (h141) obj3, this.h, (tqw) obj4, (byte) 12);
                zn0Var3.f = obj;
                return zn0Var3;
            case 13:
                zn0 zn0Var4 = new zn0((List) this.d, (xk90) obj5, (vhc1) obj3, (ven0) obj2, (Function0) obj4, lnmVar);
                zn0Var4.c = obj;
                return zn0Var4;
            case 14:
                zn0 zn0Var5 = new zn0((est) obj3, (j2e0) obj2, (g431) obj4, (String) this.c, (String) this.d, (String) obj5, lnmVar);
                zn0Var5.f = obj;
                return zn0Var5;
            case 15:
                return new zn0(this.f, this.c, this.d, obj5, obj3, obj2, obj4, lnmVar, (byte) 15);
            case 16:
                zn0 zn0Var6 = new zn0((lqw) this.c, lnmVar, (mqw) this.d, (lqw) obj5, (h141) obj3, this.h, (tqw) obj4, (byte) 16);
                zn0Var6.f = obj;
                return zn0Var6;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new zn0((String) this.c, (List) this.f, (np31) obj3, (pp31) obj2, (String) this.d, (String) obj5, (String) obj4, lnmVar);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new zn0(this.c, this.d, obj5, obj3, obj2, obj4, lnmVar, (byte) 18);
            default:
                return new zn0(this.f, this.c, this.d, obj5, obj3, obj2, obj4, lnmVar, (byte) 19);
        }
    }

    public final Object invoke(Object obj, Object obj2) throws Throwable {
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
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9n.a;
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((bst) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws Throwable {
        rih1 rih1Var;
        Long l;
        Object obj2;
        m231 m231Var;
        int i;
        int i2;
        Integer num;
        View.OnClickListener cg1Var;
        Object objP;
        Object objA;
        Uri uri;
        sex0 sex0Var;
        boolean z;
        rzq rzqVar;
        lik1 lik1Var;
        r6z r6zVar;
        q6z q6zVar;
        Single singleJust;
        Object objQ;
        Object objA2;
        mxr mxrVar = null;
        switch (this.a) {
            case 0:
                rih1 rih1Var2 = rih1.a;
                ji0 ji0Var = (ji0) this.h;
                d9n d9nVar = d9n.a;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    jo0 jo0Var = ((ao0) this.f).b;
                    String str = (String) this.c;
                    String str2 = (String) this.d;
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str3 = str2;
                    Long l2 = (Long) this.g;
                    String str4 = ji0Var.h;
                    String str5 = ji0Var.i;
                    String str6 = ji0Var.t;
                    String str7 = ji0Var.Y0.a;
                    String str8 = ji0Var.W0;
                    co0 co0Var = (co0) this.i;
                    Format format = ji0Var.Z;
                    rih1Var = rih1Var2;
                    z6x z6xVar = (List) ji0Var.Q0.get(co0Var.a);
                    if (z6xVar == null) {
                        z6xVar = z6x.a;
                    }
                    z6x z6xVar2 = z6xVar;
                    a7j1 a7j1Var = (a7j1) o7h.s0(ji0Var.g.b);
                    int iLongValue = (a7j1Var == null || (l = a7j1Var.f) == null) ? 0 : (int) l.longValue();
                    String str9 = (String) this.e;
                    this.b = true;
                    int i3 = gr0.a;
                    Object objH = c921.H(jo0Var.b, new io0(str, co0Var, l2, str3, str4, str5, str6, str8, str7, format, iLongValue, z6xVar2, str9, jo0Var, (lnm) null), this);
                    if (objH != d9nVar) {
                        objH = rih1Var;
                    }
                    if (objH == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    rih1Var = rih1Var2;
                }
                return rih1Var;
            case 1:
                d9n d9nVar2 = d9n.a;
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                wr2 wr2Var = ((gx2) this.f).a;
                String str10 = (String) this.c;
                tt2 tt2Var = (tt2) this.g;
                List list = (List) this.h;
                String str11 = (String) this.d;
                String str12 = (String) this.e;
                dt2 dt2Var = (dt2) this.i;
                this.b = true;
                Object objL = wr2Var.l(str10, tt2Var, list, str11, str12, dt2Var, this);
                return objL == d9nVar2 ? d9nVar2 : objL;
            case 2:
                d9n d9nVar3 = d9n.a;
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                wr2 wr2Var2 = ((gx2) this.f).a;
                String str13 = (String) this.c;
                tt2 tt2Var2 = (tt2) this.g;
                String str14 = (String) this.d;
                String str15 = (String) this.e;
                dt2 dt2Var2 = (dt2) this.h;
                us2 us2Var = (us2) this.i;
                this.b = true;
                Object objK = wr2Var2.k(str13, tt2Var2, str14, str15, dt2Var2, us2Var, this);
                return objK == d9nVar3 ? d9nVar3 : objK;
            case 3:
                a13 a13Var = (a13) this.f;
                d9n d9nVar4 = d9n.a;
                boolean z5 = this.b;
                try {
                    if (!z5) {
                        hm5.M(obj);
                        kdy0 kdy0Var = a13Var.b;
                        ResolveIntentRequest resolveIntentRequest = (ResolveIntentRequest) this.d;
                        String str16 = (String) this.c;
                        if (str16 == null) {
                            str16 = "";
                        }
                        q1m q1mVar = (q1m) this.e;
                        this.b = true;
                        Object objI = kdy0Var.i(resolveIntentRequest, str16, q1mVar, this);
                        if (objI == d9nVar4) {
                            return d9nVar4;
                        }
                        obj2 = objI;
                    } else {
                        if (!z5) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        obj2 = ((e331) obj).a;
                    }
                    iu30 iu30Var = (iu30) this.h;
                    vu30 vu30Var = (vu30) this.i;
                    Throwable thA = e331.a(obj2);
                    if (thA == null) {
                        ResolveIntentResponse resolveIntentResponse = (ResolveIntentResponse) obj2;
                        Objects.toString(resolveIntentResponse);
                        h290<Entity> h290VarN = resolveIntentResponse.n();
                        ArrayList arrayList = new ArrayList(q7h.U(h290VarN, 10));
                        for (Entity entity : h290VarN) {
                            myy myyVar = a13Var.d;
                            entity.getClass();
                            arrayList.add(myyVar.d(entity));
                        }
                        iu30Var.invoke(arrayList);
                    } else {
                        g9p1.u(thA, vu30Var);
                    }
                    return rih1.a;
                } catch (CancellationException e) {
                    ((Function0) this.g).invoke();
                    throw e;
                }
            case 4:
                ela elaVar = (ela) this.e;
                cfd cfdVar = (cfd) this.i;
                kt91 kt91Var = (kt91) cfdVar.c;
                bke bkeVar = (bke) this.c;
                m231 m231Var2 = rih1.a;
                d9n d9nVar5 = d9n.a;
                boolean z6 = this.b;
                try {
                    if (!z6) {
                        hm5.M(obj);
                        uie uieVar = (uie) this.d;
                        iu30 iu30Var2 = (iu30) this.g;
                        iu30 iu30Var3 = (iu30) this.h;
                        this.f = null;
                        this.b = true;
                        if (cfd.n(bkeVar, uieVar, elaVar, iu30Var2, iu30Var3, this) == d9nVar5) {
                            return d9nVar5;
                        }
                    } else {
                        if (!z6) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    m231Var = m231Var2;
                    break;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                if (!(m231Var instanceof m231)) {
                    int iOrdinal = bkeVar.ordinal();
                    if (iOrdinal == 0) {
                        i2 = 2131962600;
                    } else if (iOrdinal == 1) {
                        i2 = 2131962603;
                    } else if (iOrdinal == 2) {
                        i2 = 2131962601;
                    } else {
                        if (iOrdinal != 3) {
                            eg.o();
                            return null;
                        }
                        i2 = 2131962604;
                    }
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{Integer.valueOf(i2)});
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                    Integer numValueOf = Integer.valueOf(i2);
                    if (bkeVar == bke.a) {
                        n57.k(true, "Invalid resource ID provided: %s", new Object[]{numValueOf});
                        num = 2131962597;
                        cg1Var = new cg1(cfdVar, elaVar, (byte) 19);
                    } else {
                        num = null;
                        cg1Var = null;
                    }
                    kt91Var.k(new er91((fs91) null, "", numValueOf, (String) null, num, cg1Var, (cvr) null, (xq91) null, false));
                }
                if (e331.a(m231Var) != null) {
                    int iOrdinal2 = bkeVar.ordinal();
                    if (iOrdinal2 == 0) {
                        i = 2131962596;
                    } else if (iOrdinal2 == 1) {
                        i = 2131962599;
                    } else if (iOrdinal2 == 2) {
                        i = 2131962602;
                    } else {
                        if (iOrdinal2 != 3) {
                            eg.o();
                            return null;
                        }
                        i = 2131962605;
                    }
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{Integer.valueOf(i)});
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                    kt91Var.k(new er91((fs91) null, "", Integer.valueOf(i), (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                }
                return m231Var2;
            case 5:
                ven0 ven0Var = (ven0) this.i;
                d9n d9nVar6 = d9n.a;
                boolean z7 = this.b;
                try {
                    if (!z7) {
                        hm5.M(obj);
                        b6t b6tVar = (k6a1) this.f;
                        if (b6tVar != null) {
                            b6tVar.a();
                        }
                        lag lagVar = ((bng) this.d).f;
                        String str17 = (String) this.c;
                        this.b = true;
                        objP = lagVar.p(str17, this);
                        if (objP == d9nVar6) {
                            return d9nVar6;
                        }
                    } else {
                        if (!z7) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objP = obj;
                    }
                    if (((Boolean) objP).booleanValue()) {
                        ((ven0) this.h).setValue(((y7e1) this.e).d().d.toString());
                        ((Function0) this.g).invoke();
                        break;
                    }
                    ven0Var.setValue(Boolean.FALSE);
                    return rih1.a;
                } catch (Throwable th2) {
                    ven0Var.setValue(Boolean.FALSE);
                    throw th2;
                }
            case 6:
                String str18 = (String) this.c;
                ven0 ven0Var2 = (ven0) this.h;
                Function0 function0 = (Function0) this.f;
                rih1 rih1Var3 = rih1.a;
                d9n d9nVar7 = d9n.a;
                boolean z8 = this.b;
                try {
                    try {
                        if (!z8) {
                            hm5.M(obj);
                            if (!((Boolean) ven0Var2.getValue()).booleanValue() && !((Boolean) ((ven0) this.i).getValue()).booleanValue()) {
                                Uri uri2 = Uri.parse(str18);
                                uri2.getClass();
                                if (nhc1.S(uri2.getScheme(), "https", true) && nhc1.S(uri2.getHost(), "mcp-connector-web.spotify.com", true)) {
                                    pdl pdlVar = (pdl) this.d;
                                    this.b = true;
                                    objA = pdlVar.a(uri2, this);
                                    if (objA == d9nVar7) {
                                        return d9nVar7;
                                    }
                                } else {
                                    n57.s("Connector apps authentication received an untrusted URL: " + str18);
                                    function0.invoke();
                                }
                            }
                            return rih1Var3;
                        }
                        if (!z8) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objA = obj;
                        kb4 kb4Var = (kb4) this.e;
                        ihg0 ihg0Var = (ihg0) this.g;
                        Intent intent = (Intent) kb4Var.a.b;
                        intent.setData(uri);
                        intent.putExtra("androidx.browser.auth.extra.REDIRECT_SCHEME", "spotify");
                        ihg0Var.a(intent);
                    } catch (ActivityNotFoundException e3) {
                        n57.s("Failed to launch connector apps authentication: " + e3);
                        function0.invoke();
                    }
                    uri = (Uri) objA;
                    ven0Var2.setValue(Boolean.TRUE);
                    break;
                } catch (CancellationException e4) {
                    throw e4;
                } catch (Throwable th3) {
                    n57.t("Failed to transfer Spotify session for connector authentication", th3);
                    function0.invoke();
                }
                return rih1Var3;
            case 7:
                d9n d9nVar8 = d9n.a;
                boolean z9 = this.b;
                if (!z9) {
                    hm5.M(obj);
                    SharedPreferences sharedPreferences = ((Context) this.c).getSharedPreferences("com.spotify.oops", 0);
                    boolean z10 = sharedPreferences.getBoolean("AndroidProfilingEnabledFromRCProperty", false);
                    boolean z11 = sharedPreferences.getBoolean("DiagnosticReportUploadEnabledFromRCProperty", false);
                    if (!z10) {
                        hg.c((Context) this.c, (ro30) ((km0) this.d).c);
                    }
                    if (!z10 && !z11) {
                        return rih1.a;
                    }
                    yqg yqgVar = (yqg) ((kly0) this.e).get();
                    gma1 gma1Var = (gma1) ((kly0) this.g).get();
                    if (z11) {
                        z1u z1uVar = new z1u((Context) this.c, (ro30) ((km0) this.d).c);
                        z320 z320Var = new z320(new File(((Context) this.c).getFilesDir(), "diagnostic_reports"), (nfa0) ((kly0) this.h).get());
                        y0u y0uVar = new y0u(0, z1uVar, z1u.class, "schedule", "schedule()V", 0, (byte) 0);
                        yqgVar.getClass();
                        y0u y0uVar2 = new y0u(0, yqgVar, yqg.class, "currentTimeMillis", "currentTimeMillis()J", 0, (byte) 1);
                        mxrVar = new mxr(z320Var, y0uVar, y0uVar2, (ro30) ((km0) this.d).c);
                        z320Var.f(((Number) y0uVar2.invoke()).longValue() - 86400000);
                        synchronized (z320.e) {
                            try {
                                List listK = z320Var.k();
                                if ((listK instanceof Collection) && listK.isEmpty()) {
                                    z = false;
                                } else {
                                    Iterator it = listK.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            z = false;
                                        } else if (!new File(((v0u) it.next()).a.getParentFile(), "deferred").exists()) {
                                            z = true;
                                        }
                                    }
                                }
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                        if (z) {
                            ((ro30) mxrVar.d).t("Found pending diagnostic reports during recovery");
                            ((y0u) mxrVar.b).invoke();
                        }
                    }
                    Context context = (Context) this.c;
                    gma1Var.getClass();
                    yqgVar.getClass();
                    d2u d2uVar = new d2u(context, gma1Var, yqgVar);
                    PackageInfo packageInfo = ((Context) this.c).getPackageManager().getPackageInfo(((Context) this.c).getPackageName(), 0);
                    String str19 = packageInfo.versionName;
                    if (str19 == null) {
                        str19 = "";
                    }
                    String str20 = str19;
                    int i4 = Build.VERSION.SDK_INT;
                    ArrayList arrayListO0 = o7h.O0(new dos0(c2u.a.toString(), d2u.b, yqgVar.g().getID(), str20, String.valueOf(i4 >= 28 ? ph5.q(packageInfo) : packageInfo.versionCode), "Android", String.valueOf(i4)), d2uVar.a());
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : arrayListO0) {
                        if (hashSet.add(((dos0) obj3).a)) {
                            arrayList2.add(obj3);
                        }
                    }
                    List listE1 = o7h.e1(16, o7h.a1(arrayList2, new cvt((byte) 2)));
                    hma1 hma1VarEdit = ((dma1) d2uVar.a.getValue()).edit();
                    hma1VarEdit.d(e2u.a, o7h.y0(listE1, "\n", (String) null, (String) null, zlt.Y0, 30));
                    hma1VarEdit.h();
                    sex0 sex0Var2 = new sex0((Context) this.c, qgo1.l((q8n) this.i), d2uVar, new y0u(0, (kly0) this.h, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 2), (ro30) ((km0) this.d).c, new nit(mxrVar, (byte) 4));
                    try {
                        new Integer(Build.VERSION.SDK_INT);
                        if (z11) {
                            sex0Var2.e();
                        }
                        if (z10) {
                            sex0Var2.b();
                        }
                        if (z11) {
                            sex0Var2.d();
                        }
                        this.f = sex0Var2;
                        this.b = true;
                        hap1.f(this);
                        return d9nVar8;
                    } catch (Throwable th5) {
                        th = th5;
                        sex0Var = sex0Var2;
                    }
                } else {
                    if (!z9) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sex0Var = (sex0) this.f;
                    try {
                        hm5.M(obj);
                        throw new KotlinNothingValueException();
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
                sex0Var.a();
                throw th;
            case 8:
                d9n d9nVar9 = d9n.a;
                boolean z12 = this.b;
                if (!z12) {
                    hm5.M(obj);
                    mr20 mr20VarU = rqt0.u(rwq.q(new tr1((y7e1) this.f, (byte) 22)));
                    u3w u3wVar = new u3w((c9n) this.c, (ven0) this.d, (vu30) this.e, (ven0) this.g, (ven0) this.h, (ven0) this.i);
                    this.b = true;
                    if (l4p1.q(mr20VarU, u3wVar, this) == d9nVar9) {
                        return d9nVar9;
                    }
                } else {
                    if (!z12) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 9:
                d9n d9nVar10 = d9n.a;
                boolean z13 = this.b;
                if (z13) {
                    if (z13) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                q8y q8yVar = (q8y) this.f;
                oka1 oka1Var = (oka1) ((p811) this.c).a;
                h1i h1iVar = (h1i) ((p811) this.d).a;
                zy70 zy70Var = (zy70) this.e;
                Object obj4 = this.g;
                dqq0 dqq0Var = (dqq0) ((p811) this.h).a;
                va00 va00Var = (va00) this.i;
                this.b = true;
                Object objB = q8yVar.b(oka1Var, h1iVar, zy70Var, obj4, dqq0Var, va00Var, this);
                return objB == d9nVar10 ? d9nVar10 : objB;
            case 10:
                q6z q6zVar2 = (q6z) this.e;
                vr20 vr20Var = (vr20) this.d;
                d9n d9nVar11 = d9n.a;
                boolean z14 = this.b;
                if (z14) {
                    if (!z14) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rzqVar = (rzq) this.f;
                    try {
                        hm5.M(obj);
                        rzqVar.l();
                        return rih1.a;
                    } catch (Throwable th7) {
                        th = th7;
                        rzqVar.l();
                        throw th;
                    }
                }
                hm5.M(obj);
                j3r j3rVar = rzq.y;
                rzq rzqVarF = l2p1.f(q6zVar2.t.a("android-episode-contextmenuimpl", new nty(q6zVar2, (byte) 10)));
                try {
                    u6z u6zVar = (u6z) this.g;
                    i1z i1zVar = u6zVar.a;
                    LinkedHashMap linkedHashMap = u6zVar.b;
                    String str21 = (String) this.c;
                    lik1 lik1Var2 = (lik1) this.h;
                    r6z r6zVar2 = (r6z) this.i;
                    if (q6z.n(lik1Var2, i1zVar, r6zVar2.a)) {
                        q8n q8nVar = q6zVar2.B;
                        q6zVar = q6zVar2;
                        try {
                            og5 og5Var = new og5((byte) 16, q6zVar, lik1Var2, i1zVar, r6zVar2, rzqVarF, (lnm) null);
                            lik1Var = lik1Var2;
                            rzqVarF = rzqVarF;
                            r6zVar = r6zVar2;
                            singleJust = rqt0.F(q8nVar, og5Var);
                        } catch (Throwable th8) {
                            th = th8;
                            rzqVarF = rzqVarF;
                            rzqVar = rzqVarF;
                            rzqVar.l();
                            throw th;
                        }
                    } else {
                        lik1Var = lik1Var2;
                        r6zVar = r6zVar2;
                        q6zVar = q6zVar2;
                        singleJust = Single.just(j5.a);
                    }
                    ezc ezcVarG = yoi1.g(singleJust.flatMapObservable(new goq(q6zVar, i1zVar, rzqVarF, str21, lik1Var, r6zVar, linkedHashMap, (byte) 26)));
                    this.d = null;
                    this.f = rzqVarF;
                    this.b = true;
                    if (l4p1.s(vr20Var, ezcVarG, this) == d9nVar11) {
                        return d9nVar11;
                    }
                    rzqVar = rzqVarF;
                    rzqVar.l();
                    return rih1.a;
                } catch (Throwable th9) {
                    th = th9;
                }
                break;
            case 11:
                d9n d9nVar12 = d9n.a;
                boolean z15 = this.b;
                if (z15) {
                    if (z15) {
                        throw l1d.v(obj);
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bpb1 bpb1Var = ((wp10) this.f).c.h.e;
                p3m p3mVar = new p3m((vp10) this.c, (ven0) this.d, (ven0) this.e, (ven0) this.g, (ven0) this.h, (ven0) this.i);
                this.b = true;
                bpb1Var.collect(p3mVar, this);
                return d9nVar12;
            case 12:
                d9n d9nVar13 = d9n.a;
                boolean z16 = this.b;
                if (!z16) {
                    hm5.M(obj);
                    if (!((is20) this.c).f) {
                        bv30 bv30Var = ((js20) this.d).d.f;
                        Object obj5 = ((is20) this.e).d;
                        Object state = ((h141) this.g).getState();
                        Object obj6 = this.h;
                        tqw tqwVar = (tqw) this.i;
                        this.f = null;
                        this.b = true;
                        if (bv30Var.c1(obj5, state, obj6, tqwVar, this) == d9nVar13) {
                            return d9nVar13;
                        }
                    }
                } else {
                    if (!z16) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 13:
                return e(obj);
            case 14:
                bst bstVar = (bst) this.f;
                d9n d9nVar14 = d9n.a;
                boolean z17 = this.b;
                if (!z17) {
                    hm5.M(obj);
                    est estVar = (est) this.g;
                    if (estVar != null) {
                        return estVar;
                    }
                    j2e0 j2e0Var = (j2e0) this.h;
                    g431 g431Var = (g431) this.i;
                    String str22 = (String) this.c;
                    String str23 = (String) this.d;
                    String str24 = (String) this.e;
                    this.f = null;
                    this.b = true;
                    j2e0Var.getClass();
                    objQ = j2e0.q(g431Var, bstVar, str22, str23, str24, this);
                    if (objQ == d9nVar14) {
                        return d9nVar14;
                    }
                } else {
                    if (!z17) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objQ = obj;
                }
                return (est) objQ;
            case 15:
                return g(obj);
            case 16:
                return h(obj);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return i(obj);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return j(obj);
            default:
                String strB = (String) this.c;
                apg1 apg1Var = (apg1) this.f;
                nba nbaVar = apg1Var.a;
                d9n d9nVar15 = d9n.a;
                boolean z18 = this.b;
                try {
                    if (!z18) {
                        hm5.M(obj);
                        oih0 oih0Var = apg1Var.b;
                        nih0 nih0Var = new nih0((String) this.c, nbaVar.a.b(), (String) this.d, 0, "com.transsion.globalsearch".equals(strB), (q1m) this.e, 8);
                        this.b = true;
                        objA2 = oih0Var.a(nih0Var, this);
                        if (objA2 == d9nVar15) {
                            return d9nVar15;
                        }
                    } else {
                        if (!z18) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objA2 = obj;
                    }
                    List list2 = (List) objA2;
                    q881 q881Var = apg1Var.c;
                    if (strB == null) {
                        strB = nbaVar.a.b();
                    }
                    ((iu30) this.g).invoke(q881Var.b(list2, strB, (t380) null));
                    break;
                } catch (CancellationException e5) {
                    ((Function0) this.h).invoke();
                    throw e5;
                } catch (Throwable th10) {
                    vu30 vu30Var2 = (vu30) this.i;
                    pih0 pih0Var = pih0.c;
                    String message = th10.getMessage();
                    if (message == null) {
                        message = "Unknown error during search.";
                    }
                    vu30Var2.invoke(pih0Var, message);
                }
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zn0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.g = obj4;
        this.h = obj5;
        this.i = obj6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zn0(Object obj, Object obj2, String str, Object obj3, Function0 function0, Object obj4, Object obj5, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.f = obj;
        this.d = obj2;
        this.c = str;
        this.e = obj3;
        this.g = function0;
        this.h = obj4;
        this.i = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zn0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.f = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.g = obj5;
        this.h = obj6;
        this.i = obj7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn0(String str, Function0 function0, pdl pdlVar, kb4 kb4Var, ihg0 ihg0Var, ven0 ven0Var, ven0 ven0Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 6;
        this.c = str;
        this.f = function0;
        this.d = pdlVar;
        this.e = kb4Var;
        this.g = ihg0Var;
        this.h = ven0Var;
        this.i = ven0Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn0(List list, xk90 xk90Var, vhc1 vhc1Var, ven0 ven0Var, Function0 function0, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 13;
        this.d = list;
        this.e = xk90Var;
        this.g = vhc1Var;
        this.h = ven0Var;
        this.i = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn0(ao0 ao0Var, String str, String str2, Long l, ji0 ji0Var, co0 co0Var, String str3, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 0;
        this.f = ao0Var;
        this.c = str;
        this.d = str2;
        this.g = l;
        this.h = ji0Var;
        this.i = co0Var;
        this.e = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn0(gx2 gx2Var, String str, tt2 tt2Var, String str2, String str3, dt2 dt2Var, us2 us2Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 2;
        this.f = gx2Var;
        this.c = str;
        this.g = tt2Var;
        this.d = str2;
        this.e = str3;
        this.h = dt2Var;
        this.i = us2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn0(gx2 gx2Var, String str, tt2 tt2Var, List list, String str2, String str3, dt2 dt2Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 1;
        this.f = gx2Var;
        this.c = str;
        this.g = tt2Var;
        this.h = list;
        this.d = str2;
        this.e = str3;
        this.i = dt2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn0(est estVar, j2e0 j2e0Var, g431 g431Var, String str, String str2, String str3, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 14;
        this.g = estVar;
        this.h = j2e0Var;
        this.i = g431Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zn0(lqw lqwVar, lnm lnmVar, mqw mqwVar, lqw lqwVar2, h141 h141Var, Object obj, tqw tqwVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = lqwVar;
        this.d = mqwVar;
        this.e = lqwVar2;
        this.g = h141Var;
        this.h = obj;
        this.i = tqwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn0(q6z q6zVar, u6z u6zVar, String str, lik1 lik1Var, r6z r6zVar, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 10;
        this.e = q6zVar;
        this.g = u6zVar;
        this.c = str;
        this.h = lik1Var;
        this.i = r6zVar;
    }
}
