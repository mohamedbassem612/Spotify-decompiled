package p;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i4z0 extends x7e0 implements b031 {
    public final xe01 X;
    public final wen0 Y;
    public final m4z0 d;
    public final tso e;
    public final eg40 f;
    public final hyy0 g;
    public final c9n h;
    public final n4z0 i;
    public final bpb1 t;

    public i4z0(m4z0 m4z0Var, tso tsoVar, eg40 eg40Var, hyy0 hyy0Var, c9n c9nVar) {
        this.d = m4z0Var;
        this.e = tsoVar;
        this.f = eg40Var;
        this.g = hyy0Var;
        this.h = c9nVar;
        mvb1 mvb1Var = tsoVar.c;
        lnm lnmVar = null;
        this.i = mvb1Var instanceof n4z0 ? (n4z0) mvb1Var : null;
        lvb1 lvb1Var = (lvb1) tsoVar.b.getValue();
        int i = (lvb1Var != null ? lvb1Var.a : m4z0Var.i) - 1;
        ArrayList<b4z0> arrayList = m4z0Var.f;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        for (b4z0 b4z0Var : arrayList) {
            n4z0 n4z0Var = this.i;
            String str = b4z0Var.a;
            arrayList2.add(new f4z0(str, b4z0Var.b, b4z0Var.c, n4z0Var != null ? n4z0Var.b.contains(str) : b4z0Var.e));
        }
        n4z0 n4z0Var2 = this.i;
        ArrayList arrayList3 = n4z0Var2 != null ? n4z0Var2.c : null;
        ArrayList<r6i1> arrayList4 = arrayList3 == null ? z6x.a : arrayList3;
        ArrayList arrayList5 = new ArrayList(q7h.U(arrayList4, 10));
        for (r6i1 r6i1Var : arrayList4) {
            arrayList5.add(new g4z0(r6i1Var.a, null, r6i1Var.b));
        }
        bpb1 bpb1VarB = gio1.b(new o4z0(i, "", o7h.N0(arrayList5, arrayList2), false));
        this.t = bpb1VarB;
        this.X = d5p1.h(bpb1VarB);
        this.Y = this.e.b;
        fn31.T(this.h, (o8n) null, 0, new c3u0(this, lnmVar, (byte) 26), 3);
    }

    public static ArrayList m(int i, List list, boolean z) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        int i2 = 0;
        for (Object obj : list2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                p7h.T();
                throw null;
            }
            h4z0 h4z0VarN = (h4z0) obj;
            if (i2 == i) {
                h4z0VarN = n(h4z0VarN, z);
            }
            arrayList.add(h4z0VarN);
            i2 = i3;
        }
        return arrayList;
    }

    public static h4z0 n(h4z0 h4z0Var, boolean z) {
        if (h4z0Var instanceof f4z0) {
            f4z0 f4z0Var = (f4z0) h4z0Var;
            return new f4z0(f4z0Var.a, f4z0Var.b, f4z0Var.c, z);
        }
        if (h4z0Var instanceof g4z0) {
            g4z0 g4z0Var = (g4z0) h4z0Var;
            return new g4z0(g4z0Var.a, g4z0Var.c, z);
        }
        eg.o();
        return null;
    }

    public final void a(Bundle bundle) {
        o4z0 parcelable = bundle.getParcelable("questionnaire-ui-state");
        if (parcelable != null) {
            o4z0 o4z0VarA = o4z0.a(parcelable, (ArrayList) null, (String) null, false, 7);
            bpb1 bpb1Var = this.t;
            bpb1Var.getClass();
            bpb1Var.m((Object) null, o4z0VarA);
        }
    }

    public final void e() {
        j();
        i();
    }

    public final o4z0 k(o4z0 o4z0Var, String str) {
        List list = o4z0Var.b;
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (nhc1.S(((h4z0) it.next()).getText(), str, true)) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (((h4z0) list.get(i)).f() || !l(o4z0Var)) ? o4z0.a(o4z0Var, (ArrayList) null, "", false, 11) : o4z0.a(o4z0Var, m(i, list, true), "", false, 9);
        }
        return o4z0.a(o4z0Var, o7h.O0(new g4z0(str, null, l(o4z0Var)), list), "", false, 9);
    }

    public final boolean l(o4z0 o4z0Var) {
        int i;
        m4z0 m4z0Var = this.d;
        if (m4z0Var.d == null) {
            return true;
        }
        List list = o4z0Var.b;
        if ((list instanceof Collection) && list.isEmpty()) {
            i = 0;
        } else {
            Iterator it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((h4z0) it.next()).f() && (i = i + 1) < 0) {
                    p7h.S();
                    throw null;
                }
            }
        }
        return i < m4z0Var.d.intValue();
    }

    public final Bundle serialize() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("questionnaire-ui-state", o4z0.a((o4z0) this.t.getValue(), (ArrayList) null, (String) null, false, 7));
        return bundle;
    }

    public final void f() {
    }
}
