package p;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fh30 implements bh0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ th30 b;

    public /* synthetic */ fh30(ai30 ai30Var, byte b) {
        this.a = b;
        this.b = ai30Var;
    }

    public final void a(Object obj) {
        byte b = this.a;
        th30 th30Var = this.b;
        switch (b) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                }
                mh30 mh30Var = (mh30) th30Var.H.pollFirst();
                if (mh30Var != null) {
                    th30Var.c.n(mh30Var.a);
                    break;
                }
                break;
            default:
                ah0 ah0Var = (ah0) obj;
                mh30 mh30Var2 = (mh30) th30Var.H.pollFirst();
                if (mh30Var2 != null) {
                    String str = mh30Var2.a;
                    int i2 = mh30Var2.b;
                    zf30 zf30VarN = th30Var.c.n(str);
                    if (zf30VarN != null) {
                        zf30VarN.u0(i2, ah0Var.a, ah0Var.b);
                        break;
                    }
                }
                break;
        }
    }
}
