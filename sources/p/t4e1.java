package p;

import androidx.compose.ui.geometry.Offset;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class t4e1 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z4e1 b;

    public /* synthetic */ t4e1(z4e1 z4e1Var, byte b) {
        this.a = b;
        this.b = z4e1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        z4e1 z4e1Var = this.b;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                boolean z = z4e1Var.U0 && !z4e1Var.V0;
                if (zBooleanValue) {
                    if (((qj80) ((rj80) lcc.z(z4e1Var, t4k.m)).a.getValue()).a != 1) {
                        z4e1Var.S0.v(false);
                    }
                    if (z) {
                        z4e1Var.P1(false);
                    }
                } else {
                    z4e1Var.K1();
                    ggg1 ggg1Var = z4e1Var.Q0;
                    y7e1 y7e1Var = ggg1Var.a;
                    dk80 dk80Var = ggg1Var.b;
                    y7e1Var.b.c().h();
                    h4e1 h4e1Var = y7e1Var.b;
                    h4e1Var.o(null);
                    ggg1Var.r(h4e1Var);
                    y7e1Var.b(dk80Var, true, 1);
                    y7e1Var.g(true);
                    y7e1Var.f(y7e1Var.b.e);
                    z4e1Var.Q0.a();
                }
                p9p1.z(z4e1Var, new s4e1(z4e1Var, (byte) 1));
                return rih1Var;
            case 1:
                s3o1.r(z4e1Var);
                return rih1Var;
            case 2:
                y3v y3vVar = new y3v();
                z4e1Var.Z0.a(y3vVar);
                z4e1Var.d1 = y3vVar;
                s3o1.r(z4e1Var);
                return rih1Var;
            case 3:
                aae1 aae1Var = z4e1Var.R0;
                long jF = ((Offset) obj).a;
                elb0 elb0VarB = aae1Var.b();
                if (elb0VarB != null && elb0VarB.a()) {
                    jF = elb0VarB.f(jF);
                }
                int iD = z4e1Var.R0.d(jF, true);
                if (iD >= 0) {
                    z4e1Var.Q0.o(e6p1.e(iD, iD));
                }
                z4e1Var.S0.A(qr50.a, jF);
                return rih1Var;
            case 4:
                z4e1Var.L1();
                z4e1Var.S0.b();
                s3o1.r(z4e1Var);
                return rih1Var;
            case 5:
                z4e1Var.L1();
                return rih1Var;
            case 6:
                List list = (List) obj;
                y9e1 y9e1VarC = z4e1Var.R0.c();
                return Boolean.valueOf(y9e1VarC != null ? list.add(y9e1VarC) : false);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                z4e1Var.S0.l.setValue(bool);
                return rih1Var;
        }
    }
}
