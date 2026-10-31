package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import java.util.EnumSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class ob70 extends f770 {
    public final fe70 d;
    public final h94 e;

    public ob70(fe70 fe70Var, Class cls) {
        super(EnumSet.of(ix40.h), cls, (byte) 1);
        fe70Var.getClass();
        this.d = fe70Var;
        this.e = new h94();
    }

    @Override // p.f770
    public /* bridge */ /* synthetic */ void f(nx40 nx40Var, y570 y570Var, l670 l670Var, yfu yfuVar) {
        j((ct31) nx40Var, y570Var, l670Var);
    }

    public abstract void i(ct31 ct31Var, y570 y570Var);

    public final void j(ct31 ct31Var, y570 y570Var, l670 l670Var) {
        Enum r4;
        wwc wwcVar;
        i(ct31Var, y570Var);
        ywo1.i(ct31Var.getView());
        two1.r(l670Var, ct31Var.getView(), y570Var);
        if (y570Var.j().containsKey("longClick")) {
            o670 o670Var = new o670(l670Var.c);
            o670Var.c("longClick");
            o670Var.g(y570Var);
            o670Var.f(ct31Var.getView());
            o670Var.e();
        }
        if (ct31Var instanceof gy31) {
            gy31 gy31Var = (gy31) ct31Var;
            if (y570Var.g().g("calendar") != null) {
                ImageView imageView = gy31Var.getImageView();
                int i = wwc.d;
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof wwc) {
                    wwcVar = (wwc) drawable;
                } else {
                    Context context = imageView.getContext();
                    this.e.d();
                    wwcVar = new wwc(context);
                    imageView.setImageDrawable(wwcVar);
                }
                HubsImmutableComponentBundle hubsImmutableComponentBundleG = y570Var.g().g("calendar");
                if (hubsImmutableComponentBundleG != null) {
                    String strF = hubsImmutableComponentBundleG.F("month", "APR");
                    String strValueOf = String.valueOf(hubsImmutableComponentBundleG.n(1, "day_of_month"));
                    wwcVar.b.setText(strF);
                    wwcVar.c.setText(strValueOf);
                }
            } else {
                ImageView imageView2 = gy31Var.getImageView();
                ld70 ld70Var = ((dd70) y570Var.k()).a.c;
                String str = ((dd70) y570Var.k()).a.f;
                fe70 fe70Var = this.d;
                if (str != null) {
                    fe70Var.getClass();
                    fe70.g(imageView2, str);
                } else {
                    fe70Var.d(imageView2, ld70Var, fa70.THUMBNAIL);
                }
            }
        }
        Object objJ = y570Var.g().j("secondary_icon");
        rm5 rm5Var = fb70.a;
        Class cls = (Class) rm5Var.a;
        if (cls.isInstance(objJ)) {
            r4 = (Enum) cls.cast(objJ);
        } else {
            r4 = objJ instanceof String ? (Enum) rm5Var.G((String) objJ).h() : null;
        }
        j4b1 j4b1Var = (j4b1) r4;
        if (j4b1Var == null && y570Var.j().containsKey("rightAccessoryClick")) {
            j4b1Var = j4b1.q4;
        }
        if (j4b1Var != null) {
            View viewZ = ioo1.z(ct31Var.getView().getContext(), j4b1Var);
            viewZ.setContentDescription(y570Var.g().B("accessoryContentDesc"));
            if (y570Var.j().containsKey("rightAccessoryClick")) {
                o670 o670Var2 = new o670(l670Var.c);
                o670Var2.c("rightAccessoryClick");
                o670Var2.g(y570Var);
                o670Var2.f(viewZ);
                o670Var2.d();
            }
            ct31Var.i(viewZ);
        } else {
            ct31Var.i(null);
        }
        int i2 = pb70.a;
        ct31Var.setAppearsDisabled(y570Var.g().b("appearDisabled", false));
    }
}
