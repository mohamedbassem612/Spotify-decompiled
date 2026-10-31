package p;

import android.R;
import androidx.compose.ui.geometry.Offset;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tak1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tak1(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        String str = null;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return (x4j0) obj2;
            case 1:
                return Boolean.valueOf(u890.j(((gmc) ((mmr0) obj).a).a, ((alc) obj2).a));
            case 2:
                return (Boolean) ((xak1) obj2).invoke((mmr0) obj);
            case 3:
                return Boolean.valueOf(u890.j(((gmc) ((mmr0) obj).a).a, ((qtg) obj2).d.a));
            case 4:
                z4j0 z4j0Var = (z4j0) obj2;
                return new y4j0(z4j0Var.a, z4j0Var.b);
            case 5:
                return new vm61(2131963814, 2131963813, Integer.valueOf(R.string.ok), new bu51(obj2, (lnm) str, (byte) 21), new um61(new sl11(8, (byte) 7), new n601(eak1.X, (byte) 28), fft0.Z0));
            case 6:
                gj50 gj50Var = (gj50) obj2;
                boolean z = ((Number) obj).intValue() > 50;
                if (gj50Var.a != z) {
                    gj50Var.b.invoke(Boolean.valueOf(z));
                }
                gj50Var.a = z;
                return rih1Var;
            case 7:
                w7l1 w7l1Var = (w7l1) o7h.t0(((qtb0) obj).a, (c9) obj2);
                if (w7l1Var != null) {
                    return w7l1Var.f;
                }
                return null;
            case 8:
                wzw0 wzw0Var = ((d2l1) obj2).a;
                return new fzk1(f46.i0(new String[]{wzw0Var.a ? "name" : null, wzw0Var.b ? "image" : null}));
            case 9:
                return new qvc0(((cbk0) ((cik1) obj2).b).a, null, Collections.singleton(new hrc0((String) obj)), null, 10);
            case 10:
                ((r4l1) obj2).a.onNext(spq0.d(((mlv0) obj).b().a().contentDeliveryIOTransport()));
                return rih1Var;
            case 11:
                tr80 tr80Var = (tr80) obj;
                fdc fdcVar = (fdc) ((o0g1) obj2).d;
                fdcVar.getClass();
                Set setP1 = o7h.p1(tr80Var);
                Set setP2 = o7h.p1((tr80) fdcVar.f);
                Set setV0 = dm61.v0(setP2, setP1);
                Set setV1 = dm61.v0(setP1, setP2);
                Iterator it = setV0.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    z511 adapter = ((RecyclerView) fdcVar.c).getAdapter();
                    if (iIntValue < (adapter != null ? adapter.e() : 0)) {
                        ((f0t) fdcVar.e).invoke(Integer.valueOf(iIntValue));
                    }
                }
                fdcVar.f = tr80Var;
                if (fdcVar.b) {
                    Iterator it2 = setV1.iterator();
                    while (it2.hasNext()) {
                        ((f0t) fdcVar.d).invoke(Integer.valueOf(((Number) it2.next()).intValue()));
                    }
                }
                return rih1Var;
            case 12:
                return d3p1.G((d0r) ((nm1) obj2).b, h6l1.a, (f6l1) obj);
            case 13:
                return d3p1.G(((qfv) obj2).b, i13.A, (j6l1) obj);
            case 14:
                return ((q7l1) obj2).a;
            case 15:
                s6l1 s6l1Var = ((r6l1) obj).c;
                g0y0 g0y0Var = (g0y0) obj2;
                return new sq60(s6l1Var.a, s6l1Var.c, s6l1Var.b, s6l1Var.d, !((w25) g0y0Var.e).l(), ((uk00) g0y0Var.f).b);
            case 16:
                return new kcf1((hcl1) obj2, (byte) 11);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new x010((mr20) obj, ((roc0) ((koc0) ((uqg) obj2).b)).d(), new w6y0(3, null, (byte) 1), (byte) 1);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                b261.n((e261) obj, ((p5j1) obj2).f);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                long j = ((Offset) obj).a;
                ((Function0) ((jti0) obj2).X).invoke();
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                lfl1 lfl1Var = (lfl1) obj2;
                lfl1Var.l.c(lfl1.m[2], lfl1Var, new WeakReference((hfl1) obj));
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                gxb gxbVar = (hxb) obj;
                ynb0 ynb0Var = ((ahl1) obj2).d;
                if (gxbVar instanceof gxb) {
                    y6h1 y6h1Var = y6h1.i;
                    x6h1 x6h1VarI = i3o1.i();
                    x6h1VarI.h = "music";
                    x6h1VarI.a = "mobile-wear-download-upsell";
                    x6h1VarI.f = "1.0.0";
                    x6h1VarI.g = "22.0.0";
                    y6h1 y6h1VarA = x6h1VarI.a();
                    Collections.singletonList("reinventfree-wear-download-upsell");
                    int iC = l1d.C(gxbVar.a);
                    b7x b7xVar = b7x.a;
                    if (iC == 0) {
                        i8h1 i8h1Var = (i8h1) ynb0Var.get();
                        x6h1 x6h1VarC = y6h1VarA.c();
                        x6h1VarC.i.add(new a7h1("background_overlay", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC.j = false;
                        i8h1Var.m(new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                    } else if (iC == 2) {
                        i8h1 i8h1Var2 = (i8h1) ynb0Var.get();
                        x6h1 x6h1VarC2 = y6h1VarA.c();
                        x6h1VarC2.i.add(new a7h1("background_overlay", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC2.j = false;
                        i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                    }
                }
                return rih1Var;
            case 22:
                return ((bql1) ((spl1) obj2).j.get()).a();
            case 23:
                return new gcm((String) obj, ((bn70) ((zrj1) obj2).d).b.a, (ucm) null, (Function0) null, 28);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new gcm(((uv11) obj).a, ((lik1) ((e821) obj2).e).a, (ucm) null, w3l1.X0, 12);
            case 25:
                return new rxc0(((z2y0) obj2).b);
            case 26:
                return new yv8(((y4m1) obj2).b((String) obj), (byte) 8);
            case 27:
                return new rxc0(((mzl1) obj2).a);
            case 28:
                vbe1 vbe1Var = (vbe1) obj2;
                koc0 koc0Var = (koc0) vbe1Var.d;
                return h5p1.s(((roc0) koc0Var).c(), ((roc0) koc0Var).d(), rqt0.u(new yv8(((y4m1) ((qpj1) vbe1Var.f).b).b((String) vbe1Var.c), (byte) 10)), new xzu0((Object) vbe1Var, (lnm) str, (byte) 5));
            default:
                g2m1 g2m1Var = (g2m1) obj2;
                g2m1Var.a.start();
                return new kcf1(g2m1Var, (byte) 13);
        }
    }
}
