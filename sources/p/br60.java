package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class br60 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c9n b;
    public final /* synthetic */ sfx0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ br60(c9n c9nVar, sfx0 sfx0Var, byte b) {
        super(0);
        this.a = b;
        this.b = c9nVar;
        this.c = sfx0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        sfx0 sfx0Var = this.c;
        c9n c9nVar = this.b;
        switch (b) {
            case 0:
                fn31.T(c9nVar, (o8n) null, 0, new ar60(sfx0Var, null, (byte) 0), 3);
                break;
            default:
                fn31.T(c9nVar, (o8n) null, 0, new ar60(sfx0Var, null, (byte) 1), 3);
                break;
        }
        return rih1Var;
    }
}
