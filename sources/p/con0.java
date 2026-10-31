package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class con0 implements Iterator, ola0 {
    public int a = -1;
    public boolean b;
    public final /* synthetic */ don0 c;

    public con0(don0 don0Var) {
        this.c = don0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a + 1 < this.c.Y.g();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            hhg1.k();
            return null;
        }
        this.b = true;
        ina1 ina1Var = this.c.Y;
        int i = this.a + 1;
        this.a = i;
        return (vnn0) ina1Var.h(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.b) {
            eg.m("You must call next() before you can remove an element");
            return;
        }
        ina1 ina1Var = this.c.Y;
        ((vnn0) ina1Var.h(this.a)).b = null;
        int i = this.a;
        Object[] objArr = ina1Var.c;
        Object obj = objArr[i];
        Object obj2 = dio1.a;
        if (obj != obj2) {
            objArr[i] = obj2;
            ina1Var.a = true;
        }
        this.a = i - 1;
        this.b = false;
    }
}
