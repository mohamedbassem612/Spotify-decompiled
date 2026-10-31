package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jg31 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s880 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jg31(s880 s880Var, byte b) {
        super(0);
        this.a = b;
        this.b = s880Var;
    }

    public final Object invoke() {
        byte b = this.a;
        s880 s880Var = this.b;
        switch (b) {
            case 0:
                sgq sgqVar = (sgq) s880Var.d;
                d0r d0rVar = (d0r) s880Var.b;
                thq thqVar = sgqVar.a;
                return new bs40(d0rVar, (add) thqVar.b.Ge.get(), (m8p) thqVar.c.a.Sf.get());
            case 1:
                thq thqVar2 = ((tgq) s880Var.e).a;
                teq teqVar = thqVar2.c;
                lzn0 lzn0Var = (lzn0) teqVar.i.get();
                q9i0 q9i0Var = (q9i0) teqVar.va.get();
                daq daqVar = thqVar2.b;
                return new wmh0(lzn0Var, q9i0Var, (kt91) daqVar.f8.get(), (q8n) daqVar.V2.get());
            default:
                return ((awb1) s880Var.c).a((d0r) s880Var.b);
        }
    }
}
