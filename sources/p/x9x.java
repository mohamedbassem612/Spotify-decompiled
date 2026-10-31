package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x9x extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z9x b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x9x(z9x z9xVar, byte b) {
        super(0);
        this.a = b;
        this.b = z9xVar;
    }

    public final Object invoke() {
        byte b = this.a;
        z9x z9xVar = this.b;
        switch (b) {
            case 0:
                return z9xVar.b.a(z9xVar.e);
            default:
                return z9xVar.c.b.a.h() ? nik1.G2.a : nik1.F2.a;
        }
    }
}
