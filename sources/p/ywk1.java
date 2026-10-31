package p;

import com.spotify.mobius.First;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.Next;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ywk1 implements MobiusLoop.Logger {
    public final dzp0 a;

    public ywk1(dzp0 dzp0Var) {
        this.a = dzp0Var;
    }

    public final void a(Object obj, Object obj2, Next next) {
        yvk1 yvk1Var = (yvk1) obj2;
        xhz xhzVar = ((fwk1) obj).h;
        if (yvk1Var.equals(xvk1.a)) {
            xwk1 xwk1Var = new xwk1(this, (byte) 0);
            if (xhzVar.e) {
                xwk1Var.invoke();
                return;
            }
            return;
        }
        if (yvk1Var.equals(svk1.a)) {
            xwk1 xwk1Var2 = new xwk1(this, (byte) 1);
            if (xhzVar.e) {
                xwk1Var2.invoke();
                return;
            }
            return;
        }
        if (yvk1Var.equals(tvk1.a)) {
            dzp0 dzp0Var = this.a;
            i8h1 i8h1Var = (i8h1) ((jly0) dzp0Var.b).get();
            brl0 brl0Var = (brl0) dzp0Var.c;
            x6h1 x6h1VarC = brl0Var.b.c();
            x6h1VarC.i.add(new a7h1("voting_error_banner", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = true;
            y6h1 y6h1VarA = x6h1VarC.a();
            k7h1 k7h1Var = new k7h1();
            ((xjn) k7h1Var).a = y6h1VarA;
            ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
            k7h1Var.e = brl0Var.c;
            i8h1Var.f(k7h1Var.a(), (Set) null);
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
