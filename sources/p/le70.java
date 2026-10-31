package p;

import android.util.SparseArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class le70 implements c670 {
    public final SparseArray a;

    public le70(SparseArray sparseArray) {
        this.a = sparseArray.clone();
    }

    @Override // p.c670
    public final n570 a(int i) {
        return (n570) this.a.get(i);
    }
}
