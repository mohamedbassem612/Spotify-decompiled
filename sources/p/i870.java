package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbars;
import java.util.EnumSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i870 implements q570 {
    public final /* synthetic */ byte a = 0;
    public final Object b;

    public i870(jik1 jik1Var) {
        this.b = new hp91(jik1Var);
    }

    public final View b(ViewGroup viewGroup, l670 l670Var) {
        switch (this.a) {
            case 0:
                sw9 sw9VarB = bx40.b();
                sw9VarB.b = 2130969393;
                bx40 bx40VarU = sw9VarB.u(viewGroup.getContext());
                bx40VarU.setGlueToolbar(GlueToolbars.createGlueToolbar(bx40VarU.getContext(), bx40VarU));
                return bx40VarU;
            default:
                return new Space(viewGroup.getContext());
        }
    }

    public final EnumSet c() {
        switch (this.a) {
            case 0:
                return EnumSet.noneOf(ix40.class);
            default:
                return EnumSet.of(ix40.h);
        }
    }

    public final void d(View view, y570 y570Var, l670 l670Var, yfu yfuVar) {
        cz50 cz50VarR;
        switch (this.a) {
            case 0:
                bx40 bx40Var = (bx40) view;
                n57.j(((id70) y570Var.n()).a.a != null, "title is missing");
                n57.j(((dd70) y570Var.k()).a.d != null, "background image not set");
                String str = ((id70) y570Var.n()).a.a;
                String str2 = ((id70) y570Var.n()).a.b;
                if (str2 != null) {
                    hz50 hz50VarU = nb51.u(bx40Var);
                    hz50VarU.c.setText(str2);
                    cz50VarR = hz50VarU;
                } else {
                    cz50VarR = nb51.r(bx40Var);
                }
                cz50VarR.setTitle(str);
                GlueToolbar glueToolbar = bx40Var.getGlueToolbar();
                n57.h("toolbar not set", glueToolbar != null);
                glueToolbar.setTitle(str);
                ob51.d(bx40Var, cz50VarR);
                st60 st60Var = new st60(this, bx40Var, y570Var);
                g160 g160Var = bx40Var.a.d;
                x10 x10Var = null;
                if (g160Var.c.a) {
                    g160Var.b.setImageDrawable(null);
                }
                ImageView backgroundImageView = bx40Var.getBackgroundImageView();
                fe70 fe70Var = (fe70) ((i870) st60Var.c).b;
                fe70Var.a(backgroundImageView);
                bx40 bx40Var2 = (bx40) st60Var.d;
                bx40Var2.setColor(0);
                ld70 ld70Var = ((dd70) ((y570) st60Var.b).k()).a.d;
                if (ld70Var != null) {
                    kd70 kd70Var = ld70Var.a;
                    String str3 = kd70Var.d;
                    String str4 = kd70Var.c;
                    if (str4 == null) {
                        fe70Var.getClass();
                        fe70.g(backgroundImageView, str3);
                    } else {
                        Context context = bx40Var2.getContext();
                        if (str3 != null) {
                            Drawable drawable = context.getDrawable(2131232783);
                            if (drawable == null) {
                                hhg1.n("Icon drawable resource must be valid");
                            } else {
                                int iO = ago1.o(context, 2130968791, 0);
                                int iO2 = ago1.o(context, 0, 0);
                                drawable.setTint(iO);
                                x10Var = new x10(drawable, 1.0f, iO2, (byte) 2);
                            }
                        }
                        fe70Var.f(backgroundImageView, str4, x10Var, new nay(bx40Var2, (byte) 28));
                    }
                }
                break;
            default:
                ((hp91) this.b).o("Ignored model", y570Var);
                break;
        }
    }

    public final void e(View view, y570 y570Var, int[] iArr) {
        switch (this.a) {
            case 0:
                if (iArr.length > 0) {
                    hhg1.h("Component does not support scrolling");
                    break;
                }
                break;
            default:
                ((hp91) this.b).o("Action on ignored model", y570Var);
                break;
        }
    }

    public i870(fe70 fe70Var) {
        fe70Var.getClass();
        this.b = fe70Var;
    }
}
