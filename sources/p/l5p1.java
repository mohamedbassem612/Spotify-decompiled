package p;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class l5p1 extends r3p1 {
    public final /* synthetic */ u5p1 c;

    public l5p1(u5p1 u5p1Var) {
        this.c = u5p1Var;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        u5p1 u5p1Var = this.c;
        ulo1.w(i, u5p1Var.e);
        Object[] objArr = u5p1Var.d;
        int i2 = i + i;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.e;
    }
}
