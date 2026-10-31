package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q1s extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x1s b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q1s(x1s x1sVar, byte b) {
        super(0);
        this.a = b;
        this.b = x1sVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        x1s x1sVar = this.b;
        switch (b) {
            case 0:
                x1sVar.a.finish();
                break;
            case 1:
                x1sVar.a.finish();
                break;
            case 2:
                x1sVar.a.finish();
                break;
            case 3:
                x1sVar.a.finish();
                break;
            case 4:
                x1sVar.Y.b(x1sVar.g.a(vww0.b).subscribe(new t1s(new q1s(x1sVar, (byte) 3), (byte) 0)));
                break;
            case 5:
                x1sVar.a.finish();
                break;
            default:
                x1sVar.a.finish();
                break;
        }
        return rih1Var;
    }
}
