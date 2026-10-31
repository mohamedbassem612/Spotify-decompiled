package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ibz extends hab0 implements Function0 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ iix0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibz(boolean z, float f, iix0 iix0Var) {
        super(0);
        this.a = z;
        this.b = f;
        this.c = iix0Var;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001d  */
    public final Object invoke() {
        boolean z;
        if (this.a) {
            z = true;
        } else {
            float f = this.b;
            if (f <= 0.0f || (f >= 1.0d && this.c.g())) {
                z = false;
            } else {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
