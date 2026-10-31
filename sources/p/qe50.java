package p;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qe50 implements im41, k2q0, em00 {
    public final zsc N0;
    public Boolean X;
    public final cwh0 Y;
    public final dwl1 Z;
    public final Context a;
    public final w4t c;
    public boolean d;
    public final lsw0 g;
    public final t8r0 h;
    public final btk i;
    public final HashMap b = new HashMap();
    public final Object e = new Object();
    public final esa1 f = nkb1.create();
    public final HashMap t = new HashMap();

    static {
        qs10.c("GreedyScheduler");
    }

    public qe50(Context context, btk btkVar, z2g1 z2g1Var, lsw0 lsw0Var, t8r0 t8r0Var, dwl1 dwl1Var) {
        this.a = context;
        sun sunVar = btkVar.f;
        this.c = new w4t(this, sunVar, btkVar.d);
        this.N0 = new zsc(sunVar, t8r0Var);
        this.Z = dwl1Var;
        this.Y = new cwh0(z2g1Var);
        this.i = btkVar;
        this.g = lsw0Var;
        this.h = t8r0Var;
    }

    @Override // p.em00
    public final void a(uvl1 uvl1Var, boolean z) {
        faa0 faa0Var;
        mkb1 mkb1VarN = this.f.n(uvl1Var);
        if (mkb1VarN != null) {
            this.N0.e(mkb1VarN);
        }
        synchronized (this.e) {
            faa0Var = (faa0) this.b.remove(uvl1Var);
        }
        if (faa0Var != null) {
            qs10 qs10VarA = qs10.a();
            Objects.toString(uvl1Var);
            qs10VarA.getClass();
            faa0Var.d((CancellationException) null);
        }
        if (z) {
            return;
        }
        synchronized (this.e) {
            this.t.remove(uvl1Var);
        }
    }

    @Override // p.im41
    public final void b(String str) {
        Runnable runnable;
        Boolean boolValueOf = this.X;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(jsw0.a(this.a));
            this.X = boolValueOf;
        }
        if (!boolValueOf.booleanValue()) {
            qs10.a().getClass();
            return;
        }
        if (!this.d) {
            this.g.a(this);
            this.d = true;
        }
        qs10.a().getClass();
        w4t w4tVar = this.c;
        if (w4tVar != null && (runnable = (Runnable) w4tVar.c.remove(str)) != null) {
            w4tVar.b.a(runnable);
        }
        for (mkb1 mkb1Var : this.f.z(str)) {
            this.N0.e(mkb1Var);
            this.h.p(mkb1Var, -512);
        }
    }

    @Override // p.k2q0
    public final void c(vwl1 vwl1Var, ojl ojlVar) {
        uvl1 uvl1VarZ = yoi1.z(vwl1Var);
        boolean z = ojlVar instanceof mjl;
        t8r0 t8r0Var = this.h;
        zsc zscVar = this.N0;
        esa1 esa1Var = this.f;
        if (z) {
            if (esa1Var.k(uvl1VarZ)) {
                return;
            }
            qs10 qs10VarA = qs10.a();
            uvl1VarZ.toString();
            qs10VarA.getClass();
            mkb1 mkb1VarH = esa1Var.h(uvl1VarZ);
            zscVar.I(mkb1VarH);
            ((dwl1) t8r0Var.b).a(new vqh0(t8r0Var, mkb1VarH, (Object) null, (byte) 21));
            return;
        }
        qs10 qs10VarA2 = qs10.a();
        uvl1VarZ.toString();
        qs10VarA2.getClass();
        mkb1 mkb1VarN = esa1Var.n(uvl1VarZ);
        if (mkb1VarN != null) {
            zscVar.e(mkb1VarN);
            t8r0Var.p(mkb1VarN, ((njl) ojlVar).a);
        }
    }

    @Override // p.im41
    public final boolean d() {
        return false;
    }

    @Override // p.im41
    public final void e(vwl1... vwl1VarArr) {
        qe50 qe50Var;
        long jMax;
        Boolean boolValueOf = this.X;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(jsw0.a(this.a));
            this.X = boolValueOf;
        }
        if (!boolValueOf.booleanValue()) {
            qs10.a().getClass();
            return;
        }
        if (!this.d) {
            this.g.a(this);
            this.d = true;
        }
        HashSet<vwl1> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (vwl1 vwl1Var : vwl1VarArr) {
            if (!this.f.k(yoi1.z(vwl1Var))) {
                synchronized (this.e) {
                    try {
                        uvl1 uvl1VarZ = yoi1.z(vwl1Var);
                        pe50 pe50Var = (pe50) this.t.get(uvl1VarZ);
                        if (pe50Var == null) {
                            int i = vwl1Var.k;
                            ytw0 ytw0Var = this.i.d;
                            pe50Var = new pe50(i, System.currentTimeMillis());
                            this.t.put(uvl1VarZ, pe50Var);
                        }
                        jMax = (((long) Math.max((vwl1Var.k - pe50Var.a) - 5, 0)) * 30000) + pe50Var.b;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                long jMax2 = Math.max(vwl1Var.a(), jMax);
                ytw0 ytw0Var2 = this.i.d;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (vwl1Var.b == wvl1.a) {
                    if (jCurrentTimeMillis < jMax2) {
                        w4t w4tVar = this.c;
                        if (w4tVar != null) {
                            sun sunVar = w4tVar.b;
                            HashMap map = w4tVar.c;
                            Runnable runnable = (Runnable) map.remove(vwl1Var.a);
                            if (runnable != null) {
                                sunVar.a(runnable);
                            }
                            nx30 nx30Var = new nx30(w4tVar, vwl1Var, false, (byte) 18);
                            map.put(vwl1Var.a, nx30Var);
                            sunVar.c(nx30Var, jMax2 - System.currentTimeMillis());
                        }
                    } else if (!u890.j(gjl.j, vwl1Var.j)) {
                        gjl gjlVar = vwl1Var.j;
                        if (gjlVar.d) {
                            qs10 qs10VarA = qs10.a();
                            vwl1Var.toString();
                            qs10VarA.getClass();
                        } else if (gjlVar.i.isEmpty()) {
                            hashSet.add(vwl1Var);
                            hashSet2.add(vwl1Var.a);
                        } else {
                            qs10 qs10VarA2 = qs10.a();
                            vwl1Var.toString();
                            qs10VarA2.getClass();
                        }
                    } else if (!this.f.k(yoi1.z(vwl1Var))) {
                        qs10.a().getClass();
                        mkb1 mkb1VarD = this.f.d(vwl1Var);
                        this.N0.I(mkb1VarD);
                        t8r0 t8r0Var = this.h;
                        ((dwl1) t8r0Var.b).a(new vqh0(t8r0Var, mkb1VarD, (Object) null, (byte) 21));
                    }
                }
            }
        }
        synchronized (this.e) {
            try {
                if (!hashSet.isEmpty()) {
                    TextUtils.join(",", hashSet2);
                    qs10.a().getClass();
                    for (vwl1 vwl1Var2 : hashSet) {
                        uvl1 uvl1VarZ2 = yoi1.z(vwl1Var2);
                        if (this.b.containsKey(uvl1VarZ2)) {
                            qe50Var = this;
                        } else {
                            cwh0 cwh0Var = this.Y;
                            q8n q8nVar = this.Z.b;
                            int i2 = mvl1.a;
                            qe50Var = this;
                            qe50Var.b.put(uvl1VarZ2, c921.y(smo1.e(q8nVar), (o8n) null, 0, new vxg1(cwh0Var, vwl1Var2, qe50Var, (lnm) null, (byte) 28), 3));
                        }
                        this = qe50Var;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
