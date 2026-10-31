package p;

import java.util.Comparator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fpj1 implements Comparator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fpj1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                int iCompare = ((epj1) obj3).compare(obj, obj2);
                return iCompare != 0 ? iCompare : pap1.t(Integer.valueOf(((apj1) obj).a), Integer.valueOf(((apj1) obj2).a));
            default:
                kl1 kl1Var = (kl1) obj3;
                LinkedHashMap linkedHashMap = (LinkedHashMap) kl1Var.c;
                jen0 jen0Var = (jen0) linkedHashMap.get((rl7) obj);
                if (jen0Var != null) {
                    Float fValueOf = Float.valueOf(Math.abs(jen0Var.c() - ((jen0) kl1Var.d).c()));
                    jen0 jen0Var2 = (jen0) linkedHashMap.get((rl7) obj2);
                    if (jen0Var2 != null) {
                        return pap1.t(fValueOf, Float.valueOf(Math.abs(jen0Var2.c() - ((jen0) kl1Var.d).c())));
                    }
                }
                hhg1.n("Required value was null.");
                return 0;
        }
    }
}
