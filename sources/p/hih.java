package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hih extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ fih c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hih(iu30 iu30Var, fih fihVar, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = fihVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        fih fihVar = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new bih(fihVar.h));
                break;
            case 1:
                iu30Var.invoke(new zhh(fihVar.h));
                break;
            case 2:
                iu30Var.invoke(new yhh(fihVar.h));
                break;
            case 3:
                iu30Var.invoke(new aih(fihVar.h));
                break;
            case 4:
                iu30Var.invoke(new zhh(fihVar.h));
                break;
            case 5:
                iu30Var.invoke(new yhh(fihVar.h));
                break;
            default:
                iu30Var.invoke(new aih(fihVar.h));
                break;
        }
        return rih1Var;
    }
}
