package p;

import androidx.constraintlayout.core.parser.CLParsingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class zhc extends aic {
    public ArrayList e;

    public zhc(char[] cArr) {
        super(cArr);
        this.e = new ArrayList();
    }

    public final aic A(String str) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            bic bicVar = (bic) ((aic) it.next());
            if (bicVar.d().equals(str)) {
                if (bicVar.e.size() <= 0) {
                    break;
                }
                return (aic) bicVar.e.get(0);
            }
        }
        return null;
    }

    public final String B(int i) throws CLParsingException {
        aic aicVarR = r(i);
        if (aicVarR instanceof gic) {
            return aicVarR.d();
        }
        throw new CLParsingException(f4i1.c(i, "no string at index "), this);
    }

    public final String C(String str) throws CLParsingException {
        aic aicVarS = s(str);
        if (aicVarS instanceof gic) {
            return aicVarS.d();
        }
        StringBuilder sbN = gvg.n("no string found for key <", str, ">, found [", aicVarS != null ? aicVarS.k() : null, "] : ");
        sbN.append(aicVarS);
        throw new CLParsingException(sbN.toString(), this);
    }

    public final String D() {
        aic aicVarZ = z(1);
        if (aicVarZ instanceof gic) {
            return aicVarZ.d();
        }
        return null;
    }

    public final String E(String str) {
        aic aicVarA = A(str);
        if (aicVarA instanceof gic) {
            return aicVarA.d();
        }
        return null;
    }

    public final boolean G(String str) {
        for (aic aicVar : this.e) {
            if ((aicVar instanceof bic) && ((bic) aicVar).d().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final ArrayList H() {
        ArrayList arrayList = new ArrayList();
        for (aic aicVar : this.e) {
            if (aicVar instanceof bic) {
                arrayList.add(((bic) aicVar).d());
            }
        }
        return arrayList;
    }

    public final void I(String str, aic aicVar) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            bic bicVar = (bic) ((aic) it.next());
            if (bicVar.d().equals(str)) {
                int size = bicVar.e.size();
                ArrayList arrayList = bicVar.e;
                if (size > 0) {
                    arrayList.set(0, aicVar);
                    return;
                } else {
                    arrayList.add(aicVar);
                    return;
                }
            }
        }
        bic bicVar2 = new bic(str.toCharArray());
        bicVar2.b = 0L;
        bicVar2.l(str.length() - 1);
        int size2 = bicVar2.e.size();
        ArrayList arrayList2 = bicVar2.e;
        if (size2 > 0) {
            arrayList2.set(0, aicVar);
        } else {
            arrayList2.add(aicVar);
        }
        this.e.add(bicVar2);
    }

    public final void J(String str, float f) {
        I(str, new cic(f));
    }

    public final void K(String str, String str2) {
        gic gicVar = new gic(str2.toCharArray());
        gicVar.b = 0L;
        gicVar.l(str2.length() - 1);
        I(str, gicVar);
    }

    @Override // p.aic
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zhc) {
            return this.e.equals(((zhc) obj).e);
        }
        return false;
    }

    @Override // p.aic
    public int hashCode() {
        return Objects.hash(this.e, Integer.valueOf(super.hashCode()));
    }

    public final void n(aic aicVar) {
        this.e.add(aicVar);
    }

    @Override // p.aic
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public zhc clone() {
        zhc zhcVar = (zhc) super.clone();
        ArrayList arrayList = new ArrayList(this.e.size());
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            arrayList.add(((aic) it.next()).clone());
        }
        zhcVar.e = arrayList;
        return zhcVar;
    }

    public final aic r(int i) throws CLParsingException {
        if (i < 0 || i >= this.e.size()) {
            throw new CLParsingException(f4i1.c(i, "no element at index "), this);
        }
        return (aic) this.e.get(i);
    }

    public final aic s(String str) throws CLParsingException {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            bic bicVar = (bic) ((aic) it.next());
            if (bicVar.d().equals(str)) {
                if (bicVar.e.size() > 0) {
                    return (aic) bicVar.e.get(0);
                }
                return null;
            }
        }
        throw new CLParsingException(f4i1.f("no element for key <", str, ">"), this);
    }

    public final int size() {
        return this.e.size();
    }

    public final yhc t(String str) {
        aic aicVarA = A(str);
        if (aicVarA instanceof yhc) {
            return (yhc) aicVarA;
        }
        return null;
    }

    @Override // p.aic
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (aic aicVar : this.e) {
            if (sb.length() > 0) {
                sb.append("; ");
            }
            sb.append(aicVar);
        }
        return super.toString() + " = <" + ((Object) sb) + " >";
    }

    public final float u(int i) throws CLParsingException {
        aic aicVarR = r(i);
        if (aicVarR != null) {
            return aicVarR.e();
        }
        throw new CLParsingException(f4i1.c(i, "no float at index "), this);
    }

    public final float v(String str) throws CLParsingException {
        aic aicVarS = s(str);
        if (aicVarS != null) {
            return aicVarS.e();
        }
        StringBuilder sbT = l1d.t("no float found for key <", str, ">, found [");
        sbT.append(aicVarS.k());
        sbT.append("] : ");
        sbT.append(aicVarS);
        throw new CLParsingException(sbT.toString(), this);
    }

    public final int w(int i) throws CLParsingException {
        aic aicVarR = r(i);
        if (aicVarR != null) {
            return aicVarR.i();
        }
        throw new CLParsingException(f4i1.c(i, "no int at index "), this);
    }

    public final int x(String str) throws CLParsingException {
        aic aicVarS = s(str);
        if (aicVarS != null) {
            return aicVarS.i();
        }
        StringBuilder sbT = l1d.t("no int found for key <", str, ">, found [");
        sbT.append(aicVarS.k());
        sbT.append("] : ");
        sbT.append(aicVarS);
        throw new CLParsingException(sbT.toString(), this);
    }

    public final eic y(String str) {
        aic aicVarA = A(str);
        if (aicVarA instanceof eic) {
            return (eic) aicVarA;
        }
        return null;
    }

    public final aic z(int i) {
        if (i < 0 || i >= this.e.size()) {
            return null;
        }
        return (aic) this.e.get(i);
    }
}
