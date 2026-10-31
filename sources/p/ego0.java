package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ego0 extends ceg {
    public final boolean g;
    public final ArrayList h;
    public final oeg i;

    public ego0(s1c1 s1c1Var, leg legVar, ajn0 ajn0Var, boolean z, int i) {
        super(s1c1Var, legVar, ajn0Var, mka1.m0);
        this.g = z;
        tr80 tr80VarQ = yoi1.Q(0, i);
        ArrayList arrayList = new ArrayList(q7h.U(tr80VarQ, 10));
        lr80 it = tr80VarQ.iterator();
        while (((sr80) it).c) {
            int iNextInt = it.nextInt();
            arrayList.add(z0h1.A1(this, 1, ajn0.e("T" + iNextInt), iNextInt, s1c1Var));
        }
        this.h = arrayList;
        List listM = bzn1.m(this);
        int i2 = kht.a;
        this.i = new oeg(this, listM, Collections.singleton(iht.c(this).e().f()), s1c1Var);
    }

    @Override // p.beg
    public final xdg B() {
        return null;
    }

    @Override // p.beg
    public final ksi1 Q() {
        return null;
    }

    @Override // p.zji0
    public final boolean S() {
        return false;
    }

    @Override // p.beg
    public final boolean U() {
        return false;
    }

    @Override // p.beg
    public final boolean W() {
        return false;
    }

    @Override // p.zji0
    public final boolean Z() {
        return false;
    }

    @Override // p.beg
    public final zpi0 a0() {
        return ypi0.b;
    }

    @Override // p.wim0
    public final /* bridge */ /* synthetic */ zpi0 c0(g8b0 g8b0Var) {
        return ypi0.b;
    }

    @Override // p.beg
    public final int e0() {
        return 1;
    }

    @Override // p.jfg
    public final h0h1 g() {
        return this.i;
    }

    public final fg5 getAnnotations() {
        return rzs0.g;
    }

    @Override // p.beg, p.zji0, p.s9r
    public final lht getVisibility() {
        return mht.e;
    }

    @Override // p.beg
    public final Collection h() {
        return w7x.a;
    }

    @Override // p.ceg, p.zji0
    public final boolean isExternal() {
        return false;
    }

    @Override // p.beg
    public final boolean isInline() {
        return false;
    }

    @Override // p.kfg
    public final boolean j() {
        return this.g;
    }

    @Override // p.beg, p.kfg
    public final List n() {
        return this.h;
    }

    @Override // p.beg, p.zji0
    public final int o() {
        return 1;
    }

    @Override // p.beg
    public final boolean p() {
        return false;
    }

    @Override // p.beg
    public final boolean p0() {
        return false;
    }

    public final String toString() {
        return "class " + getName() + " (not found)";
    }
}
