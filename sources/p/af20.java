package p;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class af20 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bf20 b;
    public final /* synthetic */ ArrayList c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ af20(bf20 bf20Var, ArrayList arrayList, byte b) {
        super(1);
        this.a = b;
        this.b = bf20Var;
        this.c = arrayList;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ArrayList arrayList = this.c;
        bf20 bf20Var = this.b;
        switch (b) {
            case 0:
                en31 en31Var = bf20Var.a;
                Set setP1 = o7h.p1((List) qyo1.x(en31Var, true, false, new z5z(1, (byte) 11)));
                qyo1.x(en31Var, false, true, new af20(bf20Var, arrayList, (byte) 1));
                ArrayList<ye20> arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (setP1.contains(((ye20) obj2).a)) {
                        arrayList2.add(obj2);
                    }
                }
                for (ye20 ye20Var : arrayList2) {
                    qyo1.x(en31Var, false, true, new gu2(ye20Var.b, ye20Var.c, ye20Var.a, (byte) 18));
                }
                break;
            default:
                bf20Var.b.E((y341) obj, arrayList);
                break;
        }
        return rih1Var;
    }
}
