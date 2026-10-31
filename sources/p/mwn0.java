package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.MobiusLoop;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mwn0 implements uv80, yy20 {
    public static final Set k = dm61.z0("internal", "collection", "settings", "section", "list", "account-management");
    public static final se11 l = new se11("[a-z]+([_-][a-z0-9]+)*");
    public final rj41 a;
    public final uun0 b;
    public final z6r0 c;
    public final nwn0 d;
    public final kly0 e;
    public final qgz f;
    public final ynb0 g;
    public final idd1 h = new idd1(new lwn0(this));
    public final idd1 i = new idd1(new ivn0(this, (byte) 1));
    public final zfr j = new zfr((byte) 27);

    public mwn0(rj41 rj41Var, uun0 uun0Var, z6r0 z6r0Var, nwn0 nwn0Var, kly0 kly0Var, qgz qgzVar, ynb0 ynb0Var) {
        this.a = rj41Var;
        this.b = uun0Var;
        this.c = z6r0Var;
        this.d = nwn0Var;
        this.e = kly0Var;
        this.f = qgzVar;
        this.g = ynb0Var;
    }

    @Override // p.yy20
    public final void a() {
        g7h1 g7h1Var;
        ynb0 ynb0Var = this.g;
        if (ynb0Var == null || (g7h1Var = (g7h1) ynb0Var.get()) == null || !g7h1Var.b.get()) {
            lhm0 lhm0Var = (lhm0) ((MobiusLoop) this.h.getValue()).i;
            if ((lhm0Var != null ? lhm0Var.c : 0) == 1) {
                return;
            }
            this.f.b("NavigationLoggerImpl", "onAppForeground", null);
            j().b(new xvz(d()));
            z6r0 z6r0Var = this.c;
            z6r0Var.getClass();
            z6r0Var.b = z6r0.a();
        }
    }

    @Override // p.uv80
    public final void b(rj41 rj41Var, w7h1 w7h1Var, tv80 tv80Var) {
        ou80 ou80Var = tv80Var.a;
        if (this.a == rj41Var && !this.j.f(ou80Var)) {
            j().a(new nzz(ou80Var));
        }
    }

    @Override // p.yy20
    public final void c() {
        g7h1 g7h1Var;
        ynb0 ynb0Var = this.g;
        if (ynb0Var == null || (g7h1Var = (g7h1) ynb0Var.get()) == null || !g7h1Var.b.get()) {
            i();
            nwn0 nwn0Var = this.d;
            rj41 rj41Var = this.a;
            this.f.b("NavigationLoggerImpl", "onAppBackground", "from page = " + nwn0Var.a(rj41Var));
            z6r0 z6r0Var = this.c;
            y6r0 y6r0Var = z6r0Var.b;
            if (y6r0Var != null) {
                z6r0Var.e(y6r0Var);
            }
            hwn0 hwn0VarD = d();
            zfs0 zfs0VarJ = j();
            wvz wvzVar = new wvz(hwn0VarD);
            yfs0 yfs0Var = zfs0VarJ.b;
            lbc0 lbc0Var = zfs0VarJ.a;
            AtomicBoolean atomicBoolean = yfs0Var.a;
            List list = yfs0Var.b;
            if (atomicBoolean.getAndSet(true) && !list.isEmpty()) {
                Iterator it = new ArrayList(list).iterator();
                while (it.hasNext()) {
                    lbc0Var.invoke(it.next());
                }
                list.clear();
            }
            lbc0Var.invoke(wvzVar);
            nwn0Var.b(rj41Var, new a8r0(hwn0VarD.a, null, hwn0VarD.b.a, null));
        }
    }

    public final hwn0 d() {
        y6r0 y6r0Var = this.c.b;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new hwn0(y6r0Var, new gwn0(yon1.a0().c, null, null, e8h1.a().i(), 6), false, 12);
    }

    public final void e(nsn0 nsn0Var) {
        a8r0 a8r0VarA = this.d.a(this.a);
        String str = a8r0VarA != null ? a8r0VarA.c : null;
        lsn0 lsn0Var = nsn0Var instanceof lsn0 ? (lsn0) nsn0Var : null;
        String str2 = lsn0Var != null ? lsn0Var.b : null;
        if (str2 == null) {
            Logger.b("Nav > %s from %s", new Object[]{nsn0Var.b(), str});
        } else {
            Logger.b("Nav > %s from %s to %s", new Object[]{((lsn0) nsn0Var).b(), str, ryn1.r(str2)});
        }
        i();
        this.f.b("NavigationLoggerImpl", "beginNavigation", nsn0Var.b());
        if (nsn0Var.equals(fsn0.a) || (nsn0Var instanceof esn0)) {
            j().b(new g000(nsn0Var));
        } else {
            j().a(new g000(nsn0Var));
        }
    }

    public final void f(nsn0 nsn0Var) {
        this.f.b("NavigationLoggerImpl", "destinationChanging", nsn0Var.b());
        if (this.j.w(nsn0Var)) {
            i();
            k(nsn0Var);
        }
    }

    public final void g(gwn0 gwn0Var) {
        i();
        z6r0 z6r0Var = this.c;
        z6r0Var.getClass();
        z6r0Var.e(z6r0.a());
        y6r0 y6r0VarB = z6r0Var.b();
        hwn0 hwn0Var = new hwn0(y6r0VarB, gwn0Var, false, 12);
        this.f.b("NavigationLoggerImpl", "endNavigation", hwn0Var.toString());
        j().a(new f000(hwn0Var, z6x.a, null));
        this.d.b(this.a, new a8r0(y6r0VarB, gwn0Var.b, gwn0Var.a, null));
    }

    public final void h(h3t h3tVar) {
        l(h3tVar.c().b(), h3tVar.c().a());
        Iterator it = h3tVar.b().iterator();
        while (it.hasNext()) {
            j().a(new nzz((ou80) it.next()));
        }
    }

    public final void i() {
        h3t h3tVarT = this.j.t();
        if (h3tVarT == null) {
            return;
        }
        nsn0 nsn0VarA = h3tVarT.a();
        if (nsn0VarA != null) {
            k(nsn0VarA);
        }
        h(h3tVarT);
    }

    public final zfs0 j() {
        return (zfs0) this.i.getValue();
    }

    public final void k(nsn0 nsn0Var) {
        j().a(new zzz(nsn0Var));
    }

    public final void l(gwn0 gwn0Var, myn0 myn0Var) {
        String str;
        lhm0 lhm0Var;
        kyn0 kyn0Var;
        hwn0 hwn0Var = new hwn0(myn0Var.a(), gwn0Var, myn0Var.b(), myn0Var.e());
        a8r0 a8r0VarA = this.d.a(this.a);
        f000 f000Var = new f000(hwn0Var, myn0Var.c(), Long.valueOf(myn0Var.d()));
        this.f.b("NavigationLoggerImpl", "endNavigation", "destination: " + hwn0Var + ", currentLocation: " + a8r0VarA);
        if (u890.j(gwn0Var.a, a8r0VarA != null ? a8r0VarA.c : null) && (str = gwn0Var.b) != null && str.equals(a8r0VarA.b) && (lhm0Var = (lhm0) ((MobiusLoop) this.h.getValue()).i) != null && (kyn0Var = lhm0Var.b) != null) {
            String str2 = gwn0Var.b;
            nsn0 nsn0Var = kyn0Var.a;
            if ((nsn0Var instanceof lsn0) && str2 != null && !u890.j(((lsn0) nsn0Var).b, str2)) {
                return;
            }
        }
        this.c.e(myn0Var.a());
        j().a(f000Var);
        this.d.b(this.a, new a8r0(myn0Var.a(), gwn0Var.b, gwn0Var.a, null));
    }
}
