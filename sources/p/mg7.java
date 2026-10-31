package p;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mg7 implements Connectable, ze {
    public final qzh N0;
    public vu30 O0;
    public final hrr0 P0;
    public final hrr0 Q0;
    public Function0 R0;
    public Parcelable S0;
    public final int T0;
    public fg7 X;
    public final ComposeView Y;
    public final qzh Z;
    public final Context a;
    public final nd51 b;
    public final em3 c;
    public final lcb0 d;
    public final String e;
    public final l1p f;
    public final ViewGroup g;
    public final View h;
    public final RecyclerView i;
    public final ComposeView t;

    public mg7(Context context, nd51 nd51Var, em3 em3Var, lcb0 lcb0Var, String str, t8x t8xVar, t8x t8xVar2, k1p k1pVar, l1p l1pVar, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = gg7.b;
        this.a = context;
        this.b = nd51Var;
        this.c = em3Var;
        this.d = lcb0Var;
        this.e = str;
        this.f = l1pVar;
        this.O0 = c37.g;
        this.P0 = v8r.q(new s820(z6x.a, null));
        this.Q0 = v8r.q(ogr0.a);
        z87 z87Var = new z87(context, f46.S0(new Integer[]{4, 6}));
        this.R0 = vc7.c;
        this.S0 = bundle != null ? bundle.getParcelable("RECYCLER_VIEW_SAVED_STATE") : null;
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(2131625351, viewGroup, false);
        this.g = viewGroup2;
        ComposeView composeViewFindViewById = viewGroup2.findViewById(2131431399);
        ComposeView composeViewFindViewById2 = viewGroup2.findViewById(2131428872);
        this.t = composeViewFindViewById2;
        composeViewFindViewById.setVisibility(0);
        composeViewFindViewById.setContent(new j2i(121379291, new jg7(this, (byte) 2), true));
        ComposeView composeViewFindViewById3 = viewGroup2.findViewById(2131430826);
        this.Y = composeViewFindViewById3;
        composeViewFindViewById3.setVisibility(0);
        jg7 jg7Var = new jg7(this, (byte) 3);
        voa voaVar = (voa) k1pVar.a.c;
        Context contextA = ((oe7) voaVar.b).a();
        c8o.l(contextA);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        composeViewFindViewById2.setContent(new j2i(-913539593, new kg7(this, new tm(contextA, new bqk0(yon1.G1("ASSISTED_CURATION_SEARCH", "assisted-curation/search", 183, "assisted-curation").path(), voaVar.l().a, (byte) 8), jg7Var), (byte) 2), true));
        RecyclerView recyclerViewFindViewById = viewGroup2.findViewById(2131430614);
        this.i = recyclerViewFindViewById;
        recyclerViewFindViewById.setTag("assisted-curation-search");
        layoutInflater.getContext();
        recyclerViewFindViewById.setLayoutManager(new LinearLayoutManager(1));
        recyclerViewFindViewById.setAdapter(lcb0Var);
        this.T0 = recyclerViewFindViewById.getPaddingBottom();
        composeViewFindViewById3.addOnLayoutChangeListener(new eg7(this, (byte) 0));
        recyclerViewFindViewById.j(z87Var);
        this.h = viewGroup2.findViewById(2131429815);
        qzh qzhVarA = t8xVar.a(null);
        this.Z = qzhVarA;
        ConstraintLayout constraintLayout = (ConstraintLayout) ((h98) qzhVarA).d;
        viewGroup2.addView(constraintLayout);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            constraintLayout.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener);
        }
        qzh qzhVarA2 = t8xVar2.a(null);
        this.N0 = qzhVarA2;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) ((h98) qzhVarA2).d;
        viewGroup2.addView(constraintLayout2);
        if (i >= 30) {
            constraintLayout2.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener);
        }
    }

    public final Connection L(Consumer consumer) {
        this.R0 = new kf(consumer, (byte) 1);
        hg7 hg7Var = new hg7(consumer, (byte) 1);
        voa voaVar = (voa) this.f.a.c;
        voaVar.getClass();
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.Y.setContent(new j2i(-1371153660, new lg7(this, new smp0(new bqk0(yon1.G1("ASSISTED_CURATION_SEARCH", "assisted-curation/search", 183, "assisted-curation").path(), voaVar.l().a, (byte) 8), hg7Var), (byte) 1), true));
        pp5 pp5Var = new pp5(this, consumer, (byte) 17);
        lcb0 lcb0Var = this.d;
        lcb0Var.g = pp5Var;
        this.O0 = new hg7(consumer, (byte) 0);
        ig7 ig7Var = new ig7(consumer, (byte) 0);
        RecyclerView recyclerView = this.i;
        recyclerView.m(ig7Var);
        recyclerView.m(new hqc0(this.b, lcb0Var, (byte) 1));
        return new rp(this, (byte) 9);
    }

    public final void a(String str) {
        b8k1.t(this.h, str);
    }
}
