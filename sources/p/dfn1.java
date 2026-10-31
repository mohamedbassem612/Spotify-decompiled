package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dfn1 extends egn1 {
    public final transient egn1 h;

    public dfn1(egn1 egn1Var) {
        super((byte) 2);
        this.h = egn1Var;
    }

    @Override // p.egn1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.h.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        egn1 egn1Var = this.h;
        wmo1.D(i, egn1Var.size());
        return egn1Var.get((egn1Var.size() - 1) - i);
    }

    @Override // p.egn1, java.util.List
    public final int indexOf(Object obj) {
        egn1 egn1Var = this.h;
        int iLastIndexOf = egn1Var.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (egn1Var.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // p.egn1, java.util.List
    public final int lastIndexOf(Object obj) {
        egn1 egn1Var = this.h;
        int iIndexOf = egn1Var.indexOf(obj);
        if (iIndexOf >= 0) {
            return (egn1Var.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // p.egn1
    public final egn1 p() {
        return this.h;
    }

    @Override // p.egn1, java.util.List
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final egn1 subList(int i, int i2) {
        egn1 egn1Var = this.h;
        wmo1.F(i, i2, egn1Var.size());
        return egn1Var.subList(egn1Var.size() - i2, egn1Var.size() - i).p();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.h.size();
    }
}
