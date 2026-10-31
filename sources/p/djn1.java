package p;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class djn1 extends efn1 {
    public final /* synthetic */ tjn1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djn1(tjn1 tjn1Var) {
        super((byte) 1);
        this.h = tjn1Var;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        tjn1 tjn1Var = this.h;
        rno1.r(i, tjn1Var.t);
        Object[] objArr = tjn1Var.i;
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
