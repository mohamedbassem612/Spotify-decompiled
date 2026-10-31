package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.spotify.allboarding.allboardingdomain.model.SearchConfiguration;
import com.spotify.allboarding.allboardingimpl.AllboardingActivity;
import com.spotify.allboarding.allboardingimpl.presentation.carousel.CarouselFragment;
import com.spotify.allboarding.allboardingimpl.presentation.contentpicker.ContentPickerFragment;
import com.spotify.allboarding.allboardingimpl.utils.PickerCollapsingTitleBar;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class es3 implements rjp0, iv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ es3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void b(Object obj) {
        View view;
        byte b = this.a;
        byte b2 = 0;
        byte b3 = 1;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                lir0 lir0Var = (AllboardingActivity) obj2;
                int i = AllboardingActivity.l1;
                if (!(((gn3) obj) instanceof gn3)) {
                    eg.o();
                } else {
                    lir0Var.finish();
                }
                break;
            case 1:
                kp5 kp5Var = (kp5) obj2;
                int iOrdinal = ((li61) obj).ordinal();
                if (iOrdinal == 0) {
                    ip31 ip31Var = ((gp31) kp5Var.c).a;
                    i94 i94Var = (lxg) ip31Var.e;
                    i94Var.e("session_ui_plugins_on_ui_visible");
                    Iterator it = ((Set) ip31Var.b).iterator();
                    while (it.hasNext()) {
                        ((iyf0) it.next()).c();
                    }
                    i94Var.a("session_ui_plugins_on_ui_visible");
                    ((e4t) ip31Var.c).b(b4t.a);
                } else if (iOrdinal != 1) {
                    eg.o();
                } else {
                    ip31 ip31Var2 = ((fp31) kp5Var.b).a;
                    Iterator it2 = ((Set) ip31Var2.b).iterator();
                    while (it2.hasNext()) {
                        ((iyf0) it2.next()).d();
                    }
                    ((e4t) ip31Var2.c).b(b4t.b);
                }
                break;
            case 2:
                q1e q1eVar = (q1e) obj;
                CarouselFragment carouselFragment = (CarouselFragment) obj2;
                if (q1eVar instanceof o1e) {
                    o1e o1eVar = (o1e) q1eVar;
                    p791 p791Var = o1eVar.b;
                    String str = o1eVar.a;
                    Bundle bundle = new Bundle();
                    bundle.putInt("allboarding-skiptype-arg", p791Var.ordinal());
                    bundle.putString("allboarding-step-arg", str);
                    bundle.putInt("allboarding-skip-origin-arg", 1);
                    pap1.B(carouselFragment, 2131427916, 2131430996, bundle);
                } else if (q1eVar instanceof m1e) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("ALLBOARDING_SCREEN_RESPONSE", new ip41(((m1e) q1eVar).a, 2));
                    sap1.m(carouselFragment, "ALLBOARDING_SCREEN_RESPONSE", bundle2);
                } else if (q1eVar instanceof p1e) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putParcelable("ALLBOARDING_SCREEN_RESPONSE", new jp41(((p1e) q1eVar).a));
                    sap1.m(carouselFragment, "ALLBOARDING_SCREEN_RESPONSE", bundle3);
                } else if (!(q1eVar instanceof n1e)) {
                    eg.o();
                } else {
                    carouselFragment.X0(new Intent("android.intent.action.VIEW", Uri.parse(((n1e) q1eVar).a)));
                }
                break;
            case 3:
                z3m z3mVar = (z3m) obj;
                ContentPickerFragment contentPickerFragment = (ContentPickerFragment) obj2;
                if (!(z3mVar instanceof w3m)) {
                    if (z3mVar instanceof v3m) {
                        SearchConfiguration searchConfiguration = ((v3m) z3mVar).a;
                        Bundle bundle4 = new Bundle();
                        bundle4.putParcelable("allboarding-search-arg", searchConfiguration);
                        pap1.B(contentPickerFragment, 2131428220, 2131430789, bundle4);
                    } else if (z3mVar instanceof x3m) {
                        x3m x3mVar = (x3m) z3mVar;
                        p791 p791Var2 = x3mVar.b;
                        String str2 = x3mVar.a;
                        Bundle bundle5 = new Bundle();
                        bundle5.putInt("allboarding-skiptype-arg", p791Var2.ordinal());
                        bundle5.putString("allboarding-step-arg", str2);
                        bundle5.putInt("allboarding-skip-origin-arg", 0);
                        pap1.B(contentPickerFragment, 2131428220, 2131430996, bundle5);
                    } else if (z3mVar instanceof t3m) {
                        t3m t3mVar = (t3m) z3mVar;
                        int i2 = t3mVar.a;
                        int i3 = t3mVar.b;
                        String quantityString = i3 > 0 ? contentPickerFragment.k0().getQuantityString(2131820571, i2, Integer.valueOf(i2), Integer.valueOf(i3)) : contentPickerFragment.k0().getQuantityString(2131820570, i2, Integer.valueOf(i2));
                        quantityString.getClass();
                        if (contentPickerFragment.P1) {
                            view = contentPickerFragment.W1;
                            if (view == null) {
                                eg.m("Required value was null.");
                            }
                        } else {
                            tzr0 tzr0Var = contentPickerFragment.Q1;
                            tzr0Var.getClass();
                            view = (LinearLayout) ((phi0) tzr0Var.c).b;
                        }
                        b8k1.t(view, quantityString);
                    } else if (z3mVar instanceof u3m) {
                        Bundle bundle6 = new Bundle();
                        u3m u3mVar = (u3m) z3mVar;
                        bundle6.putParcelable("ALLBOARDING_SCREEN_RESPONSE", new ip41(u3mVar.a, u3mVar.b));
                        sap1.m(contentPickerFragment, "ALLBOARDING_SCREEN_RESPONSE", bundle6);
                    } else if (!(z3mVar instanceof y3m)) {
                        eg.o();
                    } else {
                        Bundle bundle7 = new Bundle();
                        bundle7.putParcelable("ALLBOARDING_SCREEN_RESPONSE", new jp41(((y3m) z3mVar).a));
                        sap1.m(contentPickerFragment, "ALLBOARDING_SCREEN_RESPONSE", bundle7);
                    }
                } else if (!contentPickerFragment.P1) {
                    tzr0 tzr0Var2 = contentPickerFragment.Q1;
                    if (tzr0Var2 != null) {
                        ((PickerCollapsingTitleBar) tzr0Var2.d).d1.w1(((w3m) z3mVar).a, 0);
                    }
                } else {
                    dtw dtwVar = contentPickerFragment.T1;
                    if (dtwVar != null) {
                        vws0 vws0Var = (vws0) dtwVar.f;
                        if (vws0Var != null) {
                            dtwVar.f(vws0.a(vws0Var, Integer.valueOf(((w3m) z3mVar).a)));
                        }
                    } else {
                        n57.e("headerContentElementHolder not initialized for ScrollToTag");
                    }
                }
                break;
            case 4:
                ((djx) obj2).invoke(obj);
                break;
            case 5:
                qvx0 qvx0Var = (qvx0) obj;
                rvx0 rvx0Var = (rvx0) obj2;
                lkw0 lkw0Var = rvx0Var.c;
                n6r0 n6r0Var = rvx0Var.d;
                String str3 = rvx0Var.a.a;
                lzn0 lzn0Var = rvx0Var.b;
                if (qvx0Var instanceof lvx0) {
                    lvx0 lvx0Var = (lvx0) qvx0Var;
                    String str4 = lvx0Var.a;
                    boolean z = lvx0Var.b;
                    qlm0 qlm0Var = rvx0Var.g;
                    dwb dwbVarA = qlm0Var.b.a();
                    dwbVarA.T0(mno1.h(new mmr0[]{new mmr0("message_id", str4), new mmr0("reedit", Boolean.valueOf(z)), new mmr0("view_uri", str3), new mmr0("page_id", n6r0Var.path())}));
                    dwbVarA.g1(qlm0Var.a, "moreOptionsMenuNavigator");
                    break;
                } else if (qvx0Var instanceof hvx0) {
                    hvx0 hvx0Var = (hvx0) qvx0Var;
                    String str5 = hvx0Var.a;
                    tv80 tv80Var = hvx0Var.b;
                    lzn0Var.f(new dwn0(str5, "", false, false, 0, 0, true, (a690) null, (Bundle) null, tv80Var != null ? new bwn0(tv80Var) : null));
                    break;
                } else if (qvx0Var instanceof gvx0) {
                    lzn0Var.e();
                    break;
                } else if (qvx0Var instanceof nvx0) {
                    nvx0 nvx0Var = (nvx0) qvx0Var;
                    String str6 = nvx0Var.b;
                    String str7 = nvx0Var.a;
                    PublishSubject publishSubject = lkw0Var.j;
                    u19 u19Var = u19.e;
                    if (str6 == null) {
                        bhn0.i("Null previewId");
                    } else {
                        publishSubject.onNext(new u19(str6, new i5w0(str7), j5.a, new i5w0(30000L)));
                    }
                    break;
                } else if (!(qvx0Var instanceof pvx0)) {
                    if (qvx0Var instanceof mvx0) {
                        mvx0 mvx0Var = (mvx0) qvx0Var;
                        rvx0Var.e.a.a(jma.f(mvx0Var.a), mvx0Var.c, mno1.h(new mmr0[]{new mmr0("key_message_id", mvx0Var.b)}));
                    } else if (qvx0Var instanceof kvx0) {
                        kvx0 kvx0Var = (kvx0) qvx0Var;
                        ppv ppvVar = rvx0Var.f;
                        String str8 = kvx0Var.a;
                        String strC = mka.c(kvx0Var.b);
                        dwb dwbVarA2 = ppvVar.b.a();
                        dwbVarA2.T0(mno1.h(new mmr0[]{new mmr0("edit_message_id", str8), new mmr0("playlist_uri", strC), new mmr0("view_uri", str3), new mmr0("page_id", n6r0Var.path())}));
                        dwbVarA2.g1(ppvVar.a, "editOptionsMenuNavigator");
                    } else if (qvx0Var instanceof ovx0) {
                        q6u q6uVar = rvx0Var.h;
                        boolean z2 = ((ovx0) qvx0Var).a;
                        nw40 nw40Var = q6uVar.b;
                        qfl1 qfl1Var = q6uVar.a;
                        mw40 mw40VarT = yoi1.T(nw40Var.a, qfl1Var.b(2131960601, new Object[0]), qfl1Var.b(2131960598, new Object[0]));
                        String strB = qfl1Var.b(2131960600, new Object[0]);
                        p6u p6uVar = new p6u(q6uVar, z2, b2);
                        mw40VarT.a = strB;
                        mw40VarT.c = p6uVar;
                        String strB2 = qfl1Var.b(2131960599, new Object[0]);
                        p6u p6uVar2 = new p6u(q6uVar, z2, b3);
                        mw40VarT.b = strB2;
                        mw40VarT.d = p6uVar2;
                        mw40VarT.e = true;
                        mw40VarT.b().b();
                    } else if (qvx0Var instanceof jvx0) {
                        ham hamVar = rvx0Var.i;
                        mtx0 mtx0Var = (mtx0) hamVar.b;
                        i8h1 i8h1Var = mtx0Var.a;
                        x6h1 x6h1VarC = mtx0Var.b.b.c();
                        x6h1VarC.i.add(new a7h1("create_playlist_error_dialog", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC.j = true;
                        y6h1 y6h1VarA = x6h1VarC.a();
                        k7h1 k7h1Var = new k7h1();
                        ((xjn) k7h1Var).a = y6h1VarA;
                        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                        i8h1Var.f(k7h1Var.a(), (Set) null);
                        new gpn(mtx0Var).g1((th30) hamVar.c, (String) null);
                    } else if (!(qvx0Var instanceof ivx0)) {
                        eg.o();
                    } else {
                        lzn0Var.h("https://www.spotify.com/legal/privacy-policy");
                    }
                    break;
                } else {
                    String str9 = ((pvx0) qvx0Var).b;
                    lkw0 lkw0Var2 = lkw0Var;
                    u19 u19Var2 = lkw0Var2.o;
                    if (u19Var2 != null && u19Var2.a.equals(str9)) {
                        lkw0Var2.j.onNext(u19.e);
                        break;
                    }
                }
                break;
            case 6:
                ip31 ip31Var3 = (ip31) obj2;
                int iOrdinal2 = ((hp5) obj).ordinal();
                if (iOrdinal2 == 0) {
                    ((l1k) ip31Var3.g).invoke();
                    break;
                } else if (iOrdinal2 == 1) {
                    th61 th61Var = (th61) ip31Var3.i;
                    if (th61Var != null) {
                        ((vas) ip31Var3.f).invoke(th61Var);
                    }
                    break;
                } else if (iOrdinal2 != 2) {
                    eg.o();
                    break;
                }
                break;
            case 7:
                ((i751) obj2).a((hd51) obj);
                break;
            case 8:
                ((ycc1) obj2).g((xcc1) obj);
                break;
            case 9:
                ((iu30) obj2).invoke(obj);
                break;
            default:
                ((kii1) obj2).Y0((xue1) obj);
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof rjp0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 1:
                if ((obj instanceof rjp0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 2:
                if ((obj instanceof rjp0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 3:
                if ((obj instanceof rjp0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 4:
                if ((obj instanceof rjp0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 5:
                if ((obj instanceof rjp0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 6:
                if ((obj instanceof rjp0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 7:
                if ((obj instanceof rjp0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 8:
                if ((obj instanceof rjp0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 9:
                if ((obj instanceof rjp0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            default:
                if ((obj instanceof rjp0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
        }
    }

    public final cv30 getFunctionDelegate() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new tv30(1, (AllboardingActivity) obj, AllboardingActivity.class, "navigateEffects", "navigateEffects(Lcom/spotify/allboarding/allboardingimpl/mobius/logic/AllBoardingViewEffect;)V", 0);
            case 1:
                return new tv30(1, (kp5) obj, kp5.class, "onVisibilityStateChanged", "onVisibilityStateChanged(Lcom/spotify/musicappplatform/contraptions/SessionUIVisibilityState;)V", 0);
            case 2:
                return new tv30(1, (CarouselFragment) obj, CarouselFragment.class, "handleViewEffect", "handleViewEffect(Lcom/spotify/allboarding/allboardingimpl/presentation/carousel/viewmodel/logic/CarouselViewEffect;)V", 0);
            case 3:
                return new tv30(1, (ContentPickerFragment) obj, ContentPickerFragment.class, "handleViewEffect", "handleViewEffect(Lcom/spotify/allboarding/allboardingimpl/presentation/contentpicker/viewmodel/logic/ContentPickerViewEffect;)V", 0);
            case 4:
                return (djx) obj;
            case 5:
                return new tv30(1, (rvx0) obj, rvx0.class, "handle", "handle(Lcom/spotify/aiplaylist/promptcreation/mobius/PromptCreationViewEffect;)V", 0);
            case 6:
                return new k01(1, (ip31) obj, ip31.class, "onLoggedInStateChanged", "onLoggedInStateChanged(Lcom/spotify/musicappplatform/contraptions/AppLoggedInStateContraption$State;)Lkotlin/Unit;", 8);
            case 7:
                return new tv30(1, (i751) obj, i751.class, "handle", "handle(Lcom/spotify/search/mobius/SearchViewEffect;)V", 0);
            case 8:
                return new tv30(1, (ycc1) obj, ycc1.class, "handle", "handle(Lcom/spotify/search/stploadingpage/mobius/domain/StpLoadingPageViewEffect;)V", 0);
            case 9:
                return (iu30) obj;
            default:
                return new tv30(1, (kii1) obj, kii1.class, "handleViewEffect", "handleViewEffect(Lcom/spotify/highlightsstats/timeline/domain/TimelineViewEffect;)V", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
        }
        return getFunctionDelegate().hashCode();
    }
}
