package p;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class z7s implements o2i0 {
    public static final /* synthetic */ int e = 0;
    public final yjq a;
    public final lbq b;
    public sjb c;
    public boolean d;

    public z7s(Context context, vyr vyrVar) {
        lbq lbqVar = new lbq(context);
        sjb sjbVar = new sjb((byte) 7);
        this.b = lbqVar;
        this.c = sjbVar;
        yjq yjqVar = new yjq(vyrVar, sjbVar);
        this.a = yjqVar;
        if (lbqVar != ((lbq) yjqVar.e)) {
            yjqVar.e = lbqVar;
            ((HashMap) yjqVar.d).clear();
            ((HashMap) yjqVar.b).clear();
        }
    }

    public static o2i0 e(Class cls, k2r k2rVar) {
        try {
            return (o2i0) cls.getConstructor(k2r.class).newInstance(k2rVar);
        } catch (Exception e2) {
            bhn0.p(e2);
            return null;
        }
    }

    @Override // p.o2i0
    public final void a() {
        yjq yjqVar = this.a;
        synchronized (((vyr) yjqVar.c)) {
        }
        Iterator it = ((HashMap) yjqVar.b).values().iterator();
        while (it.hasNext()) {
            ((o2i0) it.next()).a();
        }
    }

    @Override // p.o2i0
    public final qba b(yoh0 yoh0Var) {
        cwr cwrVarM;
        f9v f9vVar;
        yoh0 yoh0VarA = yoh0Var;
        yoh0VarA.b.getClass();
        String scheme = yoh0VarA.b.a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        boolean zEquals = Objects.equals(yoh0VarA.b.b, "application/x-image-uri");
        soh0 soh0Var = yoh0VarA.b;
        if (zEquals) {
            long j = soh0Var.h;
            String str = zoi1.a;
            throw null;
        }
        int iN = zoi1.N(soh0Var.a, soh0Var.b);
        if (yoh0VarA.b.h != -9223372036854775807L) {
            vyr vyrVar = (vyr) this.a.c;
            synchronized (vyrVar) {
                vyrVar.e = true;
            }
            vyr vyrVar2 = (vyr) this.a.c;
            synchronized (vyrVar2) {
                vyrVar2.f = true;
            }
        }
        try {
            yjq yjqVar = this.a;
            HashMap map = (HashMap) yjqVar.b;
            o2i0 o2i0Var = (o2i0) map.get(Integer.valueOf(iN));
            if (o2i0Var == null) {
                o2i0Var = (o2i0) yjqVar.t(iN).get();
                o2i0Var.c((sjb) yjqVar.f);
                o2i0Var.a();
                o2i0Var.d();
                map.put(Integer.valueOf(iN), o2i0Var);
            }
            qoh0 qoh0VarA = yoh0VarA.c.a();
            roh0 roh0Var = yoh0VarA.c;
            if (roh0Var.a == -9223372036854775807L) {
                qoh0VarA.a = -9223372036854775807L;
            }
            if (roh0Var.d == -3.4028235E38f) {
                qoh0VarA.d = -3.4028235E38f;
            }
            if (roh0Var.e == -3.4028235E38f) {
                qoh0VarA.e = -3.4028235E38f;
            }
            if (roh0Var.b == -9223372036854775807L) {
                qoh0VarA.b = -9223372036854775807L;
            }
            if (roh0Var.c == -9223372036854775807L) {
                qoh0VarA.c = -9223372036854775807L;
            }
            roh0 roh0Var2 = new roh0(qoh0VarA);
            if (!roh0Var2.equals(yoh0VarA.c)) {
                koh0 koh0VarA = yoh0VarA.a();
                koh0VarA.l = roh0Var2.a();
                yoh0VarA = koh0VarA.a();
            }
            qba qbaVarB = o2i0Var.b(yoh0VarA);
            b380 b380Var = yoh0VarA.b.g;
            if (!b380Var.isEmpty()) {
                qba[] qbaVarArr = new qba[b380Var.size() + 1];
                qbaVarArr[0] = qbaVarB;
                for (int i = 0; i < b380Var.size(); i++) {
                    ge30 ge30Var = new ge30();
                    ge30Var.o = asj0.p(((voh0) b380Var.get(i)).b);
                    ge30Var.d = ((voh0) b380Var.get(i)).c;
                    ge30Var.e = ((voh0) b380Var.get(i)).d;
                    ge30Var.f = ((voh0) b380Var.get(i)).e;
                    ge30Var.b = ((voh0) b380Var.get(i)).f;
                    ge30Var.a = ((voh0) b380Var.get(i)).g;
                    ie30 ie30Var = new ie30(ge30Var);
                    uk4 uk4Var = new uk4(this, ie30Var, (byte) 16);
                    lbq lbqVar = this.b;
                    pjq0 pjq0Var = new pjq0(uk4Var, (byte) 27);
                    Object obj = new Object();
                    ij81 ij81Var = new ij81(-1, (byte) 12);
                    if (this.c.e(ie30Var)) {
                        ge30 ge30VarA = ie30Var.a();
                        ge30VarA.o = asj0.p("application/x-media3-cues");
                        ge30VarA.k = ie30Var.f66p;
                        ge30VarA.P = this.c.c(ie30Var);
                        ie30Var = new ie30(ge30VarA);
                    }
                    ie30 ie30Var2 = ie30Var;
                    int i2 = i + 1;
                    yoh0 yoh0VarD = yoh0.d(((voh0) b380Var.get(i)).a.toString());
                    yoh0VarD.b.getClass();
                    yoh0VarD.b.getClass();
                    poh0 poh0Var = yoh0VarD.b.c;
                    if (poh0Var == null) {
                        f9vVar = f9v.a;
                    } else {
                        synchronized (obj) {
                            try {
                                cwrVarM = !poh0Var.equals(null) ? k9r.m(poh0Var) : null;
                                cwrVarM.getClass();
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        f9vVar = cwrVarM;
                    }
                    qbaVarArr[i2] = new akx0(yoh0VarD, lbqVar, pjq0Var, f9vVar, ij81Var, 1048576, true, ie30Var2);
                }
                qbaVarB = new qvi0(qbaVarArr);
            }
            boolean z = this.d;
            noh0 noh0Var = yoh0VarA.e;
            if (noh0Var.b != 0 || noh0Var.d != Long.MIN_VALUE || noh0Var.f) {
                m3c m3cVar = new m3c(qbaVarB);
                noh0 noh0Var2 = yoh0VarA.e;
                dm5.y(!m3cVar.c);
                m3cVar.e = noh0Var2.a();
                dm5.y(!m3cVar.c);
                m3cVar.b = z;
                m3cVar.c = true;
                qbaVarB = new dpg(m3cVar);
            }
            yoh0VarA.b.getClass();
            if (yoh0VarA.b.d == null) {
                return qbaVarB;
            }
            oon1.H("Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
            return qbaVarB;
        } catch (ClassNotFoundException e2) {
            bhn0.p(e2);
            return null;
        }
    }

    @Override // p.o2i0
    public final void c(sjb sjbVar) {
        this.c = sjbVar;
        yjq yjqVar = this.a;
        yjqVar.f = sjbVar;
        vyr vyrVar = (vyr) yjqVar.c;
        synchronized (vyrVar) {
            vyrVar.d = sjbVar;
        }
        Iterator it = ((HashMap) yjqVar.b).values().iterator();
        while (it.hasNext()) {
            ((o2i0) it.next()).c(sjbVar);
        }
    }

    @Override // p.o2i0
    public final void d() {
        synchronized (((vyr) this.a.c)) {
        }
    }
}
