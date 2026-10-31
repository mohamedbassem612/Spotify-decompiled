package p;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.spotify.allboarding.allboardingimpl.presentation.error.ErrorFragment;
import com.spotify.artist.creatorartist.ExpandableEllipsizeTextView;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import io.reactivex.rxjava3.functions.Action;
import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zfs implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zfs(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        lik1 lik1Var;
        String str;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                yir yirVar = (yir) obj;
                w081.a(yirVar.k());
                yirVar.k().e.toggle();
                return;
            case 1:
                ((s20) ((xap) obj).b).invoke(s7v0.a);
                return;
            case 2:
                ((fws) obj).e.invoke(fzf1.h);
                return;
            case 3:
                ((u7u) obj).b();
                return;
            case 4:
                jav javVar = (jav) obj;
                javVar.f((AutoCompleteTextView) ((mzx) javVar).a.getEditText());
                return;
            case 5:
                ((y1w) obj).invoke(view);
                return;
            case 6:
                jnw jnwVar = (jnw) obj;
                jnwVar.i1().a(new mhv0("samsung_effortless_login_sheet", "samsung_effortless_login_dismissed", ew80.c, "none"));
                uba ubaVar = jnwVar.W1;
                if (ubaVar == null) {
                    u890.C("ubiLogger");
                    throw null;
                }
                evl0 evl0Var = jnwVar.X1;
                if (evl0Var == null) {
                    u890.C("eventFactory");
                    throw null;
                }
                x6h1 x6h1VarC = evl0Var.a.c();
                x6h1VarC.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                ubaVar.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()));
                jnwVar.dismiss();
                return;
            case 7:
                ((j3y) obj).Z0(false, false);
                return;
            case 8:
                ((f80) obj).invoke();
                return;
            case 9:
                Bundle bundle = new Bundle();
                bundle.putParcelable("ALLBOARDING_SCREEN_RESPONSE", new ip41(0, 3));
                sap1.m((ErrorFragment) obj, "ALLBOARDING_SCREEN_RESPONSE", bundle);
                return;
            case 10:
                hjz hjzVar = (hjz) obj;
                Function0 function0 = hjzVar.c2;
                if (function0 == null) {
                    u890.C("primaryAction");
                    throw null;
                }
                function0.invoke();
                hjzVar.dismiss();
                return;
            case 11:
                ((Action) obj).run();
                return;
            case 12:
                ExpandableEllipsizeTextView expandableEllipsizeTextView = (ExpandableEllipsizeTextView) obj;
                expandableEllipsizeTextView.setShouldExpandText(!expandableEllipsizeTextView.t);
                expandableEllipsizeTextView.w();
                return;
            case 13:
                syf syfVar = ((xb30) obj).e;
                if (syfVar != null) {
                    view.getClass();
                    syfVar.invoke(view);
                    return;
                }
                return;
            case 14:
                xz40 xz40Var = (xz40) obj;
                x4f1.b(xz40Var.a);
                xz40Var.c.b();
                return;
            case 15:
                g350 g350Var = (g350) obj;
                Function0 function1 = g350Var.W1;
                if (function1 != null) {
                    function1.invoke();
                }
                g350Var.k1();
                g350Var.Z0(false, false);
                return;
            case 16:
                ((hs20) obj).invoke();
                return;
            case 17:
                ((hs20) obj).invoke();
                return;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                int i = i660.V1;
                dg30 dg30VarF0 = ((i660) obj).f0();
                if (dg30VarF0 != null) {
                    dg30VarF0.finish();
                    return;
                }
                return;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ssw0 ssw0Var = (ssw0) obj;
                ssw0Var.l(th60.a);
                ssw0Var.H((Throwable) null);
                return;
            case 20:
                ((iu30) ((u3) obj).d).invoke(os70.a);
                return;
            case 21:
                ((cwb) ((idd1) ((wp20) obj).e).getValue()).dismiss();
                return;
            case 22:
                k1a0 k1a0Var = (k1a0) obj;
                pp90 pp90Var = (pp90) k1a0Var.b.b.current().getValue();
                if (pp90Var != null) {
                    ((tq90) k1a0Var.i).a(pp90Var, hr90.h);
                    return;
                }
                return;
            case 23:
                ((DatePickerDialog) ((wva0) obj).t).show();
                return;
            case 24:
                n830 n830Var = (n830) obj;
                xjn0 xjn0Var = (xjn0) n830Var.e;
                yxa0 yxa0Var = ((yjn0) n830Var.d).d;
                xjn0Var.getClass();
                txa0 txa0Var = txa0.a;
                if (yxa0Var.equals(txa0Var) || (yxa0Var instanceof vxa0)) {
                    lik1Var = nik1.u3;
                } else {
                    if (!(yxa0Var instanceof uxa0) && !(yxa0Var instanceof wxa0)) {
                        eg.o();
                        return;
                    }
                    lik1Var = nik1.L3;
                }
                String str2 = lik1Var.a;
                i8h1 i8h1Var = xjn0Var.a;
                x6h1 x6h1VarC2 = xjn0Var.b.b.c();
                x6h1VarC2.i.add(new a7h1("next_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA = x6h1VarC2.a();
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                if (str2 == null) {
                    str2 = "";
                }
                tv80 tv80VarM = i8h1Var.m(new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                swa0 swa0Var = (swa0) n830Var.c;
                swa0Var.d = twa0.a(swa0Var.d, (String) null, ihc1.e1(((EditText) ((kp5) n830Var.g).b).getText().toString()).toString(), (String) null, (dxr0) null, (String) null, (String) null, false, false, 0, (String) null, (yxa0) null, (tpw0) null, 8189);
                Bundle bundle2 = new Bundle();
                bundle2.putString("birthday", swa0Var.d.c);
                bundle2.putString("maxBirthday", swa0Var.d.e);
                bundle2.putString("minBirthday", swa0Var.d.f);
                lik1 lik1Var2 = nik1.u3;
                bundle2.putParcelable("pages", swa0Var.d(lik1Var2));
                bundle2.putParcelable("flow_type", swa0Var.d.Y);
                yxa0 yxa0Var2 = swa0Var.d.Y;
                if (u890.j(yxa0Var2, txa0Var)) {
                    str = lik1Var2.a;
                } else {
                    if (!(yxa0Var2 instanceof uxa0)) {
                        if (yxa0Var2 instanceof xxa0) {
                            eg.m("ParentalConsent flows should use AccountCreationFlowManager");
                            return;
                        } else {
                            eg.o();
                            return;
                        }
                    }
                    str = nik1.L3.a;
                }
                swa0Var.a.c(str, tv80VarM, bundle2);
                return;
            case 25:
                swb0 swb0Var = (swb0) obj;
                h22 h22Var = swb0Var.c2;
                if (h22Var == null) {
                    u890.C("listener");
                    throw null;
                }
                h22 h22Var2 = h22Var;
                uba ubaVar2 = h22Var2.K1;
                if (ubaVar2 == null) {
                    u890.C("pageBoundUbiLogger");
                    throw null;
                }
                dsk0 dsk0Var = h22Var2.T1;
                if (dsk0Var == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC3 = dsk0Var.b.c();
                x6h1VarC3.i.add(new a7h1("learn_more_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = true;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                ubaVar2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                swb0Var.dismiss();
                return;
            case 26:
                int i2 = xwb0.W1;
                ((xwb0) obj).m1();
                return;
            case 27:
                ((uyb0) obj).Z0(false, false);
                return;
            case 28:
                ((wyb0) obj).N0().onBackPressed();
                return;
            default:
                ((e5q0) obj).c();
                return;
        }
    }
}
