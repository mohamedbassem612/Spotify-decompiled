package p;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lu2 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Set b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lu2(Set set, byte b) {
        super(1);
        this.a = b;
        this.b = set;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Set set = this.b;
        switch (b) {
            case 0:
                qv00 qv00Var = (qv00) obj;
                Set set2 = set;
                qv00Var.b(jo70.class, set2, false);
                qv00Var.b(xkk1.class, set2, false);
                return rih1Var;
            case 1:
                return Boolean.valueOf(((Map) obj).keySet().containsAll(set));
            case 2:
                return Boolean.valueOf(((Map) obj).keySet().containsAll(set));
            case 3:
                b261.y((e261) obj, !set.isEmpty());
                return rih1Var;
            case 4:
                ((qv00) obj).b(d7u0.class, set, false);
                return rih1Var;
            case 5:
                ((qv00) obj).b(wjf.class, set, false);
                return rih1Var;
            case 6:
                return set.contains(((ibr0) obj).a.getId()) ? new tq61(1.0f) : uq61.a;
            default:
                ((qv00) obj).b(upa1.class, set, false);
                return rih1Var;
        }
    }
}
