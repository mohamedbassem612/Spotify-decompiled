package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class j390 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ exs b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j390(exs exsVar, byte b) {
        super(1);
        this.a = b;
        this.b = exsVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        z6x z6xVar = z6x.a;
        exs exsVar = this.b;
        switch (b) {
            case 0:
                kqg0 kqg0Var = exsVar.c;
                return kqg0Var == null ? z6xVar : new upa0(Collections.singletonList(kqg0Var), (byte) 20).e();
            default:
                kqg0 kqg0Var2 = exsVar.c;
                return kqg0Var2 == null ? z6xVar : new upa0(Collections.singletonList(kqg0Var2), (byte) 20).f();
        }
    }
}
