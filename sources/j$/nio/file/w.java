package j$.nio.file;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class w implements Iterator {
    public int a = 0;
    public final /* synthetic */ Path b;

    public w(Path path) {
        this.b = path;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.getNameCount();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a >= this.b.getNameCount()) {
            throw new NoSuchElementException();
        }
        Path name = this.b.getName(this.a);
        this.a++;
        return name;
    }
}
