package p;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class j69 {
    public final /* synthetic */ byte a;

    public final Set a() {
        switch (this.a) {
            case 0:
                HashSet hashSet = new HashSet(1);
                Object obj = new Object[]{'<'}[0];
                Objects.requireNonNull(obj);
                if (hashSet.add(obj)) {
                    return Collections.unmodifiableSet(hashSet);
                }
                hhg1.n(gvg.g(obj, "duplicate element: "));
                return null;
            case 1:
                HashSet hashSet2 = new HashSet(1);
                Object obj2 = new Object[]{'\\'}[0];
                Objects.requireNonNull(obj2);
                if (hashSet2.add(obj2)) {
                    return Collections.unmodifiableSet(hashSet2);
                }
                hhg1.n(gvg.g(obj2, "duplicate element: "));
                return null;
            case 2:
                HashSet hashSet3 = new HashSet(1);
                Object obj3 = new Object[]{'`'}[0];
                Objects.requireNonNull(obj3);
                if (hashSet3.add(obj3)) {
                    return Collections.unmodifiableSet(hashSet3);
                }
                hhg1.n(gvg.g(obj3, "duplicate element: "));
                return null;
            case 3:
                HashSet hashSet4 = new HashSet(1);
                Object obj4 = new Object[]{'&'}[0];
                Objects.requireNonNull(obj4);
                if (hashSet4.add(obj4)) {
                    return Collections.unmodifiableSet(hashSet4);
                }
                hhg1.n(gvg.g(obj4, "duplicate element: "));
                return null;
            default:
                HashSet hashSet5 = new HashSet(1);
                Object obj5 = new Object[]{'<'}[0];
                Objects.requireNonNull(obj5);
                if (hashSet5.add(obj5)) {
                    return Collections.unmodifiableSet(hashSet5);
                }
                hhg1.n(gvg.g(obj5, "duplicate element: "));
                return null;
        }
    }
}
