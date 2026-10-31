package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lss extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fp7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lss(fp7 fp7Var, byte b) {
        super(1);
        this.a = b;
        this.b = fp7Var;
    }

    public final Object invoke(Object obj) {
        int i;
        byte b = this.a;
        int i2 = 2131952997;
        fp7 fp7Var = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                Context context = fp7Var.a;
                if (fp7Var.b) {
                    if (iIntValue % 100 == 0) {
                        i = 2131953002;
                    } else {
                        i = iIntValue % 10 != 0 ? 2131953003 : 2131953004;
                    }
                    String string = context.getString(i, Float.valueOf(iIntValue / 100.0f));
                    string.getClass();
                    return string;
                }
                if (iIntValue % 100 == 0) {
                    String string2 = context.getString(2131953001, Float.valueOf(iIntValue / 100.0f));
                    string2.getClass();
                    return string2;
                }
                String string3 = context.getString(2131953000, Float.valueOf(iIntValue / 100.0f));
                string3.getClass();
                return string3;
            case 1:
                return fp7Var.a.getString(2131952997, Float.valueOf(((Number) obj).intValue() / 100.0f));
            default:
                int iIntValue2 = ((Number) obj).intValue();
                Context context2 = fp7Var.a;
                if (fp7Var.b) {
                    if (iIntValue2 % 100 == 0) {
                        i2 = 2131952998;
                    } else if (iIntValue2 % 10 != 0) {
                        i2 = 2131952999;
                    }
                    String string4 = context2.getString(i2, Float.valueOf(iIntValue2 / 100.0f));
                    string4.getClass();
                    return string4;
                }
                if (iIntValue2 % 100 == 0) {
                    String string5 = context2.getString(2131952998, Float.valueOf(iIntValue2 / 100.0f));
                    string5.getClass();
                    return string5;
                }
                String string6 = context2.getString(2131952997, Float.valueOf(iIntValue2 / 100.0f));
                string6.getClass();
                return string6;
        }
    }
}
