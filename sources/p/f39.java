package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.spotify.address.addressimpl.view.NonCompletingAutoCompleteTextView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class f39 extends LinearLayout {
    public static final /* synthetic */ mma0[] O0 = {new een0(f39.class, "state", "getState()Lcom/spotify/address/addressimpl/view/FieldViewState$Autocomplete;", 0)};
    public final pze1 N0;
    public final hce1 a;
    public final a39 b;
    public final ce0 c;
    public boolean d;
    public iu30 e;
    public iu30 f;
    public Function0 g;
    public iu30 h;
    public Function0 i;
    public final pze1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f39(Context context) {
        super(context, null, 0, 0);
        byte b = 0;
        LayoutInflater.from(context).inflate(2131626318, this);
        int i = 2131429710;
        TextView textView = (TextView) m5n1.t(this, 2131429710);
        if (textView != null) {
            i = 2131429729;
            TextInputLayout textInputLayout = (TextInputLayout) m5n1.t(this, 2131429729);
            if (textInputLayout != null) {
                i = 2131431267;
                NonCompletingAutoCompleteTextView nonCompletingAutoCompleteTextViewT = m5n1.t(this, 2131431267);
                if (nonCompletingAutoCompleteTextViewT != null) {
                    this.a = new hce1(this, textView, textInputLayout, nonCompletingAutoCompleteTextViewT, (byte) 26);
                    a39 a39Var = new a39(context);
                    this.b = a39Var;
                    this.c = new ce0(this, (byte) 3);
                    this.t = new pze1();
                    this.N0 = new pze1();
                    setOrientation(1);
                    nonCompletingAutoCompleteTextViewT.setAdapter(a39Var);
                    nonCompletingAutoCompleteTextViewT.addTextChangedListener(new p96(this, (byte) 1));
                    nonCompletingAutoCompleteTextViewT.setOnFocusChangeListener(new x29(this, b));
                    nonCompletingAutoCompleteTextViewT.setOnClickListener(new c20(this, (byte) 8));
                    nonCompletingAutoCompleteTextViewT.setOnItemClickListener(new ph3(this, context));
                    nonCompletingAutoCompleteTextViewT.setOnEditorActionListener(new y29(this, b));
                    getViewTreeObserver().addOnPreDrawListener(new b39(this, new int[2], new int[2], new p811(), (byte) 0));
                    return;
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    public final int getImeOptions() {
        return ((NonCompletingAutoCompleteTextView) this.a.e).getImeOptions();
    }

    public final iu30 getOnFocusLost() {
        return this.f;
    }

    public final Function0 getOnFocused() {
        return this.g;
    }

    public final Function0 getOnManualEntrySelected() {
        return this.i;
    }

    public final iu30 getOnSuggestionSelected() {
        return this.h;
    }

    public final iu30 getOnTextChanged() {
        return this.e;
    }

    public final j320 getState() {
        mma0 mma0Var = O0[0];
        return (j320) ((sgp0) this.c).a;
    }

    public final void setImeOptions(int i) {
        ((NonCompletingAutoCompleteTextView) this.a.e).setImeOptions(i);
    }

    public final void setOnFocusLost(iu30 iu30Var) {
        this.f = iu30Var;
    }

    public final void setOnFocused(Function0 function0) {
        this.g = function0;
    }

    public final void setOnManualEntrySelected(Function0 function0) {
        this.i = function0;
    }

    public final void setOnSuggestionSelected(iu30 iu30Var) {
        this.h = iu30Var;
    }

    public final void setOnTextChanged(iu30 iu30Var) {
        this.e = iu30Var;
    }

    public final void setState(j320 j320Var) {
        this.c.c(O0[0], this, j320Var);
    }
}
