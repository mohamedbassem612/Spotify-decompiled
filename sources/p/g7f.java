package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g7f extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h7f b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g7f(h7f h7fVar, byte b) {
        super(0);
        this.a = b;
        this.b = h7fVar;
    }

    public final Object invoke() {
        byte b = this.a;
        h7f h7fVar = this.b;
        switch (b) {
            case 0:
                return new ovk0(new uvk0(h7fVar.Y));
            case 1:
                return h7fVar.h.create();
            default:
                j3r j3rVar = rzq.y;
                return l2p1.f(new w1k(new l2r[]{h7fVar.f, h7fVar.g}));
        }
    }
}
