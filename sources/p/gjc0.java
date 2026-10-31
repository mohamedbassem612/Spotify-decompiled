package p;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gjc0 implements Iterator, ola0 {
    public String a;
    public boolean b;
    public final /* synthetic */ hjc0 c;

    public gjc0(hjc0 hjc0Var) {
        this.c = hjc0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        String line = this.a;
        if (line == null && !this.b) {
            line = this.c.a.readLine();
            this.a = line;
            if (line == null) {
                this.b = true;
            }
        }
        return line != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            hhg1.k();
            return null;
        }
        String str = this.a;
        this.a = null;
        str.getClass();
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
