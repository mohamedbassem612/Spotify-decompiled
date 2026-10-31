package p;

import com.spotify.mobius.First;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.Next;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tb40 implements MobiusLoop.Logger {
    public final i8h1 a;
    public final txk0 b;

    public tb40(String str, i8h1 i8h1Var) {
        this.a = i8h1Var;
        this.b = new txk0(str, (byte) 26);
    }

    public final void a(Object obj, Object obj2, Next next) {
        wb40 wb40Var = (wb40) obj;
        rb40 rb40Var = (rb40) obj2;
        y6h1 y6h1Var = this.b.b;
        boolean zEquals = rb40Var.equals(pb40.a);
        b7x b7xVar = b7x.a;
        i8h1 i8h1Var = this.a;
        if (zEquals) {
            x6h1 x6h1VarC = y6h1Var.c();
            x6h1VarC.i.add(new a7h1("safety_center_label", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", "")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
            return;
        }
        if (rb40Var.equals(mb40.a)) {
            x6h1 x6h1VarC2 = y6h1Var.c();
            x6h1VarC2.i.add(new a7h1("done_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("block_content", 1, Collections.singletonMap("item_to_be_blocked", wb40Var.a)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
            return;
        }
        if (rb40Var.equals(jb40.a)) {
            x6h1 x6h1VarC3 = y6h1Var.c();
            x6h1VarC3.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC3.j = false;
            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
            return;
        }
        if (rb40Var instanceof lb40) {
            Integer numValueOf = Integer.valueOf(((lb40) rb40Var).a);
            x6h1 x6h1VarC4 = y6h1Var.c();
            x6h1VarC4.i.add(new a7h1("user_row", (String) null, numValueOf, (String) null, (String) null));
            x6h1VarC4.j = false;
            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{new mmr0("state_before_toggle", "unblocked"), new mmr0("state_after_toggle", "blocked")})), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
            return;
        }
        if (rb40Var instanceof qb40) {
            Integer numValueOf2 = Integer.valueOf(((qb40) rb40Var).a);
            x6h1 x6h1VarC5 = y6h1Var.c();
            x6h1VarC5.i.add(new a7h1("user_row", (String) null, numValueOf2, (String) null, (String) null));
            x6h1VarC5.j = false;
            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{new mmr0("state_before_toggle", "blocked"), new mmr0("state_after_toggle", "unblocked")})), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
        }
    }

    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2, Exception exc) {
    }

    public final /* bridge */ /* synthetic */ void c(Object obj, First first) {
    }

    public final /* bridge */ /* synthetic */ void d(Object obj, Object obj2) {
    }

    public final /* bridge */ /* synthetic */ void e(Object obj) {
    }

    public final /* bridge */ /* synthetic */ void f(Object obj, Exception exc) {
    }
}
