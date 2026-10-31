package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mop0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x6e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mop0(x6e x6eVar, byte b) {
        super(1);
        this.a = b;
        this.b = x6eVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        x6e x6eVar = this.b;
        switch (b) {
            case 0:
                return new cop0(((l1o) x6eVar.c).a, (String) x6eVar.d);
            default:
                return Collections.singleton(((l1o) x6eVar.c).a);
        }
    }
}
