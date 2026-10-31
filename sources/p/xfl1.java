package p;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xfl1 implements Iterable {
    public final HashSet a = new HashSet();

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        wfl1 wfl1Var = new wfl1();
        wfl1Var.a = this.a.iterator();
        return wfl1Var;
    }
}
