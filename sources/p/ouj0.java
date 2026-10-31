package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ouj0 implements shm {
    public final z6k0 a;
    public final mnk0 b;
    public final uu00 c;
    public final huj0 d;
    public final p410 e;
    public final boolean f;
    public final o3r g = w3p1.o(new l4r(pwc0.e, 1, ktj0.f, new j4r(ktj0.d), ktj0.g), ktj0.e);

    public ouj0(z6k0 z6k0Var, mnk0 mnk0Var, uu00 uu00Var, huj0 huj0Var, p410 p410Var, boolean z) {
        this.a = z6k0Var;
        this.b = mnk0Var;
        this.c = uu00Var;
        this.d = huj0Var;
        this.e = p410Var;
        this.f = z;
    }

    public static boolean c(qxc0 qxc0Var) {
        List list = qxc0Var.N0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (u890.j(((ll81) it.next()).a, "mix-remove-opt-out")) {
                    return true;
                }
            }
        }
        return d(qxc0Var);
    }

    public static boolean d(qxc0 qxc0Var) {
        List list = qxc0Var.N0;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (u890.j(((ll81) it.next()).a, "mix-opt-out")) {
                return true;
            }
        }
        return false;
    }

    @Override // p.shm
    public final mr20 a(hti0 hti0Var, rzq rzqVar) {
        qxc0 qxc0Var = hti0Var.d;
        if (qxc0Var == null) {
            return new huz((Object) null, (byte) 10);
        }
        String str = hti0Var.a;
        return h5p1.s(f(str), this.b.a, new p1e0(d3p1.F(rzqVar, this.g, str), (byte) 17), new xj10(this, qxc0Var, str, (lnm) null, (byte) 1));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // p.shm
    public final Object b(hti0 hti0Var, d0r d0rVar, lnm lnmVar) {
        iuj0 iuj0Var;
        String str;
        fpo fpoVar;
        Object objI;
        ouj0 ouj0Var;
        qxc0 qxc0Var;
        d0r d0rVar2;
        String str2;
        if (lnmVar instanceof iuj0) {
            iuj0Var = (iuj0) lnmVar;
            int i = iuj0Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                iuj0Var.i = i - Integer.MIN_VALUE;
            } else {
                iuj0Var = new iuj0(this, (onm) lnmVar);
            }
        } else {
            iuj0Var = new iuj0(this, (onm) lnmVar);
        }
        iuj0 iuj0Var2 = iuj0Var;
        Object obj = iuj0Var2.g;
        int i2 = iuj0Var2.i;
        lnm lnmVar2 = null;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            qxc0 qxc0Var2 = hti0Var.d;
            if (qxc0Var2 == null) {
                return null;
            }
            str = hti0Var.a;
            fpoVar = new fpo(this, str, (lnm) null, (byte) 21);
            mr20 mr20Var = this.b.a;
            iuj0Var2.a = d0rVar;
            iuj0Var2.b = str;
            iuj0Var2.c = this;
            iuj0Var2.d = qxc0Var2;
            iuj0Var2.e = str;
            iuj0Var2.f = fpoVar;
            iuj0Var2.i = 1;
            objI = b5p1.i(mr20Var, iuj0Var2);
            if (objI != d9nVar) {
                ouj0Var = this;
                qxc0Var = qxc0Var2;
                d0rVar2 = d0rVar;
                str2 = str;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj);
                return obj;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        fpoVar = iuj0Var2.f;
        String str3 = iuj0Var2.e;
        qxc0 qxc0Var3 = iuj0Var2.d;
        ouj0 ouj0Var2 = iuj0Var2.c;
        String str4 = iuj0Var2.b;
        d0r d0rVar3 = iuj0Var2.a;
        hm5.M(obj);
        objI = obj;
        d0rVar2 = d0rVar3;
        qxc0Var = qxc0Var3;
        str2 = str3;
        str = str4;
        ouj0Var = ouj0Var2;
        fpo fpoVar2 = fpoVar;
        ibk0 ibk0Var = (ibk0) objI;
        l24 l24Var = new l24((Object) this, (Object) d0rVar2, (Object) str, lnmVar2, (byte) 12);
        iuj0Var2.a = null;
        iuj0Var2.b = null;
        iuj0Var2.c = null;
        iuj0Var2.d = null;
        iuj0Var2.e = null;
        iuj0Var2.f = null;
        iuj0Var2.i = 2;
        Object objG = ouj0Var.g(qxc0Var, str2, fpoVar2, ibk0Var, l24Var, iuj0Var2);
        return objG == d9nVar ? d9nVar : objG;
    }

    public final tm81 e(boolean z) {
        int i;
        boolean z2 = this.f;
        if (z2 && z) {
            i = 3;
        } else {
            i = (!z2 || z) ? 0 : 1;
        }
        return new tm81(i, 6, "playlist_mixing", (iu30) null, false);
    }

    public final sii0 f(String str) {
        return new sii0(new zx60(yoi1.g(this.c.b(new oi("mix-toggle-context-menu-item", false, new fki0(str, (byte) 8)))), (byte) 25), str, (byte) 1);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x011e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0124  */
    /* JADX WARN: Code duplicated, block: B:38:0x0127  */
    /* JADX WARN: Code duplicated, block: B:44:0x013f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0149  */
    /* JADX WARN: Code duplicated, block: B:52:0x0161  */
    /* JADX WARN: Code duplicated, block: B:62:0x019d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x019f  */
    /* JADX WARN: Code duplicated, block: B:66:0x01be  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:86:0x020e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:89:0x0204 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:? A[LOOP:0: B:79:0x01f0->B:90:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:? A[LOOP:1: B:45:0x0143->B:93:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d9, code lost:
    
        if (r3 == r15) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(p.qxc0 r18, java.lang.String r19, p.iu30 r20, p.ibk0 r21, p.iu30 r22, p.onm r23) {
        /*
            Method dump skipped, instruction units count: 529
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ouj0.g(p.qxc0, java.lang.String, p.iu30, p.ibk0, p.iu30, p.onm):java.lang.Object");
    }

    public final boolean h(qxc0 qxc0Var, wuj0 wuj0Var, boolean z) {
        boolean z2;
        Map map = qxc0Var.X;
        this.a.getClass();
        boolean z3 = z6k0.b(map) || qxc0Var.t.c;
        boolean z4 = wuj0Var != null ? wuj0Var.a : false;
        boolean z5 = Boolean.parseBoolean((String) qxc0Var.X.get("is_video_first"));
        List list = qxc0Var.N0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                if (u890.j(((ll81) it.next()).a, "mix-auto-toggle-off")) {
                    z2 = true;
                    break;
                }
            }
        } else {
            z2 = false;
            break;
        }
        return z && !z3 && z4 && (!z5 || z2);
    }
}
