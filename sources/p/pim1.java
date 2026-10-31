package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pim1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ d490 b;
    public final /* synthetic */ ynb0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pim1(d490 d490Var, ynb0 ynb0Var) {
        super(0);
        this.b = d490Var;
        this.c = ynb0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ynb0 ynb0Var = this.c;
        d490 d490Var = this.b;
        switch (b) {
            case 0:
                rim1 rim1Var = (rim1) ynb0Var.get();
                xab1 xab1Var = rim1Var.f;
                if (xab1Var == null || !xab1Var.isActive()) {
                    rim1Var.f = fn31.T(rim1Var.e, (o8n) null, 0, new fkj1(rim1Var, (lnm) null, (byte) 27), 3);
                }
                d490Var.d.add((rim1) ynb0Var.get());
                break;
            default:
                d490Var.d.remove((rim1) ynb0Var.get());
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pim1(ynb0 ynb0Var, d490 d490Var) {
        super(0);
        this.c = ynb0Var;
        this.b = d490Var;
    }
}
