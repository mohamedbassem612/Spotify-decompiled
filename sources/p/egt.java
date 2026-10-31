package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class egt implements Function0 {
    public final /* synthetic */ byte a;
    public final ggt b;

    public /* synthetic */ egt(ggt ggtVar, byte b) {
        this.a = b;
        this.b = ggtVar;
    }

    public final Object invoke() {
        byte b = this.a;
        ggt ggtVar = this.b;
        switch (b) {
            case 0:
                return new fgt(ggtVar);
            default:
                return u1p1.u(ggtVar, ggtVar.y());
        }
    }
}
