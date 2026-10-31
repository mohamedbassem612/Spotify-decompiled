package p;

import android.text.Editable;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gav extends afe1 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ mzx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gav(mzx mzxVar, byte b) {
        super((byte) 1);
        this.b = b;
        this.c = mzxVar;
    }

    public void afterTextChanged(Editable editable) {
        switch (this.b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                jav javVar = (jav) this.c;
                EditText editText = javVar.a.getEditText();
                if (!(editText instanceof AutoCompleteTextView)) {
                    jah.g("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
                } else {
                    AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
                    if (javVar.o.isTouchExplorationEnabled() && autoCompleteTextView.getKeyListener() != null && !javVar.c.hasFocus()) {
                        autoCompleteTextView.dismissDropDown();
                    }
                    autoCompleteTextView.post(new nx30(this, autoCompleteTextView, false, (byte) 20));
                }
                break;
            default:
                super.afterTextChanged(editable);
                break;
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.b) {
            case 1:
                w6s0 w6s0Var = (w6s0) this.c;
                w6s0Var.c.setChecked(!w6s0Var.d());
                break;
            default:
                super.beforeTextChanged(charSequence, i, i2, i3);
                break;
        }
    }
}
