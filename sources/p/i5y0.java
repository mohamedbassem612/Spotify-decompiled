package p;

import com.spotify.gating.dryrun.GatingDryRunMismatchEvent;
import com.spotify.gating.dryrun.a;
import com.spotify.gating.dryrun.b;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i5y0 {
    public final kly0 a;
    public final rg4 b;
    public final sp4 c;
    public final ced0 d;
    public final idd1 e = new idd1(new x4y0(this, 0));
    public final idd1 f = new idd1(new l5v0(this, (byte) 4));
    public final idd1 g = new idd1(new x4y0(this, 1));

    public i5y0(kly0 kly0Var, rg4 rg4Var, sp4 sp4Var, ced0 ced0Var) {
        this.a = kly0Var;
        this.b = rg4Var;
        this.c = sp4Var;
        this.d = ced0Var;
    }

    public static final en10 a(i5y0 i5y0Var) {
        return (en10) i5y0Var.e.getValue();
    }

    public final u601 b() {
        return (u601) this.f.getValue();
    }

    public final boolean c() {
        if (!this.b.a()) {
            return false;
        }
        vl10 vl10Var = (vl10) ((Map) b().getValue()).get(q1y0.a);
        tl10 tl10Var = vl10Var instanceof tl10 ? (tl10) vl10Var : null;
        return (tl10Var != null ? tl10Var.b : null) instanceof kd;
    }

    public final boolean d() {
        i();
        rg4 rg4Var = this.b;
        return rg4Var.i() ? ((Map) b().getValue()).get(q1y0.a) instanceof ul10 : rg4Var.d();
    }

    public final boolean e() {
        if (d()) {
            return true;
        }
        if (!this.b.i()) {
            return false;
        }
        vl10 vl10Var = (vl10) ((Map) b().getValue()).get(q1y0.a);
        tl10 tl10Var = vl10Var instanceof tl10 ? (tl10) vl10Var : null;
        return (tl10Var != null ? tl10Var.b : null) instanceof kd;
    }

    public final boolean f() {
        return g() && this.c.b();
    }

    public final boolean g() {
        i();
        return this.b.i() ? ((Map) b().getValue()).get(r1y0.a) instanceof ul10 : this.c.a();
    }

    public final a5y0 h() {
        return new a5y0(b().a(), this, (byte) 1);
    }

    public final void i() {
        String str;
        GatingDryRunMismatchEvent.Mismatches mismatches;
        en10 en10Var = (en10) this.e.getValue();
        Map mapJ = sqg0.J(new mmr0[]{new mmr0(r1y0.a, Boolean.valueOf(this.c.a())), new mmr0(q1y0.a, Boolean.valueOf(this.b.d()))});
        p940 p940Var = en10Var.k;
        if (!p940Var.a || p940Var.e) {
            return;
        }
        p940Var.e = true;
        Map map = (Map) p940Var.d.invoke(o7h.l1(mapJ.keySet()));
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : mapJ.entrySet()) {
            bm10 bm10Var = (bm10) entry.getKey();
            boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
            boolean z = map.get(bm10Var) instanceof ul10;
            if (zBooleanValue == z) {
                mismatches = null;
            } else {
                vl10 vl10Var = (vl10) map.get(bm10Var);
                if (vl10Var instanceof tl10) {
                    td tdVar = ((tl10) vl10Var).b;
                    if (tdVar instanceof ld) {
                        str = "entitlement_missing";
                    } else if (tdVar instanceof kd) {
                        str = "capped";
                    } else if (tdVar instanceof id) {
                        str = "age_assurance_required";
                    } else if (tdVar instanceof jd) {
                        str = "blocked_by_user_setting";
                    } else if (tdVar instanceof rd) {
                        str = "feature_unavailable";
                    } else if (tdVar instanceof nd) {
                        str = "age_restricted";
                    } else if (tdVar instanceof pd) {
                        str = "child_account";
                    } else if (tdVar instanceof qd) {
                        str = "device_not_supported";
                    } else if (tdVar instanceof od) {
                        str = "blocked_by_account_manager";
                    } else {
                        if (!(tdVar instanceof sd)) {
                            eg.o();
                            return;
                        }
                        str = "unreleased_market";
                    }
                } else {
                    str = "";
                }
                b bVarN = GatingDryRunMismatchEvent.Mismatches.n();
                bVarN.n(bm10Var.a());
                bVarN.s(zBooleanValue);
                bVarN.r(z);
                bVarN.q(str);
                mismatches = (GatingDryRunMismatchEvent.Mismatches) bVarN.build();
            }
            if (mismatches != null) {
                arrayList.add(mismatches);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        t2j0 t2j0Var = p940Var.b;
        a aVarO = GatingDryRunMismatchEvent.o();
        aVarO.q(p940Var.c);
        aVarO.n(arrayList);
        t2j0Var.a(aVarO.build());
    }
}
