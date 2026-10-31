package p;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.spotify.aiplaylist.promptcreation.presentation.MessageInputView;
import com.spotify.aiplaylist.promptcreation.presentation.tracklist.PlayIndicatorView;
import com.spotify.allboarding.allboardingimpl.search.SearchFragment;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.checkout.premiumcheckout.PremiumCheckoutActivity;
import com.spotify.encoreconsumermobile.elements.previewbutton.PreviewOverlayView;
import com.spotify.encoreconsumermobile.elements.quickactions.QuickActionView;
import com.spotify.encoreconsumermobile.elements.seemoretextview.SeeMoreTextView;
import com.spotify.login.loginflowimpl.LoginActivity;
import com.spotify.mobius.android.MobiusLoopViewModel;
import com.spotify.mobius.functions.Consumer;
import com.spotify.nowplaying.musicinstallation.NowPlayingActivity;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hid0 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hid0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        View childAt = null;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((AlertDialog) obj).dismiss();
                return;
            case 1:
                ((LoginActivity) obj).J().d();
                return;
            case 2:
                Consumer consumer = (Consumer) ((s59) ((eb80) obj).b).b;
                if (consumer != null) {
                    consumer.accept(jjg0.a);
                    return;
                }
                return;
            case 3:
                zbh0 zbh0Var = (zbh0) obj;
                int i = zbh0Var.J1;
                if (i == 2) {
                    zbh0Var.a1(1);
                    return;
                } else {
                    if (i == 1) {
                        zbh0Var.a1(2);
                        return;
                    }
                    return;
                }
            case 4:
                ((ech0) obj).i1();
                throw null;
            case 5:
                ((DatePickerDialog) obj).show();
                return;
            case 6:
                ((MessageInputView) obj).B();
                return;
            case 7:
                pgo0 pgo0Var = (pgo0) obj;
                rgo0 rgo0Var = pgo0Var.b;
                ggl gglVar = pgo0Var.c;
                gglVar.e(rgo0Var.e, rgo0Var.a, rgo0Var.g);
                gglVar.e(rgo0Var.e, rgo0Var.b, (String) null);
                kt91 kt91Var = pgo0Var.f;
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131956592});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var.k(new er91((fs91) null, "", 2131956592, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return;
            case 8:
                yvo0 yvo0Var = (yvo0) obj;
                ((lzn0) yvo0Var.b).a(nik1.C0.a, ((bnj0) yvo0Var.c).o(srn0.d), (Bundle) null);
                return;
            case 9:
                ((NowPlayingActivity) obj).finish();
                return;
            case 10:
                tro0 tro0Var = ((azo0) obj).h;
                if (tro0Var != null) {
                    tro0Var.invoke();
                    return;
                }
                return;
            case 11:
                w6s0 w6s0Var = (w6s0) obj;
                TextInputLayout textInputLayout = ((mzx) w6s0Var).a;
                EditText editText = textInputLayout.getEditText();
                if (editText == null) {
                    return;
                }
                int selectionEnd = editText.getSelectionEnd();
                if (w6s0Var.d()) {
                    editText.setTransformationMethod(null);
                } else {
                    editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    editText.setSelection(selectionEnd);
                }
                textInputLayout.k(textInputLayout.I1, textInputLayout.K1);
                return;
            case 12:
                ((PlayIndicatorView) obj).c.invoke(rih1.a);
                return;
            case 13:
                ((pcp0) obj).invoke();
                return;
            case 14:
                dg30 dg30VarF0 = ((ypv0) obj).f0();
                if (dg30VarF0 != null) {
                    dg30VarF0.finish();
                    return;
                }
                return;
            case 15:
                iqv0 iqv0Var = PremiumCheckoutActivity.o1;
                ((MobiusLoopViewModel) ((PremiumCheckoutActivity) obj).g1.getValue()).U(drv0.a);
                return;
            case 16:
                wiw0 wiw0Var = wiw0.b;
                PreviewOverlayView previewOverlayView = (PreviewOverlayView) obj;
                bjw0 bjw0Var = previewOverlayView.U0;
                if (bjw0Var instanceof yiw0) {
                    iu30 iu30Var = previewOverlayView.X0;
                    if (iu30Var != null) {
                        iu30Var.invoke(wiw0.a);
                        return;
                    }
                    return;
                }
                if (bjw0Var instanceof ajw0) {
                    iu30 iu30Var2 = previewOverlayView.X0;
                    if (iu30Var2 != null) {
                        iu30Var2.invoke(wiw0Var);
                        return;
                    }
                    return;
                }
                if (!u890.j(bjw0Var, ziw0.a)) {
                    if (u890.j(bjw0Var, ziw0.b)) {
                        return;
                    }
                    eg.o();
                    return;
                } else {
                    iu30 iu30Var3 = previewOverlayView.X0;
                    if (iu30Var3 != null) {
                        iu30Var3.invoke(wiw0Var);
                        return;
                    }
                    return;
                }
            case 17:
                yqu0 yqu0Var = (yqu0) obj;
                mtx0 mtx0Var = (mtx0) yqu0Var.b;
                i8h1 i8h1Var = mtx0Var.a;
                x6h1 x6h1VarC = mtx0Var.b.b.c();
                x6h1VarC.i.add(new a7h1("onboarding_view", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("cta_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                ((y11) yqu0Var.c).accept(dsx0.a);
                return;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                ((h2y0) obj).invoke();
                return;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ((PublishSubject) ((l0x0) obj).d).onNext(t8z0.a);
                return;
            case 20:
                QuickActionView quickActionView = (QuickActionView) obj;
                if ((quickActionView.getChildCount() > 0) && (childAt = quickActionView.getChildAt(0)) == null) {
                    tw20.p();
                    return;
                } else {
                    if (childAt != null) {
                        childAt.performClick();
                        return;
                    }
                    return;
                }
            case 21:
                g111 g111Var = (g111) obj;
                pux0 pux0Var = g111Var.a;
                i8h1 i8h1Var2 = (i8h1) pux0Var.b;
                uqk0 uqk0Var = (uqk0) pux0Var.c;
                x6h1 x6h1VarC3 = uqk0Var.c.c();
                x6h1VarC3.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC3.a(), uqk0Var.b, System.currentTimeMillis()), (xj61) null);
                Consumer consumer2 = g111Var.d;
                if (consumer2 != null) {
                    consumer2.accept(zz01.a);
                    return;
                }
                return;
            case 22:
                ((o1r0) ((fsg0) obj).d).dismiss();
                return;
            case 23:
                sj21 sj21Var = (sj21) obj;
                bz11 bz11Var = sj21Var.a;
                InputMethodManager inputMethodManager = (InputMethodManager) ((ConstraintLayout) bz11Var.a).getContext().getSystemService(InputMethodManager.class);
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(((ConstraintLayout) bz11Var.a).getWindowToken(), 0);
                }
                sj21Var.b.accept(mi21.a);
                return;
            case 24:
                lm21 lm21Var = (lm21) obj;
                dg30 dg30VarF1 = lm21Var.f0();
                if (dg30VarF1 != null) {
                    dg30VarF1.setResult(-1);
                }
                dg30 dg30VarF2 = lm21Var.f0();
                if (dg30VarF2 != null) {
                    dg30VarF2.finish();
                    return;
                }
                return;
            case 25:
                String strT = pro1.t("samsung");
                q741 q741Var = (q741) obj;
                q741Var.e.a(strT, q741Var.f.j(strT), (Bundle) null);
                return;
            case 26:
                ((b0m) ((g931) obj).d).invoke();
                return;
            case 27:
                SearchFragment searchFragment = (SearchFragment) obj;
                searchFragment.Z0().l();
                kd51 kd51VarB1 = searchFragment.b1();
                bhk1 bhk1Var = (bhk1) kd51VarB1.t.e();
                if (bhk1Var != null) {
                    kd51VarB1.T(bhk1Var.a);
                    return;
                }
                return;
            case 28:
                iu30 iu30Var4 = ((SeeMoreTextView) obj).N0;
                if (iu30Var4 != null) {
                    iu30Var4.invoke(vk51.c);
                    return;
                }
                return;
            default:
                e061 e061Var = (e061) obj;
                tv80 tv80VarG = e061Var.c.g();
                Consumer consumer3 = e061Var.d;
                if (consumer3 != null) {
                    consumer3.accept(new wz51(tv80VarG));
                    return;
                }
                return;
        }
    }
}
