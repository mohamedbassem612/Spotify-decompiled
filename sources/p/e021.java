package p;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class e021 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h021 b;

    public /* synthetic */ e021(h021 h021Var, byte b) {
        this.a = b;
        this.b = h021Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        h021 h021Var = this.b;
        switch (b) {
            case 0:
                c26 c26Var = h021Var.T1;
                if (c26Var == null) {
                    u890.C("properties");
                    throw null;
                }
                int i = c26Var.a() ? 50 : 0;
                Button button = h021Var.F1;
                if (button == null) {
                    u890.C("testButton");
                    throw null;
                }
                button.setPadding(i, i, i, i);
                TextView textView = h021Var.G1;
                if (textView == null) {
                    u890.C("textView");
                    throw null;
                }
                c26 c26Var2 = h021Var.T1;
                if (c26Var2 != null) {
                    textView.setText(c26Var2.c().toString());
                    return;
                } else {
                    u890.C("properties");
                    throw null;
                }
            case 1:
                lw21 lw21Var = h021Var.M1;
                if (lw21Var != null) {
                    lw21Var.d();
                    return;
                } else {
                    u890.C("remoteConfigurationResolver");
                    throw null;
                }
            default:
                luw0 luw0Var = h021Var.R1;
                if (luw0Var != null) {
                    luw0Var.a("employee-free-opt-in", "2").subscribe();
                    return;
                } else {
                    u890.C("psMethods");
                    throw null;
                }
        }
    }
}
