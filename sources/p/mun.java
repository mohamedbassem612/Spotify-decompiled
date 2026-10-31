package p;

import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mun extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mun(byte b, int i, int i2) {
        super(1);
        this.a = b;
        this.b = i;
        this.c = i2;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        int i2 = this.b;
        switch (b) {
            case 0:
                kil kilVar = (kil) obj;
                kilVar.l(2131429062).e.e = i2;
                kilVar.l(2131429062).e.f = -1;
                kilVar.l(2131429062).e.g = -1.0f;
                kilVar.l(2131429061).e.f = i;
                kilVar.l(2131429061).e.e = -1;
                kilVar.l(2131429061).e.g = -1.0f;
                return rih1Var;
            case 1:
                return new qr80((((long) i2) << 32) | (((long) i) & 4294967295L));
            case 2:
                rtb0.b((rtb0) obj, i2, (iu30) null, new j2i(-1328816866, new yfv(i, (byte) 1), true), 6);
                return rih1Var;
            case 3:
                b261.l((e261) obj, new f4h(i2, i));
                return rih1Var;
            case 4:
                qhl qhlVar = (qhl) obj;
                qhlVar.setMarginStart(i2);
                ((ViewGroup.MarginLayoutParams) qhlVar).topMargin = i;
                ((ViewGroup.MarginLayoutParams) qhlVar).bottomMargin = i;
                return rih1Var;
            case 5:
                qtb0 qtb0Var = (qtb0) obj;
                int i3 = qtb0Var.p;
                int i4 = qtb0Var.q;
                int iMin = Math.min(i3 + i4, i2) - Math.max(i3, i);
                if (iMin < 0) {
                    iMin = 0;
                }
                return Boolean.valueOf((i4 > 0 ? ((float) iMin) / ((float) i4) : 0.0f) >= 0.5f);
            case 6:
                return new qr80((((long) i2) << 32) | (((long) i) & 4294967295L));
            default:
                qtb0 qtb0Var2 = (qtb0) obj;
                int i5 = qtb0Var2.p;
                int i6 = qtb0Var2.q;
                int iMin2 = Math.min(i5 + i6, i2) - Math.max(i5, i);
                if (iMin2 < 0) {
                    iMin2 = 0;
                }
                return Boolean.valueOf((i6 > 0 ? ((float) iMin2) / ((float) i6) : 0.0f) >= 0.9f);
        }
    }
}
