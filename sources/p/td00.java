package p;

import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class td00 {
    public final nav[] a;

    public td00() {
        LinkedHashMap linkedHashMap = qd00.b;
        int iS = s3o1.s();
        nav[] navVarArr = new nav[iS];
        for (int i = 0; i < iS; i++) {
            nav navVar = new nav();
            navVar.a = 0L;
            navVar.b = 0L;
            navVarArr[i] = navVar;
        }
        this.a = navVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return td00.class.equals(obj != null ? obj.getClass() : null) && Arrays.equals(this.a, ((td00) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }
}
