package p;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.protobuf.Empty;
import com.spotify.offline.offlineplugin_proto.EsOfflinePlugin;
import com.spotify.player.model.PlayerState;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import com.spotify.wrapped.v1.proto.StoryCard;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class t6j1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t6j1(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return new t6j1((List) this.b, (u720) obj2, lnmVar, (byte) 0);
            case 1:
                return new t6j1((naj1) this.b, (mjb0) obj2, lnmVar, (byte) 1);
            case 2:
                return new t6j1((uoa) this.b, (hce1) obj2, lnmVar, (byte) 2);
            case 3:
                t6j1 t6j1Var = new t6j1((pnj1) obj2, lnmVar, (byte) 3);
                t6j1Var.b = obj;
                return t6j1Var;
            case 4:
                return new t6j1((nl9) this.b, (tqw) obj2, lnmVar, (byte) 4);
            case 5:
                return new t6j1((rk41) this.b, (oxj1) obj2, lnmVar, (byte) 5);
            case 6:
                return new t6j1((jyj1) this.b, (cyj1) obj2, lnmVar, (byte) 6);
            case 7:
                return new t6j1((jyj1) this.b, (dyj1) obj2, lnmVar, (byte) 7);
            case 8:
                return new t6j1((czj1) this.b, (iu30) obj2, lnmVar, (byte) 8);
            case 9:
                return new t6j1((czj1) this.b, (scx) obj2, lnmVar, (byte) 9);
            case 10:
                return new t6j1((r091) this.b, (lsm0) obj2, lnmVar, (byte) 10);
            case 11:
                return new t6j1((iac0) this.b, (r6k1) obj2, lnmVar, (byte) 11);
            case 12:
                t6j1 t6j1Var2 = new t6j1((uhk1) obj2, lnmVar, (byte) 12);
                t6j1Var2.b = obj;
                return t6j1Var2;
            case 13:
                return new t6j1((iqk1) this.b, (Throwable) obj2, lnmVar, (byte) 13);
            case 14:
                return new t6j1((tuk1) this.b, (tqw) obj2, lnmVar, (byte) 14);
            case 15:
                return new t6j1((bxk1) this.b, (cwk1) obj2, lnmVar, (byte) 15);
            case 16:
                return new t6j1((n0o) this.b, (k7l1) obj2, lnmVar, (byte) 16);
            case 17:
                return new t6j1((ljj1) this.b, (k0t) obj2, lnmVar, (byte) 17);
            case 18:
                return new t6j1((iac0) this.b, (d8l1) obj2, lnmVar, (byte) 18);
            case 19:
                return new t6j1((lvd) this.b, (z7l1) obj2, lnmVar, (byte) 19);
            case 20:
                t6j1 t6j1Var3 = new t6j1((g9l1) obj2, lnmVar, (byte) 20);
                t6j1Var3.b = obj;
                return t6j1Var3;
            case 21:
                return new t6j1((wfx0) this.b, (tfx0) obj2, lnmVar, (byte) 21);
            case 22:
                return new t6j1((o0i) this.b, (vbl1) obj2, lnmVar, (byte) 22);
            case 23:
                return new t6j1((vjr0) this.b, (c380) obj2, lnmVar, (byte) 23);
            case 24:
                return new t6j1((View) this.b, (jkr0) obj2, lnmVar, (byte) 24);
            case 25:
                return new t6j1((EsOfflinePlugin.RemoveCommand) this.b, (jyl1) obj2, lnmVar, (byte) 25);
            case 26:
                t6j1 t6j1Var4 = new t6j1((qzl1) obj2, lnmVar, (byte) 26);
                t6j1Var4.b = obj;
                return t6j1Var4;
            case 27:
                return new t6j1((l8m1) this.b, (c8m1) obj2, lnmVar, (byte) 27);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                t6j1 t6j1Var5 = new t6j1((c8m1) obj2, lnmVar, (byte) 28);
                t6j1Var5.b = obj;
                return t6j1Var5;
            default:
                return new t6j1((g9l1) this.b, (x8m1) obj2, lnmVar, (byte) 29);
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
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
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
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 11:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 12:
                create((op80) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 13:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 14:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 15:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 16:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 17:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 18:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 19:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 20:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 21:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 22:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 23:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 24:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 25:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                create((PlayerState) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 27:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                create((k8m1) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                hm5.M(obj);
                List list = (List) this.b;
                list.clear();
                list.addAll(((u720) this.c).c);
                return rih1.a;
            case 1:
                hm5.M(obj);
                pxc pxcVar = ((naj1) this.b).g;
                mjb0 mjb0Var = (mjb0) this.c;
                pxc.a(pxcVar, mjb0Var.a, new Long(-1L), mjb0Var.b, (String) null, 24);
                return rih1.a;
            case 2:
                hm5.M(obj);
                uoa uoaVar = (uoa) this.b;
                uoaVar.u();
                ((woa) ((hce1) this.c).b).c(uoaVar);
                return rih1.a;
            case 3:
                c9n c9nVar = (c9n) this.b;
                hm5.M(obj);
                pnj1 pnj1Var = (pnj1) this.c;
                FlowableMap flowableMap = pnj1Var.C1;
                vbm[] vbmVarArr = q601.a;
                ve01 ve01VarR = d5p1.r(o4p1.r(new kge(flowableMap), pnj1Var.H1), c9nVar, ey71.a, 1);
                if (!pnj1Var.z2 && pnj1Var.t.a()) {
                    fn31.T(c9nVar, (o8n) null, 0, new lnj1(pnj1Var, (lnm) null, (byte) 0), 3);
                }
                fn31.T(c9nVar, (o8n) null, 0, new nnj1(ve01VarR, pnj1Var, (lnm) null, (byte) 0), 3);
                fn31.T(c9nVar, (o8n) null, 0, new nnj1(ve01VarR, pnj1Var, (lnm) null, (byte) 1), 3);
                return rih1.a;
            case 4:
                hm5.M(obj);
                hqn1.q((lzn0) ((ynb0) ((nl9) this.b).f).get(), pro1.t("videoPodcastsStreamAudioOnly"), (tqw) this.c, (Bundle) null);
                return rih1.a;
            case 5:
                hm5.M(obj);
                boolean z = ((rk41) this.b).b;
                ejj1 ejj1Var = ((oxj1) this.c).a;
                if (z) {
                    ejj1Var.d().p(2);
                } else {
                    ejj1Var.d().o(false);
                }
                return rih1.a;
            case 6:
                hm5.M(obj);
                ((jyj1) this.b).a.c(((cyj1) this.c).a);
                return rih1.a;
            case 7:
                hm5.M(obj);
                kt91 kt91Var = ((jyj1) this.b).b;
                ((dyj1) this.c).getClass();
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131963788});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var.k(new er91((fs91) null, "", 2131963788, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return rih1.a;
            case 8:
                hm5.M(obj);
                if (!((czj1) this.b).b.isEmpty()) {
                    ((iu30) this.c).invoke(oyj1.a);
                }
                return rih1.a;
            case 9:
                hm5.M(obj);
                if (l1d.c(((czj1) this.b).d, 4) >= 0) {
                    ((scx) this.c).a();
                }
                return rih1.a;
            case 10:
                hm5.M(obj);
                r091 r091Var = (r091) this.b;
                if (r091Var != null) {
                    lsm0 lsm0Var = (lsm0) this.c;
                    r091Var.c();
                    r091Var.b(lsm0Var);
                    r091.f(r091Var, (tv80) null, (Long) null, dky0.a, 7);
                }
                return rih1.a;
            case 11:
                hm5.M(obj);
                ((iac0) this.b).getLifecycle().a((r6k1) this.c);
                return rih1.a;
            case 12:
                op80 op80Var = (op80) this.b;
                hm5.M(obj);
                uhk1 uhk1Var = (uhk1) this.c;
                ((ien0) uhk1Var.f).c(uhk1Var.g(op80Var));
                return rih1.a;
            case 13:
                hm5.M(obj);
                ((iqk1) this.b).h((Throwable) this.c);
                return rih1.a;
            case 14:
                hm5.M(obj);
                tuk1 tuk1Var = (tuk1) this.b;
                tqw tqwVar = (tqw) this.c;
                Context context = tuk1Var.g;
                dzh1 dzh1Var = new dzh1(context.getString(2131957636), context.getString(2131957635), "", "", context.getString(2131957790), "", "spotify:upsell:premium_in_app_destination?displayReason=kpop_upsell:listening_parties", context.getString(2131957795), "voting_free_user");
                tv80 tv80VarY = tqwVar != null ? n3o1.y(tqwVar) : null;
                blp blpVar = tuk1Var.e;
                if (tv80VarY != null) {
                    ((ezh1) blpVar.get()).a(dzh1Var, tv80VarY, true);
                } else {
                    ((ezh1) blpVar.get()).b(dzh1Var, true);
                }
                return rih1.a;
            case 15:
                hm5.M(obj);
                ((bxk1) this.b).e.f(new dwn0(((awk1) ((cwk1) this.c)).a, "", false, false, 0, 0, true, (a690) null, (Bundle) null, (cwn0) null));
                return rih1.a;
            case 16:
                hm5.M(obj);
                ((wen0) ((n0o) this.b).i).l(((k7l1) this.c).i);
                return rih1.a;
            case 17:
                hm5.M(obj);
                ljj1 ljj1Var = (ljj1) this.b;
                if (ljj1Var != null) {
                    ((k0t) this.c).c(new vxz(new sqj1(ljj1Var, "watchfeed-entity-explorer-header-artwork", new rqj1(15, false))));
                }
                return rih1.a;
            case 18:
                hm5.M(obj);
                ((iac0) this.b).getLifecycle().a((d8l1) this.c);
                return rih1.a;
            case 19:
                hm5.M(obj);
                lvd lvdVar = (lvd) this.b;
                List list2 = ((z7l1) this.c).a.a.b;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((w7l1) it.next()).f);
                }
                LinkedHashMap linkedHashMap = lvdVar.b;
                for (String str : o7h.K0(lvdVar.a, arrayList)) {
                    bpb1 bpb1Var = (wen0) linkedHashMap.get(str);
                    if (bpb1Var != null) {
                        bpb1Var.m((Object) null, Boolean.FALSE);
                    }
                    linkedHashMap.remove(str);
                }
                lvdVar.a = arrayList;
                return rih1.a;
            case 20:
                c9n c9nVar2 = (c9n) this.b;
                hm5.M(obj);
                g9l1 g9l1Var = (g9l1) this.c;
                fn31.T(c9nVar2, (o8n) null, 0, new f9l1(g9l1Var, null, (byte) 0), 3);
                fn31.T(c9nVar2, (o8n) null, 0, new f9l1(g9l1Var, null, (byte) 1), 3);
                return rih1.a;
            case 21:
                hm5.M(obj);
                wfx0 wfx0Var = (wfx0) this.b;
                Boolean bool = (Boolean) ((tfx0) this.c).f.getValue();
                bool.booleanValue();
                wfx0Var.a.setValue(bool);
                return rih1.a;
            case 22:
                hm5.M(obj);
                ((bpb1) ((o0i) this.b).d.a).m((Object) null, Boolean.FALSE);
                mv2 mv2Var = ((vbl1) this.c).d;
                xab1 xab1Var = (xab1) mv2Var.h;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                mv2Var.h = null;
                return rih1.a;
            case 23:
                hm5.M(obj);
                vjr0 vjr0Var = (vjr0) this.b;
                c380<z0i> c380Var = (c380) this.c;
                LinkedHashMap linkedHashMap2 = vjr0Var.f;
                for (z0i z0iVar : dm61.v0(linkedHashMap2.keySet(), o7h.p1(c380Var))) {
                    xm90 xm90Var = (xm90) linkedHashMap2.get(z0iVar);
                    if (xm90Var != null) {
                        xm90Var.a(n1i.a);
                    }
                    linkedHashMap2.remove(z0iVar);
                }
                for (z0i z0iVar2 : c380Var) {
                    vjr0Var.a(c380Var.indexOf(z0iVar2), z0iVar2);
                }
                vjr0Var.i = c380Var;
                return rih1.a;
            case 24:
                hm5.M(obj);
                View view = (View) this.b;
                Context context2 = view.getContext();
                jkr0 jkr0Var = (jkr0) this.c;
                view.announceForAccessibility(context2.getString(2131959474, new Integer(((err0) jkr0Var.d.c).s() + 1), new Integer(jkr0Var.l())));
                return rih1.a;
            case 25:
                hm5.M(obj);
                EsOfflinePlugin.RemoveCommand removeCommand = (EsOfflinePlugin.RemoveCommand) this.b;
                rm5 rm5Var = ((jyl1) this.c).a;
                Iterator it2 = removeCommand.n().iterator();
                while (it2.hasNext()) {
                    y520.E(rm5Var.P(((EsOfflinePlugin.RemoveCommand.Query) it2.next()).getLink()));
                }
                return Empty.n();
            case 26:
                PlayerState playerState = (PlayerState) this.b;
                hm5.M(obj);
                ((qzl1) this.c).g = playerState;
                return rih1.a;
            case 27:
                hm5.M(obj);
                h2q0 h2q0Var = ((l8m1) this.b).e;
                c8m1 c8m1Var = (c8m1) this.c;
                String id = c8m1Var.c.getId();
                String str2 = c8m1Var.d;
                h2q0Var.getClass();
                if (!ihc1.y0(str2)) {
                    h2q0Var.a.m((Object) null, new g2q0(id, str2));
                }
                return rih1.a;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                hm5.M(obj);
                StoryCard storyCard = ((c8m1) this.c).c;
                return rih1.a;
            default:
                hm5.M(obj);
                g9l1 g9l1Var2 = (g9l1) this.b;
                x8m1 x8m1Var = (x8m1) this.c;
                g9l1Var2.c(x8m1Var.a, x8m1Var.b, 5, x8m1Var.c);
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t6j1(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
    }
}
