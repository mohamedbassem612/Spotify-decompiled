package p;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class z5h1 {
    public final i8h1 a;
    public final uol0 b;

    public z5h1(i8h1 i8h1Var, uol0 uol0Var) {
        this.a = i8h1Var;
        this.b = uol0Var;
    }

    public final void a(oto1 oto1Var) {
        uol0 uol0Var = this.b;
        y6h1 y6h1Var = uol0Var.b;
        boolean zEquals = oto1Var.equals(dx7.c);
        i8h1 i8h1Var = this.a;
        if (zEquals) {
            i8h1Var.f(uol0Var.e(), (Set) null);
            return;
        }
        boolean z = oto1Var instanceof fx7;
        b7x b7xVar = b7x.a;
        if (z) {
            x6h1 x6h1VarC = y6h1Var.c();
            x6h1VarC.i.add(new a7h1("go_to_settings_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", ((fx7) oto1Var).b)), x6h1VarC.a(), uol0Var.a, System.currentTimeMillis()), (xj61) null);
            return;
        }
        if (oto1Var instanceof ex7) {
            x6h1 x6h1VarC2 = y6h1Var.c();
            x6h1VarC2.i.add(new a7h1("download_video_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), uol0Var.a, System.currentTimeMillis()), (xj61) null);
            return;
        }
        if (!oto1Var.equals(dx7.b)) {
            eg.o();
            return;
        }
        x6h1 x6h1VarC3 = y6h1Var.c();
        x6h1VarC3.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC3.j = false;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC3.a(), uol0Var.a, System.currentTimeMillis()), (xj61) null);
    }
}
