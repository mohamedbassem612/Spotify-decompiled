package p;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class k5x implements TextWatcher {
    public final EditText a;
    public j5x b;
    public boolean c = true;

    public k5x(EditText editText) {
        this.a = editText;
    }

    public static void a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            a4x a4xVarA = a4x.a();
            if (editableText == null) {
                length = 0;
            } else {
                a4xVarA.getClass();
                length = editableText.length();
            }
            a4xVarA.h(0, length, 0, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.a;
        if (!editText.isInEditMode() && this.c && a4x.d() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int iC = a4x.a().c();
            if (iC != 0) {
                if (iC == 1) {
                    a4x.a().h(i, i3 + i, 0, (Spannable) charSequence);
                    return;
                } else if (iC != 3) {
                    return;
                }
            }
            a4x a4xVarA = a4x.a();
            j5x j5xVar = this.b;
            if (j5xVar == null) {
                j5xVar = new j5x(editText);
                this.b = j5xVar;
            }
            a4xVarA.i(j5xVar);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
