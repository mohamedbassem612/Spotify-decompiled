package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class i5n1 extends h5n1 {
    public static final i5n1 i = new i5n1(new Object[0]);
    public final transient Object[] h;

    public i5n1(Object[] objArr) {
        super((byte) 0);
        this.h = objArr;
    }

    @Override // p.h5n1
    public final int b(Object[] objArr) {
        System.arraycopy(this.h, 0, objArr, 0, 0);
        return 0;
    }

    public final Object[] e() {
        return this.h;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        ezn1.g(i2, 0);
        Object obj = this.h[i2];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return 0;
    }
}
