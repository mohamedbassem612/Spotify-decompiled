package p;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class aun1 extends rqn1 {
    public final /* synthetic */ eun1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aun1(eun1 eun1Var) {
        super((byte) 3);
        this.h = eun1Var;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        epo1.L(i, 1);
        Object[] objArr = (Object[]) this.h.t;
        int i2 = i + i;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public final int size() {
        return 1;
    }
}
