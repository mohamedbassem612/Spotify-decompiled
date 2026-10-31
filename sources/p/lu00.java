package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lu00 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Set b;
    public final /* synthetic */ Set c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lu00(Set set, Set set2, byte b) {
        super(1);
        this.a = b;
        this.b = set;
        this.c = set2;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Set set = this.c;
        Set set2 = this.b;
        switch (b) {
            case 0:
                qv00 qv00Var = (qv00) obj;
                if (!set2.isEmpty()) {
                    Set set3 = set2;
                    qv00Var.b(z1g1.class, o7h.l1(set3), false);
                    qv00Var.b(ldj1.class, o7h.l1(set3), false);
                }
                if (!set.isEmpty()) {
                    qv00Var.b(vy6.class, o7h.l1(set), false);
                }
                break;
            default:
                qv00 qv00Var2 = (qv00) obj;
                qv00Var2.b(l1z.class, set2, true);
                Set set4 = set;
                qv00Var2.b(jo70.class, set4, true);
                qv00Var2.b(w281.class, set4, true);
                qv00Var2.b(sdy.class, set4, true);
                qv00Var2.b(xkk1.class, set4, true);
                break;
        }
        return rih1Var;
    }
}
