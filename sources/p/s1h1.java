package p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Trace;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class s1h1 {
    public static final k9 a;
    public static final ydf0 b;
    public static Paint c;

    static {
        Trace.beginSection("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            a = new z1h1((byte) 19);
        } else if (i >= 29) {
            a = new y1h1((byte) 19);
        } else if (i >= 28) {
            a = new x1h1();
        } else if (i >= 26) {
            a = new w1h1();
        } else if (u1h1.x1()) {
            a = new u1h1();
        } else {
            a = new t1h1();
        }
        b = new ydf0(16);
        c = null;
        Trace.endSection();
    }

    public static Typeface a(Context context, v930 v930Var, Resources resources, int i, String str, int i2, int i3, lm5 lm5Var, boolean z) {
        Typeface typefaceD0;
        Typeface typefaceBuild;
        FontFamily fontFamilyBuild;
        boolean z2 = v930Var instanceof y930;
        ydf0 ydf0Var = b;
        if (z2) {
            y930 y930Var = (y930) v930Var;
            String strC = y930Var.c();
            if (TextUtils.isEmpty(strC) || (typefaceBuild = c(strC)) == null) {
                ArrayList arrayList = (ArrayList) y930Var.b();
                if (arrayList.size() != 1) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i4 = 0;
                        while (true) {
                            if (i4 >= arrayList.size()) {
                                int i5 = 0;
                                Typeface.CustomFallbackBuilder customFallbackBuilderG = null;
                                while (true) {
                                    if (i5 < arrayList.size()) {
                                        o930 o930Var = (o930) arrayList.get(i5);
                                        if (i5 == arrayList.size() - 1 && TextUtils.isEmpty(o930Var.f)) {
                                            customFallbackBuilderG.setSystemFallback(o930Var.e);
                                        } else {
                                            String str2 = o930Var.e;
                                            String str3 = o930Var.f;
                                            Font fontD = d(c(str2));
                                            if (fontD != null) {
                                                if (TextUtils.isEmpty(str3)) {
                                                    fontFamilyBuild = i15.n(fontD).build();
                                                } else {
                                                    try {
                                                        i15.p();
                                                        i15.q();
                                                        fontFamilyBuild = i15.h(lb4.a(fontD).setFontVariationSettings(str3).build()).build();
                                                    } catch (IOException unused) {
                                                    }
                                                }
                                                if (customFallbackBuilderG == null) {
                                                    customFallbackBuilderG = i15.g(fontFamilyBuild);
                                                } else {
                                                    customFallbackBuilderG.addCustomFallback(fontFamilyBuild);
                                                }
                                                i5++;
                                            }
                                        }
                                    }
                                    typefaceBuild = customFallbackBuilderG.build();
                                    break;
                                }
                            }
                            if (c(((o930) arrayList.get(i4)).e) != null) {
                                i4++;
                            }
                            typefaceBuild = null;
                            break;
                        }
                    }
                    typefaceBuild = null;
                    break;
                }
                typefaceBuild = c(((o930) arrayList.get(0)).e);
            }
            if (typefaceBuild != null) {
                if (lm5Var != null) {
                    lm5Var.f(typefaceBuild);
                }
                ydf0Var.d(b(resources, i, str, i2, i3), typefaceBuild);
                return typefaceBuild;
            }
            typefaceD0 = x8p1.q(context, y930Var.b(), i3, !z ? lm5Var != null : y930Var.a() != 0, z ? y930Var.d() : -1, lm5.j(), new dn81(lm5Var, (byte) 24));
        } else {
            typefaceD0 = a.D0(context, (w930) v930Var, resources, i3);
            if (lm5Var != null) {
                if (typefaceD0 != null) {
                    lm5Var.f(typefaceD0);
                } else {
                    lm5Var.e(-3);
                }
            }
        }
        if (typefaceD0 != null) {
            ydf0Var.d(b(resources, i, str, i2, i3), typefaceD0);
        }
        return typefaceD0;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    public static Typeface c(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    public static Font d(Typeface typeface) {
        Paint paint = c;
        if (paint == null) {
            paint = new Paint();
            c = paint;
        }
        paint.setTextSize(10.0f);
        c.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, c);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
