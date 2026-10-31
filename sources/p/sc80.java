package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sc80 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s24 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sc80(s24 s24Var, byte b) {
        super(1);
        this.a = b;
        this.b = s24Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        s24 s24Var = this.b;
        switch (b) {
            case 0:
                break;
        }
        return new qvc0(((cbk0) s24Var.c).a, null, Collections.singleton(new hrc0((String) obj)), null, 10);
    }
}
