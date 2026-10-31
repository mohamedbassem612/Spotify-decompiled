package p;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class foa1 {
    public int a;
    public int b;
    public final zf30 c;
    public final ArrayList d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final ArrayList j;
    public final ArrayList k;
    public final si30 l;

    public foa1(int i, int i2, si30 si30Var) {
        zf30 zf30Var = si30Var.c;
        this.a = i;
        this.b = i2;
        this.c = zf30Var;
        this.d = new ArrayList();
        this.i = true;
        ArrayList arrayList = new ArrayList();
        this.j = arrayList;
        this.k = arrayList;
        this.l = si30Var;
    }

    public final void a(ViewGroup viewGroup) {
        this.h = false;
        if (this.e) {
            return;
        }
        this.e = true;
        if (this.j.isEmpty()) {
            b();
            return;
        }
        Iterator it = o7h.l1(this.k).iterator();
        while (it.hasNext()) {
            ((eoa1) it.next()).a(viewGroup);
        }
    }

    public final void b() {
        this.h = false;
        if (!this.f) {
            if (th30.P(2)) {
                toString();
            }
            this.f = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.c.Z = false;
        this.l.k();
    }

    public final void c(eoa1 eoa1Var) {
        ArrayList arrayList = this.j;
        if (arrayList.remove(eoa1Var) && arrayList.isEmpty()) {
            b();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void d(int i, int i2) throws NoWhenBranchMatchedException {
        int iC = l1d.C(i2);
        zf30 zf30Var = this.c;
        if (iC == 0) {
            if (this.a != 1) {
                if (th30.P(2)) {
                    Objects.toString(zf30Var);
                    if (i != 1 && i != 2 && i != 3 && i != 4) {
                        throw null;
                    }
                }
                this.a = i;
                return;
            }
            return;
        }
        if (iC == 1) {
            if (this.a == 1) {
                if (th30.P(2)) {
                    Objects.toString(zf30Var);
                }
                this.a = 2;
                this.b = 2;
                this.i = true;
                return;
            }
            return;
        }
        if (iC != 2) {
            eg.o();
            return;
        }
        if (th30.P(2)) {
            Objects.toString(zf30Var);
        }
        this.a = 1;
        this.b = 3;
        this.i = true;
    }

    public final String toString() {
        String str;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int i = this.a;
        int i2 = this.b;
        StringBuilder sbT = l1d.t("Operation {", hexString, "} {finalState = ");
        String str2 = "null";
        if (i == 1) {
            str = "REMOVED";
        } else if (i == 2) {
            str = "VISIBLE";
        } else if (i != 3) {
            str = i != 4 ? "null" : "INVISIBLE";
        } else {
            str = "GONE";
        }
        sbT.append(str);
        sbT.append(" lifecycleImpact = ");
        if (i2 == 1) {
            str2 = "NONE";
        } else if (i2 == 2) {
            str2 = "ADDING";
        } else if (i2 == 3) {
            str2 = "REMOVING";
        }
        sbT.append(str2);
        sbT.append(" fragment = ");
        sbT.append(this.c);
        sbT.append("}");
        return sbT.toString();
    }
}
