package p;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import java.util.EnumSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class e770 extends f770 {
    public final /* synthetic */ byte d = 2;
    public final Object e;

    public e770(fe70 fe70Var, Class cls) {
        super(EnumSet.of(ix40.b, ix40.d), cls, (byte) 0);
        fe70Var.getClass();
        this.e = fe70Var;
    }

    public static asd l(Context context, HubsImmutableComponentBundle hubsImmutableComponentBundle) {
        zrd zrdVar;
        int color;
        j4b1 j4b1Var = (j4b1) gc70.a.G(hubsImmutableComponentBundle.F("accessoryIcon", "")).h();
        if (j4b1Var == null) {
            return null;
        }
        String strB = hubsImmutableComponentBundle.B("accessorySize");
        try {
            rm5 rm5Var = b770.a;
            Enum enumP = rm5Var.p(strB);
            if (enumP == null) {
                throw new EnumConstantNotPresentException((Class) rm5Var.a, strB);
            }
            zrdVar = (zrd) enumP;
            String strF = hubsImmutableComponentBundle.F("accessoryColor", "");
            try {
                color = Color.parseColor(strF);
            } catch (Exception unused) {
                n57.e("Failed to parse color: ".concat(strF));
                color = -65536;
            }
            return new asd(context, color, zrdVar, j4b1Var);
        } catch (Exception unused2) {
            n57.e("Failed to parse size: " + strB);
            zrdVar = zrd.c;
        }
    }

    @Override // p.f770
    public /* bridge */ /* synthetic */ void f(nx40 nx40Var, y570 y570Var, l670 l670Var, yfu yfuVar) {
        switch (this.d) {
            case 0:
                j((wrd) nx40Var, y570Var, l670Var);
                break;
            case 1:
                k((gy31) nx40Var, y570Var, l670Var);
                break;
            default:
                k((gy31) nx40Var, y570Var, l670Var);
                break;
        }
    }

    public abstract void i(gy31 gy31Var, y570 y570Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [android.view.View, p.tvd] */
    public void j(wrd wrdVar, y570 y570Var, l670 l670Var) {
        Drawable drawable;
        String str = ((id70) y570Var.n()).a.a;
        ld70 ld70Var = ((dd70) y570Var.k()).a.c;
        n57.k(ld70Var != null, "main image missing, id=%s", new Object[]{y570Var.a()});
        ?? r12 = ((rtd) wrdVar).a;
        m(r12.getImageView(), ld70Var);
        Context context = r12.getContext();
        String strB = y570Var.g().B("titleBadge");
        if (strB == null) {
            strB = "";
        }
        if (y570Var.g().b("isFresh", false)) {
            drawable = context.getDrawable(2131233141);
        } else if (strB.equals("shuffle")) {
            Drawable g4b1Var = new g4b1(context, j4b1.a6, a8o.y(12.0f, context.getResources()));
            g4b1Var.b(-16777216);
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{context.getDrawable(2131231001), g4b1Var});
            int iY = a8o.y(2.0f, context.getResources());
            layerDrawable.setLayerInset(1, iY, 0, iY, 0);
            drawable = layerDrawable;
        } else {
            drawable = null;
        }
        if (drawable == null) {
            r12.setTitle(str);
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("@  ");
            spannableStringBuilder.append((CharSequence) str);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            spannableStringBuilder.setSpan(new hbe(drawable, (byte) 1), 0, 1, 0);
            r12.setTitle(spannableStringBuilder);
        }
        ywo1.i((View) r12);
        r12.setAccessoryDrawable(l(r12.getContext(), y570Var.g()));
        two1.r(l670Var, (View) r12, y570Var);
        if (y570Var.j().containsKey("longClick")) {
            o670 o670Var = new o670(l670Var.c);
            o670Var.c("longClick");
            o670Var.g(y570Var);
            o670Var.f(r12);
            o670Var.e();
        }
    }

    public void k(gy31 gy31Var, y570 y570Var, l670 l670Var) {
        ha70 ha70Var;
        eoc k65Var;
        wwc wwcVar;
        byte b = this.d;
        Object obj = this.e;
        byte b2 = 1;
        switch (b) {
            case 1:
                ywo1.i(gy31Var.getView());
                i(gy31Var, y570Var);
                two1.r(l670Var, gy31Var.getView(), y570Var);
                if (y570Var.j().containsKey("longClick")) {
                    o670 o670Var = new o670(l670Var.c);
                    o670Var.c("longClick");
                    o670Var.g(y570Var);
                    o670Var.f(gy31Var.getView());
                    o670Var.e();
                }
                n57.j(((dd70) y570Var.k()).a.c != null, "main image is missing");
                ImageView imageView = gy31Var.getImageView();
                ld70 ld70Var = ((dd70) y570Var.k()).a.c;
                fe70 fe70Var = (fe70) obj;
                if (ld70Var != null) {
                    Context context = imageView.getContext();
                    ha70 ha70Var2 = ha70.CIRCULAR;
                    HubsImmutableComponentBundle hubsImmutableComponentBundle = ld70Var.a.e;
                    String strB = hubsImmutableComponentBundle.B("style");
                    WeakHashMap weakHashMap = xoi1.a;
                    if (strB == null) {
                        strB = "";
                    }
                    switch (strB) {
                        case "rippleSquare":
                            ha70Var = ha70.SQUARE_WITH_RIPPLE;
                            break;
                        case "circular":
                            ha70Var = ha70Var2;
                            break;
                        case "rippleCircular":
                            ha70Var = ha70.CIRCULAR_WITH_RIPPLE;
                            break;
                        default:
                            ha70Var = ha70.DEFAULT;
                            break;
                    }
                    if (ha70Var2 == ha70Var) {
                        int i = bcg.g;
                        k65Var = new eoc(b2);
                    } else {
                        k65Var = null;
                    }
                    if ("verified".equals(hubsImmutableComponentBundle.j("badge"))) {
                        int iC = l1d.C(1);
                        if (iC != 0) {
                            b2 = iC != 1 ? (byte) 3 : (byte) 2;
                        }
                        k65Var = new k65(new h3a(context, b2), k65Var, context, (byte) 2);
                    }
                    fe70Var.c(imageView, ld70Var, k65Var);
                } else {
                    fe70Var.c(imageView, null, null);
                }
                spq0 spq0VarO = gc70.a.o((String) y570Var.g().j("accessoryRightIcon"));
                if (spq0VarO.c()) {
                    View viewZ = ioo1.z(gy31Var.getView().getContext(), (j4b1) spq0VarO.b());
                    if (y570Var.j().containsKey("rightAccessoryClick")) {
                        o670 o670Var2 = new o670(l670Var.c);
                        o670Var2.c("rightAccessoryClick");
                        o670Var2.g(y570Var);
                        o670Var2.f(viewZ);
                        o670Var2.d();
                    }
                    gy31Var.i(viewZ);
                } else {
                    gy31Var.i(null);
                }
                gy31Var.setActive(y570Var.g().b("active", false));
                break;
            default:
                ywo1.i(gy31Var.getView());
                i(gy31Var, y570Var);
                two1.r(l670Var, gy31Var.getView(), y570Var);
                if (y570Var.j().containsKey("longClick")) {
                    o670 o670Var3 = new o670(l670Var.c);
                    o670Var3.c("longClick");
                    o670Var3.g(y570Var);
                    o670Var3.f(gy31Var.getView());
                    o670Var3.e();
                }
                yqg yqgVar = (yqg) obj;
                n57.j(y570Var.g().g("calendar") != null, "calendar data is missing!");
                ImageView imageView2 = gy31Var.getImageView();
                int i2 = wwc.d;
                Drawable drawable = imageView2.getDrawable();
                if (drawable instanceof wwc) {
                    wwcVar = (wwc) drawable;
                } else {
                    Context context2 = imageView2.getContext();
                    yqgVar.d();
                    wwcVar = new wwc(context2);
                    imageView2.setImageDrawable(wwcVar);
                }
                HubsImmutableComponentBundle hubsImmutableComponentBundleG = y570Var.g().g("calendar");
                if (hubsImmutableComponentBundleG != null) {
                    String strF = hubsImmutableComponentBundleG.F("month", "APR");
                    String strValueOf = String.valueOf(hubsImmutableComponentBundleG.n(1, "dayOfMonth"));
                    wwcVar.b.setText(strF);
                    wwcVar.c.setText(strValueOf);
                }
                axo1.f(gy31Var, y570Var, l670Var);
                gy31Var.setActive(y570Var.g().b("active", false));
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    public void m(ImageView imageView, pc70 pc70Var) {
        ha70 ha70Var;
        eoc eocVar;
        if (pc70Var == null) {
            eocVar = null;
        } else {
            try {
                Object objJ = ((ld70) pc70Var).a.e.j("style");
                byte b = 1;
                if (!(objJ instanceof ha70)) {
                    String strB = ((ld70) pc70Var).a.e.B("style");
                    WeakHashMap weakHashMap = xoi1.a;
                    if (strB == null) {
                        strB = "";
                    }
                    switch (strB) {
                        case "rippleSquare":
                            ha70Var = ha70.SQUARE_WITH_RIPPLE;
                            break;
                        case "circular":
                            ha70Var = ha70.CIRCULAR;
                            break;
                        case "rippleCircular":
                            ha70Var = ha70.CIRCULAR_WITH_RIPPLE;
                            break;
                        default:
                            ha70Var = ha70.DEFAULT;
                            break;
                    }
                } else {
                    ha70Var = (ha70) objJ;
                }
                if (ha70Var == ha70.CIRCULAR) {
                    int i = bcg.g;
                    eocVar = new eoc(b);
                } else {
                    eocVar = null;
                }
            } catch (Exception e) {
                n57.g("Image can not be loaded " + (pc70Var != null ? ((ld70) pc70Var).a.c : null), e);
                return;
            }
        }
        ((fe70) this.e).e(imageView, pc70Var, eocVar);
    }

    public e770(fe70 fe70Var, j3a j3aVar, Class cls) {
        super(EnumSet.of(ix40.h), cls, (byte) 0);
        fe70Var.getClass();
        this.e = fe70Var;
    }

    public e770(Class cls, yqg yqgVar) {
        super(EnumSet.of(ix40.h), cls, (byte) 0);
        this.e = yqgVar;
    }

    public e770(EnumSet enumSet, fe70 fe70Var) {
        super(enumSet, wrd.class, (byte) 0);
        fe70Var.getClass();
        this.e = fe70Var;
    }
}
