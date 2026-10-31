package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class nea implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r7e1 b;

    public /* synthetic */ nea(r7e1 r7e1Var, byte b) {
        this.a = b;
        this.b = r7e1Var;
    }

    public final Object invoke() {
        elb0 elb0VarQ;
        n511 n511Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        r7e1 r7e1Var = this.b;
        switch (b) {
            case 0:
                return r7e1Var.p(true, false);
            case 1:
                return r7e1Var.p(false, false);
            case 2:
                return Boolean.valueOf(r7e1Var.j(false).a);
            case 3:
                hrr0 hrr0Var = r7e1Var.t;
                ggg1 ggg1Var = r7e1Var.a;
                boolean zD = nbe1.d(ggg1Var.h().e);
                if (((zD && ((ree1) hrr0Var.getValue()) == ree1.b) || (!zD && ((ree1) hrr0Var.getValue()) == ree1.c)) && r7e1Var.l() == null && ((Boolean) r7e1Var.l.getValue()).booleanValue() && (elb0VarQ = r7e1Var.q()) != null) {
                    n511 n511VarU = ljo1.u(elb0VarQ);
                    n511 n511VarG = anm1.g(elb0VarQ.O(n511VarU.h()), n511VarU.g());
                    elb0 elb0VarQ2 = r7e1Var.q();
                    if (elb0VarQ2 != null) {
                        long j = ggg1Var.h().e;
                        if (nbe1.d(j)) {
                            n511 n511VarK = r7e1Var.k();
                            n511Var = anm1.g(elb0VarQ2.O(n511VarK.h()), n511VarK.g());
                        } else {
                            long jO = elb0VarQ2.O(r7e1Var.o(true));
                            long jO2 = elb0VarQ2.O(r7e1Var.o(false));
                            y9e1 y9e1VarC = r7e1Var.b.c();
                            if (y9e1VarC == null) {
                                n511Var = n511.e;
                            } else {
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (elb0VarQ2.O((((long) Float.floatToRawIntBits(y9e1VarC.c((int) (j >> 32)).b)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32)) & 4294967295L));
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (elb0VarQ2.O((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(y9e1VarC.c((int) (j & 4294967295L)).b)) & 4294967295L)) & 4294967295L));
                                int i = (int) (jO >> 32);
                                int i2 = (int) (jO2 >> 32);
                                float fMin = Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
                                float fMax = Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
                                if (fMin == fMax) {
                                    fMax += 1.0f;
                                }
                                n511Var = new n511(fMin, Math.min(fIntBitsToFloat, fIntBitsToFloat2), fMax, Math.max(Float.intBitsToFloat((int) (jO & 4294967295L)), Float.intBitsToFloat((int) (jO2 & 4294967295L))));
                            }
                        }
                        if (n511Var.l(n511VarG)) {
                            return n511Var.j(n511VarG);
                        }
                    } else {
                        tf80.d("textLayoutCoordinates should not be null.");
                        jah.d();
                    }
                }
                return null;
            case 4:
                return (n511) r7e1Var.y.getValue();
            case 5:
                return r7e1Var.a.h();
            case 6:
                r7e1Var.b();
                return rih1Var;
            case 7:
                return Boolean.valueOf(!((Boolean) r7e1Var.u.getValue()).booleanValue());
            case 8:
                ggg1 ggg1Var2 = r7e1Var.a;
                y7e1 y7e1Var = ggg1Var2.a;
                dk80 dk80Var = ggg1Var2.b;
                y7e1Var.b.c().h();
                h4e1 h4e1Var = y7e1Var.b;
                u2p1.v(h4e1Var, 0, h4e1Var.c.length());
                y7e1Var.b(dk80Var, true, 1);
                y7e1Var.g(true);
                y7e1Var.f(y7e1Var.b.e);
                return rih1Var;
            default:
                Function0 function0 = r7e1Var.m;
                if (function0 != null) {
                    function0.invoke();
                }
                return rih1Var;
        }
    }
}
