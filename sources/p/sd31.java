package p;

import java.util.Comparator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sd31 implements Comparator {
    public static final sd31 a = new sd31();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj2).compareTo((Comparable) obj);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return zmn0.a;
    }
}
