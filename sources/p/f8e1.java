package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class f8e1 extends LinearLayout {
    public static final /* synthetic */ mma0[] h = {new een0(f8e1.class, "state", "getState()Lcom/spotify/address/addressimpl/view/FieldViewState$Text;", 0)};
    public final zrj1 a;
    public final be0 b;
    public iu30 c;
    public iu30 d;
    public Function0 e;
    public final pze1 f;
    public final pze1 g;

    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View, android.widget.TextView, com.google.android.material.textfield.TextInputEditText] */
    public f8e1(Context context) {
        super(context, null, 0, 0);
        LayoutInflater.from(context).inflate(2131626330, this);
        int i = 2131428550;
        ?? r0 = (TextInputEditText) m5n1.t(this, 2131428550);
        if (r0 != 0) {
            i = 2131429710;
            TextView textView = (TextView) m5n1.t(this, 2131429710);
            if (textView != null) {
                i = 2131429729;
                TextInputLayout textInputLayout = (TextInputLayout) m5n1.t(this, 2131429729);
                if (textInputLayout != null) {
                    this.a = new zrj1(this, (TextInputEditText) r0, textView, textInputLayout);
                    this.b = new be0(this, (byte) 4);
                    this.f = new pze1();
                    this.g = new pze1();
                    setOrientation(1);
                    r0.addTextChangedListener(new p96(this, (byte) 13));
                    r0.setOnFocusChangeListener(new x29((Object) this, (byte) 13));
                    r0.setOnEditorActionListener(new y29(this, (byte) 5));
                    return;
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    public final int getImeOptions() {
        return ((TextInputEditText) this.a.b).getImeOptions();
    }

    public final iu30 getOnFocusLost() {
        return this.d;
    }

    public final Function0 getOnFocused() {
        return this.e;
    }

    public final iu30 getOnTextChanged() {
        return this.c;
    }

    public final m320 getState() {
        mma0 mma0Var = h[0];
        return (m320) ((sgp0) this.b).a;
    }

    public final void setImeOptions(int i) {
        ((TextInputEditText) this.a.b).setImeOptions(i);
    }

    public final void setOnFocusLost(iu30 iu30Var) {
        this.d = iu30Var;
    }

    public final void setOnFocused(Function0 function0) {
        this.e = function0;
    }

    public final void setOnTextChanged(iu30 iu30Var) {
        this.c = iu30Var;
    }

    public final void setState(m320 m320Var) {
        this.b.c(h[0], this, m320Var);
    }
}
