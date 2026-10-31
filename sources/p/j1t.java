package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class j1t extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k1t b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1t(k1t k1tVar, byte b) {
        super(0);
        this.a = b;
        this.b = k1tVar;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                k1t k1tVar = this.b;
                return k1tVar.b.h().a(uj1.D, new wj1(k1tVar, (byte) 18));
            default:
                k1t k1tVar2 = this.b;
                return k1tVar2.h.a(k1tVar2.b, new wsr(1, k1tVar2, k1t.class, "onEvent", "onEvent(Lcom/spotify/yourlibrary/yourlibraryx/shared/domain/AllEvent;)V", 0, (byte) 29));
        }
    }
}
