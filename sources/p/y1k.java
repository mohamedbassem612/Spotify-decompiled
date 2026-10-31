package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class y1k implements tcr {
    public final b291 a;

    public y1k(b291 b291Var) {
        this.a = b291Var;
    }

    @Override // p.tcr
    public final String a(String str) {
        Iterator<E> it = this.a.iterator();
        while (it.hasNext()) {
            str = ((tcr) it.next()).a(str);
        }
        return str;
    }
}
