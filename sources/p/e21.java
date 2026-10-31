package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e21 implements kmt {
    public static final e21 b = new e21(0);
    public static final e21 c = new e21(1);
    public static final e21 d = new e21(2);
    public static final e21 e = new e21(3);
    public static final e21 f = new e21(4);
    public static final e21 g = new e21(5);
    public static final e21 h = new e21(6);
    public static final e21 i = new e21(7);
    public static final e21 j = new e21(8);
    public final /* synthetic */ byte a;

    public /* synthetic */ e21(byte b2) {
        this.a = b2;
    }

    public final c97 a(dkt dktVar) {
        switch (this.a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putParcelable("entry_point", (zit) dktVar);
                return new skt(bundle, b21.class);
            case 1:
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("entry_point", (yit) dktVar);
                return new skt(bundle2, b21.class);
            case 2:
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable("entry_point", (bjt) dktVar);
                return new skt(bundle3, b21.class);
            case 3:
                Bundle bundle4 = new Bundle();
                bundle4.putParcelable("entry_point", (ajt) dktVar);
                return new skt(bundle4, b21.class);
            case 4:
                ijt ijtVar = (ijt) dktVar;
                Bundle bundle5 = new Bundle();
                bundle5.putInt("number_digits", ijtVar.b);
                bundle5.putString("attempted_code", ijtVar.c);
                bundle5.putString("email_address", ijtVar.a);
                bundle5.putBoolean("return_from_resend", ijtVar.d);
                bundle5.putBoolean("show_generic_error", ijtVar.e);
                bundle5.putBoolean("show_too_many_attempts_error", ijtVar.f);
                bundle5.putBoolean("is_login_flow", ijtVar.g);
                bundle5.putLong("expires_at_millis", ijtVar.h);
                bundle5.putLong("resend_cooldown_until_millis", ijtVar.i);
                bundle5.putString("login_email", ijtVar.t);
                bundle5.putString("signup_step_info", ijtVar.X);
                return new skt(bundle5, evw.class);
            case 5:
                jjt jjtVar = (jjt) dktVar;
                Bundle bundle6 = new Bundle();
                bundle6.putInt("number_digits", jjtVar.b);
                bundle6.putString("attempted_code", jjtVar.c);
                bundle6.putString("phone_number", jjtVar.a);
                bundle6.putBoolean("return_from_resend", jjtVar.d);
                bundle6.putString("signup_step_info", jjtVar.e);
                return new skt(bundle6, qq91.class);
            case 6:
                djt djtVar = (djt) dktVar;
                int i2 = djtVar.a;
                int i3 = djtVar.b;
                Bundle bundle7 = new Bundle();
                bundle7.putString("arg_reason", kk0.A(i2));
                bundle7.putString("arg_source", kk0.y(i3));
                bundle7.putBoolean("arg_show_action_buttons", true);
                return new skt(bundle7, fi2.class);
            case 7:
                ejt ejtVar = (ejt) dktVar;
                Bundle bundle8 = new Bundle();
                bundle8.putBoolean("isAfterRegistration", ejtVar.a);
                bundle8.putString("referringDeeplink", ejtVar.c);
                bundle8.putString("referrer", ejtVar.d);
                bundle8.putString("authSource", ejtVar.b.name());
                bundle8.putParcelable("credentialManagerCredentials", ejtVar.e);
                return new skt(bundle8, dj8.class);
            default:
                return new skt(new Bundle(), auk.class);
        }
    }
}
