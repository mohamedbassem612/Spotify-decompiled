package p;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hav extends x8e1 {
    public final /* synthetic */ jav b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hav(jav javVar, TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.b = javVar;
    }

    @Override // p.x8e1
    public final void onInitializeAccessibilityNodeInfo(View view, kg kgVar) {
        super.onInitializeAccessibilityNodeInfo(view, kgVar);
        if (this.b.a.getEditText().getKeyListener() == null) {
            kgVar.l(Spinner.class.getName());
        }
        if (kgVar.i()) {
            kgVar.q((String) null);
        }
    }

    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        jav javVar = this.b;
        TextInputLayout textInputLayout = javVar.a;
        EditText editText = textInputLayout.getEditText();
        if (!(editText instanceof AutoCompleteTextView)) {
            jah.g("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
            return;
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        if (accessibilityEvent.getEventType() == 1 && javVar.o.isTouchExplorationEnabled() && textInputLayout.getEditText().getKeyListener() == null) {
            javVar.f(autoCompleteTextView);
        }
    }
}
