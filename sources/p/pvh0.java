package p;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class pvh0 extends rvh0 {
    public final jts N0;
    public final ilr O0;
    public final LinkedHashSet P0;
    public final jo20 X;
    public final l7s Y;
    public final e4l Z;
    public final e4s i;
    public final s880 t;

    public pvh0(Context context, e4s e4sVar, s880 s880Var, jo20 jo20Var, l7s l7sVar, e4l e4lVar, jts jtsVar, ilr ilrVar) {
        super(context, (hod0) null);
        this.i = e4sVar;
        this.t = s880Var;
        this.X = jo20Var;
        this.Y = l7sVar;
        this.Z = e4lVar;
        this.N0 = jtsVar;
        this.O0 = ilrVar;
        this.P0 = new LinkedHashSet();
        l7sVar.a = this;
        l7sVar.b.m((Object) null, Boolean.TRUE);
    }

    public static gvh0 i(jqd0 jqd0Var, String str) {
        Object next;
        Iterator it = ((List) jqd0Var.d).iterator();
        while (it.hasNext()) {
            next = it.next();
            if (u890.j(((gvh0) next).g(), str)) {
                return (gvh0) next;
            }
        }
        next = null;
        return (gvh0) next;
    }

    public final mvh0 a(String str) {
        List list;
        Object next;
        Object sdc1Var;
        Object pdc1Var;
        Bundle bundleD;
        m4e m4eVar;
        int i = Build.VERSION.SDK_INT;
        jts jtsVar = this.N0;
        if (i < 36) {
            jtsVar.getClass();
            pdc1Var = new rdc1(str, 1, qdc1.OS_VERSION);
        } else if (jtsVar.a.c()) {
            jqd0 jqd0VarA = jtsVar.c.a();
            if (jqd0VarA == null || (list = (List) jqd0VarA.d) == null) {
                list = z6x.a;
            }
            if (list.isEmpty()) {
                pdc1Var = new rdc1(str, 3, null);
            } else {
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!u890.j(((gvh0) next).g(), str));
                gvh0 gvh0Var = (gvh0) next;
                if (gvh0Var == null) {
                    pdc1Var = new rdc1(str, 4, null);
                } else if (jtsVar.b.isEnabled()) {
                    pdc1Var = (nhc1.Y(gvh0Var.g(), "social-connect-", false) || jtsVar.b(jts.a(gvh0Var)) || (bundleD = gvh0Var.d()) == null || !bundleD.getBoolean("com.spotify.connect.EXTRA_IS_CAST")) ? new pdc1(str, jts.a(gvh0Var)) : new ndc1(str, l1d.m("spotify_artisanal_group-", gvh0Var.g()));
                } else {
                    c3e c3eVarH = ekb.H(gvh0Var.d());
                    if (c3eVarH == null) {
                        sdc1Var = new sdc1(qdc1.CONNECT_NOT_ENABLED);
                    } else if (nhc1.Y(gvh0Var.g(), "social-connect-", false)) {
                        sdc1Var = new sdc1(qdc1.SOCIAL_SESSION_ROUTE);
                    } else {
                        sdc1Var = jtsVar.b(jts.a(gvh0Var)) ? new sdc1(qdc1.IS_A_JAM) : tdc1.a;
                    }
                    if (sdc1Var instanceof tdc1) {
                        if (c3eVarH == null) {
                            eg.m("Required value was null.");
                            return null;
                        }
                        pdc1Var = new odc1(str, c3eVarH.a, jts.a(gvh0Var));
                    } else {
                        if (!(sdc1Var instanceof sdc1)) {
                            eg.o();
                            return null;
                        }
                        pdc1Var = new pdc1(str, jts.a(gvh0Var));
                    }
                }
            }
        } else {
            pdc1Var = new rdc1(str, 2, null);
        }
        boolean z = pdc1Var instanceof rdc1;
        ilr ilrVar = this.O0;
        if (z) {
            Logger.d("GOS->Dynamic group controller creation refused: " + pdc1Var, new Object[0]);
            int iC = l1d.C(((rdc1) pdc1Var).b);
            if (iC == 0) {
                m4eVar = m4e.CAST_DYNAMIC_GROUP_CONTROLLER_REFUSED_UNSUPPORTED_OS;
            } else if (iC == 1) {
                m4eVar = m4e.CAST_DYNAMIC_GROUP_CONTROLLER_REFUSED_NOT_ENABLED;
            } else if (iC == 2) {
                m4eVar = m4e.CAST_DYNAMIC_GROUP_CONTROLLER_REFUSED_NO_ROUTES;
            } else {
                if (iC != 3) {
                    eg.o();
                    return null;
                }
                m4eVar = m4e.CAST_DYNAMIC_GROUP_CONTROLLER_REFUSED_ROUTE_NOT_FOUND;
            }
            ilrVar.b(m4eVar);
            return null;
        }
        boolean z2 = pdc1Var instanceof odc1;
        s880 s880Var = this.t;
        if (!z2) {
            if (pdc1Var instanceof ndc1) {
                b8p b8pVar = ((z7p) s880Var.c).a.a;
                return new d3e(new ja6((ndc1) pdc1Var, (itz) b8pVar.i0.get(), (l7s) b8pVar.j0.get(), (y7l) b8pVar.o1.get(), b8pVar.a.d()));
            }
            if (!(pdc1Var instanceof pdc1)) {
                eg.o();
                return null;
            }
            ilrVar.b(m4e.CAST_DYNAMIC_INDIVIDUAL_CONTROLLER_CREATED);
            pdc1 pdc1Var2 = (pdc1) pdc1Var;
            return new uhv(pdc1Var2, new j3e(pdc1Var2.a, (xa80) ((ynb0) s880Var.d).get()), (g0l) s880Var.e, (l7s) s880Var.f, (y7l) s880Var.g, (ilr) s880Var.h, (q8n) s880Var.a);
        }
        odc1 odc1Var = (odc1) pdc1Var;
        this.P0.add(odc1Var.c);
        ilrVar.b(m4e.CAST_DYNAMIC_GROUP_CONTROLLER_CREATED);
        b8p b8pVar2 = ((y7p) s880Var.b).a.a;
        p7s p7sVar = (p7s) b8pVar2.Z.get();
        jly0 jly0Var = b8pVar2.o1;
        k3l k3lVar = b8pVar2.a;
        y7l y7lVar = (y7l) jly0Var.get();
        lpr lprVar = (lpr) b8pVar2.s1.get();
        p7s p7sVar2 = (p7s) b8pVar2.Z.get();
        ekb ekbVar = new ekb(false);
        String strF = k3lVar.f();
        return new d3e(new s24(odc1Var, p7sVar, y7lVar, lprVar, new zfr(p7sVar2, ekbVar, strF), (fwr) b8pVar2.t1.get(), (m0s) b8pVar2.m0.get(), (ilr) b8pVar2.P0.get(), k3lVar.d()));
    }

    public final nvh0 c(String str) {
        jqd0 jqd0Var = ((rvh0) this).g;
        gvh0 gvh0VarI = jqd0Var != null ? i(jqd0Var, str) : null;
        if (gvh0VarI != null && gvh0VarI.n()) {
            return new j3e(str, (xa80) this.i.a.get());
        }
        Objects.toString(gvh0VarI);
        return null;
    }

    public final nvh0 d(String str, String str2) {
        jqd0 jqd0Var;
        gvh0 gvh0VarI;
        Bundle bundleD;
        boolean zIsEnabled = this.X.isEnabled();
        e4s e4sVar = this.i;
        if (!zIsEnabled) {
            return (nhc1.Y(str, "social-connect-", false) || (!this.P0.contains(str2) && ((jqd0Var = ((rvh0) this).g) == null || (gvh0VarI = i(jqd0Var, str)) == null || (bundleD = gvh0VarI.d()) == null || !bundleD.getBoolean("com.spotify.connect.EXTRA_IS_CAST")))) ? new j3e(str, (xa80) e4sVar.a.get()) : new j3e(str, (i3e) e4sVar.b.get());
        }
        if (nhc1.Y(str, "social-connect-", false)) {
            return new j3e(str, (xa80) e4sVar.a.get());
        }
        if (!nhc1.Y(str2, "spotify_artisanal_group-", false)) {
            return new j3e(str, (xa80) e4sVar.a.get());
        }
        if (str.equals(str2)) {
            return null;
        }
        return new ya6(str, (wa6) e4sVar.c.get());
    }

    public final void f(hvh0 hvh0Var) {
        e4l e4lVar = this.Z;
        knr knrVar = e4lVar.b;
        Objects.toString(hvh0Var);
        if (hvh0Var != null) {
            hvh0Var.a();
            if (!hvh0Var.c.b().contains(e4lVar.a.a.concat(".SPOTIFY_CONNECT")) || !hvh0Var.c()) {
                hvh0Var.toString();
            } else if (hvh0Var.b()) {
                knrVar.g("GoogleOutputSwitcher");
            } else {
                if (((Boolean) e4lVar.c.b.getValue()).booleanValue()) {
                    return;
                }
                knrVar.i();
            }
        }
    }

    public final void j() {
        l7s l7sVar = this.Y;
        Objects.toString(l7sVar.a);
        l7sVar.a = null;
        l7sVar.b.m((Object) null, Boolean.FALSE);
        this.P0.clear();
    }
}
