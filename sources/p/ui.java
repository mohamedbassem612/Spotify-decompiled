package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.accessory.statemanager.AccessoryStateManager;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class ui extends k01 implements zu30 {
    public final /* synthetic */ byte h = 0;

    public ui(u4q0 u4q0Var) {
        super(4, u4q0Var, u4q0.class, "optInTrialManualOptInEligibility", "optInTrialManualOptInEligibility(Lcom/spotify/ondemandtrials/config/storage/TrialEligibility;ZZ)Lcom/spotify/ondemandtrials/config/ManualOptInEligibility;", 4);
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.h;
        Object obj5 = ((k01) this).a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                a48 a48Var = (a48) obj;
                AccessoryStateManager.Event.Connected connected = (AccessoryStateManager.Event) obj2;
                gbl gblVar = (gbl) obj3;
                ((dj) obj5).getClass();
                if (connected.getAccessory() != null) {
                    if (connected instanceof AccessoryStateManager.Event.Connected) {
                        AccessoryStateManager.Event.Connected connected2 = connected;
                        if (u890.j(a48Var.a(), connected2.getAccessory().i.a())) {
                            return new xi(connected2.getAccessory(), a48Var.d, gblVar.d);
                        }
                    } else if (connected instanceof AccessoryStateManager.Event.Updated) {
                        AccessoryStateManager.Event.Updated updated = (AccessoryStateManager.Event.Updated) connected;
                        if (u890.j(a48Var.a(), updated.getAccessory().i.a())) {
                            return new aj(updated.getAccessory(), a48Var.d, gblVar.d);
                        }
                        if (!u890.j(updated.getAccessory().g, Boolean.TRUE)) {
                            return new wi(gblVar.d, si.b);
                        }
                    } else if (connected instanceof AccessoryStateManager.Event.Disconnected) {
                        return new yi(((AccessoryStateManager.Event.Disconnected) connected).getAccessory(), gblVar.d);
                    }
                }
                return zi.a;
            default:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                ((u4q0) obj5).getClass();
                return (((nrg1) obj).c() && zBooleanValue && !zBooleanValue2) ? new rig0(14) : sig0.a;
        }
    }

    public /* synthetic */ ui(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
    }
}
