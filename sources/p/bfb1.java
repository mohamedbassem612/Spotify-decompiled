package p;

import android.os.Bundle;
import android.view.View;
import com.spotify.campaigns.storytelling.container.StorytellingContainerFragment;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import spotify.collection.esperanto.proto.CollectionTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bfb1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bfb1(r7e1 r7e1Var, nav0 nav0Var, boolean z, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 10;
        this.d = r7e1Var;
        this.e = nav0Var;
        this.b = z;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                bfb1 bfb1Var = new bfb1(this.d, obj2, lnmVar, (byte) 0);
                bfb1Var.c = obj;
                return bfb1Var;
            case 1:
                return new bfb1((ayb1) this.c, (rvb1) this.d, (String) obj2, lnmVar, (byte) 1);
            case 2:
                return new bfb1((nl9) this.c, (iu30) this.d, (ven0) obj2, lnmVar, (byte) 2);
            case 3:
                return new bfb1((f8c1) this.c, (String) this.d, (bpb1) obj2, lnmVar, (byte) 3);
            case 4:
                return new bfb1((StorytellingContainerFragment) this.c, (fbc1) this.d, (fbc1) obj2, lnmVar, (byte) 4);
            case 5:
                return new bfb1((rwj) this.c, (bsc1) this.d, (iu30) obj2, lnmVar, (byte) 5);
            case 6:
                return new bfb1(this.d, obj2, lnmVar, (byte) 6);
            case 7:
                bfb1 bfb1Var2 = new bfb1(this.d, obj2, lnmVar, (byte) 7);
                bfb1Var2.c = obj;
                return bfb1Var2;
            case 8:
                return new bfb1((g2e1) this.c, (i2e1) this.d, (iag1) obj2, lnmVar, (byte) 8);
            case 9:
                return new bfb1((r7e1) this.c, (nav0) this.d, (qga0) obj2, lnmVar, (byte) 9);
            case 10:
                bfb1 bfb1Var3 = new bfb1((r7e1) this.d, (nav0) obj2, this.b, lnmVar);
                bfb1Var3.c = obj;
                return bfb1Var3;
            case 11:
                return new bfb1((tbe1) this.c, (vbe1) this.d, (tqw) obj2, lnmVar, (byte) 11);
            case 12:
                bfb1 bfb1Var4 = new bfb1(this.d, obj2, lnmVar, (byte) 12);
                bfb1Var4.c = obj;
                return bfb1Var4;
            case 13:
                return new bfb1((lte1) this.c, (ven0) this.d, (ven0) obj2, lnmVar, (byte) 13);
            case 14:
                return new bfb1(this.b, (rk41) this.c, (ane1) this.d, (hdn0) obj2, lnmVar, (byte) 14);
            case 15:
                bfb1 bfb1Var5 = new bfb1(this.d, obj2, lnmVar, (byte) 15);
                bfb1Var5.c = obj;
                return bfb1Var5;
            case 16:
                return new bfb1((z2f1) this.c, (q2f1) this.d, (iu30) obj2, lnmVar, (byte) 16);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                bfb1 bfb1Var6 = new bfb1(this.d, obj2, lnmVar, (byte) 17);
                bfb1Var6.c = obj;
                return bfb1Var6;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new bfb1(this.b, (View) this.c, (String) this.d, (lz20) obj2, lnmVar, (byte) 18);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new bfb1(this.b, (gdf1) this.c, (View) this.d, (lz20) obj2, lnmVar, (byte) 19);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                bfb1 bfb1Var7 = new bfb1(this.d, obj2, lnmVar, (byte) 20);
                bfb1Var7.c = obj;
                return bfb1Var7;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new bfb1((rsf1) this.c, (String) this.d, (String) obj2, lnmVar, (byte) 21);
            case 22:
                bfb1 bfb1Var8 = new bfb1(this.d, obj2, lnmVar, (byte) 22);
                bfb1Var8.c = obj;
                return bfb1Var8;
            case 23:
                return new bfb1((hke) this.c, (jmb1) this.d, (wtt0) obj2, lnmVar, (byte) 23);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                bfb1 bfb1Var9 = new bfb1(this.d, obj2, lnmVar, (byte) 24);
                bfb1Var9.c = obj;
                return bfb1Var9;
            case 25:
                return new bfb1((i5g1) this.c, (b5g1) this.d, (tv80) obj2, lnmVar, (byte) 25);
            case 26:
                return new bfb1((j7g1) this.c, (iu30) this.d, (o8n) obj2, lnmVar, (byte) 26);
            case 27:
                bfb1 bfb1Var10 = new bfb1(this.d, obj2, lnmVar, (byte) 27);
                bfb1Var10.c = obj;
                return bfb1Var10;
            case 28:
                bfb1 bfb1Var11 = new bfb1(this.d, obj2, lnmVar, (byte) 28);
                bfb1Var11.c = obj;
                return bfb1Var11;
            default:
                return new bfb1((k9) obj2, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
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
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 15:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9n.a;
            case 23:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
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
        saa0 saa0Var;
        Object objS;
        Object objJ;
        String strG;
        AtomicReference atomicReference;
        Object objS2;
        Object objA;
        Object objE;
        xgn0 xgn0Var;
        byte b = this.a;
        int i = 3;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        rih1 rih1Var2 = d9n.a;
        Object obj2 = this.e;
        byte b2 = 1;
        bwn0 bwn0Var = null;
        switch (b) {
            case 0:
                vr20 vr20Var = (vr20) this.c;
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                yeb1 yeb1VarY = ryn1.y((yeb1) obj2, (Map) ((gfb1) this.d).a.getValue());
                this.c = null;
                this.b = true;
                return vr20Var.emit(yeb1VarY, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 1:
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
                this.b = true;
                se11 se11Var = ayb1.l;
                Object objA2 = ((ayb1) this.c).a((rvb1) this.d, (String) obj2, this);
                return objA2 == rih1Var2 ? rih1Var2 : objA2;
            case 2:
                nl9 nl9Var = (nl9) this.c;
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                uv61 uv61Var = (uv61) nl9Var.t;
                x010 x010Var = new x010(uv61Var.d, uv61Var.f, new bu51(i, (lnm) null, b2), (byte) 1);
                p651 p651Var = new p651(nl9Var, (iu30) this.d, (ven0) obj2, (lnm) null, (byte) 23);
                this.b = true;
                return l4p1.q(x010Var, p651Var, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 3:
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    pp31 pp31Var = ((f8c1) this.c).h;
                    String str = (String) this.d;
                    this.b = true;
                    if (pp31Var.c(str, this) == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z5) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((bpb1) obj2).m((Object) null, Boolean.FALSE);
                return rih1Var;
            case 4:
                boolean z6 = this.b;
                if (z6) {
                    if (z6) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                j810 j810Var = ((StorytellingContainerFragment) this.c).K1;
                if (j810Var == null) {
                    u890.C("externalShareSheetEvents");
                    throw null;
                }
                ccb1 ccb1Var = new ccb1((fbc1) this.d, (fbc1) obj2, (byte) 12);
                this.b = true;
                Object objCollect = zro1.w(j810Var).collect(new vi(ccb1Var, (byte) 6), this);
                if (objCollect != rih1Var2) {
                    objCollect = rih1Var;
                }
                return objCollect == rih1Var2 ? rih1Var2 : rih1Var;
            case 5:
                boolean z7 = this.b;
                if (z7) {
                    if (z7) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                o860 o860Var = (o860) ((rwj) this.c).e;
                x010 x010Var2 = new x010((mr20) o860Var.d, (mr20) o860Var.e, new dwf0((bsc1) this.d, bwn0Var, (byte) 28), (byte) 1);
                py5 py5Var = new py5((iu30) obj2, (lnm) null, (byte) 8);
                this.b = true;
                return l4p1.q(x010Var2, py5Var, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 6:
                llm llmVar = (llm) obj2;
                boolean z8 = this.b;
                try {
                    if (!z8) {
                        hm5.M(obj);
                        uw0 uw0Var = (uw0) this.d;
                        saa0Var = (ayh) uw0Var.b;
                        this.c = saa0Var;
                        this.b = true;
                        objS = uw0Var.s(this);
                        if (objS == rih1Var2) {
                            return rih1Var2;
                        }
                    } else {
                        if (!z8) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        saa0 saa0Var2 = (ayh) this.c;
                        hm5.M(obj);
                        saa0Var = saa0Var2;
                        objS = obj;
                    }
                    saa0Var.m0(objS);
                    smo1.p(llmVar, (CancellationException) null);
                    return rih1Var;
                } catch (Throwable th) {
                    smo1.p(llmVar, (CancellationException) null);
                    throw th;
                }
            case 7:
                boolean z9 = this.b;
                if (z9) {
                    if (z9) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                c9n c9nVar = (c9n) this.c;
                mr20 mr20VarC = ((idn0) this.d).c();
                mib mibVar = new mib(c9nVar, (o95) obj2, (byte) 20);
                this.b = true;
                return mr20VarC.collect(mibVar, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 8:
                boolean z10 = this.b;
                if (z10) {
                    if (z10) {
                        hm5.M(obj);
                        objJ = obj;
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                lag1 lag1Var = ((g2e1) this.c).c;
                i2e1 i2e1Var = (i2e1) this.d;
                Single singleA = lag1Var.a(i2e1Var.c, i2e1Var.e, (iag1) obj2);
                this.b = true;
                objJ = fc11.j(singleA, this);
                if (objJ == rih1Var2) {
                    return rih1Var2;
                }
                if (!((hag1) objJ).h) {
                    objJ = null;
                }
                hag1 hag1Var = (hag1) objJ;
                if (hag1Var != null) {
                    return o7h.y0(hag1Var.e, "\n", (String) null, (String) null, vxd1.U0, 30);
                }
                return null;
            case 9:
                boolean z11 = this.b;
                if (z11) {
                    if (z11) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                r7e1 r7e1Var = (r7e1) this.c;
                nav0 nav0Var = (nav0) this.d;
                qga0 qga0Var = (qga0) obj2;
                this.b = true;
                r7e1Var.getClass();
                Object objQ = sio1.q(nav0Var, new h7e1(r7e1Var, qga0Var), new i7e1(r7e1Var, qga0Var), this);
                if (objQ != rih1Var2) {
                    objQ = rih1Var;
                }
                if (objQ != rih1Var2) {
                    objQ = rih1Var;
                }
                if (objQ != rih1Var2) {
                    objQ = rih1Var;
                }
                return objQ == rih1Var2 ? rih1Var2 : rih1Var;
            case 10:
                hm5.M(obj);
                c9n c9nVar2 = (c9n) this.c;
                r7e1 r7e1Var2 = (r7e1) this.d;
                nav0 nav0Var2 = (nav0) obj2;
                fn31.T(c9nVar2, (o8n) null, 4, new x4e1(r7e1Var2, nav0Var2, null, (byte) 4), 1);
                boolean z12 = this.b;
                fn31.T(c9nVar2, (o8n) null, 4, new p7e1(nav0Var2, r7e1Var2, z12, (lnm) null), 1).L(new tea(r7e1Var2, (byte) 2));
                return fn31.T(c9nVar2, (o8n) null, 4, new p7e1(r7e1Var2, nav0Var2, z12, (lnm) null), 1);
            case 11:
                boolean z13 = this.b;
                if (!z13) {
                    hm5.M(obj);
                    tbe1 tbe1Var = (tbe1) this.c;
                    sbe1 sbe1Var = tbe1Var.d;
                    if (sbe1Var instanceof qbe1) {
                        strG = pcf.d(6, ((qbe1) sbe1Var).a, (String) null);
                    } else if (sbe1Var instanceof rbe1) {
                        strG = pcf.g(tbe1Var.a);
                    } else {
                        eg.o();
                    }
                    String str2 = strG;
                    f1n0 f1n0Var = (f1n0) ((vbe1) this.d).d;
                    tqw tqwVar = (tqw) obj2;
                    tv80 tv80VarY = tqwVar != null ? n3o1.y(tqwVar) : null;
                    dwn0 dwn0Var = new dwn0(str2, "", false, false, 0, 0, false, (a690) null, (Bundle) null, tv80VarY != null ? new bwn0(tv80VarY) : null);
                    this.b = true;
                    return f1n0.d(f1n0Var, dwn0Var, this) == rih1Var2 ? rih1Var2 : rih1Var;
                }
                if (z13) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                y880 y880Var = (y880) this.d;
                vr20 vr20Var2 = (vr20) this.c;
                boolean z14 = this.b;
                if (z14) {
                    if (z14) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ArrayList arrayListC = y880.c(((gpt) obj2).a, ((g0l) y880Var.b.get()).i());
                hd80 hd80Var = arrayListC != null ? new hd80(new ufe1(arrayListC), (xpw) ((ynb0) y880Var.c).get()) : null;
                this.c = null;
                this.b = true;
                return vr20Var2.emit(hd80Var, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 13:
                lte1 lte1Var = (lte1) this.c;
                ven0 ven0Var = (ven0) this.d;
                ven0 ven0Var2 = (ven0) obj2;
                boolean z15 = this.b;
                if (!z15) {
                    hm5.M(obj);
                    cjc0 cjc0Var = rje1.a;
                    Boolean bool = (Boolean) ven0Var.getValue();
                    if (bool == null || bool.booleanValue() == lte1Var.e) {
                        return rih1Var;
                    }
                    ven0Var.setValue((Object) null);
                    ven0Var2.setValue(Boolean.valueOf(lte1Var.e));
                    if (!((Boolean) ven0Var2.getValue()).booleanValue()) {
                        return rih1Var;
                    }
                    this.b = true;
                    if (hap1.i(800L, this) == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z15) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                cjc0 cjc0Var2 = rje1.a;
                ven0Var2.setValue(Boolean.FALSE);
                return rih1Var;
            case 14:
                hm5.M(obj);
                if (this.b && !((rk41) this.c).a) {
                    ane1 ane1Var = (ane1) this.d;
                    xgm1 xgm1Var = ane1Var.e;
                    xgm1Var.a(igm1.a);
                    xgm1Var.a(fgm1.a);
                    h290 h290Var = ane1Var.a;
                    err0 err0Var = (hdn0) obj2;
                    ine1.e((SceneTemplate.TimeMachineContent.Card2.YearEntry) h290Var.get(err0Var.s()), xgm1Var);
                    ane1Var.n.invoke(((SceneTemplate.TimeMachineContent.Card2.YearEntry) h290Var.get(err0Var.s())).u());
                }
                return rih1Var;
            case 15:
                boolean z16 = this.b;
                if (!z16) {
                    hm5.M(obj);
                    c9n c9nVar3 = (c9n) this.c;
                    atomicReference = new AtomicReference(null);
                    bj81 bj81Var = new bj81((vu30) this.d, (t8e1) obj2, c9nVar3, atomicReference, (lnm) null, (byte) 9);
                    this.c = atomicReference;
                    this.b = true;
                    objS2 = smo1.s(bj81Var, this);
                    if (objS2 == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z16) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    atomicReference = (AtomicReference) this.c;
                    hm5.M(obj);
                    objS2 = obj;
                }
                faa0 faa0Var = (faa0) atomicReference.get();
                if (faa0Var != null) {
                    faa0Var.d((CancellationException) null);
                }
                return objS2;
            case 16:
                z2f1 z2f1Var = (z2f1) this.c;
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
                mr20 mr20VarU = rqt0.u(h5p1.q(new cly0(d3p1.F(z2f1Var.c, lvx.m(), rih1Var), (byte) 15), z2f1Var.i, rqt0.u(new mt(z2f1Var.X, (byte) 29)), rqt0.u(new kr41(((roc0) z2f1Var.e).d(), (byte) 12)), z2f1Var.g, new u2f1((q2f1) this.d, null)));
                py5 py5Var2 = new py5((iu30) obj2, (lnm) null, (byte) 9);
                this.b = true;
                return l4p1.q(mr20VarU, py5Var2, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                g7m1 g7m1Var = (g7m1) this.d;
                c9n c9nVar4 = (c9n) this.c;
                boolean z18 = this.b;
                if (!z18) {
                    hm5.M(obj);
                    SceneTemplate.TopPlaylistsContent.Single singleJ = g7m1Var.a.q().J();
                    t7f1 t7f1Var = (t7f1) obj2;
                    ecf1 ecf1Var = new ecf1(fn31.q(c9nVar4, (o8n) null, 0, new fcf1(singleJ, g7m1Var, t7f1Var, (lnm) null), 3), fn31.q(c9nVar4, (o8n) null, 0, new fcf1(g7m1Var, singleJ, t7f1Var, (lnm) null), 3), pwo1.v(t7f1Var.c, t7f1Var.d), singleJ, (lnm) null);
                    this.c = null;
                    this.b = true;
                    objA = u3k.a.a(ecf1Var, this);
                    if (objA == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z18) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objA = obj;
                }
                return (wj41) objA;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                hm5.M(obj);
                if (this.b) {
                    ((View) this.c).announceForAccessibility((String) this.d);
                    try {
                        lz20.b((lz20) obj2);
                        break;
                    } catch (IllegalStateException unused) {
                    }
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                gdf1 gdf1Var = (gdf1) this.c;
                lfa1 lfa1Var = gdf1Var.a;
                hm5.M(obj);
                if (this.b) {
                    if (lfa1Var.f.length() > 0) {
                        ((View) this.d).announceForAccessibility(lfa1Var.f);
                    }
                    if (!gdf1Var.f) {
                        try {
                            lz20.b((lz20) obj2);
                            break;
                        } catch (IllegalStateException unused2) {
                        }
                    }
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                vr20 vr20Var3 = (vr20) this.c;
                boolean z19 = this.b;
                if (z19) {
                    if (z19) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                w6x w6xVar = ((rsf1) this.d).a0;
                ((CollectionTrack) obj2).s().getLink();
                w6xVar.getClass();
                this.c = null;
                this.b = true;
                return vr20Var3.emit(j5.a, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
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
                rsc0 rsc0Var = ((rsf1) this.c).b;
                String str3 = (String) this.d;
                List listSingletonList = Collections.singletonList((String) obj2);
                this.b = true;
                rsc0 rsc0Var2 = rsc0Var;
                Object objH = c921.H(rsc0Var2.c, new n0a0(str3, listSingletonList, rsc0Var2, (lnm) null), this);
                return objH == rih1Var2 ? rih1Var2 : objH;
            case 22:
                vr20 vr20Var4 = (vr20) this.c;
                boolean z21 = this.b;
                if (z21) {
                    if (!z21) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        hm5.M(obj);
                    }
                    return null;
                }
                p811 p811VarU = cy30.u(obj);
                zob1 zob1Var = (zob1) this.d;
                l8z l8zVar = new l8z((String) obj2, p811VarU, vr20Var4, (byte) 1);
                this.c = null;
                this.b = true;
                if (zob1Var.collect(l8zVar, this) == rih1Var2) {
                    return rih1Var2;
                }
                jah.d();
                return null;
            case 23:
                hke hkeVar = (hke) this.c;
                boolean z22 = this.b;
                if (!z22) {
                    hm5.M(obj);
                    this.b = true;
                    objE = hkeVar.e(this);
                    if (objE == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z22) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objE = obj;
                }
                if (((Boolean) objE).booleanValue() && ((jmb1) this.d).g.a(1) != q1v.e) {
                    vtt0 vtt0Var = (wtt0) obj2;
                    if ((vtt0Var instanceof vtt0) && vtt0Var.a == ttt0.d) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                hyf1 hyf1Var = (hyf1) obj2;
                tva1 tva1Var = (tva1) this.d;
                d0r d0rVar = tva1Var.b;
                ssw0 ssw0Var = (ssw0) this.c;
                boolean z23 = this.b;
                if (z23) {
                    if (z23) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ay8 ay8VarF = d3p1.F(d0rVar, (o3r) tva1Var.c, hyf1Var);
                sua suaVar = ey71.a;
                ve01 ve01VarR = d5p1.r(ay8VarF, ssw0Var, suaVar, 1);
                evz evzVarS = h5p1.s(ve01VarR, d5p1.r(d3p1.F(d0rVar, (o3r) tva1Var.N0, hyf1Var), ssw0Var, suaVar, 1), hu20.e(rqt0.u(new mpy0(ve01VarR, tva1Var, hyf1Var, (byte) 26)), new afb1((lnm) bwn0Var, (Object) tva1Var, (byte) 5)), new w63(tva1Var, (lnm) null, (byte) 26));
                k641 k641Var = new k641(ssw0Var, (lnm) null, (byte) 1);
                this.c = null;
                this.b = true;
                return l4p1.q(evzVarS, k641Var, this) == rih1Var2 ? rih1Var2 : rih1Var;
            case 25:
                boolean z24 = this.b;
                if (z24) {
                    if (z24) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ylt0 ylt0Var = ((i5g1) this.c).h;
                a5g1 a5g1Var = (b5g1) this.d;
                this.b = true;
                return ylt0.b(ylt0Var, new qlt0(a5g1Var.a.a), a5g1Var.c, a5g1Var.e, a5g1Var.d, (tv80) obj2, hjk0.a, this, 64) == rih1Var2 ? rih1Var2 : rih1Var;
            case 26:
                j7g1 j7g1Var = (j7g1) this.c;
                boolean z25 = this.b;
                try {
                    if (!z25) {
                        hm5.M(obj);
                        mr20 mr20Var = j7g1Var.d;
                        i6e1 i6e1Var = new i6e1((o8n) obj2, j7g1Var, (byte) 8);
                        this.b = true;
                        if (mr20Var.collect(i6e1Var, this) == rih1Var2) {
                            rih1Var = rih1Var2;
                        }
                    } else {
                        if (!z25) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    return rih1Var;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th2) {
                    ((iu30) this.d).invoke(th2);
                    return rih1Var;
                }
            case 27:
                k7g1 k7g1Var = (k7g1) this.d;
                c9n c9nVar5 = (c9n) this.c;
                boolean z26 = this.b;
                try {
                    if (!z26) {
                        hm5.M(obj);
                        c7m0 c7m0Var = k7g1Var.d;
                        this.c = null;
                        this.b = true;
                        c7m0Var.invoke(c9nVar5, this);
                        if (rih1Var == rih1Var2) {
                            rih1Var = rih1Var2;
                        }
                    } else {
                        if (!z26) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    return rih1Var;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th3) {
                    ((iu30) obj2).invoke(th3);
                    return rih1Var;
                }
            case 28:
                sfg1 sfg1Var = (sfg1) obj2;
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
                c9n c9nVar6 = (c9n) this.c;
                fn31.T(c9nVar6, (o8n) null, 4, new l3g1(sfg1Var, (lnm) null), 1);
                nav0 nav0Var3 = (nav0) this.d;
                xeo0 xeo0Var = new xeo0(sfg1Var, c9nVar6, (lnm) null);
                this.b = true;
                return s9p1.D(nav0Var3, xeo0Var, this) == rih1Var2 ? rih1Var2 : rih1Var;
            default:
                k9 k9Var = (k9) obj2;
                boolean z28 = this.b;
                if (!z28) {
                    hm5.M(obj);
                    jo51 jo51Var = (jo51) k9Var;
                    gw91 gw91Var = jo51Var.i;
                    if (gw91Var != null) {
                        gw91Var.d(jo51Var, bno1.a, jo51Var.h);
                    }
                    xgn0Var = jo51Var.Y;
                    this.c = xgn0Var;
                    this.d = k9Var;
                    this.b = true;
                    if (xgn0Var.a(this) == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z28) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k9Var = (k9) this.d;
                    xgn0Var = (xgn0) this.c;
                    hm5.M(obj);
                }
                xgn0 xgn0Var2 = xgn0Var;
                try {
                    ((jo51) k9Var).e = ((jo51) k9Var).c.getValue();
                    ohd ohdVar = ((jo51) k9Var).X;
                    if (ohdVar != null) {
                        ohdVar.resumeWith(((jo51) k9Var).c.getValue());
                    }
                    ((jo51) k9Var).X = null;
                    return rih1Var;
                } finally {
                    xgn0Var2.c((Object) null);
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bfb1(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bfb1(k9 k9Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 29;
        this.e = k9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bfb1(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bfb1(boolean z, Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = z;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
