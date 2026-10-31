package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g501 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i501 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g501(i501 i501Var, byte b) {
        super(1);
        this.a = b;
        this.b = i501Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        i501 i501Var = this.b;
        switch (b) {
            case 0:
                u501 u501Var = (u501) obj;
                iu30 iu30Var = i501Var.b2;
                if (iu30Var == null) {
                    u890.C("onEvent");
                    throw null;
                }
                iu30Var.invoke(u501Var);
                i501Var.dismiss();
                return rih1Var;
            default:
                rtb0 rtb0Var = (rtb0) obj;
                List list = i501Var.a2;
                if (list != null) {
                    rtb0Var.e(list.size(), (iu30) null, new h501(list, (byte) 0), new j2i(802480018, new ot(list, i501Var, (byte) 16), true));
                    return rih1Var;
                }
                u890.C("reactions");
                throw null;
        }
    }
}
