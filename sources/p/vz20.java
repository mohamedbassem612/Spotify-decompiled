package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vz20 {
    public final dt71 a;
    public final dt71 b;
    public uz20 c;

    public vz20() {
        dt71 dt71VarE = mgo1.e(0, 3, 2, 1);
        this.a = dt71VarE;
        this.b = dt71VarE;
    }

    public static uz20 b(uz20 uz20Var, int i) {
        k030 k030VarB = uz20Var.b();
        return uz20.a(k030VarB != null ? k030.a(k030VarB, i) : null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final void a(k10 k10Var) {
        uz20 uz20Var;
        k030 k030VarB;
        zx20 zx20Var = null;
        if (k10Var.equals(qz70.b)) {
            uz20 uz20Var2 = this.c;
            if (uz20Var2 != null) {
                uz20Var = b(uz20Var2, 2);
            } else {
                uz20Var = null;
            }
        } else if (k10Var.equals(v560.b)) {
            uz20 uz20Var3 = this.c;
            if (uz20Var3 != null) {
                uz20Var = b(uz20Var3, 1);
            } else {
                uz20Var = null;
            }
        } else if (k10Var.equals(wdu0.c)) {
            uz20 uz20Var4 = this.c;
            if (uz20Var4 != null) {
                uz20Var = b(uz20Var4, 2);
            } else {
                uz20Var = null;
            }
        } else if (k10Var instanceof yz) {
            boolean zA = ((yz) k10Var).a();
            uz20 uz20Var5 = this.c;
            if (!zA) {
                uz20Var = uz20Var5;
            } else if (uz20Var5 != null) {
                uz20Var = b(uz20Var5, 2);
            } else {
                uz20Var = null;
            }
        } else {
            if (!(k10Var instanceof x00)) {
                eg.o();
                return;
            }
            uz20Var = new uz20(new k030(((x00) k10Var).a().b(), 1));
        }
        if (uz20Var != null) {
            uz20 uz20Var6 = this.c;
            ArrayList arrayList = new ArrayList();
            if (!u890.j(uz20Var6 != null ? uz20Var6.b() : null, uz20Var.b())) {
                if (((uz20Var6 == null || (k030VarB = uz20Var6.b()) == null) ? 0 : k030VarB.c()) == 1) {
                    arrayList.add(new zx20(uz20Var6.b().b(), 2));
                }
            }
            k030 k030VarB2 = uz20Var.b();
            if (k030VarB2 != null) {
                if (!k030VarB2.equals(uz20Var6 != null ? uz20Var6.b() : null) && k030VarB2.c() != 2) {
                    zx20Var = new zx20(k030VarB2.b(), k030VarB2.c());
                }
            }
            arrayList.add(zx20Var);
            ArrayList arrayListO0 = o7h.o0(arrayList);
            Objects.toString(this.b);
            k10Var.toString();
            this.c = uz20Var;
            Iterator it = arrayListO0.iterator();
            while (it.hasNext()) {
                this.a.a((zx20) it.next());
            }
        }
    }
}
