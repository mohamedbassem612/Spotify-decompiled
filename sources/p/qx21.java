package p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class qx21 {
    public static final ThreadLocal a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    public static float a(int i, Resources resources) {
        if (Build.VERSION.SDK_INT >= 29) {
            return d55.d(i, resources);
        }
        ThreadLocal threadLocal = a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        if (typedValue.type == 4) {
            return typedValue.getFloat();
        }
        throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i) + " type #0x" + Integer.toHexString(typedValue.type) + " is not valid");
    }

    public static Typeface b(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return c(context, i, new TypedValue(), 0, null, false, false);
    }

    public static Typeface c(Context context, int i, TypedValue typedValue, int i2, lm5 lm5Var, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceA = null;
        if (string.startsWith("res/")) {
            int i3 = typedValue.assetCookie;
            ydf0 ydf0Var = s1h1.b;
            Typeface typeface = (Typeface) ydf0Var.c(s1h1.b(resources, i, string, i3, i2));
            if (typeface != null) {
                if (lm5Var != null) {
                    lm5Var.f(typeface);
                }
                typefaceA = typeface;
            } else if (!z2) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        v930 v930VarG = s8p1.G(resources.getXml(i), resources);
                        if (v930VarG != null) {
                            typefaceA = s1h1.a(context, v930VarG, resources, i, string, typedValue.assetCookie, i2, lm5Var, z);
                        } else if (lm5Var != null) {
                            lm5Var.e(-3);
                        }
                    } else {
                        int i4 = typedValue.assetCookie;
                        Typeface typefaceG0 = s1h1.a.G0(context, resources, i, string, i2);
                        if (typefaceG0 != null) {
                            ydf0Var.d(s1h1.b(resources, i, string, i4, i2), typefaceG0);
                        }
                        if (lm5Var != null) {
                            if (typefaceG0 != null) {
                                lm5Var.f(typefaceG0);
                            } else {
                                lm5Var.e(-3);
                            }
                        }
                        typefaceA = typefaceG0;
                    }
                } catch (IOException | XmlPullParserException unused) {
                    if (lm5Var != null) {
                        lm5Var.e(-3);
                    }
                }
            }
        } else if (lm5Var != null) {
            lm5Var.e(-3);
        }
        if (typefaceA != null || lm5Var != null || z2) {
            return typefaceA;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
