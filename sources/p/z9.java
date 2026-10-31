package p;

import androidx.car.app.navigation.model.Maneuver;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class z9 implements iu30 {
    public final /* synthetic */ byte a;

    public /* synthetic */ z9(byte b) {
        this.a = b;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                rav0 rav0Var = (rav0) obj;
                boolean z = false;
                if (rav0Var != null && rav0Var.a == 2) {
                    z = true;
                }
                return Boolean.valueOf(!z);
            case 1:
                return rih1Var;
            case 2:
                return rih1Var;
            case 3:
                return Float.valueOf(((Float) obj).floatValue() / 2.0f);
            case 4:
                return Boolean.TRUE;
            case 5:
                return Boolean.TRUE;
            case 6:
                ((Integer) obj).getClass();
                return Float.valueOf(Float.NaN);
            case 7:
                return Boolean.TRUE;
            case 8:
                return Boolean.TRUE;
            case 9:
                return (vdt0) obj;
            case 10:
                return Boolean.valueOf(zko1.m((v161) obj));
            case 11:
                mma0[] mma0VarArr = b261.a;
                ((e261) obj).b(z161.y, rih1Var);
                return rih1Var;
            case 12:
                return rih1Var;
            case 13:
                ((Long) obj).getClass();
                return rih1Var;
            case 14:
                mma0[] mma0VarArr2 = b261.a;
                ((e261) obj).b(z161.x, rih1Var);
                return rih1Var;
            case 15:
                ((Long) obj).getClass();
                return rih1Var;
            case 16:
                return rih1Var;
            case 17:
                ((Long) obj).getClass();
                return rih1Var;
            case 18:
                return rih1Var;
            case 19:
                k75 k75Var = (k75) obj;
                k75Var.getHandler().post(new t94(k75Var.U0, (byte) 4));
                return rih1Var;
            case 20:
                return rih1Var;
            case 21:
                return Boolean.valueOf(!(((we5) obj) instanceof cpr0));
            case 22:
                return rih1Var;
            case 23:
                t0a t0aVar = (t0a) obj;
                t0aVar.getClass();
                ha71.x(t0aVar);
                return rih1Var;
            case 24:
                ((t0a) obj).J1();
                return rih1Var;
            case 25:
                return rih1Var;
            case 26:
                return rih1Var;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                ((lsl) obj).s1();
                return rih1Var;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return Boolean.TRUE;
            default:
                return rih1Var;
        }
    }
}
