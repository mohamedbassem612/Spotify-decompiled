package p;

import android.view.View;
import android.widget.FrameLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import com.spotify.nowplaying.scroll.ScrollCardType;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class e061 implements h8l, i060 {
    public final View a;
    public final dx0 b;
    public final nt21 c;
    public Consumer d;
    public List e = z6x.a;
    public final r4u f = r4u.c(new r4u[]{r4u.d(new ba40(pz51.b, (byte) 3), r4u.a(new m7y0(this, (byte) 24))), r4u.d(new ba40(qz51.b, (byte) 3), r4u.a(new up41(this, (byte) 5))), r4u.d(new ba40(rz51.b, (byte) 3), r4u.a(new nl51((Object) this, (byte) 2))), r4u.d(a2x0.X, r4u.a(new dr41(this, 5)))});
    public dtw g;
    public final l060 h;
    public final idd1 i;
    public final EncoreButton t;

    public e061(View view, e7q e7qVar, dx0 dx0Var, nt21 nt21Var) {
        this.a = view;
        this.b = dx0Var;
        this.c = nt21Var;
        l060 l060Var = new l060(view.getContext().getString(2131961608), "", 1, 1);
        this.h = l060Var;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(2131430917);
        this.i = new idd1(new l451(this, (byte) 11));
        EncoreButton encoreButtonFindViewById = view.findViewById(2131428240);
        this.t = encoreButtonFindViewById;
        u060 u060VarA = e7qVar.a(this);
        tka0 tka0Var = dtw.C;
        dtw dtwVarB = mhc.b(view.getContext(), frameLayout, f6o1.A(u060VarA, view.getLayoutParams(), (ScrollCardType) null, 2), l060Var, (ipb1) null, 112);
        this.g = dtwVarB;
        k8p1.o(frameLayout, dtwVarB.w);
        encoreButtonFindViewById.setOnClickListener(new hid0(this, (byte) 29));
    }

    public final Connection L(Consumer consumer) {
        this.d = consumer;
        return new n1b0(this, (byte) 27);
    }

    public final void b(f060 f060Var) {
        Consumer consumer;
        if (!f060Var.equals(b060.a) || (consumer = this.d) == null) {
            return;
        }
        consumer.accept(uz51.a);
    }

    public final Object getView() {
        return this.a;
    }

    public final void stop() {
        this.g = null;
    }

    public final void start() {
    }
}
