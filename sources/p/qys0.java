package p;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qys0 implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditText b;
    public final /* synthetic */ b14 c;

    public qys0(u63 u63Var, int i, EditText editText, b14 b14Var) {
        this.a = i;
        this.b = editText;
        this.c = b14Var;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        int i2;
        List list = (List) this.c.e;
        keyEvent.getClass();
        if (i != 67 || keyEvent.getAction() != 0 || (i2 = this.a) <= 0) {
            return false;
        }
        EditText editText = this.b;
        if (editText.getSelectionStart() != 0 || editText.getSelectionEnd() != 0) {
            return false;
        }
        int i3 = i2 - 1;
        ((EditText) list.get(i3)).getText().clear();
        ((EditText) list.get(i3)).requestFocus();
        return true;
    }
}
