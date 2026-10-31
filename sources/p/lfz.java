package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lfz extends mfz implements Serializable {
    public static final lfz a = new lfz();

    private Object readResolve() {
        return a;
    }

    @Override // p.mfz
    public final boolean a(Object obj, Object obj2) {
        return false;
    }

    @Override // p.mfz
    public final int b(Object obj) {
        return System.identityHashCode(obj);
    }
}
