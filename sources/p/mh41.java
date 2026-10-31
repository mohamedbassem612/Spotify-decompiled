package p;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mh41 extends t2u {
    public final jf11 V1;
    public gw70 W1;
    public String X1;
    public String Y1;

    public mh41(jf11 jf11Var) {
        this.V1 = jf11Var;
    }

    public final void F0(Bundle bundle) {
        super.F0(bundle);
        String str = this.X1;
        if (str == null) {
            u890.C("imageUrl");
            throw null;
        }
        bundle.putString("IMAGE_URL", str);
        String str2 = this.Y1;
        if (str2 != null) {
            bundle.putString("ENTITY_URI", str2);
        } else {
            u890.C("entityUri");
            throw null;
        }
    }

    public final Dialog c1(Bundle bundle) {
        return new opt(N0());
    }

    public final void v0(Context context) {
        this.V1.f(this);
        super.v0(context);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        String string2;
        super/*p.zf30*/.x0(layoutInflater, viewGroup, bundle);
        String str = "";
        if (this.X1 == null) {
            if (bundle == null || (string2 = bundle.getString("IMAGE_URL")) == null) {
                string2 = "";
            }
            this.X1 = string2;
        }
        if (this.Y1 == null) {
            if (bundle != null && (string = bundle.getString("ENTITY_URI")) != null) {
                str = string;
            }
            this.Y1 = str;
        }
        vi11 vi11VarA = vi11.A(layoutInflater);
        ConstraintLayout constraintLayoutV = vi11VarA.v();
        hgx0 hgx0Var = hgx0.i;
        WeakHashMap weakHashMap = b8k1.a;
        r7k1.c(constraintLayoutV, hgx0Var);
        ((EncoreButton) vi11VarA.c).setOnClickListener(new lh41(this, (byte) 0));
        ((ConstraintLayout) vi11VarA.d).setOnClickListener(new lh41(this, (byte) 1));
        ImageView imageView = (ImageView) vi11VarA.e;
        String str2 = this.X1;
        Drawable drawable = null;
        if (str2 == null) {
            u890.C("imageUrl");
            throw null;
        }
        ird1 dc31Var = new dc31((ProgressBar) vi11VarA.f, imageView, (byte) 9);
        gw70 gw70Var = this.W1;
        if (gw70Var == null) {
            u890.C("imageLoader");
            throw null;
        }
        ixg ixgVarF = gw70Var.f(str2);
        Context context = imageView.getContext();
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130968774, typedValue, true);
        ColorDrawable colorDrawable = new ColorDrawable(x74.D(context, typedValue.resourceId));
        Drawable drawableG = x74.G(context, 2131231803);
        if (drawableG != null) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(2130968791, typedValue2, true);
            y1a1.T(drawableG, x74.D(context, typedValue2.resourceId));
            drawable = drawableG;
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{colorDrawable, drawable});
        int intrinsicWidth = drawable != null ? drawable.getIntrinsicWidth() / 4 : 0;
        layerDrawable.setLayerInset(1, intrinsicWidth, intrinsicWidth, intrinsicWidth, intrinsicWidth);
        ixgVarF.f(layerDrawable);
        ixgVarF.k(imageView, dc31Var);
        return vi11VarA.v();
    }
}
