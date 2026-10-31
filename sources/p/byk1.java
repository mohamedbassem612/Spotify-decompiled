package p;

import com.spotify.mobius.First;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.Next;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class byk1 implements MobiusLoop.Logger {
    public final dzp0 a;

    public byk1(dzp0 dzp0Var) {
        this.a = dzp0Var;
    }

    public final void a(Object obj, Object obj2, Next next) {
        if (((ayk1) obj2).equals(xxk1.a)) {
            dzp0 dzp0Var = this.a;
            i8h1 i8h1Var = (i8h1) ((jly0) dzp0Var.b).get();
            x6h1 x6h1VarC = ((brl0) dzp0Var.d).b.c();
            x6h1VarC.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            y6h1 y6h1VarA = x6h1VarC.a();
            b7x b7xVar = b7x.a;
            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
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
