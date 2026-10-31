package p;

import com.spotify.mobius.First;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.Next;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yzf implements MobiusLoop.Logger {
    public final h4l0 a;
    public final wqk0 b;
    public final idd1 c;

    public yzf(z1p z1pVar, h4l0 h4l0Var, wqk0 wqk0Var) {
        this.a = h4l0Var;
        this.b = wqk0Var;
        this.c = new idd1(new lwe(z1pVar, (byte) 11));
    }

    public final void a(Object obj, Object obj2, Next next) {
        qzf qzfVar = (qzf) obj;
        mzf mzfVar = (mzf) obj2;
        wqk0 wqk0Var = this.b;
        y6h1 y6h1Var = wqk0Var.c;
        y6h1 y6h1Var2 = this.a.b;
        boolean zEquals = mzfVar.equals(mzf.a);
        b7x b7xVar = b7x.a;
        byte b = 0;
        if (zEquals) {
            i8h1 i8h1VarG = g();
            x6h1 x6h1VarC = y6h1Var2.c();
            x6h1VarC.i.add(new a7h1("close_account_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            i8h1VarG.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
        } else if (mzfVar.equals(mzf.f)) {
            i8h1 i8h1VarG2 = g();
            x6h1 x6h1VarC2 = y6h1Var2.c();
            x6h1VarC2.i.add(new a7h1("close_account_dialog", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = true;
            x6h1 x6h1VarC3 = x6h1VarC2.a().c();
            x6h1VarC3.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC3.j = false;
            i8h1VarG2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
        } else if (mzfVar.equals(mzf.d)) {
            i8h1 i8h1VarG3 = g();
            x6h1 x6h1VarC4 = y6h1Var2.c();
            x6h1VarC4.i.add(new a7h1("close_account_dialog", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC4.j = true;
            x6h1 x6h1VarC5 = x6h1VarC4.a().c();
            x6h1VarC5.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC5.j = false;
            i8h1VarG3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
        } else if (mzfVar.equals(mzf.e)) {
            i8h1 i8h1VarG4 = g();
            x6h1 x6h1VarC6 = y6h1Var2.c();
            x6h1VarC6.i.add(new a7h1("close_account_dialog", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC6.j = true;
            x6h1 x6h1VarC7 = x6h1VarC6.a().c();
            x6h1VarC7.i.add(new a7h1("confirm_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC7.j = false;
            i8h1VarG4.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
        } else if (!mzfVar.equals(mzf.b) && !mzfVar.equals(mzf.c)) {
            if (mzfVar.equals(mzf.g)) {
                i8h1 i8h1VarG5 = g();
                x6h1 x6h1VarC8 = y6h1Var.c();
                x6h1VarC8.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC8.j = false;
                i8h1VarG5.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC8.a(), wqk0Var.b, System.currentTimeMillis()), (xj61) null);
            } else {
                if (!mzfVar.equals(mzf.h)) {
                    eg.o();
                    return;
                }
                i8h1 i8h1VarG6 = g();
                x6h1 x6h1VarC9 = y6h1Var.c();
                x6h1VarC9.i.add(new a7h1("try_again_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC9.j = false;
                i8h1VarG6.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), x6h1VarC9.a(), wqk0Var.b, System.currentTimeMillis()), (xj61) null);
            }
        }
        next.e(new xzf(qzfVar, this, b));
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

    public final i8h1 g() {
        return (i8h1) this.c.getValue();
    }
}
