package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class liz0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ miz0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ liz0(miz0 miz0Var, byte b) {
        super(1);
        this.a = b;
        this.b = miz0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        miz0 miz0Var = this.b;
        switch (b) {
            case 0:
                fiz0 fiz0Var = (fiz0) jhc1.t((Bundle) obj, "QUIZ_GAMEPLAY_MODEL", fiz0.class);
                if (fiz0Var == null) {
                    String str = miz0Var.a.a;
                    jce jceVar = miz0Var.g;
                    fiz0Var = new fiz0(str, jceVar != null ? jceVar.b : null, jceVar != null ? jceVar.a : null);
                }
                return fiz0Var;
            default:
                cas casVar = (a7m0) obj;
                casVar.a = j8y0.Z0;
                casVar.a(lcz0.t, new liz0(miz0Var, (byte) 0));
                return rih1.a;
        }
    }
}
