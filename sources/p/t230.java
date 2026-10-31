package p;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.encoreconsumermobile.elements.follow.FollowButtonView;
import com.spotify.encoreconsumermobile.elements.heart.HeartButton;
import com.spotify.encoreconsumermobile.elements.playbutton.PlayButtonView;
import com.spotify.encoreconsumermobile.elements.quickactions.hide.HideButton;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.buttons.EncoreProgressIndicatorButton;
import com.spotify.mobius.functions.Consumer;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class t230 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public t230(zog zogVar, p7s0 p7s0Var) {
        this.a = (byte) 23;
        this.c = zogVar;
        this.b = p7s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        x8c0 lifecycle;
        Context contextH0;
        byte b = this.a;
        byte b2 = 10;
        b7x b7xVar = b7x.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                wp20 wp20Var = (wp20) obj2;
                view.getClass();
                wp20Var.getClass();
                iac0 iac0VarH = x9p1.h(view);
                u9c0 u9c0VarH = (iac0VarH == null || (lifecycle = iac0VarH.getLifecycle()) == null) ? null : zso1.H(lifecycle);
                if (u9c0VarH != null) {
                    fn31.T(u9c0VarH, (o8n) null, 0, new xr00(wp20Var, (String) obj, (lnm) null, (byte) 13), 3);
                }
                break;
            case 1:
                FollowButtonView followButtonView = (FollowButtonView) obj2;
                if (!followButtonView.isActivated()) {
                    followButtonView.performHapticFeedback(Build.VERSION.SDK_INT < 30 ? 1 : 16);
                }
                ((iu30) obj).invoke(Boolean.valueOf(followButtonView.isActivated()));
                break;
            case 2:
                s430 s430Var = (s430) obj2;
                boolean z = s430Var.d;
                b14 b14Var = (b14) obj;
                iu30 iu30Var = (iu30) b14Var.b;
                if (!z) {
                    ((EncoreButton) b14Var.e).performHapticFeedback(Build.VERSION.SDK_INT < 30 ? 1 : 16);
                    iu30Var.invoke(p430.a);
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131960187});
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                    ((kt91) b14Var.d).k(new er91((fs91) null, "", 2131960187, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                } else {
                    iu30Var.invoke(new q430(false));
                    if (!s430Var.e) {
                        iu30Var.invoke(new q430(true));
                        b14Var.c();
                    } else {
                        ((gu8) b14Var.c).a(s430Var.a, ny00.a1, new f710(b14Var, b2));
                    }
                }
                break;
            case 3:
                xz40 xz40Var = (xz40) obj2;
                x4f1.b(xz40Var.a);
                slc0 slc0Var = (slc0) obj;
                xz40Var.c.a(slc0Var);
                xz40Var.g.a(slc0Var);
                break;
            case 4:
                hv41 hv41Var = (hv41) obj2;
                lq50 lq50Var = (lq50) obj;
                y3g y3gVar = (y3g) hv41Var.A(lq50Var.n());
                y3gVar.getClass();
                hv41Var.D(y3gVar, lq50Var.n());
                break;
            case 5:
                ((iu30) obj).invoke(Boolean.valueOf(((HeartButton) obj2).f));
                break;
            case 6:
                ((iu30) obj2).invoke(Boolean.valueOf(((HideButton) obj).f));
                break;
            case 7:
                o860 o860Var = (o860) obj2;
                i8h1 i8h1Var = (i8h1) o860Var.e;
                p860 p860Var = (p860) obj;
                r6h1 r6h1Var = p860Var.c;
                String str = p860Var.a;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-remove-from-section-snackbar";
                x6h1VarI.f = "0.0.1";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.b = "shortcuts";
                x6h1VarI.d = str;
                x6h1 x6h1VarC = x6h1VarI.a().c();
                x6h1VarC.i.add(new a7h1("undo_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{new mmr0("state_before_toggle", "hidden_from_section"), new mmr0("state_after_toggle", "shown_in_section")})), x6h1VarC.a(), r6h1Var, System.currentTimeMillis()), (xj61) null);
                r860 r860Var = (r860) o860Var.c;
                fn31.T(r860Var.b, (o8n) null, 0, new q860(r860Var, p860Var.b, str, (lnm) null, (byte) 1), 3);
                break;
            case 8:
                ssw0 ssw0Var = (ssw0) obj2;
                ssw0Var.l(new sh60(((li60) obj).a));
                ssw0Var.H((Throwable) null);
                break;
            case 9:
                if (((tr60) obj2).r1.X0 <= 1.0f) {
                    ((rok0) obj).v();
                    break;
                }
                break;
            case 10:
                oxg1 oxg1Var = new oxg1();
                oxg1Var.h(-16777216);
                oxg1Var.g();
                oxg1Var.a().j(((ze70) obj2).P0(), Uri.parse(((gb80) obj).a));
                break;
            case 11:
                ip31 ip31Var = (ip31) obj2;
                fn31.T((c9n) ip31Var.f, (o8n) null, 0, new q4d0(ip31Var, (tv80) obj, (lnm) null, (byte) 6), 3);
                break;
            case 12:
                uaq0 uaq0Var = ((eg1) obj2).b;
                if (uaq0Var != null) {
                    uaq0Var.e(((pid0) obj).i.d);
                }
                break;
            case 13:
                ((Consumer) obj2).accept(new v9h0(((d9h0) obj).a));
                break;
            case 14:
                ((v7j0) obj2).V0.invoke((h6j0) obj);
                break;
            case 15:
                ((z7j0) obj2).V0.invoke((l6j0) obj);
                break;
            case 16:
                ((lzn0) ((ccj0) obj2).e.get()).h(((hcj0) obj).b);
                break;
            case 17:
                huj0 huj0Var = (huj0) obj2;
                fn31.T(cto1.q(huj0Var.a), huj0Var.d, 0, new d7i0(huj0Var, (String) obj, (lnm) null, (byte) 16), 2);
                break;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                exj0 exj0Var = (exj0) obj2;
                cjk0 cjk0Var = (cjk0) exj0Var.Z.getValue();
                wqk0 wqk0VarB = cjk0Var.b(10);
                i8h1 i8h1Var2 = (i8h1) cjk0Var.a.get();
                x6h1 x6h1VarC2 = wqk0VarB.c.c();
                x6h1VarC2.i.add(new a7h1("action_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), wqk0VarB.b, System.currentTimeMillis()), (xj61) null);
                fn31.T((llm) obj, (o8n) null, 0, new uwj0(exj0Var, (lnm) null, (byte) 0), 3);
                exj0Var.d.b();
                break;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                dxy dxyVar = (dxy) obj2;
                ((kt91) dxyVar.c).k(new er91((fs91) null, ((dg30) dxyVar.b).getString(2131956592), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                ugo0 ugo0Var = (ugo0) obj;
                tgo0 tgo0Var = new tgo0(dxyVar, ugo0Var, (byte) 1);
                String str2 = ugo0Var.b;
                if (!ihc1.y0(str2)) {
                    tgo0Var.invoke(str2);
                }
                break;
            case 20:
                tjo0 tjo0Var = (tjo0) obj2;
                rok0 rok0Var = tjo0Var.a;
                String str3 = (String) obj;
                i8h1 i8h1Var3 = (i8h1) rok0Var.b;
                fvk0 fvk0Var = (fvk0) rok0Var.c;
                String strConcat = "spotify:chat:".concat(str3);
                fvk0Var.getClass();
                ((lzn0) ((moo0) tjo0Var.c.get()).a.get()).f(new dwn0("spotify:chat:".concat(str3), "", false, false, 0, 0, false, (a690) null, (Bundle) null, new bwn0(i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strConcat)), fvk0Var.a, r6h1.c, System.currentTimeMillis()), (xj61) null))));
                break;
            case 21:
                EncoreProgressIndicatorButton encoreProgressIndicatorButton = (EncoreProgressIndicatorButton) obj;
                fpo0 fpo0Var = (fpo0) obj2;
                if (!fpo0Var.h2 && (contextH0 = fpo0Var.h0()) != null) {
                    mw40 mw40VarT = yoi1.T(contextH0, contextH0.getString(2131954132), contextH0.getString(2131954131));
                    String string = contextH0.getString(2131954138);
                    ln5 ln5Var = new ln5(fpo0Var, contextH0, (byte) 16);
                    mw40VarT.a = string;
                    mw40VarT.c = ln5Var;
                    String string2 = contextH0.getString(2131954133);
                    oad oadVar = new oad(fpo0Var, (byte) 21);
                    mw40VarT.b = string2;
                    mw40VarT.d = oadVar;
                    mw40VarT.b().b();
                }
                fpo0Var.j2 = true;
                encoreProgressIndicatorButton.setEnabled(false);
                fn31.T(cto1.q(fpo0Var), (o8n) null, 0, new ofk0(fpo0Var, encoreProgressIndicatorButton, (lnm) null, (byte) 10), 3);
                break;
            case 22:
                bnj0 bnj0Var = (bnj0) obj2;
                i8h1 i8h1Var4 = (i8h1) bnj0Var.b;
                x6h1 x6h1VarC3 = ((zok0) bnj0Var.c).b.c();
                x6h1VarC3.i.add(new a7h1("learn_more_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                i8h1Var4.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:internal:on-demand-trial:plan-overview")), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                ((iu30) obj).invoke(view);
                break;
            case 23:
                p7s0 p7s0Var = (p7s0) obj2;
                DialogInterface.OnClickListener onClickListener = (DialogInterface.OnClickListener) ((zog) obj).g;
                if (onClickListener != null) {
                    onClickListener.onClick(p7s0Var, -1);
                }
                p7s0Var.dismiss();
                break;
            case 24:
                PlayButtonView playButtonView = (PlayButtonView) obj2;
                uft0 uft0Var = playButtonView.d1;
                if ((uft0Var instanceof uft0) && uft0Var.a) {
                    x74.e0(playButtonView);
                }
                ((iu30) obj).invoke(Boolean.valueOf(playButtonView.c1));
                break;
            case 25:
                iu30 iu30Var2 = (iu30) obj;
                aku0 aku0Var = (aku0) obj2;
                if (aku0Var instanceof yju0) {
                    yju0 yju0Var = (yju0) aku0Var;
                    iu30Var2.invoke(new oju0(yju0Var.a, yju0Var.b));
                } else if (!(aku0Var instanceof zju0)) {
                    eg.o();
                } else {
                    zju0 zju0Var = (zju0) aku0Var;
                    iu30Var2.invoke(new pju0(zju0Var.a, zju0Var.b, zju0Var.c));
                }
                break;
            case 26:
                b5x0 b5x0Var = (b5x0) obj;
                ((zsc) obj2).B(b5x0Var.d, b5x0Var.f);
                break;
            case 27:
                d5x0 d5x0Var = (d5x0) obj;
                ((zsc) obj2).B(d5x0Var.d, d5x0Var.f);
                break;
            case 28:
                ((irx0) obj2).b.accept((ktx0) obj);
                break;
            default:
                ((mtx0) obj2).a();
                ((tux0) obj).b.accept(rrx0.a);
                break;
        }
    }

    public /* synthetic */ t230(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
