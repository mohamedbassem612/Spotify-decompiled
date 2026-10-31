package p;

import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pu9 implements gs31 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ it80 b;

    public /* synthetic */ pu9(it80 it80Var, byte b) {
        this.a = b;
        this.b = it80Var;
    }

    @Override // p.gs31
    public final void a(Intent intent, th61 th61Var) {
        byte b = this.a;
        ru9 ru9Var = this.b;
        switch (b) {
            case 0:
                ru9.b(ru9Var).a();
                break;
            default:
                in60 in60Var = (in60) ru9Var;
                Intent intentB = in60Var.b(intent);
                if (intentB != null) {
                    in60Var.b.a(intentB);
                }
                break;
        }
    }
}
