package p;

import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v60 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jh5 b;
    public final /* synthetic */ LinkedHashSet c;
    public final /* synthetic */ w60 d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v60(jh5 jh5Var, LinkedHashSet linkedHashSet, w60 w60Var, Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = jh5Var;
        this.c = linkedHashSet;
        this.d = w60Var;
        this.e = obj;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                LinkedHashSet linkedHashSet = this.c;
                w60 w60Var = this.d;
                Object obj = this.e;
                jh5 jh5Var = this.b;
                synchronized (linkedHashSet) {
                    if (linkedHashSet.add(jh5Var)) {
                        w60Var.c.b.put(jh5Var, obj);
                    }
                    break;
                }
                return rih1.a;
            default:
                LinkedHashSet linkedHashSet2 = this.c;
                w60 w60Var2 = this.d;
                Object obj2 = this.e;
                jh5 jh5Var2 = this.b;
                synchronized (linkedHashSet2) {
                    if (linkedHashSet2.remove(jh5Var2)) {
                        w60Var2.c.a(jh5Var2, obj2);
                    }
                    break;
                }
                return rih1.a;
        }
    }
}
