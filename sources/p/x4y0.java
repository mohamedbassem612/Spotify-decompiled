package p;

import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x4y0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i5y0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x4y0(i5y0 i5y0Var, byte b) {
        super(0);
        this.a = b;
        this.b = i5y0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        i5y0 i5y0Var = this.b;
        switch (b) {
            case 0:
                return ((q940) i5y0Var.a.get()).a(i5y0Var.d);
            default:
                en10 en10Var = (en10) i5y0Var.e.getValue();
                return new jqg0((u601) en10Var.j.computeIfAbsent(o7h.p1(Collections.singletonList(q1y0.a)), new cn10(en10Var, (byte) 1)), new z5z(1, (byte) 8));
        }
    }
}
