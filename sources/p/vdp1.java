package p;

import java.util.AbstractMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vdp1 extends d1p1 {
    public final /* synthetic */ ffp1 c;

    public vdp1(ffp1 ffp1Var) {
        this.c = ffp1Var;
    }

    public final /* synthetic */ Object get(int i) {
        gho1.u(i, 1);
        Object[] objArr = (Object[]) this.c.e;
        int i2 = i + i;
        Object obj = objArr[i2];
        obj.getClass();
        Object obj2 = objArr[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public final int size() {
        return 1;
    }
}
