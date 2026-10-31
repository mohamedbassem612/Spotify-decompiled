package p;

import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jcn0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ poj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jcn0(poj0 poj0Var, byte b) {
        super(0);
        this.a = b;
        this.b = poj0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        poj0 poj0Var = this.b;
        switch (b) {
            case 0:
                return ((q940) ((kly0) poj0Var.b).get()).a((ced0) poj0Var.c);
            default:
                return ((en10) ((idd1) poj0Var.d).getValue()).b(Collections.singletonList(fcn0.c));
        }
    }
}
