package p;

import android.view.View;
import com.spotify.login.adaptiveauthentication.challenge.smscode.OtpInputView;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class oq91 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qq91 b;

    public /* synthetic */ oq91(qq91 qq91Var, byte b) {
        this.a = b;
        this.b = qq91Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        qq91 qq91Var = this.b;
        switch (b) {
            case 0:
                String otp = ((OtpInputView) qq91Var.Y0().f).getOtp();
                if (otp != null) {
                    rq91 rq91VarZ0 = qq91Var.Z0();
                    rq91VarZ0.U(new mhv0("phone_number_otp", "validate_otp", ew80.c, (String) null));
                    i8h1 i8h1Var = rq91VarZ0.c;
                    x6h1 x6h1VarC = rq91VarZ0.t.b.c();
                    x6h1VarC.i.add(new a7h1("next_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    w6b1 w6b1VarA = f7b1.a(blc0.pa);
                    String str = w6b1VarA != null ? (String) o7h.s0(w6b1VarA.c) : null;
                    if (str == null) {
                        str = "";
                    }
                    nyn1.Q(rq91VarZ0.g, new lsn0((String) null, i8h1Var.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), y6h1VarA, r6h1.c, System.currentTimeMillis())).a));
                    kg0 kg0Var = qq91Var.I1;
                    if (kg0Var != null) {
                        kg0Var.d(new zit(new vwe0(new swe0(otp))), true);
                        return;
                    } else {
                        u890.C("zeroNavigator");
                        throw null;
                    }
                }
                return;
            case 1:
                rq91 rq91VarZ1 = qq91Var.Z0();
                rq91VarZ1.U(new mhv0("phone_number_otp", "resend_sms", ew80.c, (String) null));
                i8h1 i8h1Var2 = rq91VarZ1.c;
                x6h1 x6h1VarC2 = rq91VarZ1.t.b.c();
                x6h1VarC2.i.add(new a7h1("resend_otp_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var2.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()));
                rq91VarZ1.h.m(rq91VarZ1.i + 30000 > rq91VarZ1.d.b() ? sq91.c : sq91.b);
                return;
            default:
                rq91 rq91VarZ2 = qq91Var.Z0();
                rq91VarZ2.U(new mhv0("phone_number_otp", "edit_phone_number", ew80.c, (String) null));
                i8h1 i8h1Var3 = rq91VarZ2.c;
                x6h1 x6h1VarC3 = rq91VarZ2.t.b.c();
                x6h1VarC3.i.add(new a7h1("edit_phone_number_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                nyn1.Q(rq91VarZ2.g, new yrn0(i8h1Var3.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis())).a));
                kg0 kg0Var2 = qq91Var.I1;
                if (kg0Var2 != null) {
                    kg0Var2.d(new zit(new vwe0(qwe0.a)), true);
                    return;
                } else {
                    u890.C("zeroNavigator");
                    throw null;
                }
        }
    }
}
