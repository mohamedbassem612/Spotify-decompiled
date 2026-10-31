package p;

import com.spotify.player.model.ContextTrack$TrackAction;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class r62 implements rjo0, o691, q691, ias0, jo11 {
    public final i8h1 a;
    public final g5l0 b = new g5l0(nik1.N2.a, (byte) 21);

    public r62(i8h1 i8h1Var) {
        this.a = i8h1Var;
    }

    public final boolean a(String str) {
        return str.equals("ads");
    }

    public final void b(String str) {
        g5l0 g5l0Var = this.b;
        x6h1 x6h1VarC = g5l0Var.c.c();
        x6h1VarC.i.add(new a7h1("horizontal_container", str, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("seek_forward_action", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        y6h1 y6h1VarA = x6h1VarC2.a();
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        String strValueOf = String.valueOf(-15000);
        if (strValueOf == null) {
            strValueOf = "";
        }
        this.a.m(new w7h1("", "", z7h1Var, new x7h1("seek_by_time", 1, Collections.singletonMap("ms_seeked_offset", strValueOf)), y6h1VarA, g5l0Var.b, System.currentTimeMillis()), (xj61) null);
    }

    public final void e(String str) {
        g5l0 g5l0Var = this.b;
        x6h1 x6h1VarC = g5l0Var.c.c();
        x6h1VarC.i.add(new a7h1("horizontal_container", str, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("seek_forward_action", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        y6h1 y6h1VarA = x6h1VarC2.a();
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        String strValueOf = String.valueOf(15000);
        if (strValueOf == null) {
            strValueOf = "";
        }
        this.a.m(new w7h1("", "", z7h1Var, new x7h1("seek_by_time", 1, Collections.singletonMap("ms_seeked_offset", strValueOf)), y6h1VarA, g5l0Var.b, System.currentTimeMillis()), (xj61) null);
    }

    public final void f(String str, String str2) {
        g5l0 g5l0Var = this.b;
        x6h1 x6h1VarC = g5l0Var.c.c();
        x6h1VarC.i.add(new a7h1("horizontal_container", str, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("pause_resume_action", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        this.a.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1(ContextTrack$TrackAction.PAUSE, 1, Collections.singletonMap("item_to_be_paused", str2)), x6h1VarC2.a(), g5l0Var.b, System.currentTimeMillis()), (xj61) null);
    }

    public final String g(String str, String str2, fvf1 fvf1Var) {
        g5l0 g5l0Var = this.b;
        x6h1 x6h1VarC = g5l0Var.c.c();
        x6h1VarC.i.add(new a7h1("horizontal_container", str, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("skip_next_action", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        y6h1 y6h1VarA = x6h1VarC2.a();
        int i = (int) fvf1Var.a;
        int i2 = (int) fvf1Var.b;
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        mmr0 mmr0Var = new mmr0("item_to_be_skipped", str2);
        String strValueOf = String.valueOf(i);
        if (strValueOf == null) {
            strValueOf = "";
        }
        mmr0 mmr0Var2 = new mmr0("position_ms", strValueOf);
        String strValueOf2 = String.valueOf(i2);
        return this.a.m(new w7h1("", "", z7h1Var, new x7h1("skip_to_next", 2, sqg0.J(new mmr0[]{mmr0Var, mmr0Var2, new mmr0("total_content_ms", strValueOf2 != null ? strValueOf2 : "")})), y6h1VarA, g5l0Var.b, System.currentTimeMillis()), (xj61) null).a.a;
    }

    public final void h(String str, String str2) {
        g5l0 g5l0Var = this.b;
        x6h1 x6h1VarC = g5l0Var.c.c();
        x6h1VarC.i.add(new a7h1("horizontal_container", str, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("pause_resume_action", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        this.a.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1(ContextTrack$TrackAction.RESUME, 1, Collections.singletonMap("item_to_be_resumed", str2)), x6h1VarC2.a(), g5l0Var.b, System.currentTimeMillis()), (xj61) null);
    }

    public final void i(String str, String str2, fvf1 fvf1Var) {
        g5l0 g5l0Var = this.b;
        x6h1 x6h1VarC = g5l0Var.c.c();
        x6h1VarC.i.add(new a7h1("horizontal_container", str, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("skip_prev_action", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        y6h1 y6h1VarA = x6h1VarC2.a();
        int i = (int) fvf1Var.a;
        int i2 = (int) fvf1Var.b;
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        mmr0 mmr0Var = new mmr0("item_to_be_skipped", str2);
        String strValueOf = String.valueOf(i);
        if (strValueOf == null) {
            strValueOf = "";
        }
        mmr0 mmr0Var2 = new mmr0("position_ms", strValueOf);
        String strValueOf2 = String.valueOf(i2);
        this.a.m(new w7h1("", "", z7h1Var, new x7h1("skip_to_previous", 2, sqg0.J(new mmr0[]{mmr0Var, mmr0Var2, new mmr0("total_content_ms", strValueOf2 != null ? strValueOf2 : "")})), y6h1VarA, g5l0Var.b, System.currentTimeMillis()), (xj61) null);
    }
}
