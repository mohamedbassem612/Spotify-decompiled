package p;

import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class p1k1 extends hab0 implements Function0 {
    public final /* synthetic */ frr0 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ ven0 c;
    public final /* synthetic */ ven0 d;
    public final /* synthetic */ vy30 e;
    public final /* synthetic */ ven0 f;
    public final /* synthetic */ ven0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1k1(frr0 frr0Var, long j, ven0 ven0Var, ven0 ven0Var2, vy30 vy30Var, ven0 ven0Var3, ven0 ven0Var4) {
        super(0);
        this.a = frr0Var;
        this.b = j;
        this.c = ven0Var;
        this.d = ven0Var2;
        this.e = vy30Var;
        this.f = ven0Var3;
        this.g = ven0Var4;
    }

    public final Object invoke() {
        p3u0 p3u0Var;
        long jS = this.a.s();
        long j = this.b - 100;
        if (j < 0) {
            j = 0;
        }
        if (jS > j) {
            jS = j;
        }
        ven0 ven0Var = this.c;
        uoa uoaVar = (uoa) ven0Var.getValue();
        if (uoaVar == null || !(this.d.getValue() instanceof vqj1)) {
            uoa uoaVar2 = (uoa) ven0Var.getValue();
            if (uoaVar2 != null && (p3u0Var = uoaVar2.f) != null) {
                p3u0Var.J0(jS, true);
            }
        } else {
            uoaVar.h(new o2u0(this.e.a, 14, (Map) null), new oot0(0L, 0L, false, false, (hu7) null, (tne1) null, false, 243));
            p3u0 p3u0Var2 = uoaVar.f;
            if (p3u0Var2 != null) {
                p3u0Var2.J0(jS, true);
            }
            uoaVar.l();
        }
        this.f.setValue(Boolean.FALSE);
        ven0 ven0Var2 = this.g;
        ven0Var2.setValue(Integer.valueOf(((Number) ven0Var2.getValue()).intValue() + 1));
        return rih1.a;
    }
}
