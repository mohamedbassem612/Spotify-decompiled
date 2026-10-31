package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vps0 extends aa implements v380 {
    public final eps0 a;

    public vps0(eps0 eps0Var) {
        this.a = eps0Var;
    }

    public final int b() {
        return this.a.c;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        kug1 kug1Var = this.a.b;
        mug1[] mug1VarArr = new mug1[8];
        for (int i = 0; i < 8; i++) {
            mug1VarArr[i] = new pug1();
        }
        return new wps0(kug1Var, mug1VarArr);
    }
}
