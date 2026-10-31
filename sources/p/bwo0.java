package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bwo0 implements l5r0, Connectable {
    public drj0 X;
    public final wvo0 a;
    public final mvo0 b;
    public final List c;
    public final xfx d;
    public final oto0 e;
    public final dto0 f;
    public final lcs g;
    public final i8h1 h;
    public final rrk0 i;
    public MobiusLoop.Controller t;

    public bwo0(wvo0 wvo0Var, mvo0 mvo0Var, List list, xfx xfxVar, oto0 oto0Var, dto0 dto0Var, lcs lcsVar, i8h1 i8h1Var, rrk0 rrk0Var) {
        this.a = wvo0Var;
        this.b = mvo0Var;
        this.c = list;
        this.d = xfxVar;
        this.e = oto0Var;
        this.f = dto0Var;
        this.g = lcsVar;
        this.h = i8h1Var;
        this.i = rrk0Var;
        mvo0Var.y(2);
    }

    public final Connection L(Consumer consumer) {
        return new n1b0(this, (byte) 13);
    }

    public final void c(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        NestedScrollView nestedScrollViewInflate = layoutInflater.inflate(2131625316, viewGroup, false);
        int i = 2131430330;
        View viewT = m5n1.t(nestedScrollViewInflate, 2131430330);
        if (viewT != null) {
            i = 2131430614;
            RecyclerView recyclerViewT = m5n1.t(nestedScrollViewInflate, 2131430614);
            if (recyclerViewT != null) {
                byte b = 16;
                drj0 drj0Var = new drj0(nestedScrollViewInflate, viewT, recyclerViewT, (byte) 16);
                recyclerViewT.setLayoutManager(new LinearLayoutManager(1));
                recyclerViewT.setAdapter(this.b);
                recyclerViewT.setClipToPadding(false);
                rwq0.s(recyclerViewT, mgn0.f);
                if (this.e.a.j() && !this.f.a.g(context)) {
                    h98 h98Var = new h98(this.d.b.a, this.g);
                    tzr0 tzr0Var = (tzr0) h98Var.d;
                    CardView cardView = (CardView) tzr0Var.b;
                    k8p1.o(viewT, cardView);
                    String string = context.getString(2131959713);
                    String string2 = context.getString(2131959711);
                    String string3 = context.getString(2131959712);
                    ((TextView) tzr0Var.e).setText(string);
                    ((TextView) tzr0Var.c).setText(string2);
                    ((EncoreButton) tzr0Var.d).setText(string3);
                    cardView.setVisibility(0);
                    h98Var.n(new y3o0(this, (byte) 12));
                    this.h.f(this.i.e(), (Set) null);
                    viewT.setVisibility(0);
                }
                this.X = drj0Var;
                List<y781> list = this.c;
                xvo0 xvo0Var = new xvo0(list);
                wvo0 wvo0Var = this.a;
                z8o0 z8o0Var = wvo0Var.a;
                Context context2 = wvo0Var.e;
                pvo0 pvo0Var = wvo0Var.b;
                bnj0 bnj0Var = wvo0Var.c;
                lcs lcsVar = wvo0Var.d;
                Scheduler scheduler = wvo0Var.g;
                RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
                subtypeEffectHandlerBuilderC.d(rp21.class, new w090(context2, pvo0Var, (byte) 20), scheduler);
                subtypeEffectHandlerBuilderC.g(uth1.class, new o4e0(z8o0Var, (byte) 6));
                subtypeEffectHandlerBuilderC.d(vrn0.class, new w090(lcsVar, context2, (byte) 21), scheduler);
                subtypeEffectHandlerBuilderC.c(lse0.class, new lrj0(bnj0Var, b));
                MobiusLoop.Builder builderD = Mobius.d(tvo0.a, RxConnectables.a(subtypeEffectHandlerBuilderC.h()));
                ArrayList arrayList = new ArrayList();
                for (y781 y781Var : list) {
                    arrayList.add(pvo0Var.a.a(y781Var.a).filter(ws10.S0).map(new ruc0((Object) y781Var, (byte) 23)));
                }
                arrayList.add(pvo0Var.b);
                this.t = Mobius.b(l1d.g(builderD.h(RxEventSources.a(new ObservableSource[]{Observable.merge(arrayList)})).b(new uvo0(wvo0Var)).d(new vvo0(wvo0Var))), xvo0Var, svo0.a, MainThreadWorkRunner.a());
                return;
            }
        }
        bhn0.i("Missing required view with ID: ".concat(nestedScrollViewInflate.getResources().getResourceName(i)));
    }

    public final View getView() {
        drj0 drj0Var = this.X;
        if (drj0Var != null) {
            return (NestedScrollView) drj0Var.b;
        }
        return null;
    }

    public final void start() {
        MobiusLoop.Controller controller = this.t;
        if (controller == null) {
            u890.C("controller");
            throw null;
        }
        controller.c(this);
        MobiusLoop.Controller controller2 = this.t;
        if (controller2 != null) {
            controller2.start();
        } else {
            u890.C("controller");
            throw null;
        }
    }

    public final void stop() {
        MobiusLoop.Controller controller = this.t;
        if (controller == null) {
            u890.C("controller");
            throw null;
        }
        controller.stop();
        MobiusLoop.Controller controller2 = this.t;
        if (controller2 != null) {
            controller2.disconnect();
        } else {
            u890.C("controller");
            throw null;
        }
    }
}
