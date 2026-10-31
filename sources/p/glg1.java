package p;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class glg1 extends jhg1 {
    public int h1;
    public jhg1[] k1;
    public ArrayList f1 = new ArrayList();
    public boolean g1 = true;
    public boolean i1 = false;
    public int j1 = 0;

    @Override // p.jhg1
    public final void E(View view) {
        super.E(view);
        int size = this.f1.size();
        for (int i = 0; i < size; i++) {
            ((jhg1) this.f1.get(i)).E(view);
        }
    }

    @Override // p.jhg1
    public final void F() {
        this.Y0 = 0L;
        flg1 flg1Var = new flg1(this, (byte) 1);
        for (int i = 0; i < this.f1.size(); i++) {
            jhg1 jhg1Var = (jhg1) this.f1.get(i);
            jhg1Var.a(flg1Var);
            jhg1Var.F();
            long j = jhg1Var.Y0;
            boolean z = this.g1;
            long j2 = this.Y0;
            if (z) {
                this.Y0 = Math.max(j2, j);
            } else {
                jhg1Var.a1 = j2;
                this.Y0 = j2 + j;
            }
        }
    }

    @Override // p.jhg1
    public final jhg1 G(ghg1 ghg1Var) {
        super.G(ghg1Var);
        return this;
    }

    @Override // p.jhg1
    public final void H(View view) {
        for (int i = 0; i < this.f1.size(); i++) {
            ((jhg1) this.f1.get(i)).H(view);
        }
        this.f.remove(view);
    }

    @Override // p.jhg1
    public final void I(View view) {
        super.I(view);
        jhg1[] jhg1VarArrZ = Z();
        int size = this.f1.size();
        for (int i = 0; i < size; i++) {
            jhg1VarArrZ[i].I(view);
        }
        Arrays.fill(jhg1VarArrZ, (Object) null);
        this.k1 = jhg1VarArrZ;
    }

    @Override // p.jhg1
    public final void J() {
        ArrayList arrayList;
        if (this.f1.isEmpty()) {
            R();
            r();
            return;
        }
        int i = 1;
        ghg1 d2g0Var = new d2g0(this, (byte) 1);
        Iterator it = this.f1.iterator();
        while (it.hasNext()) {
            ((jhg1) it.next()).a(d2g0Var);
        }
        this.h1 = this.f1.size();
        if (this.g1) {
            Iterator it2 = this.f1.iterator();
            while (it2.hasNext()) {
                ((jhg1) it2.next()).J();
            }
            return;
        }
        while (true) {
            int size = this.f1.size();
            arrayList = this.f1;
            byte b = 0;
            if (i >= size) {
                break;
            }
            ((jhg1) arrayList.get(i - 1)).a(new flg1((jhg1) this.f1.get(i), b));
            i++;
        }
        jhg1 jhg1Var = (jhg1) arrayList.get(0);
        if (jhg1Var != null) {
            jhg1Var.J();
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // p.jhg1
    public final void K(long j, long j2) {
        long j3;
        long j4 = this.Y0;
        long j5 = 0;
        if (this.i != null) {
            if (j < 0 && j2 < 0) {
                return;
            }
            if (j > j4 && j2 > j4) {
                return;
            }
        }
        boolean z = j < j2;
        if ((j >= 0 && j2 < 0) || (j <= j4 && j2 > j4)) {
            this.R0 = false;
            D(this, ihg1.v0, z);
        }
        if (!this.g1) {
            int size = 1;
            while (true) {
                int size2 = this.f1.size();
                ArrayList arrayList = this.f1;
                if (size >= size2) {
                    size = arrayList.size();
                    break;
                } else if (((jhg1) arrayList.get(size)).a1 > j2) {
                    break;
                } else {
                    size++;
                }
            }
            int i = size - 1;
            if (j >= j2) {
                while (true) {
                    if (i < this.f1.size()) {
                        jhg1 jhg1Var = (jhg1) this.f1.get(i);
                        long j6 = jhg1Var.a1;
                        j3 = j5;
                        long j7 = j - j6;
                        if (j7 < j3) {
                            break;
                        }
                        jhg1Var.K(j7, j2 - j6);
                        i++;
                        j5 = j3;
                    }
                }
            } else {
                j3 = 0;
                while (i >= 0) {
                    jhg1 jhg1Var2 = (jhg1) this.f1.get(i);
                    long j8 = jhg1Var2.a1;
                    long j9 = j - j8;
                    jhg1Var2.K(j9, j2 - j8);
                    if (j9 >= 0) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
            if (this.i != null) {
                if ((j > j4 || j2 > j4) && (j >= 0 || j2 < j3)) {
                    return;
                }
                if (j > j4) {
                    this.R0 = true;
                }
                D(this, ihg1.w0, z);
            }
        }
        for (int i2 = 0; i2 < this.f1.size(); i2++) {
            ((jhg1) this.f1.get(i2)).K(j, j2);
        }
        j3 = j5;
        if (this.i != null) {
            if (j > j4) {
                return;
            } else {
                return;
            }
            if (j > j4) {
                this.R0 = true;
            }
            D(this, ihg1.w0, z);
        }
    }

    @Override // p.jhg1
    public final void M(fj30 fj30Var) {
        this.W0 = fj30Var;
        this.j1 |= 8;
        int size = this.f1.size();
        for (int i = 0; i < size; i++) {
            ((jhg1) this.f1.get(i)).M(fj30Var);
        }
    }

    @Override // p.jhg1
    public final void O(gtv0 gtv0Var) {
        super.O(gtv0Var);
        this.j1 |= 4;
        if (this.f1 != null) {
            for (int i = 0; i < this.f1.size(); i++) {
                ((jhg1) this.f1.get(i)).O(gtv0Var);
            }
        }
    }

    @Override // p.jhg1
    public final void P(ij81 ij81Var) {
        this.V0 = ij81Var;
        this.j1 |= 2;
        int size = this.f1.size();
        for (int i = 0; i < size; i++) {
            ((jhg1) this.f1.get(i)).P(ij81Var);
        }
    }

    @Override // p.jhg1
    public final void Q(long j) {
        this.b = j;
    }

    @Override // p.jhg1
    public final String S(String str) {
        String strS = super.S(str);
        for (int i = 0; i < this.f1.size(); i++) {
            StringBuilder sbG = dv20.g(strS, "\n");
            sbG.append(((jhg1) this.f1.get(i)).S(str.concat("  ")));
            strS = sbG.toString();
        }
        return strS;
    }

    public final void T(cjg1 cjg1Var) {
        super.a(cjg1Var);
    }

    public final void U(jhg1 jhg1Var) {
        this.f1.add(jhg1Var);
        jhg1Var.i = this;
        long j = this.c;
        if (j >= 0) {
            jhg1Var.L(j);
        }
        if ((this.j1 & 1) != 0) {
            jhg1Var.N(this.d);
        }
        if ((this.j1 & 2) != 0) {
            jhg1Var.P(this.V0);
        }
        if ((this.j1 & 4) != 0) {
            jhg1Var.O(this.X0);
        }
        if ((this.j1 & 8) != 0) {
            jhg1Var.M(this.W0);
        }
    }

    public final jhg1 V(int i) {
        if (i < 0 || i >= this.f1.size()) {
            return null;
        }
        return (jhg1) this.f1.get(i);
    }

    @Override // p.jhg1
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public final void L(long j) {
        ArrayList arrayList;
        this.c = j;
        if (j < 0 || (arrayList = this.f1) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((jhg1) this.f1.get(i)).L(j);
        }
    }

    @Override // p.jhg1
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public final void N(TimeInterpolator timeInterpolator) {
        this.j1 |= 1;
        ArrayList arrayList = this.f1;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((jhg1) this.f1.get(i)).N(timeInterpolator);
            }
        }
        this.d = timeInterpolator;
    }

    public final void Y(int i) {
        if (i == 0) {
            this.g1 = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException(f4i1.c(i, "Invalid parameter for TransitionSet ordering: "));
            }
            this.g1 = false;
        }
    }

    public final jhg1[] Z() {
        jhg1[] jhg1VarArr = this.k1;
        this.k1 = null;
        if (jhg1VarArr == null) {
            jhg1VarArr = new jhg1[this.f1.size()];
        }
        return (jhg1[]) this.f1.toArray(jhg1VarArr);
    }

    @Override // p.jhg1
    public final jhg1 b(View view) {
        for (int i = 0; i < this.f1.size(); i++) {
            ((jhg1) this.f1.get(i)).b(view);
        }
        this.f.add(view);
        return this;
    }

    @Override // p.jhg1
    public final void cancel() {
        super.cancel();
        jhg1[] jhg1VarArrZ = Z();
        int size = this.f1.size();
        for (int i = 0; i < size; i++) {
            jhg1VarArrZ[i].cancel();
        }
        Arrays.fill(jhg1VarArrZ, (Object) null);
        this.k1 = jhg1VarArrZ;
    }

    @Override // p.jhg1
    public final void e(omg1 omg1Var) {
        View view = omg1Var.b;
        if (B(view)) {
            for (jhg1 jhg1Var : this.f1) {
                if (jhg1Var.B(view)) {
                    jhg1Var.e(omg1Var);
                    omg1Var.c.add(jhg1Var);
                }
            }
        }
    }

    @Override // p.jhg1
    public final void h(omg1 omg1Var) {
        super.h(omg1Var);
        int size = this.f1.size();
        for (int i = 0; i < size; i++) {
            ((jhg1) this.f1.get(i)).h(omg1Var);
        }
    }

    @Override // p.jhg1
    public final void i(omg1 omg1Var) {
        View view = omg1Var.b;
        if (B(view)) {
            for (jhg1 jhg1Var : this.f1) {
                if (jhg1Var.B(view)) {
                    jhg1Var.i(omg1Var);
                    omg1Var.c.add(jhg1Var);
                }
            }
        }
    }

    @Override // p.jhg1
    /* JADX INFO: renamed from: l */
    public final jhg1 clone() {
        glg1 glg1Var = (glg1) super.clone();
        glg1Var.f1 = new ArrayList();
        int size = this.f1.size();
        for (int i = 0; i < size; i++) {
            jhg1 jhg1VarClone = ((jhg1) this.f1.get(i)).clone();
            glg1Var.f1.add(jhg1VarClone);
            jhg1VarClone.i = glg1Var;
        }
        return glg1Var;
    }

    @Override // p.jhg1
    public final void q(ViewGroup viewGroup, hce1 hce1Var, hce1 hce1Var2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.b;
        int size = this.f1.size();
        for (int i = 0; i < size; i++) {
            jhg1 jhg1Var = (jhg1) this.f1.get(i);
            if (j > 0 && (this.g1 || i == 0)) {
                long j2 = jhg1Var.b;
                if (j2 > 0) {
                    jhg1Var.Q(j2 + j);
                } else {
                    jhg1Var.Q(j);
                }
            }
            jhg1Var.q(viewGroup, hce1Var, hce1Var2, arrayList, arrayList2);
        }
    }

    @Override // p.jhg1
    public final void s(ViewGroup viewGroup) {
        super.s(viewGroup);
        jhg1[] jhg1VarArrZ = Z();
        int size = this.f1.size();
        for (int i = 0; i < size; i++) {
            jhg1VarArrZ[i].s(viewGroup);
        }
        Arrays.fill(jhg1VarArrZ, (Object) null);
        this.k1 = jhg1VarArrZ;
    }

    @Override // p.jhg1
    public final boolean y() {
        for (int i = 0; i < this.f1.size(); i++) {
            if (((jhg1) this.f1.get(i)).y()) {
                return true;
            }
        }
        return false;
    }

    @Override // p.jhg1
    public final boolean z() {
        int size = this.f1.size();
        for (int i = 0; i < size; i++) {
            if (!((jhg1) this.f1.get(i)).z()) {
                return false;
            }
        }
        return true;
    }
}
