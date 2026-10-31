package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bv61 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kv61 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bv61(kv61 kv61Var, byte b) {
        super(0);
        this.a = b;
        this.b = kv61Var;
    }

    public final Object invoke() {
        byte b = this.a;
        kv61 kv61Var = this.b;
        switch (b) {
            case 0:
                return (i0r0) kv61Var.f.get();
            case 1:
                return (g460) kv61Var.d.get();
            case 2:
                return (u9r0) kv61Var.h.get();
            case 3:
                return (w9r0) kv61Var.e.get();
            case 4:
                return (xlc1) kv61Var.c.get();
            default:
                return (igr0) kv61Var.g.get();
        }
    }
}
