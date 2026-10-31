package p;

import j$.time.Instant;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wbt0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zbt0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wbt0(zbt0 zbt0Var, byte b) {
        super(1);
        this.a = b;
        this.b = zbt0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        zbt0 zbt0Var = this.b;
        switch (b) {
            case 0:
                return new vbt0((String) zbt0Var.e.getValue(), (Instant) null, (String) null, (tbt0) null, (lax) null, 118);
            case 1:
                ((qtr) obj).b(new jaz(zbt0Var, (lnm) null, (byte) 24));
                return rih1Var;
            case 2:
                zbt0Var.d.b((gax) obj);
                return rih1Var;
            default:
                zbt0Var.d.b((gax) obj);
                return rih1Var;
        }
    }
}
