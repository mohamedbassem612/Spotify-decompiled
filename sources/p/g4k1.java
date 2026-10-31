package p;

import android.app.Activity;
import android.view.View;
import android.webkit.WebView;
import com.spotify.adsdisplay.browser.inapp.di.WebViewUnavailableException;
import com.spotify.wrapped.v1.proto.StoryCard;
import io.reactivex.rxjava3.core.ObservableEmitter;
import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class g4k1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4k1(p811 p811Var, gik1 gik1Var, View view) {
        super(0);
        this.a = (byte) 5;
        this.b = p811Var;
        this.c = view;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.adsdisplay.browser.inapp.di.WebViewUnavailableException */
    public final Object invoke() throws WebViewUnavailableException {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return new kpg0((xpw) ((h4k1) obj2).a.invoke((oud) obj), a0k1.b1);
            case 1:
                ((ven0) obj).setValue(Boolean.TRUE);
                ((n6k1) obj2).a.j.invoke();
                return rih1Var;
            case 2:
                ((hak1) obj2).a.invoke(new iik1((String) obj));
                return rih1Var;
            case 3:
                ((iu30) ((pm70) obj2).d).invoke(new lak1(((ea6) ((tob1) obj).getValue()).k));
                return rih1Var;
            case 4:
                ((View) obj2).getViewTreeObserver().removeOnWindowFocusChangeListener((zqi1) obj);
                return rih1Var;
            case 5:
                p811 p811Var = (p811) obj2;
                Object obj3 = p811Var.a;
                if (obj3 == null) {
                    View view = (View) obj;
                    while (true) {
                        if (view != null) {
                            if (!u890.j(view.getTag(2131431638), "TAG_CONTAINER_VIEW")) {
                                Object parent = view.getParent();
                                if (parent instanceof View) {
                                    view = (View) parent;
                                }
                            }
                            obj3 = view;
                        } else {
                            obj3 = null;
                        }
                    }
                    p811Var.a = obj3;
                }
                View view2 = (View) obj3;
                if (view2 != null) {
                    return hap1.w(view2);
                }
                return null;
            case 6:
                ((ObservableEmitter) obj2).onNext(new psk1(((onr) obj).a()));
                return rih1Var;
            case 7:
                int i = iel1.d;
                ((xu30) obj2).invoke(Integer.valueOf(((Number) ((ven0) obj).getValue()).intValue()), Boolean.FALSE, ssj0.b);
                return rih1Var;
            case 8:
                WebView webViewH = ((q6y) obj2).H();
                if (webViewH == null) {
                    throw new WebViewUnavailableException();
                }
                xil1 xil1Var = (xil1) obj;
                webViewH.setWebViewClient(new lp8(xil1Var));
                webViewH.setWebChromeClient(new p78(xil1Var, (byte) 1));
                return webViewH;
            case 9:
                mml1 mml1Var = (mml1) obj2;
                ((i8h1) mml1Var.d.getValue()).m(mml1Var.c.e(), (xj61) null);
                ((iu30) obj).invoke(t000.a);
                return rih1Var;
            case 10:
                ((zxl1) obj2).j();
                ((b2m1) obj).a.accept(x3m1.a);
                return rih1Var;
            case 11:
                zxl1 zxl1Var = (zxl1) obj2;
                int iS = ((hdn0) obj).s();
                i8h1 i8h1Var = (i8h1) zxl1Var.b;
                zok0 zok0Var = (zok0) zxl1Var.c;
                zok0Var.getClass();
                x6h1 x6h1VarC = zok0Var.b.c();
                x6h1VarC.i.add(new a7h1("discovery_slider", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                z7h1 z7h1Var = new z7h1("drag", 1, b7xVar);
                String strValueOf = String.valueOf(iS);
                if (strValueOf == null) {
                    strValueOf = "";
                }
                i8h1Var.m(new w7h1("", "", z7h1Var, new x7h1("set_slider_position", 1, Collections.singletonMap("position", strValueOf)), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                return rih1Var;
            case 12:
                zxl1 zxl1Var2 = (zxl1) obj2;
                i8h1 i8h1Var2 = (i8h1) zxl1Var2.b;
                zok0 zok0Var2 = (zok0) zxl1Var2.c;
                zok0Var2.getClass();
                x6h1 x6h1VarC2 = zok0Var2.b.c();
                x6h1VarC2.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                i4m1 i4m1Var = (i4m1) obj;
                i4m1Var.m.a(nxb.a(i4m1Var.l, (Integer) null, (ixb) null, 0, true, false, 3967));
                i4m1Var.b.g();
                return rih1Var;
            case 13:
                ((iu30) obj2).invoke((gzl1) obj);
                return rih1Var;
            case 14:
                g4k g4kVar = ((l8m1) obj2).a;
                StoryCard storyCard = ((c8m1) obj).c;
                g4kVar.getClass();
                f4k f4kVar = new f4k(g4kVar, storyCard, (byte) 1);
                if (!g4kVar.c.get()) {
                    f4kVar.invoke();
                }
                return rih1Var;
            case 15:
                fn31.T(((o0i) obj2).a, (o8n) null, 0, new w73((iu30) obj, (lnm) null, (byte) 25), 3);
                return rih1Var;
            case 16:
                udm1 udm1Var = (udm1) obj2;
                float fFloatValue = ((Number) ((ven0) obj).getValue()).floatValue();
                udm1Var.getClass();
                float fO = yoi1.o(fFloatValue, 0.0f, 0.6981317f);
                if (udm1Var.l != fO) {
                    udm1Var.l = fO;
                    udm1Var.j = yoi1.o(udm1Var.i + udm1Var.j, -fO, fO) - udm1Var.i;
                    udm1Var.a();
                }
                return rih1Var;
            case 17:
                cem1 cem1Var = (cem1) obj;
                xhm1 xhm1Var = (xhm1) obj2;
                if (xhm1Var != null) {
                    idm1 idm1Var = cem1Var.f;
                    i8h1 i8h1Var3 = idm1Var.c;
                    c4m0 c4m0VarA = idm1Var.a(xhm1Var);
                    x6h1 x6h1VarC3 = c4m0VarA.c.c();
                    x6h1VarC3.i.add(new a7h1("panorama_view", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                    x6h1VarC4.i.add(new a7h1("error", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = true;
                    x6h1 x6h1VarC5 = x6h1VarC4.a().c();
                    x6h1VarC5.i.add(new a7h1("retry_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = true;
                    i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), x6h1VarC5.a(), c4m0VarA.b, System.currentTimeMillis()), (xj61) null);
                }
                qem1 qem1Var = cem1Var.d;
                bpb1 bpb1Var = qem1Var.g;
                if (u890.j(bpb1Var.getValue(), nem1.a)) {
                    qem1Var.h.m((Object) null, Boolean.FALSE);
                    bpb1Var.m((Object) null, iem1.a);
                    qem1Var.h();
                }
                return rih1Var;
            case 18:
                StoryCard storyCard2 = ((wgm1) ((tob1) obj2).getValue()).a;
                return Boolean.valueOf(u890.j(storyCard2 != null ? storyCard2.getId() : null, ((cem1) obj).g));
            case 19:
                p2j1 p2j1Var = ((kfm1) obj2).a;
                q8n q8nVarX = brt.x();
                fns fnsVar = igu.a;
                b3s b3sVar = b3s.c;
                t84 t84Var = new t84(false, (luk) p2j1Var.b);
                wh71 wh71Var = (wh71) p2j1Var.c;
                c8o.l(wh71Var);
                e4p e4pVar = (e4p) p2j1Var.e;
                iac0 iac0Var = (Activity) p2j1Var.j;
                o771 o771Var = (o771) p2j1Var.f;
                g871 g871Var = (g871) p2j1Var.g;
                uq7 uq7Var = new uq7(q8nVarX, t84Var, wh71Var, (oud) obj, e4pVar, iac0Var, o771Var, g871Var, (yqg) p2j1Var.h);
                gm31 gm31Var = (gm31) p2j1Var.d;
                hyl0 hyl0Var = (hyl0) p2j1Var.i;
                c8o.l(hyl0Var);
                return new kpg0(new e27(uq7Var, new avp0(gm31Var, hyl0Var, p2j1Var.a, g871Var)), gbm1.N0);
            case 20:
                if (((gqm1) obj2).a.g()) {
                    return new yir(((xfx) obj).c.b, (byte) 25);
                }
                return null;
            default:
                int[] iArr = (int[]) obj2;
                int i2 = iArr[0];
                fdc fdcVar = ((upb0) obj).d;
                boolean z = i2 == ((err0) fdcVar.c).s() ? iArr[1] > ((err0) fdcVar.d).s() : iArr[0] > ((err0) fdcVar.c).s();
                iArr[0] = ((err0) fdcVar.c).s();
                iArr[1] = ((err0) fdcVar.d).s();
                return Boolean.valueOf(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g4k1(Object obj, Object obj2, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
