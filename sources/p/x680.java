package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableJust;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureLatest;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x680 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x680(Object obj, Object obj2, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke() {
        int i = 0;
        switch (this.a) {
            case 0:
                Collection<n700> collection = (Collection) this.b;
                HashMap map = ((y680) this.c).a;
                for (n700 n700Var : collection) {
                    String str = n700Var.b;
                    n700 n700Var2 = (n700) map.get(str);
                    if (n700Var2 != null && n700Var.a == n700Var2.a) {
                        map.remove(str);
                    }
                }
                return rih1.a;
            case 1:
                Context context = (Context) this.c;
                View view = ((ff80) this.b).a;
                if (view instanceof ViewGroup) {
                    return (ViewGroup) view;
                }
                if (view == null) {
                    return new FrameLayout(context);
                }
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(view);
                return frameLayout;
            case 2:
                ((iu30) this.b).invoke(new ih80(((lh80) this.c).d));
                return rih1.a;
            case 3:
                ((iu30) this.b).invoke(((pl80) this.c).a);
                return rih1.a;
            case 4:
                iu30 iu30Var = (iu30) this.b;
                so80 so80Var = (so80) this.c;
                iu30Var.invoke(new ro80(so80Var.c, so80Var.a));
                return rih1.a;
            case 5:
                o0g1 o0g1Var = (o0g1) this.b;
                hu4 hu4Var = (hu4) o0g1Var.e;
                List list = (List) o0g1Var.c;
                Intent intent = (Intent) this.c;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((fyf0) it.next()).b(hu4Var.b() ? new Intent(intent) : intent)) {
                        }
                    }
                }
                Iterator it2 = ((t380) o0g1Var.d).iterator();
                while (it2.hasNext()) {
                    ((dyf0) it2.next()).a(hu4Var.b() ? new Intent(intent) : intent);
                }
                return rih1.a;
            case 6:
                o811 o811Var = (o811) this.b;
                mw80 mw80Var = (mw80) this.c;
                o811Var.a = ((u7h) mw80Var.R0.b.invoke(mw80Var.S0, mw80Var.V0.isEmpty() ? mw80Var.U0 ? vux.c : vux.a : vux.b)).a;
                return rih1.a;
            case 7:
                ((iu30) this.b).invoke(Long.valueOf(((r390) this.c).N0));
                return rih1.a;
            case 8:
                ((AccessibilityManager) this.b).removeTouchExplorationStateChangeListener((xf90) this.c);
                return rih1.a;
            case 9:
                ((AccessibilityManager) this.b).removeTouchExplorationStateChangeListener((xf90) this.c);
                return rih1.a;
            case 10:
                return new x880(yoi1.g(hqq0.O((g0l) this.b)), (dg90) this.c, (byte) 4);
            case 11:
                return ((i4q) this.b).a(((zi90) this.c).a);
            case 12:
                j0v0 j0v0Var = (j0v0) this.b;
                return new bl90(j0v0Var.a, new y1i(j0v0Var.c.g((fl90) this.c), j0v0Var.b));
            case 13:
                ((iu30) this.b).invoke((eyz0) this.c);
                return rih1.a;
            case 14:
                ((iu30) this.b).invoke(new bx90(((ix90) this.c).a));
                return rih1.a;
            case 15:
                if (!((pe) this.b).b(7)) {
                    return n9a0.a;
                }
                tnu tnuVar = (tnu) ((ynb0) this.c).get();
                wdf0 wdf0Var = tnuVar.a;
                Flowable flowableU = Flowable.e(new FlowableOnBackpressureLatest(Flowable.G(16666L, 16666L, TimeUnit.MICROSECONDS, wdf0Var.a)), tnuVar.b, tnuVar.c.a, new fjb(wdf0Var, (byte) 15)).U(Double.valueOf(0.0d));
                flowableU.getClass();
                FlowableDistinctUntilChanged flowableDistinctUntilChangedT = flowableU.t(Functions.a);
                vbm[] vbmVarArr = q601.a;
                Flowable flowableH = yoi1.h(new huz(new xy0(new kge(flowableDistinctUntilChangedT), (byte) 20), (byte) 20), o6x.a);
                FlowableJust flowableJust = n9a0.a;
                return flowableH.j(mo9.g);
            case 16:
                ((iu30) this.b).invoke((no90) this.c);
                return rih1.a;
            case 17:
                b6t b6tVar = (k6a1) this.b;
                if (b6tVar != null) {
                    b6tVar.a();
                }
                ((iu30) this.c).invoke(gra0.a);
                return rih1.a;
            case 18:
                edb0 edb0Var = (edb0) this.b;
                int i2 = edb0.W0;
                iu30 iu30Var2 = (iu30) edb0Var.V0.getValue();
                if (iu30Var2 != null) {
                }
                return rih1.a;
            case 19:
                zgb0 zgb0Var = (zgb0) this.b;
                iib0 iib0Var = zgb0Var.a;
                Uri.Builder builderPath = new Uri.Builder().scheme("spotify").authority("internal").path("bridge-tracks-curation");
                hib0 hib0Var = iib0Var.b;
                String strF = f4i1.f("spotify:assisted-curation?context=", Uri.encode(builderPath.appendQueryParameter("playlist", hib0Var.a).appendQueryParameter("trackARowId", hib0Var.b).build().toString()), "&mode=selection");
                iu30 iu30Var3 = (iu30) this.c;
                haa0 haa0Var = zgb0Var.h;
                i8h1 i8h1Var = (i8h1) ((kly0) haa0Var.b).get();
                x6h1 x6h1VarC = ((tdl0) haa0Var.c).b.c();
                x6h1VarC.i.add(new a7h1("add_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                iu30Var3.invoke(new qhb0(i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strF)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a.a));
                return rih1.a;
            case 20:
                ((iu30) this.b).invoke(thb0.a);
                haa0 haa0Var2 = ((fib0) this.c).h;
                i8h1 i8h1Var2 = (i8h1) ((kly0) haa0Var2.b).get();
                tdl0 tdl0Var = (tdl0) haa0Var2.c;
                b7x b7xVar = b7x.a;
                i8h1Var2.m(new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), tdl0Var.b, r6h1.c, System.currentTimeMillis()), (xj61) null);
                return rih1.a;
            case 21:
                ((iu30) this.b).invoke(((dwb0) this.c).e);
                return rih1.a;
            case 22:
                bxb0 bxb0Var = (bxb0) this.b;
                fn31.T(cto1.q(bxb0Var.c), bxb0Var.h, 0, new m2a0(bxb0Var, (String) this.c, (lnm) null, (byte) 5), 2);
                return rih1.a;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                i8h1 i8h1Var3 = ((bxb0) this.b).a;
                x6h1 x6h1VarC2 = ((uvk0) this.c).a.c();
                x6h1VarC2.i.add(new a7h1("leave_and_delete_confirmation_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                x6h1 x6h1VarC3 = x6h1VarC2.a().c();
                x6h1VarC3.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                y6h1 y6h1VarA = x6h1VarC3.a();
                b7x b7xVar2 = b7x.a;
                i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar2), new x7h1("ui_hide", 1, b7xVar2), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                return rih1.a;
            case 24:
                eyb0 eyb0Var = (eyb0) this.b;
                List listD1 = o7h.d1(eyb0Var.a.b, eyb0Var.b);
                iu30 iu30Var4 = (iu30) this.c;
                for (Object obj : listD1) {
                    int i3 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    iu30Var4.invoke(new j01((ji0) obj, i));
                    i = i3;
                }
                if (eyb0Var.f) {
                    iu30Var4.invoke(lk51.a);
                }
                return rih1.a;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                i8h1 i8h1Var4 = ((jyb0) this.b).a;
                x6h1 x6h1VarC4 = ((uvk0) this.c).a.c();
                x6h1VarC4.i.add(new a7h1("leave_chat_confirmation_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                x6h1 x6h1VarC5 = x6h1VarC4.a().c();
                x6h1VarC5.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                y6h1 y6h1VarA2 = x6h1VarC5.a();
                b7x b7xVar3 = b7x.a;
                i8h1Var4.m(new w7h1("", "", new z7h1("hit", 1, b7xVar3), new x7h1("ui_hide", 1, b7xVar3), y6h1VarA2, r6h1.c, System.currentTimeMillis()), (xj61) null);
                return rih1.a;
            case 26:
                ((iu30) this.b).invoke(((ap0) this.c).b);
                return rih1.a;
            case 27:
                ((iu30) this.b).invoke((b7c0) this.c);
                return rih1.a;
            case 28:
                ((iu30) this.b).invoke(((bfc0) this.c).b ? yec0.a : yec0.b);
                return rih1.a;
            default:
                ((iu30) this.b).invoke((ji50) this.c);
                return rih1.a;
        }
    }
}
