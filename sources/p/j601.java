package p;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.functions.Consumer;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class j601 implements Connectable {
    public final gw70 a;
    public final bnq b;
    public final sxz0 c;
    public final MobiusLoop.Controller d;
    public final r001 e;
    public final frd1 f;
    public final boolean g;
    public final fbz0 h;
    public final ComposeView i;
    public final ComposeView t;

    public j601(gw70 gw70Var, bnq bnqVar, sxz0 sxz0Var, Context context, MobiusLoop.Controller controller, r001 r001Var, frd1 frd1Var, boolean z, fbz0 fbz0Var) {
        this.a = gw70Var;
        this.b = bnqVar;
        this.c = sxz0Var;
        this.d = controller;
        this.e = r001Var;
        this.f = frd1Var;
        this.g = z;
        this.h = fbz0Var;
        h601 h601Var = new h601(this);
        dg30 dg30VarF0 = r001Var.f0();
        if (dg30VarF0 != null) {
            dg30VarF0.runOnUiThread(new jyh0(r001Var, h601Var, (byte) 12));
        }
        ComposeView composeView = new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        this.i = composeView;
        this.t = composeView;
    }

    public final Connection L(Consumer consumer) {
        return new ivn(this, consumer);
    }

    public final void a(e601 e601Var, o501 o501Var, boolean z) {
        BottomSheetBehavior bottomSheetBehavior;
        cce0 cce0Var = o501Var.c;
        boolean z2 = (cce0Var instanceof gbe0) && ((rxz0) ((gbe0) cce0Var).a).a.isEmpty();
        r001 r001Var = this.e;
        Context contextH0 = r001Var.h0();
        if (contextH0 != null && (bottomSheetBehavior = r001Var.e2) != null) {
            bottomSheetBehavior.J(z2 ? -1 : (int) TypedValue.applyDimension(1, 390.0f, contextH0.getResources().getDisplayMetrics()));
        }
        this.i.setContent(new j2i(280352153, new i601(this, z2, o501Var, z, e601Var, (byte) 2), true));
    }

    public final View getRoot() {
        return this.t;
    }
}
