package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uld1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n3z b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uld1(n3z n3zVar, byte b) {
        super(1);
        this.a = b;
        this.b = n3zVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        n3z n3zVar = this.b;
        switch (b) {
            case 0:
                return new mq50(n3zVar.a);
            case 1:
                return new iwh(n3zVar.a, 12, true);
            case 2:
                return Collections.singleton(n3zVar.a);
            case 3:
                return n3zVar.a;
            case 4:
                return Collections.singleton(n3zVar.a);
            case 5:
                return n3zVar.a;
            case 6:
                return new lty(n3zVar.a);
            case 7:
                return new qeh(n3zVar.a);
            default:
                return n3zVar.a;
        }
    }
}
