package p;

import android.app.Activity;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a1s implements o5s {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public a1s(Activity activity, GlueToolbar glueToolbar, x8c0 x8c0Var, View.OnClickListener onClickListener) {
        Drawable drawable;
        this.a = (byte) 1;
        this.e = new xfz0(this, (byte) 27);
        this.c = glueToolbar;
        mx40 mx40Var = new mx40(glueToolbar, activity.getWindow(), onClickListener);
        this.b = mx40Var;
        mx40Var.e = false;
        TypedArray typedArrayObtainStyledAttributes = activity.obtainStyledAttributes(new int[]{2130968584});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = activity.obtainStyledAttributes(resourceId, new int[]{2130968735});
        try {
            try {
                drawable = typedArrayObtainStyledAttributes2.getDrawable(0);
                typedArrayObtainStyledAttributes2.recycle();
            } catch (Resources.NotFoundException e) {
                ColorDrawable colorDrawable = new ColorDrawable(activity.getColor(2131101501));
                n57.g("Failed to load actionBar background drawable", e);
                typedArrayObtainStyledAttributes2.recycle();
                drawable = colorDrawable;
            }
            drawable.getClass();
            this.d = drawable;
            View view = ((GlueToolbar) this.c).getView();
            WeakHashMap weakHashMap = b8k1.a;
            view.setBackground(drawable);
            GlueToolbar glueToolbar2 = (GlueToolbar) this.c;
            View view2 = glueToolbar2.getView();
            xfz0 xfz0Var = (xfz0) this.e;
            view2.removeCallbacks(xfz0Var);
            glueToolbar2.getView().postOnAnimation(xfz0Var);
            ((GlueToolbar) this.c).getView().setVisibility(0);
            x8c0Var.a(this);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public final void onDestroy(iac0 iac0Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                nl9 nl9Var = (nl9) obj;
                kt91 kt91Var = (kt91) nl9Var.g;
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131964109});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131964109});
                vum1 vum1Var = (vum1) this.c;
                kt91Var.k(new er91((fs91) null, "", 2131964109, (String) null, 2131964108, new jl5((String) this.e, nl9Var, (hsm1) this.d, vum1Var), (cvr) null, (xq91) null, false));
                ((q7r0) nl9Var.f).d.c.getLifecycle().d(this);
                break;
            default:
                mx40 mx40Var = (mx40) obj;
                mx40Var.c.setCallback(mx40Var.b.b);
                break;
        }
    }

    public a1s(String str, nl9 nl9Var, hsm1 hsm1Var, vum1 vum1Var) {
        this.a = (byte) 0;
        this.b = nl9Var;
        this.c = vum1Var;
        this.d = hsm1Var;
        this.e = str;
    }
}
