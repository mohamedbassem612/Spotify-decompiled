package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lhq0 extends x36 {
    public final ig5 a;
    public final int b;

    public lhq0(int i, ig5 ig5Var) {
        this.a = ig5Var;
        this.b = i;
    }

    @Override // p.x36
    public final int b() {
        return 1;
    }

    @Override // p.x36
    public final void c(int i, ig5 ig5Var) {
        throw new IllegalStateException();
    }

    @Override // p.x36
    public final Object get(int i) {
        if (i == this.b) {
            return this.a;
        }
        return null;
    }

    @Override // p.x36, java.lang.Iterable
    public final Iterator iterator() {
        return new khq0(this, (byte) 0);
    }
}
