package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public class tsi1 extends gti1 implements lpr0 {
    public final a8b0 X;
    public final tsi1 Y;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final boolean t;

    public tsi1(hyc hycVar, tsi1 tsi1Var, int i, fg5 fg5Var, ajn0 ajn0Var, a8b0 a8b0Var, boolean z, boolean z2, boolean z3, a8b0 a8b0Var2, mka1 mka1Var) {
        super(hycVar, fg5Var, ajn0Var, a8b0Var, mka1Var);
        this.g = i;
        this.h = z;
        this.i = z2;
        this.t = z3;
        this.X = a8b0Var2;
        this.Y = tsi1Var == null ? this : tsi1Var;
    }

    @Override // p.q9r
    /* JADX INFO: renamed from: A1, reason: merged with bridge method [inline-methods] */
    public final tsi1 w1() {
        tsi1 tsi1Var = this.Y;
        return tsi1Var == this ? this : tsi1Var.w1();
    }

    @Override // p.fti1
    public final boolean K() {
        return false;
    }

    @Override // p.fti1
    public final sgl b0() {
        return null;
    }

    @Override // p.apc1
    public final p9r d(l1h1 l1h1Var) {
        if (l1h1Var.a.e()) {
            return this;
        }
        k220.c();
        return null;
    }

    @Override // p.s9r
    public final lht getVisibility() {
        return mht.f;
    }

    @Override // p.q9r, p.n9r
    public final n9r k() {
        return (hyc) super.k();
    }

    @Override // p.hyc
    public final Collection l() {
        Collection collectionL = ((hyc) super.k()).l();
        ArrayList arrayList = new ArrayList(q7h.U(collectionL, 10));
        Iterator it = collectionL.iterator();
        while (it.hasNext()) {
            arrayList.add((tsi1) ((hyc) it.next()).F().get(this.g));
        }
        return arrayList;
    }

    @Override // p.n9r
    public final Object r(r9r r9rVar, Object obj) {
        return r9rVar.i(this, obj);
    }

    public tsi1 x1(rv30 rv30Var, ajn0 ajn0Var, int i) {
        return new tsi1(rv30Var, null, i, getAnnotations(), ajn0Var, getType(), y1(), this.i, this.t, this.X, mka1.m0);
    }

    public final boolean y1() {
        return this.h && ((jyc) ((hyc) super.k())).getKind() != 2;
    }

    public final hyc z1() {
        return (hyc) super.k();
    }
}
