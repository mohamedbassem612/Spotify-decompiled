package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wka extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ List c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wka(int i, List list) {
        super(1);
        this.b = i;
        this.c = list;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        List list = this.c;
        int i = this.b;
        switch (b) {
            case 0:
                v8r.u((kd31) obj, ((Number) ((tob1) list.get(i)).getValue()).floatValue());
                return rih1.a;
            default:
                Map.Entry entry = (Map.Entry) obj;
                f1r f1rVar = (f1r) entry.getKey();
                phg0 phg0Var = (phg0) entry.getValue();
                boolean z = phg0Var.b != i;
                Boolean boolValueOf = Boolean.valueOf(z);
                if (z) {
                    phg0Var.a.dispose();
                    if (list != null) {
                        list.add(f1rVar);
                    }
                }
                return boolValueOf;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wka(List list, int i) {
        super(1);
        this.c = list;
        this.b = i;
    }
}
