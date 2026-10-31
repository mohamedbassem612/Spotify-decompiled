package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w9h implements l5r0 {
    public final elp a;
    public final t9h b;
    public final v9h c;
    public wp20 d;
    public ku1 e;
    public MobiusLoop.Controller f;

    public w9h(elp elpVar, t9h t9hVar, v9h v9hVar) {
        this.a = elpVar;
        this.b = t9hVar;
        this.c = v9hVar;
    }

    public final void c(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        t7p t7pVar = (t7p) this.a.a.c;
        gw70 gw70Var = (gw70) ((j1b0) t7pVar.b).j.get();
        c8o.l(gw70Var);
        String str = ((k1b0) t7pVar.c).b;
        c8o.m(str);
        akp1 akp1Var = new akp1(str, (byte) 5);
        i8h1 i8h1Var = (i8h1) ((j1b0) t7pVar.b).c.get();
        c8o.l(i8h1Var);
        wp20 wp20Var = new wp20(gw70Var, context, akp1Var, new ye90(i8h1Var));
        this.d = wp20Var;
        this.e = new ku1(wp20Var, (byte) 16);
        u9h u9hVar = (u9h) this.b;
        this.f = Mobius.c(u9hVar.c, this.c, new SchedulerWorkRunner(u9hVar.a));
    }

    public final View getView() {
        wp20 wp20Var = this.d;
        if (wp20Var == null) {
            return null;
        }
        if (wp20Var != null) {
            return (ConstraintLayout) ((oj80) wp20Var.e).c;
        }
        u890.C("views");
        throw null;
    }

    public final void start() {
        MobiusLoop.Controller controller = this.f;
        if (controller == null || controller.isRunning()) {
            return;
        }
        MobiusLoop.Controller controller2 = this.f;
        if (controller2 == null) {
            u890.C("controller");
            throw null;
        }
        ku1 ku1Var = this.e;
        if (ku1Var == null) {
            u890.C("connectable");
            throw null;
        }
        controller2.c(ku1Var);
        MobiusLoop.Controller controller3 = this.f;
        if (controller3 != null) {
            controller3.start();
        } else {
            u890.C("controller");
            throw null;
        }
    }

    public final void stop() {
        MobiusLoop.Controller controller = this.f;
        if (controller != null) {
            if (controller == null) {
                u890.C("controller");
                throw null;
            }
            if (controller.isRunning()) {
                MobiusLoop.Controller controller2 = this.f;
                if (controller2 == null) {
                    u890.C("controller");
                    throw null;
                }
                controller2.stop();
                MobiusLoop.Controller controller3 = this.f;
                if (controller3 != null) {
                    controller3.disconnect();
                } else {
                    u890.C("controller");
                    throw null;
                }
            }
        }
    }
}
