package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.functions.Consumer;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import io.reactivex.rxjava3.core.Single;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b201 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b201(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                return new b201((sen0) this.c, (Consumer) obj2, lnmVar, (byte) 0);
            case 1:
                return new b201((sen0) this.c, (z101) obj2, lnmVar, (byte) 1);
            case 2:
                return new b201((tob1) this.c, (Function0) obj2, lnmVar, (byte) 2);
            case 3:
                return new b201((q401) this.c, (ixb) obj2, lnmVar, (byte) 3);
            case 4:
                return new b201((obl1) this.c, (ven0) obj2, lnmVar, (byte) 4);
            case 5:
                return new b201((r801) this.c, (String) obj2, lnmVar, (byte) 5);
            case 6:
                return new b201((rng1) this.c, (String) obj2, lnmVar, (byte) 6);
            case 7:
                b201 b201Var = new b201((ze01) obj2, lnmVar, (byte) 7);
                b201Var.c = obj;
                return b201Var;
            case 8:
                return new b201((rf01) this.c, (zy70) obj2, lnmVar, (byte) 8);
            case 9:
                return new b201((x8c0) this.c, (hj01) obj2, lnmVar, (byte) 9);
            case 10:
                return new b201((ll01) this.c, (iu30) obj2, lnmVar, (byte) 10);
            case 11:
                b201 b201Var2 = new b201((cm01) obj2, lnmVar, (byte) 11);
                b201Var2.c = obj;
                return b201Var2;
            case 12:
                b201 b201Var3 = new b201((waz0) obj2, lnmVar, (byte) 12);
                b201Var3.c = obj;
                return b201Var3;
            case 13:
                b201 b201Var4 = new b201((an01) obj2, lnmVar, (byte) 13);
                b201Var4.c = obj;
                return b201Var4;
            case 14:
                return new b201((on01) this.c, (trc0) obj2, lnmVar, (byte) 14);
            case 15:
                return new b201((vr01) this.c, (String) obj2, lnmVar, (byte) 15);
            case 16:
                return new b201((xtb0) this.c, (fv01) obj2, lnmVar, (byte) 16);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                b201 b201Var5 = new b201((kv01) obj2, lnmVar, (byte) 17);
                b201Var5.c = obj;
                return b201Var5;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new b201((gx01) this.c, (String) obj2, lnmVar, (byte) 18);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new b201((x711) this.c, (String) obj2, lnmVar, (byte) 19);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new b201((x711) this.c, (bqr0) obj2, lnmVar, (byte) 20);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                b201 b201Var6 = new b201((oa11) obj2, lnmVar, (byte) 21);
                b201Var6.c = obj;
                return b201Var6;
            case 22:
                return new b201((o4e0) this.c, (zc7) obj2, lnmVar, (byte) 22);
            case 23:
                return new b201((s6z0) this.c, (qvc0) obj2, lnmVar, (byte) 23);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new b201((s6z0) this.c, (rxc0) obj2, lnmVar, (byte) 24);
            case 25:
                return new b201((zgz0) this.c, (qvc0) obj2, lnmVar, (byte) 25);
            case 26:
                return new b201((zgz0) this.c, (rxc0) obj2, lnmVar, (byte) 26);
            case 27:
                return new b201((k811) this.c, (rvk) obj2, lnmVar, (byte) 27);
            case 28:
                return new b201((vi11) this.c, (String) obj2, lnmVar, (byte) 28);
            default:
                return new b201((pzx) this.c, (hti0) obj2, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9n.a;
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
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return create((Map) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
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

    public final Object invokeSuspend(Object obj) {
        Object objE;
        Object objB;
        byte b = this.a;
        d9n d9nVar = rih1.a;
        Object obj2 = this.d;
        d9n d9nVar2 = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        hm5.M(obj);
                    }
                    return null;
                }
                hm5.M(obj);
                sen0 sen0Var = (sen0) this.c;
                Consumer consumer = (Consumer) obj2;
                consumer.getClass();
                vi viVar = new vi(consumer, (byte) 11);
                this.b = true;
                if (sen0Var.collect(viVar, this) == d9nVar2) {
                    return d9nVar2;
                }
                jah.d();
                return null;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    return ((sen0) this.c).emit((z101) obj2, this) == d9nVar2 ? d9nVar2 : d9nVar;
                }
                if (z2) {
                    hm5.M(obj);
                    return d9nVar;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarU = rqt0.u(rwq.q(new bu2((tob1) this.c, (byte) 18)));
                bfb bfbVar = new bfb((Function0) obj2, (byte) 1);
                this.b = true;
                return mr20VarU.collect(bfbVar, this) == d9nVar2 ? d9nVar2 : d9nVar;
            case 3:
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                q401 q401Var = (q401) this.c;
                this.b = true;
                ohd ohdVar = new ohd(1, aym.t(this));
                ohdVar.t();
                ohdVar.n(new fbz0(q401Var.a.d(new j3y0(obj2, (Object) ohdVar, (byte) 20)), (byte) 21));
                return ohdVar.r() == d9nVar2 ? d9nVar2 : d9nVar;
            case 4:
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                obl1 obl1Var = (obl1) this.c;
                ezc ezcVarG = yoi1.g(obl1Var.h.observeOn(obl1Var.c));
                mp0 mp0Var = new mp0((ven0) obj2, (byte) 22);
                this.b = true;
                return ezcVarG.collect(mp0Var, this) == d9nVar2 ? d9nVar2 : d9nVar;
            case 5:
                boolean z6 = this.b;
                if (z6) {
                    if (z6) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarB = ((tag1) ((r801) this.c).f.get()).b((String) obj2);
                this.b = true;
                Object objI = b5p1.i(mr20VarB, this);
                return objI == d9nVar2 ? d9nVar2 : objI;
            case 6:
                boolean z7 = this.b;
                if (!z7) {
                    hm5.M(obj);
                    mr20 mr20VarA = ((rng1) this.c).a((String) obj2);
                    this.b = true;
                    return b5p1.i(mr20VarA, this) == d9nVar2 ? d9nVar2 : d9nVar;
                }
                if (z7) {
                    hm5.M(obj);
                    return d9nVar;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                vr20 vr20Var = (vr20) this.c;
                boolean z8 = this.b;
                if (z8) {
                    if (z8) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ze01 ze01Var = (ze01) obj2;
                cyh1 cyh1Var = new cyh1(ze01Var.b, ze01Var.a);
                this.c = null;
                this.b = true;
                return vr20Var.emit(cyh1Var, this) == d9nVar2 ? d9nVar2 : d9nVar;
            case 8:
                boolean z9 = this.b;
                if (z9) {
                    if (z9) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                this.b = true;
                int i = rf01.f;
                Object objB2 = ((rf01) this.c).b((zy70) obj2, 1, this);
                return objB2 == d9nVar2 ? d9nVar2 : objB2;
            case 9:
                boolean z10 = this.b;
                if (z10) {
                    if (z10) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                x8c0 x8c0Var = (x8c0) this.c;
                aj01 aj01Var = new aj01((hj01) obj2, null, (byte) 0);
                this.b = true;
                return z8p1.t(x8c0Var, w8c0.d, aj01Var, this) == d9nVar2 ? d9nVar2 : d9nVar;
            case 10:
                boolean z11 = this.b;
                if (z11) {
                    if (z11) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                dt71 dt71Var = ((ll01) this.c).e.a;
                qv7 qv7Var = new qv7((iu30) obj2, (byte) 28);
                this.b = true;
                dt71Var.collect(qv7Var, this);
                return d9nVar2;
            case 11:
                vr20 vr20Var2 = (vr20) this.c;
                boolean z12 = this.b;
                if (z12) {
                    if (z12) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                List listC = cm01.c(((dma1) ((cm01) obj2).a.get()).e(cm01.c, (String) null));
                this.c = null;
                this.b = true;
                return vr20Var2.emit(listC, this) == d9nVar2 ? d9nVar2 : d9nVar;
            case 12:
                vr20 vr20Var3 = (vr20) this.c;
                boolean z13 = this.b;
                if (z13) {
                    if (z13) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bbz0 bbz0VarA = ((waz0) obj2).a();
                this.c = null;
                this.b = true;
                return vr20Var3.emit(bbz0VarA, this) == d9nVar2 ? d9nVar2 : d9nVar;
            case 13:
                vr20 vr20Var4 = (vr20) this.c;
                boolean z14 = this.b;
                if (!z14) {
                    hm5.M(obj);
                    this.c = null;
                    this.b = true;
                    return vr20Var4.emit((an01) obj2, this) == d9nVar2 ? d9nVar2 : d9nVar;
                }
                if (z14) {
                    hm5.M(obj);
                    return d9nVar;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                boolean z15 = this.b;
                if (z15) {
                    if (z15) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                rsc0 rsc0Var = ((on01) this.c).a;
                this.b = true;
                Object objF = rsc0Var.f("spotify:playlist:37i9dQZF1Fs6Dvo6yu9lo4", (trc0) obj2, this);
                return objF == d9nVar2 ? d9nVar2 : objF;
            case 15:
                boolean z16 = this.b;
                if (z16) {
                    if (z16) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                vr01 vr01Var = (vr01) this.c;
                xyc0 xyc0Var = vr01Var.d;
                this.b = true;
                Object objP = xyc0Var.p(vr01Var.p, (String) obj2, true, false, this);
                return objP == d9nVar2 ? d9nVar2 : objP;
            case 16:
                boolean z17 = this.b;
                if (z17) {
                    if (z17) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                m441 m441VarQ = rwq.q(new nxb0((xtb0) this.c, (byte) 22));
                j0z0 j0z0Var = new j0z0((fv01) obj2, (byte) 6);
                this.b = true;
                return m441VarQ.collect(j0z0Var, this) == d9nVar2 ? d9nVar2 : d9nVar;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                bpb1 bpb1Var = ((kv01) obj2).a;
                Map map = (Map) this.c;
                boolean z18 = this.b;
                if (z18) {
                    if (z18) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                whx0 whx0Var = new whx0(sqg0.O(((whx0) bpb1Var.getValue()).a, map));
                this.c = null;
                this.b = true;
                bpb1Var.emit(whx0Var, this);
                return d9nVar == d9nVar2 ? d9nVar2 : d9nVar;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                boolean z19 = this.b;
                if (z19) {
                    if (z19) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                rsc0 rsc0Var2 = ((gx01) this.c).d;
                hru0 builder = PlaylistRequestDecorationPolicy.n().toBuilder();
                sku0 builder2 = PlaylistDecorationPolicy.o().toBuilder();
                builder2.k0();
                builder.w(builder2.build());
                trc0 trc0Var = new trc0(builder.build(), (g3d0) null, (Set) null, false, (src0) null, jqz0.a, (prc0) null, 0, (List) null, 478);
                this.b = true;
                Object objF2 = rsc0Var2.f((String) obj2, trc0Var, this);
                return objF2 == d9nVar2 ? d9nVar2 : objF2;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                boolean z20 = this.b;
                if (z20) {
                    if (z20) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                x711 x711Var = (x711) this.c;
                l5d0 l5d0Var = x711Var.b;
                ob01 ob01Var = new ob01(x711Var, (String) obj2, (lnm) null, (byte) 3);
                this.b = true;
                Object objE2 = l5d0Var.e(h5d0.N0, ob01Var, this);
                return objE2 == d9nVar2 ? d9nVar2 : objE2;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                bqr0 bqr0Var = (bqr0) obj2;
                boolean z21 = this.b;
                if (z21) {
                    if (z21) {
                        hm5.M(obj);
                        objE = obj;
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                x711 x711Var2 = (x711) this.c;
                l5d0 l5d0Var2 = x711Var2.b;
                ob01 ob01Var2 = new ob01(x711Var2, bqr0Var, (lnm) null, (byte) 4);
                this.b = true;
                objE = l5d0Var2.e(h5d0.h, ob01Var2, this);
                if (objE == d9nVar2) {
                    return d9nVar2;
                }
                oy21 oy21Var = (py21) objE;
                if (!(oy21Var instanceof oy21)) {
                    if (oy21Var instanceof ly21) {
                        return new p711(null);
                    }
                    eg.o();
                    return null;
                }
                String str = (String) oy21Var.a;
                Set set = s4b1.f;
                if (!uic.k(str, new b3i1[]{nyu0.e, wyu0.f})) {
                    return new p711(null);
                }
                bqr0Var.a = fzc0.a(bqr0Var.a, str, null, 5);
                return new p711(str);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                vr20 vr20Var5 = (vr20) this.c;
                boolean z22 = this.b;
                if (z22) {
                    if (z22) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ((oa11) obj2).h((String) null, true);
                this.c = null;
                this.b = true;
                return vr20Var5.emit(pa11.a, this) == d9nVar2 ? d9nVar2 : d9nVar;
            case 22:
                List list = ((zc7) obj2).e;
                boolean z23 = this.b;
                if (!z23) {
                    hm5.M(obj);
                    sx3 sx3Var = (sx3) ((o4e0) this.c).b;
                    this.b = true;
                    objB = sx3Var.b(list, this);
                    if (objB == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (!z23) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objB = obj;
                }
                Set set2 = (Set) objB;
                List list2 = list;
                int iS = zno1.s(q7h.U(list2, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Object obj3 : list2) {
                    linkedHashMap.put(obj3, Boolean.valueOf(set2.contains((String) obj3)));
                }
                return new cd7(linkedHashMap);
            case 23:
                boolean z24 = this.b;
                if (z24) {
                    if (z24) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                rsc0 rsc0Var3 = (xrc0) ((s6z0) this.c).b;
                this.b = true;
                Object objI2 = rsc0Var3.i((qvc0) obj2, this);
                return objI2 == d9nVar2 ? d9nVar2 : objI2;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                boolean z25 = this.b;
                if (z25) {
                    if (z25) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                rsc0 rsc0Var4 = (xrc0) ((s6z0) this.c).b;
                this.b = true;
                Object objJ = rsc0Var4.j((rxc0) obj2, this);
                return objJ == d9nVar2 ? d9nVar2 : objJ;
            case 25:
                boolean z26 = this.b;
                if (z26) {
                    if (z26) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                rsc0 rsc0Var5 = (xrc0) ((zgz0) this.c).b;
                this.b = true;
                Object objI3 = rsc0Var5.i((qvc0) obj2, this);
                return objI3 == d9nVar2 ? d9nVar2 : objI3;
            case 26:
                boolean z27 = this.b;
                if (z27) {
                    if (z27) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                rsc0 rsc0Var6 = (xrc0) ((zgz0) this.c).b;
                this.b = true;
                Object objJ2 = rsc0Var6.j((rxc0) obj2, this);
                return objJ2 == d9nVar2 ? d9nVar2 : objJ2;
            case 27:
                rvk rvkVar = (rvk) obj2;
                boolean z28 = this.b;
                if (z28) {
                    if (z28) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                eg40 eg40Var = (eg40) ((k811) this.c).b;
                String str2 = rvkVar.a;
                String str3 = rvkVar.b;
                String str4 = rvkVar.d;
                dkn dknVar = new dkn(str2, str3, str4 != null ? Collections.singletonList(str4) : z6x.a, rqg0.F(rvkVar.c), 16);
                this.b = true;
                Object objB3 = eg40Var.b(dknVar, this);
                return objB3 == d9nVar2 ? d9nVar2 : objB3;
            case 28:
                boolean z29 = this.b;
                if (z29) {
                    if (z29) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                eny enyVar = (eny) ((vi11) this.c).d;
                String str5 = (String) obj2;
                Set set3 = s4b1.f;
                Single singleA = enyVar.a(str5, uic.x(str5).c);
                this.b = true;
                Object objJ3 = fc11.j(singleA, this);
                return objJ3 == d9nVar2 ? d9nVar2 : objJ3;
            default:
                boolean z30 = this.b;
                if (z30) {
                    if (z30) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                hl00 hl00Var = (hl00) ((pzx) this.c).b;
                String str6 = ((hti0) obj2).a;
                this.b = true;
                Object objA = hl00Var.a(str6, this);
                return objA == d9nVar2 ? d9nVar2 : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b201(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
    }
}
