package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w250 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x250 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w250(x250 x250Var, byte b) {
        super(0);
        this.a = b;
        this.b = x250Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        x250 x250Var = this.b;
        switch (b) {
            case 0:
                x250Var.e.a(new mhv0(x250Var.b.a, "google_registration_disabled_email_signup_button", ew80.c, (String) null));
                x250Var.d.d(new yit(y2f0.a, bk8.a, (n5o) null, 12), true);
                break;
            case 1:
                x250Var.e.a(new mhv0(x250Var.b.a, "google_registration_disabled_dismiss_button", ew80.c, (String) null));
                x250Var.d.a(true);
                break;
            case 2:
                x250Var.e.a(new lhv0(x250Var.b.a, "google_registration_disabled_popup"));
                break;
            case 3:
                x250Var.d.a(true);
                break;
            default:
                x250Var.e.a(new lhv0(x250Var.b.a, "unknown_error"));
                break;
        }
        return rih1Var;
    }
}
