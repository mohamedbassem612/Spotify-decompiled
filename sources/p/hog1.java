package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hog1 implements gog1 {
    public final Set a;
    public final s29 b;
    public final jog1 c;

    public hog1(Set set, s29 s29Var, jog1 jog1Var) {
        this.a = set;
        this.b = s29Var;
        this.c = jog1Var;
    }

    public final iog1 a(String str, bbx bbxVar, jgg1 jgg1Var) {
        Set set = this.a;
        if (set.contains(bbxVar)) {
            return new iog1(this.b, str, bbxVar, jgg1Var, this.c);
        }
        k220.q("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{bbxVar, set});
        return null;
    }
}
