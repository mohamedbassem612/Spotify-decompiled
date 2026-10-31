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
import com.spotify.music.SpotifyMainActivity;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g8e implements l5r0, Connectable {
    public MobiusLoop.Controller X;
    public cab Y;
    public final c8e a;
    public final an b;
    public final SpotifyMainActivity c;
    public final bi90 d;
    public final xfx e;
    public final oto0 f;
    public final dto0 g;
    public final lcs h;
    public final ynb0 i;
    public final rrk0 t;

    public g8e(c8e c8eVar, an anVar, SpotifyMainActivity spotifyMainActivity, bi90 bi90Var, xfx xfxVar, oto0 oto0Var, dto0 dto0Var, lcs lcsVar, ynb0 ynb0Var, rrk0 rrk0Var) {
        this.a = c8eVar;
        this.b = anVar;
        this.c = spotifyMainActivity;
        this.d = bi90Var;
        this.e = xfxVar;
        this.f = oto0Var;
        this.g = dto0Var;
        this.h = lcsVar;
        this.i = ynb0Var;
        this.t = rrk0Var;
    }

    public final Connection L(Consumer consumer) {
        return new rp(this, (byte) 13);
    }

    public final void c(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        NestedScrollView nestedScrollViewInflate = layoutInflater.inflate(2131624326, viewGroup, false);
        int i = 2131427939;
        TextView textView = (TextView) m5n1.t(nestedScrollViewInflate, 2131427939);
        if (textView != null) {
            i = 2131427957;
            RecyclerView recyclerViewT = m5n1.t(nestedScrollViewInflate, 2131427957);
            if (recyclerViewT != null) {
                i = 2131427958;
                if (((TextView) m5n1.t(nestedScrollViewInflate, 2131427958)) != null) {
                    i = 2131430330;
                    View viewT = m5n1.t(nestedScrollViewInflate, 2131430330);
                    if (viewT != null) {
                        i = 2131430872;
                        if (m5n1.t(nestedScrollViewInflate, 2131430872) != null) {
                            cab cabVar = new cab(nestedScrollViewInflate, textView, recyclerViewT, viewT);
                            recyclerViewT.setLayoutManager(new LinearLayoutManager(1));
                            recyclerViewT.setAdapter(this.b);
                            recyclerViewT.setClipToPadding(false);
                            rwq0.s(recyclerViewT, kna.t);
                            if (this.f.a.j() && !this.g.a.g(context)) {
                                h98 h98Var = new h98(this.e.b.a, this.h);
                                tzr0 tzr0Var = (tzr0) h98Var.d;
                                CardView cardView = (CardView) tzr0Var.b;
                                k8p1.o(viewT, cardView);
                                String string = context.getString(2131959713);
                                String string2 = context.getString(2131954946);
                                String string3 = context.getString(2131959712);
                                ((TextView) tzr0Var.e).setText(string);
                                ((TextView) tzr0Var.c).setText(string2);
                                ((EncoreButton) tzr0Var.d).setText(string3);
                                cardView.setVisibility(0);
                                h98Var.n(new m4d(this, (byte) 13));
                                ((i8h1) this.i.get()).f(this.t.e(), (Set) null);
                                viewT.setVisibility(0);
                            }
                            this.Y = cabVar;
                            SpotifyMainActivity spotifyMainActivity = this.c;
                            mmo mmoVar = spotifyMainActivity.j1;
                            if (mmoVar == null) {
                                u890.C("currentFragmentAccessor");
                                throw null;
                            }
                            zf30 zf30VarC = mmoVar.c();
                            rh90 rh90Var = this.d;
                            if (zf30VarC != null) {
                                if (rh90Var instanceof rh90) {
                                    String str = rh90Var.c;
                                    mmo mmoVar2 = spotifyMainActivity.j1;
                                    if (mmoVar2 == null) {
                                        u890.C("currentFragmentAccessor");
                                        throw null;
                                    }
                                    mmoVar2.b(str, zf30VarC);
                                } else {
                                    if (!(rh90Var instanceof mh90)) {
                                        eg.o();
                                        return;
                                    }
                                    String str2 = ((mh90) rh90Var).c;
                                    mmo mmoVar3 = spotifyMainActivity.j1;
                                    if (mmoVar3 == null) {
                                        u890.C("currentFragmentAccessor");
                                        throw null;
                                    }
                                    mmoVar3.b(str2, zf30VarC);
                                }
                            }
                            e8e e8eVar = new e8e(rh90Var);
                            c8e c8eVar = this.a;
                            qnv0 qnv0Var = c8eVar.a;
                            Scheduler scheduler = c8eVar.b;
                            tdl0 tdl0Var = c8eVar.d;
                            i8h1 i8h1Var = (i8h1) c8eVar.e.get();
                            oto0 oto0Var = c8eVar.f;
                            dg30 dg30Var = c8eVar.g;
                            RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
                            subtypeEffectHandlerBuilderC.g(q7e.class, new zd1(qnv0Var, dg30Var, scheduler, (byte) 1));
                            subtypeEffectHandlerBuilderC.g(r7e.class, new so(qnv0Var, scheduler, (byte) 4));
                            subtypeEffectHandlerBuilderC.c(p7e.class, new bj8(tdl0Var, oto0Var.a.g(), i8h1Var));
                            this.X = Mobius.b(gvg.d("NotificationCategoryDetails", Mobius.d(b8e.a, RxConnectables.a(subtypeEffectHandlerBuilderC.h())).h(RxEventSources.a(new ObservableSource[]{c8eVar.c.a}))), e8eVar, a8e.a, MainThreadWorkRunner.a());
                            return;
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(nestedScrollViewInflate.getResources().getResourceName(i)));
    }

    public final View getView() {
        cab cabVar = this.Y;
        if (cabVar != null) {
            return (NestedScrollView) cabVar.b;
        }
        return null;
    }

    public final void start() {
        MobiusLoop.Controller controller = this.X;
        if (controller == null) {
            u890.C("controller");
            throw null;
        }
        controller.c(this);
        MobiusLoop.Controller controller2 = this.X;
        if (controller2 != null) {
            controller2.start();
        } else {
            u890.C("controller");
            throw null;
        }
    }

    public final void stop() {
        MobiusLoop.Controller controller = this.X;
        if (controller == null) {
            u890.C("controller");
            throw null;
        }
        controller.stop();
        MobiusLoop.Controller controller2 = this.X;
        if (controller2 != null) {
            controller2.disconnect();
        } else {
            u890.C("controller");
            throw null;
        }
    }
}
