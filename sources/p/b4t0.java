package p;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class b4t0 extends z511 {
    public final ArrayList X;
    public final phi0 Y;
    public z3t0 Z;
    public Bundle d;
    public final ViewGroup e;
    public final ArrayList f;
    public final o7r0 g;
    public final dg30 h;
    public final fal1 i;
    public final cir0 t;

    public b4t0(Bundle bundle, ViewGroup viewGroup, ArrayList arrayList, o7r0 o7r0Var, dg30 dg30Var, fal1 fal1Var, cir0 cir0Var) {
        SparseArray sparseParcelableArray;
        Bundle bundle2;
        Bundle bundle3;
        this.d = bundle;
        this.e = viewGroup;
        this.f = arrayList;
        this.g = o7r0Var;
        this.h = dg30Var;
        this.i = fal1Var;
        this.t = cir0Var;
        x5r0 x5r0Var = new x5r0((byte) 1);
        tbr0 tbr0Var = new tbr0(x5r0Var, new n431(), "");
        fns fnsVar = igu.a;
        this.Y = new phi0(new kks0(this, (byte) 5), dg30Var, new x5q(x5r0Var, (byte) 2), new y5q(), tbr0Var, new myq0(pyf0.a.f, tbr0Var, (byte) 3));
        Bundle bundle4 = this.d;
        if (bundle4 != null && !fal1Var.b) {
            fal1Var.b = true;
            fal1Var.a.m((Object) null, Boolean.valueOf(bundle4.getBoolean("watch_feed_playback_mute_state_key")));
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            fbr0 fbr0Var = (fbr0) it.next();
            abu abuVar = fbr0Var.c;
            String string = abuVar.toString();
            String str = abuVar + "_ui";
            String str2 = abuVar + "_view_hierarchy";
            Bundle bundle5 = this.d;
            if (bundle5 != null) {
                Bundle bundle6 = bundle5.getBundle(string);
                bundle2 = bundle5.getBundle(str);
                sparseParcelableArray = bundle5.getSparseParcelableArray(str2);
                bundle3 = bundle6;
            } else {
                sparseParcelableArray = null;
                bundle2 = null;
                bundle3 = null;
            }
            arrayList2.add(new z3t0(string, str, str2, new dcr0(new ecr0(new n1r0(this, (byte) 24), v0r0.d1, s5o0.a, new hwb((byte) 17)), fbr0Var.a, fbr0Var.c, v0r0.e1, bundle3, this.t.g().d.c.getLifecycle(), (rck1) null, 192), BehaviorSubject.g(Boolean.FALSE), new a4t0(bundle3, bundle2, sparseParcelableArray)));
        }
        this.X = arrayList2;
    }

    public static void A(z3t0 z3t0Var) {
        air0 air0Var = z3t0Var.e;
        if (air0Var != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            View viewC = air0Var.c();
            if (viewC != null) {
                viewC.saveHierarchyState(sparseArray);
            }
            z3t0Var.g = new a4t0(z3t0Var.d.e(), air0Var.d(), sparseArray);
        }
    }

    public final int e() {
        return this.f.size();
    }

    public final void n(int i, w611 w611Var) {
        iir0 iir0Var = (iir0) w611Var;
        air0 air0Var = ((z3t0) this.X.get(i)).e;
        View viewC = air0Var != null ? air0Var.c() : null;
        gmt gmtVar = iir0Var.U0;
        ((ShimmerFrameLayout) gmtVar.c).c(false);
        View view = ((w611) iir0Var).a;
        boolean z = view instanceof FrameLayout;
        FrameLayout frameLayout = z ? (FrameLayout) view : null;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        FrameLayout frameLayout2 = z ? (FrameLayout) view : null;
        if (frameLayout2 != null) {
            if (viewC == null) {
                viewC = (ConstraintLayout) gmtVar.b;
            }
            frameLayout2.addView(viewC);
        }
    }

    public final w611 p(int i, ViewGroup viewGroup) {
        int i2 = iir0.V0;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return new iir0(frameLayout);
    }
}
