package p;

import androidx.car.app.model.Alert;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class m3g1 extends weo0 {
    public final bbc f;
    public xab1 g;

    public m3g1(du41 du41Var, u98 u98Var, wat watVar) {
        super(du41Var, u98Var, watVar);
        this.f = mno1.a(Alert.DURATION_SHOW_INDEFINITELY, 0, 6);
    }

    public static j3g1 g(bbc bbcVar) {
        j3g1 j3g1Var = null;
        r561 r561VarA = j2h1.A(new xeo0(new rnm0(bbcVar, (byte) 1), null));
        while (r561VarA.hasNext()) {
            j3g1 j3g1VarA = (j3g1) r561VarA.next();
            if (j3g1Var != null) {
                j3g1VarA = j3g1Var.a(j3g1VarA);
            }
            j3g1Var = j3g1VarA;
        }
        return j3g1Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d7, code lost:
    
        if (((p.weo0) r16).b.invoke(r0, r6) == r10) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(p.du41 r17, p.j3g1 r18, p.onm r19) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.m3g1.c(p.du41, p.j3g1, p.onm):java.lang.Object");
    }

    public final boolean d(bav0 bav0Var) {
        boolean z;
        boolean z2;
        boolean z3;
        bbc bbcVar;
        du41 du41Var;
        hav0 hav0Var = (hav0) o7h.s0(bav0Var.a);
        if (hav0Var != null) {
            List listC = hav0Var.c();
            int size = listC.size();
            int i = 0;
            z3 = false;
            while (true) {
                bbcVar = this.f;
                du41Var = ((weo0) this).a;
                if (i >= size) {
                    break;
                }
                yg60 yg60Var = (yg60) listC.get(i);
                long j = yg60Var.d ^ (-9223372034707292160L);
                if (!(du41Var.j(du41Var.f(j)) == 0.0f)) {
                    z3 = !(bbcVar.l(new j3g1(j, yg60Var.a, false)) instanceof pge) || z3;
                }
                i++;
            }
            z = true;
            z2 = false;
            long j2 = hav0Var.l ^ (-9223372034707292160L);
            boolean z4 = bav0Var.f == 12;
            if (!(du41Var.j(du41Var.f(j2)) == 0.0f) || z4) {
                if (!(bbcVar.l(new j3g1(j2, hav0Var.b, z4)) instanceof pge) || z3) {
                    z3 = true;
                }
            }
            return (!z3 || ((weo0) this).d) ? z : z2;
        }
        z = true;
        z2 = false;
        z3 = z2;
        if (z3) {
        }
    }

    public final void e(bav0 bav0Var, cav0 cav0Var, long j) {
        int i = bav0Var.f;
        if (i == 10 || i == 11 || i == 12) {
            List list = bav0Var.a;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((hav0) list.get(i2)).l()) {
                    return;
                }
            }
            if (cav0Var == cav0.a && ((weo0) this).d) {
                d(bav0Var);
                weo0.a(bav0Var);
            }
            if (cav0Var == cav0.b && !((weo0) this).d && d(bav0Var)) {
                weo0.a(bav0Var);
            }
        }
    }

    public final void f(c9n c9nVar) {
        if (this.g == null) {
            this.g = fn31.T(c9nVar, null, 0, new l3g1(this, (lnm) null), 3);
        }
    }
}
