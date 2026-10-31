package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y901 extends dwb {
    public final c1y0 V1;
    public hnq W1;
    public inq X1;
    public tk21 Y1;
    public aa01 Z1;
    public final idd1 a2 = new idd1(new vwz0(this, (byte) 5));

    public y901(c1y0 c1y0Var) {
        this.V1 = c1y0Var;
    }

    public final void G0() {
        super/*p.t2u*/.G0();
        aa01 aa01Var = this.Z1;
        if (aa01Var != null) {
            aa01Var.start();
        } else {
            u890.C("presenter");
            throw null;
        }
    }

    public final void H0() {
        super/*p.t2u*/.H0();
        aa01 aa01Var = this.Z1;
        if (aa01Var != null) {
            aa01Var.stop();
        } else {
            u890.C("presenter");
            throw null;
        }
    }

    public final void I0(View view, Bundle bundle) {
        BottomSheetBehavior bottomSheetBehaviorZ = BottomSheetBehavior.z((ConstraintLayout) this.a2.getValue());
        bottomSheetBehaviorZ.L(3);
        bottomSheetBehaviorZ.H(true);
        bottomSheetBehaviorZ.E = true;
        bottomSheetBehaviorZ.t(new jph(this, (byte) 7));
    }

    public final int b1() {
        return 2132017751;
    }

    public final void v0(Context context) {
        this.V1.f(this);
        super/*p.t2u*/.v0(context);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(2131625587, viewGroup, false);
        Bundle bundle2 = ((zf30) this).f;
        String string = bundle2 != null ? bundle2.getString("episode_uri") : null;
        if (string == null) {
            string = "";
        }
        Bundle bundle3 = ((zf30) this).f;
        String string2 = bundle3 != null ? bundle3.getString("episode_uri") : null;
        String str = string2 != null ? string2 : "";
        hnq hnqVar = this.W1;
        if (hnqVar == null) {
            u890.C("viewBinderFactory");
            throw null;
        }
        viewInflate.getClass();
        jnq jnqVar = (jnq) hnqVar.a.c;
        s59 s59Var = new s59(viewInflate, new dx0((tk21) ((jly0) jnqVar.a).get()), new d83((tk21) ((jly0) jnqVar.a).get()));
        inq inqVar = this.X1;
        if (inqVar == null) {
            u890.C("presenterFactory");
            throw null;
        }
        Context contextP0 = P0();
        fl21 fl21Var = new fl21(string, str);
        jnq jnqVar2 = (jnq) inqVar.a.c;
        z901 z901Var = (z901) jnqVar2.c;
        th30 th30Var = (th30) z901Var.a.get();
        c8o.l(th30Var);
        t2j0 t2j0Var = (t2j0) z901Var.c.get();
        c8o.l(t2j0Var);
        qy30 qy30Var = new qy30(t2j0Var);
        ypa ypaVar = new ypa((byte) 23, false);
        tk21 tk21Var = (tk21) ((jly0) jnqVar2.a).get();
        kt91 kt91Var = (kt91) z901Var.d.get();
        c8o.l(kt91Var);
        Scheduler scheduler = (Scheduler) z901Var.b.get();
        c8o.l(scheduler);
        this.Z1 = new aa01(s59Var, contextP0, fl21Var, new ea01(th30Var, qy30Var, ypaVar, tk21Var, kt91Var, scheduler));
        return viewInflate;
    }
}
