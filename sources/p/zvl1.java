package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zvl1 {
    public kj41 a;
    public nif1 b;

    public zvl1() {
        hhp0 hhp0Var = hhp0.a;
    }

    public final void a(int i) {
        String strC;
        kj41 kj41Var = this.a;
        if (kj41Var == null) {
            return;
        }
        if (i == -512) {
            strC = "unknown";
        } else if (i == -256) {
            strC = "not_stopped";
        } else if (i == 13) {
            strC = "user";
        } else if (i != 14) {
            switch (i) {
                case 1:
                    strC = "cancelled_by_app";
                    break;
                case 2:
                    strC = "preempt";
                    break;
                case 3:
                    strC = "timeout";
                    break;
                case 4:
                    strC = "device_state";
                    break;
                case 5:
                    strC = "constraint_battery_not_low";
                    break;
                case 6:
                    strC = "constraint_charging";
                    break;
                case 7:
                    strC = "constraint_connectivity";
                    break;
                case 8:
                    strC = "constraint_device_idle";
                    break;
                case 9:
                    strC = "constraint_storage_not_low";
                    break;
                case 10:
                    strC = "quota";
                    break;
                default:
                    strC = f4i1.c(i, "unknown_");
                    break;
            }
        } else {
            strC = "system_processing";
        }
        kj41Var.setAttribute("stop_reason", strC);
        nif1 nif1Var = this.b;
        if (nif1Var != null) {
            nif1Var.stop();
        }
        kj41Var.stop();
        this.a = null;
        this.b = null;
    }

    public final synchronized void b() {
        kj41 kj41Var = this.a;
        if (kj41Var != null) {
            kj41Var.setAttribute("outcome", "cancelled");
        }
    }

    public final synchronized void c(int i) {
        String str;
        kj41 kj41Var = this.a;
        if (kj41Var != null) {
            if (i == 1) {
                str = "success";
            } else if (i == 2) {
                str = "retry";
            } else if (i == 3) {
                str = "failure";
            } else if (i == 4) {
                str = "cancelled";
            } else {
                if (i != 5) {
                    throw null;
                }
                str = "exception";
            }
            kj41Var.setAttribute("outcome", str);
        }
    }

    public final synchronized void d(int i) {
        a(i);
    }

    public final synchronized void e(Throwable th) {
        try {
            String strR = rc11.a.b(th.getClass()).r();
            if (strR == null) {
                strR = "unknown";
            }
            kj41 kj41Var = this.a;
            if (kj41Var != null) {
                kj41Var.setAttribute("outcome", "exception");
            }
            nif1 nif1Var = this.b;
            if (nif1Var != null) {
                nif1Var.setAttribute("error_class", strR);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void f(String str, String str2, int i, String str3) {
        Map mapJ = sqg0.J(new mmr0[]{new mmr0("worker_name", str), new mmr0("worker_class", str2), new mmr0("run_attempt_count", String.valueOf(i))});
        hhp0 hhp0Var = hhp0.a;
        this.a = hhp0Var.u("scheduler.workmanager.execution").c(mapJ);
        nif1 nif1VarL = ihp0.l(hhp0Var, "scheduler.workmanager.execution", str3, 4);
        nif1VarL.setAttribute("work_spec_id", str3);
        this.b = nif1VarL;
    }
}
