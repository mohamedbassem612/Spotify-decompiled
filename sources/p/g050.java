package p;

import android.app.Activity;
import android.app.Application;
import com.spotify.puffin.core.data.headphonefilterstate.database.HeadphoneFilterStateDatabase_Impl;
import com.spotify.search.historyroom.db.HistoryDatabase_Impl;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Objects;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class g050 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g050(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke() {
        bkj0 bkj0Var;
        switch (this.a) {
            case 0:
                return ((ttk0) this.b).e();
            case 1:
                return (Activity) ((Application.ActivityLifecycleCallbacks) this.b).b.get();
            case 2:
                ((l750) this.b).a.finishAffinity();
                return rih1.a;
            case 3:
                return (i8h1) ((xep) ((sp00) this.b).b).get();
            case 4:
                return (oe41) ((g0i) ((h950) this.b).d).d.c;
            case 5:
                return (i8h1) ((xep) ((sp00) this.b).b).get();
            case 6:
                return (i8h1) ((xe50) this.b).a.get();
            case 7:
                ze50 ze50Var = (ze50) this.b;
                return ze50Var.e1.a(ze50Var);
            case 8:
                return (i8h1) ((af50) this.b).a.get();
            case 9:
                bpb1 bpb1Var = (bpb1) ((psy) this.b).h;
                Boolean bool = Boolean.TRUE;
                bpb1Var.getClass();
                bpb1Var.m((Object) null, bool);
                return rih1.a;
            case 10:
                uq71 uq71Var = uq71.a;
                w7x w7xVar = w7x.a;
                uq71 uq71Var2 = uq71.b;
                b160 b160Var = (b160) this.b;
                l1o l1oVar = b160Var.a;
                xf4 xf4Var = b160Var.h;
                int iC = l1d.C(l1oVar.b);
                if (iC != 0) {
                    if (iC != 1) {
                        eg.o();
                        return null;
                    }
                    boolean z = b160Var.g;
                    bkj0 bkj0Var2 = new bkj0(uq71Var2, w7xVar);
                    xw50 xw50Var = new xw50(new bkj0(uq71Var, w7xVar), new bkj0(um8.a, w7xVar), z ? null : bkj0Var2, null, 24);
                    if (!z) {
                        bkj0Var2 = null;
                    }
                    return new ky50(new ex50(xw50Var, null, bkj0Var2), null, null, null);
                }
                boolean z2 = b160Var.f;
                boolean zG = xf4Var.g();
                boolean zX = xf4Var.x();
                bkj0 bkj0Var3 = new bkj0(uq71Var2, w7xVar);
                bkj0 bkj0Var4 = new bkj0(mb6.d, w7xVar);
                xj61 xj61Var = new xj61();
                xj61Var.add(new yp21(a7q0.class));
                xj61Var.add(new yp21(pn30.class));
                if (zG) {
                    xj61Var.add(new yp21(uxn.class));
                }
                xj61 xj61VarJ = cwl1.j(xj61Var);
                bkj0 bkj0Var5 = new bkj0(mb6.a, c13.i(f7l1.class));
                bkj0 bkj0Var6 = new bkj0(uq71Var, w7xVar);
                if (zX) {
                    bkj0Var = bkj0Var4;
                } else {
                    bkj0Var = z2 ? null : bkj0Var3;
                }
                return new ky50(new ex50(new xw50(bkj0Var5, bkj0Var6, bkj0Var, (!zX || z2) ? null : bkj0Var3, 16), new cx50(new bkj0(mb6.b, w7xVar), new bkj0(mb6.c, w7xVar)), z2 ? bkj0Var3 : null), new bkj0(i7a.a, c13.i(iq6.class)), new bkj0(n3j1.a, xj61VarJ), new bkj0(bmj0.a, c13.i(a7q0.class)));
            case 11:
                i160 i160Var = (i160) this.b;
                jip jipVar = i160Var.j;
                String str = i160Var.b;
                iac0 iac0Var = i160Var.a;
                brl0 brl0Var = i160Var.l;
                switch (jipVar.a) {
                    case 0:
                        f9p f9pVar = (f9p) jipVar.b.c;
                        i8h1 i8h1VarZ = u1n0.z((q7r0) f9pVar.Y);
                        yzc0 yzc0Var = (yzc0) ((jly0) f9pVar.c).get();
                        q8n q8nVar = (q8n) ((vm30) f9pVar.t).X.get();
                        c8o.l(q8nVar);
                        return new jtf1(i8h1VarZ, yzc0Var, str, iac0Var, q8nVar, brl0Var);
                    default:
                        ib3 ib3Var = (ib3) jipVar.b.c;
                        return new jtf1((i8h1) ((jly0) ib3Var.d).get(), (yzc0) ((jly0) ib3Var.i).get(), str, iac0Var, brt.x(), brl0Var);
                }
            case 12:
                d460 d460Var = (d460) this.b;
                return new ozg1(new sfx(d460Var.a.e, (byte) 3), d460Var.b, d460Var.c, d460Var.d);
            case 13:
                return new ehb((HeadphoneFilterStateDatabase_Impl) this.b);
            case 14:
                return cwl1.F((q7r0) ((iz6) this.b).c);
            case 15:
                return (tyq) ((df60) this.b).b.invoke();
            case 16:
                return new bk1((qg60) this.b, (byte) 20);
            case 17:
                return new kpg0((xpw) ((xep) ((ih60) this.b).g).get(), z860.e1);
            case 18:
                return new kh60((HistoryDatabase_Impl) this.b);
            case 19:
                xo60 xo60Var = (xo60) this.b;
                String string = xo60Var.a.getString(2131959364);
                xo60Var.c.getClass();
                l7c l7cVar = blc0.a;
                return new uut0(string, oap1.f(), 3, upp0.a());
            case 20:
                return new rq60((c460) ((kly0) ((yfu) this.b).c).get());
            case 21:
                return (cv60) ((vu60) this.b).a.get();
            case 22:
                kw60 kw60Var = (kw60) this.b;
                return Integer.valueOf(kw60Var.d((Integer) null, kw60Var.c()));
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                cx60 cx60Var = (cx60) this.b;
                zfr zfrVar = cx60Var.e;
                i8h1 i8h1Var = (i8h1) zfrVar.b;
                x6h1 x6h1VarC = ((xok0) zfrVar.c).b.c();
                x6h1VarC.i.add(new a7h1("host_onboarding", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("got_it_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA = x6h1VarC2.a();
                b7x b7xVar = b7x.a;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                cx60Var.f.l();
                return rih1.a;
            case 24:
                bz81 bz81Var = (bz81) ((g9r) this.b).c;
                bz81Var.b.set(true);
                az81 az81Var = bz81Var.c;
                if (az81Var.h == az81Var.g.getAndIncrement()) {
                    az81Var.a.cancel();
                }
                return rih1.a;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return Integer.valueOf(Objects.hash(((sc70) this.b).b));
            case 26:
                ad70 ad70Var = (ad70) this.b;
                return Integer.valueOf(Objects.hash(ad70Var.a, ad70Var.b));
            case 27:
                return Integer.valueOf(Objects.hash(((dd70) this.b).a));
            case 28:
                return Integer.valueOf(Objects.hash(((gd70) this.b).a));
            default:
                return Integer.valueOf(Objects.hash(((id70) this.b).a));
        }
    }
}
