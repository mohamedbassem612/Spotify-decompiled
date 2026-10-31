package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dit implements Function0 {
    public final /* synthetic */ byte a;
    public final eit b;
    public final fit c;

    public /* synthetic */ dit(eit eitVar, fit fitVar, byte b) {
        this.a = b;
        this.b = eitVar;
        this.c = fitVar;
    }

    public final Object invoke() {
        byte b = this.a;
        fit fitVar = this.c;
        eit eitVar = this.b;
        switch (b) {
            case 0:
                return dm61.y0(eitVar.a.keySet(), fitVar.o());
            default:
                return dm61.y0(eitVar.b.keySet(), fitVar.p());
        }
    }
}
