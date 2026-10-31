package p;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class yhr {
    public final ynb0 a;
    public final uol0 b;

    public yhr(ynb0 ynb0Var, uol0 uol0Var) {
        this.a = ynb0Var;
        this.b = uol0Var;
    }

    public final kte0 a(czo1 czo1Var) {
        boolean z = czo1Var instanceof ft8;
        uol0 uol0Var = this.b;
        ynb0 ynb0Var = this.a;
        if (z) {
            return new ite0(((i8h1) ynb0Var.get()).f(uol0Var.e(), (Set) null).a);
        }
        boolean z2 = czo1Var instanceof et8;
        b7x b7xVar = b7x.a;
        if (z2) {
            i8h1 i8h1Var = (i8h1) ynb0Var.get();
            uol0Var.getClass();
            x6h1 x6h1VarC = uol0Var.b.c();
            x6h1VarC.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            return new jte0(i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC.a(), uol0Var.a, System.currentTimeMillis()), (xj61) null));
        }
        if (czo1Var instanceof ht8) {
            i8h1 i8h1Var2 = (i8h1) ynb0Var.get();
            uol0Var.getClass();
            x6h1 x6h1VarC2 = uol0Var.b.c();
            x6h1VarC2.i.add(new a7h1("go_to_settings_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            return new jte0(i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", ((ht8) czo1Var).c)), x6h1VarC2.a(), uol0Var.a, System.currentTimeMillis()), (xj61) null));
        }
        if (!(czo1Var instanceof gt8)) {
            eg.o();
            return null;
        }
        i8h1 i8h1Var3 = (i8h1) ynb0Var.get();
        uol0Var.getClass();
        x6h1 x6h1VarC3 = uol0Var.b.c();
        x6h1VarC3.i.add(new a7h1("download_video_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC3.j = false;
        return new jte0(i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC3.a(), uol0Var.a, System.currentTimeMillis()), (xj61) null));
    }
}
