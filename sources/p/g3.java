package p;

import android.content.Context;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.adonappopen.repository.storage.AdOnAppOpenDatabase_Impl;
import com.spotify.messages.AdUnlockedOnDemand;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.mobius.functions.Consumer;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.Observable;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class g3 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g3(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                n3 n3Var = (n3) obj;
                return n3Var.b.a(n3Var.a);
            case 1:
                v3 v3Var = (v3) obj;
                return new n3(v3Var.a, v3Var.b, v3Var.c, v3Var.d, v3Var.e);
            case 2:
                q8n q8nVar = ((dj) obj).c;
                j0d1 j0d1VarB = guo1.B();
                q8nVar.getClass();
                return flo1.l(q8nVar, j0d1VarB);
            case 3:
                return (MessageResponseToken) ((pu40) ((tm) obj).d).invoke();
            case 4:
                bqk0 bqk0Var = ((eo) obj).Y;
                bqk0Var.getClass();
                x6h1 x6h1VarC = bqk0Var.b.c();
                x6h1VarC.i.add(new a7h1("top_bar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA = x6h1VarC2.a();
                b7x b7xVar = b7x.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis());
            case 5:
                Consumer consumer = (Consumer) ((sp) obj).f;
                if (consumer != null) {
                    consumer.accept(vo.a);
                    return rih1Var;
                }
                u890.C("consumer");
                throw null;
            case 6:
                return new m441(new wt((xt) obj, (lnm) null, (byte) 0));
            case 7:
                return d5p1.t(new nf(yoi1.g((Observable) obj), (byte) 3), smo1.e(flo1.l(op71.f(), igu.b)), new alb1(0L, Long.MAX_VALUE), Boolean.TRUE);
            case 8:
                r30 r30Var = (r30) obj;
                return new i40(r30Var.b, r30Var.c, r30Var.d, r30Var.e, r30Var.f, r30Var.g, r30Var.h, r30Var.i, r30Var.t, r30Var.a, r30Var.X, r30Var.Y, r30Var.Z);
            case 9:
                return (xpw) ((t30) obj).b.invoke();
            case 10:
                ((a90) obj).c.invoke();
                return rih1Var;
            case 11:
                return Integer.valueOf(((jk0) obj).a.c.size());
            case 12:
                return new rs0((AdOnAppOpenDatabase_Impl) obj);
            case 13:
                nt0 nt0Var = (nt0) obj;
                faa0 faa0Var = nt0Var.u;
                if (faa0Var != null) {
                    faa0Var.d((CancellationException) null);
                }
                nt0Var.u = null;
                return rih1Var;
            case 14:
                return new kpg0((xpw) ((id1) obj).b.get(), gx0.U0);
            case 15:
                sb7 sb7Var = (sb7) ((teq) ((l7m0) ((oql) ((xwo) obj).a.b).b).b).V5.get();
                c8o.l(sb7Var);
                return new kpg0(new br0(sb7Var), gx0.Z0);
            case 16:
                ((el1) obj).g.b.a(rih1Var);
                return rih1Var;
            case 17:
                wm1 wm1Var = (wm1) obj;
                return wm1Var.c.a(uj1.n, new xm1(wm1Var.t, (byte) 0));
            case 18:
                asn asnVar = (asn) ((fxo) ((bn1) obj).g).a.b;
                Context context = (Context) ((ozp) asnVar.b).a.x1.a;
                c8o.l(context);
                lik1 lik1VarG = ((qop) asnVar.a).g();
                oj3 oj3Var = (oj3) ((ozp) asnVar.b).b.k1.get();
                c8o.l(oj3Var);
                return new kpg0(new yxb0(context, lik1VarG, oj3Var), im1.Y);
            case 19:
                ((hh) obj).invoke();
                return rih1Var;
            case 20:
                ((g3) obj).invoke();
                return rih1Var;
            case 21:
                vh3 vh3Var = (vh3) ((d520) obj).h;
                if (vh3Var != null) {
                    vh3Var.cancel();
                }
                return rih1Var;
            case 22:
                ((jt1) obj).Y0();
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ((ov1) obj).f.setValue(Boolean.TRUE);
                return rih1Var;
            case 24:
                int i = kgr0.T0;
                return xyn1.z((ScrollView) ((u22) obj).d.b);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return hap1.m((CoordinatorLayout) ((eyh0) obj).b).b0(bn70.class);
            case 26:
                e42 e42Var = (e42) obj;
                luk lukVar = e42Var.b;
                if (lukVar != null) {
                    return lukVar.e(new d42(e42Var, (byte) 0));
                }
                return null;
            case 27:
                ce31 ce31Var = (ce31) obj;
                c01 c01VarN = AdUnlockedOnDemand.n();
                c01VarN.n(b01.e);
                c01VarN.s(ce31Var.b);
                ce31Var.b(c01VarN);
                ce31Var.a.a(c01VarN.build());
                return rih1Var;
            case 28:
                c62 c62Var = (c62) obj;
                c62Var.V0.a(c62Var.P0.firstOrError().zipWith(c62Var.T0.z(), olj0.e).observeOn(c62Var.U0).subscribe(new b62(c62Var, (byte) 1), nm.t));
                return rih1Var;
            default:
                return new kpg0((xpw) ((d82) obj).d.get(), ny1.R0);
        }
    }
}
