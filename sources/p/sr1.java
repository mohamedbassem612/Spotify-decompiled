package p;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.spotify.betamax.transcoder.BetamaxTranscoderException;
import com.spotify.listplatform.sortingimpl.ListSortingProto;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sr1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sr1(Object obj, Object obj2, Object obj3, Object obj4, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                sr1 sr1Var = new sr1((ven0) obj4, (ven0) obj3, (ven0) obj2, lnmVar, (byte) 0);
                sr1Var.b = obj;
                return sr1Var;
            case 1:
                return new sr1(this.b, obj4, obj3, obj2, lnmVar, (byte) 1);
            case 2:
                return new sr1(this.b, obj4, obj3, obj2, lnmVar, (byte) 2);
            case 3:
                return new sr1(this.b, obj4, obj3, obj2, lnmVar, (byte) 3);
            case 4:
                return new sr1(this.b, obj4, obj3, obj2, lnmVar, (byte) 4);
            case 5:
                return new sr1(this.b, obj4, obj3, obj2, lnmVar, (byte) 5);
            case 6:
                sr1 sr1Var2 = new sr1((nav0) obj4, (b4e1) obj3, (x6e1) obj2, lnmVar, (byte) 6);
                sr1Var2.b = obj;
                return sr1Var2;
            case 7:
                sr1 sr1Var3 = new sr1((xmn) obj4, (tqw) obj3, (ldo) obj2, lnmVar, (byte) 7);
                sr1Var3.b = obj;
                return sr1Var3;
            case 8:
                return new sr1(this.b, obj4, obj3, obj2, lnmVar, (byte) 8);
            case 9:
                sr1 sr1Var4 = new sr1((ujr) obj4, (nhr0) obj3, (akr) obj2, lnmVar, (byte) 9);
                sr1Var4.b = obj;
                return sr1Var4;
            case 10:
                return new sr1(this.b, obj2, (ven0) obj4, (ven0) obj3, lnmVar, (byte) 10);
            case 11:
                return new sr1(this.b, obj3, obj2, (ven0) obj4, lnmVar, (byte) 11);
            case 12:
                return new sr1(this.b, obj3, obj2, (ven0) obj4, lnmVar, (byte) 12);
            case 13:
                return new sr1(this.b, obj4, obj3, obj2, lnmVar, (byte) 13);
            case 14:
                sr1 sr1Var5 = new sr1((ygu) obj4, (xgu) obj3, (ViewGroup) obj2, lnmVar, (byte) 14);
                sr1Var5.b = obj;
                return sr1Var5;
            case 15:
                return new sr1(this.b, obj4, obj3, obj2, lnmVar, (byte) 15);
            case 16:
                sr1 sr1Var6 = new sr1((iu30) obj4, (jiv) obj3, (l811) obj2, lnmVar, (byte) 16);
                sr1Var6.b = obj;
                return sr1Var6;
            case 17:
                return new sr1(this.b, obj4, obj3, obj2, lnmVar, (byte) 17);
            case 18:
                return new sr1(this.b, obj4, obj3, obj2, lnmVar, (byte) 18);
            case 19:
                return new sr1(this.b, obj4, obj3, obj2, lnmVar, (byte) 19);
            case 20:
                sr1 sr1Var7 = new sr1((yfu) obj4, (ArrayList) obj3, (ptl) obj2, lnmVar, (byte) 20);
                sr1Var7.b = obj;
                return sr1Var7;
            case 21:
                return new sr1(this.b, obj4, obj3, obj2, lnmVar, (byte) 21);
            case 22:
                return new sr1(this.b, obj3, obj2, (ven0) obj4, lnmVar, (byte) 22);
            case 23:
                return new sr1(this.b, obj4, obj3, obj2, lnmVar, (byte) 23);
            case 24:
                return new sr1(this.b, obj4, obj3, obj2, lnmVar, (byte) 24);
            case 25:
                return new sr1(this.b, obj2, (ven0) obj4, (ven0) obj3, lnmVar, (byte) 25);
            case 26:
                sr1 sr1Var8 = new sr1((hw91) obj4, (eyb0) obj3, (iu30) obj2, lnmVar, (byte) 26);
                sr1Var8.b = obj;
                return sr1Var8;
            case 27:
                sr1 sr1Var9 = new sr1((r3d0) obj4, (String) obj3, (g3d0) obj2, lnmVar, (byte) 27);
                sr1Var9.b = obj;
                return sr1Var9;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return new sr1(this.b, obj4, obj3, obj2, lnmVar, (byte) 28);
            default:
                return new sr1(this.b, obj4, obj3, obj2, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                create((wy71) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
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
                create((cxb) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 10:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 11:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 12:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
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
                create((cen0) obj, (lnm) obj2).invokeSuspend(rih1Var);
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
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
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
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 26:
                create((List) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 27:
                return create((ListSortingProto.ListSortingStore) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:137:0x0533  */
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        ListSortingProto.StoredProvidedSortOrder m231Var;
        byte b = this.a;
        c3h1 c3h1Var = c3h1.b;
        boolean z = true;
        ListSortingProto.StoredProvidedSortOrder storedProvidedSortOrderBuild = null;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.d;
        Object obj3 = this.e;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                wy71 wy71Var = (wy71) this.b;
                hm5.M(obj);
                z = wy71Var == wy71.b;
                if (z && !((Boolean) ((ven0) obj4).getValue()).booleanValue()) {
                    ((Function0) ((ven0) obj2).getValue()).invoke();
                }
                ((iu30) ((ven0) obj3).getValue()).invoke(Boolean.valueOf(z));
                return rih1Var;
            case 1:
                Bundle bundle = (Bundle) obj3;
                String str3 = (String) obj2;
                hm5.M(obj);
                tv80 tv80Var = (tv80) this.b;
                lzn0 lzn0Var = ((by3) obj4).a;
                if (tv80Var != null) {
                    lzn0Var.a(str3, tv80Var, bundle);
                } else {
                    lzn0Var.g(bundle, str3);
                }
                return rih1Var;
            case 2:
                hm5.M(obj);
                String strC = y1x0.c(((nn6) this.b).c);
                ((y1t0) obj4).l(strC, "ArtistTourPage", ((em3) obj3).s(new ku80(strC)));
                return rih1Var;
            case 3:
                hm5.M(obj);
                try {
                    ((kgg1) this.b).e((b3k) obj4, (String) obj2);
                    return rih1Var;
                } catch (Exception e) {
                    return Boolean.valueOf(((zxh) obj3).y0(new BetamaxTranscoderException(l1d.m("Failed to start transcoding: ", e.getMessage()), e, (xjz) null, 4)));
                }
            case 4:
                hm5.M(obj);
                jik.d((dg30) this.b, ((tfk) obj4).e, (Context) obj2, (kt91) obj3);
                return rih1Var;
            case 5:
                hm5.M(obj);
                gcm gcmVar = (gcm) obj4;
                ((vgm) ((qlb) this.b).e).d(gcmVar.a, gcmVar.b, cvl1.d((tqw) obj2), tgm.a((tgm) gcmVar.d.invoke(), false, false, 0, ((jcm) obj3).c, (sgm) null, (iu30) null, (p860) null, false, -131073));
                return rih1Var;
            case 6:
                hm5.M(obj);
                c9n c9nVar = (c9n) this.b;
                nav0 nav0Var = (nav0) obj4;
                fn31.T(c9nVar, (o8n) null, 4, new s7n(nav0Var, (b4e1) obj2, (lnm) null, (byte) 0), 1);
                fn31.T(c9nVar, (o8n) null, 4, new cuk(nav0Var, (x6e1) obj3, (lnm) null, (byte) 22), 1);
                return rih1Var;
            case 7:
                c9n c9nVar2 = (c9n) this.b;
                hm5.M(obj);
                fns fnsVar = igu.a;
                fn31.T(c9nVar2, pyf0.a, 0, new zfe((xmn) obj4, (tqw) obj2, (ldo) obj3, (lnm) null, (byte) 4), 2);
                return rih1Var;
            case 8:
                hm5.M(obj);
                ijr ijrVar = (ijr) this.b;
                String str4 = (String) obj4;
                String str5 = (String) obj2;
                fly0 fly0Var = (hly0) obj3;
                ijrVar.getClass();
                Set set = s4b1.f;
                v5b1 v5b1Var = uic.x(str5).d;
                if (u890.j(v5b1Var != null ? v5b1Var.getType() : null, nyu0.e) && (!(fly0Var instanceof fly0) || fly0Var.a.toLowerCase(Locale.ROOT).equals("context"))) {
                    z = false;
                }
                zrg zrgVar = ijrVar.e;
                Bundle bundleH = mno1.h(new mmr0[]{new mmr0("item_uri", str4), new mmr0("context_uri", str5), new mmr0("is_external_context_uri", Boolean.valueOf(z))});
                lzn0 lzn0Var2 = zrgVar.b;
                if (lzn0Var2.j(zrgVar.a)) {
                    lzn0Var2.i(new dwn0("spotify:internal:snooze-recommendation", "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null), bundleH);
                } else {
                    a1r0.j(zrgVar.c, "spotify:internal:snooze-recommendation", (String) null, bundleH, false, 8);
                }
                return rih1Var;
            case 9:
                cxb cxbVar = (cxb) this.b;
                hm5.M(obj);
                ujr ujrVar = (ujr) obj4;
                nhr0 nhr0Var = (nhr0) obj2;
                akr akrVar = (akr) obj3;
                q3b1 q3b1Var = akrVar.c;
                CoordinatorLayout coordinatorLayout = ujrVar.e1;
                ComposeView composeView = ujrVar.d1;
                if (cxbVar == null) {
                    ujrVar.A();
                } else {
                    ujrVar.j1 = cxbVar.a;
                    FrameLayout frameLayout = ujrVar.c1;
                    View childAt = frameLayout.getChildAt(0);
                    if (childAt != null) {
                        frameLayout = childAt;
                    }
                    ien0 ien0Var = ujrVar.l1;
                    ien0 ien0Var2 = xhk1.a;
                    ien0Var.c(xhk1.a(frameLayout));
                    composeView.setContent(new j2i(-1483602096, new tjr(nhr0Var, ujrVar, q3b1Var, cxbVar, (byte) 1), true));
                    composeView.setVisibility(0);
                    coordinatorLayout.setVisibility(0);
                    float f = ujrVar.getResources().getDisplayMetrics().heightPixels;
                    composeView.setTranslationY(f);
                    coordinatorLayout.setTranslationY(f);
                    ujrVar.D();
                }
                List listM = p7h.M(new Integer[]{new Integer(3), new Integer(4)});
                BottomSheetBehavior bottomSheetBehavior = akrVar.l;
                if (o7h.i0(listM, bottomSheetBehavior != null ? new Integer(bottomSheetBehavior.G) : null)) {
                    ujrVar.setPinnedBottomTranslation(0.0f);
                }
                return rih1Var;
            case 10:
                zen0 zen0Var = (zen0) obj3;
                hm5.M(obj);
                ah91 ah91Var = ((bnl) this.b).a;
                if (ah91Var != null) {
                    ((ven0) obj4).setValue(ur80.e);
                    ((ven0) obj2).setValue(ah91Var);
                    zen0Var.w1(Boolean.TRUE);
                } else {
                    zen0Var.w1(Boolean.FALSE);
                }
                return rih1Var;
            case 11:
                hm5.M(obj);
                ven0 ven0Var = (ven0) obj4;
                mhy mhyVar = (mhy) o7h.t0(((Number) ((tob1) obj2).getValue()).intValue(), ((h230) this.b).g);
                if (mhyVar == null || !(mhyVar instanceof bhy)) {
                    str = null;
                } else {
                    ttm1 ttm1Var = ((bhy) mhyVar).b;
                    if (ttm1Var.c) {
                        str = null;
                    } else {
                        str = ttm1Var.f;
                    }
                }
                storedProvidedSortOrderBuild = str != null ? (String) ((qzr) obj3).e.invoke(str) : null;
                ven0Var.setValue(storedProvidedSortOrderBuild != null ? storedProvidedSortOrderBuild : "");
                return rih1Var;
            case 12:
                hm5.M(obj);
                ven0 ven0Var2 = (ven0) obj4;
                mhy mhyVar2 = (mhy) o7h.t0(((Number) ((tob1) obj2).getValue()).intValue(), (List) ((hlu) this.b).c.getValue());
                if (mhyVar2 == null || !(mhyVar2 instanceof bhy)) {
                    str2 = null;
                } else {
                    ttm1 ttm1Var2 = ((bhy) mhyVar2).b;
                    if (ttm1Var2.c) {
                        str2 = null;
                    } else {
                        str2 = ttm1Var2.f;
                    }
                }
                storedProvidedSortOrderBuild = str2 != null ? (String) ((g1t) obj3).f.invoke(str2) : null;
                ven0Var2.setValue(storedProvidedSortOrderBuild != null ? storedProvidedSortOrderBuild : "");
                return rih1Var;
            case 13:
                hm5.M(obj);
                if (!(((rlt) this.b) instanceof rlt)) {
                    eg.o();
                    return null;
                }
                tqw tqwVar = (tqw) obj4;
                if (tqwVar != null) {
                    ((bmt) obj2).a.a(((wlt) obj3).a(), n3o1.y(tqwVar), (Bundle) null);
                }
                return rih1Var;
            case 14:
                c9n c9nVar3 = (c9n) this.b;
                hm5.M(obj);
                ygu yguVar = (ygu) obj4;
                xgu xguVar = (xgu) obj2;
                ViewGroup viewGroup = (ViewGroup) obj3;
                fn31.T(c9nVar3, (o8n) null, 0, new wgu(yguVar, xguVar, viewGroup, (lnm) null, (byte) 0), 3);
                fn31.T(c9nVar3, (o8n) null, 0, new wgu(yguVar, xguVar, viewGroup, (lnm) null, (byte) 1), 3);
                fn31.T(c9nVar3, (o8n) null, 0, new wgu(yguVar, xguVar, viewGroup, (lnm) null, (byte) 2), 3);
                fn31.T(c9nVar3, (o8n) null, 0, new wgu(yguVar, xguVar, viewGroup, (lnm) null, (byte) 3), 3);
                fn31.T(c9nVar3, (o8n) null, 0, new wgu(yguVar, xguVar, viewGroup, (lnm) null, (byte) 4), 3);
                fn31.T(c9nVar3, (o8n) null, 0, new wgu(yguVar, xguVar, viewGroup, (lnm) null, (byte) 5), 3);
                return rih1Var;
            case 15:
                hm5.M(obj);
                if (((dou) this.b).d()) {
                    fn31.T((c9n) obj4, (o8n) null, 0, new ymu((cs91) obj2, (String) obj3, (lnm) null, (byte) 2), 3);
                }
                return rih1Var;
            case 16:
                cen0 cen0Var = (cen0) this.b;
                hm5.M(obj);
                cen0 cen0VarC = cen0Var.c();
                ((iu30) obj4).invoke(cen0Var);
                cen0Var.a(jiv.e, sqg0.U(((jiv) obj2).d.a).keySet());
                cen0Var.a(jiv.f, jiv.g);
                ((l811) obj3).a = !cen0Var.equals(cen0VarC);
                return rih1Var;
            case 17:
                hm5.M(obj);
                bu91 bu91Var = (bu91) this.b;
                if (bu91Var.a) {
                    fn31.T((c9n) obj4, (o8n) null, 0, new l2w((bs91) obj2, bu91Var, (Function0) obj3, (lnm) null, (byte) 6), 3);
                }
                return rih1Var;
            case 18:
                Bundle bundle2 = (Bundle) obj3;
                String str6 = (String) obj2;
                hm5.M(obj);
                tv80 tv80Var2 = (tv80) this.b;
                lzn0 lzn0Var3 = ((gvy) obj4).b;
                if (tv80Var2 != null) {
                    lzn0Var3.a(str6, tv80Var2, bundle2);
                } else {
                    lzn0Var3.g(bundle2, str6);
                }
                return rih1Var;
            case 19:
                hm5.M(obj);
                gvy gvyVar = (gvy) this.b;
                vgm vgmVar = gvyVar.e;
                uv11 uv11Var = ((unb1) obj4).a;
                String str7 = uv11Var.a;
                String str8 = gvyVar.c;
                tv80 tv80Var3 = (tv80) obj2;
                wqy wqyVar = (wqy) obj3;
                String str9 = uv11Var.d;
                tv11 tv11Var = uv11Var.f;
                vgmVar.d(str7, str8, tv80Var3, new tgm(str9, wqyVar.j != null, false, wqyVar.f, wqyVar.b, false, false, (yh10) null, false, false, 2, !wqyVar.e, false, false, false, false, (iu30) null, wqyVar.g, false, (g371) null, wqyVar.k, false, tv11Var != null ? tv11Var.a : null, (iu30) null, (p860) null, (mgo0) null, false, false, -43001964, 1));
                return rih1Var;
            case 20:
                hm5.M(obj);
                try {
                    m231Var = new Integer(((iru) ((yfu) obj4).b).a((ArrayList) obj2, (ptl) obj3));
                    break;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                Integer num = (Integer) (m231Var instanceof m231 ? null : m231Var);
                return new Integer(num != null ? num.intValue() : -1);
            case 21:
                hm5.M(obj);
                lzn0 lzn0Var4 = ((q240) this.b).c;
                String str10 = (String) obj4;
                tv80 tv80Var4 = ((f240) obj2).c;
                lzn0Var4.i(new dwn0(str10, "", false, false, 0, 0, false, (a690) null, (Bundle) null, tv80Var4 != null ? new bwn0(tv80Var4) : null), (Bundle) obj3);
                return rih1Var;
            case 22:
                hm5.M(obj);
                ven0 ven0Var3 = (ven0) obj4;
                c380<ku50> c380Var = ((lu50) this.b).b;
                mjh mjhVar = (mjh) obj2;
                o0i o0iVar = (o0i) obj3;
                ArrayList arrayList = new ArrayList();
                for (ku50 ku50Var : c380Var) {
                    bcl1 bcl1Var = mjhVar.b;
                    hp80 hp80Var = o0iVar.e;
                    String strH = cbp1.h("hashtag_cloud", ku50Var.a);
                    String str11 = (String) o7h.q0(ihc1.Q0(ku50Var.d, new String[]{"?"}, 0, 6));
                    String str12 = ku50Var.e;
                    bcl1Var.getClass();
                    p3m0 p3m0VarH = bcl1Var.h(hp80Var.b());
                    x6h1 x6h1VarC = p3m0VarH.a.c();
                    x6h1VarC.i.add(new a7h1("watch_feed_component", strH, (Integer) null, str11, str12));
                    x6h1VarC.j = true;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    k7h1 k7h1Var = new k7h1();
                    ((xjn) k7h1Var).a = y6h1VarA;
                    ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                    k7h1Var.e = p3m0VarH.b.b.c;
                    arrayList.add(bcl1Var.b.p(k7h1Var.a(), Collections.singleton(c3h1Var)));
                }
                ven0Var3.setValue(arrayList);
                return rih1Var;
            case 23:
                hm5.M(obj);
                qu50 qu50Var = (qu50) this.b;
                o0i o0iVar2 = (o0i) obj4;
                List list = (List) obj2;
                for (ku50 ku50Var2 : ((pu50) obj3).a) {
                    bcl1 bcl1Var2 = qu50Var.c;
                    hp80 hp80Var2 = o0iVar2.e;
                    String strH2 = cbp1.h("hashtag_row", ku50Var2.a);
                    String str13 = (String) o7h.q0(ihc1.Q0(ku50Var2.d, new String[]{"?"}, 0, 6));
                    String str14 = ku50Var2.e;
                    bcl1Var2.getClass();
                    p3m0 p3m0VarH2 = bcl1Var2.h(hp80Var2.b());
                    x6h1 x6h1VarC2 = p3m0VarH2.a.c();
                    x6h1VarC2.i.add(new a7h1("watch_feed_component", strH2, (Integer) null, str13, str14));
                    x6h1VarC2.j = true;
                    y6h1 y6h1VarA2 = x6h1VarC2.a();
                    k7h1 k7h1Var2 = new k7h1();
                    ((xjn) k7h1Var2).a = y6h1VarA2;
                    ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                    k7h1Var2.e = p3m0VarH2.b.b.c;
                    list.add(bcl1Var2.b.p(k7h1Var2.a(), Collections.singleton(c3h1Var)));
                }
                return rih1Var;
            case 24:
                hm5.M(obj);
                if (((ov90) this.b).b.get() && ((i4s) ((yxb0) obj4).f).b((f4s) obj2)) {
                    ((lv90) obj3).c.invoke();
                }
                return rih1Var;
            case 25:
                hm5.M(obj);
                if (((krm0) ((ven0) obj4).getValue()) == krm0.a && !((Boolean) ((ven0) obj2).getValue()).booleanValue()) {
                    lz20.b((lz20) this.b);
                    b6t b6tVar = (k6a1) obj3;
                    if (b6tVar != null) {
                        b6tVar.b();
                    }
                }
                return rih1Var;
            case 26:
                List list2 = (List) this.b;
                hm5.M(obj);
                hw91 hw91Var = (hw91) obj4;
                vxb0 vxb0Var = ((eyb0) obj2).a;
                iu30 iu30Var = (iu30) obj3;
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    if (!hw91Var.contains(new Integer(iIntValue)) && iIntValue < vxb0Var.b.size()) {
                        hw91Var.add(new Integer(iIntValue));
                        iu30Var.invoke(new j01((ji0) vxb0Var.b.get(iIntValue), iIntValue));
                    }
                }
                return rih1Var;
            case 27:
                ListSortingProto.ListSortingStore listSortingStore = (ListSortingProto.ListSortingStore) this.b;
                hm5.M(obj);
                Map mapO = listSortingStore.o();
                String str15 = ((r3d0) obj4).a;
                w3d0 builder = ((ListSortingProto.UserSortOrders) mapO.getOrDefault(str15, ListSortingProto.UserSortOrders.n())).toBuilder();
                String str16 = (String) obj2;
                z2d0 z2d0Var = (g3d0) obj3;
                builder.q(str16, ot11.O(z2d0Var));
                mma0[] mma0VarArr = s3d0.a;
                if (z2d0Var instanceof z2d0) {
                    v3d0 v3d0VarQ = ListSortingProto.StoredProvidedSortOrder.q();
                    z2d0 z2d0Var2 = z2d0Var;
                    v3d0VarQ.n(z2d0Var2.b);
                    v3d0VarQ.r(z2d0Var2.a);
                    v3d0VarQ.q(true);
                    storedProvidedSortOrderBuild = (ListSortingProto.StoredProvidedSortOrder) v3d0VarQ.build();
                } else if (z2d0Var instanceof a3d0) {
                    v3d0 v3d0VarQ2 = ListSortingProto.StoredProvidedSortOrder.q();
                    a3d0 a3d0Var = (a3d0) z2d0Var;
                    v3d0VarQ2.n(a3d0Var.b);
                    v3d0VarQ2.r(a3d0Var.a);
                    v3d0VarQ2.q(false);
                    storedProvidedSortOrderBuild = v3d0VarQ2.build();
                }
                if (storedProvidedSortOrderBuild != null) {
                    builder.n(str16, storedProvidedSortOrderBuild);
                } else {
                    builder.r(str16);
                }
                t3d0 builder2 = listSortingStore.toBuilder();
                builder2.n(builder.build(), str15);
                return builder2.build();
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                hm5.M(obj);
                ((ajq0) ((j2e0) this.b).b).k((zzy) obj4, (String) obj2, (String) obj3);
                return rih1Var;
            default:
                ven0 ven0Var4 = (ven0) obj2;
                hm5.M(obj);
                if (!((Boolean) ((ven0) obj4).getValue()).booleanValue() && ((Boolean) ven0Var4.getValue()).booleanValue()) {
                    ven0Var4.setValue(Boolean.FALSE);
                    ((iu30) this.b).invoke(new jtf0(((Number) ((tob1) obj3).getValue()).floatValue()));
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sr1(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sr1(Object obj, Object obj2, Object obj3, ven0 ven0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = ven0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sr1(Object obj, Object obj2, ven0 ven0Var, ven0 ven0Var2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = obj;
        this.e = obj2;
        this.c = ven0Var;
        this.d = ven0Var2;
    }
}
