package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o551 {
    public final di4 a;

    public o551(di4 di4Var) {
        this.a = di4Var;
    }

    public Next a(z551 z551Var, e151 e151Var) {
        ue20 te20Var;
        val valVar = z551Var.e;
        String str = z551Var.a;
        String strF = ejb.f();
        fw41 fw41Var = z551Var.f;
        fw41 fw41Var2 = e151Var.a;
        if (new fw41(fw41Var2.d, fw41Var.a, fw41Var.b, fw41Var.c, fw41Var.e, fw41Var.f, fw41Var.g).equals(fw41Var2)) {
            return Next.j();
        }
        if (str.length() == 0) {
            te20Var = se20.a;
        } else {
            te20Var = z551Var.h;
            if (te20Var instanceof re20) {
                te20Var = re20.a((re20) te20Var, null, false, 6);
            } else if (te20Var instanceof te20) {
                List list = ((te20) te20Var).a;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(db20.a((db20) it.next(), false));
                }
                te20Var = new te20(arrayList, null);
            } else if (!(te20Var instanceof se20)) {
                eg.o();
                return null;
            }
        }
        z551 z551VarA = z551.a(z551Var, null, null, 0, null, null, fw41Var2, jlr0.a, te20Var, null, 0, null, null, false, null, false, 32539);
        String str2 = z551VarA.a;
        h1z0 h1z0Var = z551VarA.N0;
        fw41 fw41Var3 = z551VarA.f;
        hx41 hx41Var = new hx41(strF, false, valVar);
        if (str.length() == 0) {
            return Next.i(z551VarA, Effects.a(new hx41[]{hx41Var}));
        }
        if (valVar instanceof ral) {
            if (h1z0Var.a != null) {
                return Next.i(z551VarA, Effects.a(new xyn1[]{new rx41(z551VarA.a, strF, uap1.g(z551VarA), fw41Var3.d, h1z0Var.a, (tv80) null, fw41Var3.c, 32), vx41.b}));
            }
            return Next.i(z551VarA, Effects.a(new xyn1[]{this.a.B() ? new mx41(str2, strF, (tv80) null, fw41Var3.c) : new nx41(str2, strF, null, fw41Var3.c)}));
        }
        if (valVar instanceof pal) {
            return Next.i(z551VarA, Effects.a(new px41[]{new px41(str2, strF, fw41Var3.e)}));
        }
        eg.o();
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x000d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    public ArrayList b(boolean z, boolean z2, boolean z3) {
        ArrayList arrayList = new ArrayList();
        d7 d7Var = new d7(mo21.Q0, (byte) 0);
        while (d7Var.hasNext()) {
            Object next = d7Var.next();
            int iOrdinal = ((mo21) next).ordinal();
            boolean zE = true;
            di4 di4Var = this.a;
            switch (iOrdinal) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                case 9:
                case 10:
                case 14:
                    if (zE) {
                        arrayList.add(next);
                    }
                    break;
                case 6:
                case 7:
                    zE = z;
                    if (zE) {
                        arrayList.add(next);
                    }
                    break;
                case 11:
                    zE = di4Var.e();
                    if (zE) {
                        arrayList.add(next);
                    }
                    break;
                case 12:
                    zE = z3;
                    if (zE) {
                        arrayList.add(next);
                    }
                    break;
                case 13:
                    zE = z2;
                    if (zE) {
                        arrayList.add(next);
                    }
                    break;
                case 15:
                    if (!di4Var.f() && !di4Var.P()) {
                        zE = false;
                    }
                    if (zE) {
                        arrayList.add(next);
                    }
                    break;
                case 16:
                    zE = false;
                    if (zE) {
                        arrayList.add(next);
                    }
                    break;
                default:
                    eg.o();
                    return null;
            }
        }
        return arrayList;
    }

    public o551(di4 di4Var, ejb ejbVar) {
        this.a = di4Var;
    }
}
