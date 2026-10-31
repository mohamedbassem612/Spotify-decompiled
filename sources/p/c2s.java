package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c2s extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d2s b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c2s(d2s d2sVar, byte b) {
        super(0);
        this.a = b;
        this.b = d2sVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d2s d2sVar = this.b;
        switch (b) {
            case 0:
                d2sVar.f.u();
                break;
            default:
                d2sVar.t.g();
                break;
        }
        return rih1Var;
    }
}
