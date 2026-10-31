package p;

import android.view.View;
import android.widget.EditText;
import com.spotify.login.phonenumbersignup.callingcode.CallingCodePickerActivity;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vts0 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wts0 b;

    public /* synthetic */ vts0(wts0 wts0Var, byte b) {
        this.a = b;
        this.b = wts0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        wts0 wts0Var = this.b;
        switch (b) {
            case 0:
                wts0Var.Z0().b();
                m0d m0dVar = wts0Var.Z0().X;
                pf30 pf30Var = wts0Var.M1;
                if (pf30Var == null) {
                    u890.C("callingCodeLauncher");
                    throw null;
                }
                int i = CallingCodePickerActivity.g1;
                pf30Var.a(xpn1.q(wts0Var.P0(), m0dVar));
                return;
            case 1:
                wts0Var.Z0().b();
                m0d m0dVar2 = wts0Var.Z0().X;
                pf30 pf30Var2 = wts0Var.M1;
                if (pf30Var2 == null) {
                    u890.C("callingCodeLauncher");
                    throw null;
                }
                int i2 = CallingCodePickerActivity.g1;
                pf30Var2.a(xpn1.q(wts0Var.P0(), m0dVar2));
                return;
            default:
                m0d m0dVar3 = wts0Var.Z0().X;
                if (m0dVar3 != null) {
                    yts0 yts0VarZ0 = wts0Var.Z0();
                    i8h1 i8h1Var = yts0VarZ0.e;
                    h4l0 h4l0Var = yts0VarZ0.h;
                    h4l0Var.getClass();
                    x6h1 x6h1VarC = h4l0Var.b.c();
                    x6h1VarC.i.add(new a7h1("next_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    w6b1 w6b1VarA = f7b1.a(blc0.za);
                    String str = w6b1VarA != null ? (String) o7h.s0(w6b1VarA.c) : null;
                    if (str == null) {
                        str = "";
                    }
                    nyn1.Q(yts0VarZ0.f, new lsn0((String) null, i8h1Var.j(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), y6h1VarA, r6h1.c, System.currentTimeMillis())).a));
                    kg0 kg0Var = wts0Var.J1;
                    if (kg0Var != null) {
                        kg0.e(kg0Var, new yit(new i3f0(m0dVar3.a, m0dVar3.b, ((EditText) ((p1f0) wts0Var.Y0().d).d).getText().toString()), bk8.d, (n5o) null, 12), (ifl1) null);
                        return;
                    } else {
                        u890.C("zeroNavigator");
                        throw null;
                    }
                }
                return;
        }
    }
}
