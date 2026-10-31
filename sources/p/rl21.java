package p;

import android.webkit.WebView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rl21 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl21(cn41 cn41Var, cn41 cn41Var2) {
        super(0);
        this.a = (byte) 13;
        int i = ama1.a;
        this.b = cn41Var;
        this.c = cn41Var2;
    }

    public final Object invoke() {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        boolean z = false;
        z = false;
        boolean z2 = false;
        z = false;
        z = false;
        z = false;
        z = false;
        rih1 rih1Var = rih1.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((iu30) obj2).invoke(new mif0((hkf0) obj));
                return rih1Var;
            case 1:
                WebView webView = (WebView) obj2;
                if (webView.canGoBack()) {
                    webView.goBack();
                } else {
                    ((Function0) obj).invoke();
                }
                return rih1Var;
            case 2:
                s531 s531Var = (s531) obj2;
                i8h1 i8h1Var = s531Var.h;
                x6h1 x6h1VarC = ((txk0) obj).b.c();
                x6h1VarC.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                s531Var.c.e();
                return rih1Var;
            case 3:
                yjs yjsVar = (yjs) obj2;
                int iO = ((kes) obj).o();
                uxy0 uxy0Var = yjsVar.c;
                String str = ((h631) yjsVar.a.get(iO)).d;
                i8h1 i8h1Var2 = (i8h1) ((uyp) uxy0Var.b).get();
                x6h1 x6h1VarC2 = ((brl0) uxy0Var.c).b.c();
                x6h1VarC2.i.add(new a7h1("share_button", (String) null, (Integer) null, str, (String) null));
                x6h1VarC2.j = false;
                yjsVar.b.invoke(new d531(iO, i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null)));
                return rih1Var;
            case 4:
                ((ven0) obj).setValue(((wfm0) obj2).b);
                return rih1Var;
            case 5:
                ejw0 ejw0Var = (ejw0) obj;
                if (ejw0Var != null && ejw0Var.d(1)) {
                    ((iu30) obj2).invoke(stj1.a);
                }
                return rih1Var;
            case 6:
                return new kpg0((xpw) ((sz31) obj2).a.invoke((oud) obj), rz31.b);
            case 7:
                ((f0i) ((dg30) ((p68) obj2).b)).a.d((k5g) obj);
                return rih1Var;
            case 8:
                ((iu30) obj2).invoke(new r941(((v941) obj).d));
                return rih1Var;
            case 9:
                return new hd41(((maa) obj2).getBehavior().b((Object) null, (dts) null, (String) null), (String) obj);
            case 10:
                return new hd41((ipb1) ((Function0) obj2).invoke(), (String) obj);
            case 11:
                iec iecVar = (iec) obj2;
                int i = iecVar.d;
                if (i != 0) {
                    ((qam1) obj).a(i);
                }
                iecVar.e.a();
                return rih1Var;
            case 12:
                return (xbm) ((o901) obj2).invoke(((ym41) obj).a);
            case 13:
                int i2 = ama1.a;
                return new zla1(((cn41) obj2).a.b.getValue(), ((cn41) obj).a.b.getValue());
            case 14:
                ((bpb1) ((bz11) obj2).j).l(((lw41) obj).a);
                return rih1Var;
            case 15:
                bz11 bz11Var = (bz11) obj;
                return (cnc0) ((znp) obj2).a((wao0) bz11Var.g, (bpb1) bz11Var.j).e().b;
            case 16:
                RecyclerView recyclerView = ((rw41) obj2).d;
                List list = ((ow41) obj).b;
                z511 adapter = recyclerView.getAdapter();
                if (adapter != null && adapter.e() == list.size()) {
                    if (list.isEmpty()) {
                        z = true;
                    } else if (recyclerView.getChildCount() > 0) {
                        List list2 = list;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                if (!(((cwl) it.next()) instanceof ivl)) {
                                    z = true;
                                }
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                i551 i551Var = (i551) obj2;
                if (i551Var != null) {
                    h551 h551Var = (h551) obj;
                    if (h551Var.a(i551Var, h551Var.d, h551Var.j)) {
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return jqd0.t((q1o1) obj2, (tv80) obj);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                ((s551) obj2).b.h((ckx0) obj);
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                ((u651) obj2).n.l(((lw41) obj).a);
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                u651 u651Var = (u651) obj;
                return (cnc0) ((znp) obj2).a(u651Var.g, u651Var.n).e().b;
            case 22:
                return ((eop) obj2).a(((u651) obj).g);
            case 23:
                ((kdn0) obj2).m((hy50) obj);
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                gr51 gr51Var = (gr51) obj2;
                fxu fxuVar = gr51Var.d;
                m0u0 m0u0Var = gr51Var.a;
                String strD = zod.D(m0u0Var);
                String str2 = m0u0Var.d;
                j25 j25Var = fxuVar.b;
                return new gq51(fxuVar.a, fxuVar, m0u0Var.a.a, (ptl) obj, strD, str2, new jq51(j25Var.b(), j25Var.a(), j25Var.c(), j25Var.d()), fxuVar.c);
            case 25:
                String str3 = (String) obj;
                Iterator it2 = ((List) obj2).iterator();
                int i3 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i3 = -1;
                    } else if (!u890.j(((c220) it2.next()).a, str3)) {
                        i3++;
                    }
                }
                return new err0(i3 >= 0 ? i3 : 0);
            case 26:
                ((iu30) obj2).invoke(new qt51(((tt51) obj).c.t().size()));
                return rih1Var;
            case 27:
                ou80.Companion.getClass();
                ((iu30) obj2).invoke(new ocv((wcv) obj, new ou80("")));
                return rih1Var;
            case 28:
                ((iu30) obj2).invoke(new rcv((xcv) obj));
                return rih1Var;
            default:
                ((iu30) obj2).invoke(new cx51((bx51) obj));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl21(jqd0 jqd0Var, q1o1 q1o1Var, tv80 tv80Var) {
        super(0);
        this.a = (byte) 18;
        this.b = q1o1Var;
        this.c = tv80Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl21(ejw0 ejw0Var, iu30 iu30Var) {
        super(0);
        this.a = (byte) 5;
        this.c = ejw0Var;
        this.b = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rl21(Object obj, Object obj2, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
