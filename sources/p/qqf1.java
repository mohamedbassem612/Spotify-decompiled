package p;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.aiplaylist.promptcreation.presentation.tracklist.IconAddBadgeView;
import com.spotify.aiplaylist.promptcreation.presentation.tracklist.IconRemoveBadgeView;
import com.spotify.aiplaylist.promptcreation.presentation.tracklist.PlayIndicatorView;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.previewbutton.PreviewOverlayView;
import com.spotify.encoremobile.component.icons.IconEnhanceBadge;
import com.spotify.encoremobile.component.listrow.EncoreListRow;
import java.util.Collections;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qqf1 extends emc0 {
    public final yqg e;
    public final gw70 f;
    public final e511 g;
    public iu30 h;
    public final LinkedHashSet i;
    public boolean t;

    public qqf1(yqg yqgVar, gw70 gw70Var, e511 e511Var) {
        super(kn5.m);
        this.e = yqgVar;
        this.f = gw70Var;
        this.g = e511Var;
        this.h = bpf1.Q0;
        this.i = new LinkedHashSet();
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [android.view.View, com.spotify.encoremobile.component.icons.IconEnhanceBadge] */
    public final void n(int i, w611 w611Var) {
        yiw0 ajw0Var;
        boolean z;
        float f;
        pqf1 pqf1Var = (pqf1) w611Var;
        aqf1 aqf1Var = (aqf1) A(i);
        aqf1Var.getClass();
        EncoreListRow encoreListRow = pqf1Var.V0;
        lvc1 lvc1Var = pqf1Var.U0;
        LinearLayout linearLayout = pqf1Var.Y0;
        PlayIndicatorView playIndicatorView = pqf1Var.Z0;
        qqf1 qqf1Var = pqf1Var.b1;
        LinkedHashSet linkedHashSet = qqf1Var.i;
        String str = aqf1Var.a;
        String str2 = aqf1Var.i;
        zpf1 zpf1Var = aqf1Var.f;
        int i2 = zpf1Var.a;
        TextView textView = pqf1Var.W0;
        String str3 = aqf1Var.b;
        textView.setText(str3);
        LinearLayout linearLayout2 = pqf1Var.X0;
        TextView textView2 = (TextView) linearLayout2.findViewById(2131431127);
        String str4 = aqf1Var.d;
        textView2.setText(str4);
        ?? r6 = (IconEnhanceBadge) linearLayout2.findViewById(2131431126);
        boolean z2 = aqf1Var.c;
        r6.setVisibility((z2 || !aqf1Var.j) ? 8 : 0);
        r6.setX(0.0f);
        g07 g07Var = new g07(aqf1Var.e, new zz6(4.0f));
        r0s0 r0s0Var = playIndicatorView.a;
        ((ArtworkView) r0s0Var.b).h(new g17(g07Var));
        linearLayout.setVisibility(0);
        IconRemoveBadgeView iconRemoveBadgeViewFindViewById = linearLayout.findViewById(2131431504);
        iconRemoveBadgeViewFindViewById.setIconVisible(!z2);
        iconRemoveBadgeViewFindViewById.setVisibility(!z2 ? 0 : 8);
        iconRemoveBadgeViewFindViewById.setOnClickListener(new nqf1(qqf1Var, aqf1Var, i, (byte) 0));
        IconAddBadgeView iconAddBadgeView = (IconAddBadgeView) linearLayout.findViewById(2131431503);
        iconAddBadgeView.setIconActive(z2);
        iconAddBadgeView.setOnClickListener(new oqf1(qqf1Var, aqf1Var, i, iconAddBadgeView, iconRemoveBadgeViewFindViewById, r6));
        long j = zpf1Var.b;
        if (i2 != 1 || j == 0) {
            ajw0Var = new ajw0(new cjw0(str3, Collections.singletonList(str4)));
        } else {
            yqg yqgVar = playIndicatorView.b;
            if (yqgVar == null) {
                u890.C("clock");
                throw null;
            }
            ajw0Var = new yiw0(j, ((yqgVar.c() - zpf1Var.d) + zpf1Var.c) / j);
        }
        ((PreviewOverlayView) r0s0Var.d).y(ajw0Var);
        encoreListRow.setOnClickListener(new nqf1(qqf1Var, aqf1Var, i, (byte) 1));
        playIndicatorView.setOnClickListener((iu30) new ju01(qqf1Var, aqf1Var, i, (byte) 15));
        encoreListRow.setAdditionalAccessibilityActions(Collections.singletonList(new xe(((ConstraintLayout) lvc1Var.b).getContext().getString(2131951666, str3, str4), new dna1(i, qqf1Var, aqf1Var))));
        ArtworkView artworkView = (ArtworkView) r0s0Var.b;
        int iC = l1d.C(i2);
        if (iC != 0) {
            z = true;
            if (iC != 1) {
                eg.o();
                return;
            }
            f = 0.54f;
        } else {
            z = true;
            f = 0.3f;
        }
        artworkView.setAlpha(f);
        if (str2 == null || ihc1.y0(str2) || z2) {
            z = false;
        }
        ((ComposeView) lvc1Var.d).setVisibility(z ? 0 : 8);
        pqf1Var.a1.setValue((!z || str2 == null) ? "" : str2);
        if (!linkedHashSet.contains(str) && z2) {
            ConstraintLayout constraintLayout = (ConstraintLayout) lvc1Var.b;
            int color = constraintLayout.getContext().getColor(2131101161);
            int color2 = constraintLayout.getContext().getColor(2131101162);
            ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(constraintLayout, "backgroundColor", new ArgbEvaluator(), Integer.valueOf(color), Integer.valueOf(color2));
            objectAnimatorOfObject.setDuration(150L);
            objectAnimatorOfObject.setStartDelay(500L);
            objectAnimatorOfObject.start();
            objectAnimatorOfObject.addListener(new d20(new e90(pqf1Var, color2, color, (byte) 4), (byte) 16));
        }
        linkedHashSet.add(str);
    }

    public final w611 p(int i, ViewGroup viewGroup) {
        ConstraintLayout constraintLayoutL = eqq.l(viewGroup, 2131626278, viewGroup, false);
        int i2 = 2131428629;
        EncoreListRow encoreListRowT = m5n1.t(constraintLayoutL, 2131428629);
        if (encoreListRowT != null) {
            i2 = 2131429948;
            if (((PlayIndicatorView) m5n1.t(constraintLayoutL, 2131429948)) != null) {
                i2 = 2131430159;
                ComposeView composeViewT = m5n1.t(constraintLayoutL, 2131430159);
                if (composeViewT != null) {
                    i2 = 2131431125;
                    if (((LinearLayout) m5n1.t(constraintLayoutL, 2131431125)) != null) {
                        i2 = 2131431126;
                        if (((IconEnhanceBadge) m5n1.t(constraintLayoutL, 2131431126)) != null) {
                            i2 = 2131431127;
                            if (m5n1.t(constraintLayoutL, 2131431127) != null) {
                                i2 = 2131431371;
                                if (m5n1.t(constraintLayoutL, 2131431371) != null) {
                                    i2 = 2131431502;
                                    if (((LinearLayout) m5n1.t(constraintLayoutL, 2131431502)) != null) {
                                        i2 = 2131431503;
                                        if (((IconAddBadgeView) m5n1.t(constraintLayoutL, 2131431503)) != null) {
                                            i2 = 2131431504;
                                            if (m5n1.t(constraintLayoutL, 2131431504) != null) {
                                                return new pqf1(this, new lvc1(constraintLayoutL, encoreListRowT, composeViewT, (byte) 18), this.e);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutL.getResources().getResourceName(i2)));
        return null;
    }
}
