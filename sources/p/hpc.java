package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hpc extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kpc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hpc(kpc kpcVar, byte b) {
        super(0);
        this.a = b;
        this.b = kpcVar;
    }

    public final Object invoke() {
        byte b = this.a;
        kpc kpcVar = this.b;
        switch (b) {
            case 0:
                kpcVar.b.T(new hb31());
                return rih1.a;
            case 1:
                return new rt01(kpcVar.b, kpcVar.e);
            default:
                return kpcVar.a();
        }
    }
}
