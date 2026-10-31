package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mck extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ hdk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mck(iu30 iu30Var, hdk hdkVar, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = hdkVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        hdk hdkVar = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new zck(hdkVar.i));
                break;
            case 1:
                iu30Var.invoke(new zck(hdkVar.i));
                break;
            default:
                iu30Var.invoke(new zck(hdkVar.i));
                break;
        }
        return rih1Var;
    }
}
