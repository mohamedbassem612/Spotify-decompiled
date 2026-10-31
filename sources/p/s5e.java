package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.icons.IconExclamationCircle;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s5e implements l5r0, Connectable {
    public MobiusLoop.Controller N0;
    public cab O0;
    public final i8h1 X;
    public final tdl0 Y;
    public final rrk0 Z;
    public final o5e a;
    public final q4e b;
    public final y5e c;
    public final List d;
    public final Bundle e;
    public final boolean f;
    public final xfx g;
    public final oto0 h;
    public final dto0 i;
    public final lcs t;

    public s5e(o5e o5eVar, q4e q4eVar, y5e y5eVar, List list, Bundle bundle, boolean z, xfx xfxVar, oto0 oto0Var, dto0 dto0Var, lcs lcsVar, i8h1 i8h1Var, tdl0 tdl0Var, rrk0 rrk0Var) {
        this.a = o5eVar;
        this.b = q4eVar;
        this.c = y5eVar;
        this.d = list;
        this.e = bundle;
        this.f = z;
        this.g = xfxVar;
        this.h = oto0Var;
        this.i = dto0Var;
        this.t = lcsVar;
        this.X = i8h1Var;
        this.Y = tdl0Var;
        this.Z = rrk0Var;
    }

    public final Connection L(Consumer consumer) {
        return new rp(this, (byte) 12);
    }

    public final void c(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        NestedScrollView nestedScrollViewInflate = layoutInflater.inflate(2131624324, viewGroup, false);
        int i = 2131428484;
        TextView textView = (TextView) m5n1.t(nestedScrollViewInflate, 2131428484);
        if (textView != null) {
            i = 2131429725;
            ConstraintLayout constraintLayoutT = m5n1.t(nestedScrollViewInflate, 2131429725);
            if (constraintLayoutT != null) {
                int i2 = 2131428727;
                IconExclamationCircle iconExclamationCircleT = m5n1.t(constraintLayoutT, 2131428727);
                if (iconExclamationCircleT != null) {
                    i2 = 2131431115;
                    TextView textView2 = (TextView) m5n1.t(constraintLayoutT, 2131431115);
                    if (textView2 != null) {
                        i2 = 2131431356;
                        if (((TextView) m5n1.t(constraintLayoutT, 2131431356)) != null) {
                            ConstraintLayout constraintLayout = constraintLayoutT;
                            haa0 haa0Var = new haa0(constraintLayout, iconExclamationCircleT, textView2, (byte) 11);
                            int i3 = 2131430330;
                            View viewT = m5n1.t(nestedScrollViewInflate, 2131430330);
                            if (viewT != null) {
                                i3 = 2131430614;
                                RecyclerView recyclerViewT = m5n1.t(nestedScrollViewInflate, 2131430614);
                                if (recyclerViewT != null) {
                                    cab cabVar = new cab(nestedScrollViewInflate, textView, haa0Var, viewT, recyclerViewT);
                                    recyclerViewT.setLayoutManager(new LinearLayoutManager(1));
                                    recyclerViewT.setAdapter(this.b);
                                    recyclerViewT.setClipToPadding(false);
                                    rwq0.s(recyclerViewT, kna.i);
                                    Bundle bundle = this.e;
                                    if (bundle != null) {
                                        mh90 mh90Var = (bi90) bundle.getParcelable("SELECTED_GROUP_ITEM");
                                        if (mh90Var instanceof mh90) {
                                            String str = mh90Var.d;
                                            textView.setText(str);
                                            textView.setVisibility(str.length() > 0 ? 0 : 8);
                                        }
                                    }
                                    boolean zJ = this.h.a.j();
                                    i8h1 i8h1Var = this.X;
                                    if (zJ && !this.i.a.g(context)) {
                                        h98 h98Var = new h98(this.g.b.a, this.t);
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
                                        h98Var.n(new m4d(this, (byte) 10));
                                        i8h1Var.f(this.Z.e(), (Set) null);
                                        viewT.setVisibility(0);
                                    }
                                    constraintLayout.setOnClickListener(new c20(this, (byte) 14));
                                    boolean z = this.f;
                                    if (z) {
                                        tdl0 tdl0Var = this.Y;
                                        x6h1 x6h1VarC = tdl0Var.b.c();
                                        x6h1VarC.i.add(new a7h1("language_preference_row", (String) null, (Integer) null, (String) null, (String) null));
                                        x6h1VarC.j = true;
                                        y6h1 y6h1VarA = x6h1VarC.a();
                                        k7h1 k7h1Var = new k7h1();
                                        ((xjn) k7h1Var).a = y6h1VarA;
                                        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                                        k7h1Var.e = tdl0Var.c;
                                        i8h1Var.f(k7h1Var.a(), (Set) null);
                                    }
                                    this.O0 = cabVar;
                                    p5e p5eVar = new p5e(this.d, tcb0.a, z);
                                    o5e o5eVar = this.a;
                                    lzn0 lzn0Var = o5eVar.a;
                                    tdl0 tdl0Var2 = o5eVar.c;
                                    i8h1 i8h1Var2 = o5eVar.d;
                                    Scheduler scheduler = o5eVar.e;
                                    ajq0 ajq0Var = o5eVar.h;
                                    Scheduler scheduler2 = o5eVar.f;
                                    oto0 oto0Var = o5eVar.i;
                                    fno0 fno0Var = o5eVar.j;
                                    RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
                                    subtypeEffectHandlerBuilderC.d(u4e.class, new r4e(tdl0Var2, i8h1Var2, lzn0Var, oto0Var.a.g()), scheduler);
                                    subtypeEffectHandlerBuilderC.g(w4e.class, new so(ajq0Var, scheduler2, (byte) 3));
                                    subtypeEffectHandlerBuilderC.g(t4e.class, new so(fno0Var, scheduler2, (byte) 2));
                                    subtypeEffectHandlerBuilderC.d(v4e.class, new qg7(i8h1Var2, tdl0Var2, lzn0Var, (byte) 3), scheduler);
                                    this.N0 = Mobius.b(gvg.d("NotificationCategories", Mobius.d(n5e.a, RxConnectables.a(subtypeEffectHandlerBuilderC.h())).h(RxEventSources.a(new ObservableSource[]{o5eVar.b.a, o5eVar.g.a.hide().map(e4y.P0)}))), p5eVar, m5e.a, MainThreadWorkRunner.a());
                                    return;
                                }
                            }
                            i = i3;
                        }
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutT.getResources().getResourceName(i2)));
                return;
            }
        }
        bhn0.i("Missing required view with ID: ".concat(nestedScrollViewInflate.getResources().getResourceName(i)));
    }

    public final View getView() {
        cab cabVar = this.O0;
        if (cabVar != null) {
            return (NestedScrollView) cabVar.b;
        }
        return null;
    }

    public final void start() {
        MobiusLoop.Controller controller = this.N0;
        if (controller == null) {
            u890.C("controller");
            throw null;
        }
        controller.c(this);
        MobiusLoop.Controller controller2 = this.N0;
        if (controller2 != null) {
            controller2.start();
        } else {
            u890.C("controller");
            throw null;
        }
    }

    public final void stop() {
        MobiusLoop.Controller controller = this.N0;
        if (controller == null) {
            u890.C("controller");
            throw null;
        }
        controller.stop();
        MobiusLoop.Controller controller2 = this.N0;
        if (controller2 != null) {
            controller2.disconnect();
        } else {
            u890.C("controller");
            throw null;
        }
    }
}
