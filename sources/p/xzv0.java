package p;

import j$.time.LocalDate;
import j$.time.ZoneId;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xzv0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n0o b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xzv0(n0o n0oVar, byte b) {
        super(1);
        this.a = b;
        this.b = n0oVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        n0o n0oVar = this.b;
        switch (b) {
            case 0:
                oyv0 oyv0Var = (oyv0) obj;
                return new x010(d3p1.H(n0oVar.b, (o3r) n0oVar.X, oyv0Var), yoi1.g(((s4w0) n0oVar.i).b(oyv0Var.a)), new lok0(3, (lnm) null, (byte) 16), (byte) 1);
            case 1:
                oyv0 oyv0Var2 = (oyv0) obj;
                return new q0w0("", "", oyv0Var2.a, LocalDate.now((ZoneId) ((ynb0) n0oVar.f).get()), 0L, 0, false, oyv0Var2.b, false);
            default:
                ((kt91) n0oVar.e).a(new izv0((byte) 1));
                ((qtr) obj).b(new jaz(n0oVar, (lnm) null, (byte) 29));
                return rih1.a;
        }
    }
}
