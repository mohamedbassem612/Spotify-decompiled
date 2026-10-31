package p;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rys0 implements TextWatcher {
    public final /* synthetic */ iu30 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ b14 c;

    public rys0(iu30 iu30Var, int i, b14 b14Var) {
        this.a = iu30Var;
        this.b = i;
        this.c = b14Var;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        List list = (List) this.c.e;
        if (i2 > 0 || i3 > 0) {
            iu30 iu30Var = this.a;
            int i4 = this.b;
            if (charSequence == null || charSequence.length() == 0) {
                iu30Var.invoke(new zys0(i4));
                return;
            }
            iu30Var.invoke(new yys0(ihc1.p0(charSequence), i4));
            if (i4 < list.size() - 1) {
                ((EditText) list.get(i4 + 1)).requestFocus();
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
