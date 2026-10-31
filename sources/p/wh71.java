package p;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wh71 {
    public final q8n a;
    public final dt71 b = mgo1.e(0, 0, 0, 7);

    public wh71(q8n q8nVar) {
        this.a = q8nVar;
    }

    public final Object a(l771 l771Var, lnm lnmVar) {
        Object objEmit = this.b.emit(l771Var, lnmVar);
        return objEmit == d9n.a ? objEmit : rih1.a;
    }

    public final mr20 b(uh71... uh71VarArr) {
        ArrayList arrayList = new ArrayList(uh71VarArr.length);
        for (uh71 uh71Var : uh71VarArr) {
            arrayList.add(new zo51(new evz(this.b, uh71Var.a, (byte) 12), uh71Var, (byte) 14));
        }
        mr20[] mr20VarArr = (mr20[]) arrayList.toArray(new mr20[0]);
        return o4p1.r(hu20.d((mr20[]) Arrays.copyOf(mr20VarArr, mr20VarArr.length)), this.a);
    }
}
