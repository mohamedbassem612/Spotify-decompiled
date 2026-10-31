package p;

import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class beb implements kmt {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ni30 b;

    public /* synthetic */ beb(ni30 ni30Var, byte b) {
        this.a = b;
        this.b = ni30Var;
    }

    public final c97 a(dkt dktVar) {
        byte b = this.a;
        uww0 uww0Var = this.b;
        switch (b) {
            case 0:
                gjt gjtVar = (gjt) dktVar;
                zdb zdbVarA = ((h21) uww0Var).a();
                fjt fjtVar = gjtVar.a;
                String str = gjtVar.b;
                Bundle bundle = new Bundle();
                bundle.putParcelable("ARG_MODE", fjtVar);
                if (str != null) {
                    bundle.putString("ARG_PREFILL_EMAIL", str);
                }
                zdbVarA.T0(bundle);
                return new rkt(zdbVarA);
            case 1:
                return new qkt(((h21) uww0Var).a());
            case 2:
                ojt ojtVar = (ojt) dktVar;
                pf10 pf10VarA = ((t700) uww0Var).a();
                njt njtVar = ojtVar.a;
                Serializable serializable = ojtVar.b;
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("ARG_SOURCE", njtVar);
                bundle2.putSerializable("ARG_INTERACTION_LOGGING_RESULT", serializable);
                pf10VarA.T0(bundle2);
                return new rkt(pf10VarA);
            case 3:
                qjt qjtVar = (qjt) dktVar;
                u250 u250VarA = ((t700) uww0Var).a();
                pjt pjtVar = qjtVar.a;
                Serializable serializable2 = qjtVar.b;
                Bundle bundle3 = new Bundle();
                bundle3.putSerializable("launched_from_screen", pjtVar);
                bundle3.putSerializable("ARG_INTERACTION_LOGGING_RESULT", serializable2);
                u250VarA.T0(bundle3);
                return new qkt(u250VarA);
            case 4:
                String str2 = ((tjt) dktVar).a;
                sva svaVar = (sva) uww0Var;
                if (str2 == null) {
                    return new rkt(svaVar.a());
                }
                k1f0 k1f0VarA = svaVar.a();
                Bundle bundle4 = new Bundle();
                bundle4.putString("EMAIL_OR_USERNAME", str2);
                k1f0VarA.T0(bundle4);
                return new rkt(k1f0VarA);
            case 5:
                sit sitVar = (sit) dktVar;
                twf0 twf0VarA = ((t700) uww0Var).a();
                String str3 = sitVar.a;
                boolean z = sitVar.b;
                Bundle bundle5 = new Bundle();
                bundle5.putString("magiclink_email_or_username", str3);
                bundle5.putBoolean("magiclink_show_done_screen", false);
                bundle5.putString("magiclink_initial_error_msg", null);
                bundle5.putBoolean("ARG_AUTO_SEND", z);
                twf0VarA.T0(bundle5);
                return new rkt(twf0VarA);
            case 6:
                epn0 epn0VarA = ((t700) uww0Var).a();
                vjt vjtVar = ((wjt) dktVar).a;
                Bundle bundle6 = new Bundle();
                bundle6.putParcelable("ARG_SOURCE", vjtVar);
                epn0VarA.T0(bundle6);
                return new rkt(epn0VarA);
            default:
                fq81 fq81VarA = uww0Var.a();
                eo81 eo81Var = ((akt) dktVar).a;
                Bundle bundle7 = new Bundle();
                do81 do81Var = eo81Var.a;
                boolean zJ = u890.j(do81Var, un81.a);
                bk8 bk8Var = bk8.a;
                if (zJ) {
                    bundle7.putSerializable("auth_source", bk8Var);
                } else if (do81Var instanceof vn81) {
                    bundle7.putSerializable("auth_source", bk8Var);
                    vn81 vn81Var = (vn81) do81Var;
                    bundle7.putString("email", vn81Var.a);
                    bundle7.putString("display_name", vn81Var.b);
                    bundle7.putBoolean("skip_email", true);
                } else if (do81Var instanceof wn81) {
                    bundle7.putSerializable("auth_source", bk8Var);
                    bundle7.putString("graduation_identifier_token", ((wn81) do81Var).a);
                } else {
                    if (!(do81Var instanceof co81)) {
                        eg.o();
                        return null;
                    }
                    bundle7.putSerializable("auth_source", eo81Var.b);
                    co81 co81Var = (co81) do81Var;
                    bundle7.putString("identifier_token", co81Var.a);
                    bo81 bo81Var = co81Var.b;
                    if (bo81Var instanceof yn81) {
                        bundle7.putBoolean("skip_email", true);
                        yn81 yn81Var = (yn81) bo81Var;
                        bundle7.putString("email", yn81Var.a);
                        bundle7.putString("display_name", yn81Var.b);
                    } else if (bo81Var instanceof ao81) {
                        bundle7.putBoolean("skip_email", true);
                        bundle7.putString("phone_number", ((ao81) bo81Var).a);
                    } else if (!u890.j(bo81Var, zn81.a)) {
                        if (!(bo81Var instanceof xn81)) {
                            eg.o();
                            return null;
                        }
                        bundle7.putBoolean("skip_email", true);
                        xn81 xn81Var = (xn81) bo81Var;
                        bundle7.putString("email", xn81Var.a);
                        bundle7.putString("display_name", xn81Var.b);
                    }
                }
                fq81VarA.T0(bundle7);
                return new rkt(fq81VarA);
        }
    }
}
