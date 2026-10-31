package p;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class r30 implements xpw {
    public final idd1 N0 = new idd1(new g3(this, (byte) 8));
    public final mr20 O0;
    public final js20 P0;
    public final ia00 Q0;
    public final t30 R0;
    public final zr00 X;
    public final yh2 Y;
    public final boolean Z;
    public final gw70 a;
    public final kko b;
    public final bpb1 c;
    public final myq0 d;
    public final htr e;
    public final ggv f;
    public final ahr g;
    public final Context h;
    public final vgm i;
    public final lo60 t;

    public r30(gw70 gw70Var, kko kkoVar, bpb1 bpb1Var, myq0 myq0Var, htr htrVar, ggv ggvVar, ahr ahrVar, Context context, vgm vgmVar, lo60 lo60Var, kly0 kly0Var, zr00 zr00Var, yh2 yh2Var, boolean z, hs00 hs00Var, zob1 zob1Var) {
        this.a = gw70Var;
        this.b = kkoVar;
        this.c = bpb1Var;
        this.d = myq0Var;
        this.e = htrVar;
        this.f = ggvVar;
        this.g = ahrVar;
        this.h = context;
        this.i = vgmVar;
        this.t = lo60Var;
        this.X = zr00Var;
        this.Y = yh2Var;
        this.Z = z;
        this.O0 = hs00Var != null ? yoi1.g(hs00Var.d()) : h4p1.m(w7x.a);
        this.P0 = x3p1.n(new p30(zob1Var, this), new p30(this, zob1Var), new ab(this, (byte) 5), (o8n) null, (iu30) null, 24);
        this.Q0 = n3o1.q(this).a(n1.O0, n1.P0);
        this.R0 = new t30(kly0Var, new q30(this, (byte) 0));
    }

    public final rqw a() {
        return this.Q0;
    }

    public final jsw c() {
        return this.R0;
    }

    public final n30 e(j30 j30Var, k30 k30Var) {
        int i;
        String str;
        d40 d40Var;
        goj0 goj0VarA;
        goj0 goj0VarA2;
        if (j30Var.b() == null) {
            return new m30(k30Var.b(), k30Var.a());
        }
        ioj0 ioj0VarB = j30Var.b();
        c380 c380VarC = k30Var.c();
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = c380VarC.iterator();
        while (true) {
            i = 0;
            zBooleanValue = false;
            boolean zBooleanValue = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            i30 i30Var = (i30) next;
            hoj0 hoj0VarC = ioj0VarB.c(gw81.class, i30Var.a());
            if (hoj0VarC != null ? hoj0VarC instanceof goj0 : false) {
                String str2 = (String) o7h.t0(0, i30Var.b());
                if (str2 != null) {
                    hoj0 hoj0VarC2 = ioj0VarB.c(gw81.class, str2);
                    Boolean boolValueOf = hoj0VarC2 != null ? Boolean.valueOf(hoj0VarC2 instanceof goj0) : null;
                    if (boolValueOf != null) {
                        zBooleanValue = boolValueOf.booleanValue();
                    }
                }
                if (zBooleanValue) {
                    arrayList.add(next);
                }
            }
        }
        String strB = k30Var.b();
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        for (Object obj : arrayList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                p7h.T();
                throw null;
            }
            i30 i30Var2 = (i30) obj;
            if (j30Var.a().contains(i30Var2.a()) || (str = (String) o7h.t0(i, i30Var2.b())) == null || j30Var.a().contains(str)) {
                d40Var = null;
            } else {
                ioj0 ioj0VarB2 = j30Var.b();
                String strA = i30Var2.a();
                hoj0 hoj0VarC3 = ioj0VarB2.c(gw81.class, strA);
                ez00 ez00Var = (hoj0VarC3 == null || (goj0VarA2 = hoj0VarC3.a()) == null) ? null : (ez00) goj0VarA2.a;
                if (ez00Var == null) {
                    hhg1.f(f4i1.f(gw81.class.getSimpleName(), " not found for uri: ", strA));
                    return null;
                }
                gw81 gw81Var = (gw81) ez00Var;
                String strA2 = qyo1.A(alk1.a(i30Var2.a()), j30Var.b());
                mgo0 mgo0Var = this.Z ? new mgo0(i30Var2.a(), gw81Var.b, 1, strA2) : null;
                hoj0 hoj0VarC4 = j30Var.b().c(gw81.class, str);
                ez00 ez00Var2 = (hoj0VarC4 == null || (goj0VarA = hoj0VarC4.a()) == null) ? null : (ez00) goj0VarA.a;
                if (ez00Var2 == null) {
                    hhg1.f(f4i1.f(gw81.class.getSimpleName(), " not found for uri: ", str));
                    return null;
                }
                gw81 gw81Var2 = (gw81) ez00Var2;
                d40Var = new d40(strA2, gw81Var2.b, gw81Var2.c, str, gw81Var2.d, gw81Var2.e, gw81Var2.j, gw81Var2.i, mgo0Var);
            }
            if (d40Var != null) {
                arrayList2.add(d40Var);
            }
            i2 = i3;
            i = 0;
        }
        return new l30(strB, k30Var.a(), mqo1.A(arrayList2));
    }

    public final mqw getBehavior() {
        return this.P0;
    }
}
