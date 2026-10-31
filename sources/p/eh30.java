package p;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class eh30 {
    public final pg0 a;
    public final tzo b;
    public final Activity c;
    public final a1r0 d;
    public final kly0 e;

    public eh30(pg0 pg0Var, tzo tzoVar, Activity activity, a1r0 a1r0Var, jly0 jly0Var) {
        this.a = pg0Var;
        this.b = tzoVar;
        this.c = activity;
        this.d = a1r0Var;
        this.e = jly0Var;
    }

    public final void a(xvd0 xvd0Var, p350 p350Var) {
        String str;
        if (!((pq4) this.e.get()).a()) {
            kvd0 kvd0VarA = ((t700) this.b.b).a();
            kvd0VarA.Z1 = p350Var;
            Bundle bundleG = mno1.g();
            bundleG.putSerializable("LivestreamErrorDialogFragment.DialogType", xvd0Var);
            kvd0VarA.T0(bundleG);
            dg30 dg30Var = this.a.a;
            th30 th30VarE0 = dg30Var.e0();
            if (th30VarE0.U() || dg30Var.e0().G("LivestreamErrorDialog") != null) {
                return;
            }
            kvd0VarA.g1(th30VarE0, "LivestreamErrorDialog");
            return;
        }
        StringBuilder sb = new StringBuilder("spotify:internal:liveroom:error-dialog:");
        if (xvd0Var instanceof mvd0) {
            str = "AgeRestricted";
        } else if (xvd0Var instanceof nvd0) {
            str = "ConnectivityIssue";
        } else if (xvd0Var instanceof ovd0) {
            str = "Explicit";
        } else if (xvd0Var instanceof rvd0) {
            str = "PremiumRequired";
        } else if (xvd0Var instanceof svd0) {
            str = "RoomHasEnded";
        } else if (xvd0Var instanceof tvd0) {
            str = "RoomNotAvailableInLocation";
        } else if (xvd0Var instanceof uvd0) {
            str = "RoomNotFound";
        } else if (xvd0Var instanceof qvd0) {
            str = "PlaybackIssue";
        } else if (xvd0Var instanceof pvd0) {
            str = "NotificationSubscriptionFailed";
        } else if (xvd0Var instanceof wvd0) {
            str = "UpcomingPartyNotificationSubscriptionFailed";
        } else {
            if (!(xvd0Var instanceof vvd0)) {
                eg.o();
                return;
            }
            str = "RsvpFailed";
        }
        sb.append(str);
        smc0 smc0VarN = k4p1.n();
        if (p350Var != null) {
            smc0VarN.add("closeParentOnDismiss=true");
        }
        if (xvd0Var instanceof wvd0) {
            smc0VarN.add("pageUri=" + Uri.encode(((wvd0) xvd0Var).a));
        }
        smc0 smc0VarK = k4p1.k(smc0VarN);
        if (!smc0VarK.isEmpty()) {
            sb.append("?");
            sb.append(o7h.y0(smc0VarK, "&", (String) null, (String) null, (iu30) null, 62));
        }
        a1r0.j(this.d, sb.toString(), (String) null, (Bundle) null, false, 14);
    }
}
