package p;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.encoremobile.viewstub.EncoreViewStub;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@adt
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp/v4n;", "Lp/haa;", "<init>", "()V", "src_main_java_com_spotify_bottomsheet_core-core"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public abstract class v4n extends haa {
    public static final /* synthetic */ mma0[] a2 = {new een0(v4n.class, "systemBarInsets", "getSystemBarInsets()Landroidx/core/graphics/Insets;", 0), new een0(v4n.class, "fillWindowHeight", "getFillWindowHeight()Z", 0)};
    public final u4n Y1 = new u4n(this, (byte) 0);
    public final u4n Z1 = new u4n(this, (byte) 1);

    @Override // p.haa
    public final void m1(nk80 nk80Var) {
        this.Y1.c(a2[0], this, nk80Var);
    }

    public abstract View n1(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public final void o1() {
        View view;
        mma0[] mma0VarArr = a2;
        mma0 mma0Var = mma0VarArr[0];
        nk80 nk80Var = (nk80) ((sgp0) this.Y1).a;
        if (nk80Var == null || (view = this.j1) == null) {
            return;
        }
        mma0 mma0Var2 = mma0VarArr[1];
        view.setMinimumHeight(((Boolean) ((sgp0) this.Z1).a).booleanValue() ? ((Number) this.V1.getValue()).intValue() - nk80Var.b : 0);
        if (view.isInLayout()) {
            view.post(new ai(view, (byte) 1));
        }
    }

    @Override // p.zf30
    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewN1 = n1(layoutInflater, viewGroup);
        oql oqlVarG = oql.g(layoutInflater, viewGroup);
        EncoreViewStub encoreViewStub = (EncoreViewStub) oqlVarG.c;
        View view = viewN1;
        if (getW1()) {
            NestedScrollView nestedScrollView = new NestedScrollView(P0());
            nestedScrollView.addView(viewN1);
            view = nestedScrollView;
        }
        k8p1.o(encoreViewStub, view);
        return oqlVarG.f();
    }
}
