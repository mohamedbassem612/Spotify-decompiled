package p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.encoreconsumermobile.elements.badge.locked.LockedBadgeView;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b2g1 extends fy31 {
    public final boolean U0;
    public final qzh V0;

    public b2g1(qzh qzhVar, boolean z) {
        super(qzhVar.getView());
        this.U0 = z;
        this.V0 = qzhVar;
    }

    public final void E(bw31 bw31Var, List list, ym ymVar) {
        wjy vjyVar;
        qk1 qk1Var;
        tez0 qez0Var;
        int i;
        int i2;
        aky akyVar;
        wjy wjyVar;
        wv31 wv31Var = (wv31) bw31Var;
        boolean z = wv31Var.c;
        boolean z2 = wv31Var.g;
        yh90 yh90Var = wv31Var.a;
        nv31 nv31Var = wv31Var.h;
        if (this.U0) {
            if (nv31Var instanceof jv31) {
                wjyVar = wjy.a;
            } else if (nv31Var instanceof lv31) {
                wjyVar = xjy.a;
            } else if (nv31Var instanceof kv31) {
                wjyVar = wjy.b;
            } else if (!(nv31Var instanceof mv31)) {
                eg.o();
                return;
            } else {
                mv31 mv31Var = (mv31) nv31Var;
                vjyVar = new vjy(mv31Var.a, mv31Var.b);
            }
            vjyVar = wjyVar;
        } else {
            vjyVar = null;
        }
        View view = ((w611) this).a;
        Context context = view.getContext();
        boolean zContains = list.contains("addStateChanged");
        int i3 = 1;
        if (z2) {
            qez0Var = tez0.a;
        } else {
            String str = yh90Var.b;
            int iC = l1d.C(wv31Var.i);
            if (iC == 0) {
                qk1Var = qk1.b;
            } else {
                if (iC != 1) {
                    eg.o();
                    return;
                }
                qk1Var = qk1.a;
            }
            qez0Var = new qez0(new pk1(qk1Var, zContains, str, context.getString(2131952505), tk1.c));
        }
        lky lkyVar = new lky(yh90Var.b, 14, false);
        kky kkyVar = new kky(aqo1.r(view.getContext(), yh90Var));
        if (z2 || z) {
            i = 0;
            i2 = 2;
            akyVar = new aky((String) null, new ujy(2), new njy(2131232783), (sjy) null, 25);
        } else {
            i = 0;
            i2 = 2;
            akyVar = new aky(new pjy(yh90Var.c), new ujy(2), new njy(2131232783), vjyVar, (rjy) null, 16);
        }
        ajy bjyVar = ((!wv31Var.b || z2) && !z) ? new bjy(new yiy()) : ajy.a;
        xj61 xj61Var = new xj61();
        if (wv31Var.f) {
            LockedBadgeView lockedBadgeView = new LockedBadgeView(new plm(view.getContext(), 2132017703), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            lockedBadgeView.setAdjustViewBounds(true);
            lockedBadgeView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int dimensionPixelSize = lockedBadgeView.getContext().getResources().getDimensionPixelSize(2131165733);
            lockedBadgeView.setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize, dimensionPixelSize));
            xj61Var.add(new qiy(lockedBadgeView, 1, "LockedBadge"));
        }
        if (!yh90Var.h) {
            i3 = yh90Var.g ? i2 : i;
        }
        if (i3 != 0) {
            xj61Var.add(new uiy(i3));
        }
        xj61 xj61VarJ = cwl1.j(xj61Var);
        axf1 axf1Var = new axf1(yh90Var.a, wv31Var.e, new cky(lkyVar, akyVar, (fky) null, kkyVar, (bs51) null, (wiy) null, (bky) null, xj61VarJ.a.isEmpty() ? null : new piy(xj61VarJ), bjyVar, 7668), qez0Var);
        qzh qzhVar = this.V0;
        qzhVar.f(axf1Var);
        qzhVar.n(new e971(bw31Var, ymVar, yh90Var, this, (byte) 23));
    }
}
