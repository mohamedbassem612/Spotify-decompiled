package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class of extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jkr0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ of(jkr0 jkr0Var, byte b) {
        super(0);
        this.a = b;
        this.b = jkr0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        jkr0 jkr0Var = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(jkr0Var.o() < jkr0Var.l() - 1);
            case 1:
                return Boolean.valueOf(jkr0Var.o() > 0);
            case 2:
                return Integer.valueOf(((err0) jkr0Var.d.c).s());
            case 3:
                return Integer.valueOf(jkr0Var.o());
            case 4:
                return Integer.valueOf(((err0) jkr0Var.d.c).s());
            case 5:
                return Integer.valueOf(((err0) jkr0Var.d.c).s());
            case 6:
                return Integer.valueOf(jkr0Var.o());
            case 7:
                return Integer.valueOf(jkr0Var.o());
            case 8:
                return Integer.valueOf(jkr0Var.o());
            case 9:
                return Integer.valueOf(((err0) jkr0Var.d.c).s());
            case 10:
                return Integer.valueOf(jkr0Var.o());
            case 11:
                return new mmr0(Boolean.valueOf(jkr0Var.k.b()), Integer.valueOf(jkr0Var.o()));
            case 12:
                return Integer.valueOf(jkr0Var.o());
            case 13:
                return Integer.valueOf(((err0) jkr0Var.d.c).s());
            case 14:
                return Integer.valueOf(((err0) jkr0Var.d.c).s());
            default:
                return Boolean.valueOf(jkr0Var.k.b());
        }
    }
}
