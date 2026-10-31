package p;

import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xre0 implements Iterable {
    public final ArrayDeque a = new ArrayDeque();

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }
}
