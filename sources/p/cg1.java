package p;

import android.content.Intent;
import android.graphics.PointF;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.encoreconsumermobile.elements.addtobutton.AddToButtonView;
import com.spotify.encoreconsumermobile.elements.bellbutton.BellButtonView;
import com.spotify.encoreconsumermobile.elements.quickactions.ban.BanButton;
import com.spotify.login.phonenumbersignup.callingcode.CallingCodePickerActivity;
import com.spotify.player.model.PlayerState;
import com.spotify.userinteractivityservice.usercomments.v1.proto.Comment;
import com.spotify.userinteractivityservice.usercomments.v1.proto.GetCommentCardResponse;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cg1 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cg1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj;
        List listC;
        PlayerState playerState;
        llm llmVar;
        byte b = this.a;
        dja djaVar = dja.c;
        dja djaVar2 = dja.a;
        vco vcoVar = vco.a;
        b7x b7xVar = b7x.a;
        lnm lnmVar = null;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                uaq0 uaq0Var = ((eg1) obj3).b;
                if (uaq0Var != null) {
                    uaq0Var.c(((fg1) obj2).a.d);
                    return;
                }
                return;
            case 1:
                AddToButtonView addToButtonView = (AddToButtonView) obj3;
                addToButtonView.e = true;
                if (addToButtonView.d.a == qk1.a) {
                    addToButtonView.performHapticFeedback(Build.VERSION.SDK_INT < 30 ? 1 : 16);
                }
                ((iu30) obj2).invoke(new ok1(addToButtonView, addToButtonView.d.a));
                return;
            case 2:
                wn1 wn1Var = ((vn1) obj3).a;
                y570 y570Var = (y570) obj2;
                wn1Var.getClass();
                sc70 sc70Var = (j570) y570Var.j().get("click");
                u570 u570Var = new u570("click", y570Var, gg11.g);
                if (sc70Var == null || !u890.j(sc70Var.b.b, "freetier:addToPlaylist")) {
                    return;
                }
                wn1Var.a.a(sc70Var, u570Var);
                return;
            case 3:
                h22 h22Var = (h22) obj3;
                uba ubaVar = h22Var.K1;
                if (ubaVar == null) {
                    u890.C("pageBoundUbiLogger");
                    throw null;
                }
                dsk0 dsk0Var = h22Var.T1;
                if (dsk0Var == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC = dsk0Var.b.c();
                x6h1VarC.i.add(new a7h1("learn_more", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                ubaVar.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                int i = swb0.d2;
                Parcelable parcelable = ((rfk1) obj2).c;
                swb0 swb0Var = new swb0();
                Bundle bundle = new Bundle();
                bundle.putParcelable("DIALOG_KEY", parcelable);
                swb0Var.T0(bundle);
                swb0Var.h1(h22Var.g0(), (String) null);
                if (h22Var.K1 == null) {
                    u890.C("pageBoundUbiLogger");
                    throw null;
                }
                View view2 = ((zf30) swb0Var).j1;
                if (view2 == null) {
                    return;
                }
                gik1 gik1Var = h22Var.L1;
                if (gik1Var != null) {
                    gik1Var.a(view2, new y12(h22Var, (byte) 15));
                    return;
                } else {
                    u890.C("viewUbiImpressionLogger");
                    throw null;
                }
            case 4:
                aj3 aj3Var = (aj3) obj3;
                fn31.T(aj3Var.g, (o8n) null, 0, new hi2(aj3Var, (slc0) obj2, (lnm) null, (byte) 12), 3);
                return;
            case 5:
                String str = nik1.Y5.a;
                ax3 ax3Var = (ax3) obj3;
                lzn0 lzn0Var = ax3Var.f;
                i8h1 i8h1Var = ax3Var.h;
                wqk0 wqk0Var = (wqk0) obj2;
                x6h1 x6h1VarC2 = wqk0Var.c.c();
                x6h1VarC2.i.add(new a7h1("view_requests_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                lzn0Var.a(str, i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str == null ? "" : str)), x6h1VarC2.a(), wqk0Var.b, System.currentTimeMillis()), (xj61) null), (Bundle) null);
                return;
            case 6:
                la5 la5Var = (la5) obj3;
                if (la5Var.getState() == djaVar2 || la5Var.getState() == djaVar) {
                    la5Var.performHapticFeedback(Build.VERSION.SDK_INT < 30 ? 1 : 16);
                }
                la5Var.g = true;
                ((iu30) obj2).invoke(new bja(la5Var.getState()));
                return;
            case 7:
                ((hc5) obj3).setAnimateNextRender(true);
                ((iu30) obj2).invoke(j0c1.a);
                return;
            case 8:
                ts6 ts6Var = (ts6) obj3;
                vu30 vu30Var = ts6Var.W0;
                if (vu30Var != null) {
                    vu30Var.invoke((gxs0) obj2, Integer.valueOf(ts6Var.n()));
                    return;
                }
                return;
            case 9:
                yy6 yy6Var = (yy6) obj3;
                yy6Var.U0.performHapticFeedback(1);
                vu30 vu30Var2 = yy6Var.W0;
                if (vu30Var2 != null) {
                    vu30Var2.invoke((gxs0) obj2, Integer.valueOf(yy6Var.n()));
                    return;
                }
                return;
            case 10:
                iu30 iu30Var = (iu30) obj2;
                j68 j68Var = (j68) obj3;
                if (j68Var instanceof i68) {
                    kuo1 kuo1Var = ((i68) j68Var).a;
                    if (kuo1Var instanceof g68) {
                        iu30Var.invoke(a68.a);
                        return;
                    } else if (kuo1Var instanceof h68) {
                        iu30Var.invoke(b68.a);
                        return;
                    } else {
                        eg.o();
                        return;
                    }
                }
                return;
            case 11:
                ((iu30) obj3).invoke(Boolean.valueOf(((BanButton) obj2).f));
                return;
            case 12:
                i8a i8aVar = (i8a) obj3;
                i8aVar.U0.performHapticFeedback(1);
                vu30 vu30Var3 = i8aVar.W0;
                if (vu30Var3 != null) {
                    vu30Var3.invoke((gxs0) obj2, Integer.valueOf(i8aVar.n()));
                    return;
                }
                return;
            case 13:
                String str2 = (String) obj2;
                dea deaVar = (dea) obj3;
                Bundle extras = deaVar.a.getIntent().getExtras();
                boolean z = extras != null ? extras.getBoolean("apps.music.features.blend-taste-match.key.IS_BLEND_INVITE", false) : false;
                xok0 xok0Var = deaVar.g;
                String str3 = deaVar.b.a;
                Integer numValueOf = Integer.valueOf(deaVar.h);
                x6h1 x6h1VarC3 = xok0Var.b.c();
                x6h1VarC3.i.add(new a7h1("story", str3, numValueOf, (String) null, (String) null));
                x6h1VarC3.j = true;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("cta_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                y6h1 y6h1VarA = x6h1VarC4.a();
                i8h1 i8h1Var2 = deaVar.f;
                Set set = s4b1.f;
                tv80 tv80VarM = i8h1Var2.m(uic.u(str2) ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), y6h1VarA, r6h1.c, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", str2)), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                lzn0 lzn0Var2 = deaVar.c;
                if (z) {
                    lzn0Var2.a(str2, tv80VarM, (Bundle) null);
                    return;
                } else {
                    lzn0Var2.c();
                    return;
                }
            case 14:
                BellButtonView bellButtonView = (BellButtonView) obj3;
                dja djaVar3 = bellButtonView.d.a;
                if (djaVar3 == djaVar2 || djaVar3 == djaVar) {
                    bellButtonView.performHapticFeedback(Build.VERSION.SDK_INT < 30 ? 1 : 16);
                }
                ((iu30) obj2).invoke(new bja(bellButtonView.d.a));
                return;
            case 15:
                oi oiVar = (oi) obj3;
                i8h1 i8h1Var3 = (i8h1) oiVar.c;
                wqk0 wqk0Var2 = (wqk0) oiVar.d;
                x6h1 x6h1VarC5 = wqk0Var2.c.c();
                x6h1VarC5.i.add(new a7h1("undo_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                y6h1 y6h1VarA2 = x6h1VarC5.a();
                boolean z2 = oiVar.b;
                char c = z2 ? (char) 1 : (char) 2;
                char c2 = z2 ? (char) 2 : (char) 1;
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                String str4 = "blocked";
                if (c == 1) {
                    obj = "blocked";
                } else {
                    if (c != 2) {
                        throw null;
                    }
                    obj = "unblocked";
                }
                mmr0 mmr0Var = new mmr0("state_before_toggle", obj);
                if (c2 != 1) {
                    if (c2 != 2) {
                        throw null;
                    }
                    str4 = "unblocked";
                }
                i8h1Var3.m(new w7h1("", "", z7h1Var, new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{mmr0Var, new mmr0("state_after_toggle", str4)})), y6h1VarA2, wqk0Var2.b, System.currentTimeMillis()), (xj61) null);
                ilo1.E(or91.a, (ssw0) obj2);
                return;
            case 16:
                mq80 mq80Var = (mq80) obj3;
                if (mq80Var.n() == -1) {
                    return;
                }
                n4b n4bVar = (n4b) mq80Var.W0;
                Parcelable parcelable2 = (m0d) obj2;
                int iN = mq80Var.n();
                q0d q0dVarM0 = ((CallingCodePickerActivity) n4bVar.b).m0();
                i8h1 i8h1Var4 = q0dVarM0.d;
                h4l0 h4l0Var = q0dVarM0.g;
                Integer numValueOf2 = Integer.valueOf(iN);
                x6h1 x6h1VarC6 = h4l0Var.b.c();
                x6h1VarC6.i.add(new a7h1("country_row", (String) null, numValueOf2, (String) null, (String) null));
                x6h1VarC6.j = false;
                nyn1.Q(q0dVarM0.e, new yrn0(i8h1Var4.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis())).a));
                CallingCodePickerActivity callingCodePickerActivity = q0dVarM0.j;
                if (callingCodePickerActivity != null) {
                    Intent intent = new Intent();
                    intent.putExtra("calling-code", parcelable2);
                    callingCodePickerActivity.setResult(-1, intent);
                    callingCodePickerActivity.finish();
                    return;
                }
                return;
            case 17:
                if (u890.j(((ConstraintLayout) ((toj0) ((ver) obj3).b).b).getTag(), Boolean.TRUE)) {
                    ((iu30) obj2).invoke(vcoVar);
                    return;
                }
                return;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                ((iu30) obj3).invoke(new rxd(((yxd) obj2).c.b));
                return;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                cfd cfdVar = (cfd) obj3;
                fn31.T(cto1.q((dg30) cfdVar.b), (o8n) null, 0, new hsc((ela) obj2, lnmVar, (byte) 11), 3);
                ((kt91) cfdVar.c).b();
                return;
            case 20:
                iu30 iu30Var2 = (iu30) obj2;
                GetCommentCardResponse getCommentCardResponse = ((bfh) obj3).b;
                if (getCommentCardResponse.t().isEmpty() || !((Comment) getCommentCardResponse.t().get(0)).y()) {
                    iu30Var2.invoke(reh.a);
                    return;
                } else {
                    iu30Var2.invoke(weh.a);
                    return;
                }
            case 21:
                d520 d520Var = (d520) obj3;
                fn31.T(cto1.q((iac0) d520Var.g), (o8n) null, 0, new eak(d520Var, (List) obj2, (lnm) null, (byte) 1), 3);
                return;
            case 22:
                bhk bhkVar = (bhk) obj3;
                fn31.T(cto1.q(bhkVar.h), (o8n) null, 0, new bag(bhkVar, (List) obj2, null, (byte) 27), 3);
                return;
            case 23:
                ((bbc) ((lc20) ((v1k) obj3).d).b).l(new nwc1((String) obj2));
                return;
            case 24:
                i5m i5mVar = (i5m) obj3;
                String str5 = (String) obj2;
                ve01 ve01Var = i5mVar.j;
                if (ve01Var == null || (listC = ve01Var.a.c()) == null || (playerState = (PlayerState) o7h.C0(listC)) == null || !u890.j(playerState.contextUri(), str5) || !playerState.signals().contains("reshuffle") || (llmVar = i5mVar.i) == null) {
                    return;
                }
                fn31.T(llmVar, (o8n) null, 0, new awe(i5mVar, lnmVar, (byte) 20), 3);
                return;
            case 25:
                v7l v7lVar = (v7l) ((qxx0) obj3).f;
                kbn kbnVar = (kbn) obj2;
                kbnVar.getClass();
                v7lVar.invoke(kbnVar);
                return;
            case 26:
                ((iu30) obj3).invoke(((AppCompatImageButton) ((yir) obj2).c).isActivated() ? q3a.b : q3a.a);
                return;
            case 27:
                ujr ujrVar = (ujr) obj3;
                PointF pointF = ujrVar.x1;
                ujrVar.x1 = null;
                ((iu30) obj2).invoke(pointF);
                return;
            case 28:
                ((zmr) obj3).X.invoke((String) obj2);
                return;
            default:
                if (u890.j(((ConstraintLayout) ((p2o0) ((eos) obj3).b).b).getTag(), Boolean.TRUE)) {
                    ((iu30) obj2).invoke(vcoVar);
                    return;
                }
                return;
        }
    }
}
