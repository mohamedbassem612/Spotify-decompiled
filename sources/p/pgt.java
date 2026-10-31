package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pgt implements Function0 {
    public final /* synthetic */ byte a;
    public final rgt b;

    public /* synthetic */ pgt(rgt rgtVar, byte b) {
        this.a = b;
        this.b = rgtVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rgt rgtVar = this.b;
        switch (b) {
            case 0:
                return rgtVar.C(rgtVar.b);
            default:
                return rgtVar;
        }
    }
}
