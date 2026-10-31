package p;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class n2s implements qzh, e391 {
    public final au70 a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final ArtworkView g;
    public final View h;
    public final float i;

    public n2s(Context context, gw70 gw70Var, au70 au70Var) {
        this.a = au70Var;
        View viewInflate = LayoutInflater.from(context).inflate(2131625087, (ViewGroup) null);
        this.b = (TextView) viewInflate.findViewById(2131430349);
        TextView textView = (TextView) viewInflate.findViewById(2131431356);
        this.c = textView;
        TextView textView2 = (TextView) viewInflate.findViewById(2131431115);
        this.d = textView2;
        this.e = (TextView) viewInflate.findViewById(2131430466);
        this.f = (TextView) viewInflate.findViewById(2131431043);
        View view = (ArtworkView) viewInflate.findViewById(2131429612);
        this.g = view;
        view.setViewContext(new f47(gw70Var));
        v9w0 v9w0VarP = b2u.p(viewInflate);
        View[] viewArr = {textView};
        ArrayList arrayList = v9w0VarP.c;
        Collections.addAll(arrayList, viewArr);
        Collections.addAll(arrayList, textView2);
        Collections.addAll(v9w0VarP.d, view);
        v9w0VarP.a();
        this.h = viewInflate;
        float f = viewInflate.getResources().getConfiguration().fontScale;
        f = f < 1.0f ? 1.0f : f;
        this.i = f;
        if (!(au70Var instanceof au70)) {
            eg.o();
            throw null;
        }
        a();
        e();
        ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
        if (layoutParams == null) {
            bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            throw null;
        }
        layoutParams.width *= (int) f;
        viewInflate.setLayoutParams(layoutParams);
    }

    public final ArtworkView b() {
        return this.g;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009b  */
    public final void f(Object obj) {
        int maxLines;
        int i;
        cu70 cu70Var = (cu70) obj;
        bu70 bu70Var = cu70Var.h;
        String str = cu70Var.b;
        String str2 = cu70Var.e;
        String str3 = cu70Var.c;
        j47 j47Var = cu70Var.a;
        ArtworkView artworkView = this.g;
        View view = this.h;
        if (j47Var != null && j47Var.b != null) {
            if (!(this.a instanceof au70)) {
                eg.o();
                return;
            }
            float fMin = Math.min((int) (view.getResources().getDisplayMetrics().widthPixels * 0.4f), a8o.y(200.0f, view.getResources())) * 1.0f * this.i;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                return;
            }
            layoutParams.width = (int) fMin;
            view.setLayoutParams(layoutParams);
            qhl layoutParams2 = artworkView.getLayoutParams();
            if (layoutParams2 == null) {
                bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return;
            } else {
                qhl qhlVar = layoutParams2;
                qhlVar.G = "1:1";
                artworkView.setLayoutParams(qhlVar);
            }
        }
        String str4 = cu70Var.f;
        TextView textView = this.c;
        if (str4 != null) {
            Set set = s4b1.f;
            if (uic.h(str4, new blc0[]{blc0.ARTIST, blc0.ARTIST_AUTOPLAY, blc0.ARTIST_RADIO}) && ((str3 == null || ihc1.y0(str3)) && (str2 == null || ihc1.y0(str2)))) {
                textView.setTextAlignment(4);
            } else {
                textView.setTextAlignment(5);
            }
        } else {
            textView.setTextAlignment(5);
        }
        TextView textView2 = this.e;
        textView2.setText(str2);
        textView.setText(str);
        if (str == null || ihc1.y0(str)) {
            view.setContentDescription(cu70Var.d);
        } else {
            view.setContentDescription(null);
        }
        if (j47Var != null) {
            artworkView.h(j47Var.a);
        }
        int i2 = 0;
        int i3 = (str2 == null || ihc1.y0(str2)) ? 1 : 0;
        int i4 = i3 ^ 1;
        int i5 = (str == null || ihc1.y0(str)) ? 1 : 0;
        int i6 = i5 ^ 1;
        int i7 = (str3 == null || ihc1.y0(str3)) ? 1 : 0;
        int i8 = i7 ^ 1;
        int i9 = 8;
        textView2.setVisibility(i3 == 0 ? 0 : 8);
        textView.setVisibility(i5 == 0 ? 0 : 8);
        TextView textView3 = this.d;
        textView3.setText(str3);
        textView3.setVisibility(i7 == 0 ? 0 : 8);
        int i10 = i4 + i6 + i8;
        if (cu70Var.i && i10 < 3) {
            i9 = 0;
        }
        this.f.setVisibility(i9);
        textView2.setMaxLines(bu70Var != null ? bu70Var.a : 0);
        textView.setMaxLines(bu70Var != null ? bu70Var.b : 1);
        textView3.setMaxLines(bu70Var != null ? bu70Var.c : 2);
        Integer num = cu70Var.g;
        if (num != null) {
            maxLines = num.intValue();
        } else {
            maxLines = textView.getVisibility() == 0 ? textView.getMaxLines() : 0;
            if (textView3.getVisibility() == 0) {
                maxLines += textView3.getMaxLines();
            }
            if (textView2.getVisibility() == 0) {
                maxLines = textView2.getMaxLines() + maxLines;
            }
        }
        Resources resources = view.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(2131166175);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(2131166174);
        if (maxLines == 3) {
            i = dimensionPixelSize + dimensionPixelSize2;
        } else {
            if (textView2.getVisibility() != 0 || textView.getVisibility() != 0) {
                dimensionPixelSize = 0;
            }
            if (textView.getVisibility() == 0 && textView3.getVisibility() == 0) {
                i2 = dimensionPixelSize2;
            }
            i = dimensionPixelSize + i2;
        }
        TextView textView4 = this.b;
        textView4.setPadding(textView4.getPaddingLeft(), i, textView4.getPaddingRight(), textView4.getPaddingBottom());
        textView4.setMinLines(maxLines);
    }

    public final View getView() {
        return this.h;
    }

    public final void n(iu30 iu30Var) {
        zdc zdcVar = new zdc((byte) 3);
        View view = this.h;
        b8k1.p(view, zdcVar);
        view.setOnClickListener(new o0s(iu30Var, (byte) 4));
        view.setOnLongClickListener(new wer(iu30Var, (byte) 6));
    }
}
