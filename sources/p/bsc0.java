package p;

import android.view.View;
import android.view.ViewTreeObserver;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mainlayout.ui.view.containers.MainLayoutContentContainerView;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bsc0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bsc0(Object obj, Object obj2, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x036a  */
    public final Object invoke() {
        xne0 xne0Var;
        int size;
        xab1 xab1Var;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        z = false;
        boolean z = false;
        int i = 0;
        byte b2 = 1;
        rih1 rih1Var = rih1.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                kpu0 kpu0Var = (kpu0) obj;
                return wsc0.a(((rsc0) obj2).b.b(kpu0Var.j().o()), Integer.valueOf(rsc0.e(kpu0Var.j().q())));
            case 1:
                return ((i4q) obj2).a(((c4n0) ((uu0) obj).b).getViewUri());
            case 2:
                laa laaVar = (laa) ((Function0) obj2).invoke();
                Class cls = (Class) obj;
                if ((laaVar instanceof wpw) || (laaVar instanceof syq)) {
                    return laaVar;
                }
                hhg1.f(gvg.h("Unsupported element ", laaVar.getClass().getName(), " for ", cls.getName()));
                return null;
            case 3:
                ((iu30) obj2).invoke((o32) obj);
                return rih1Var;
            case 4:
                return new kpg0((o9x) obj2, new l6d0((fb3) obj, b2));
            case 5:
                return ((g431) ((ikp) obj2).get()).a(uj1.w, new wj1((q7d0) obj, (byte) 22));
            case 6:
                ((gcd0) obj2).a.X();
                ((iu30) obj).invoke(mc31.a);
                return rih1Var;
            case 7:
                p811 p811Var = (p811) obj2;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) p811Var.a;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewTreeObserver = null;
                    }
                    if (viewTreeObserver != null) {
                        viewTreeObserver.removeOnGlobalLayoutListener((x22) obj);
                    }
                }
                p811Var.a = null;
                return rih1Var;
            case 8:
                oie0 oie0Var = (oie0) obj2;
                oie0Var.d.a.a.m((Object) null, new q260((String) obj, ((sie0) oie0Var.i.getValue()).a == null ? gv50.b : gv50.a));
                return rih1Var;
            case 9:
                ((oie0) obj2).k((iu30) obj, true);
                return rih1Var;
            case 10:
                b431 b431Var = (b431) obj2;
                ven0 ven0Var = (ven0) obj;
                ((ea6) ven0Var.getValue()).getClass();
                wne0 wne0Var = new wne0((String) null);
                String str = ((ea6) ven0Var.getValue()).h;
                if (str == null) {
                    xne0Var = null;
                } else {
                    if (ihc1.y0(str)) {
                        str = null;
                    }
                    if (str != null) {
                        xne0Var = new xne0(str, true);
                    } else {
                        xne0Var = null;
                    }
                }
                b431Var.a(new dso(Collections.singletonList(new evb1("artifact-page-location", wne0Var, xne0Var, (h290) null, 8))), (String) null);
                return rih1Var;
            case 11:
                iye0 iye0Var = (iye0) obj2;
                i8h1 i8h1Var = (i8h1) iye0Var.c.getValue();
                x6h1 x6h1VarC = iye0Var.b.b.c();
                x6h1VarC.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                ((iu30) obj).invoke(cye0.a);
                return rih1Var;
            case 12:
                ((Function0) obj2).invoke();
                ((j0f0) obj).h.invoke();
                return rih1Var;
            case 13:
                w6e0 w6e0Var = (w6e0) obj2;
                i8h1 i8h1Var2 = (i8h1) ((idd1) w6e0Var.e).getValue();
                ksk0 ksk0Var = (ksk0) w6e0Var.b;
                x6h1 x6h1VarC2 = ksk0Var.c.c();
                x6h1VarC2.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), ksk0Var.b, System.currentTimeMillis()), (xj61) null);
                ((iu30) obj).invoke(n0f0.a);
                return rih1Var;
            case 14:
                String str2 = (String) obj;
                h2f0 h2f0VarY0 = ((k1f0) obj2).Y0();
                ((ohv0) h2f0VarY0.d.b).a(new mhv0("login", ktd.d(17), ew80.c, hrt.d(20)));
                kg0 kg0Var = h2f0VarY0.a.J1;
                if (kg0Var != null) {
                    kg0.e(kg0Var, new sit(str2, 6, !(str2.length() == 0)), (ifl1) null);
                    return rih1Var;
                }
                u890.C("zeroNavigator");
                throw null;
            case 15:
                w9f0 w9f0Var = (w9f0) obj2;
                fn31.T(smo1.e((q8n) w9f0Var.d), (o8n) null, 0, new tfe0(w9f0Var, (v181) obj, (lnm) null, (byte) 7), 3);
                return rih1Var;
            case 16:
                List list = (List) obj2;
                long jLongValue = ((Number) ((tob1) obj).getValue()).longValue() + 100;
                if (list.isEmpty() || jLongValue < ((aef0) o7h.q0(list)).a) {
                    size = -1;
                } else {
                    size = list.size() - 1;
                    while (i <= size) {
                        int i2 = (i + size) / 2;
                        if (((aef0) list.get(i2)).a <= jLongValue) {
                            i = i2 + 1;
                        } else {
                            size = i2 - 1;
                        }
                    }
                }
                return Integer.valueOf(size);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                znf0 znf0Var = (znf0) obj2;
                return new kpg0((xpw) znf0Var.a.invoke((oud) obj), new lbc0(1, znf0Var, znf0.class, "toElementProps", "toElementProps(Lcom/spotify/share/plugins/api/ShareCardProps;)Lcom/spotify/lyrics/sharecard/impl/LyricsShareCardElement$Props;", 0, (byte) 18));
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                if (((iqf0) obj2).d) {
                    ((iu30) obj).invoke(aqf0.a);
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                ((ven0) obj2).setValue(((ysf0) obj).e);
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                xtb0 xtb0Var = (xtb0) obj2;
                if (xtb0Var.h() != ((ptb0) obj) && (xtb0Var.d() || xtb0Var.c())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                ((iu30) obj2).invoke(new ktf0(((bmf0) obj).a));
                return Boolean.TRUE;
            case 22:
                qvf0 qvf0Var = (qvf0) obj2;
                i8h1 i8h1Var3 = (i8h1) qvf0Var.c.getValue();
                x6h1 x6h1VarC3 = qvf0Var.b.a.c();
                x6h1VarC3.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                ((iu30) obj).invoke(mvf0.a);
                return rih1Var;
            case 23:
                jp80 jp80Var = new jp80(new izf0((MainLayoutContentContainerView) obj, (byte) 1));
                eq80 eq80Var = (eq80) obj2;
                wch wchVar = q6x.b;
                if (!jp80Var.equals(wchVar) || !eq80Var.equals(wchVar)) {
                    if (jp80Var.equals(wchVar)) {
                        return eq80Var;
                    }
                    if (eq80Var.equals(wchVar)) {
                        return jp80Var;
                    }
                    wchVar = new wch(jp80Var, eq80Var);
                }
                return wchVar;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                ((ozf0) obj2).b.getNavigationContainerTop().removeOnLayoutChangeListener((eg7) obj);
                return rih1Var;
            case 25:
                jp80 jp80Var2 = new jp80(new th((View) obj, (byte) 4));
                eq80 eq80Var2 = ((n1g0) obj2).c;
                wch wchVar2 = q6x.b;
                if (!jp80Var2.equals(wchVar2) || !eq80Var2.equals(wchVar2)) {
                    if (jp80Var2.equals(wchVar2)) {
                        return eq80Var2;
                    }
                    if (eq80Var2.equals(wchVar2)) {
                        return jp80Var2;
                    }
                    wchVar2 = new wch(jp80Var2, eq80Var2);
                }
                return wchVar2;
            case 26:
                s4g0 s4g0Var = (s4g0) obj2;
                Set set = (Set) obj;
                if (!s4g0Var.h && ((xab1Var = s4g0Var.e) == null || !xab1Var.isActive())) {
                    s4g0Var.d.a(ts1.a);
                    s4g0Var.e = fn31.T(s4g0Var.c, (o8n) null, 0, new m2a0(s4g0Var, set, (lnm) null, (byte) 20), 3);
                }
                return rih1Var;
            case 27:
                o3e0 o3e0Var = (o3e0) obj2;
                i8h1 i8h1Var4 = (i8h1) ((idd1) o3e0Var.d).getValue();
                x6h1 x6h1VarC4 = ((tdl0) o3e0Var.c).b.c();
                x6h1VarC4.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                i8h1Var4.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                ((iu30) obj).invoke(ifg0.a);
                return rih1Var;
            case 28:
                ((zxl) ((fad0) obj2).b).a((String) obj);
                return rih1Var;
            default:
                iu30 iu30Var = (iu30) ((o0g1) obj2).d;
                String str3 = (String) obj;
                str3.getClass();
                iu30Var.invoke(str3);
                return rih1Var;
        }
    }
}
