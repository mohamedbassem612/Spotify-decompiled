package p;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public class nht implements fg5 {
    public static final /* synthetic */ mma0[] b = {new cey0(nht.class, "annotations", "getAnnotations()Ljava/util/List;", 0)};
    public final toe0 a;

    public nht(s1c1 s1c1Var, Function0 function0) {
        this.a = new toe0((voe0) s1c1Var, function0);
    }

    @Override // p.fg5
    public final pf5 F(kf30 kf30Var) {
        Object next;
        Iterator it = iterator();
        while (it.hasNext()) {
            next = it.next();
            if (u890.j(((pf5) next).b(), kf30Var)) {
                return (pf5) next;
            }
        }
        next = null;
        return (pf5) next;
    }

    @Override // p.fg5
    public final boolean d0(kf30 kf30Var) {
        return F(kf30Var) != null;
    }

    @Override // p.fg5
    public boolean isEmpty() {
        mma0 mma0Var = b[0];
        return ((List) this.a.invoke()).isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        mma0 mma0Var = b[0];
        return ((List) this.a.invoke()).iterator();
    }
}
