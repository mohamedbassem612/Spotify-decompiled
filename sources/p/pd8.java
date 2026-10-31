package p;

import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pd8 extends w3x {
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd8(vdg vdgVar) {
        super(false);
        this.d = (byte) 4;
        this.e = vdgVar;
    }

    public final void c() {
        w7h1 w7h1Var;
        byte b = this.d;
        b7x b7xVar = b7x.a;
        Object obj = this.e;
        switch (b) {
            case 0:
                ((BehaviorSubject) ((qd8) obj).b.g).onNext(new xd8(null));
                return;
            case 1:
                Consumer consumer = (Consumer) ((s59) ((l59) obj).b).b;
                if (consumer != null) {
                    consumer.accept(n49.a);
                    return;
                }
                return;
            case 2:
                zyf zyfVar = (zyf) obj;
                th30 th30VarB = zyfVar.b();
                pyf pyfVar = (pyf) (th30VarB != null ? th30VarB.F(((FrameLayout) zyfVar.d.c).getId()) : null);
                if (pyfVar != null) {
                    WebView webView = ((ijl1) pyfVar).H1;
                    if (webView != null && webView.canGoBack()) {
                        uba ubaVar = pyfVar.e2;
                        if (ubaVar == null) {
                            u890.C("ubiLogger");
                            throw null;
                        }
                        dsk0 dsk0Var = pyfVar.g2;
                        if (dsk0Var == null) {
                            u890.C("webviewEventsFact");
                            throw null;
                        }
                        ubaVar.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), dsk0Var.b, r6h1.c, System.currentTimeMillis()), (xj61) null);
                        webView.goBack();
                        return;
                    }
                    uba ubaVar2 = pyfVar.e2;
                    if (ubaVar2 == null) {
                        u890.C("ubiLogger");
                        throw null;
                    }
                    dsk0 dsk0Var2 = pyfVar.g2;
                    if (dsk0Var2 == null) {
                        u890.C("webviewEventsFact");
                        throw null;
                    }
                    tv80 tv80VarM = ubaVar2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "")), dsk0Var2.b, r6h1.c, System.currentTimeMillis()), (xj61) null);
                    uyf uyfVar = pyfVar.i2;
                    if (uyfVar == null) {
                        u890.C("listener");
                        throw null;
                    }
                    String str = tv80VarM.a.a;
                    m021 m021Var = uyfVar.a;
                    try {
                        ((a1r0) m021Var.c).l();
                        return;
                    } catch (IllegalArgumentException unused) {
                        ((q7r0) m021Var.b).c(str);
                        return;
                    }
                }
                return;
            case 3:
                jdg jdgVar = (jdg) obj;
                ((cfd) jdgVar.c).r();
                ((lzn0) jdgVar.b).e();
                return;
            case 4:
                syf syfVar = ((vdg) obj).e;
                if (syfVar != null) {
                    syfVar.invoke(tdg.a);
                    return;
                }
                return;
            case 5:
                ((Function0) ((ven0) obj).getValue()).invoke();
                return;
            case 6:
                wsv wsvVar = (wsv) obj;
                jut jutVar = wsvVar.a;
                i8h1 i8h1Var = (i8h1) jutVar.c;
                x6h1 x6h1VarC = ((txk0) jutVar.b).b.c();
                x6h1VarC.i.add(new a7h1("navigation_bar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                wsvVar.d.a(vrv.a);
                return;
            case 7:
                ((fvv) obj).c.a(luv.a);
                return;
            case 8:
                ipe0 ipe0Var = (ipe0) obj;
                boolean z = ((w3x) ipe0Var.c).a;
                iac0 iac0Var = ipe0Var.b;
                if (iac0Var != null) {
                    fn31.T(cto1.q(iac0Var), (o8n) null, 0, new oy3(ipe0Var, z, (lnm) null, (byte) 9), 3);
                    return;
                }
                return;
            case 9:
                Consumer consumer2 = (Consumer) ((s59) ((l59) obj).b).b;
                if (consumer2 != null) {
                    consumer2.accept(hjg0.a);
                    return;
                }
                return;
            case 10:
                l4k0 l4k0Var = (l4k0) obj;
                dt71 dt71Var = l4k0Var.e;
                boolean zBooleanValue = ((Boolean) l4k0Var.d.b.getValue()).booleanValue();
                yjl0 yjl0Var = l4k0Var.f;
                r6h1 r6h1Var = yjl0Var.a;
                y6h1 y6h1Var = yjl0Var.b;
                if (zBooleanValue) {
                    x6h1 x6h1VarC3 = y6h1Var.c();
                    x6h1VarC3.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC3.a(), r6h1Var, System.currentTimeMillis());
                } else {
                    x6h1 x6h1VarC4 = y6h1Var.c();
                    x6h1VarC4.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), r6h1Var, System.currentTimeMillis());
                }
                dt71Var.a(new d2k0(((i8h1) l4k0Var.c.get()).m(w7h1Var, (xj61) null)));
                return;
            case 11:
                ((n5k0) obj).b.a(f5k0.a);
                return;
            case 12:
                ((ugk0) obj).b.a(igk0.a);
                return;
            case 13:
                ((f4t0) obj).Y.a.accept(m9u.a);
                return;
            case 14:
                fvx0 fvx0Var = (fvx0) ((jdg) obj).e;
                fvx0Var.e.accept(dtx0.a);
                if (((ScrollView) ((y441) fvx0Var.d.X).a).getVisibility() == 0) {
                    mtx0 mtx0Var = (mtx0) fvx0Var.Y.b;
                    i8h1 i8h1Var2 = mtx0Var.a;
                    x6h1 x6h1VarC5 = mtx0Var.b.b.c();
                    x6h1VarC5.i.add(new a7h1("onboarding_view", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = true;
                    x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                    x6h1VarC6.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                    return;
                }
                return;
            case 15:
                ((Function0) obj).invoke();
                return;
            default:
                h751 h751Var = (h751) obj;
                ib51 ib51Var = h751Var.f.d.a;
                ib51Var.a = null;
                ib51Var.b = null;
                d(false);
                h751Var.c.a(uc51.b);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pd8(Object obj, byte b) {
        super(true);
        this.d = b;
        this.e = obj;
    }
}
