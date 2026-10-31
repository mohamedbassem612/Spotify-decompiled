package p;

import android.view.ViewGroup;
import io.reactivex.rxjava3.core.Flowable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class k7u0 implements kwc1, byf0 {
    public static final Set N0 = dm61.z0(new String[]{"watchfeed", "lyrics", "settings", "nowplaying"});
    public hp91 X;
    public faa0 Y;
    public final bpb1 Z;
    public final ezt a;
    public final c9c0 b;
    public final iur c;
    public final qfb0 d;
    public final Flowable e;
    public final cd4 f;
    public final fvc1 g;
    public final esa1 h;
    public final llm i;
    public final bpb1 t;

    public k7u0(ezt eztVar, c9c0 c9c0Var, iur iurVar, qfb0 qfb0Var, Flowable flowable, cd4 cd4Var, fvc1 fvc1Var, esa1 esa1Var, q8n q8nVar) {
        this.a = eztVar;
        this.b = c9c0Var;
        this.c = iurVar;
        this.d = qfb0Var;
        this.e = flowable;
        this.f = cd4Var;
        this.g = fvc1Var;
        this.h = esa1Var;
        this.i = l1d.x(q8nVar);
        bpb1 bpb1VarB = gio1.b((Object) null);
        this.t = bpb1VarB;
        this.Z = bpb1VarB;
    }

    public final void c() {
        if (this.f.a()) {
            this.X = this.g.c(this);
            c921.y(this.i, (o8n) null, 0, new c3u0(this, (lnm) null, (byte) 3), 3);
        }
    }

    public final void d() {
        faa0 faa0Var = this.Y;
        if (faa0Var != null) {
            faa0Var.d(new g7u0("UI_HIDDEN"));
        }
        op71.r(this.i.a);
        this.t.l((Object) null);
        this.Y = null;
        hp91 hp91Var = this.X;
        if (hp91Var != null) {
            hp91Var.e();
        }
        this.X = null;
    }

    @Override // p.kwc1
    public final String e() {
        return "playback";
    }

    @Override // p.kwc1
    public final bpb1 f() {
        return this.Z;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // p.kwc1
    public final void h(evc1 evc1Var) throws NoWhenBranchMatchedException {
        evc1Var.toString();
        if ((evc1Var instanceof avc1) || (evc1Var instanceof cvc1)) {
            this.t.l((Object) null);
        } else {
            if ((evc1Var instanceof bvc1) || (evc1Var instanceof dvc1)) {
                return;
            }
            eg.o();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: p.g7u0 */
    /* JADX WARN: Code duplicated, block: B:45:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object i(onm onmVar) throws NoWhenBranchMatchedException, g7u0 {
        h7u0 h7u0Var;
        String str;
        g7u0 g7u0Var;
        String str2;
        ywt ywtVarB;
        mmr0 mmr0VarN;
        if (onmVar instanceof h7u0) {
            h7u0Var = (h7u0) onmVar;
            int i = h7u0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                h7u0Var.d = i - Integer.MIN_VALUE;
            } else {
                h7u0Var = new h7u0(this, onmVar);
            }
        } else {
            h7u0Var = new h7u0(this, onmVar);
        }
        h7u0 h7u0Var2 = h7u0Var;
        Object obj = h7u0Var2.b;
        int i2 = h7u0Var2.d;
        cd4 cd4Var = this.f;
        esa1 esa1Var = this.h;
        if (i2 == 0) {
            hm5.M(obj);
            int iOrdinal = cd4Var.d().ordinal();
            if (iOrdinal == 0) {
                str = "smart_control_nudge";
            } else {
                if (iOrdinal != 1) {
                    eg.o();
                    return null;
                }
                str = "bottom_sheet_nudge";
            }
            esa1Var.u(new tvc1("playback", str));
            try {
                ezt eztVar = this.a;
                Long lQ = yah0.q(5000L);
                n5u0 n5u0Var = new n5u0(this, (byte) 2);
                h7u0Var2.a = str;
                h7u0Var2.d = 1;
                Object objI = eztVar.i("playback_trigger", oxt.a, lQ, n5u0Var, h7u0Var2);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
                str2 = str;
                obj = objI;
            } catch (g7u0 e) {
                g7u0Var = e;
                str2 = str;
                esa1Var.u(new mvc1("playback", str2, g7u0Var.a()));
                throw g7u0Var;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = h7u0Var2.a;
            try {
                hm5.M(obj);
            } catch (g7u0 e2) {
                g7u0Var = e2;
                esa1Var.u(new mvc1("playback", str2, g7u0Var.a()));
                throw g7u0Var;
            }
        }
        bxt bxtVar = (bxt) obj;
        rih1 rih1Var = rih1.a;
        if (bxtVar == null) {
            esa1Var.u(new svc1("playback", str2, (String) null, "BACKEND_NO_SUGGESTION"));
            return rih1Var;
        }
        int iC = l1d.C(bxtVar.a());
        ad4 ad4Var = ad4.b;
        boolean zContains = false;
        if (iC != 0) {
            if (iC == 1) {
                zContains = p7h.M(new ad4[]{ad4Var, ad4.c}).contains(cd4Var.b());
            } else if (iC == 2) {
                zContains = true;
            } else if (iC != 3) {
                eg.o();
                return null;
            }
        } else if (cd4Var.b() == ad4Var) {
            zContains = true;
        }
        if (!zContains) {
            Objects.toString(cd4Var.b());
            esa1Var.u(new svc1("playback", str2, bxtVar.e(), "BELOW_CONFIDENCE_THRESHOLD"));
            return rih1Var;
        }
        int iOrdinal2 = cd4Var.d().ordinal();
        if (iOrdinal2 == 0) {
            ywtVarB = bxtVar.f().b();
        } else {
            if (iOrdinal2 != 1) {
                eg.o();
                return null;
            }
            ywtVarB = bxtVar.f().a();
        }
        int iOrdinal3 = ywtVarB.ordinal();
        if (iOrdinal3 == 0 || iOrdinal3 == 1) {
            esa1Var.u(new svc1("playback", str2, bxtVar.e(), "BELOW_NUDGE_PROPENSITY_THRESHOLD"));
            return rih1Var;
        }
        if (iOrdinal3 != 2 && iOrdinal3 != 3) {
            eg.o();
            return null;
        }
        if (!j()) {
            esa1Var.u(new svc1("playback", str2, bxtVar.e(), "INELIGIBLE"));
            return rih1Var;
        }
        int iOrdinal4 = cd4Var.d().ordinal();
        if (iOrdinal4 == 0) {
            mmr0VarN = oqn1.n(eh91.a, sqg0.J(new mmr0[]{oqn1.n("instrumentationId", iyk0.e), oqn1.n("dismissTimeout", Long.valueOf(cd4Var.c()))}));
        } else {
            if (iOrdinal4 != 1) {
                eg.o();
                return null;
            }
            mmr0VarN = oqn1.n(pyb.a, zno1.t(oqn1.n("instrumentationId", w4l0.c)));
        }
        guc1 guc1Var = new guc1(bxtVar, (Map) mmr0VarN.b, (jwc1) mmr0VarN.a);
        guc1Var.b().getClass();
        esa1Var.u(new pvc1("playback", guc1Var.b().a(), bxtVar.e(), pro1.x(bxtVar.a())));
        this.t.m((Object) null, guc1Var);
        return rih1Var;
    }

    public final boolean j() {
        String str;
        if (this.b.b.current().getValue() == null && !((Boolean) this.c.b.getValue()).booleanValue()) {
            a8r0 a8r0VarA = this.d.a((rj41) null);
            if (a8r0VarA == null || (str = a8r0VarA.c) == null) {
                return true;
            }
            Set set = N0;
            if ((set instanceof Collection) && set.isEmpty()) {
                return true;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (nhc1.Y(str, (String) it.next(), false)) {
                }
            }
            return true;
        }
        return false;
    }

    public final void g(ViewGroup viewGroup) {
    }
}
