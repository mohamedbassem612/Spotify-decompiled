package p;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbars;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ea70 implements q570 {
    public final fe70 a;
    public final /* synthetic */ byte b;

    public ea70(fe70 fe70Var, byte b) {
        this.b = b;
        fe70Var.getClass();
        this.a = fe70Var;
    }

    public static x10 h(Context context, String str) {
        if (str == null) {
            return null;
        }
        Drawable drawable = context.getDrawable(2131232783);
        if (drawable == null) {
            hhg1.n("Icon drawable resource must be valid");
            return null;
        }
        int iO = ago1.o(context, 2130968791, 0);
        int iO2 = ago1.o(context, 0, 0);
        drawable.setTint(iO);
        return new x10(drawable, 1.0f, iO2, (byte) 2);
    }

    public final View b(ViewGroup viewGroup, l670 l670Var) {
        switch (this.b) {
            case 0:
                sw9 sw9VarB = bx40.b();
                sw9VarB.c = f160.COLOR_ONLY;
                return sw9VarB.u(viewGroup.getContext());
            case 1:
                sw9 sw9VarB2 = bx40.b();
                sw9VarB2.b = 2130969393;
                return sw9VarB2.u(viewGroup.getContext());
            default:
                return bx40.b().u(viewGroup.getContext());
        }
    }

    public final EnumSet c() {
        return EnumSet.noneOf(ix40.class);
    }

    public final void d(View view, y570 y570Var, l670 l670Var, yfu yfuVar) {
        byte b = this.b;
        fe70 fe70Var = this.a;
        switch (b) {
            case 0:
                bx40 bx40Var = (bx40) view;
                ob51.d(bx40Var, f(bx40Var, y570Var));
                bx40Var.setGlueToolbar(GlueToolbars.createGlueToolbar(bx40Var.getContext(), bx40Var));
                ld70 ld70Var = ((dd70) y570Var.k()).a.c;
                String str = ld70Var != null ? ld70Var.a.c : null;
                String str2 = ld70Var != null ? ld70Var.a.d : null;
                cx40 contentViewBinder = bx40Var.getContentViewBinder();
                contentViewBinder.getClass();
                List listUnmodifiableList = Collections.unmodifiableList(((kw40) contentViewBinder).b);
                dm5.m(!listUnmodifiableList.isEmpty());
                ImageView imageView = ((dz50) ((k6m) listUnmodifiableList.get(0))).c;
                fe70Var.a(imageView);
                if (str != null) {
                    if (!str.equals(bx40Var.getView().getTag(2131429192))) {
                        bx40Var.setColor(0);
                    }
                    fe70Var.f(imageView, str, h(bx40Var.getContext(), str2), new nay(bx40Var, (byte) 28));
                } else if (ld70Var != null) {
                    bx40Var.setColor(0);
                    fe70.g(imageView, str2);
                }
                bx40Var.getView().setTag(2131429192, str);
                two1.r(l670Var, imageView, y570Var);
                break;
            case 1:
                bx40 bx40Var2 = (bx40) view;
                ob51.d(bx40Var2, f(bx40Var2, y570Var));
                bx40Var2.setGlueToolbar(GlueToolbars.createGlueToolbar(bx40Var2.getContext(), bx40Var2));
                ld70 ld70Var2 = ((dd70) y570Var.k()).a.d;
                String str3 = ld70Var2 != null ? ld70Var2.a.c : null;
                String str4 = ld70Var2 != null ? ld70Var2.a.d : null;
                String strB = y570Var.g().B("backgroundColor");
                bjx bjxVar = new bjx(this, strB != null ? Integer.valueOf(Color.parseColor(strB)) : null, bx40Var2, str3, str4, ld70Var2);
                g160 g160Var = bx40Var2.a.d;
                if (g160Var.c.a) {
                    g160Var.b.setImageDrawable(null);
                }
                String str5 = (String) bjxVar.e;
                String str6 = (String) bjxVar.d;
                bx40 bx40Var3 = (bx40) bjxVar.c;
                ImageView backgroundImageView = bx40Var2.getBackgroundImageView();
                fe70 fe70Var2 = ((ea70) bjxVar.g).a;
                fe70Var2.a(backgroundImageView);
                Integer num = (Integer) bjxVar.b;
                bx40Var3.setColor(num != null ? num.intValue() : 0);
                if (str6 != null) {
                    x10 x10VarH = h(bx40Var3.getContext(), str5);
                    if (num != null) {
                        hl00 hl00Var = fe70Var2.c;
                        hl00Var.b(backgroundImageView);
                        gw70 gw70Var = (gw70) hl00Var.b;
                        if (TextUtils.isEmpty(str6)) {
                            str6 = null;
                        }
                        ixg ixgVarF = gw70Var.f(str6);
                        if (x10VarH != null) {
                            ixgVarF.m(x10VarH);
                        }
                        ixgVarF.k(backgroundImageView, (ird1) null);
                    } else {
                        fe70Var2.f(backgroundImageView, str6, x10VarH, new nay(bx40Var3, (byte) 28));
                    }
                } else if (((pc70) bjxVar.f) != null) {
                    fe70Var2.getClass();
                    fe70.g(backgroundImageView, str5);
                }
                break;
            default:
                bx40 bx40Var4 = (bx40) view;
                ob51.d(bx40Var4, f(bx40Var4, y570Var));
                bx40Var4.setGlueToolbar(GlueToolbars.createGlueToolbar(bx40Var4.getContext(), bx40Var4));
                ld70 ld70Var3 = ((dd70) y570Var.k()).a.d;
                ImageView backgroundImageView2 = bx40Var4.getBackgroundImageView();
                String str7 = ld70Var3 != null ? ld70Var3.a.c : null;
                backgroundImageView2.setColorFilter(backgroundImageView2.getContext().getColor(2131102454));
                if (!TextUtils.isEmpty(str7)) {
                    ColorDrawable colorDrawable = new ColorDrawable(backgroundImageView2.getContext().getColor(2131102454));
                    hl00 hl00Var2 = fe70Var.c;
                    hl00Var2.b(backgroundImageView2);
                    gw70 gw70Var2 = (gw70) hl00Var2.b;
                    if (TextUtils.isEmpty(str7)) {
                        str7 = null;
                    }
                    ixg ixgVarF2 = gw70Var2.f(str7);
                    ixgVarF2.m(colorDrawable);
                    ixgVarF2.f(colorDrawable);
                    ixgVarF2.k(backgroundImageView2, (ird1) null);
                } else {
                    fe70Var.a(backgroundImageView2);
                    backgroundImageView2.setImageDrawable(null);
                }
                break;
        }
    }

    public final void e(View view, y570 y570Var, int[] iArr) {
        switch (this.b) {
            case 0:
                if (iArr.length != 0) {
                    hhg1.h("Actions on header children not yet implemented!");
                    break;
                } else if (iArr.length > 0) {
                    hhg1.h("Component does not support scrolling");
                    break;
                }
                break;
            case 1:
                if (iArr.length != 0) {
                    hhg1.h("Actions on header children not yet implemented!");
                    break;
                } else if (iArr.length > 0) {
                    hhg1.h("Component does not support scrolling");
                    break;
                }
                break;
            default:
                if (iArr.length != 0) {
                    hhg1.h("Actions on header children not yet implemented!");
                    break;
                } else if (iArr.length > 0) {
                    hhg1.h("Component does not support scrolling");
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v4, types: [p.cz50] */
    public cz50 f(bx40 bx40Var, y570 y570Var) {
        ?? r2;
        ez50 ez50VarS;
        switch (this.b) {
            case 0:
                g(bx40Var, y570Var);
                String str = ((id70) y570Var.n()).a.a;
                String str2 = ((id70) y570Var.n()).a.b;
                String str3 = ((id70) y570Var.n()).a.c;
                String str4 = ((id70) y570Var.n()).a.d;
                if (str == null) {
                    if (str4 != null) {
                        hz50 hz50VarT = nb51.t(bx40Var);
                        hz50VarT.setTitle(str4);
                        return hz50VarT;
                    }
                    fz50 fz50VarS = nb51.s(bx40Var);
                    fz50VarS.setTitle(null);
                    fz50VarS.d(null);
                    return fz50VarS;
                }
                if (str2 != null) {
                    if (str3 != null) {
                        View viewInflate = LayoutInflater.from(bx40Var.getContext()).inflate(2131625026, (ViewGroup) bx40Var, false);
                        gz50 gz50Var = new gz50(viewInflate);
                        viewInflate.setTag(2131429011, gz50Var);
                        gz50Var.f.setText(str3);
                        ez50VarS = gz50Var;
                    } else {
                        ez50VarS = nb51.s(bx40Var);
                    }
                    ez50VarS.d(str2);
                    r2 = ez50VarS;
                } else {
                    View viewInflate2 = LayoutInflater.from(bx40Var.getContext()).inflate(2131625026, (ViewGroup) bx40Var, false);
                    dz50 dz50Var = new dz50(viewInflate2);
                    viewInflate2.setTag(2131429011, dz50Var);
                    r2 = dz50Var;
                }
                r2.setTitle(str);
                return r2;
            default:
                return g(bx40Var, y570Var);
        }
    }

    public final cz50 g(bx40 bx40Var, y570 y570Var) {
        cz50 cz50Var;
        cz50 cz50VarR;
        hz50 hz50VarU;
        String str = ((id70) y570Var.n()).a.a;
        String str2 = ((id70) y570Var.n()).a.b;
        String str3 = ((id70) y570Var.n()).a.c;
        String str4 = ((id70) y570Var.n()).a.d;
        if (str != null) {
            if (str2 != null) {
                if (str3 != null) {
                    bx40Var.getClass();
                    View viewInflate = LayoutInflater.from(bx40Var.getContext()).inflate(2131625030, (ViewGroup) bx40Var, false);
                    iz50 iz50Var = new iz50(viewInflate);
                    viewInflate.setTag(2131429011, iz50Var);
                    iz50Var.d.setText(str3);
                    hz50VarU = iz50Var;
                } else {
                    hz50VarU = nb51.u(bx40Var);
                }
                hz50VarU.c.setText(str2);
                cz50VarR = hz50VarU;
            } else if (str4 != null) {
                hz50 hz50VarT = nb51.t(bx40Var);
                hz50VarT.c.setText(str4);
                cz50VarR = hz50VarT;
            } else {
                cz50VarR = nb51.r(bx40Var);
            }
            cz50VarR.setTitle(str);
            cz50Var = cz50VarR;
        } else if (str4 != null) {
            hz50 hz50VarT2 = nb51.t(bx40Var);
            hz50VarT2.setTitle(str4);
            cz50Var = hz50VarT2;
        } else {
            hz50 hz50VarU2 = nb51.u(bx40Var);
            hz50VarU2.setTitle(null);
            hz50VarU2.c.setText((CharSequence) null);
            cz50Var = hz50VarU2;
        }
        GlueToolbar glueToolbar = bx40Var.getGlueToolbar();
        if (glueToolbar != null) {
            glueToolbar.setTitle(str);
        }
        return cz50Var;
    }
}
