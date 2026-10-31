package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class v75 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final u75 e;
    public final luk f;
    public final idd1 g;

    public v75(boolean z, boolean z2, boolean z3, boolean z4, u75 u75Var, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = u75Var;
        this.f = lukVar;
        this.g = new idd1(new f55(this, (byte) 23));
    }

    public final boolean a() {
        v75 v75Var = (v75) this.g.getValue();
        return v75Var != null ? v75Var.a() : this.a;
    }

    public final boolean b() {
        v75 v75Var = (v75) this.g.getValue();
        return v75Var != null ? v75Var.b() : this.b;
    }

    public final boolean c() {
        v75 v75Var = (v75) this.g.getValue();
        return v75Var != null ? v75Var.c() : this.c;
    }

    public final boolean d() {
        v75 v75Var = (v75) this.g.getValue();
        return v75Var != null ? v75Var.d() : this.d;
    }

    public final u75 e() {
        u75 u75VarE;
        v75 v75Var = (v75) this.g.getValue();
        return (v75Var == null || (u75VarE = v75Var.e()) == null) ? this.e : u75VarE;
    }

    @Override // p.pdy0
    public final List models() {
        fpb fpbVar = new fpb("auto_retry_only_on_certain_status_codes", "android-watch-feed", a());
        fpb fpbVar2 = new fpb("exponential_backoff_for_retries_enabled", "android-watch-feed", b());
        fpb fpbVar3 = new fpb("page_request_auto_retry_enabled", "android-watch-feed", c());
        fpb fpbVar4 = new fpb("restore_npv_upon_back_navigation", "android-watch-feed", d());
        String str = e().a;
        u75[] u75VarArrValues = u75.values();
        ArrayList arrayList = new ArrayList(u75VarArrValues.length);
        for (u75 u75Var : u75VarArrValues) {
            arrayList.add(u75Var.a);
        }
        return p7h.M(fpbVar, fpbVar2, fpbVar3, fpbVar4, new fpb("vertical_scroll_onboarding_completion_strategy", "android-watch-feed", str, arrayList));
    }

    public v75(luk lukVar) {
        this(false, false, false, false, u75.DEFAULT, lukVar);
    }
}
