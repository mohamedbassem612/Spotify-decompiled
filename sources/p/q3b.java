package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q3b extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t3b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q3b(t3b t3bVar, byte b) {
        super(0);
        this.a = b;
        this.b = t3bVar;
    }

    public final Object invoke() {
        byte b = this.a;
        t3b t3bVar = this.b;
        switch (b) {
            case 0:
                return ((g431) t3bVar.e.get()).a(uj1.j, new wj1(t3bVar, (byte) 4));
            case 1:
                t3bVar.d.j(t3bVar.b);
                return rih1.a;
            default:
                return new nu(t3bVar);
        }
    }
}
