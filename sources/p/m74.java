package p;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class m74 extends e69 implements p161, wy20 {
    public final pct0 a;
    public final y161 b;
    public final ha4 c;
    public final q511 d;
    public final String e;
    public final Rect f = new Rect();
    public final AutofillId g;
    public final gdn0 h;
    public boolean i;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public m74(pct0 pct0Var, y161 y161Var, ha4 ha4Var, q511 q511Var, String str) throws KotlinNothingValueException {
        this.a = pct0Var;
        this.b = y161Var;
        this.c = ha4Var;
        this.d = q511Var;
        this.e = str;
        ha4Var.setImportantForAutofill(1);
        d69 d69VarH = t6p1.h(ha4Var);
        AutofillId autofillId = d69VarH != null ? (AutofillId) d69VarH.a : null;
        if (autofillId == null) {
            throw l1d.w("Required value was null.");
        }
        this.g = autofillId;
        this.h = new gdn0();
    }

    @Override // p.wy20
    public final void a(d030 d030Var, d030 d030Var2) {
        hmb0 hmb0VarD;
        o161 o161VarX;
        hmb0 hmb0VarD2;
        o161 o161VarX2;
        ha4 ha4Var = this.c;
        pct0 pct0Var = this.a;
        if (d030Var != null && (hmb0VarD2 = oap1.D(d030Var)) != null && (o161VarX2 = hmb0VarD2.x()) != null && i541.j(o161VarX2)) {
            pct0Var.e(hmb0VarD2.b, ha4Var);
        }
        if (d030Var2 == null || (hmb0VarD = oap1.D(d030Var2)) == null || (o161VarX = hmb0VarD.x()) == null || !i541.j(o161VarX)) {
            return;
        }
        int i = hmb0VarD.b;
        q511 q511Var = this.d;
        hmb0 hmb0Var = (hmb0) q511Var.a.b(i);
        if (hmb0Var == null || hmb0Var.g == -4) {
            return;
        }
        que0 que0Var = q511Var.c;
        int iD = q511Var.d(hmb0Var);
        long[] jArr = (long[]) que0Var.c;
        long j = jArr[iD];
        long j2 = jArr[iD + 1];
        pct0Var.d(ha4Var, i, new Rect((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2));
    }

    public final void b(SparseArray sparseArray) {
        o161 o161VarX;
        iu30 iu30Var;
        iu30 iu30Var2;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray.keyAt(i);
            AutofillValue autofillValueH = c9r.h(sparseArray.get(iKeyAt));
            hmb0 hmb0Var = (hmb0) this.b.c.b(iKeyAt);
            if (hmb0Var != null && (o161VarX = hmb0Var.x()) != null) {
                we weVar = (we) eko1.v(o161VarX, m161.g);
                if (weVar != null && (iu30Var2 = weVar.b) != null) {
                }
                we weVar2 = (we) eko1.v(o161VarX, m161.h);
                if (weVar2 != null && (iu30Var = weVar2.b) != null) {
                }
            }
        }
    }
}
