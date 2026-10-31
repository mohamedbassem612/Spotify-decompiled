package p;

import io.reactivex.rxjava3.core.Flowable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fhh0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s24 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fhh0(s24 s24Var, byte b) {
        super(0);
        this.a = b;
        this.b = s24Var;
    }

    public final Object invoke() {
        byte b = this.a;
        s24 s24Var = this.b;
        switch (b) {
            case 0:
                nn61 nn61Var = (nn61) s24Var.i;
                return new o791((Flowable) s24Var.d, (uu00) nn61Var.b, (uvy) nn61Var.c);
            default:
                r961 r961Var = (r961) s24Var.g;
                return new yp91((Flowable) ((idd1) s24Var.Y).getValue(), (uvy) r961Var.b, (yu4) r961Var.c, (q8n) r961Var.d);
        }
    }
}
