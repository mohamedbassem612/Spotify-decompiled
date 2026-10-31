package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nuh implements Iterator {
    public int a;
    public int b;
    public int c;
    public final /* synthetic */ ouh d;

    public nuh(ouh ouhVar) {
        this.d = ouhVar;
        this.a = ouhVar.d;
        this.b = ouhVar.isEmpty() ? -1 : 0;
        this.c = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        ouh ouhVar = this.d;
        if (ouhVar.d != this.a) {
            eg.d();
            return null;
        }
        if (!hasNext()) {
            hhg1.k();
            return null;
        }
        int i = this.b;
        this.c = i;
        Object obj = ouhVar.e()[i];
        int i2 = this.b + 1;
        if (i2 >= ouhVar.e) {
            i2 = -1;
        }
        this.b = i2;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        ouh ouhVar = this.d;
        if (ouhVar.d != this.a) {
            eg.d();
            return;
        }
        dm5.z(this.c >= 0, "no calls to next() since the last call to remove()");
        this.a += 32;
        ouhVar.remove(ouhVar.e()[this.c]);
        this.b--;
        this.c = -1;
    }
}
