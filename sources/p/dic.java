package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dic implements Iterator {
    public eic a;
    public int b;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.e.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        bic bicVar = (bic) this.a.e.get(this.b);
        this.b++;
        return bicVar;
    }
}
