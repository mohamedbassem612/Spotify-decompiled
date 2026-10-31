package p;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hjo1 extends yho1 {
    public final /* synthetic */ kjo1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hjo1(kjo1 kjo1Var) {
        super((byte) 4);
        this.h = kjo1Var;
    }

    public final /* synthetic */ Object get(int i) {
        kjo1 kjo1Var = this.h;
        eio1.E(i, kjo1Var.t);
        Object[] objArr = kjo1Var.i;
        int i2 = i + i;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public final int size() {
        return this.h.t;
    }
}
