package p;

import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bzf {
    public final ajn0 a;
    public final se11 b;
    public final Collection c;
    public final iu30 d;
    public final htf[] e;

    public bzf(ajn0 ajn0Var, htf[] htfVarArr, iu30 iu30Var) {
        this(ajn0Var, null, null, iu30Var, (htf[]) Arrays.copyOf(htfVarArr, htfVarArr.length));
    }

    public /* synthetic */ bzf(ajn0 ajn0Var, htf[] htfVarArr) {
        this(ajn0Var, htfVarArr, ye3.O0);
    }

    public bzf(ajn0 ajn0Var, se11 se11Var, Collection collection, iu30 iu30Var, htf... htfVarArr) {
        this.a = ajn0Var;
        this.b = se11Var;
        this.c = collection;
        this.d = iu30Var;
        this.e = htfVarArr;
    }

    public /* synthetic */ bzf(Collection collection, htf[] htfVarArr) {
        this(collection, htfVarArr, ye3.Q0);
    }

    public bzf(Collection collection, htf[] htfVarArr, iu30 iu30Var) {
        this(null, null, collection, iu30Var, (htf[]) Arrays.copyOf(htfVarArr, htfVarArr.length));
    }
}
