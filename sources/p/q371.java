package p;

import io.reactivex.rxjava3.functions.Function;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class q371 implements Function {
    public final String a;
    public final String b;
    public final List c;

    public /* synthetic */ q371(String str, List list, String str2) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public Object apply(Object obj) {
        jdu0 jdu0Var = (jdu0) obj;
        long j = jdu0Var.h;
        Long lValueOf = Long.valueOf(jdu0Var.i);
        if (!u890.j(jdu0Var.c, this.b)) {
            lValueOf = null;
        }
        return o7h.d1(o7h.N0(this.c, Collections.singletonList(new kkt0(j, 0L, lValueOf != null ? lValueOf.longValue() : 0L, this.a, this.b))), 20);
    }
}
