package p;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.spotify.encoreconsumermobile.elements.backbutton.BackButtonView;
import com.spotify.encoreconsumermobile.elements.bellbutton.BellButtonView;
import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import java.util.WeakHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xe00 implements qzh {
    public final Context a;
    public pod0 b;
    public final idd1 c = new idd1(oxx.X0);
    public final byp d;
    public final fad0 e;
    public final String f;
    public final String g;

    public xe00(Context context, gw70 gw70Var) {
        this.a = context;
        BehaviorRetainingAppBarLayout behaviorRetainingAppBarLayoutInflate = LayoutInflater.from(context).inflate(2131625151, (ViewGroup) null, false);
        BehaviorRetainingAppBarLayout behaviorRetainingAppBarLayout = behaviorRetainingAppBarLayoutInflate;
        int i = 2131427670;
        BackButtonView backButtonView = (BackButtonView) m5n1.t(behaviorRetainingAppBarLayoutInflate, 2131427670);
        if (backButtonView != null) {
            i = 2131427671;
            View viewT = m5n1.t(behaviorRetainingAppBarLayoutInflate, 2131427671);
            if (viewT != null) {
                i = 2131428119;
                CollapsingToolbarLayout collapsingToolbarLayoutT = m5n1.t(behaviorRetainingAppBarLayoutInflate, 2131428119);
                if (collapsingToolbarLayoutT != null) {
                    i = 2131428212;
                    ViewStub viewStub = (ViewStub) m5n1.t(behaviorRetainingAppBarLayoutInflate, 2131428212);
                    if (viewStub != null) {
                        i = 2131430161;
                        BellButtonView bellButtonView = (BellButtonView) m5n1.t(behaviorRetainingAppBarLayoutInflate, 2131430161);
                        if (bellButtonView != null) {
                            i = 2131430735;
                            EncoreButton encoreButtonT = m5n1.t(behaviorRetainingAppBarLayoutInflate, 2131430735);
                            if (encoreButtonT != null) {
                                i = 2131431023;
                                View viewT2 = m5n1.t(behaviorRetainingAppBarLayoutInflate, 2131431023);
                                if (viewT2 != null) {
                                    i = 2131431397;
                                    Toolbar toolbarT = m5n1.t(behaviorRetainingAppBarLayoutInflate, 2131431397);
                                    if (toolbarT != null) {
                                        i = 2131431398;
                                        LinearLayout linearLayout = (LinearLayout) m5n1.t(behaviorRetainingAppBarLayoutInflate, 2131431398);
                                        if (linearLayout != null) {
                                            i = 2131431409;
                                            TextView textView = (TextView) m5n1.t(behaviorRetainingAppBarLayoutInflate, 2131431409);
                                            if (textView != null) {
                                                byp bypVar = new byp(behaviorRetainingAppBarLayout, backButtonView, viewT, collapsingToolbarLayoutT, viewStub, bellButtonView, encoreButtonT, viewT2, toolbarT, linearLayout, textView);
                                                behaviorRetainingAppBarLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                                l2p1.o(bypVar, behaviorRetainingAppBarLayout.getContext().getColor(2131101370));
                                                this.d = bypVar;
                                                viewStub.setLayoutResource(2131625148);
                                                ConstraintLayout constraintLayoutInflate = viewStub.inflate();
                                                int i2 = 2131428149;
                                                ViewStub viewStub2 = (ViewStub) m5n1.t(constraintLayoutInflate, 2131428149);
                                                if (viewStub2 != null) {
                                                    i2 = 2131431403;
                                                    if (m5n1.t(constraintLayoutInflate, 2131431403) != null) {
                                                        i2 = 2131431404;
                                                        Barrier barrierT = m5n1.t(constraintLayoutInflate, 2131431404);
                                                        if (barrierT != null) {
                                                            ConstraintLayout constraintLayout = constraintLayoutInflate;
                                                            this.e = new fad0(constraintLayout, viewStub2, barrierT);
                                                            ComposeView composeView = new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                                                            composeView.setContent(new j2i(-943047215, new we00(gw70Var, this, (byte) 1), true));
                                                            this.f = context.getResources().getString(2131952713);
                                                            this.g = context.getResources().getString(2131961420);
                                                            sty styVar = new sty(1, this, xe00.class, "applyContentWindowInsetTop", "applyContentWindowInsetTop(I)V", 0, (byte) 18);
                                                            WeakHashMap weakHashMap = b8k1.a;
                                                            r7k1.c(collapsingToolbarLayoutT, (k1q0) null);
                                                            r7k1.c(behaviorRetainingAppBarLayout, new v6a0(bypVar, styVar, (byte) 23));
                                                            if (!behaviorRetainingAppBarLayout.isLaidOut() || behaviorRetainingAppBarLayout.isLayoutRequested()) {
                                                                behaviorRetainingAppBarLayout.addOnLayoutChangeListener(new qo9(constraintLayout, barrierT, bypVar, (byte) 6));
                                                            } else {
                                                                float height = constraintLayout.getHeight();
                                                                double y = (((double) ((barrierT.getY() - toolbarT.getHeight()) / height)) + 0.1d) * 255.0d;
                                                                double y2 = (((double) (barrierT.getY() / height)) + 0.1d) * 255.0d;
                                                                int iArgb = Color.argb((int) y, 46, 46, 46);
                                                                int iArgb2 = Color.argb((int) y2, 30, 30, 30);
                                                                Drawable background = toolbarT.getBackground();
                                                                if ((background instanceof GradientDrawable ? (GradientDrawable) background : null) == null) {
                                                                    toolbarT.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{iArgb2, iArgb}));
                                                                } else {
                                                                    ((GradientDrawable) toolbarT.getBackground()).setColors(new int[]{iArgb2, iArgb});
                                                                }
                                                            }
                                                            behaviorRetainingAppBarLayout.a(new rzg(this, (byte) 10));
                                                            k8p1.o(viewStub2, composeView);
                                                            return;
                                                        }
                                                    }
                                                }
                                                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i2)));
                                                throw null;
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
        bhn0.i("Missing required view with ID: ".concat(behaviorRetainingAppBarLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.View, com.spotify.encoreconsumermobile.elements.bellbutton.BellButtonView] */
    public final void f(Object obj) {
        pod0 pod0Var = (pod0) obj;
        this.b = pod0Var;
        int color = this.a.getColor(2131104279);
        byp bypVar = this.d;
        l2p1.o(bypVar, color);
        ((TextView) bypVar.i).setText(pod0Var.a);
        ?? r0 = (BellButtonView) bypVar.d;
        r0.d = new cja(dja.a, this.f);
        r0.setContentDescription(r0.getContext().getString(2131952714));
        r0.a();
        r0.setVisibility(0);
        EncoreButton encoreButton = (EncoreButton) bypVar.e;
        encoreButton.setVisibility(0);
        encoreButton.setIconResource(2131231506);
        encoreButton.setContentDescription(this.g);
        bpb1 bpb1Var = (wen0) this.c.getValue();
        bpb1Var.getClass();
        bpb1Var.m((Object) null, pod0Var);
    }

    public final View getView() {
        return (BehaviorRetainingAppBarLayout) this.d.b;
    }

    public final void n(iu30 iu30Var) {
        byp bypVar = this.d;
        ((BackButtonView) bypVar.c).n(new v2y(iu30Var, (byte) 18));
        ((BellButtonView) bypVar.d).setOnClickListener(new aqs(iu30Var, (byte) 20));
        ((EncoreButton) bypVar.e).setOnClickListener(new cvr(iu30Var, this, (byte) 27));
    }
}
