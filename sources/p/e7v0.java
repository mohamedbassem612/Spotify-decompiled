package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class e7v0 extends kkn {
    public final /* synthetic */ byte e;
    public List f;
    public List g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7v0() {
        super(false);
        this.e = (byte) 0;
        z6x z6xVar = z6x.a;
        this.f = z6xVar;
        this.g = z6xVar;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00c5 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00c7 A[ORIG_RETURN, RETURN] */
    public final boolean i(int i, int i2) {
        switch (this.e) {
            case 0:
                return u890.j(this.f.get(i), this.g.get(i2));
            case 1:
                caz0 caz0Var = (caz0) this.f.get(i);
                caz0 caz0Var2 = (caz0) this.g.get(i2);
                if (!(caz0Var instanceof ivf1) || !(caz0Var2 instanceof ivf1)) {
                    if (!((caz0Var instanceof vg51) && (caz0Var2 instanceof vg51)) ? (caz0Var instanceof sq41) && (caz0Var2 instanceof sq41) : ((vg51) caz0Var).a == ((vg51) caz0Var2).a) {
                        return false;
                    }
                    return true;
                }
                hjf1 hjf1Var = ((ivf1) caz0Var).a;
                hjf1 hjf1Var2 = ((ivf1) caz0Var2).a;
                if (hjf1Var.c.equals(hjf1Var2.c) && hjf1Var.d.equals(hjf1Var2.d) && u890.j(hjf1Var.e, hjf1Var2.e) && hjf1Var.f30p == hjf1Var2.f30p && hjf1Var.g == hjf1Var2.g && hjf1Var.k == hjf1Var2.k && hjf1Var.l == hjf1Var2.l && u890.j(hjf1Var.q, hjf1Var2.q) && hjf1Var.i == hjf1Var2.i && hjf1Var.o == hjf1Var2.o && hjf1Var.m == hjf1Var2.m && hjf1Var.j == hjf1Var2.j && hjf1Var.r == hjf1Var2.r && hjf1Var.s == hjf1Var2.s && hjf1Var.u == hjf1Var2.u && hjf1Var.v == hjf1Var2.v && u890.j(hjf1Var.w, hjf1Var2.w)) {
                    return true;
                }
                return false;
            case 2:
                return j(i, i2);
            default:
                return j(i, i2);
        }
    }

    public final boolean j(int i, int i2) {
        switch (this.e) {
            case 0:
                a2z a2zVar = (a2z) this.f.get(i);
                a2z a2zVar2 = (a2z) this.g.get(i2);
                if (a2zVar != null) {
                    i1z i1zVar = a2zVar.a;
                    if (a2zVar2 != null) {
                        i1z i1zVar2 = a2zVar2.a;
                        String str = i1zVar.b;
                        if (str != null && str.length() != 0) {
                            return u890.j(i1zVar.b, i1zVar2.b);
                        }
                        String str2 = i1zVar2.b;
                        if (str2 == null || str2.length() == 0) {
                            return i1zVar.a.equals(i1zVar2.a);
                        }
                        return false;
                    }
                }
                return a2zVar.b.equals(a2zVar2.b);
            case 1:
                return u890.j(((caz0) this.f.get(i)).getId(), ((caz0) this.g.get(i2)).getId());
            case 2:
                return u890.j(this.f.get(i), this.g.get(i2));
            default:
                return u890.j(this.f.get(i), this.g.get(i2));
        }
    }

    public final int q() {
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.g.size();
    }

    public final int r() {
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.f.size();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e7v0(List list, List list2, byte b) {
        super(false);
        this.e = b;
        this.f = list;
        this.g = list2;
    }
}
