package p;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class don0 extends vnn0 implements Iterable, ola0 {
    public static final /* synthetic */ int P0 = 0;
    public String N0;
    public String O0;
    public final ina1 Y;
    public int Z;

    public don0(fon0 fon0Var) {
        super(fon0Var);
        this.Y = new ina1(0);
    }

    @Override // p.vnn0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof don0) || !super.equals(obj)) {
            return false;
        }
        ina1 ina1Var = this.Y;
        int iG = ina1Var.g();
        don0 don0Var = (don0) obj;
        ina1 ina1Var2 = don0Var.Y;
        if (iG != ina1Var2.g() || this.Z != don0Var.Z) {
            return false;
        }
        for (vnn0 vnn0Var : z561.Q(new d7(ina1Var, (byte) 4))) {
            if (!vnn0Var.equals(dio1.r(ina1Var2, vnn0Var.h))) {
                return false;
            }
        }
        return true;
    }

    @Override // p.vnn0
    public final tnn0 f(kqi0 kqi0Var) {
        return q(kqi0Var, false, this);
    }

    @Override // p.vnn0
    public final int hashCode() {
        int iD = this.Z;
        ina1 ina1Var = this.Y;
        int iG = ina1Var.g();
        for (int i = 0; i < iG; i++) {
            iD = (((iD * 31) + ina1Var.d(i)) * 31) + ((vnn0) ina1Var.h(i)).hashCode();
        }
        return iD;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new con0(this);
    }

    @Override // p.vnn0
    public final void k(Context context, AttributeSet attributeSet) {
        String strValueOf;
        super.k(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, dmz0.d);
        s(typedArrayObtainAttributes.getResourceId(0, 0));
        int i = this.Z;
        if (i <= 16777215) {
            strValueOf = String.valueOf(i);
        } else {
            try {
                strValueOf = context.getResources().getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                strValueOf = String.valueOf(i);
            }
        }
        this.N0 = strValueOf;
        typedArrayObtainAttributes.recycle();
    }

    public final void n(vnn0 vnn0Var) {
        int i = vnn0Var.h;
        String str = vnn0Var.i;
        if (i == 0 && str == null) {
            hhg1.n("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
            return;
        }
        String str2 = this.i;
        if (str2 != null && u890.j(str, str2)) {
            bhn0.l("Destination ", vnn0Var, " cannot have the same route as graph ", this);
            return;
        }
        if (i == this.h) {
            bhn0.l("Destination ", vnn0Var, " cannot have the same id as graph ", this);
            return;
        }
        ina1 ina1Var = this.Y;
        vnn0 vnn0Var2 = (vnn0) dio1.r(ina1Var, i);
        if (vnn0Var2 == vnn0Var) {
            return;
        }
        if (vnn0Var.b != null) {
            eg.m("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
            return;
        }
        if (vnn0Var2 != null) {
            vnn0Var2.b = null;
        }
        vnn0Var.b = this;
        ina1Var.e(vnn0Var.h, vnn0Var);
    }

    public final vnn0 o(String str, boolean z) {
        Object next;
        don0 don0Var;
        vnn0 vnn0Var;
        Iterator it = z561.Q(new d7(this.Y, (byte) 4)).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            vnn0Var = (vnn0) next;
            if (nhc1.S(vnn0Var.i, str, false)) {
                break;
            }
        } while (vnn0Var.i(str) == null);
        vnn0 vnn0Var2 = (vnn0) next;
        if (vnn0Var2 != null) {
            return vnn0Var2;
        }
        if (!z || (don0Var = this.b) == null || ihc1.y0(str)) {
            return null;
        }
        return don0Var.o(str, true);
    }

    public final vnn0 p(int i, don0 don0Var, boolean z) {
        ina1 ina1Var = this.Y;
        vnn0 vnn0VarP = (vnn0) dio1.r(ina1Var, i);
        if (vnn0VarP != null) {
            return vnn0VarP;
        }
        if (z) {
            Iterator it = z561.Q(new d7(ina1Var, (byte) 4)).iterator();
            do {
                if (!it.hasNext()) {
                    vnn0VarP = null;
                    break;
                }
                vnn0 vnn0Var = (vnn0) it.next();
                vnn0VarP = (!(vnn0Var instanceof don0) || vnn0Var.equals(don0Var)) ? null : ((don0) vnn0Var).p(i, this, true);
            } while (vnn0VarP == null);
        }
        if (vnn0VarP != null) {
            return vnn0VarP;
        }
        don0 don0Var2 = this.b;
        if (don0Var2 == null || don0Var2.equals(don0Var)) {
            return null;
        }
        don0 don0Var3 = this.b;
        don0Var3.getClass();
        return don0Var3.p(i, this, z);
    }

    public final tnn0 q(kqi0 kqi0Var, boolean z, don0 don0Var) {
        tnn0 tnn0VarQ;
        tnn0 tnn0VarF = super.f(kqi0Var);
        ArrayList arrayList = new ArrayList();
        con0 con0Var = new con0(this);
        while (true) {
            tnn0VarQ = null;
            if (!con0Var.hasNext()) {
                break;
            }
            vnn0 vnn0Var = (vnn0) con0Var.next();
            tnn0VarQ = u890.j(vnn0Var, don0Var) ? null : vnn0Var.f(kqi0Var);
            if (tnn0VarQ != null) {
                arrayList.add(tnn0VarQ);
            }
        }
        tnn0 tnn0Var = (tnn0) o7h.D0(arrayList);
        don0 don0Var2 = this.b;
        if (don0Var2 != null && z && !don0Var2.equals(don0Var)) {
            tnn0VarQ = don0Var2.q(kqi0Var, true, this);
        }
        return (tnn0) o7h.D0(f46.i0(new tnn0[]{tnn0VarF, tnn0Var, tnn0VarQ}));
    }

    public final tnn0 r(String str, boolean z, don0 don0Var) {
        tnn0 tnn0VarR;
        tnn0 tnn0VarI = i(str);
        ArrayList arrayList = new ArrayList();
        con0 con0Var = new con0(this);
        while (true) {
            tnn0VarR = null;
            if (!con0Var.hasNext()) {
                break;
            }
            vnn0 vnn0Var = (vnn0) con0Var.next();
            if (!u890.j(vnn0Var, don0Var)) {
                tnn0VarR = vnn0Var instanceof don0 ? ((don0) vnn0Var).r(str, false, this) : vnn0Var.i(str);
            }
            if (tnn0VarR != null) {
                arrayList.add(tnn0VarR);
            }
        }
        tnn0 tnn0Var = (tnn0) o7h.D0(arrayList);
        don0 don0Var2 = this.b;
        if (don0Var2 != null && z && !don0Var2.equals(don0Var)) {
            tnn0VarR = don0Var2.r(str, true, this);
        }
        return (tnn0) o7h.D0(f46.i0(new tnn0[]{tnn0VarI, tnn0Var, tnn0VarR}));
    }

    public final void s(int i) {
        if (i != this.h) {
            if (this.O0 != null) {
                t(null);
            }
            this.Z = i;
            this.N0 = null;
            return;
        }
        throw new IllegalArgumentException(("Start destination " + i + " cannot use the same id as the graph " + this).toString());
    }

    public final void t(String str) {
        int iHashCode;
        if (str == null) {
            iHashCode = 0;
        } else if (str.equals(this.i)) {
            bhn0.l("Start destination ", str, " cannot use the same route as the graph ", this);
            return;
        } else {
            if (ihc1.y0(str)) {
                hhg1.n("Cannot have an empty start destination route");
                return;
            }
            iHashCode = "android-app://androidx.navigation/".concat(str).hashCode();
        }
        this.Z = iHashCode;
        this.O0 = str;
    }

    @Override // p.vnn0
    public final String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        String str = this.O0;
        vnn0 vnn0VarO = (str == null || ihc1.y0(str)) ? null : o(str, true);
        if (vnn0VarO == null) {
            vnn0VarO = p(this.Z, this, false);
        }
        sb.append(" startDestination=");
        if (vnn0VarO == null) {
            String str2 = this.O0;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = this.N0;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + Integer.toHexString(this.Z));
                }
            }
        } else {
            sb.append("{");
            sb.append(vnn0VarO.toString());
            sb.append("}");
        }
        return sb.toString();
    }
}
