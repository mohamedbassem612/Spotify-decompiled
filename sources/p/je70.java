package p;

import java.util.AbstractList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class je70 extends AbstractList {
    public static final je70 d = new je70(op71.a, Collections.EMPTY_LIST);
    public final List a;
    public final List b;
    public final de70 c;

    public je70(de70 de70Var, List list) {
        b380 b380VarUnmodifiableList;
        list.getClass();
        de70Var.getClass();
        this.c = de70Var;
        if (list instanceof b380) {
            b380VarUnmodifiableList = b380.p(list);
            this.a = b380VarUnmodifiableList;
        } else {
            b380VarUnmodifiableList = Collections.unmodifiableList(list);
            this.a = b380VarUnmodifiableList;
        }
        de70 de70VarE = op71.E(de70Var);
        b380 ae70Var = Collections.EMPTY_LIST;
        if (b380VarUnmodifiableList != ae70Var) {
            w280 w280Var = b380.b;
            ae70Var = bg11.e;
            if (b380VarUnmodifiableList != ae70Var) {
                ae70Var = new ae70(de70VarE, b380VarUnmodifiableList);
            }
        }
        this.b = ae70Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (y570) this.b.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
