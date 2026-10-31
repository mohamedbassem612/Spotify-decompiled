package p;

import android.os.Bundle;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class h190 implements q6e0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public h190(bfd bfdVar, o190 o190Var, add addVar, kbd kbdVar, cks0 cks0Var, r3b1 r3b1Var, ttz ttzVar) {
        this.a = (byte) 0;
        this.b = new o6e0(new g190(o190Var, r3b1Var, cks0Var, addVar, bfdVar, kbdVar, ttzVar, null), f46.I(new p6e0[0]));
    }

    public final void a(Bundle bundle) {
        byte b = this.a;
    }

    public final Observable b() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((o6e0) obj).b();
            case 1:
                return yoi1.i((mr20) obj, o6x.a);
            default:
                return Observable.just(new f5e0(obj));
        }
    }

    public final Bundle serialize() {
        switch (this.a) {
        }
        return null;
    }

    private final void c(Bundle bundle) {
    }

    private final void d(Bundle bundle) {
    }

    private final void e(Bundle bundle) {
    }

    public /* synthetic */ h190(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
