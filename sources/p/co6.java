package p;

import android.content.Context;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class co6 implements h8l {
    public final /* synthetic */ byte a = 1;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public co6(LayoutInflater layoutInflater, Context context, j2e0 j2e0Var, lzn0 lzn0Var, kt91 kt91Var, rjn0 rjn0Var) {
        this.b = context;
        this.c = j2e0Var;
        this.d = lzn0Var;
        this.e = kt91Var;
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131624678, (ViewGroup) null, false);
        int i = 2131428103;
        EncoreButton encoreButtonT = m5n1.t(constraintLayoutInflate, 2131428103);
        if (encoreButtonT != null) {
            i = 2131429817;
            ProgressBar progressBar = (ProgressBar) m5n1.t(constraintLayoutInflate, 2131429817);
            if (progressBar != null) {
                i = 2131430098;
                EditText editText = (EditText) m5n1.t(constraintLayoutInflate, 2131430098);
                if (editText != null) {
                    i = 2131430102;
                    if (m5n1.t(constraintLayoutInflate, 2131430102) != null) {
                        i = 2131430735;
                        EncoreButton encoreButtonT2 = m5n1.t(constraintLayoutInflate, 2131430735);
                        if (encoreButtonT2 != null) {
                            i = 2131431180;
                            EncoreTextView encoreTextViewT = m5n1.t(constraintLayoutInflate, 2131431180);
                            if (encoreTextViewT != null) {
                                i = 2131431356;
                                EncoreTextView encoreTextViewT2 = m5n1.t(constraintLayoutInflate, 2131431356);
                                if (encoreTextViewT2 != null) {
                                    ConstraintLayout constraintLayout = constraintLayoutInflate;
                                    this.f = new ur00(editText, progressBar, constraintLayout, encoreButtonT, encoreButtonT2, encoreTextViewT, encoreTextViewT2);
                                    hkn0 hkn0Var = hkn0.b;
                                    this.g = r4u.c(new r4u[]{r4u.d(new fza((byte) 17), r4u.a(new tym0(this, (byte) 2)))});
                                    b8k1.q(encoreTextViewT2, true);
                                    editText.post(new mqh1(editText, context, (byte) 1));
                                    editText.setFilters((InputFilter[]) new rjn0[]{rjn0Var});
                                    encoreButtonT2.setAccessibilityTraversalAfter(encoreTextViewT.getId());
                                    String string = constraintLayout.getResources().getString(2131959631);
                                    SpannableString spannableString = new SpannableString(string);
                                    spannableString.setSpan(new ntj(this, (byte) 2), 0, string.length(), 33);
                                    spannableString.setSpan(new ForegroundColorSpan(constraintLayout.getContext().getColor(2131104053)), 0, string.length(), 33);
                                    encoreTextViewT.setText(spannableString);
                                    encoreTextViewT.setMovementMethod(LinkMovementMethod.getInstance());
                                    return;
                                }
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
        switch (this.a) {
            case 0:
                bpb1 bpb1Var = (wen0) ((idd1) this.g).getValue();
                m42 m42Var = new m42(consumer, (byte) 3);
                bpb1 bpb1Var2 = bpb1Var;
                bpb1Var2.getClass();
                bpb1Var2.m((Object) null, m42Var);
                return new rp(this, (byte) 6);
            default:
                ur00 ur00Var = (ur00) this.f;
                ((EditText) ur00Var.e).addTextChangedListener(new lgh(this, consumer));
                ((EncoreButton) ur00Var.f).setOnClickListener(new tmi0(this, consumer, (byte) 0));
                ((EncoreButton) ur00Var.c).setOnClickListener(new tmi0(this, consumer, (byte) 1));
                return new n1b0(this, (byte) 10);
        }
    }

    public final Object getView() {
        switch (this.a) {
            case 0:
                return ((ao6) this.e).a;
            default:
                return (ConstraintLayout) ((ur00) this.f).b;
        }
    }

    public final void start() {
        byte b = this.a;
    }

    public final void stop() {
        byte b = this.a;
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }

    private final void e() {
    }

    public co6(xfx xfxVar, qfl1 qfl1Var, em3 em3Var, gw70 gw70Var, LayoutInflater layoutInflater, q7r0 q7r0Var, bnr bnrVar, ggr ggrVar) {
        this.b = q7r0Var;
        this.c = bnrVar;
        this.d = ggrVar;
        View viewInflate = layoutInflater.inflate(2131624058, (ViewGroup) null, false);
        if (m5n1.t(viewInflate, 2131427544) != null) {
            FrameLayout frameLayout = (FrameLayout) viewInflate;
            this.e = new ao6(frameLayout);
            this.f = new idd1(ng5.V0);
            this.g = new idd1(ng5.U0);
            frameLayout.findViewById(2131427544).setContent(new j2i(1806437343, new m(this, gw70Var, em3Var, xfxVar, qfl1Var, (byte) 14), true));
            return;
        }
        bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(2131427544)));
        throw null;
    }
}
