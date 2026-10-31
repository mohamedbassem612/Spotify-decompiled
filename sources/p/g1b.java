package p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class g1b implements Connectable {
    public final /* synthetic */ byte a = 0;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public Object i;
    public final Object t;

    public g1b(LayoutInflater layoutInflater, ViewGroup viewGroup, i8x0 i8x0Var, s880 s880Var) {
        this.b = i8x0Var;
        this.c = s880Var;
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(2131624692, viewGroup, false);
        this.d = viewGroup2;
        RecyclerView recyclerViewFindViewById = viewGroup2.findViewById(2131430614);
        this.e = recyclerViewFindViewById;
        this.f = (FrameLayout) viewGroup2.findViewById(2131428619);
        ComposeView composeViewFindViewById = viewGroup2.findViewById(2131428930);
        this.g = composeViewFindViewById;
        this.h = v8r.q(r830.c);
        this.t = new idd1(new ft0(viewGroup, this, (byte) 20));
        layoutInflater.getContext();
        recyclerViewFindViewById.setLayoutManager(new LinearLayoutManager(1));
        rwq0.s(recyclerViewFindViewById, mgn0.Z0);
        composeViewFindViewById.setContent(new j2i(1017178948, new ecx0(this, (byte) 1), true));
    }

    public static final /* synthetic */ FrameLayout a(g1b g1bVar) {
        return (FrameLayout) g1bVar.f;
    }

    public final Connection L(Consumer consumer) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new cn(this, consumer, (byte) 4);
            case 1:
                return new qlu0(this, consumer);
            default:
                this.i = new m42(consumer, (byte) 25);
                i8x0 i8x0Var = (i8x0) this.b;
                i8x0Var.R0 = new hg7(consumer, (byte) 2);
                i8x0Var.S0 = new gcx0(consumer, (byte) 0);
                i8x0Var.T0 = new m42(consumer, (byte) 26);
                i8x0Var.V0 = new m42(consumer, (byte) 27);
                i8x0Var.W0 = new m42(consumer, (byte) 28);
                i8x0Var.X0 = new m42(consumer, (byte) 29);
                i8x0Var.U0 = new gcx0(consumer, (byte) 1);
                i8x0Var.Z0 = new gcx0(consumer, (byte) 2);
                i8x0Var.Y0 = new kpw0(this, consumer, (byte) 2);
                return new pee0(this, new zl7(consumer, (byte) 13), (byte) 8);
        }
    }

    public View b() {
        return (View) this.d;
    }

    public g1b(yon yonVar, l5x0 l5x0Var, so soVar, z0u0 z0u0Var, zd1 zd1Var, Scheduler scheduler, b020 b020Var, a381 a381Var, o481 o481Var) {
        this.b = yonVar;
        this.c = l5x0Var;
        this.d = soVar;
        this.e = z0u0Var;
        this.f = zd1Var;
        this.g = scheduler;
        this.h = b020Var;
        this.i = a381Var;
        this.t = o481Var;
    }

    public g1b(LayoutInflater layoutInflater, ViewGroup viewGroup, gw70 gw70Var, ff4 ff4Var) {
        this.b = gw70Var;
        this.c = ff4Var;
        View viewInflate = layoutInflater.inflate(2131624092, viewGroup, false);
        this.d = viewInflate;
        this.e = (Button) viewInflate.findViewById(2131429665);
        this.f = viewInflate.findViewById(2131428817);
        td10 td10Var = new td10((String) null, "＋", (String) null, (sd10) null);
        td10Var.e = true;
        this.g = td10Var;
        this.h = (TextView) viewInflate.findViewById(2131429663);
        this.i = (TextView) viewInflate.findViewById(2131429660);
        this.t = (TextView) viewInflate.findViewById(2131429662);
        rwq0.s(viewInflate, kna.e);
    }
}
