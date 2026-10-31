package p;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class m0v0 implements h661, mtc {
    public final String a;
    public final pf40 b;
    public final int c;
    public int d = -1;
    public final String[] e;
    public final List[] f;
    public ArrayList g;
    public final boolean[] h;
    public Map i;
    public final znb0 j;
    public final znb0 k;
    public final znb0 l;

    public m0v0(String str, pf40 pf40Var, int i) {
        this.a = str;
        this.b = pf40Var;
        this.c = i;
        String[] strArr = new String[i];
        final byte b = 0;
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i3 = this.c;
        this.f = new List[i3];
        this.h = new boolean[i3];
        this.i = b7x.a;
        Function0 function0 = new Function0(this) { // from class: p.l0v0
            public final /* synthetic */ m0v0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                nma0[] nma0VarArrChildSerializers;
                ArrayList arrayList;
                nma0[] nma0VarArrTypeParametersSerializers;
                byte b2 = b;
                m0v0 m0v0Var = this.b;
                switch (b2) {
                    case 0:
                        pf40 pf40Var2 = m0v0Var.b;
                        return (pf40Var2 == null || (nma0VarArrChildSerializers = pf40Var2.childSerializers()) == null) ? z0o1.a : nma0VarArrChildSerializers;
                    case 1:
                        pf40 pf40Var3 = m0v0Var.b;
                        if (pf40Var3 == null || (nma0VarArrTypeParametersSerializers = pf40Var3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(nma0VarArrTypeParametersSerializers.length);
                            for (nma0 nma0Var : nma0VarArrTypeParametersSerializers) {
                                arrayList.add(nma0Var.getDescriptor());
                            }
                        }
                        return j0o1.q(arrayList);
                    default:
                        return Integer.valueOf(p6p1.s(m0v0Var, (h661[]) m0v0Var.k.getValue()));
                }
            }
        };
        final byte b2 = 2;
        this.j = dm5.S(2, function0);
        final byte b3 = 1;
        this.k = dm5.S(2, new Function0(this) { // from class: p.l0v0
            public final /* synthetic */ m0v0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                nma0[] nma0VarArrChildSerializers;
                ArrayList arrayList;
                nma0[] nma0VarArrTypeParametersSerializers;
                byte b4 = b3;
                m0v0 m0v0Var = this.b;
                switch (b4) {
                    case 0:
                        pf40 pf40Var2 = m0v0Var.b;
                        return (pf40Var2 == null || (nma0VarArrChildSerializers = pf40Var2.childSerializers()) == null) ? z0o1.a : nma0VarArrChildSerializers;
                    case 1:
                        pf40 pf40Var3 = m0v0Var.b;
                        if (pf40Var3 == null || (nma0VarArrTypeParametersSerializers = pf40Var3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(nma0VarArrTypeParametersSerializers.length);
                            for (nma0 nma0Var : nma0VarArrTypeParametersSerializers) {
                                arrayList.add(nma0Var.getDescriptor());
                            }
                        }
                        return j0o1.q(arrayList);
                    default:
                        return Integer.valueOf(p6p1.s(m0v0Var, (h661[]) m0v0Var.k.getValue()));
                }
            }
        });
        this.l = dm5.S(2, new Function0(this) { // from class: p.l0v0
            public final /* synthetic */ m0v0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                nma0[] nma0VarArrChildSerializers;
                ArrayList arrayList;
                nma0[] nma0VarArrTypeParametersSerializers;
                byte b4 = b2;
                m0v0 m0v0Var = this.b;
                switch (b4) {
                    case 0:
                        pf40 pf40Var2 = m0v0Var.b;
                        return (pf40Var2 == null || (nma0VarArrChildSerializers = pf40Var2.childSerializers()) == null) ? z0o1.a : nma0VarArrChildSerializers;
                    case 1:
                        pf40 pf40Var3 = m0v0Var.b;
                        if (pf40Var3 == null || (nma0VarArrTypeParametersSerializers = pf40Var3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(nma0VarArrTypeParametersSerializers.length);
                            for (nma0 nma0Var : nma0VarArrTypeParametersSerializers) {
                                arrayList.add(nma0Var.getDescriptor());
                            }
                        }
                        return j0o1.q(arrayList);
                    default:
                        return Integer.valueOf(p6p1.s(m0v0Var, (h661[]) m0v0Var.k.getValue()));
                }
            }
        });
    }

    @Override // p.mtc
    public final Set a() {
        return this.i.keySet();
    }

    @Override // p.h661
    public final int c(String str) {
        Integer num = (Integer) this.i.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // p.h661
    public final int d() {
        return this.c;
    }

    @Override // p.h661
    public final String e(int i) {
        return this.e[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m0v0) {
            h661 h661Var = (h661) obj;
            if (this.a.equals(h661Var.h()) && Arrays.equals((h661[]) this.k.getValue(), (h661[]) ((m0v0) obj).k.getValue())) {
                int iD = h661Var.d();
                int i = this.c;
                if (i == iD) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (u890.j(g(i2).h(), h661Var.g(i2).h()) && u890.j(g(i2).getKind(), h661Var.g(i2).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p.h661
    public final List f(int i) {
        List list = this.f[i];
        return list == null ? z6x.a : list;
    }

    @Override // p.h661
    public h661 g(int i) {
        return ((nma0[]) this.j.getValue())[i].getDescriptor();
    }

    @Override // p.h661
    public final List getAnnotations() {
        ArrayList arrayList = this.g;
        return arrayList == null ? z6x.a : arrayList;
    }

    @Override // p.h661
    public yoi1 getKind() {
        return uic1.h;
    }

    @Override // p.h661
    public final String h() {
        return this.a;
    }

    public int hashCode() {
        return ((Number) this.l.getValue()).intValue();
    }

    @Override // p.h661
    public final boolean i(int i) {
        return this.h[i];
    }

    public final void j(String str, boolean z) {
        int i = this.d + 1;
        this.d = i;
        String[] strArr = this.e;
        strArr[i] = str;
        this.h[i] = z;
        this.f[i] = null;
        if (i == this.c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                map.put(strArr[i2], Integer.valueOf(i2));
            }
            this.i = map;
        }
    }

    public final void k(Annotation annotation) {
        ArrayList arrayList = this.g;
        if (arrayList == null) {
            arrayList = new ArrayList(1);
            this.g = arrayList;
        }
        arrayList.add(annotation);
    }

    public String toString() {
        return p6p1.w(this);
    }
}
