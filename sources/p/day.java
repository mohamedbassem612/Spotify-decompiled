package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class day implements pf5 {
    public static final day a = new day();

    @Override // p.pf5
    public final Map a() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // p.pf5
    public final kf30 b() {
        beg begVarD = kht.d(this);
        if (begVarD != null) {
            if (bkz.e(begVarD)) {
                begVarD = null;
            }
            if (begVarD != null) {
                return kht.c(begVarD);
            }
        }
        return null;
    }

    @Override // p.pf5
    public final mka1 getSource() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // p.pf5
    public final a8b0 getType() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    public final String toString() {
        return "[EnhancedType]";
    }
}
