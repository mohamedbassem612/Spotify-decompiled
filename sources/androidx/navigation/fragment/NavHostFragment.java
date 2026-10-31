package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import kotlin.Metadata;
import p.cmz0;
import p.emz0;
import p.gon0;
import p.idd1;
import p.jah;
import p.kqn1;
import p.nu9;
import p.zem0;
import p.zf30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/navigation/fragment/NavHostFragment;", "Lp/zf30;", "", "<init>", "()V", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class NavHostFragment extends zf30 {
    public final idd1 F1 = new idd1(new zem0(this, (byte) 29));
    public View G1;
    public int H1;
    public boolean I1;

    public final void C0(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.C0(context, attributeSet, bundle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cmz0.b);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.H1 = resourceId;
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, emz0.c);
        if (typedArrayObtainStyledAttributes2.getBoolean(0, false)) {
            this.I1 = true;
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void F0(Bundle bundle) {
        if (this.I1) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }

    public final void I0(View view, Bundle bundle) {
        if (!(view instanceof ViewGroup)) {
            jah.h("created host view ", view, " is not a ViewGroup");
            return;
        }
        view.setTag(2131430113, Y0());
        if (view.getParent() != null) {
            View view2 = (View) view.getParent();
            this.G1 = view2;
            if (view2.getId() == ((zf30) this).Y0) {
                View view3 = this.G1;
                view3.getClass();
                view3.setTag(2131430113, Y0());
            }
        }
    }

    public final gon0 Y0() {
        return (gon0) this.F1.getValue();
    }

    public final void v0(Context context) {
        super.v0(context);
        if (this.I1) {
            nu9 nu9Var = new nu9(j0());
            nu9Var.q(this);
            nu9Var.f();
        }
    }

    public final void w0(Bundle bundle) {
        Y0();
        if (bundle != null && bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
            this.I1 = true;
            nu9 nu9Var = new nu9(j0());
            nu9Var.q(this);
            nu9Var.f();
        }
        super.w0(bundle);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FragmentContainerView fragmentContainerView = new FragmentContainerView(layoutInflater.getContext());
        int i = ((zf30) this).Y0;
        if (i == 0 || i == -1) {
            i = 2131430114;
        }
        fragmentContainerView.setId(i);
        return fragmentContainerView;
    }

    public final void z0() {
        ((zf30) this).h1 = true;
        View view = this.G1;
        if (view != null && kqn1.q(view) == Y0()) {
            view.setTag(2131430113, null);
        }
        this.G1 = null;
    }
}
