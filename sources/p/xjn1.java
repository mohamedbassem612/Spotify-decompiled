package p;

import android.app.Activity;
import android.content.Context;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xjn1 extends kz40 {
    public final Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xjn1(Context context, jz40 jz40Var, byte b) {
        super(context, (Activity) null, thl1.a, shl1.a, jz40Var);
        switch (b) {
            case 1:
                super(context, (Activity) null, thl1.a, shl1.a, jz40Var);
                this.l = new zdn1();
                break;
            default:
                this.l = new p9n1();
                break;
        }
    }

    public hfp1 f() {
        Objects.requireNonNull((p9n1) this.l);
        j8n1 j8n1Var = ((kz40) this).i;
        ywn1 ywn1Var = new ywn1(j8n1Var, (byte) 2);
        j8n1Var.a.d(0, ywn1Var);
        return ezn1.u(ywn1Var, kuw0.Y);
    }

    public hfp1 g() {
        Objects.requireNonNull((zdn1) this.l);
        j8n1 j8n1Var = ((kz40) this).i;
        ywn1 ywn1Var = new ywn1(j8n1Var, (byte) 1);
        j8n1Var.a.d(0, ywn1Var);
        return ezn1.u(ywn1Var, cen1.c);
    }
}
