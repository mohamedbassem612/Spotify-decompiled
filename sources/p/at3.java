package p;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class at3 extends emc0 implements hac0 {
    public static final kn5 h = new kn5((byte) 10);
    public final gw70 e;
    public final d0m f;
    public final d0m g;

    public at3(gw70 gw70Var, d0m d0mVar, d0m d0mVar2) {
        super(h);
        this.e = gw70Var;
        this.f = d0mVar;
        this.g = d0mVar2;
    }

    public final int g(int i) {
        jxs0 jxs0Var = (jxs0) A(i);
        if (jxs0Var instanceof ixs0) {
            return 2131624043;
        }
        if (jxs0Var instanceof hxs0) {
            return 2131624042;
        }
        if (!(jxs0Var instanceof gxs0)) {
            eg.o();
            return 0;
        }
        xl81 xl81Var = ((gxs0) jxs0Var).c;
        if (xl81Var instanceof w4a) {
            return 2131624041;
        }
        if (xl81Var instanceof ckm0) {
            int iC = l1d.C(((ckm0) xl81Var).h);
            if (iC == 0) {
                return 2131624045;
            }
            if (iC == 1) {
                return 2131624040;
            }
            eg.o();
            return 0;
        }
        if (!(xl81Var instanceof qpl)) {
            bhn0.A(jxs0Var, "This Picker object seems invalid -> ");
            return 0;
        }
        int iC2 = l1d.C(((qpl) xl81Var).X);
        if (iC2 == 0) {
            return 2131624044;
        }
        if (iC2 == 1) {
            return 2131624039;
        }
        eg.o();
        return 0;
    }

    public final void n(int i, w611 w611Var) {
        jxs0 jxs0Var = (jxs0) A(i);
        if (w611Var instanceof m561) {
            return;
        }
        if (w611Var instanceof rye1) {
            rye1 rye1Var = (rye1) w611Var;
            rye1Var.U0.setText(((hxs0) jxs0Var).a);
            ConstraintLayout constraintLayout = rye1Var.V0;
            int dimensionPixelOffset = constraintLayout.getResources().getDimensionPixelOffset(2131167033);
            constraintLayout.setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            return;
        }
        byte b = 9;
        if (w611Var instanceof yy6) {
            yy6 yy6Var = (yy6) w611Var;
            gxs0 gxs0Var = (gxs0) jxs0Var;
            View view = yy6Var.U0;
            boolean z = gxs0Var.d;
            qpl qplVar = (qpl) gxs0Var.c;
            String str = qplVar.b;
            vu30 vu30Var = yy6Var.V0;
            if (vu30Var != null) {
                vu30Var.invoke(gxs0Var, Integer.valueOf(yy6Var.n()));
            }
            yy6Var.X0.setText(str);
            yy6Var.Z0.setSelected(z);
            view.setContentDescription(z ? view.getContext().getString(2131952277, str) : view.getContext().getString(2131952282, str));
            yy6Var.Y0.h(new l07(new g07(qplVar.h), false));
            view.setOnClickListener(new cg1(yy6Var, gxs0Var, b));
            b8k1.p(view, new zdc((byte) 21));
            return;
        }
        if (w611Var instanceof ts6) {
            ts6 ts6Var = (ts6) w611Var;
            gxs0 gxs0Var2 = (gxs0) jxs0Var;
            TextView textView = ts6Var.X0;
            View view2 = ts6Var.U0;
            ckm0 ckm0Var = (ckm0) gxs0Var2.c;
            vu30 vu30Var2 = ts6Var.V0;
            if (vu30Var2 != null) {
                vu30Var2.invoke(gxs0Var2, Integer.valueOf(ts6Var.n()));
            }
            textView.setText(ckm0Var.b);
            aiq0.a(textView, new xfz0(textView, (byte) 24));
            Drawable drawableJ = f0o1.j(view2.getContext(), 2131230942);
            Drawable drawable = drawableJ != null ? drawableJ : null;
            if (drawable != null) {
                drawable.setTint(Color.parseColor(ckm0Var.g));
            }
            WeakHashMap weakHashMap = b8k1.a;
            textView.setBackground(drawable);
            view2.setOnClickListener(new cg1(ts6Var, gxs0Var2, (byte) 8));
            b8k1.p(view2, new zdc((byte) 21));
            return;
        }
        if (w611Var instanceof i8a) {
            i8a i8aVar = (i8a) w611Var;
            gxs0 gxs0Var3 = (gxs0) jxs0Var;
            View view3 = i8aVar.U0;
            w4a w4aVar = (w4a) gxs0Var3.c;
            vu30 vu30Var3 = i8aVar.V0;
            if (vu30Var3 != null) {
                vu30Var3.invoke(gxs0Var3, Integer.valueOf(i8aVar.n()));
            }
            i8aVar.Y0.setText(w4aVar.b);
            view3.setSelected(gxs0Var3.d);
            Drawable drawable2 = view3.getContext().getDrawable(2131230941);
            ixg ixgVarB = i8aVar.X0.b(Uri.parse(w4aVar.e));
            if (drawable2 != null) {
                ixgVarB.m(drawable2);
                ixgVarB.f(drawable2);
            } else {
                ixgVarB.f = false;
            }
            ixgVarB.h();
            ixgVarB.d();
            ixgVarB.s(new fr31(Integer.valueOf((int) view3.getResources().getDimension(2131165306))));
            ixgVarB.k((ImageView) view3.findViewById(2131429612), (ird1) null);
            view3.setOnClickListener(new cg1(i8aVar, gxs0Var3, (byte) 12));
            return;
        }
        if (w611Var instanceof ya81) {
            ya81 ya81Var = (ya81) w611Var;
            gxs0 gxs0Var4 = (gxs0) jxs0Var;
            ImageView imageView = ya81Var.Z0;
            View view4 = ya81Var.U0;
            boolean z2 = gxs0Var4.d;
            qpl qplVar2 = (qpl) gxs0Var4.c;
            String str2 = qplVar2.b;
            vu30 vu30Var4 = ya81Var.V0;
            if (vu30Var4 != null) {
                vu30Var4.invoke(gxs0Var4, Integer.valueOf(ya81Var.n()));
            }
            ya81Var.Y0.setText(str2);
            ya81Var.a1.setSelected(z2);
            view4.setContentDescription(z2 ? view4.getContext().getString(2131952277, str2) : view4.getContext().getString(2131952282, str2));
            Drawable drawable3 = view4.getContext().getDrawable(2131230946);
            drawable3.getClass();
            String str3 = qplVar2.h;
            if (str3.length() == 0) {
                imageView.setImageDrawable(drawable3);
            } else {
                ixg ixgVarB2 = ya81Var.X0.b(Uri.parse(str3));
                ixgVarB2.m(drawable3);
                ixgVarB2.f(drawable3);
                ixgVarB2.h();
                ixgVarB2.d();
                ixgVarB2.s(new fr31(Integer.valueOf(view4.getResources().getDimensionPixelSize(2131165307))));
                ixgVarB2.k(imageView, (ird1) null);
            }
            view4.setOnClickListener(new wa21(ya81Var, gxs0Var4, (byte) 10));
            return;
        }
        if (w611Var instanceof v781) {
            v781 v781Var = (v781) w611Var;
            gxs0 gxs0Var5 = (gxs0) jxs0Var;
            TextView textView2 = v781Var.X0;
            View view5 = v781Var.U0;
            ckm0 ckm0Var2 = (ckm0) gxs0Var5.c;
            vu30 vu30Var5 = v781Var.V0;
            if (vu30Var5 != null) {
                vu30Var5.invoke(gxs0Var5, Integer.valueOf(v781Var.n()));
            }
            textView2.setText(ckm0Var2.b);
            aiq0.a(textView2, new xfz0(textView2, (byte) 24));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(view5.getResources().getDimension(2131165309));
            gradientDrawable.setColor(Color.parseColor(ckm0Var2.g));
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColors(new int[]{view5.getContext().getColor(2131102484), view5.getContext().getColor(2131102485)});
            gradientDrawable2.setOrientation(GradientDrawable.Orientation.TL_BR);
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, gradientDrawable2});
            int dimension = (int) view5.getResources().getDimension(2131165308);
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable.setLayerInset(i2, dimension, dimension, dimension, dimension);
            }
            WeakHashMap weakHashMap2 = b8k1.a;
            textView2.setBackground(layerDrawable);
            view5.setOnClickListener(new wa21(v781Var, gxs0Var5, (byte) 9));
            b8k1.p(view5, new zdc((byte) 21));
        }
    }

    public final w611 p(int i, ViewGroup viewGroup) {
        View viewS = uyn1.s(viewGroup.getContext(), i, viewGroup, 4);
        if (i == 2131624043) {
            viewS.getClass();
            return new m561(viewS);
        }
        if (i == 2131624042) {
            viewS.getClass();
            return new rye1(viewS);
        }
        gw70 gw70Var = this.e;
        d0m d0mVar = this.g;
        d0m d0mVar2 = this.f;
        if (i == 2131624039) {
            viewS.getClass();
            return new yy6(viewS, d0mVar2, d0mVar, gw70Var);
        }
        if (i == 2131624040) {
            viewS.getClass();
            return new ts6(viewS, d0mVar2, d0mVar);
        }
        if (i == 2131624041) {
            viewS.getClass();
            return new i8a(viewS, d0mVar2, d0mVar, gw70Var);
        }
        if (i == 2131624044) {
            viewS.getClass();
            return new ya81(viewS, d0mVar2, d0mVar, gw70Var);
        }
        if (i == 2131624045) {
            viewS.getClass();
            return new v781(viewS, d0mVar2, d0mVar);
        }
        eg.m(f4i1.c(i, "I don't know objects of that viewType "));
        return null;
    }
}
