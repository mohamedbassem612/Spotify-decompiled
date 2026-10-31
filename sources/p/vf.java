package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vf extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ j171 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vf(byte b, iu30 iu30Var, j171 j171Var) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = j171Var;
    }

    public final Object invoke() {
        byte b = this.a;
        j171 j171Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new l071(j171Var.j.f.a));
                return Boolean.TRUE;
            default:
                iu30Var.invoke(new l071(j171Var.j.f.a));
                return rih1.a;
        }
    }
}
