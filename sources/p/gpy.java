package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gpy extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mpy b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gpy(mpy mpyVar, iu30 iu30Var, boolean z, byte b) {
        super(0);
        this.a = b;
        this.b = mpyVar;
        this.c = iu30Var;
        this.d = z;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        kpy kpyVar = kpy.g;
        boolean z = this.d;
        mpy mpyVar = this.b;
        iu30 iu30Var = this.c;
        switch (b) {
            case 0:
                if (!mpyVar.f) {
                    iu30Var.invoke(kpy.b);
                } else if (z) {
                    iu30Var.invoke(kpyVar);
                }
                break;
            default:
                if (!mpyVar.f) {
                    iu30Var.invoke(kpy.c);
                } else if (z) {
                    iu30Var.invoke(kpyVar);
                }
                break;
        }
        return rih1Var;
    }
}
