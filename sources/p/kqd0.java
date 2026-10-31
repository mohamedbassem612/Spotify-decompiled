package p;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.spotify.encoreconsumermobile.elements.badge.live.LiveEventBadgeView;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import com.spotify.nowplaying.scroll.ScrollCardType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kqd0 implements Connectable {
    public final dtw N0;
    public final rah O0;
    public ixg P0;
    public final ProgressBar Q0;
    public final r4u R0;
    public final LiveEventBadgeView X;
    public final ImageView Y;
    public final dtw Z;
    public final xzf a;
    public final Resources b;
    public final gw70 c;
    public final cr6 d;
    public final h0p0 e;
    public final cqd0 f;
    public final Context g;
    public final View h;
    public final TextView i;
    public final TextView t;

    public kqd0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, xzf xzfVar, Resources resources, gw70 gw70Var, dfm dfmVar, snr snrVar, for forVar, cr6 cr6Var, i8h1 i8h1Var, l6h1 l6h1Var, h0p0 h0p0Var, cqd0 cqd0Var) {
        this.a = xzfVar;
        this.b = resources;
        this.c = gw70Var;
        this.d = cr6Var;
        this.e = h0p0Var;
        this.f = cqd0Var;
        View viewFindViewById = layoutInflater.inflate(2131625157, viewGroup, false).findViewById(2131430186);
        this.h = viewFindViewById;
        Context context = viewFindViewById.getContext();
        this.g = context;
        this.i = (TextView) viewFindViewById.findViewById(2131431483);
        this.t = (TextView) viewFindViewById.findViewById(2131431482);
        this.X = (LiveEventBadgeView) viewFindViewById.findViewById(2131429808);
        ImageView imageView = (ImageView) viewFindViewById.findViewById(2131428272);
        this.Y = imageView;
        View viewFindViewById2 = viewFindViewById.findViewById(2131428181);
        qtw qtwVarA = f6o1.A(snrVar, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById2.getParent();
        w1l w1lVar = new w1l();
        tka0 tka0Var = dtw.C;
        this.Z = mhc.b(viewGroup2.getContext(), viewGroup2, qtwVarA, w1lVar, (ipb1) null, 112);
        FrameLayout frameLayout = new FrameLayout(viewFindViewById2.getContext());
        dtw dtwVar = this.Z;
        if (dtwVar == null) {
            u890.C("connectButtonVH");
            throw null;
        }
        frameLayout.addView(dtwVar.w, new FrameLayout.LayoutParams(-1, -1));
        k8p1.o(viewFindViewById2, frameLayout);
        View viewFindViewById3 = viewFindViewById.findViewById(2131428190);
        qtw qtwVarA2 = f6o1.A(forVar, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
        ViewGroup viewGroup3 = (ViewGroup) viewFindViewById3.getParent();
        dtw dtwVarB = mhc.b(viewGroup3.getContext(), viewGroup3, qtwVarA2, new u3l(false), (ipb1) null, 112);
        this.N0 = dtwVarB;
        k8p1.o(viewFindViewById3, dtwVarB.w);
        View viewFindViewById4 = viewFindViewById.findViewById(2131430407);
        viewFindViewById4.getClass();
        ViewGroup viewGroup4 = (ViewGroup) viewFindViewById4.getParent();
        View view = mhc.b(viewGroup4.getContext(), viewGroup4, dfmVar, new jpt0(hpt0.a, 2), (ipb1) null, 112).w;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131167033);
        view.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        k8p1.o(viewFindViewById4, view);
        this.O0 = new rah(-14145496, new hl00(this, (byte) 29));
        ProgressBar progressBar = (ProgressBar) viewFindViewById.findViewById(2131430530);
        this.Q0 = progressBar;
        progressBar.setMax(10);
        this.R0 = r4u.c(new r4u[]{r4u.d(o610.X, r4u.a(new jl00(this, (byte) 28))), r4u.d(c710.t, r4u.a(new ruc0(this, (byte) 3))), r4u.d(d710.X, r4u.a(new hod0(this, (byte) 1))), r4u.d(e710.X, r4u.a(new ouz(this, (byte) 28))), r4u.d(o810.X, r4u.a(new il00(this, (byte) 26)))});
        if (z) {
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(0, 0, 0, 0);
                }
                viewFindViewById.setLayoutParams(layoutParams);
            }
            qhl layoutParams2 = imageView.getLayoutParams();
            if (layoutParams2 != null && (layoutParams2 instanceof qhl)) {
                ((ViewGroup.LayoutParams) layoutParams2).width = 0;
                ((ViewGroup.LayoutParams) layoutParams2).height = 0;
                layoutParams2.G = "1:1";
                imageView.setLayoutParams(layoutParams2);
            }
            progressBar.setPadding(context.getResources().getDimensionPixelSize(2131166767), progressBar.getPaddingTop(), context.getResources().getDimensionPixelSize(2131166767), progressBar.getPaddingBottom());
        }
        jp80 jp80Var = new jp80(viewFindViewById);
        eq80 eq80Var = new eq80(new e3h1(l6h1Var, (n7h1) null, i8h1Var));
        xhk1.c(viewFindViewById, j6p1.k(j6p1.k(jp80Var, eq80Var), new h3h1(new l6d0(this, (byte) 15))));
    }

    public final Connection L(Consumer consumer) {
        pee0 pee0Var = new pee0(consumer, this.d, (byte) 2);
        this.h.setOnClickListener(new iqd0(pee0Var, (byte) 0));
        this.Y.setOnClickListener(new iqd0(pee0Var, (byte) 1));
        return new n1b0(this, (byte) 5);
    }
}
