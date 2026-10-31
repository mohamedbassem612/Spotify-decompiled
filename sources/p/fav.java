package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fav extends LinearLayout {
    public static final /* synthetic */ mma0[] i = {new een0(fav.class, "state", "getState()Lcom/spotify/address/addressimpl/view/FieldViewState$Dropdown;", 0)};
    public final hce1 a;
    public final nvb1 b;
    public iu30 c;
    public iu30 d;
    public Function0 e;
    public Function0 f;
    public final pze1 g;
    public final pze1 h;

    public fav(Context context) {
        super(context, null, 0, 0);
        LayoutInflater.from(context).inflate(2131626326, this);
        int i2 = 2131429710;
        TextView textView = (TextView) m5n1.t(this, 2131429710);
        if (textView != null) {
            i2 = 2131429729;
            TextInputLayout textInputLayout = (TextInputLayout) m5n1.t(this, 2131429729);
            if (textInputLayout != null) {
                i2 = 2131431267;
                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) m5n1.t(this, 2131431267);
                if (autoCompleteTextView != null) {
                    this.a = new hce1(this, textView, textInputLayout, autoCompleteTextView, (byte) 27);
                    this.b = new nvb1(this, context, (byte) 2);
                    this.g = new pze1();
                    this.h = new pze1();
                    setOrientation(1);
                    autoCompleteTextView.addTextChangedListener(new p96(this, (byte) 7));
                    autoCompleteTextView.setOnItemClickListener(new qk5(this, (byte) 1));
                    autoCompleteTextView.setOnFocusChangeListener(new x29((Object) this, (byte) 6));
                    autoCompleteTextView.setOnEditorActionListener(new y29(this, (byte) 1));
                    getViewTreeObserver().addOnPreDrawListener(new b39(this, new int[2], new int[2], new p811(), (byte) 1));
                    return;
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getSelectedKey() {
        Object next;
        String string = ihc1.e1(((AutoCompleteTextView) this.a.e).getText().toString()).toString();
        l320 state = getState();
        if (state != null) {
            Iterator it = state.e.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!nhc1.S(((k320) next).b, string, true));
            k320 k320Var = (k320) next;
            if (k320Var != null) {
                return k320Var.a;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002b  */
    public final void b(String str) {
        String str2;
        Object next;
        l320 state = getState();
        if (state != null) {
            Iterator it = state.e.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!u890.j(((k320) next).a, str));
            k320 k320Var = (k320) next;
            if (k320Var != null) {
                str2 = k320Var.b;
            } else {
                str2 = null;
            }
        } else {
            str2 = null;
        }
        hce1 hce1Var = this.a;
        ((AutoCompleteTextView) hce1Var.e).setText((CharSequence) null, true);
        ((AutoCompleteTextView) hce1Var.e).setText((CharSequence) str2, false);
    }

    public final int getImeOptions() {
        return ((AutoCompleteTextView) this.a.e).getImeOptions();
    }

    public final Function0 getOnFocused() {
        return this.e;
    }

    public final iu30 getOnOptionSelected() {
        return this.d;
    }

    public final iu30 getOnTextChanged() {
        return this.c;
    }

    public final Function0 getOnUserInput() {
        return this.f;
    }

    public final l320 getState() {
        mma0 mma0Var = i[0];
        return (l320) ((sgp0) this.b).a;
    }

    public final void setImeOptions(int i2) {
        ((AutoCompleteTextView) this.a.e).setImeOptions(i2);
    }

    public final void setOnFocused(Function0 function0) {
        this.e = function0;
    }

    public final void setOnOptionSelected(iu30 iu30Var) {
        this.d = iu30Var;
    }

    public final void setOnTextChanged(iu30 iu30Var) {
        this.c = iu30Var;
    }

    public final void setOnUserInput(Function0 function0) {
        this.f = function0;
    }

    public final void setState(l320 l320Var) {
        this.b.c(i[0], this, l320Var);
    }
}
