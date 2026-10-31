package p;

import android.content.Context;
import android.os.SystemClock;
import android.provider.Settings;
import com.google.protobuf.h;
import com.spotify.contexts.InstallationId;
import com.spotify.contexts.MonotonicClock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class eo80 implements r900 {
    public final /* synthetic */ byte a = 0;
    public final Object b;

    public eo80(ubc ubcVar, mgc mgcVar) {
        this.b = mgcVar;
    }

    public final String a() {
        switch (this.a) {
            case 0:
                return "context_installation_id";
            default:
                return "context_monotonic_clock";
        }
    }

    public final h getData() {
        int i;
        int i2 = 0;
        switch (this.a) {
            case 0:
                bo80 bo80VarN = InstallationId.n();
                byte[] bytes = ((fo80) this.b).a().getBytes(nne.a);
                bo80VarN.n(phc.e(0, bytes, bytes.length));
                return bo80VarN.build();
            default:
                ojm0 ojm0VarN = MonotonicClock.n();
                mgc mgcVar = (mgc) this.b;
                synchronized (mgcVar) {
                    i = mgcVar.b;
                    if (i == -1) {
                        i = ((cu71) mgcVar.c).a.c().getInt("monotonic_clock_id", -1);
                        rok0 rok0Var = (rok0) mgcVar.d;
                        cu71 cu71Var = (cu71) rok0Var.b;
                        if (i == -1) {
                            q59 q59Var = (q59) rok0Var.c;
                            try {
                                i2 = Settings.Global.getInt(((Context) q59Var.b).getContentResolver(), "boot_count");
                            } catch (Exception e) {
                                ((zq4) q59Var.c).e("Error in getting boot count.", e);
                            }
                            cu71Var.a(i2, "boot_count");
                            ((cu71) mgcVar.c).a(1, "monotonic_clock_id");
                            mgcVar.b = 1;
                            i = 1;
                        } else {
                            int i3 = cu71Var.a.c().getInt("boot_count", -1);
                            q59 q59Var2 = (q59) rok0Var.c;
                            try {
                                i2 = Settings.Global.getInt(((Context) q59Var2.b).getContentResolver(), "boot_count");
                            } catch (Exception e2) {
                                ((zq4) q59Var2.c).e("Error in getting boot count.", e2);
                            }
                            if (i3 == -1 || i3 < i2) {
                                cu71Var.a(i2, "boot_count");
                                i++;
                                ((cu71) mgcVar.c).a(i, "monotonic_clock_id");
                            }
                            mgcVar.b = i;
                        }
                        break;
                    }
                }
                ojm0VarN.n(i);
                ojm0VarN.q(SystemClock.elapsedRealtime());
                return ojm0VarN.build();
        }
    }

    public eo80(fo80 fo80Var) {
        this.b = fo80Var;
    }
}
