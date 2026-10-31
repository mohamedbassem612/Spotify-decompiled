package p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kjo1 extends iio1 {
    public final transient mmn1 h;
    public final transient Object[] i;
    public final transient int t;

    public kjo1(mmn1 mmn1Var, Object[] objArr, int i) {
        super((byte) 4);
        this.h = mmn1Var;
        this.i = objArr;
        this.t = i;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.h.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        yho1 yho1VarT = this.g;
        if (yho1VarT == null) {
            yho1VarT = t();
            this.g = yho1VarT;
        }
        return yho1VarT.r(0);
    }

    public final int o(Object[] objArr) {
        yho1 yho1VarT = this.g;
        if (yho1VarT == null) {
            yho1VarT = t();
            this.g = yho1VarT;
        }
        return yho1VarT.o(objArr);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.t;
    }

    public final yho1 t() {
        return new hjo1(this);
    }
}
