package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class uh51 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x6e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uh51(x6e x6eVar, byte b) {
        super(1);
        this.a = b;
        this.b = x6eVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        x6e x6eVar = this.b;
        switch (b) {
            case 0:
                gfr0 gfr0Var = (gfr0) obj;
                return new s460(2, 994, gfr0Var.a, (String) null, ((Context) x6eVar.b).getString(2131954712), gfr0Var.b, false);
            default:
                return (s460) ((uh51) x6eVar.d).invoke((gfr0) obj);
        }
    }
}
