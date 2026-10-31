package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dzg0 extends hab0 implements Function0 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzg0(boolean z, boolean z2, ven0 ven0Var) {
        super(0);
        this.a = z;
        this.b = z2;
        this.c = ven0Var;
    }

    public final Object invoke() {
        if (!this.a || this.b) {
            this.c.setValue(Boolean.FALSE);
        }
        return rih1.a;
    }
}
