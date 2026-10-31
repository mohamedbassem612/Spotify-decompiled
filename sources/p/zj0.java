package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zj0 extends hab0 implements Function0 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ kes c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zj0(boolean z, iu30 iu30Var, kes kesVar) {
        super(0);
        this.a = z;
        this.b = iu30Var;
        this.c = kesVar;
    }

    public final Object invoke() {
        if (this.a) {
            this.b.invoke(new ta30(this.c.d.p()));
        }
        return rih1.a;
    }
}
