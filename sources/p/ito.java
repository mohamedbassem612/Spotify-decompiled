package p;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ito {
    public final String a;
    public final String b;
    public final snc0 c;
    public final LinkedHashMap d;
    public final Map e;
    public final fai0 f;
    public final ic9 g;
    public final boolean h;
    public final boolean i;
    public final b1c1 j;
    public final Function0 k;

    public ito(String str, String str2, snc0 snc0Var, LinkedHashMap linkedHashMap, Map map, fai0 fai0Var, ic9 ic9Var, boolean z, boolean z2, b1c1 b1c1Var, Function0 function0) {
        this.a = str;
        this.b = str2;
        this.c = snc0Var;
        this.d = linkedHashMap;
        this.e = map;
        this.f = fai0Var;
        this.g = ic9Var;
        this.h = z;
        this.i = z2;
        this.j = b1c1Var;
        this.k = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ito) {
            return u890.j(this.b, ((ito) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
