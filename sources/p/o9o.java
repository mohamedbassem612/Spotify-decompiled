package p;

import android.view.KeyEvent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class o9o extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o9o(byte b, int i, iu30 iu30Var, boolean z) {
        super(1);
        this.a = b;
        this.b = z;
        this.c = i;
        this.d = iu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        boolean z = false;
        int i = 1;
        iu30 iu30Var = this.d;
        int i2 = this.c;
        boolean z2 = this.b;
        switch (b) {
            case 0:
                KeyEvent keyEvent = ((cpa0) obj).a;
                if (ern1.t(keyEvent) != 2 || !z2) {
                    return Boolean.FALSE;
                }
                long jD = mno1.d(keyEvent.getKeyCode());
                if (toa0.a(jD, toa0.g)) {
                    i = -1;
                } else if (!toa0.a(jD, toa0.h)) {
                    return Boolean.FALSE;
                }
                int iP = yoi1.p(i + i2, 0, 12);
                if (iP == i2) {
                    return Boolean.FALSE;
                }
                iu30Var.invoke(Integer.valueOf(iP));
                return Boolean.TRUE;
            default:
                float fFloatValue = ((Number) obj).floatValue();
                if (z2 && i2 != jch0.U(fFloatValue)) {
                    iu30Var.invoke(Integer.valueOf(jch0.U(fFloatValue)));
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
