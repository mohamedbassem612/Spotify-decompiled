package p;

import android.app.Activity;
import android.os.Bundle;
import com.spotify.mobius.MobiusLoop;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hu90 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hu90(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke(Object obj) {
        d4n d4nVar;
        hxa0 hxa0Var;
        byte b = this.a;
        byte b2 = 15;
        lnm lnmVar = null;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((bw91) obj2).remove((eyz0) obj);
                return rih1Var;
            case 1:
                ((qtr) obj).b(new f3((yxb0) obj2, (lnm) null, (byte) 15));
                return rih1Var;
            case 2:
                ((qtr) obj).b(new gz0((rw90) obj2, (lnm) null, (byte) 13));
                return rih1Var;
            case 3:
                ((qtr) obj).b(new js((xw90) obj2, (lnm) null, (byte) 13));
                return rih1Var;
            case 4:
                return (ior) ((jly0) ((l4a1) obj2).a.a((Activity) obj).h).get();
            case 5:
                return (e7p0) ((obq) ((o4a1) obj2).a.a((Activity) obj).N0).get();
            case 6:
                return (g5p0) ((obq) ((q4a1) obj2).a.a((Activity) obj).O0).get();
            case 7:
                MobiusLoop mobiusLoop = ((xz90) obj2).O0;
                if (mobiusLoop != null) {
                    mobiusLoop.dispose();
                    return rih1Var;
                }
                u890.C("mobiusLoop");
                throw null;
            case 8:
                b261.n((e261) obj, ((p0a0) obj2).a);
                return rih1Var;
            case 9:
                MobiusLoop mobiusLoop2 = ((o2a0) obj2).N0;
                if (mobiusLoop2 != null) {
                    mobiusLoop2.dispose();
                    return rih1Var;
                }
                u890.C("mobiusLoop");
                throw null;
            case 10:
                return (ljg) ((jly0) ((n4a1) obj2).a.a((Activity) obj).k1).get();
            case 11:
                return Boolean.valueOf(((djq0) obj) == ((djq0) obj2));
            case 12:
                xnb xnbVar = (xnb) obj2;
                return d3p1.H(xnbVar.b, xnbVar.c, (hna0) obj);
            case 13:
                rq2 rq2Var = ((ura0) obj).b;
                boolean zA = ((mta0) obj2).i.a();
                lpu lpuVar = new lpu(false, false);
                fg91 fg91Var = fg91.b;
                return new vra0(rq2Var, false, fg91Var, "", "", 1, (String) null, zA, (String) null, (String) null, fg91Var, lpuVar, false);
            case 14:
                elb0 elb0Var = (elb0) obj;
                xta0 xta0Var = (xta0) obj2;
                if (xta0Var != null) {
                    xta0Var.a.setValue(nho1.v(elb0Var).M(elb0Var, true));
                }
                return rih1Var;
            case 15:
                return ((sva0) obj2).a;
            case 16:
                Bundle bundle = (Bundle) obj;
                if (bundle != null && (d4nVar = (d4n) jhc1.t(bundle, "coppa_page_model", d4n.class)) != null) {
                    return d4nVar;
                }
                e4n e4nVar = ((yva0) obj2).b;
                return new d4n(e4nVar.a, false, e4nVar.b, h4n.a);
            case 17:
                return ((cwa0) obj2).f;
            case 18:
                return ((uwa0) obj2).b;
            case 19:
                Bundle bundle2 = (Bundle) obj;
                if (bundle2 != null && (hxa0Var = (hxa0) jhc1.t(bundle2, "parental_controls_model_key", hxa0.class)) != null) {
                    return hxa0Var;
                }
                lxa0 lxa0Var = ((jxa0) obj2).b;
                dxr0 dxr0Var = lxa0Var.a;
                return new hxa0(dxr0Var.a, dxr0Var.b, lxa0Var.d, lxa0Var.e, lxa0Var.b, lxa0Var.c);
            case 20:
                Bundle bundle3 = (Bundle) obj;
                qxa0 qxa0Var = (qxa0) obj2;
                boolean z = qxa0Var.h;
                rmc1 rmc1Var = qxa0Var.c;
                if (bundle3 == null) {
                    return new svr0(rmc1Var.a, rmc1Var.f, z);
                }
                svr0 svr0Var = (svr0) bundle3.getParcelable("model");
                return svr0Var == null ? new svr0(rmc1Var.a, rmc1Var.f, z) : svr0Var;
            case 21:
                ((qtr) obj).b(new skv((x0b0) obj2, lnmVar, b2));
                return rih1Var;
            case 22:
                return ((i1b0) obj2).c;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                k9e k9eVar = (k9e) obj2;
                b261.k((e261) obj, new d4h(k9eVar.d, k9eVar.c));
                return rih1Var;
            case 24:
                return new ow9(((zwz0) obj2).d(), (Set) obj, (byte) 3);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                dxz0 dxz0Var = (dxz0) obj2;
                return yoi1.g(dxz0Var.c().startWithItem(dxz0Var.b()).distinctUntilChanged());
            case 26:
                m5b0 m5b0Var = (m5b0) obj2;
                o3r o3rVar = (o3r) m5b0Var.g;
                d0r d0rVar = (d0r) m5b0Var.f;
                ned0 ned0Var = ((oed0) obj).a;
                if (ned0Var instanceof ked0) {
                    return hu20.c(d3p1.F(d0rVar, o3rVar, ((ked0) ned0Var).a), new n0a0(m5b0Var, (lnm) null));
                }
                if (!(ned0Var instanceof med0)) {
                    eg.o();
                    return null;
                }
                ArrayList arrayList = ((med0) ned0Var).a;
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((led0) it.next()).a);
                }
                return new x880(t2p1.u(d0rVar, o3rVar, arrayList2), arrayList, (byte) 16);
            case 27:
                return ((o860) obj2).m((jl20) obj);
            case 28:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((cab0) obj2).a.invoke(bool);
                return rih1Var;
            default:
                b261.y((e261) obj, ((nbb0) obj2).c);
                return rih1Var;
        }
    }
}
