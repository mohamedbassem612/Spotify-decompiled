package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n7w0 {
    public final s7w0 a;
    public final ArrayList b;
    public final boolean c;
    public final b431 d;
    public final b431 e;

    public n7w0(g431 g431Var, s7w0 s7w0Var, uic uicVar) {
        this.a = s7w0Var;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.d = g431Var.a(uj1.u, new l7w0(this, (byte) 1));
        this.e = g431Var.a(i7w0.b, new l7w0(this, (byte) 0));
        this.c = true;
        List listL1 = o7h.l1(arrayList);
        arrayList.clear();
        Iterator it = listL1.iterator();
        while (it.hasNext()) {
            ((Function0) it.next()).invoke();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(String str, onm onmVar) throws Throwable {
        m7w0 m7w0Var;
        String str2;
        Object objL;
        Throwable th;
        Iterator it;
        Object evb1Var;
        Iterator it2;
        int i;
        if (onmVar instanceof m7w0) {
            m7w0Var = (m7w0) onmVar;
            int i2 = m7w0Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m7w0Var.d = i2 - Integer.MIN_VALUE;
            } else {
                m7w0Var = new m7w0(this, onmVar);
            }
        } else {
            m7w0Var = new m7w0(this, onmVar);
        }
        Object obj = m7w0Var.b;
        int i3 = m7w0Var.d;
        Throwable th2 = null;
        s7w0 s7w0Var = this.a;
        if (i3 == 0) {
            hm5.M(obj);
            str2 = str;
            m7w0Var.a = str2;
            m7w0Var.d = 1;
            objL = s7w0Var.l(m7w0Var);
            d9n d9nVar = d9n.a;
            if (objL == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str3 = m7w0Var.a;
            hm5.M(obj);
            objL = obj;
            str2 = str3;
        }
        d9w0 d9w0Var = (d9w0) objL;
        rih1 rih1Var = rih1.a;
        if (d9w0Var == null) {
            return rih1Var;
        }
        e9w0 e9w0Var = d9w0Var.a;
        String str4 = e9w0Var.a;
        ArrayList arrayList = e9w0Var.i;
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        int i4 = 0;
        while (it3.hasNext()) {
            Object next = it3.next();
            int i5 = i4 + 1;
            if (i4 < 0) {
                Throwable th3 = th2;
                p7h.T();
                throw th3;
            }
            f9w0 f9w0Var = (k9w0) next;
            String str5 = e9w0Var.e;
            if (f9w0Var instanceof f9w0) {
                th = th2;
                it = it3;
                evb1Var = new evb1(f4i1.c(i4, "location:"), new wne0(str5), null, f9w0Var.c, 4);
            } else if (f9w0Var instanceof g9w0) {
                String strC = f4i1.c(i4, "questionnaire:");
                g9w0 g9w0Var = (g9w0) f9w0Var;
                String str6 = g9w0Var.a;
                String str7 = g9w0Var.b;
                String str8 = g9w0Var.c;
                th = th2;
                Integer num = g9w0Var.d;
                boolean z = g9w0Var.e;
                ArrayList arrayList3 = g9w0Var.f;
                ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    c9w0 c9w0Var = (c9w0) it4.next();
                    Iterator it5 = it4;
                    String str9 = c9w0Var.a;
                    String str10 = c9w0Var.b;
                    String str11 = c9w0Var.c;
                    int iC = l1d.C(c9w0Var.d);
                    if (iC != 0) {
                        it2 = it3;
                        if (iC != 1) {
                            int i6 = 3;
                            if (iC != 2) {
                                if (iC != 3) {
                                    eg.o();
                                    return th;
                                }
                                i6 = 4;
                            }
                            i = i6;
                        } else {
                            i = 2;
                        }
                    } else {
                        it2 = it3;
                        i = 1;
                    }
                    arrayList4.add(new b4z0(i, str9, str10, c9w0Var.e, str11));
                    it4 = it5;
                    str6 = str6;
                    it3 = it2;
                }
                it = it3;
                String str12 = g9w0Var.g;
                h290 h290Var = g9w0Var.h;
                evb1Var = new evb1(strC, new m4z0(str6, str7, str8, num, z, arrayList4, str12, h290Var, 1, 1), null, h290Var, 4);
            } else {
                th = th2;
                it = it3;
                if (!(f9w0Var instanceof h9w0) && !(f9w0Var instanceof i9w0) && !(f9w0Var instanceof j9w0)) {
                    eg.o();
                    return th;
                }
                evb1Var = th;
            }
            if (evb1Var != null) {
                arrayList2.add(evb1Var);
            }
            rih1Var = rih1Var;
            th2 = th;
            i4 = i5;
            it3 = it;
        }
        rih1 rih1Var2 = rih1Var;
        Throwable th4 = th2;
        String str13 = e9w0Var.k;
        zlk1 zlk1Var = e9w0Var.h;
        if (zlk1Var == null) {
            bhn0.f(f4i1.f("Personalized preset ", str4, " has no voice"));
            return th4;
        }
        eso esoVar = new eso(str4, arrayList2, new dkn(str13, zlk1Var.a, (List) null, e9w0Var.g, 20));
        s7w0Var.t = esoVar;
        this.d.a(esoVar, str2);
        return rih1Var2;
    }
}
