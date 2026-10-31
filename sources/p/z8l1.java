package p;

import java.lang.ref.WeakReference;
import java.util.function.Predicate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class z8l1 implements Predicate {
    public static final z8l1 b = new z8l1(0);
    public static final z8l1 c = new z8l1(1);
    public final /* synthetic */ byte a;

    public /* synthetic */ z8l1(byte b2) {
        this.a = b2;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                WeakReference weakReference = (WeakReference) obj;
                r091 r091Var = (r091) weakReference.get();
                return (r091Var != null && ((Boolean) r091Var.e.b.getValue()).booleanValue()) || weakReference.get() == null;
            default:
                return ((Boolean) ((r091) obj).e.b.getValue()).booleanValue();
        }
    }
}
