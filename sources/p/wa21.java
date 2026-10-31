package p;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import com.spotify.allboarding.allboardingimpl.skip.SkipDialogFragment;
import com.spotify.checkout.spotifycheckout.SpotifyCheckoutActivity;
import com.spotify.encoreconsumermobile.elements.thumb.ThumbButtonView;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wa21 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final Object b;
    public final /* synthetic */ Object c;

    public wa21(t3f1 t3f1Var) {
        this.a = (byte) 21;
        this.c = t3f1Var;
        Context context = t3f1Var.a.getContext();
        CharSequence charSequence = t3f1Var.h;
        a60 a60Var = new a60();
        a60Var.e = 4096;
        a60Var.g = 4096;
        a60Var.l = null;
        a60Var.m = null;
        a60Var.n = false;
        a60Var.o = false;
        a60Var.p = 16;
        a60Var.i = context;
        a60Var.a = charSequence;
        this.b = a60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        w7h1 w7h1Var;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        Intent intent = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                xa21 xa21Var = (xa21) obj2;
                fn31.T(cto1.q(xa21Var.a), (o8n) null, 0, new m311(xa21Var, (String) obj, (lnm) null, (byte) 11), 3);
                return;
            case 1:
                ((xg21) obj2).a(((jg21) obj).a);
                return;
            case 2:
                ((xg21) obj2).a(((ig21) obj).a);
                return;
            case 3:
                ((iu30) obj2).invoke(new zl21(((am21) obj).b));
                return;
            case 4:
                ((l670) obj).c.d(new u570("click", (y570) obj2, gg11.g));
                return;
            case 5:
                c551 c551Var = (c551) obj2;
                vu30 vu30Var = c551Var.V0;
                if (vu30Var != null) {
                    vu30Var.invoke(Integer.valueOf(c551Var.n()), (h951) obj);
                    return;
                }
                return;
            case 6:
                ((ym) obj2).invoke(new tc7(((qv31) obj).a));
                return;
            case 7:
                ((qka) obj2).invoke(new clh((jkh) obj));
                return;
            case 8:
                ((qka) obj2).invoke(new elh((kkh) obj));
                return;
            case 9:
                v781 v781Var = (v781) obj2;
                vu30 vu30Var2 = v781Var.W0;
                if (vu30Var2 != null) {
                    vu30Var2.invoke((gxs0) obj, Integer.valueOf(v781Var.n()));
                    return;
                }
                return;
            case 10:
                ya81 ya81Var = (ya81) obj2;
                ya81Var.U0.performHapticFeedback(1);
                vu30 vu30Var3 = ya81Var.W0;
                if (vu30Var3 != null) {
                    vu30Var3.invoke((gxs0) obj, Integer.valueOf(ya81Var.n()));
                    return;
                }
                return;
            case 11:
                SkipDialogFragment skipDialogFragment = (SkipDialogFragment) obj2;
                n3h1 n3h1Var = skipDialogFragment.Y1;
                if (n3h1Var == null) {
                    u890.C("skipDialogLogger");
                    throw null;
                }
                n3h1Var.e((String) obj);
                hnn0 hnn0VarL = pap1.w(skipDialogFragment).l();
                hnn0VarL.getClass();
                ((fe41) hnn0VarL.X.getValue()).b(Boolean.FALSE, "skipDialogResult");
                skipDialogFragment.Z0(false, false);
                return;
            case 12:
                mzr0 mzr0Var = (mzr0) obj2;
                n381 n381Var = (n381) mzr0Var.e;
                i8h1 i8h1Var = (i8h1) n381Var.b;
                f0m0 f0m0Var = (f0m0) n381Var.c;
                x6h1 x6h1VarC = f0m0Var.b.c();
                x6h1VarC.i.add(new a7h1("remove_recommendation_snackbar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("undo_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), f0m0Var.a, System.currentTimeMillis()), (xj61) null);
                ((AtomicBoolean) obj).set(true);
                kt91 kt91Var = (kt91) mzr0Var.a;
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131959109});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var.k(new er91((fs91) null, "", 2131959109, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return;
            case 13:
                ir91 ir91Var = (ir91) obj2;
                i8h1 i8h1Var2 = (i8h1) ir91Var.d.get();
                co31 co31Var = ir91Var.e;
                ko3 ko3Var = (oo3) obj;
                String str = ko3Var.b;
                co31Var.getClass();
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-your-library-page";
                x6h1VarI.f = "9.3.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.b = null;
                y6h1 y6h1VarA = x6h1VarI.a();
                Collections.singletonList("yourlibrary");
                x6h1 x6h1VarC3 = y6h1VarA.c();
                x6h1VarC3.i.add(new a7h1("follow_snackbar", (String) null, (Integer) null, str, (String) null));
                x6h1VarC3.j = true;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("undo_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("unfollow", 1, Collections.singletonMap("item_to_be_unfollowed", str != null ? str : "")), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                fn31.T(zso1.H(((f0i) ir91Var.a).a), (o8n) null, 0, new sb91(ir91Var, ko3Var, intent, (byte) 4), 3);
                return;
            case 14:
                wh41 wh41Var = (wh41) obj2;
                ((zxl) wh41Var.c).a(((rzn1) obj).f);
                ((qrg0) ((ynb0) wh41Var.e).get()).b(3);
                ((kt91) wh41Var.d).b();
                return;
            case 15:
                ((et61) obj2).invoke((FrameLayout) obj);
                return;
            case 16:
                agk1 agk1Var = ((dgk1) obj).e;
                SpotifyCheckoutActivity spotifyCheckoutActivity = (SpotifyCheckoutActivity) obj2;
                dsk0 dsk0Var = spotifyCheckoutActivity.r1;
                if (dsk0Var == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC5 = dsk0Var.b.c();
                x6h1VarC5.i.add(new a7h1("loaded_state", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = true;
                x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                x6h1VarC6.i.add(new a7h1("current_payment_details", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = true;
                x6h1 x6h1VarC7 = x6h1VarC6.a().c();
                x6h1VarC7.i.add(new a7h1("change_payment_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC7.j = false;
                y6h1 y6h1VarA2 = x6h1VarC7.a();
                uba ubaVarD = spotifyCheckoutActivity.d();
                if (agk1Var instanceof agk1) {
                    String str2 = agk1Var.b;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", str2 != null ? str2 : "")), y6h1VarA2, r6h1.c, System.currentTimeMillis());
                } else {
                    if (!(agk1Var instanceof bgk1)) {
                        eg.o();
                        return;
                    }
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA2, r6h1.c, System.currentTimeMillis());
                }
                ubaVarD.m(w7h1Var, (xj61) null);
                spotifyCheckoutActivity.m0().U(new uwz(agk1Var));
                return;
            case 17:
                dg30 dg30VarF0 = ((fib1) obj2).f0();
                if (dg30VarF0 != null) {
                    iu30 iu30Var = (iu30) obj;
                    intent = iu30Var != null ? (Intent) iu30Var.invoke(dg30VarF0) : null;
                    if (intent != null) {
                        dg30VarF0.startActivity(intent);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                uaq0 uaq0Var = ((eg1) obj2).b;
                if (uaq0Var != null) {
                    uaq0Var.d(((nlc1) obj).f.g);
                    return;
                }
                return;
            case 19:
                iu30 iu30Var2 = ((xod1) obj2).U0;
                if (iu30Var2 != null) {
                    iu30Var2.invoke((txs0) obj);
                    return;
                }
                return;
            case 20:
                ThumbButtonView thumbButtonView = (ThumbButtonView) obj;
                ((iu30) obj2).invoke(new khe1(thumbButtonView, thumbButtonView.getType(), thumbButtonView.d));
                return;
            case 21:
                t3f1 t3f1Var = (t3f1) obj;
                Window.Callback callback = t3f1Var.k;
                if (callback == null || !t3f1Var.l) {
                    return;
                }
                callback.onMenuItemSelected(0, (a60) obj2);
                return;
            default:
                uaq0 uaq0Var2 = ((eg1) obj2).b;
                if (uaq0Var2 != null) {
                    uaq0Var2.b(((dhf1) obj).d.d);
                    return;
                }
                return;
        }
    }

    public wa21(ky kyVar, y570 y570Var, l670 l670Var) {
        this.a = (byte) 4;
        this.b = y570Var;
        this.c = l670Var;
    }

    public /* synthetic */ wa21(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
