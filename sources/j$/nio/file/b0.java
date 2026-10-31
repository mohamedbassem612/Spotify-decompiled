package j$.nio.file;

import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class b0 implements Iterable {
    public final Iterable a;

    public b0(Iterable iterable) {
        this.a = iterable;
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        this.a.forEach(new z(consumer, (byte) 1));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new c0(this.a.iterator());
    }
}
