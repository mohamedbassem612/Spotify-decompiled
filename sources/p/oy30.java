package p;

import com.spotify.messages.TimeMeasurementErrorNonAuth;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class oy30 implements ooe1 {
    public final t2j0 a;
    public boolean b;
    public boolean c = true;

    public oy30(t2j0 t2j0Var) {
        this.a = t2j0Var;
    }

    @Override // p.ooe1
    public final void a(boolean z) {
        this.b = z;
    }

    @Override // p.ooe1
    public final void b(pne1 pne1Var) {
        String str;
        boolean z = this.c;
        t2j0 t2j0Var = this.a;
        t2j0 t2j0Var2 = z ? t2j0Var : null;
        if (t2j0Var2 == null) {
            return;
        }
        if (pne1Var.h != null) {
            t2j0Var2.a(d7e.o(pne1Var));
            return;
        }
        int iA = this.b ? t2j0Var2.a(d7e.n(pne1Var)) : t2j0Var2.a(d7e.p(pne1Var));
        if (iA != 1) {
            vne1 vne1VarW = TimeMeasurementErrorNonAuth.w(d7e.o(pne1Var));
            vne1VarW.z(p3d1.c(7));
            switch (iA) {
                case 1:
                    str = "ACCEPTED";
                    break;
                case 2:
                    str = "PROTOBUF_SERIALIZATION_FAILED";
                    break;
                case 3:
                    str = "REJECTED_MISSING_NAME";
                    break;
                case 4:
                    str = "REJECTED_MISSING_OWNER";
                    break;
                case 5:
                    str = "REJECTED_PAYLOAD_TOO_LARGE";
                    break;
                case 6:
                    str = "REJECTED_RATE_LIMITED";
                    break;
                case 7:
                    str = "OTHER_ERROR";
                    break;
                default:
                    throw null;
            }
            vne1VarW.x(str);
            TimeMeasurementErrorNonAuth timeMeasurementErrorNonAuthBuild = vne1VarW.build();
            t2j0 t2j0Var3 = this.c ? t2j0Var : null;
            if (t2j0Var3 != null) {
                timeMeasurementErrorNonAuthBuild.getClass();
                t2j0Var3.a(timeMeasurementErrorNonAuthBuild);
            }
        }
    }

    @Override // p.ooe1
    public final void setEnabled(boolean z) {
        this.c = z;
    }
}
