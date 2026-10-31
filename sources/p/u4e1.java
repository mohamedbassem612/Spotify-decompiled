package p;

import android.content.ClipData;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class u4e1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z4e1 b;

    public /* synthetic */ u4e1(z4e1 z4e1Var, byte b) {
        this.a = b;
        this.b = z4e1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        String string;
        switch (this.a) {
            case 0:
                z4e1 z4e1Var = this.b;
                z4e1Var.L1();
                z4e1Var.S0.b();
                ClipData clipData = ((kmg) obj).a;
                int itemCount = clipData.getItemCount();
                boolean z = false;
                for (int i = 0; i < itemCount; i++) {
                    z = z || clipData.getItemAt(i).getText() != null;
                }
                if (z) {
                    StringBuilder sb = new StringBuilder();
                    int itemCount2 = clipData.getItemCount();
                    boolean z2 = false;
                    for (int i2 = 0; i2 < itemCount2; i2++) {
                        CharSequence text = clipData.getItemAt(i2).getText();
                        if (text != null) {
                            if (z2) {
                                sb.append("\n");
                            }
                            sb.append(text);
                            z2 = true;
                        }
                    }
                    string = sb.toString();
                } else {
                    string = null;
                }
                s3o1.r(z4e1Var);
                if (string != null) {
                    ggg1.m(z4e1Var.Q0, string, false, false, 30);
                }
                return Boolean.TRUE;
            default:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                z4e1 z4e1Var2 = this.b;
                fn31.T(z4e1Var2.v1(), null, 4, new hl1((woa0) obj, z4e1Var2, zBooleanValue, (lnm) null, (byte) 13), 1);
                return rih1.a;
        }
    }
}
