package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class lft extends ec11 {
    public final rka0 b;
    public final mc11 c = jhc1.A(null, new b9o(this, (byte) 1));
    public final mc11 d = jhc1.A(null, new jft(this, (byte) 0));
    public final mc11 e = jhc1.A(null, new jft(this, (byte) 1));
    public final mc11 f = jhc1.A(null, new jft(this, (byte) 2));
    public final mc11 g = jhc1.A(null, new jft(this, (byte) 3));

    public lft(rka0 rka0Var) {
        this.b = rka0Var;
    }

    @Override // p.dc11
    public final List f() {
        return (List) this.d.invoke();
    }

    @Override // p.pka0
    public final List getAnnotations() {
        return (List) this.c.invoke();
    }

    @Override // p.qka0
    public final List getParameters() {
        return (List) this.e.invoke();
    }

    @Override // p.qka0
    public final oma0 getReturnType() {
        return (oma0) this.f.invoke();
    }

    @Override // p.qka0
    public final List getTypeParameters() {
        return (List) this.g.invoke();
    }

    @Override // p.qka0
    public final xma0 getVisibility() {
        return bpi1.q(t().getVisibility());
    }

    @Override // p.qka0
    public final boolean isAbstract() {
        return w() == 4;
    }

    @Override // p.qka0
    public final boolean isFinal() {
        return w() == 1;
    }

    @Override // p.qka0
    public final boolean isOpen() {
        return w() == 3;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007f  */
    public final ArrayList n(boolean z) {
        byte b;
        mmr0 mmr0VarN;
        Collection collection;
        iit iitVarT = t();
        ArrayList arrayList = new ArrayList();
        byte b2 = 1;
        if (z) {
            rob0 rob0VarG = bpi1.g(this);
            if (rob0VarG != null) {
                arrayList.add(new xft(this, arrayList.size(), 1, new kft(rob0VarG, (byte) 0)));
            }
            if (iitVarT instanceof iit) {
                iit iitVar = iitVarT;
                mmr0VarN = oqn1.n(iitVar.G(), iitVar.L1().n());
            } else if (iitVarT instanceof hit) {
                hit hitVar = (hit) iitVarT;
                mmr0VarN = oqn1.n(hitVar.G(), hitVar.F1().n());
            } else if (iitVarT instanceof rdy0) {
                hit hitVarX1 = ((rdy0) iitVarT).x1();
                hit hitVar2 = hitVarX1 instanceof hit ? hitVarX1 : null;
                if (hitVar2 != null) {
                    mmr0VarN = oqn1.n(hitVar2.G(), hitVar2.F1().n());
                } else {
                    mmr0VarN = null;
                }
            } else {
                mmr0VarN = null;
            }
            if (mmr0VarN == null) {
                collection = z6x.a;
            } else {
                zjn0 zjn0Var = (zjn0) mmr0VarN.a;
                List list = (List) mmr0VarN.b;
                List listG0 = iitVarT.g0();
                ArrayList arrayList2 = new ArrayList(q7h.U(listG0, 10));
                int i = 0;
                for (Object obj : listG0) {
                    int i2 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    rob0 rob0Var = (rob0) obj;
                    ArrayList arrayList3 = arrayList2;
                    arrayList3.add(new tsi1(iitVarT, (tsi1) null, i, rob0Var.getAnnotations(), ajn0.d(zjn0Var.getString(((zgy0) list.get(i)).n())), rob0Var.getType(), false, false, false, (a8b0) null, mka1.m0));
                    b2 = b2;
                    arrayList2 = arrayList3;
                    i = i2;
                    list = list;
                    zjn0Var = zjn0Var;
                }
                collection = arrayList2;
            }
            b = b2;
            int size = collection.size();
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(new xft(this, arrayList.size(), 2, new r2n(collection, i3, b)));
            }
            rob0 rob0VarL = iitVarT.L();
            if (rob0VarL != null) {
                arrayList.add(new xft(this, arrayList.size(), 3, new kft(rob0VarL, b)));
            }
        } else {
            b = 1;
        }
        int size2 = iitVarT.F().size();
        for (int i4 = 0; i4 < size2; i4++) {
            arrayList.add(new xft(this, arrayList.size(), 4, new r2n(iitVarT, i4, (byte) 2)));
        }
        if (fc11.M(this) && (iitVarT instanceof o7a0) && arrayList.size() > b) {
            r7h.f0(arrayList, new p0d((byte) 29));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public abstract rgt s();

    public abstract jyc t();

    public final int w() {
        int i = this.b.c;
        return i == 0 ? t().o() : i;
    }

    public lft x(rka0 rka0Var) {
        throw new IllegalStateException("Property accessors can only be copied by copying the corresponding property");
    }
}
