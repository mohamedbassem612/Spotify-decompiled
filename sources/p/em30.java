package p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class em30 extends l570 {
    public ixg X;
    public final SparseArray Y;
    public final gw70 b;
    public final ynb0 c;
    public final Context d;
    public final LinearLayout e;
    public final ImageView f;
    public final TextView g;
    public final TextView h;
    public final TextView i;
    public final LinearLayout t;

    /* JADX WARN: Illegal instructions before constructor call */
    public em30(ViewGroup viewGroup, gw70 gw70Var, ynb0 ynb0Var) {
        View viewL = eqq.l(viewGroup, 2131624703, viewGroup, false);
        super(viewL);
        this.b = gw70Var;
        this.c = ynb0Var;
        this.d = viewGroup.getContext();
        this.e = (LinearLayout) viewL.findViewById(2131428198);
        this.f = (ImageView) viewL.findViewById(2131429612);
        this.g = (TextView) viewL.findViewById(2131431356);
        this.h = (TextView) viewL.findViewById(2131431115);
        this.i = (TextView) viewL.findViewById(2131427414);
        this.t = (LinearLayout) viewL.findViewById(2131428067);
        this.Y = new SparseArray();
    }

    public final void a(y570 y570Var, l670 l670Var, yfu yfuVar) {
        String str;
        String str2;
        int iW0;
        gw70 gw70Var = this.b;
        ImageView imageView = this.f;
        gw70Var.d(imageView);
        ld70 ld70Var = y570Var.k().a.c;
        if (ld70Var == null || (str = ld70Var.a.c) == null || str.length() == 0) {
            str = null;
        }
        Context context = this.d;
        Drawable drawableC = qz70.c(context, 2131231384, 0, 28);
        ixg ixgVarF = gw70Var.f(str);
        ixgVarF.m(drawableC);
        ixgVarF.f(drawableC);
        ixgVarF.k(imageView, (ird1) null);
        String str3 = y570Var.n().a.a;
        if (str3 == null) {
            str3 = "";
        }
        this.g.setText(str3);
        String str4 = y570Var.n().a.b;
        if (str4 == null) {
            str4 = "";
        }
        TextView textView = this.h;
        textView.setText(str4);
        String str5 = y570Var.n().a.c;
        if (str5 == null) {
            str5 = "";
        }
        this.i.setText(str5);
        HubsImmutableComponentBundle hubsImmutableComponentBundleG = y570Var.g().g("track_info");
        if (hubsImmutableComponentBundleG != null && (str2 = y570Var.n().a.b) != null && str2.length() != 0) {
            String strF = hubsImmutableComponentBundleG.F("artist_name", "");
            String strF2 = hubsImmutableComponentBundleG.F("artist_uri", "");
            boolean zB = hubsImmutableComponentBundleG.b("use_artist_placeholder", false);
            bqf1 bqf1Var = (bqf1) this.c.get();
            bqf1Var.getClass();
            rhg rhgVar = new rhg(strF2, bqf1Var.a, bqf1Var.b);
            if (zB) {
                iW0 = ihc1.w0(str2, "%1$s", 0, false, 6);
                if (iW0 != -1) {
                    str2 = String.format(str2, Arrays.copyOf(new Object[]{strF}, 1));
                }
            } else {
                iW0 = ihc1.w0(str2, strF, 0, false, 6);
            }
            SpannableString spannableString = new SpannableString(str2);
            int length = strF.length() + iW0;
            if (iW0 != -1) {
                spannableString.setSpan(rhgVar, iW0, length, 33);
            }
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setText(spannableString, TextView.BufferType.SPANNABLE);
        }
        List listS = y570Var.s();
        if (!listS.isEmpty()) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            LinearLayout linearLayout = this.t;
            linearLayout.removeAllViews();
            int size = listS.size();
            for (int i = 0; i < size; i++) {
                y570 y570Var2 = (y570) listS.get(i);
                int iH = l670Var.h.h(y570Var2);
                SparseArray sparseArray = this.Y;
                pe70 pe70VarB = (pe70) sparseArray.get(iH);
                if (pe70VarB == null) {
                    pe70VarB = pe70.b(iH, linearLayout, l670Var);
                    pe70VarB.b.setLayoutParams(layoutParams);
                    sparseArray.put(iH, pe70VarB);
                }
                linearLayout.addView(pe70VarB.b);
                pe70VarB.a(i, y570Var2, yfuVar);
            }
        }
        ixg ixgVar = this.X;
        if (ixgVar != null) {
            ixgVar.c();
        }
        this.X = null;
        ld70 ld70Var2 = y570Var.k().a.c;
        LinearLayout linearLayout2 = this.e;
        if (ld70Var2 == null) {
            Resources resources = context.getResources();
            ThreadLocal threadLocal = qx21.a;
            GradientDrawable gradientDrawableG = rno1.g(context, resources.getColor(2131101513, null));
            WeakHashMap weakHashMap = b8k1.a;
            linearLayout2.setBackground(gradientDrawableG);
            return;
        }
        String str6 = ld70Var2.a.c;
        if (str6 == null || str6.length() == 0) {
            str6 = null;
        }
        if (str6 == null) {
            WeakHashMap weakHashMap2 = b8k1.a;
            linearLayout2.setBackground(null);
        } else {
            ixg ixgVarF2 = gw70Var.f(str6);
            ixgVarF2.g = false;
            this.X = ixgVarF2;
            ixgVarF2.j(new cce((Object) null, new dm30(this, ixgVarF2, (byte) 0), new dm30(this, ixgVarF2, (byte) 1), (byte) 20));
        }
    }

    public final void b(int... iArr) {
    }
}
