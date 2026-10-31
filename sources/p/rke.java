package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rke extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ske b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rke(ske skeVar, byte b) {
        super(0);
        this.a = b;
        this.b = skeVar;
    }

    public final Object invoke() {
        byte b = this.a;
        ske skeVar = this.b;
        switch (b) {
            case 0:
                String str = (String) ((bpb1) skeVar.j.c).getValue();
                if (str != null) {
                    skeVar.i.a.set(str);
                }
                skeVar.c.a(ixb.c);
                return rih1.a;
            default:
                return v8r.q(skeVar.d.b);
        }
    }
}
