package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zca0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pzw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zca0(pzw pzwVar, byte b) {
        super(0);
        this.a = b;
        this.b = pzwVar;
    }

    public final Object invoke() {
        byte b = this.a;
        pzw pzwVar = this.b;
        switch (b) {
            case 0:
                return n3o1.q(pzwVar).a(new yca0(pzwVar, (byte) 0), mx90.V0);
            default:
                return n3o1.q(pzwVar).a(new yca0(pzwVar, (byte) 1), mx90.W0);
        }
    }
}
