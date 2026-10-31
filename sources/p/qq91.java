package p;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.spotify.base.java.logging.Logger;
import com.spotify.login.adaptiveauthentication.challenge.smscode.OtpInputView;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qq91 extends zf30 implements z0d1, lir0 {
    public final hq81 F1;
    public kt91 G1;
    public nw40 H1;
    public kg0 I1;
    public hus0 J1;
    public mir0 K1;
    public final utw0 L1 = new utw0((byte) 20);
    public final rku M1 = new rku();
    public final bck1 N1;
    public ip31 O1;

    public qq91(hq81 hq81Var) {
        this.F1 = hq81Var;
        fe81 fe81Var = new fe81(this, (byte) 22);
        znb0 znb0VarS = dm5.S(3, new jqb0(new jqb0(this, (byte) 18), (byte) 19));
        this.N1 = ebp1.j(this, rc11.a.b(rq91.class), new g22(znb0VarS, (byte) 13), new g22(znb0VarS, (byte) 14), fe81Var);
    }

    public final void D0() {
        ((OtpInputView) Y0().f).clearFocus();
        ((zf30) this).h1 = true;
    }

    public final void F0(Bundle bundle) {
        ((OtpInputView) Y0().f).g(bundle);
    }

    public final void I0(View view, Bundle bundle) {
        if (bundle != null) {
            ((OtpInputView) Y0().f).f(bundle);
        } else {
            Z0().V();
            if (O0().getBoolean("return_from_resend")) {
                O0().remove("return_from_resend");
                view.post(new nq91(this, (byte) 0));
            }
        }
        String string = O0().getString("signup_step_info");
        if (string != null) {
            ((TextView) Y0().d).setText(string);
        }
        int i = O0().getInt("number_digits");
        String string2 = O0().getString("phone_number");
        zzo1.t((TextView) Y0().h, j4b1.MESSAGES);
        zzo1.t((TextView) Y0().c, j4b1.EDIT);
        ((TextView) Y0().h).setText(l0(2131953050));
        ((TextView) Y0().e).setText(k0().getQuantityString(2131820789, i, Integer.valueOf(i), string2));
        ((TextView) Y0().g).setText(l0(2131959462));
        ((Button) Y0().i).setEnabled(false);
        ((Button) Y0().i).setOnClickListener(new oq91(this, (byte) 0));
        ((TextView) Y0().h).setOnClickListener(new oq91(this, (byte) 1));
        ((TextView) Y0().c).setOnClickListener(new oq91(this, (byte) 2));
        ((OtpInputView) Y0().f).setListener(new dr41(this, (byte) 16));
        this.M1.b(((OtpInputView) Y0().f).getObservable().subscribe((Consumer) new tr41(this, (byte) 27)));
        ((OtpInputView) Y0().f).setNumDigits(i);
        String string3 = O0().getString("attempted_code");
        if (string3 != null) {
            O0().remove("attempted_code");
            ((OtpInputView) Y0().f).setOtp(string3);
            a1(true);
        }
        Z0().T().f(n0(), new qpj0(this, (byte) 11));
        ((OtpInputView) Y0().f).post(new nq91(this, (byte) 1));
        if (Z0().k()) {
            Context contextP0 = P0();
            utw0 utw0Var = this.L1;
            utw0Var.getClass();
            uml1 uml1Var = (uml1) utw0Var.a;
            try {
                try {
                    contextP0.getPackageManager().getPackageInfo(xvj1.b(1), 0);
                } catch (PackageManager.NameNotFoundException unused) {
                    contextP0.getPackageManager().getPackageInfo(xvj1.b(2), 0);
                }
                try {
                    Context contextP1 = P0();
                    UUID uuidRandomUUID = UUID.randomUUID();
                    Intent intentA = uml1Var.a(contextP1, 1);
                    intentA.putExtra("request_id", uuidRandomUUID.toString());
                    contextP1.sendBroadcast(intentA);
                    Intent intentA2 = uml1Var.a(contextP1, 2);
                    intentA2.putExtra("request_id", uuidRandomUUID.toString());
                    contextP1.sendBroadcast(intentA2);
                    dt71 dt71Var = wml1.a;
                    wml1.d(uuidRandomUUID.toString());
                    l4p1.u(cto1.q(n0()), f5p1.q(wml1.b(), new pq91(this, (lnm) null, (byte) 0)));
                    l4p1.u(cto1.q(n0()), f5p1.q(wml1.c(), new pq91(this, (lnm) null, (byte) 1)));
                } catch (Exception e) {
                    Logger.d("SmsCodeChallengeFragment", new Object[]{"Failed to send WhatsApp handshake", e});
                    Z0().W(e.getMessage());
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
        }
    }

    public final ip31 Y0() {
        ip31 ip31Var = this.O1;
        if (ip31Var != null) {
            return ip31Var;
        }
        eg.m("FragmentSmsCodeChallengeBinding was null");
        return null;
    }

    public final rq91 Z0() {
        return (rq91) this.N1.getValue();
    }

    public final void a1(boolean z) {
        ((OtpInputView) Y0().f).setOtpMismatch(z);
        ((TextView) Y0().g).setVisibility(z ? 0 : 8);
        ((TextView) Y0().e).setVisibility(z ? 8 : 0);
        ((Button) Y0().i).setEnabled(!z);
    }

    @Override // p.lir0
    /* JADX INFO: renamed from: c */
    public final mir0 getU1() {
        mir0 mir0Var = this.K1;
        if (mir0Var != null) {
            return mir0Var;
        }
        u890.C("pageObservable");
        throw null;
    }

    public final void v0(Context context) {
        this.F1.f(this);
        super.v0(context);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ip31 ip31VarS = ip31.s(layoutInflater, viewGroup);
        this.O1 = ip31VarS;
        return ip31VarS.q();
    }

    public final void z0() {
        wml1.a();
        this.M1.a();
        ((zf30) this).h1 = true;
    }
}
