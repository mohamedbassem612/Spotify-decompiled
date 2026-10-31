package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fim extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ him b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fim(him himVar, byte b) {
        super(0);
        this.a = b;
        this.b = himVar;
    }

    public final Object invoke() {
        byte b = this.a;
        ixb ixbVar = ixb.c;
        rih1 rih1Var = rih1.a;
        him himVar = this.b;
        switch (b) {
            case 0:
                himVar.d.a(ixbVar);
                return rih1Var;
            case 1:
                himVar.d.a(ixb.a);
                return rih1Var;
            case 2:
                himVar.d.a(ixbVar);
                return rih1Var;
            default:
                btl1.a.getClass();
                int iHeight = gtv0.h().a(himVar.a).a().height();
                if (iHeight < 0) {
                    iHeight = 0;
                }
                return Integer.valueOf(iHeight);
        }
    }
}
