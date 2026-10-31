package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.addtobutton.AddToButtonView;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkShadow;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.contextmenu.ContextMenuButton;
import com.spotify.encoreconsumermobile.elements.heart.HeartButton;
import com.spotify.encoreconsumermobile.elements.playbutton.PlayButtonView;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lfs implements qzh {
    public final /* synthetic */ byte a;
    public final boolean b;
    public final tnm c;
    public final a680 d;
    public final k9k e;

    public lfs(Context context, gw70 gw70Var, boolean z, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = z;
                tnm tnmVarO = tnm.o(LayoutInflater.from(context));
                this.c = tnmVarO;
                a680 a680VarR = a680.r(LayoutInflater.from(context));
                View view = (ConstraintLayout) a680VarR.a;
                eqq.t(-1, -2, view);
                this.d = a680VarR;
                k9k k9kVarD = k9k.d(LayoutInflater.from(context));
                this.e = k9kVarD;
                zhm0.d((FrameLayout) tnmVarO.d, new ArtworkView[]{(ArtworkView) tnmVarO.c}, (ConstraintLayout) null, (ArtworkShadow) tnmVarO.e, gw70Var, new TextView[]{(TextView) k9kVarD.f, (TextView) k9kVarD.e, (TextView) k9kVarD.d});
                ConstraintLayout constraintLayout = (ConstraintLayout) tnmVarO.b;
                constraintLayout.removeAllViews();
                constraintLayout.addView(view);
                ((FrameLayout) tnmVarO.h).addView((ConstraintLayout) k9kVarD.b);
                break;
            default:
                this.b = z;
                tnm tnmVarO2 = tnm.o(LayoutInflater.from(context));
                this.c = tnmVarO2;
                a680 a680VarR2 = a680.r(LayoutInflater.from(context));
                View view2 = (ConstraintLayout) a680VarR2.a;
                eqq.t(-1, -2, view2);
                this.d = a680VarR2;
                k9k k9kVarD2 = k9k.d(LayoutInflater.from(context));
                this.e = k9kVarD2;
                zhm0.d((FrameLayout) tnmVarO2.d, new ArtworkView[]{(ArtworkView) tnmVarO2.c}, (ConstraintLayout) null, (ArtworkShadow) tnmVarO2.e, gw70Var, new TextView[]{(TextView) k9kVarD2.f, (TextView) k9kVarD2.d});
                ConstraintLayout constraintLayout2 = (ConstraintLayout) tnmVarO2.b;
                constraintLayout2.removeAllViews();
                constraintLayout2.addView(view2);
                ((FrameLayout) tnmVarO2.h).addView((ConstraintLayout) k9kVarD2.b);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r15v1, types: [android.view.View, com.spotify.encoreconsumermobile.elements.addtobutton.AddToButtonView] */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View, com.spotify.encoreconsumermobile.elements.addtobutton.AddToButtonView] */
    /* JADX WARN: Type inference failed for: r2v19, types: [android.view.View, androidx.appcompat.widget.AppCompatImageButton, com.spotify.encoreconsumermobile.elements.heart.HeartButton] */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.View, androidx.appcompat.widget.AppCompatImageButton, com.spotify.encoreconsumermobile.elements.heart.HeartButton] */
    public final void f(Object obj) {
        int i;
        byte b = this.a;
        k9k k9kVar = this.e;
        qk1 qk1Var = qk1.a;
        qk1 qk1Var2 = qk1.b;
        boolean z = this.b;
        a680 a680Var = this.d;
        tnm tnmVar = this.c;
        switch (b) {
            case 0:
                ugu0 ugu0Var = (ugu0) obj;
                ?? r2 = (AddToButtonView) a680Var.b;
                ?? r4 = (HeartButton) a680Var.e;
                String str = ugu0Var.c;
                String str2 = ugu0Var.i;
                boolean z2 = ugu0Var.g;
                String str3 = ugu0Var.a;
                boolean z3 = ugu0Var.j;
                FrameLayout frameLayout = (FrameLayout) tnmVar.g;
                if (z3) {
                    frameLayout.setForeground(f0o1.j(((FrameLayout) tnmVar.d).getContext(), 2131233481));
                } else {
                    frameLayout.setForeground(null);
                }
                ((ArtworkView) tnmVar.c).h(new d17(new g07(ugu0Var.d), j4b1.t5));
                zhm0.b((View) tnmVar.f, ugu0Var.e);
                if (z) {
                    r4.setVisibility(8);
                    r2.setVisibility(0);
                    r2.f(new pk1(z2 ? qk1Var2 : qk1Var, false, null, null, null, 30));
                    i = 8;
                } else {
                    i = 8;
                    r2.setVisibility(8);
                    r4.setVisibility(0);
                    r4.f = z2;
                    r4.setImageDrawable(z2 ? r4.d : r4.e);
                    r4.setContentDescription(nmn1.o(r4.getResources(), r4.f));
                }
                ((PlayButtonView) a680Var.f).f(new cet0(ugu0Var.h, new vft0(z3), null, 4));
                tlv tlvVar = (ContextMenuButton) a680Var.c;
                tlvVar.setEnabled(true);
                tlvVar.setContentDescription(tlvVar.getResources().getString(2131962416, str3));
                ((TextView) a680Var.d).setText(ugu0Var.f);
                TextView textView = (TextView) k9kVar.f;
                TextView textView2 = (TextView) k9kVar.c;
                TextView textView3 = (TextView) k9kVar.d;
                Iterator it = p7h.M(new TextView[]{textView, textView3}).iterator();
                while (it.hasNext()) {
                    ((TextView) it.next()).setMaxLines(Integer.MAX_VALUE);
                }
                textView2.setVisibility(str2.length() > 0 ? 0 : i);
                textView2.setText(str2);
                textView.setVisibility(str3.length() > 0 ? 0 : i);
                textView.setText(str3);
                textView3.setVisibility(str.length() > 0 ? 0 : i);
                textView3.setText(str);
                FrameLayout frameLayout2 = (FrameLayout) tnmVar.h;
                aiq0.a(frameLayout2, new kfs(frameLayout2, k9kVar, (byte) 0));
                break;
            default:
                ugu0 ugu0Var2 = (ugu0) obj;
                ?? r15 = (AddToButtonView) a680Var.b;
                ?? r3 = (HeartButton) a680Var.e;
                String str4 = ugu0Var2.c;
                String str5 = ugu0Var2.b;
                String str6 = ugu0Var2.i;
                boolean z4 = ugu0Var2.g;
                String str7 = ugu0Var2.a;
                boolean z5 = ugu0Var2.j;
                if (z5) {
                    ((FrameLayout) tnmVar.g).setForeground(f0o1.j(((FrameLayout) tnmVar.d).getContext(), 2131233481));
                }
                ((ArtworkView) tnmVar.c).h(new d17(new g07(ugu0Var2.d), j4b1.t5));
                zhm0.b((View) tnmVar.f, ugu0Var2.e);
                if (z) {
                    r3.setVisibility(8);
                    r15.setVisibility(0);
                    r15.f(new pk1(z4 ? qk1Var2 : qk1Var, false, null, null, null, 30));
                } else {
                    r15.setVisibility(8);
                    r3.setVisibility(0);
                    r3.f = z4;
                    r3.setImageDrawable(z4 ? r3.d : r3.e);
                    r3.setContentDescription(nmn1.o(r3.getResources(), r3.f));
                }
                ((PlayButtonView) a680Var.f).f(new cet0(ugu0Var2.h, new vft0(z5), null, 4));
                tlv tlvVar2 = (ContextMenuButton) a680Var.c;
                tlvVar2.setEnabled(true);
                tlvVar2.setContentDescription(tlvVar2.getResources().getString(2131962416, str7));
                ((TextView) a680Var.d).setText(ugu0Var2.f);
                TextView textView4 = (TextView) k9kVar.d;
                TextView textView5 = (TextView) k9kVar.e;
                TextView textView6 = (TextView) k9kVar.f;
                TextView textView7 = (TextView) k9kVar.c;
                Iterator it2 = Collections.singletonList(textView4).iterator();
                while (it2.hasNext()) {
                    ((TextView) it2.next()).setMaxLines(Integer.MAX_VALUE);
                }
                textView7.setVisibility(str6.length() > 0 ? 0 : 8);
                textView7.setText(str6);
                textView6.setVisibility(str7.length() > 0 ? 0 : 8);
                textView6.setText(str7);
                textView5.setVisibility(str5.length() > 0 ? 0 : 8);
                textView5.setText(str5);
                textView4.setVisibility(str4.length() > 0 ? 0 : 8);
                textView4.setText(str4);
                FrameLayout frameLayout3 = (FrameLayout) tnmVar.h;
                aiq0.a(frameLayout3, new kfs(frameLayout3, k9kVar, (byte) 1));
                break;
        }
    }

    public final View getView() {
        byte b = this.a;
        tnm tnmVar = this.c;
        switch (b) {
            case 0:
                break;
        }
        return (FrameLayout) tnmVar.d;
    }

    public final void n(iu30 iu30Var) {
        byte b = this.a;
        a680 a680Var = this.d;
        tnm tnmVar = this.c;
        switch (b) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) tnmVar.d;
                frameLayout.setOnClickListener(new oes(iu30Var, (byte) 4));
                frameLayout.setOnLongClickListener(new wer(iu30Var, (byte) 11));
                ((AddToButtonView) a680Var.b).n(new mwr(iu30Var, (byte) 19));
                ((PlayButtonView) a680Var.f).n(new mwr(iu30Var, (byte) 20));
                ((HeartButton) a680Var.e).n(new mwr(iu30Var, (byte) 21));
                ((ContextMenuButton) a680Var.c).n(new mwr(iu30Var, (byte) 22));
                break;
            default:
                FrameLayout frameLayout2 = (FrameLayout) tnmVar.d;
                frameLayout2.setOnClickListener(new jn90(iu30Var, (byte) 21));
                frameLayout2.setOnLongClickListener(new wer(iu30Var, (byte) 19));
                ((PlayButtonView) a680Var.f).n(new azr0(iu30Var, (byte) 18));
                ((HeartButton) a680Var.e).n(new azr0(iu30Var, (byte) 19));
                ((ContextMenuButton) a680Var.c).n(new azr0(iu30Var, (byte) 20));
                break;
        }
    }
}
