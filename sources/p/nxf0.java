package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nxf0 {
    public final ohv0 a;

    public nxf0(ohv0 ohv0Var) {
        this.a = ohv0Var;
    }

    public final void a(jap1 jap1Var) {
        String str;
        boolean z = jap1Var instanceof yp80;
        ohv0 ohv0Var = this.a;
        if (z) {
            yp80 yp80Var = (yp80) jap1Var;
            ohv0Var.a(new nhv0(z1a1.n(yp80Var.c).a, yp80Var.d));
            return;
        }
        int i = 7;
        if (jap1Var instanceof xp80) {
            String str2 = z1a1.n(2).a;
            int iC = l1d.C(2);
            if (iC != 0) {
                if (iC != 1) {
                    eg.o();
                    return;
                }
                i = 1;
            }
            ohv0Var.a(new mhv0(str2, ab80.g(i), ew80.b, (String) null));
            return;
        }
        int i2 = 16;
        int i3 = 12;
        if (jap1Var instanceof tp80) {
            tp80 tp80Var = (tp80) jap1Var;
            String str3 = z1a1.n(tp80Var.c).a;
            switch (l1d.C(tp80Var.d)) {
                case 0:
                    i3 = 9;
                    break;
                case 1:
                    i3 = 18;
                    break;
                case 2:
                    i3 = 19;
                    break;
                case 3:
                    break;
                case 4:
                    i3 = 40;
                    break;
                case 5:
                    i3 = 39;
                    break;
                case 6:
                    i3 = 41;
                    break;
                case 7:
                    i3 = 42;
                    break;
                default:
                    eg.o();
                    return;
            }
            String strD = ktd.d(i3);
            ew80 ew80Var = ew80.c;
            int iC2 = l1d.C(tp80Var.e);
            if (iC2 != 0) {
                if (iC2 != 1) {
                    eg.o();
                    return;
                }
                i2 = 20;
            }
            ohv0Var.a(new mhv0(str3, strD, ew80Var, hrt.d(i2)));
            return;
        }
        if (jap1Var instanceof vp80) {
            vp80 vp80Var = (vp80) jap1Var;
            String str4 = z1a1.n(2).a;
            int iC3 = l1d.C(vp80Var.c);
            if (iC3 == 0) {
                i3 = 3;
            } else if (iC3 != 1) {
                if (iC3 != 2) {
                    eg.o();
                    return;
                }
                i3 = 14;
            }
            String strH = zjy.h(i3);
            int iC4 = l1d.C(1);
            if (iC4 != 0) {
                if (iC4 != 1) {
                    eg.o();
                    return;
                }
                i = 1;
            }
            ohv0Var.a(new jhv0(str4, strH, ab80.g(i), vp80Var.d));
            return;
        }
        if (jap1Var instanceof up80) {
            String str5 = z1a1.n(5).a;
            int iC5 = l1d.C(1);
            if (iC5 != 0) {
                if (iC5 != 1) {
                    eg.o();
                    return;
                }
                i2 = 20;
            }
            ohv0Var.a(new lhv0(str5, hrt.d(i2)));
            return;
        }
        if (!(jap1Var instanceof wp80)) {
            eg.o();
            return;
        }
        wp80 wp80Var = (wp80) jap1Var;
        String str6 = z1a1.n(wp80Var.c).a;
        switch (l1d.C(wp80Var.d)) {
            case 0:
                i = 2;
                break;
            case 1:
                i = 6;
                break;
            case 2:
                i = 5;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                break;
            case 6:
                i = 8;
                break;
            case 7:
                i = 20;
                break;
            default:
                eg.o();
                return;
        }
        switch (i) {
            case 1:
                str = "google_play_services_status";
                break;
            case 2:
                str = "magiclink_token_received_success";
                break;
            case 3:
                str = "magiclink_request_bad_email";
                break;
            case 4:
                str = "magiclink_request_bad_email_prefilled";
                break;
            case 5:
                str = "magiclink_request_success_not_prefilled";
                break;
            case 6:
                str = "magiclink_request_success_prefilled";
                break;
            case 7:
                str = "magiclink_request_user_not_found";
                break;
            case 8:
                str = "magiclink_request_user_not_found_prefilled";
                break;
            case 9:
                str = "otp_request_success";
                break;
            case 10:
                str = "otp_request_failure";
                break;
            case 11:
                str = "otp_session_expired";
                break;
            case 12:
                str = "otp_validation_success";
                break;
            case 13:
                str = "otp_validation_failure";
                break;
            case 14:
                str = "return_to_screen";
                break;
            case 15:
                str = "accessibility_status";
                break;
            case 16:
                str = "preload_info";
                break;
            case 17:
                str = "start_screen_image_loading";
                break;
            case 18:
                str = "screen_image_interaction_tap";
                break;
            case 19:
                str = "screen_image_interaction_swipe";
                break;
            case 20:
                str = "email_username_submit";
                break;
            case 21:
                str = "username_hint";
                break;
            default:
                throw null;
        }
        ohv0Var.a(new khv0(str6, str, wp80Var.e));
    }
}
