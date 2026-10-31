package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class oik0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t4h1 b;
    public final /* synthetic */ wik0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oik0(t4h1 t4h1Var, wik0 wik0Var, byte b) {
        super(0);
        this.a = b;
        this.b = t4h1Var;
        this.c = wik0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        boolean z = false;
        wik0 wik0Var = this.c;
        t4h1 t4h1Var = this.b;
        switch (b) {
            case 0:
                if (!((Boolean) ((mdt) t4h1Var.A.e).getValue()).booleanValue() && (wik0Var.b.U || !(t4h1Var.a.b.getValue() instanceof ryb))) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                if (!((Boolean) ((mdt) t4h1Var.A.e).getValue()).booleanValue() && (wik0Var.b.U || !(t4h1Var.a.b.getValue() instanceof ryb))) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
