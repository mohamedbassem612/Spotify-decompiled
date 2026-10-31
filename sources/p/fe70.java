package p;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fe70 {
    public final ro30 a;
    public final o860 b;
    public final hl00 c;

    public fe70(Activity activity, hl00 hl00Var, j3a j3aVar) {
        this.a = new ro30(activity);
        this.b = new o860(activity);
        this.c = hl00Var;
    }

    public static void g(ImageView imageView, String str) {
        j4b1 j4b1Var = (j4b1) gc70.a.o(str).e(j4b1.b7);
        if (j4b1Var != imageView.getTag(2131429193)) {
            Context context = imageView.getContext();
            ColorStateList colorStateListU = foo1.u(context, 2130969946);
            Drawable g4b1Var = new g4b1(context, j4b1Var, a8o.y(24.0f, context.getResources()));
            g4b1Var.c(colorStateListU);
            g4b1Var.d(a8o.y(24.0f, context.getResources()));
            imageView.setImageDrawable(g4b1Var);
            imageView.setTag(2131429193, j4b1Var);
        }
    }

    public final void a(ImageView imageView) {
        this.c.b(imageView);
    }

    public final Drawable b(String str) {
        ro30 ro30Var = this.a;
        if (str == null) {
            return (Drawable) ro30Var.b;
        }
        Activity activity = (Activity) ro30Var.c;
        Drawable drawable = activity.getDrawable(2131232783);
        if (drawable == null) {
            hhg1.n("Icon drawable resource must be valid");
            return null;
        }
        int iO = ago1.o(activity, 2130968791, 0);
        int iO2 = ago1.o(activity, 0, 0);
        drawable.setTint(iO);
        return new x10(drawable, 1.0f, iO2, (byte) 2);
    }

    public final void c(ImageView imageView, pc70 pc70Var, s7v s7vVar) {
        if (pc70Var == null) {
            a(imageView);
            imageView.setImageDrawable(null);
            return;
        }
        kd70 kd70Var = ((ld70) pc70Var).a;
        String str = kd70Var.c;
        Uri uri = TextUtils.isEmpty(str) ? null : Uri.parse(str);
        Drawable drawableB = b(kd70Var.d);
        hl00 hl00Var = this.c;
        hl00Var.b(imageView);
        ixg ixgVarB = ((gw70) hl00Var.b).b(uri);
        ixgVarB.m(drawableB);
        ixgVarB.f(drawableB);
        hl00.g(imageView, ixgVarB, s7vVar);
    }

    public final void d(ImageView imageView, pc70 pc70Var, fa70 fa70Var) {
        eoc k65Var = null;
        if (pc70Var == null) {
            a(imageView);
            imageView.setImageDrawable(null);
            return;
        }
        try {
            int i = fa70Var.a;
            Drawable drawableB = b(((ld70) pc70Var).a.d);
            hl00 hl00Var = this.c;
            String str = ((ld70) pc70Var).a.c;
            Uri uri = !TextUtils.isEmpty(str) ? Uri.parse(str) : null;
            ufg1 ufg1VarZ = this.b.z(gxo1.j(pc70Var), i);
            Context context = imageView.getContext();
            byte b = 1;
            if (gxo1.j(pc70Var) == ha70.CIRCULAR) {
                int i2 = bcg.g;
                k65Var = new eoc(b);
            }
            if (((ld70) pc70Var).a.e.b("verified", false)) {
                int iC = l1d.C(i);
                if (iC != 0) {
                    b = iC != 1 ? (byte) 3 : (byte) 2;
                }
                k65Var = new k65(new h3a(context, b), k65Var, context, (byte) 2);
            }
            hl00Var.b(imageView);
            ixg ixgVarB = ((gw70) hl00Var.b).b(uri);
            if (drawableB != null) {
                ixgVarB.m(drawableB);
                ixgVarB.f(drawableB);
            }
            if (ufg1VarZ != null) {
                ixgVarB.s(ufg1VarZ);
            }
            hl00.g(imageView, ixgVarB, k65Var);
        } catch (Exception e) {
            n57.g("Image can not be loaded " + ((ld70) pc70Var).a.c, e);
        }
    }

    public final void e(ImageView imageView, pc70 pc70Var, eoc eocVar) {
        if (pc70Var == null) {
            a(imageView);
            imageView.setImageDrawable(null);
            return;
        }
        kd70 kd70Var = ((ld70) pc70Var).a;
        String str = kd70Var.c;
        Uri uri = TextUtils.isEmpty(str) ? null : Uri.parse(str);
        Drawable drawableB = b(kd70Var.d);
        ufg1 ufg1VarZ = this.b.z(gxo1.j(pc70Var), 3);
        hl00 hl00Var = this.c;
        hl00Var.b(imageView);
        ixg ixgVarB = ((gw70) hl00Var.b).b(uri);
        ixgVarB.m(drawableB);
        ixgVarB.f(drawableB);
        ixgVarB.p(2048, 2048, 2);
        if (ufg1VarZ != null) {
            ixgVarB.s(ufg1VarZ);
        }
        hl00.g(imageView, ixgVarB, eocVar);
    }

    public final void f(ImageView imageView, String str, x10 x10Var, nay nayVar) {
        hl00 hl00Var = this.c;
        hl00Var.b(imageView);
        gw70 gw70Var = (gw70) hl00Var.b;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        ixg ixgVarF = gw70Var.f(str);
        ixgVarF.g = false;
        if (x10Var != null) {
            ixgVarF.m(x10Var);
        }
        p811 p811Var = new p811();
        cce cceVar = new cce(imageView, new fz40(p811Var, nayVar, (byte) 28), new i3(p811Var, (byte) 8), (byte) 20);
        Object tag = imageView.getTag(2131429221);
        h7k1 h7k1Var = tag instanceof h7k1 ? (h7k1) tag : null;
        if (h7k1Var != null) {
            h7k1Var.a();
        }
        h7k1 h7k1Var2 = new h7k1(imageView, ixgVarF);
        imageView.setTag(2131429221, h7k1Var2);
        imageView.addOnAttachStateChangeListener(h7k1Var2);
        p811Var.a = h7k1Var2;
        h7k1Var2.c = cceVar;
        try {
            ixg ixgVar = h7k1Var2.a;
            if (ixgVar != null) {
                ixgVar.j(h7k1Var2);
            }
        } catch (RuntimeException e) {
            h7k1Var2.a();
            throw e;
        }
    }
}
