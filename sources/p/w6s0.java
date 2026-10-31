package p;

import android.text.method.PasswordTransformationMethod;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class w6s0 extends mzx {
    public final gav e;
    public final igg f;
    public final jgg g;

    public w6s0(TextInputLayout textInputLayout, int i) {
        super(textInputLayout, i);
        this.e = new gav(this, (byte) 1);
        this.f = new igg(this, (byte) 2);
        this.g = new jgg(this, (byte) 2);
    }

    @Override // p.mzx
    public final void a() {
        int i = this.d;
        if (i == 0) {
            i = 2131231281;
        }
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconDrawable(i);
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(2131959676));
        textInputLayout.setEndIconOnClickListener(new hid0(this, (byte) 11));
        LinkedHashSet linkedHashSet = textInputLayout.F1;
        igg iggVar = this.f;
        linkedHashSet.add(iggVar);
        if (textInputLayout.e != null) {
            iggVar.a(textInputLayout);
        }
        textInputLayout.J1.add(this.g);
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    public final boolean d() {
        EditText editText = this.a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }
}
