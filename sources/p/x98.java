package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x98 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ucm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x98(ucm ucmVar, byte b) {
        super(1);
        this.a = b;
        this.b = ucmVar;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return new wcm(((cp11) obj).a, (String) null, (String) null, this.b, (Function0) null, vc7.Q0, false, (String) null, (String) null, 982);
            case 1:
                return new wcm(((cp11) obj).a, (String) null, (String) null, this.b, (Function0) null, lmm.c1, false, (String) null, (String) null, 982);
            default:
                return new wcm((String) obj, (String) null, (String) null, this.b, (Function0) null, fsm0.Y, false, (String) null, (String) null, 982);
        }
    }
}
