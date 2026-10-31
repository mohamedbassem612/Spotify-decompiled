package p;

import com.spotify.nowplayingmodes.adsmode.data.AdsModeModel;
import io.reactivex.rxjava3.core.Observable;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j62 implements fkf1 {
    public final Observable a;
    public final i8h1 b;
    public final o2p0 c;
    public final n6r0 d;
    public final lik1 e;
    public final rku f = new rku();
    public az8 g;

    public j62(Observable observable, i8h1 i8h1Var, o2p0 o2p0Var, n6r0 n6r0Var, lik1 lik1Var) {
        this.a = observable;
        this.b = i8h1Var;
        this.c = o2p0Var;
        this.d = n6r0Var;
        this.e = lik1Var;
    }

    public static ou80 h(j62 j62Var, String str, String str2, AdsModeModel.Format format, AdsModeModel.Product product, boolean z) {
        g5l0 g5l0VarB = j62Var.b();
        r6h1 r6h1Var = g5l0VarB.b;
        x6h1 x6h1VarC = g5l0VarB.c.c();
        x6h1VarC.i.add(new a7h1("feedback", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        String strA = format.a(product);
        x6h1 x6h1VarC2 = y6h1VarA.c();
        x6h1VarC2.i.add(new a7h1("thumbs_down_button", str, (Integer) null, str2, strA));
        x6h1VarC2.j = false;
        y6h1 y6h1VarA2 = x6h1VarC2.a();
        b7x b7xVar = b7x.a;
        return j62Var.b.m(z ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("dislike_ad", 1, Collections.singletonMap("reason", "")), y6h1VarA2, r6h1Var, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_dislike_ad", 1, b7xVar), y6h1VarA2, r6h1Var, System.currentTimeMillis()), (xj61) null).a;
    }

    public static void i(j62 j62Var, String str, String str2, AdsModeModel.Format format, AdsModeModel.Product product, boolean z) {
        g5l0 g5l0VarB = j62Var.b();
        r6h1 r6h1Var = g5l0VarB.b;
        x6h1 x6h1VarC = g5l0VarB.c.c();
        x6h1VarC.i.add(new a7h1("feedback", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        String strA = format.a(product);
        x6h1 x6h1VarC2 = y6h1VarA.c();
        x6h1VarC2.i.add(new a7h1("thumbs_up_button", str, (Integer) null, str2, strA));
        x6h1VarC2.j = false;
        y6h1 y6h1VarA2 = x6h1VarC2.a();
        b7x b7xVar = b7x.a;
        j62Var.b.m(z ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("like_ad", 2, Collections.singletonMap("reason", "")), y6h1VarA2, r6h1Var, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_like_ad", 1, b7xVar), y6h1VarA2, r6h1Var, System.currentTimeMillis()), (xj61) null);
    }

    @Override // p.fkf1
    public final w7h1 a(ckf1 ckf1Var, String str, fvf1 fvf1Var) {
        return new v7h1().a();
    }

    public final g5l0 b() {
        return new g5l0(this.d.path(), this.e.a, this.c.a, (byte) 28);
    }

    public final tv80 c(AdsModeModel.Format format, AdsModeModel.Product product, String str, String str2) {
        g5l0 g5l0VarB = b();
        x6h1 x6h1VarC = g5l0VarB.c.c();
        x6h1VarC.i.add(new a7h1("top_bar", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        String strA = format.a(product);
        x6h1 x6h1VarC2 = y6h1VarA.c();
        x6h1VarC2.i.add(new a7h1("close_button", str, (Integer) null, str2, strA));
        x6h1VarC2.j = false;
        y6h1 y6h1VarA2 = x6h1VarC2.a();
        b7x b7xVar = b7x.a;
        return this.b.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA2, g5l0VarB.b, System.currentTimeMillis()), (xj61) null);
    }

    public final void d(bpt0 bpt0Var, String str) {
        g5l0 g5l0VarB = b();
        r6h1 r6h1Var = g5l0VarB.b;
        x6h1 x6h1VarC = g5l0VarB.c.c();
        x6h1VarC.i.add(new a7h1("main_controls", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        az8 az8Var = this.g;
        String str2 = az8Var != null ? az8Var.b : null;
        String str3 = az8Var != null ? az8Var.c : null;
        x6h1 x6h1VarC2 = y6h1VarA.c();
        x6h1VarC2.i.add(new a7h1("play_button", str2, (Integer) null, str, str3));
        x6h1VarC2.j = false;
        y6h1 y6h1VarA2 = x6h1VarC2.a();
        bpt0 bpt0Var2 = bpt0.a;
        b7x b7xVar = b7x.a;
        this.b.m(bpt0Var == bpt0Var2 ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("resume", 1, Collections.singletonMap("item_to_be_resumed", str)), y6h1VarA2, r6h1Var, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("pause", 1, Collections.singletonMap("item_to_be_paused", str)), y6h1VarA2, r6h1Var, System.currentTimeMillis()), (xj61) null);
    }

    public final void e(String str) {
        az8 az8Var = this.g;
        if (az8Var == null) {
            return;
        }
        g5l0 g5l0VarB = b();
        x6h1 x6h1VarC = g5l0VarB.c.c();
        x6h1VarC.i.add(new a7h1("main_controls", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        String str2 = az8Var.b;
        String str3 = az8Var.c;
        x6h1 x6h1VarC2 = y6h1VarA.c();
        x6h1VarC2.i.add(new a7h1("seek_backward_button", str2, (Integer) null, str, str3));
        x6h1VarC2.j = false;
        y6h1 y6h1VarA2 = x6h1VarC2.a();
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        String strValueOf = String.valueOf(15000);
        if (strValueOf == null) {
            strValueOf = "";
        }
        this.b.m(new w7h1("", "", z7h1Var, new x7h1("seek_by_time", 1, Collections.singletonMap("ms_seeked_offset", strValueOf)), y6h1VarA2, g5l0VarB.b, System.currentTimeMillis()), (xj61) null);
    }

    public final void f(String str) {
        az8 az8Var = this.g;
        if (az8Var == null) {
            return;
        }
        g5l0 g5l0VarB = b();
        x6h1 x6h1VarC = g5l0VarB.c.c();
        x6h1VarC.i.add(new a7h1("main_controls", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        String str2 = az8Var.b;
        String str3 = az8Var.c;
        x6h1 x6h1VarC2 = y6h1VarA.c();
        x6h1VarC2.i.add(new a7h1("seek_forward_button", str2, (Integer) null, str, str3));
        x6h1VarC2.j = false;
        y6h1 y6h1VarA2 = x6h1VarC2.a();
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        String strValueOf = String.valueOf(15000);
        if (strValueOf == null) {
            strValueOf = "";
        }
        this.b.m(new w7h1("", "", z7h1Var, new x7h1("seek_by_time", 1, Collections.singletonMap("ms_seeked_offset", strValueOf)), y6h1VarA2, g5l0VarB.b, System.currentTimeMillis()), (xj61) null);
    }

    public final void g(String str, fvf1 fvf1Var) {
        az8 az8Var = this.g;
        if (az8Var == null) {
            return;
        }
        g5l0 g5l0VarB = b();
        x6h1 x6h1VarC = g5l0VarB.c.c();
        x6h1VarC.i.add(new a7h1("main_controls", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        String str2 = az8Var.b;
        String str3 = az8Var.c;
        x6h1 x6h1VarC2 = y6h1VarA.c();
        x6h1VarC2.i.add(new a7h1("skip_previous_button", str2, (Integer) null, str, str3));
        x6h1VarC2.j = false;
        y6h1 y6h1VarA2 = x6h1VarC2.a();
        int i = (int) fvf1Var.a;
        int i2 = (int) fvf1Var.b;
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        mmr0 mmr0Var = new mmr0("item_to_be_skipped", str);
        String strValueOf = String.valueOf(i);
        if (strValueOf == null) {
            strValueOf = "";
        }
        mmr0 mmr0Var2 = new mmr0("position_ms", strValueOf);
        String strValueOf2 = String.valueOf(i2);
        this.b.m(new w7h1("", "", z7h1Var, new x7h1("skip_to_previous", 2, sqg0.J(new mmr0[]{mmr0Var, mmr0Var2, new mmr0("total_content_ms", strValueOf2 != null ? strValueOf2 : "")})), y6h1VarA2, g5l0VarB.b, System.currentTimeMillis()), (xj61) null);
    }
}
