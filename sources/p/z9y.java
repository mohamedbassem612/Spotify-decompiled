package p;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class z9y implements tyq {
    public final ia00 X;
    public final ljm0 Y;
    public final psw Z;
    public final d0r a;
    public final jdp b;
    public final kdp c;
    public final ldp d;
    public final mdp e;
    public final a1r0 f;
    public final tl40 g;
    public final tl40 h;
    public final sp00 i;
    public final o3r t;

    public z9y(d0r d0rVar, jdp jdpVar, kdp kdpVar, ldp ldpVar, mdp mdpVar, a1r0 a1r0Var, tl40 tl40Var, tl40 tl40Var2, sp00 sp00Var) {
        this.a = d0rVar;
        this.b = jdpVar;
        this.c = kdpVar;
        this.d = ldpVar;
        this.e = mdpVar;
        this.f = a1r0Var;
        this.g = tl40Var;
        this.h = tl40Var2;
        this.i = sp00Var;
        jd11 jd11Var = rc11.a;
        this.t = w3p1.m(new l4r(new wlu(jd11Var.b(xkk1.class)), 1, x0y.U0, new j4r(x0y.P0), x0y.V0), new l4r(new wlu(jd11Var.b(jo70.class)), 1, x0y.W0, new j4r(x0y.Q0), x0y.X0), new l4r(new wlu(jd11Var.b(eid.class)), 2, x0y.S0, new j4r(x0y.R0), x0y.T0), gft.T0);
        this.X = n3o1.q(this).a(c9x.X, c9x.Y);
        this.Y = h7w.D(new w9y(this, (byte) 0), (bs50) null, new w9y(this, (byte) 1), new j2i(1210576039, new sw1(this, (byte) 11), true), 2);
        j2i j2iVar = new j2i(-1267425601, new ent(this, (byte) 25), true);
        ien0 ien0Var = qsw.a;
        this.Z = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.X;
    }

    public final jsw c() {
        return this.Z;
    }

    public final d0r e() {
        return this.a;
    }

    public final v9y f(u9y u9yVar) {
        sl40 sl40Var;
        chf0 chf0Var;
        int i;
        msd ksdVar;
        String str = u9yVar.c;
        a9y a9yVar = this.h.a;
        long jB = a9yVar.a.b();
        ConcurrentHashMap concurrentHashMap = a9yVar.b;
        concurrentHashMap.entrySet().removeIf(new z8y((byte) 0, jB));
        y8y y8yVar = (y8y) concurrentHashMap.get(str);
        x8y x8yVar = y8yVar != null ? y8yVar.a : null;
        if (x8yVar != null) {
            v8y v8yVar = x8yVar.b;
            if (v8yVar instanceof u8y) {
                kw9 kw9Var = ((u8y) v8yVar).a;
                long jE = z4p1.e(kw9Var.a);
                long jE2 = z4p1.e(kw9Var.b);
                long jE3 = z4p1.e(x8yVar.c);
                ksdVar = new lsd(new d9h(jE, jE2, jE3, jE3, jE3));
            } else {
                if (!(v8yVar instanceof t8y)) {
                    eg.o();
                    return null;
                }
                t8y t8yVar = (t8y) v8yVar;
                String str2 = t8yVar.a;
                ksdVar = new ksd(new ax70(t8yVar.b, str2, str2));
            }
            msd msdVar = ksdVar;
            chf0 chf0Var2 = x8yVar.d;
            int i2 = x8yVar.e;
            boolean z = x8yVar.f;
            ArrayList<w8y> arrayList = x8yVar.g;
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
            for (w8y w8yVar : arrayList) {
                arrayList2.add(new t5t0(w8yVar.a, w8yVar.b, w8yVar.c, w8yVar.d, w8yVar.e, w8yVar.f, w8yVar.g));
            }
            sl40Var = new sl40(msdVar, chf0Var2, i2, z, arrayList2);
        } else {
            sl40Var = null;
        }
        String str3 = u9yVar.a;
        long j = u9yVar.b;
        String str4 = u9yVar.c;
        msd msdVar2 = sl40Var != null ? sl40Var.a : null;
        if (sl40Var == null || (chf0Var = sl40Var.b) == null) {
            chf0Var = chf0.a;
        }
        chf0 chf0Var3 = chf0Var;
        if (sl40Var == null || (i = sl40Var.c) == 0) {
            i = 1;
        }
        return new v9y(str3, j, str4, false, null, msdVar2, null, null, null, chf0Var3, i, sl40Var != null ? sl40Var.d : false, sl40Var != null ? sl40Var.e : z6x.a, 1976);
    }

    public final mqw getBehavior() {
        return this.Y;
    }

    public final f4r getData() {
        return this.t;
    }
}
