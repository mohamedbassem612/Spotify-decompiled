package p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.premiumdestination.destination.elementimpl.PremiumPageListElementImpl$ui$1$1$layoutManager$1;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zuv0 implements isw {
    public final PremiumPageListElementImpl$ui$1$1$layoutManager$1 N0;
    public final /* synthetic */ avv0 O0;
    public final llm X;
    public xab1 Y;
    public final pes0 Z;
    public final rt01 a;
    public final rt01 b;
    public final rt01 c;
    public final rt01 d;
    public final dx0 e;
    public final rt01 f;
    public final d83 g;
    public final hm10 h;
    public final dx0 i;
    public final kdn0 t;

    public zuv0(avv0 avv0Var, d75 d75Var, ViewGroup viewGroup) {
        this.O0 = avv0Var;
        e93 e93Var = (e93) avv0Var.c.a.c;
        this.a = new rt01(new ofx(e93Var.a().a, (byte) 4), e93Var.d(), new yxk0((byte) 1), new m4c((byte) 20));
        this.b = new rt01(new zfx(((e93) avv0Var.d.a.c).a().c, (byte) 15), new yxk0((byte) 1), new m4c((byte) 20));
        this.c = new rt01(new hjc(((e93) avv0Var.e.a.c).a().b, (byte) 27), new yxk0((byte) 1), new m4c((byte) 20));
        this.d = avv0Var.f.a();
        this.e = new dx0(((e93) avv0Var.g.a.c).d(), new yxk0((byte) 1), new m4c((byte) 20));
        this.f = new rt01(new hjc(((e93) avv0Var.h.a.c).a().b, (byte) 29), new yxk0((byte) 1), new m4c((byte) 20), (byte) 0);
        avv0Var.i.getClass();
        this.g = new d83((byte) 7);
        avv0Var.t.getClass();
        this.h = new hm10(new yxk0((byte) 1), new m4c((byte) 20));
        e93 e93Var2 = (e93) avv0Var.X.a.c;
        this.i = new dx0(new zfx(e93Var2.a().c, (byte) 14), (ryp) ((jly0) e93Var2.O0).get(), new yxk0((byte) 1), new m4c((byte) 20));
        this.t = new kdn0();
        fns fnsVar = igu.a;
        bs50 bs50Var = pyf0.a.f;
        j0d1 j0d1VarB = guo1.B();
        bs50Var.getClass();
        this.X = smo1.e(flo1.l(bs50Var, j0d1VarB));
        RecyclerView recyclerViewInflate = LayoutInflater.from(d75Var.a).inflate(2131625368, viewGroup, false);
        if (recyclerViewInflate == null) {
            bhn0.i("rootView");
            throw null;
        }
        RecyclerView recyclerView = recyclerViewInflate;
        this.Z = new pes0(recyclerView, recyclerView);
        recyclerView.getContext();
        PremiumPageListElementImpl$ui$1$1$layoutManager$1 premiumPageListElementImpl$ui$1$1$layoutManager$1 = new PremiumPageListElementImpl$ui$1$1$layoutManager$1(1);
        premiumPageListElementImpl$ui$1$1$layoutManager$1.g1 = true;
        this.N0 = premiumPageListElementImpl$ui$1$1$layoutManager$1;
        new ne(3, new yuv0(this, (byte) 1)).f(recyclerView, premiumPageListElementImpl$ui$1$1$layoutManager$1, false);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setClipToPadding(false);
        rwq0.s(recyclerView, mgn0.T0);
    }

    public final void a(Object obj, ysw yswVar) {
        wuv0 wuv0Var = (wuv0) obj;
        xab1 xab1Var = this.Y;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.Y = fn31.T(this.X, (o8n) null, 0, new glu0(this, wuv0Var, this.O0, (lnm) null, (byte) 7), 3);
    }

    public final View getView() {
        return this.Z.a;
    }
}
