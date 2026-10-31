package p;

import com.spotify.allboarding.notificationpermission.view.NotificationPermissionFragment;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bso0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qj0 b;
    public final /* synthetic */ NotificationPermissionFragment c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bso0(qj0 qj0Var, NotificationPermissionFragment notificationPermissionFragment, byte b) {
        super(2);
        this.a = b;
        this.b = qj0Var;
        this.c = notificationPermissionFragment;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        qj0 qj0Var = this.b;
        rih1 rih1Var = rih1.a;
        NotificationPermissionFragment notificationPermissionFragment = this.c;
        boolean z = false;
        byte b2 = 1;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    otw.c(this.b, new zro0(notificationPermissionFragment.l0(2131963435), notificationPermissionFragment.l0(2131959209), notificationPermissionFragment.l0(2131963435), notificationPermissionFragment.l0(2131959156), notificationPermissionFragment.l0(2131958089)), (qim0) null, (ipb1) null, x340Var2, 8, 12);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    nyx.a(0, (wux) null, apo.r(-1918866917, new bso0(qj0Var, notificationPermissionFragment, z ? (byte) 1 : (byte) 0), x340Var4), x340Var4, 3072, 7);
                }
                break;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    qsw.a(apo.r(1435975432, new bso0(qj0Var, notificationPermissionFragment, b2), x340Var6), x340Var6);
                }
                break;
        }
        return rih1Var;
    }
}
