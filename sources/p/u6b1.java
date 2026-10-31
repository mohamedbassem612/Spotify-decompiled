package p;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u6b1 extends v61 implements g0g1 {
    public final c5u0 A;
    public final iu30 B;
    public final iu30 C;
    public boolean D;
    public boolean E;
    public int F;
    public LinkedHashSet G;
    public final ArrayList H;
    public y1k1 I;
    public final k9 w;
    public final vu30 x;
    public final boolean y;
    public final boolean z;

    public u6b1(k9 k9Var, vu30 vu30Var, boolean z, boolean z2, c5u0 c5u0Var, pnf1 pnf1Var, int[] iArr, o4a o4aVar, iu30 iu30Var, iu30 iu30Var2) {
        super(pnf1Var, iArr, o4aVar);
        this.w = k9Var;
        this.x = vu30Var;
        this.y = z;
        this.z = z2;
        this.A = c5u0Var;
        this.B = iu30Var;
        this.C = iu30Var2;
        this.F = ((v61) this).s;
        int i = pnf1Var.a;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(pnf1Var.d[i2]);
        }
        this.H = arrayList;
    }

    public final boolean b(long j, yag yagVar, List list) {
        if (!this.D) {
            return false;
        }
        this.D = false;
        this.E = true;
        return true;
    }

    public final int c() {
        return this.F;
    }

    public final void g() {
        ((v61) this).v = null;
        this.C.invoke(this);
    }

    public final void l(long j, long j2, long j3, List list, vjh0[] vjh0VarArr) {
        LinkedHashSet linkedHashSet;
        ArrayList arrayList = this.H;
        vu30 vu30Var = this.x;
        if (vu30Var == null) {
            linkedHashSet = null;
        } else {
            List listL1 = o7h.l1(arrayList);
            linkedHashSet = new LinkedHashSet();
            for (Object obj : arrayList) {
                if (((Boolean) vu30Var.invoke((ie30) obj, listL1)).booleanValue()) {
                    linkedHashSet.add(obj);
                }
            }
        }
        this.G = linkedHashSet;
        super.l(j, j2, j3, list, vjh0VarArr);
        this.F = ((v61) this).s;
        ArrayList arrayList2 = new ArrayList();
        int length = vjh0VarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            vjh0 vjh0Var = vjh0VarArr[i];
            int i3 = i2 + 1;
            mmr0 mmr0Var = (u890.j(vjh0Var, vjh0.a) || !vjh0Var.next()) ? null : new mmr0(Integer.valueOf(i2), vjh0Var);
            if (mmr0Var != null) {
                arrayList2.add(mmr0Var);
            }
            i++;
            i2 = i3;
        }
        boolean z = this.z && j2 == 0 && this.A.a == 1;
        if (j2 > 0 && this.A.a == 1) {
            this.A.a = 2;
        }
        if (this.y) {
            ie30 ie30Var = ((yca) this).d[this.F];
            Set setP1 = this.G;
            if (setP1 == null) {
                setP1 = o7h.p1(this.H);
            }
            d061 d061Var = new d061(1, this, u6b1.class, "getFormat", "getFormat(I)Landroidx/media3/common/Format;", 0, (byte) 27);
            this = this;
            Integer numN0 = this.w.N0(arrayList2, new ksc(ie30Var, z, setP1, d061Var));
            if (numN0 != null) {
                ie30 ie30Var2 = ((yca) this).d[numN0.intValue()];
                this.F = numN0.intValue();
            }
        }
        this.G = null;
    }

    public final void p() {
        super.p();
        this.B.invoke(this);
    }

    public final int q(long j, List list) {
        if (this.E) {
            this.D = false;
            this.E = false;
            if (!list.isEmpty()) {
                return 1;
            }
        }
        return super.q(j, list);
    }

    @Override // p.g0g1
    public final void u(y1k1 y1k1Var) {
        if (!u890.j(this.I, y1k1Var)) {
            this.D = true;
            this.E = true;
        }
        this.I = y1k1Var;
    }

    public final boolean x(ie30 ie30Var, int i, long j) {
        boolean zBooleanValue;
        y1k1 y1k1Var = this.I;
        if (y1k1Var != null) {
            if (ie30Var.w != y1k1Var.a || ie30Var.x != y1k1Var.b) {
                return false;
            }
        } else {
            if (!super.x(ie30Var, i, j)) {
                return false;
            }
            LinkedHashSet linkedHashSet = this.G;
            if (linkedHashSet != null) {
                zBooleanValue = linkedHashSet.contains(ie30Var);
            } else {
                List listL1 = o7h.l1(this.H);
                vu30 vu30Var = this.x;
                zBooleanValue = vu30Var != null ? ((Boolean) vu30Var.invoke(ie30Var, listL1)).booleanValue() : true;
            }
            if (!zBooleanValue) {
                return false;
            }
        }
        return true;
    }
}
