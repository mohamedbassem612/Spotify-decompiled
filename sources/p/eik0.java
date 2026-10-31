package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class eik0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wik0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eik0(wik0 wik0Var, byte b) {
        super(0);
        this.a = b;
        this.b = wik0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        wik0 wik0Var = this.b;
        switch (b) {
            case 0:
                wik0Var.h.invoke(new i4k0(wik0Var.f.q().a.a));
                break;
            default:
                wik0Var.h.invoke(new m3k0(wik0Var.f.p().a.a));
                break;
        }
        return rih1Var;
    }
}
