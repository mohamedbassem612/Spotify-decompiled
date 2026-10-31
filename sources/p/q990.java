package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q990 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r990 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q990(r990 r990Var, byte b) {
        super(1);
        this.a = b;
        this.b = r990Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        r990 r990Var = this.b;
        switch (b) {
            case 0:
                String str = ((j990) obj).c;
                return str != null ? new zx60(yoi1.g(r990Var.b.d(Collections.singletonList(str))), (byte) 3) : new m441(new pk50(2, (lnm) null, (byte) 2));
            default:
                ((qtr) obj).b(new kr(r990Var, (lnm) null, (byte) 22));
                return rih1.a;
        }
    }
}
