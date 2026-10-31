package p;

import android.app.DatePickerDialog;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.encoreconsumermobile.elements.backbutton.BackButtonView;
import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class spk implements h8l {
    public final /* synthetic */ byte a = 0;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public spk(LayoutInflater layoutInflater, nwa nwaVar, yge0 yge0Var, lik1 lik1Var, lzn0 lzn0Var, kt91 kt91Var, yqg yqgVar) {
        this.b = nwaVar;
        this.c = yge0Var;
        this.d = lik1Var;
        this.e = lzn0Var;
        this.f = kt91Var;
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131624677, (ViewGroup) null, false);
        int i = 2131427724;
        EditText editText = (EditText) m5n1.t(constraintLayoutInflate, 2131427724);
        if (editText != null) {
            i = 2131427725;
            EncoreTextView encoreTextViewT = m5n1.t(constraintLayoutInflate, 2131427725);
            if (encoreTextViewT != null) {
                i = 2131428103;
                EncoreButton encoreButtonT = m5n1.t(constraintLayoutInflate, 2131428103);
                if (encoreButtonT != null) {
                    i = 2131429832;
                    ProgressBar progressBar = (ProgressBar) m5n1.t(constraintLayoutInflate, 2131429832);
                    if (progressBar != null) {
                        i = 2131430735;
                        EncoreButton encoreButtonT2 = m5n1.t(constraintLayoutInflate, 2131430735);
                        if (encoreButtonT2 != null) {
                            i = 2131431356;
                            EncoreTextView encoreTextViewT2 = m5n1.t(constraintLayoutInflate, 2131431356);
                            if (encoreTextViewT2 != null) {
                                ConstraintLayout constraintLayout = constraintLayoutInflate;
                                this.g = new wmy(editText, progressBar, constraintLayout, encoreButtonT, encoreButtonT2, encoreTextViewT, encoreTextViewT2);
                                Calendar calendarD = yqgVar.d();
                                this.h = calendarD;
                                pli0 pli0Var = pli0.b;
                                this.i = r4u.c(new r4u[]{r4u.d(new a0b((byte) 16), r4u.a(new zud0(this, (byte) 12)))});
                                b8k1.q(encoreTextViewT2, true);
                                rwq0.s(constraintLayout, gce0.t);
                                DatePickerDialog datePickerDialog = new DatePickerDialog(constraintLayout.getContext(), 2132017504, new l6r(this, (byte) 2), calendarD.get(1), calendarD.get(2), calendarD.get(5));
                                datePickerDialog.updateDate(2000, 0, 1);
                                datePickerDialog.getDatePicker().setMaxDate(new Date().getTime());
                                editText.setOnClickListener(new hid0(datePickerDialog, (byte) 5));
                                encoreButtonT2.setAccessibilityTraversalAfter(editText.getId());
                                return;
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final Connection L(Consumer consumer) {
        byte b = this.a;
        Object obj = this.g;
        switch (b) {
            case 0:
                bpb1 bpb1Var = (wen0) ((idd1) obj).getValue();
                m42 m42Var = new m42(consumer, (byte) 8);
                bpb1 bpb1Var2 = bpb1Var;
                bpb1Var2.getClass();
                bpb1Var2.m((Object) null, m42Var);
                ((BackButtonView) ((mpk) this.e).b.e).n(new mwh(new kjk(this, consumer, (byte) 2), (byte) 24));
                return new rp(this, (byte) 17);
            default:
                wmy wmyVar = (wmy) obj;
                ((EditText) wmyVar.b).addTextChangedListener(new lgh(consumer, this, (byte) 4));
                ((EncoreButton) wmyVar.f).setOnClickListener(new fmi0(this, consumer, (byte) 0));
                ((EncoreButton) wmyVar.d).setOnClickListener(new fmi0(this, consumer, (byte) 1));
                return new n1b0(this, (byte) 9);
        }
    }

    public void b() {
        wmy wmyVar = (wmy) this.g;
        ((EncoreTextView) wmyVar.c).setVisibility(8);
        EditText editText = (EditText) wmyVar.b;
        editText.setTextColor(-1);
        Resources resources = ((ConstraintLayout) wmyVar.a).getResources();
        ThreadLocal threadLocal = qx21.a;
        editText.setBackground(resources.getDrawable(2131231313, null));
    }

    public final Object getView() {
        switch (this.a) {
            case 0:
                return ((hva) this.d).a;
            default:
                return (ConstraintLayout) ((wmy) this.g).a;
        }
    }

    public final void start() {
        switch (this.a) {
            case 0:
                xhk1.c(((hva) this.d).a, new h3h1(new mwh(this, (byte) 25)));
                break;
        }
    }

    public final void stop() {
        byte b = this.a;
    }

    private final void c() {
    }

    private final void d() {
    }

    private final void e() {
    }

    public spk(LayoutInflater layoutInflater, npk npkVar, p7p p7pVar, cir0 cir0Var, g1i g1iVar) {
        this.b = cir0Var;
        this.c = g1iVar;
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131624458, (ViewGroup) null, false);
        int i = 2131428170;
        ComposeView composeViewT = m5n1.t(constraintLayoutInflate, 2131428170);
        if (composeViewT != null) {
            i = 2131428200;
            CoordinatorLayout coordinatorLayoutT = m5n1.t(constraintLayoutInflate, 2131428200);
            if (coordinatorLayoutT != null) {
                ConstraintLayout constraintLayout = constraintLayoutInflate;
                this.d = new hva(composeViewT, constraintLayout, coordinatorLayoutT);
                mpk mpkVar = new mpk(layoutInflater.getContext());
                this.e = mpkVar;
                this.f = new idd1(aok.e);
                this.g = new idd1(aok.d);
                rwq0.s(constraintLayout, zrj.O0);
                ksk0 ksk0Var = new ksk0(npkVar.a, (byte) 15);
                this.h = ksk0Var;
                this.i = new xid((d7p) ((em0) p7pVar.a.c).g, ksk0Var, (byte) 24);
                coordinatorLayoutT.addView((BehaviorRetainingAppBarLayout) mpkVar.b.b, 0);
                composeViewT.setContent(new j2i(-41313688, new boj(this, (byte) 21), true));
                return;
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }
}
