package p;

import com.spotify.allboarding.notificationpermission.view.NotificationPermissionFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cso0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ NotificationPermissionFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cso0(NotificationPermissionFragment notificationPermissionFragment, byte b) {
        super(0);
        this.a = b;
        this.b = notificationPermissionFragment;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        NotificationPermissionFragment notificationPermissionFragment = this.b;
        switch (b) {
            case 0:
                bnj0 bnj0Var = notificationPermissionFragment.K1;
                if (bnj0Var == null) {
                    u890.C("enableNotificationChannel");
                    throw null;
                }
                bnj0Var.m();
                jpa0 jpa0Var = notificationPermissionFragment.J1;
                if (jpa0Var == null) {
                    u890.C("permissionRequester");
                    throw null;
                }
                pf30 pf30Var = (pf30) jpa0Var.b;
                if (pf30Var != null) {
                    pf30Var.a("android.permission.POST_NOTIFICATIONS");
                    return rih1Var;
                }
                u890.C("requestPermissionLauncher");
                throw null;
            default:
                notificationPermissionFragment.Y0();
                return rih1Var;
        }
    }
}
