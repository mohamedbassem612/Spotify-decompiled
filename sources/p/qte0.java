package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qte0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ute0 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qte0(ute0 ute0Var, iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = ute0Var;
        this.c = iu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        byte b2 = 0;
        iu30 iu30Var = this.c;
        ute0 ute0Var = this.b;
        switch (b) {
            case 0:
                List list = (List) obj;
                return new tte0(ute0Var, iu30Var, ((Boolean) list.get(0)).booleanValue(), ((Boolean) list.get(1)).booleanValue());
            case 1:
                return new df41(new qte0(ute0Var, iu30Var, b2), x5d0.V0);
            default:
                return new tte0(ute0Var, iu30Var, false, true);
        }
    }
}
