package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j5b1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n5b1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j5b1(n5b1 n5b1Var, byte b) {
        super(0);
        this.a = b;
        this.b = n5b1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        n5b1 n5b1Var = this.b;
        switch (b) {
            case 0:
                return (y610) n5b1Var.g.get();
            case 1:
                return (wjs0) n5b1Var.i.get();
            case 2:
                return (xgb0) n5b1Var.j.get();
            case 3:
                return (String) n5b1Var.h.get();
            case 4:
                return (qyh0) n5b1Var.f55p.get();
            case 5:
                return (d6b1) n5b1Var.c.get();
            case 6:
                return (d6b1) n5b1Var.m.get();
            case 7:
                return (od61) n5b1Var.l.get();
            case 8:
                return (uhh0) n5b1Var.d.get();
            default:
                return (ajh0) n5b1Var.e.get();
        }
    }
}
