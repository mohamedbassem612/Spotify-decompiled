package p;

import android.app.Application;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class j6n1 implements jly0 {
    public final /* synthetic */ byte a;
    public final jo80 b;
    public final jo80 c;
    public final jly0 d;

    public /* synthetic */ j6n1(ytw0 ytw0Var, jo80 jo80Var, jo80 jo80Var2, jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jo80Var;
        this.c = jo80Var2;
        this.d = jly0Var;
    }

    @Override // p.kly0
    public final Object get() {
        byte b = this.a;
        jly0 jly0Var = this.d;
        jo80 jo80Var = this.c;
        jo80 jo80Var2 = this.b;
        switch (b) {
            case 0:
                return new i6n1((Application) jo80Var2.a, (String) jo80Var.a, (c7n1) jly0Var.get());
            default:
                return new xdf0((Application) jo80Var2.a, (String) jo80Var.a, (c7n1) jly0Var.get(), (byte) 0);
        }
    }
}
