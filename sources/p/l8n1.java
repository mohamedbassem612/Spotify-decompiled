package p;

import android.os.SystemClock;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class l8n1 implements i2q0 {
    public final pz40 a;
    public final int b;
    public final gi5 c;
    public final long d;
    public final long e;

    public l8n1(pz40 pz40Var, int i, gi5 gi5Var, long j, long j2) {
        this.a = pz40Var;
        this.b = i;
        this.c = gi5Var;
        this.d = j;
        this.e = j2;
    }

    public static cbl a(h8n1 h8n1Var, xaa xaaVar, int i) {
        cbl cblVarR = xaaVar.r();
        if (cblVarR == null || !cblVarR.c0()) {
            return null;
        }
        int[] iArrF = cblVarR.F();
        if (iArrF == null) {
            int[] iArrA0 = cblVarR.a0();
            if (iArrA0 != null && h4o1.k(iArrA0, i)) {
                return null;
            }
        } else if (!h4o1.k(iArrF, i)) {
            return null;
        }
        if (h8n1Var.v < cblVarR.j()) {
            return cblVarR;
        }
        return null;
    }

    @Override // p.i2q0
    public final void onComplete(Task task) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        long j2;
        int iElapsedRealtime;
        pz40 pz40Var = this.a;
        if (pz40Var.f()) {
            zo31 zo31VarF = yo31.g().f();
            if (zo31VarF == null || zo31VarF.b) {
                h8n1 h8n1Var = (h8n1) pz40Var.t.get(this.c);
                if (h8n1Var != null) {
                    px40 px40Var = h8n1Var.l;
                    if (px40Var instanceof xaa) {
                        px40 px40Var2 = px40Var;
                        long j3 = this.d;
                        boolean z = j3 > 0;
                        int i7 = px40Var2.i();
                        if (zo31VarF != null) {
                            z &= zo31VarF.c;
                            int i8 = zo31VarF.d;
                            int iJ = zo31VarF.e;
                            i = zo31VarF.a;
                            if (px40Var2.t() && !px40Var2.v()) {
                                cbl cblVarA = a(h8n1Var, px40Var2, this.b);
                                if (cblVarA == null) {
                                    return;
                                }
                                boolean z2 = cblVarA.d0() && j3 > 0;
                                iJ = cblVarA.j();
                                z = z2;
                            }
                            i3 = i8;
                            i2 = iJ;
                        } else {
                            i = 0;
                            i2 = 100;
                            i3 = 5000;
                        }
                        if (task.j()) {
                            i6 = 0;
                            i5 = 0;
                        } else if (((hfp1) task).d) {
                            i5 = -1;
                            i6 = 100;
                        } else {
                            Exception excF = task.f();
                            if (excF instanceof ApiException) {
                                Status status = ((ApiException) excF).getStatus();
                                i4 = status.a;
                                lal lalVar = status.d;
                                if (lalVar != null) {
                                    i5 = lalVar.b;
                                }
                                i6 = i4;
                            } else {
                                i4 = 101;
                            }
                            i5 = -1;
                            i6 = i4;
                        }
                        if (z) {
                            long j4 = this.e;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            j = j3;
                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j4);
                            j2 = jCurrentTimeMillis;
                        } else {
                            j = 0;
                            j2 = 0;
                            iElapsedRealtime = -1;
                        }
                        m8n1 m8n1Var = new m8n1(new uoj0(this.b, i6, i5, j, j2, (String) null, (String) null, i7, iElapsedRealtime), i, i3, i2);
                        jim0 jim0Var = pz40Var.N0;
                        jim0Var.sendMessage(jim0Var.obtainMessage(18, m8n1Var));
                    }
                }
            }
        }
    }
}
