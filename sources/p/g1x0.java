package p;

import android.database.ContentObserver;
import android.net.Uri;
import android.text.Html;
import android.text.Spanned;
import com.spotify.aipartner.promptsuggestionsprovider.PromptSuggestionsWorker;
import com.spotify.encoreconsumermobile.elements.seemoretextview.SeeMoreTextView;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.Effects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class g1x0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1x0(eoy0 eoy0Var, iu30 iu30Var) {
        super(0);
        this.a = (byte) 21;
        this.c = eoy0Var;
        this.b = iu30Var;
    }

    public final Object invoke() {
        gv50 gv50Var;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        int i = 1;
        rih1 rih1Var = rih1.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((iu30) obj2).invoke(new b1x0(((d1x0) obj).b));
                return rih1Var;
            case 1:
                m1x0 m1x0Var = (m1x0) obj2;
                z6x0 z6x0Var = (z6x0) obj;
                m1x0Var.k.J(z6x0Var.a.a, z6x0Var.Z, m1x0Var.a.getViewUri().a);
                return rih1Var;
            case 2:
                return Effects.a(new t4x0[]{new t4x0((z6x0) obj2, ((z5x0) obj).a)});
            case 3:
                z6x0 z6x0Var2 = (z6x0) obj2;
                m3x0 m3x0Var = z6x0Var2.a;
                boolean z = m3x0Var.X.a;
                String str = m3x0Var.j1;
                if (z6x0Var2.h && !z) {
                    i = 3;
                } else if (z) {
                    i = 2;
                }
                return Collections.singleton(new v4x0(i, str, ((d6x0) obj).a));
            case 4:
                return ((i4q) obj2).a(((c4n0) ((p68) obj).b).getViewUri());
            case 5:
                return ((anx0) obj2).b.a(((xk00) obj).i);
            case 6:
                return ((tiv0) ((zkw0) obj2).d).a((klv0) ((ajq0) obj).b);
            case 7:
                ((cpx0) obj2).g.c((String) obj).subscribe();
                return rih1Var;
            case 8:
                mpx0 mpx0Var = (mpx0) obj2;
                i8h1 i8h1Var = mpx0Var.f;
                x6h1 x6h1VarC = mpx0Var.g.b.c();
                x6h1VarC.i.add(new a7h1("cancel_prompt_entry_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                ((tbr0) obj).a(l231.a);
                return rih1Var;
            case 9:
                p1f0 p1f0Var = (p1f0) ((ytp0) obj2).d;
                ((SeeMoreTextView) p1f0Var.d).setVisibility(0);
                Spanned spannedFromHtml = Html.fromHtml((String) obj, 0);
                SeeMoreTextView seeMoreTextView = (SeeMoreTextView) p1f0Var.d;
                seeMoreTextView.A(new wk51(6, spannedFromHtml));
                seeMoreTextView.setTranslationY(seeMoreTextView.getHeight());
                seeMoreTextView.setAlpha(0.0f);
                seeMoreTextView.animate().translationY(0.0f).alpha(1.0f).setDuration(300L).start();
                return rih1Var;
            case 10:
                ((iu30) obj2).invoke(((pju) obj).b);
                return rih1Var;
            case 11:
                eux0 eux0Var = (eux0) obj2;
                String str2 = eux0Var.b;
                List list = eux0Var.u;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (obj3 instanceof j8f) {
                        arrayList.add(obj3);
                    }
                }
                return new drx0(str2, ((j8f) o7h.A0(arrayList)).s(), eux0Var.q, dm61.x0(((hsx0) obj).a, eux0Var.r));
            case 12:
                eux0 eux0Var2 = (eux0) obj2;
                String str3 = eux0Var2.b;
                List list2 = eux0Var2.u;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : list2) {
                    if (obj4 instanceof j8f) {
                        arrayList2.add(obj4);
                    }
                }
                return new drx0(str3, ((j8f) o7h.A0(arrayList2)).s(), (LinkedHashSet) obj, eux0Var2.r);
            case 13:
                eux0 eux0Var3 = (eux0) obj2;
                String str4 = eux0Var3.b;
                List list3 = eux0Var3.u;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : list3) {
                    if (obj5 instanceof j8f) {
                        arrayList3.add(obj5);
                    }
                }
                return new drx0(str4, ((j8f) o7h.A0(arrayList3)).s(), eux0Var3.q, dm61.u0(((ftx0) obj).a, eux0Var3.r));
            case 14:
                eux0 eux0Var4 = (eux0) obj2;
                gtx0 gtx0Var = (gtx0) obj;
                return new xqx0(eux0Var4.b, gtx0Var.a, gtx0Var.c, eux0Var4.q, eux0Var4.r);
            case 15:
                ((z8d0) ((PromptSuggestionsWorker) obj2)).a.getContentResolver().notifyChange((Uri) obj, (ContentObserver) null, 0);
                return rih1Var;
            case 16:
                return new kpg0((xpw) ((jly0) obj2).get(), new hox0((ih60) obj, (byte) 5));
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                xmu0 xmu0Var = (xmu0) obj2;
                i8h1 i8h1Var2 = (i8h1) xmu0Var.b;
                x6h1 x6h1VarC2 = ((tdl0) xmu0Var.c).b.c();
                x6h1VarC2.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                ((Function0) obj).invoke();
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                ((iu30) obj2).invoke(new r5y0(((a6y0) obj).getUri()));
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new kpg0((xpw) ((u9y0) obj2).a.invoke((oud) obj), e6y0.a1);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new kpg0((xpw) ((oby0) obj2).a.invoke((oud) obj), e6y0.d1);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                iu30 iu30Var = (iu30) obj2;
                if (((eoy0) obj).b) {
                    iu30Var.invoke(coy0.a);
                } else {
                    iu30Var.invoke(zny0.a);
                }
                return rih1Var;
            case 22:
                moy0 moy0Var = (moy0) ((poy0) obj2).a.invoke(((is20) obj).d);
                vbm[] vbmVarArr = q601.a;
                return new kge(moy0Var);
            case 23:
                int i2 = ((o4z0) ((ven0) obj).getValue()).a;
                hyy0 hyy0Var = (hyy0) ((ewe) obj2).f;
                if (i2 == 0) {
                    i8h1 i8h1Var3 = (i8h1) ((ykq) hyy0Var.b).get();
                    x6h1 x6h1VarC3 = ((h7l0) hyy0Var.c).b.c();
                    x6h1VarC3.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                } else {
                    i8h1 i8h1Var4 = (i8h1) ((ykq) hyy0Var.b).get();
                    x6h1 x6h1VarC4 = ((h7l0) hyy0Var.c).b.c();
                    x6h1VarC4.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    i8h1Var4.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                i4z0 i4z0Var = (i4z0) obj2;
                String str5 = (String) obj;
                List list4 = ((o4z0) i4z0Var.t.getValue()).b;
                if ((list4 instanceof Collection) && list4.isEmpty()) {
                    gv50Var = gv50.b;
                } else {
                    Iterator it = list4.iterator();
                    while (it.hasNext()) {
                        if (((h4z0) it.next()).f()) {
                            gv50Var = gv50.a;
                        }
                    }
                    gv50Var = gv50.b;
                }
                i4z0Var.e.a.a.m((Object) null, new q260(str5, gv50Var));
                return rih1Var;
            case 25:
                wfx wfxVar = ((xfx) obj2).c;
                return new atr(wfxVar.b, wfxVar.a, ((ccz0) obj).t);
            case 26:
                return Boolean.valueOf(((upb0) obj2).h.b() || ((Boolean) ((ven0) obj).getValue()).booleanValue());
            case 27:
                ((iu30) obj2).invoke(Boolean.valueOf(!((Boolean) obj).booleanValue()));
                return rih1Var;
            case 28:
                ((iu30) obj2).invoke((djz0) obj);
                return rih1Var;
            default:
                ((iu30) obj2).invoke(Integer.valueOf(((qhz0) obj).b));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1x0(Object obj, Object obj2, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
