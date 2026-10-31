package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class iqn1 extends c8 implements Serializable {
    public final Object b;
    public final yhn1 c;

    public iqn1(Object obj, yhn1 yhn1Var) {
        super((byte) 1, false);
        this.b = obj;
        this.c = yhn1Var;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.c;
    }

    @Override // p.c8, java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
