package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ViewAnimator;
import androidx.compose.ui.platform.ComposeView;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbars;
import com.spotify.legacyglue.gluelib.components.toolbar.ToolbarSide;
import com.spotify.legacyglue.widgetstate.StateListAnimatorImageButton;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kr81 implements Connectable {
    public final m5 N0;
    public final kd40 O0;
    public final kkn0 P0;
    public final y3u Q0;
    public final StateListAnimatorImageButton R0;
    public final ViewAnimator S0;
    public final TextView T0;
    public pq81 U0;
    public final PublishSubject V0;
    public final ArrayList W0;
    public final View X;
    public boolean X0;
    public final azw Y;
    public final y6s0 Z;
    public final ohv0 a;
    public final d781 b;
    public final fd c;
    public final pp d;
    public final f69 e;
    public final boolean f;
    public final int g;
    public final t8h1 h;
    public final fe81 i;
    public final wnh1 t;

    public kr81(hd40 hd40Var, LayoutInflater layoutInflater, eyd1 eyd1Var, y3u y3uVar, ohv0 ohv0Var, pxw pxwVar, d781 d781Var, fd fdVar, pp ppVar, f69 f69Var, boolean z, boolean z2, int i, t8h1 t8h1Var, fe81 fe81Var, wnh1 wnh1Var) {
        this.a = ohv0Var;
        this.b = d781Var;
        this.c = fdVar;
        this.d = ppVar;
        this.e = f69Var;
        this.f = z2;
        this.g = i;
        this.h = t8h1Var;
        this.i = fe81Var;
        this.t = wnh1Var;
        byte b = 1;
        View viewInflate = layoutInflater.inflate(2131626200, (ViewGroup) null, true);
        this.X = viewInflate;
        this.S0 = (ViewAnimator) viewInflate.findViewById(2131431610);
        this.T0 = (TextView) viewInflate.findViewById(2131431356);
        this.V0 = new PublishSubject();
        this.W0 = new ArrayList();
        this.X0 = true;
        this.Y = pxwVar.a ? (azw) d(2131626196, new ir81(this, (byte) 0)) : null;
        this.Z = pxwVar.b ? (y6s0) d(2131626199, new ir81(this, b)) : null;
        this.N0 = z ? (m5) d(2131626195, new ir81(this, (byte) 2)) : (m5) d(2131626194, new ir81(this, (byte) 3));
        this.O0 = (kd40) d(2131626197, new d(hd40Var, this, (byte) 22));
        this.P0 = (kkn0) d(2131626198, new ir81(this, (byte) 4));
        this.Q0 = y3uVar;
        ComposeView composeViewFindViewById = viewInflate.findViewById(2131428474);
        composeViewFindViewById.setViewCompositionStrategy(p5x0.W0);
        composeViewFindViewById.setContent(new j2i(1191219458, new dj71(y3uVar, (byte) 18), true));
        GlueToolbar glueToolbarCreateGlueToolbar = GlueToolbars.createGlueToolbar(viewInflate.findViewById(2131431397));
        Context context = viewInflate.getContext();
        StateListAnimatorImageButton stateListAnimatorImageButton = new StateListAnimatorImageButton(context);
        this.R0 = stateListAnimatorImageButton;
        WeakHashMap weakHashMap = b8k1.a;
        stateListAnimatorImageButton.setBackground(null);
        g4b1 g4b1Var = new g4b1(context, j4b1.b1, viewInflate.getResources().getDimensionPixelSize(2131167143));
        g4b1Var.b(context.getColor(2131104462));
        stateListAnimatorImageButton.setImageDrawable(g4b1Var);
        stateListAnimatorImageButton.setContentDescription(viewInflate.getContext().getString(2131962517));
        glueToolbarCreateGlueToolbar.addView(ToolbarSide.START, stateListAnimatorImageButton, 2131431410);
        viewInflate.post(new ni(this, context, false, (byte) 1));
        viewInflate.setVisibility(4);
    }

    public final Connection L(Consumer consumer) {
        azw azwVar = this.Y;
        Connection connectionL = azwVar != null ? azwVar.L(new xu2(consumer, (byte) 24)) : null;
        y6s0 y6s0Var = this.Z;
        Connection connectionL2 = y6s0Var != null ? y6s0Var.L(new xu2(consumer, (byte) 27)) : null;
        Connection connectionL3 = this.N0.L(new xu2(consumer, (byte) 23));
        rp rpVarL = this.O0.L(new xu2(consumer, (byte) 25));
        jkn0 jkn0VarL = this.P0.L(new xu2(consumer, (byte) 26));
        Disposable disposableSubscribe = this.Q0.f.subscribe(new k1p0(consumer, (byte) 11));
        Disposable disposableSubscribe2 = this.V0.subscribe(new k1p0(consumer, (byte) 10));
        this.R0.setOnClickListener(new f1b(consumer, (byte) 14));
        return new jr81((ibn) connectionL, (ibn) connectionL2, connectionL3, rpVarL, jkn0VarL, this, disposableSubscribe2, disposableSubscribe);
    }

    public final View c() {
        return this.X;
    }

    public final c7k1 d(int i, iu30 iu30Var) {
        ViewAnimator viewAnimator = this.S0;
        View viewInflate = LayoutInflater.from(viewAnimator.getContext()).inflate(i, (ViewGroup) viewAnimator, true);
        viewInflate.getClass();
        c7k1 c7k1Var = (c7k1) iu30Var.invoke(viewInflate);
        this.W0.add(c7k1Var);
        return c7k1Var;
    }
}
