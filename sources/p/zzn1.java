package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzn1 extends ewn1 {
    public final transient Object[] c;
    public final transient boolean d;

    /* JADX WARN: Multi-variable type inference failed */
    public zzn1(int i, Object[] objArr) {
        this.c = objArr;
        this.d = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        y3o1.l0(i, 1);
        Object obj = this.c[i + i + (this.d ? 1 : 0)];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 1;
    }
}
