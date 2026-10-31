package p;

import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class x8e1 extends rf {
    public final TextInputLayout a;

    public x8e1(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
    }

    public void onInitializeAccessibilityNodeInfo(View view, kg kgVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = kgVar.a;
        super.onInitializeAccessibilityNodeInfo(view, kgVar);
        TextInputLayout textInputLayout = this.a;
        EditText editText = textInputLayout.getEditText();
        Editable text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean zIsEmpty2 = TextUtils.isEmpty(hint);
        boolean z = textInputLayout.g2;
        boolean zIsEmpty3 = TextUtils.isEmpty(error);
        boolean z2 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String string = !zIsEmpty2 ? hint.toString() : "";
        if (!zIsEmpty) {
            kgVar.w(text);
        } else if (!TextUtils.isEmpty(string)) {
            kgVar.w(string);
            if (!z && placeholderText != null) {
                kgVar.w(string + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            kgVar.w(placeholderText);
        }
        if (!TextUtils.isEmpty(string)) {
            if (Build.VERSION.SDK_INT >= 26) {
                kgVar.q(string);
            } else {
                if (!zIsEmpty) {
                    string = ((Object) text) + ", " + string;
                }
                kgVar.w(string);
            }
            kgVar.u(zIsEmpty);
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z2) {
            if (zIsEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        if (editText != null) {
            editText.setLabelFor(2131431317);
        }
    }
}
