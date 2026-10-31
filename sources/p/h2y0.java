package p;

import android.content.Context;
import android.view.View;
import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.esperanto.esperantocosmos.CosmosCoroutineTransport;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.martini.martinidata.model.Mode;
import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class h2y0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h2y0(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke() {
        bn70 bn70Var;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        byte b2 = 10;
        rih1 rih1Var = rih1.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new kpg0((xpw) ((j2y0) obj).f.get(), g2y0.c);
            case 1:
                kt91 kt91Var = ((m2y0) obj).g;
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131958029});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var.k(new er91((fs91) null, "", 2131958029, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return rih1Var;
            case 2:
                a1q a1qVar = (a1q) ((zkq) ((z2y0) obj).f).a.b;
                k3q k3qVar = (k3q) a1qVar.b;
                teq teqVar = k3qVar.b;
                h3y0 h3y0Var = (h3y0) teqVar.k8.get();
                c8o.l(h3y0Var);
                daq daqVar = k3qVar.a;
                e7y0 e7y0Var = (e7y0) daqVar.a.C4.get();
                c8o.l(e7y0Var);
                u6y0 u6y0Var = (u6y0) teqVar.l8.get();
                c8o.l(u6y0Var);
                lc20 lc20Var = new lc20(h3y0Var, e7y0Var, u6y0Var, (byte) 10);
                a1r0 a1r0Var = (a1r0) teqVar.V0.get();
                c8o.l(a1r0Var);
                kt91 kt91Var2 = (kt91) daqVar.f8.get();
                c8o.l(kt91Var2);
                x1i1 x1i1Var = (x1i1) teqVar.F6.get();
                c8o.l(x1i1Var);
                ced0 ced0Var = new ced0((byte) 4);
                luk lukVar = (luk) daqVar.L1.get();
                c8o.l(lukVar);
                wp20 wp20Var = new wp20(a1r0Var, kt91Var2, x1i1Var, ced0Var, new rg4(lukVar));
                x1i1 x1i1Var2 = (x1i1) teqVar.F6.get();
                c8o.l(x1i1Var2);
                pd40 pd40Var = new pd40(lc20Var, wp20Var, x1i1Var2, new ced0((byte) 4));
                i5y0 i5y0Var = (i5y0) ((k3q) a1qVar.b).b.pb.get();
                c8o.l(i5y0Var);
                return new kpg0(new de40(pd40Var, i5y0Var), g2y0.Y);
            case 3:
                return ((qlb) obj).b;
            case 4:
                return new kpg0((xpw) ((j2y0) obj).f.get(), g2y0.U0);
            case 5:
                ((blq) obj).getClass();
                return new kpg0(new laa1((byte) 3), g2y0.X0);
            case 6:
                return new kpg0((xpw) ((uyp) ((w4y0) obj).e).get(), g2y0.a1);
            case 7:
                f6y0 f6y0Var = (f6y0) obj;
                return new kpg0((xpw) f6y0Var.c.get(), new d6y0(f6y0Var, (byte) 1));
            case 8:
                ca3 ca3Var = (ca3) obj;
                return new xzq((qlb) ca3Var.b, new hox0(ca3Var, (byte) 14));
            case 9:
                return new kpg0((xpw) ((t7y0) obj).b.get(), e6y0.X);
            case 10:
                h82 h82Var = (h82) obj;
                return new kpg0((smp0) h82Var.c, new hox0(h82Var, (byte) 16));
            case 11:
                return new kpg0((xpw) ((m8y0) obj).b.get(), e6y0.P0);
            case 12:
                return new nu((bvm) obj);
            case 13:
                return (maa) ((w8y0) obj).a.get();
            case 14:
                sby0 sby0Var = (sby0) obj;
                return new kpg0((xpw) sby0Var.c.get(), new hox0(sby0Var, (byte) 19));
            case 15:
                return ((lwp) ((cm0) obj).f).a(nik1.z0, false, Mode.PROMPTABLE_SECTION);
            case 16:
                return new omy0(new CosmosCoroutineTransport(new q7v0((CallbackRouter) ((ugb) obj).a.get(), (byte) 1)));
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                bpy0 bpy0Var = (bpy0) obj;
                luk lukVar2 = bpy0Var.b;
                if (lukVar2 != null) {
                    return lukVar2.e(new e4n0(bpy0Var, (byte) 11));
                }
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                qpy0 qpy0Var = (qpy0) obj;
                luk lukVar3 = qpy0Var.b;
                if (lukVar3 != null) {
                    return lukVar3.e(new e4n0(qpy0Var, (byte) 12));
                }
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                File file = new File(((mvy0) obj).a.getCacheDir(), "push");
                if (!file.exists()) {
                    file.mkdirs();
                }
                return file;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                vf2 vf2Var = (vf2) obj;
                ((xxy0) vf2Var.e).e().subscribe();
                ((r0z0) vf2Var.b).cancel();
                ((r0z0) vf2Var.c).cancel();
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                xok0 xok0Var = ((ibz0) obj).U0;
                xok0Var.getClass();
                x6h1 x6h1VarC = xok0Var.b.c();
                x6h1VarC.i.add(new a7h1("top_bar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
            case 22:
                sbz0 sbz0Var = (sbz0) obj;
                Context context = sbz0Var.a;
                int i = context.getResources().getDisplayMetrics().heightPixels;
                int i2 = (int) (i * (sbz0Var.d() ? 0.3f : 0.66f));
                if (sbz0Var.d()) {
                    int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131166880);
                    if (i2 < dimensionPixelSize) {
                        i2 = dimensionPixelSize;
                    }
                    if (i2 <= i) {
                        i = i2;
                    }
                    i2 = i;
                }
                dbr0 t1r0Var = new t1r0(true);
                if (sbz0Var.d()) {
                    bn70Var = new bn70(new awz0("nowplaying/queue/peek"), new lik1("spotify:internal:now-playing:queue-peek"), (nar0) null);
                } else {
                    AtomicReferenceArray atomicReferenceArray = p6r0.e;
                    bn70Var = new bn70(yon1.c3(), nik1.w1, (nar0) null);
                }
                return new cbr0(new dbr0[]{t1r0Var, bn70Var, new nxb(Integer.valueOf(i2), null, null, sbz0Var.d() ? 2 : 1, null, sbz0Var.b, false, false, false, null, 4054), new cxb(new pbz0(sbz0Var, (byte) 2), new j2i(1683501425, new y6w0(sbz0Var, (byte) 26), true))}, false);
            case 23:
                ((vbz0) obj).b.a(ixb.c);
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                fcz0 fcz0Var = (fcz0) obj;
                g5p0 g5p0Var = fcz0Var.b;
                i8h1 i8h1Var = fcz0Var.d;
                x6h1 x6h1VarC3 = fcz0Var.c.b.c();
                x6h1VarC3.i.add(new a7h1("added_to_queue_snackbar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = true;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("action_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                g5p0.b(g5p0Var, i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:now-playing:queue")), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a, 2);
                return rih1Var;
            case 25:
                return f46.i0(new String[]{"dataSaverMode", "offlineMode", "privateSession", ((oez0) obj).b.b ? "disablePersonalizedRecommendations" : null});
            case 26:
                ifz0 ifz0Var = (ifz0) obj;
                return ((t8u0) ifz0.a(ifz0Var).get()).a(ifz0Var.getLifecycle()).d();
            case 27:
                apz0 apz0Var = (apz0) obj;
                qqp qqpVar = (qqp) ((kmq) apz0Var.d).a.c;
                Context context2 = (Context) ((z0q) qqpVar.d).a.x1.a;
                c8o.l(context2);
                return new kpg0(new hf2(bno1.s(context2), (lmq) ((jly0) qqpVar.b).get(), ((tbt) qqpVar.e).b), new fbz0(apz0Var, b2));
            case 28:
                lmq lmqVar = (lmq) ((hf2) obj).d;
                switch (lmqVar.a) {
                    case 0:
                        return lmqVar.a();
                    default:
                        return lmqVar.a();
                }
            default:
                Collection collectionValues = ((svz0) obj).b.values();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(Integer.valueOf((int) ((m67) it.next()).f));
                }
                return Collections.unmodifiableSet(linkedHashSet);
        }
    }
}
