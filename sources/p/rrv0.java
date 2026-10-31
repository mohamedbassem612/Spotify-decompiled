package p;

import android.os.Handler;
import android.os.Looper;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rrv0 {
    public final zle1 a;
    public t45 b;
    public boolean c;
    public String g;
    public boolean h;
    public boolean i;
    public final LinkedHashSet d = new LinkedHashSet();
    public final LinkedHashSet e = new LinkedHashSet();
    public final LinkedHashSet f = new LinkedHashSet();
    public final Handler j = new Handler(Looper.getMainLooper());
    public final an90 k = new an90(this, 23);

    public rrv0(zle1 zle1Var) {
        this.a = zle1Var;
    }

    public static void j(rrv0 rrv0Var, String str) {
        t45 t45Var;
        if (!rrv0Var.d.add(str) || (t45Var = rrv0Var.b) == null) {
            return;
        }
        t45Var.l(str, (String) null, false);
    }

    public final synchronized void a() {
        b("response_decode_map");
        b("data_ready");
        j(this, "data_to_useful_frame");
    }

    public final void b(String str) {
        t45 t45Var;
        if (this.d.contains(str) && this.e.add(str) && (t45Var = this.b) != null) {
            t45Var.g(str);
        }
    }

    public final void c(String str) {
        t45 t45Var = this.b;
        if (t45Var == null) {
            return;
        }
        this.j.removeCallbacks(this.k);
        t45Var.a("outcome", str);
        b("premium_destination_readiness");
        this.a.b(t45Var.e());
        this.b = null;
        this.c = true;
    }

    public final void d() {
        String str;
        if (this.h && this.i && (str = this.g) != null) {
            c(str);
        }
    }

    public final synchronized void e() {
        if (this.g == null) {
            c("cancelled");
        } else {
            h("abandoned", false);
            i("abandoned", false);
        }
    }

    public final synchronized void f() {
        t45 t45Var;
        if (this.b == null && !this.c) {
            t45 t45VarA = this.a.a("premium_destination_readiness");
            t45VarA.a("page_identifier", "premium-destination");
            t45VarA.a("contract_version", "2");
            this.b = t45VarA;
            if (this.d.add("premium_destination_readiness") && (t45Var = this.b) != null) {
                t45Var.l("premium_destination_readiness", (String) null, true);
            }
            j(this, "data_ready");
            j(this, "useful_content_ready");
            j(this, "interactive_ready");
            j(this, "hero_image_ready");
            j(this, "hero_video_ready");
        }
    }

    public final synchronized void g(String str) {
        try {
            t45 t45Var = this.b;
            if (t45Var != null) {
                t45Var.a("surface_variant", str);
            }
            j(this, "offers_request");
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void h(String str, boolean z) {
        if (this.h || this.c) {
            return;
        }
        this.h = true;
        t45 t45Var = this.b;
        if (t45Var != null) {
            t45Var.a("hero_image_outcome", str);
        }
        if (z) {
            b("hero_image_ready");
        }
        d();
    }

    public final void i(String str, boolean z) {
        if (this.i || this.c) {
            return;
        }
        this.i = true;
        t45 t45Var = this.b;
        if (t45Var != null) {
            t45Var.a("hero_video_outcome", str);
        }
        if (z) {
            b("hero_video_ready");
        }
        d();
    }
}
