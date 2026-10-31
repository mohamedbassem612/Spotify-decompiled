package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final /* synthetic */ class o5n1 implements iu30 {
    public final /* synthetic */ byte a;

    @Override // p.iu30
    public final Object invoke(Object obj) throws Exception {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                tfa0 tfa0Var = (tfa0) obj;
                tfa0Var.d = true;
                tfa0Var.c = true;
                tfa0Var.l = true;
                tfa0Var.e = true;
                tfa0Var.g = true;
                tfa0Var.b = false;
                tfa0Var.a = true;
                return rih1Var;
            case 1:
                tfa0 tfa0Var2 = (tfa0) obj;
                tfa0Var2.d = true;
                tfa0Var2.c = false;
                tfa0Var2.a = true;
                tfa0Var2.g = true;
                tfa0Var2.k = true;
                tfa0Var2.b = false;
                return rih1Var;
            case 2:
                tfa0 tfa0Var3 = (tfa0) obj;
                tfa0Var3.d = true;
                tfa0Var3.c = true;
                tfa0Var3.a = true;
                tfa0Var3.g = true;
                tfa0Var3.k = true;
                tfa0Var3.b = false;
                return rih1Var;
            case 3:
                Byte b2 = (Byte) obj;
                b2.byteValue();
                return String.format("%02x", Arrays.copyOf(new Object[]{b2}, 1));
            case 4:
                d441 d441VarG1 = ((y341) obj).g1("SELECT * FROM device_ids ORDER BY id DESC LIMIT 1");
                try {
                    int iW = y7y0.w(d441VarG1, "id");
                    int iW2 = y7y0.w(d441VarG1, "one");
                    int iW3 = y7y0.w(d441VarG1, "two");
                    int iW4 = y7y0.w(d441VarG1, "three");
                    int iW5 = y7y0.w(d441VarG1, "four");
                    int iW6 = y7y0.w(d441VarG1, "five");
                    int iW7 = y7y0.w(d441VarG1, "six");
                    int iW8 = y7y0.w(d441VarG1, "seven");
                    int iW9 = y7y0.w(d441VarG1, "deviceIdProvider");
                    int iW10 = y7y0.w(d441VarG1, "createdAt");
                    Long s6n1Var = null;
                    if (d441VarG1.f1()) {
                        s6n1Var = new s6n1(d441VarG1.isNull(iW) ? null : Integer.valueOf((int) d441VarG1.getLong(iW)), d441VarG1.isNull(iW2) ? null : d441VarG1.P0(iW2), d441VarG1.isNull(iW3) ? null : d441VarG1.P0(iW3), d441VarG1.isNull(iW4) ? null : d441VarG1.P0(iW4), d441VarG1.isNull(iW5) ? null : d441VarG1.P0(iW5), d441VarG1.isNull(iW6) ? null : d441VarG1.P0(iW6), d441VarG1.isNull(iW7) ? null : d441VarG1.P0(iW7), d441VarG1.isNull(iW8) ? null : d441VarG1.P0(iW8), d441VarG1.isNull(iW9) ? null : d441VarG1.P0(iW9), d441VarG1.isNull(iW10) ? null : Long.valueOf(d441VarG1.getLong(iW10)));
                    }
                    return s6n1Var;
                } finally {
                    d441VarG1.close();
                }
            case 5:
                tfa0 tfa0Var4 = (tfa0) obj;
                tfa0Var4.d = true;
                tfa0Var4.c = true;
                tfa0Var4.l = true;
                tfa0Var4.e = true;
                tfa0Var4.g = true;
                tfa0Var4.b = false;
                tfa0Var4.a = true;
                return rih1Var;
            default:
                return ((StackTraceElement) obj).toString();
        }
    }
}
