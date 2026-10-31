package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mou0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nou0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mou0(nou0 nou0Var, byte b) {
        super(1);
        this.a = b;
        this.b = nou0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        nou0 nou0Var = this.b;
        switch (b) {
            case 0:
                jou0 jou0Var = (jou0) obj;
                return new m9r0(d3p1.F(nou0Var.b, nou0Var.d, jou0Var), jou0Var, (byte) 17);
            default:
                return new qvc0(nou0Var.c, (c3d0) null, (Set) null, (mqz0) null, 14);
        }
    }
}
