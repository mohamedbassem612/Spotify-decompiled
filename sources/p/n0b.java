package p;

import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n0b implements o4h1 {
    public final r0b a;
    public final l0b b;

    public n0b(r0b r0bVar, l0b l0bVar) {
        this.a = r0bVar;
        this.b = l0bVar;
    }

    @Override // p.o4h1
    public final void start() {
        l0b l0bVar = this.b;
        String str = l0bVar.b;
        String str2 = l0bVar.a;
        Set set = s4b1.f;
        String strJ = uic.x(str2).j();
        if (strJ == null) {
            strJ = "";
        }
        String str3 = strJ;
        r0b r0bVar = this.a;
        ConstraintLayout constraintLayout = r0bVar.f;
        int i = 2131427726;
        if (((TextView) m5n1.t(constraintLayout, 2131427726)) != null) {
            i = 2131428551;
            Button button = (Button) m5n1.t(constraintLayout, 2131428551);
            if (button != null) {
                i = 2131431363;
                EditText editText = (EditText) m5n1.t(constraintLayout, 2131431363);
                if (editText != null) {
                    i = 2131431400;
                    if (((FrameLayout) m5n1.t(constraintLayout, 2131431400)) != null) {
                        l7m0 l7m0Var = new l7m0(constraintLayout, button, editText);
                        editText.setText(str);
                        o0c.M(editText);
                        button.setOnClickListener(new jl5(r0bVar, str2, l7m0Var, str3, (byte) 1));
                        return;
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayout.getResources().getResourceName(i)));
    }

    @Override // p.o4h1
    public final void stop() {
        this.a.e.a();
    }
}
