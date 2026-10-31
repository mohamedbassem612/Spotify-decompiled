package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class f59 implements Update {
    public final Next a(Object obj, Object obj2) {
        h59 h59Var;
        h59 h59Var2 = (h59) obj;
        c59 c59Var = (c59) obj2;
        boolean z = h59Var2.b;
        boolean z2 = h59Var2.b;
        prn1 prn1Var = h59Var2.a;
        boolean z3 = c59Var instanceof x49;
        odr0 odr0Var = odr0.b;
        if (z3) {
            ac20 ac20Var = ((x49) c59Var).a;
            if (ac20Var instanceof zb20) {
                int iC = l1d.C(((zb20) ac20Var).a);
                if (iC == 0) {
                    h59Var = new h59(new sdr0(1), z);
                } else {
                    if (iC != 1) {
                        eg.o();
                        return null;
                    }
                    h59Var = new h59(new sdr0(2), z);
                }
                return Next.h(h59Var);
            }
            if (!(ac20Var instanceof ac20)) {
                eg.o();
                return null;
            }
            brl brlVar = ac20Var.a;
            if (brlVar instanceof qwt) {
                qwt qwtVar = (qwt) brlVar;
                return Next.h(new h59(new ldr0(qwtVar.d, qwtVar.e), z2));
            }
            if (brlVar instanceof swt) {
                return Next.a(Collections.singleton(new g49(false, false, null, false, ((swt) brlVar).e, false, z2)));
            }
            if (brlVar instanceof twt) {
                return Next.a(Collections.singleton(new g49(false, false, null, false, ((twt) brlVar).d, false, z2)));
            }
            if (brlVar.equals(uwt.d)) {
                return Next.a(Collections.singleton(new g49(false, false, null, false, null, false, h59Var2.b)));
            }
            if (brlVar.equals(rwt.d) || brlVar.equals(vwt.d)) {
                return Next.h(new h59(odr0Var, z));
            }
            if (brlVar instanceof pwt) {
                pwt pwtVar = (pwt) brlVar;
                return Next.a(Collections.singleton(new g49(false, true, pwtVar.e, pwtVar.f, pwtVar.d, false, h59Var2.b)));
            }
            eg.o();
            return null;
        }
        if (c59Var instanceof o49) {
            return prn1Var.equals(odr0Var) ? Next.a(Collections.singleton(new d49(false))) : Next.a(Collections.singleton(new d49(z2)));
        }
        boolean z4 = c59Var instanceof n49;
        zdr0 zdr0Var = zdr0.b;
        if (z4) {
            if (prn1Var instanceof ldr0) {
                return Next.a(Collections.singleton(new f49(z2)));
            }
            if (prn1Var.equals(odr0Var)) {
                return Next.a(Collections.singleton(new d49(false)));
            }
            if (prn1Var instanceof sdr0) {
                return Next.a(Collections.singleton(new d49(z2)));
            }
            if (prn1Var.equals(zdr0Var)) {
                return Next.a(Collections.singleton(new d49(z2)));
            }
            if (prn1Var instanceof kdr0) {
                kdr0 kdr0Var = (kdr0) prn1Var;
                return Next.h(new h59(new ldr0(kdr0Var.b, kdr0Var.c), z));
            }
            eg.o();
            return null;
        }
        if (c59Var instanceof p49) {
            if (!(prn1Var instanceof ldr0)) {
                hhg1.o(prn1Var, "Unexpected model state: ");
                return null;
            }
            ldr0 ldr0Var = (ldr0) prn1Var;
            le20 le20Var = ldr0Var.b;
            return Next.i(new h59(new kdr0(le20Var, ldr0Var.c), z2), Collections.singleton(new e49(le20Var)));
        }
        if (c59Var instanceof b59) {
            if (prn1Var instanceof ldr0) {
                ldr0 ldr0Var2 = (ldr0) prn1Var;
                return Next.a(Collections.singleton(new g49(true, false, null, false, ldr0Var2.c, ldr0Var2.b.c != null, z2)));
            }
            hhg1.o(prn1Var, "Unexpected model state: ");
            return null;
        }
        if (c59Var instanceof u49) {
            if (prn1Var instanceof sdr0) {
                return Next.i(new h59(zdr0Var, z2), Collections.singleton(j49.c));
            }
            hhg1.o(prn1Var, "Unexpected model state: ");
            return null;
        }
        if (c59Var.equals(w49.a)) {
            if (prn1Var instanceof kdr0) {
                kdr0 kdr0Var2 = (kdr0) prn1Var;
                return Next.a(Collections.singleton(new c49(kdr0Var2.b, kdr0Var2.c)));
            }
            if (prn1Var instanceof ldr0) {
                return Next.j();
            }
            if (prn1Var.equals(odr0Var)) {
                return Next.j();
            }
            if (prn1Var instanceof sdr0) {
                return Next.j();
            }
            if (prn1Var.equals(zdr0Var)) {
                return Next.j();
            }
            eg.o();
            return null;
        }
        if (c59Var.equals(y49.a)) {
            if (!(prn1Var instanceof sdr0)) {
                return Next.h(new h59(new sdr0(1), z));
            }
            int iC2 = l1d.C(((sdr0) prn1Var).b);
            if (iC2 == 0) {
                return Next.h(new h59(new sdr0(1), z));
            }
            if (iC2 == 1) {
                return Next.h(new h59(new sdr0(2), z));
            }
            eg.o();
            return null;
        }
        if (c59Var.equals(v49.a)) {
            if (!(prn1Var instanceof sdr0)) {
                return Next.h(new h59(new sdr0(1), z));
            }
            int iC3 = l1d.C(((sdr0) prn1Var).b);
            if (iC3 == 0) {
                return Next.h(new h59(new sdr0(1), z));
            }
            if (iC3 == 1) {
                return Next.h(new h59(new sdr0(2), z));
            }
            eg.o();
            return null;
        }
        if (c59Var.equals(r49.a)) {
            if (!(prn1Var instanceof sdr0)) {
                return Next.h(new h59(new sdr0(1), z));
            }
            int iC4 = l1d.C(((sdr0) prn1Var).b);
            if (iC4 == 0) {
                return Next.h(new h59(new sdr0(1), z));
            }
            if (iC4 == 1) {
                return Next.h(new h59(new sdr0(2), z));
            }
            eg.o();
            return null;
        }
        if (c59Var instanceof s49) {
            s49 s49Var = (s49) c59Var;
            le20 le20Var2 = s49Var.a;
            woa1 woa1Var = le20Var2.c;
            boolean z5 = woa1Var != null;
            boolean z6 = woa1Var != null;
            bnv0 bnv0Var = s49Var.b;
            return Next.a(Collections.singleton(new i49(le20Var2, new hpq0(z5, true, z6, false, false, bnv0Var.e, bnv0Var.f, woa1Var != null ? woa1Var.c : null, woa1Var != null ? woa1Var.d : null, bnv0Var.d))));
        }
        if (c59Var.equals(a59.a)) {
            return Next.a(Collections.singleton(new d49(z2)));
        }
        if (c59Var instanceof q49) {
            return !((q49) c59Var).a ? Next.a(Collections.singleton(new d49(z2))) : Next.j();
        }
        if (!(c59Var instanceof z49)) {
            if (c59Var instanceof t49) {
                return ((t49) c59Var).a ? Next.j() : Next.h(new h59(new sdr0(2), z));
            }
            eg.o();
            return null;
        }
        if (prn1Var instanceof kdr0) {
            return Next.a(Collections.singleton(new h49(z2)));
        }
        if (prn1Var instanceof ldr0) {
            return Next.j();
        }
        if (prn1Var.equals(odr0Var)) {
            return Next.j();
        }
        if (prn1Var instanceof sdr0) {
            return Next.j();
        }
        if (prn1Var.equals(zdr0Var)) {
            return Next.j();
        }
        eg.o();
        return null;
    }
}
