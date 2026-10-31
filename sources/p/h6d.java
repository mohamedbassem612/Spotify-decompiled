package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class h6d extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ scx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h6d(iu30 iu30Var, scx scxVar, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = scxVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        scx scxVar = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke("information_incorrect");
                scxVar.a();
                break;
            default:
                iu30Var.invoke("artist_image_problem");
                scxVar.a();
                break;
        }
        return rih1Var;
    }
}
