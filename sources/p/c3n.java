package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c3n extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c3n(byte b, Object obj, iu30 iu30Var) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = obj;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                return iu30Var.invoke(obj);
            case 1:
                iu30Var.invoke(obj);
                return rih1Var;
            case 2:
                iu30Var.invoke(obj);
                return rih1Var;
            default:
                iu30Var.invoke(obj);
                return rih1Var;
        }
    }
}
