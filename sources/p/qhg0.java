package p;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qhg0 extends hab0 implements Function0 {
    public final /* synthetic */ Set a;
    public final /* synthetic */ rhg0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ List d;
    public final /* synthetic */ List e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qhg0(Set set, rhg0 rhg0Var, int i, List list, List list2) {
        super(0);
        this.a = set;
        this.b = rhg0Var;
        this.c = i;
        this.d = list;
        this.e = list2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List list = this.d;
        int i = this.c;
        rhg0 rhg0Var = this.b;
        HashMap map = rhg0Var.c;
        try {
            for (f1r f1rVar : this.a) {
                phg0 phg0Var = (phg0) map.get(f1rVar);
                if (phg0Var != null) {
                    phg0Var.a(i);
                } else {
                    map.put(f1rVar, new phg0(rhg0Var.a.c(f1rVar), i, i));
                    if (list != null) {
                        list.add(f1rVar);
                    }
                }
            }
            r7h.Z(map.entrySet(), new wka(i, this.e), true);
            ukj0 ukj0Var = rhg0Var.b;
            return rih1.a;
        } catch (Throwable th) {
            r7h.Z(map.values(), new po60(i, (byte) 14), true);
            if (list != null) {
                list.clear();
            }
            throw th;
        }
    }
}
