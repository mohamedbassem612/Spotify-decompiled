package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dcy extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ecy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dcy(ecy ecyVar, byte b) {
        super(0);
        this.a = b;
        this.b = ecyVar;
    }

    public final Object invoke() {
        byte b = this.a;
        ecy ecyVar = this.b;
        switch (b) {
            case 0:
                return (zby) o7h.t0(0, ecyVar.a);
            case 1:
                return (zby) o7h.t0(3, ecyVar.a);
            case 2:
                return (zby) o7h.t0(1, ecyVar.a);
            default:
                return (zby) o7h.t0(2, ecyVar.a);
        }
    }
}
