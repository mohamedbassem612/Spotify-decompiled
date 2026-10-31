package p;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextSwitcher;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.encoreconsumermobile.elements.addtobutton.EncoreAddToButtonView;
import com.spotify.encoreconsumermobile.elements.entityaction.EntityActionView;
import com.spotify.encoreconsumermobile.elements.find.FindInContextView;
import com.spotify.encoreconsumermobile.elements.follow.EncoreFollowButton;
import com.spotify.notifications.permissions.uiusecases.permissionscard.PermissionsCard;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cvr implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public cvr(o0g1 o0g1Var, wcr wcrVar, cwb cwbVar) {
        this.a = (byte) 21;
        this.b = o0g1Var;
        this.c = cwbVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        x8c0 lifecycle;
        cgz cgzVar;
        String str;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        boolean z = false;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                hvr hvrVar = (hvr) obj2;
                iir iirVar = hvrVar.e;
                String str2 = (String) obj;
                i8h1 i8h1Var = (i8h1) ((kly0) iirVar.b).get();
                x6h1 x6h1VarC = ((bqk0) iirVar.c).b.c();
                x6h1VarC.i.add(new a7h1("snackbar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("undo_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_hide_entity", 1, Collections.singletonMap("entity_to_remove_hide", str2)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                view.getClass();
                iac0 iac0VarH = x9p1.h(view);
                if (iac0VarH == null || (lifecycle = iac0VarH.getLifecycle()) == null) {
                    return;
                }
                fn31.T(zso1.H(lifecycle), (o8n) null, 0, new bvr(hvrVar, str2, null, (byte) 1), 3);
                return;
            case 1:
                rhr rhrVar = (rhr) obj2;
                if (rhrVar.b) {
                    ((EditText) ((yzu) rhrVar.c).c).getText().clear();
                }
                ((iu30) obj).invoke(a1w.a);
                return;
            case 2:
                iu30 iu30Var = (iu30) obj2;
                fgz fgzVar = (fgz) ((h98) obj).d;
                if (fgzVar == null) {
                    u890.C("model");
                    throw null;
                }
                Map map = zxr.a;
                String str3 = "";
                switch (fgzVar.a.ordinal()) {
                    case 0:
                        break;
                    case 1:
                        str3 = nik1.y1.a;
                        break;
                    case 2:
                        str3 = nik1.x1.a;
                        break;
                    case 3:
                        str3 = nik1.y1.a;
                        break;
                    case 4:
                        str3 = nik1.x1.a;
                        break;
                    case 5:
                        str3 = nik1.x1.a;
                        break;
                    case 6:
                        dgz dgzVar = fgzVar.b;
                        if (dgzVar != null && (cgzVar = dgzVar.c) != null && (str = cgzVar.b) != null) {
                            str3 = str;
                        }
                        break;
                    default:
                        eg.o();
                        return;
                }
                iu30Var.invoke(new egz(str3));
                return;
            case 3:
                ppi0 ppi0Var = (ppi0) ((odr) obj2).d;
                if (ppi0Var != null) {
                    iu30 iu30Var2 = (iu30) obj;
                    if (ppi0Var instanceof ppi0) {
                        iu30Var2.invoke(new opi0(ppi0Var.b));
                        return;
                    } else {
                        eg.o();
                        return;
                    }
                }
                return;
            case 4:
                iu30 iu30Var3 = (iu30) obj2;
                bqm0 bqm0Var = ((kbs) obj).d;
                if (bqm0Var != null) {
                    iu30Var3.invoke(new aqm0(bqm0Var));
                    return;
                } else {
                    u890.C("model");
                    throw null;
                }
            case 5:
                Set setS0 = f46.S0(new blc0[]{blc0.Pg, blc0.ld});
                Set set = s4b1.f;
                vnp0 vnp0Var = (vnp0) obj2;
                boolean zContains = setS0.contains(uic.x(vnp0Var.e).c);
                cds cdsVar = (cds) obj;
                lik1 lik1Var = cdsVar.d;
                String str4 = vnp0Var.e;
                if (zContains) {
                    blc0 blc0Var = uic.x(lik1Var.a).c;
                    mfm mfmVarA = cdsVar.g.a(lik1Var);
                    Observable observableA = a6z.a(cdsVar.f, str4, (String) null, (Map) null, lik1Var, new r6z((String) null, true, false, blc0Var != blc0.fh, false, false, false, false, false, true, true, false, false, false, false, true, (ugo0) null, (c821) null, false, false, false, false, (ok51) null, false, (String) null, false, (p860) null, 1073641525), (cee) null, 38);
                    AtomicReferenceArray atomicReferenceArray = p6r0.e;
                    mfm.b(mfmVarA, observableA, yon1.Y0(), (bjm) null, (tv80) null, 20);
                } else {
                    blc0 blc0Var2 = uic.x(lik1Var.a).c;
                    ssf1 ssf1Var = cdsVar.c;
                    String str5 = lik1Var.a;
                    boolean z2 = blc0Var2 != blc0.u1;
                    m031 m031Var = cdsVar.Y;
                    int i = cdsVar.h.i;
                    m031Var.getClass();
                    int iC = l1d.C(i);
                    if (iC == 0) {
                        z = m031Var.b;
                    } else if (iC == 1) {
                        z = m031Var.a;
                    }
                    ssf1Var.a(new dmf1(str4, lik1Var, str5, new vsf1((String) null, (String) null, false, (String) null, true, false, false, false, false, z2, (String) null, false, true, false, false, false, (ugo0) null, (ok51) null, true, (g371) null, false, false, false, false, false, false, z, false, (p860) null, (String) null, false, false, -539010257, 63), Collections.singletonMap("is_music_video", "true")));
                }
                cdsVar.N0.invoke(snp0.a);
                return;
            case 6:
                ((iu30) obj2).invoke(PermissionsCard.Events.ButtonTapped);
                h98 h98Var = (h98) obj;
                ((lcs) h98Var.c).a((Context) h98Var.b, hxy0.Y, 3);
                return;
            case 7:
                iu30 iu30Var4 = (iu30) obj2;
                if (((ses) obj).b != null) {
                    iu30Var4.invoke(new t7t0());
                    return;
                } else {
                    u890.C("model");
                    throw null;
                }
            case 8:
                iu30 iu30Var5 = (iu30) ((tps) obj2).t;
                if (iu30Var5 != null) {
                    iu30Var5.invoke(new dbv0(Collections.singletonList(Integer.valueOf(((ibv0) obj).b))));
                    return;
                } else {
                    u890.C("eventConsumer");
                    throw null;
                }
            case 9:
                ((iu30) obj2).invoke(new dbv0((ArrayList) ((tps) obj).i));
                return;
            case 10:
                iu30 iu30Var6 = (iu30) obj;
                mfs mfsVar = (mfs) obj2;
                phi0 phi0Var = (phi0) mfsVar.c;
                boolean z3 = mfsVar.b;
                mfsVar.b = !z3;
                ((ImageView) phi0Var.b).animate().rotation(!z3 ? 180.0f : 0.0f).setDuration(250L).setInterpolator(new AccelerateDecelerateInterpolator()).start();
                int i2 = mfsVar.b ? 2131962405 : 2131956553;
                ImageView imageView = (ImageView) phi0Var.b;
                imageView.setContentDescription(imageView.getResources().getString(i2));
                boolean z4 = mfsVar.b;
                vsv0 vsv0Var = (vsv0) mfsVar.d;
                if (!z4) {
                    RecyclerView recyclerView = (RecyclerView) phi0Var.c;
                    recyclerView.setLayoutAnimation(AnimationUtils.loadLayoutAnimation(recyclerView.getContext(), 2130771994));
                    recyclerView.startLayoutAnimation();
                    ((TextSwitcher) phi0Var.f).setText(vsv0Var.a);
                    recyclerView.postDelayed(new a6n(mfsVar, (byte) 7), 400L);
                    iu30Var6.invoke(usv0.a);
                    return;
                }
                TextSwitcher textSwitcher = (TextSwitcher) phi0Var.f;
                RecyclerView recyclerView2 = (RecyclerView) phi0Var.c;
                textSwitcher.setText(vsv0Var.b);
                recyclerView2.setVisibility(0);
                recyclerView2.setLayoutAnimation(AnimationUtils.loadLayoutAnimation(recyclerView2.getContext(), 2130772005));
                recyclerView2.startLayoutAnimation();
                iu30Var6.invoke(usv0.b);
                return;
            case 11:
                j4w0 j4w0Var = ((uhs) obj2).X;
                if (j4w0Var == null) {
                    u890.C("headerModel");
                    throw null;
                }
                i4w0 i4w0Var = j4w0Var.a;
                h4w0 h4w0Var = i4w0Var instanceof h4w0 ? (h4w0) i4w0Var : null;
                if (h4w0Var != null) {
                    ((iu30) obj).invoke(new d4w0(((k4w0) h4w0Var.a.get(0)).b));
                    return;
                }
                return;
            case 12:
                EditText editText = ((oxw0) obj2).c;
                ryn1.v(editText);
                ((iu30) obj).invoke(new kxw0(editText.getText().toString()));
                return;
            case 13:
                kjs kjsVar = (kjs) obj2;
                String str6 = (String) obj;
                kjsVar.b.invoke(new on11(str6));
                ((lzn0) kjsVar.d).f(new dwn0(str6, "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null));
                return;
            case 14:
                ((iu30) obj2).invoke((n621) ((h98) obj).c);
                return;
            case 15:
                kp5 kp5Var = (kp5) obj2;
                ke71 ke71Var = (ke71) kp5Var.c;
                gs91 gs91Var = (gs91) obj;
                String str7 = (String) o7h.q0(gs91Var.a);
                i8h1 i8h1Var2 = (i8h1) ke71Var.b;
                x6h1 x6h1VarC3 = ((xok0) ke71Var.c).b.c();
                x6h1VarC3.i.add(new a7h1("snackbar", "snackbar", (Integer) null, "", (String) null));
                x6h1VarC3.j = true;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("action_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                vu1.b((vu1) kp5Var.g, gs91Var.a, gs91Var.b, gs91Var.c, i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str7)), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null), (dy1) null, 48);
                return;
            case 16:
                kp5 kp5Var2 = (kp5) obj2;
                ke71 ke71Var2 = (ke71) kp5Var2.c;
                String str8 = (String) obj;
                i8h1 i8h1Var3 = (i8h1) ke71Var2.b;
                x6h1 x6h1VarC5 = ((xok0) ke71Var2.c).b.c();
                x6h1VarC5.i.add(new a7h1("snackbar", "snackbar", (Integer) null, "", (String) null));
                x6h1VarC5.j = true;
                x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                x6h1VarC6.i.add(new a7h1("label", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = false;
                ((lzn0) kp5Var2.b).a(str8, i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str8)), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis()), (xj61) null), (Bundle) null);
                return;
            case 17:
                ((nx81) obj2).c.invoke((mus) obj);
                return;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                kl1 kl1Var = (kl1) ((vun) obj2).b;
                w4g1 w4g1Var = (w4g1) obj;
                tv80 tv80VarA = ((n5g1) kl1Var.c).a(w4g1Var.b);
                Observable observableSwitchMap = ((Observable) kl1Var.f).switchMap(new ffe1(w4g1Var, kl1Var, (byte) 11));
                mfm mfmVarA2 = ((i4q) kl1Var.e).a((lik1) kl1Var.b);
                AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                mfm.b(mfmVarA2, observableSwitchMap, yon1.Y0(), (bjm) null, tv80VarA, 20);
                return;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                iqm1 iqm1Var = (iqm1) ((yir) obj2).b;
                if (iqm1Var != null) {
                    ((iu30) obj).invoke(new hqm1(iqm1Var.a, iqm1Var.c));
                    return;
                }
                return;
            case 20:
                kqm1 kqm1Var = (kqm1) ((yir) obj2).b;
                if (kqm1Var != null) {
                    ((iu30) obj).invoke(new jqm1(kqm1Var.a));
                    return;
                }
                return;
            case 21:
                o0g1 o0g1Var = (o0g1) obj2;
                i8h1 i8h1Var4 = (i8h1) o0g1Var.d;
                rrk0 rrk0Var = (rrk0) o0g1Var.e;
                rrk0Var.getClass();
                x6h1 x6h1VarC7 = rrk0Var.b.c();
                x6h1VarC7.i.add(new a7h1("negative_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC7.j = false;
                i8h1Var4.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                ((cwb) obj).dismiss();
                return;
            case 22:
                EncoreAddToButtonView encoreAddToButtonView = (EncoreAddToButtonView) obj2;
                encoreAddToButtonView.Z0 = true;
                if (encoreAddToButtonView.Y0.a == qk1.a) {
                    encoreAddToButtonView.performHapticFeedback(Build.VERSION.SDK_INT < 30 ? 1 : 16);
                }
                ((iu30) obj).invoke(new ok1(encoreAddToButtonView, encoreAddToButtonView.Y0.a));
                return;
            case 23:
                EncoreFollowButton encoreFollowButton = (EncoreFollowButton) obj2;
                if (!encoreFollowButton.isActivated()) {
                    encoreFollowButton.performHapticFeedback(Build.VERSION.SDK_INT < 30 ? 1 : 16);
                }
                ((iu30) obj).invoke(Boolean.valueOf(encoreFollowButton.isActivated()));
                return;
            case 24:
                zby zbyVar = ((EntityActionView) obj2).b;
                if (zbyVar != null) {
                    ((iu30) obj).invoke(new yby(zbyVar.a));
                    return;
                }
                return;
            case 25:
                ((iu30) obj2).invoke(new ejy(((lly) obj).e));
                return;
            case 26:
                iu30 iu30Var7 = (iu30) obj2;
                yaz yazVar = ((zaz) obj).a;
                if (yazVar != null) {
                    iu30Var7.invoke(yazVar);
                    return;
                } else {
                    u890.C("quickAction");
                    throw null;
                }
            case 27:
                iu30 iu30Var8 = (iu30) obj2;
                if (((xe00) obj).b != null) {
                    iu30Var8.invoke(new lod0(true));
                    return;
                } else {
                    u890.C("model");
                    throw null;
                }
            case 28:
                ((ps10) obj2).U0.a((lx10) obj);
                return;
            default:
                ((iu30) obj2).invoke(tg20.a);
                ((FindInContextView) obj).U0.getText().clear();
                return;
        }
    }

    public /* synthetic */ cvr(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
