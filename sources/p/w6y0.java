package p;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w6y0 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ ly50 b;
    public /* synthetic */ cxc0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w6y0(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = 3;
        ly50 ly50Var = (ly50) obj;
        cxc0 cxc0Var = (cxc0) obj2;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                w6y0 w6y0Var = new w6y0(i, lnmVar, (byte) 0);
                w6y0Var.b = ly50Var;
                w6y0Var.c = cxc0Var;
                return w6y0Var.invokeSuspend(rih1Var);
            default:
                w6y0 w6y0Var2 = new w6y0(i, lnmVar, (byte) 1);
                w6y0Var2.b = ly50Var;
                w6y0Var2.c = cxc0Var;
                return w6y0Var2.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        String string;
        switch (this.a) {
            case 0:
                ly50 ly50Var = this.b;
                cxc0 cxc0Var = this.c;
                hm5.M(obj);
                if (cxc0Var.a()) {
                    Map map = cxc0Var.f.q;
                    Set set = h4d0.a;
                    String str = (String) map.get("generation_status");
                    if (str == null || (string = ihc1.e1(str).toString()) == null) {
                        string = "";
                    }
                    if (qyo1.u(string).a()) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = true;
                }
                return ly50.a(ly50Var, iy50.b, true, false, 0, z, null, null, 236);
            default:
                ly50 ly50Var2 = this.b;
                cxc0 cxc0Var2 = this.c;
                hm5.M(obj);
                f7l1 f7l1VarA = cxc0Var2.f.x.a(f7l1.class);
                if ((f7l1VarA != null ? f7l1VarA.a : null) instanceof z6l1) {
                    return ly50.a(ly50Var2, iy50.a, false, false, 0, false, null, null, 252);
                }
                return null;
        }
    }
}
