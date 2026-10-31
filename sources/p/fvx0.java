package p;

import android.R;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ViewFlipper;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.aiplaylist.promptcreation.presentation.MessageInputView;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fvx0 implements p4h1 {
    public final xct0 X;
    public final yqu0 Y;
    public final r4u Z;
    public final mtx0 a;
    public final q6u b;
    public final kiu0 c;
    public final s24 d;
    public final y11 e;
    public final ConstraintLayout f;
    public final irx0 g;
    public final tux0 h;
    public final ytp0 i;
    public final cqx0 t;

    public fvx0(th30 th30Var, skq skqVar, ukq ukqVar, vkq vkqVar, wkq wkqVar, mtx0 mtx0Var, q6u q6uVar, kiu0 kiu0Var, s24 s24Var, iac0 iac0Var, y11 y11Var) {
        this.a = mtx0Var;
        this.b = q6uVar;
        this.c = kiu0Var;
        this.d = s24Var;
        this.e = y11Var;
        ConstraintLayout constraintLayout = (ConstraintLayout) s24Var.b;
        this.f = constraintLayout;
        this.g = new irx0((y441) s24Var.h, y11Var);
        this.h = new tux0((bjx) s24Var.Y, y11Var, (mtx0) ((ezo) vkqVar.a.c).c.get());
        p1f0 p1f0Var = (p1f0) s24Var.Z;
        ezo ezoVar = (ezo) ukqVar.a.c;
        mtx0 mtx0Var2 = (mtx0) ezoVar.c.get();
        pe peVar = (pe) ((gux0) ezoVar.v).i.get();
        c8o.l(peVar);
        gux0 gux0Var = (gux0) ezoVar.v;
        yqg yqgVar = (yqg) gux0Var.a.get();
        c8o.l(yqgVar);
        gw70 gw70Var = (gw70) gux0Var.e.get();
        c8o.l(gw70Var);
        e511 e511Var = (e511) gux0Var.F.get();
        c8o.l(e511Var);
        this.i = new ytp0(mtx0Var2, peVar, p1f0Var, y11Var, yqgVar, gw70Var, e511Var);
        m021 m021Var = (m021) s24Var.g;
        ezo ezoVar2 = (ezo) wkqVar.a.c;
        kiu0 kiu0Var2 = (kiu0) ((gux0) ezoVar2.v).t.get();
        c8o.l(kiu0Var2);
        this.t = new cqx0(m021Var, y11Var, kiu0Var2, (Observable) ezoVar2.h.get());
        this.X = new xct0((zgz0) s24Var.t);
        y441 y441Var = (y441) s24Var.X;
        float f = constraintLayout.getContext().getResources().getDisplayMetrics().density;
        ezo ezoVar3 = (ezo) skqVar.a.c;
        mtx0 mtx0Var3 = (mtx0) ezoVar3.c.get();
        luk lukVar = (luk) ((gux0) ezoVar3.v).s.get();
        c8o.l(lukVar);
        bf4 bf4Var = new bf4(lukVar);
        gw70 gw70Var2 = (gw70) ((gux0) ezoVar3.v).e.get();
        c8o.l(gw70Var2);
        this.Y = new yqu0(y441Var, y11Var, f, mtx0Var3, bf4Var, gw70Var2);
        this.Z = r4u.c(new r4u[]{r4u.d(new z1w(avx0.b, (byte) 1), r4u.a(new rpv0(this, (byte) 7))), r4u.d(new z1w(bvx0.b, (byte) 1), r4u.a(new hvp0(this, (byte) 25))), r4u.d(f2x0.c, r4u.a(new uip0(this, (byte) 24))), r4u.d(h2x0.c, r4u.a(new l1p0(this, (byte) 29))), r4u.d(i2x0.c, r4u.a(new vyq0(this, (byte) 18)))});
        rwq0.s(constraintLayout, mgn0.a1);
        th30Var.j0("req_more_option_fragment_key", iac0Var, new evx0(this, (byte) 0));
        th30Var.j0("req_create_playlist_failure_fragment_key", iac0Var, new evx0(this, (byte) 1));
        th30Var.j0("req_edit_option_fragment_key", iac0Var, new evx0(this, (byte) 2));
        ((MessageInputView) s24Var.f).V0 = new hox0(this, (byte) 3);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(constraintLayout.getResources().getInteger(R.integer.config_shortAnimTime));
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation2.setDuration(constraintLayout.getResources().getInteger(R.integer.config_shortAnimTime));
        ViewFlipper viewFlipper = (ViewFlipper) s24Var.i;
        viewFlipper.setInAnimation(alphaAnimation2);
        viewFlipper.setOutAnimation(alphaAnimation);
    }

    @Override // p.p4h1
    public final View a() {
        return this.f;
    }
}
