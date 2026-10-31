package p;

import java.util.RandomAccess;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cqq0 extends g7 implements RandomAccess {
    public final rhc[] a;
    public final int[] b;

    public cqq0(rhc[] rhcVarArr, int[] iArr) {
        this.a = rhcVarArr;
        this.b = iArr;
    }

    @Override // p.k6
    public final int b() {
        return this.a.length;
    }

    @Override // p.k6, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof rhc) {
            return super.contains((rhc) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.a[i];
    }

    @Override // p.g7, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof rhc) {
            return super.indexOf((rhc) obj);
        }
        return -1;
    }

    @Override // p.g7, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof rhc) {
            return super.lastIndexOf((rhc) obj);
        }
        return -1;
    }
}
