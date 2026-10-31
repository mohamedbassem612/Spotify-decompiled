package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class rnm0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bbc b;

    public /* synthetic */ rnm0(bbc bbcVar, byte b) {
        this.a = b;
        this.b = bbcVar;
    }

    public final Object invoke() {
        byte b = this.a;
        bbc bbcVar = this.b;
        switch (b) {
            case 0:
                return (snm0) qge.b(bbcVar.x());
            default:
                return (j3g1) qge.b(bbcVar.x());
        }
    }
}
