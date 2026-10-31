package p;

import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xq60 implements Function {
    public final List a;

    public xq60() {
        this.a = p7h.M(new u26[]{new u26((byte) 1), new u26((byte) 0), new u26((byte) 2), new u26((byte) 3), new u26((byte) 4)});
    }

    public Object apply(Object obj) {
        ArrayList<rh90> arrayListB = qnv0.b((mh90) obj);
        ArrayList arrayList = new ArrayList();
        for (rh90 rh90Var : arrayListB) {
            String str = rh90Var.b;
            yge ygeVar = rh90Var.e;
            mmq0 mmq0VarJ = wm5.J(str);
            mmr0 mmr0Var = null;
            if (mmq0VarJ != null) {
                if (!this.a.contains(mmq0VarJ)) {
                    mmq0VarJ = null;
                }
                if (mmq0VarJ != null) {
                    Boolean bool = ygeVar.b;
                    Boolean bool2 = Boolean.TRUE;
                    mmr0Var = new mmr0(mmq0VarJ, new rmq0(u890.j(bool, bool2), u890.j(ygeVar.a, bool2)));
                }
            }
            if (mmr0Var != null) {
                arrayList.add(mmr0Var);
            }
        }
        return sqg0.T(arrayList);
    }

    public xq60(qnv0 qnv0Var, List list) {
        this.a = list;
    }

    public xq60(List list) {
        this.a = list;
    }
}
