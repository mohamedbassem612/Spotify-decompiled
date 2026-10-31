package p;

import com.spotify.carapplibrary.app.instrumentation.events.proto.CalImageLoadingError;
import com.spotify.messages.PartnerAccountLinkingAttempt;
import com.spotify.messages.PartnerAccountLinkingDialogImpression;
import com.spotify.messages.PartnerAccountLinkingNudge;
import com.spotify.messages.PartnerAccountLinkingResult;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lvc {
    public final t2j0 a;

    public void a(slc0 slc0Var, String str, String str2, String str3, int i, int i2) {
        String str4;
        String str5;
        n0s0 n0s0VarN = PartnerAccountLinkingAttempt.n();
        n0s0VarN.q(slc0Var.a);
        n0s0VarN.r(str);
        n0s0VarN.s(str2);
        n0s0VarN.n(str3);
        if (i == 1) {
            str4 = "SDK";
        } else if (i == 2) {
            str4 = "APP_TO_APP";
        } else {
            if (i != 3) {
                throw null;
            }
            str4 = "WEB";
        }
        n0s0VarN.u(str4);
        if (i2 != 0) {
            switch (i2) {
                case 1:
                    str5 = "linking_dialog";
                    break;
                case 2:
                    str5 = "error_dialog";
                    break;
                case 3:
                    str5 = "settings";
                    break;
                case 4:
                    str5 = "partner_app";
                    break;
                case 5:
                    str5 = "device_picker";
                    break;
                case 6:
                    str5 = "device_picker_nudge";
                    break;
                default:
                    throw null;
            }
        } else {
            str5 = "";
        }
        n0s0VarN.t(str5);
        PartnerAccountLinkingAttempt partnerAccountLinkingAttemptBuild = n0s0VarN.build();
        partnerAccountLinkingAttemptBuild.getClass();
        this.a.a(partnerAccountLinkingAttemptBuild);
    }

    public void b(int i, String str, String str2, String str3, slc0 slc0Var) {
        String str4;
        o0s0 o0s0VarN = PartnerAccountLinkingDialogImpression.n();
        o0s0VarN.r(slc0Var.a);
        o0s0VarN.n(str);
        if (i != 0) {
            str4 = i != 1 ? "week_three_reminder" : "week_two_reminder";
        } else {
            str4 = "first_startup";
        }
        o0s0VarN.q(str4);
        o0s0VarN.s(i);
        this.a.a(o0s0VarN.build());
        e(1, str, str2, str3, slc0Var);
    }

    public void c(String str, String str2) {
        kvc kvcVarN = CalImageLoadingError.n();
        kvcVarN.q(str);
        kvcVarN.n(str2);
        CalImageLoadingError calImageLoadingErrorBuild = kvcVarN.build();
        calImageLoadingErrorBuild.getClass();
        this.a.a(calImageLoadingErrorBuild);
    }

    public void d(com.google.protobuf.h hVar) {
        this.a.a(hVar);
    }

    public void e(int i, String str, String str2, String str3, slc0 slc0Var) {
        String str4;
        y0s0 y0s0VarN = PartnerAccountLinkingNudge.n();
        y0s0VarN.q(slc0Var.a);
        y0s0VarN.n(str);
        y0s0VarN.r(str2);
        y0s0VarN.s(str3);
        if (i == 1) {
            str4 = "linking_dialog";
        } else if (i == 2) {
            str4 = "device_picker";
        } else {
            if (i != 3) {
                throw null;
            }
            str4 = "device_picker_nudge";
        }
        y0s0VarN.t(str4);
        PartnerAccountLinkingNudge partnerAccountLinkingNudgeBuild = y0s0VarN.build();
        partnerAccountLinkingNudgeBuild.getClass();
        this.a.a(partnerAccountLinkingNudgeBuild);
    }

    public void f(slc0 slc0Var, String str, boolean z, String str2, String str3, String str4) {
        e1s0 e1s0VarN = PartnerAccountLinkingResult.n();
        e1s0VarN.r(slc0Var.a);
        e1s0VarN.s(str);
        e1s0VarN.u(z);
        e1s0VarN.t(str2);
        e1s0VarN.q(str3);
        e1s0VarN.n(str4);
        PartnerAccountLinkingResult partnerAccountLinkingResultBuild = e1s0VarN.build();
        partnerAccountLinkingResultBuild.getClass();
        this.a.a(partnerAccountLinkingResultBuild);
    }
}
