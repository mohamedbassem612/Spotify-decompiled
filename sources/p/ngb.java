package p;

import android.content.Context;
import com.spotify.base.java.logging.Logger;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ngb implements but {
    public final Context a;
    public final g0l b;
    public final efr c;
    public final gur d;
    public final kkb e;
    public final kkb f;

    public ngb(Context context, g0l g0lVar, kkb kkbVar, efr efrVar, gur gurVar, kkb kkbVar2) {
        this.a = context;
        this.b = g0lVar;
        this.c = efrVar;
        this.d = gurVar;
        this.e = kkbVar2;
        this.f = kkbVar;
    }

    public static boolean d(kx7 kx7Var) {
        return kx7Var.d == luq0.b;
    }

    @Override // p.but
    public final u9h1 a() {
        return this.f;
    }

    @Override // p.but
    public final mr20 b() {
        inr inrVar = this.b;
        return rqt0.u(new mgb(new x010(yoi1.g(inrVar.d()), new nf(yoi1.g(inrVar.l()), (byte) 26), new qr0(this, (lnm) null, (byte) 6), (byte) 1), this, (byte) 0));
    }

    @Override // p.but
    public final ou80 c(zv31 zv31Var, int i, String str) {
        ou80 ou80Var;
        Object next;
        i8h1 i8h1Var = this.e.a;
        o3e0 o3e0Var = (o3e0) this.c.b;
        String str2 = zv31Var.a;
        Object obj = null;
        if (jgb.a[l1d.C(1)] != 1) {
            eg.o();
            return null;
        }
        luq0 luq0Var = ((hkb) zv31Var.j).a;
        luq0 luq0Var2 = luq0.b;
        b7x b7xVar = b7x.a;
        if (luq0Var == luq0Var2) {
            kly0 kly0Var = (kly0) o3e0Var.c;
            if (((jo20) o3e0Var.b).isEnabled()) {
                Iterator it = ((mwh0) kly0Var.get()).c().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!jmo1.n((vuh0) next));
                vuh0 vuh0Var = (vuh0) next;
                if (vuh0Var != null) {
                    ((mwh0) kly0Var.get()).h(vuh0Var);
                } else {
                    Logger.d("Phone speakers route not found", new Object[0]);
                }
            }
            y6h1 y6h1Var = y6h1.i;
            x6h1 x6h1VarI = i3o1.i();
            x6h1VarI.h = "music";
            x6h1VarI.a = "mobile-connect-menu";
            x6h1VarI.f = "6.6.0";
            x6h1VarI.g = "22.0.0";
            x6h1 x6h1VarR = kk0.r(x6h1VarI, "connect/devicepicker");
            x6h1VarR.i.add(new a7h1("device_list", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarR.j = false;
            y6h1 y6h1VarA = x6h1VarR.a();
            Integer numValueOf = Integer.valueOf(i);
            x6h1 x6h1VarC = y6h1VarA.c();
            x6h1VarC.i.add(new a7h1("local_device_speakers", (String) null, numValueOf, (String) null, str));
            x6h1VarC.j = true;
            ou80Var = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("pull_playback_to_local_device", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a;
        } else {
            y6h1 y6h1Var2 = y6h1.i;
            x6h1 x6h1VarI2 = i3o1.i();
            x6h1VarI2.h = "music";
            x6h1VarI2.a = "mobile-connect-menu";
            x6h1VarI2.f = "6.6.0";
            x6h1VarI2.g = "22.0.0";
            x6h1 x6h1VarR2 = kk0.r(x6h1VarI2, "connect/devicepicker");
            x6h1VarR2.i.add(new a7h1("device_list", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarR2.j = false;
            y6h1 y6h1VarA2 = x6h1VarR2.a();
            Integer numValueOf2 = Integer.valueOf(i);
            x6h1 x6h1VarC2 = y6h1VarA2.c();
            x6h1VarC2.i.add(new a7h1("bluetooth_device", (String) null, numValueOf2, str2, str));
            x6h1VarC2.j = true;
            ou80Var = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("connect_to_remote_device", 1, Collections.singletonMap("remote_device_id", str2)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a;
            kly0 kly0Var2 = (kly0) o3e0Var.c;
            if (((jo20) o3e0Var.b).isEnabled()) {
                for (Object obj2 : ((mwh0) kly0Var2.get()).c()) {
                    vuh0 vuh0Var2 = (vuh0) obj2;
                    if (vuh0Var2.a.equals(str2) || nhc1.R(vuh0Var2.a, str2, false)) {
                        obj = obj2;
                        break;
                    }
                }
                vuh0 vuh0Var3 = (vuh0) obj;
                if (vuh0Var3 != null) {
                    ((lur) o3e0Var.d).d(str2, lxf0.b1);
                    for (ss31 ss31Var : ((mwh0) kly0Var2.get()).b()) {
                        List listA = ss31Var.a();
                        if (!(listA instanceof Collection) || !listA.isEmpty()) {
                            Iterator it2 = listA.iterator();
                            while (it2.hasNext()) {
                                if (((vuh0) it2.next()).a.equals(str2)) {
                                    Logger.d("Route[" + str2 + "] is already selected. [all routes=" + ss31Var.a() + "]", new Object[0]);
                                    break;
                                }
                            }
                        }
                    }
                    ((mwh0) kly0Var2.get()).h(vuh0Var3);
                } else {
                    Logger.d(f4i1.f("Route ", str2, " not found"), new Object[0]);
                }
            }
        }
        this.d.d.a.g();
        return ou80Var;
    }

    @Override // p.but
    public final wly0 getType() {
        return wly0.d;
    }
}
