package p;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class y1h1 extends k9 {
    public static Font v1(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iY1 = y1(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int iY2 = y1(fontStyle, font2.getStyle());
            if (iY2 < iY1) {
                font = font2;
                iY1 = iY2;
            }
        }
        return font;
    }

    public static int y1(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public final Typeface D0(Context context, w930 w930Var, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (x930 x930Var : w930Var.a()) {
                try {
                    Font fontBuild = new Font.Builder(resources, x930Var.a()).setWeight(x930Var.d()).setSlant(x930Var.e() ? 1 : 0).setTtcIndex(x930Var.b()).setFontVariationSettings(x930Var.c()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(v1(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    public final Typeface E0(Context context, oa30[] oa30VarArr, int i) {
        try {
            FontFamily fontFamilyW1 = w1(oa30VarArr, context.getContentResolver());
            if (fontFamilyW1 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyW1).setStyle(v1(fontFamilyW1, i).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    public final Typeface F0(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyW1 = w1((oa30[]) list.get(0), contentResolver);
            if (fontFamilyW1 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyW1);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily fontFamilyW2 = w1((oa30[]) list.get(i2), contentResolver);
                if (fontFamilyW2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyW2);
                }
            }
            return customFallbackBuilder.setStyle(v1(fontFamilyW1, i).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    public final Typeface G0(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    public final FontFamily w1(oa30[] oa30VarArr, ContentResolver contentResolver) {
        Font fontBuild;
        FontFamily.Builder builder = null;
        for (oa30 oa30Var : oa30VarArr) {
            if (Objects.equals(oa30Var.a.getScheme(), "systemfont")) {
                fontBuild = x1(oa30Var);
            } else {
                try {
                    Uri uri = oa30Var.a;
                    String str = oa30Var.e;
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        }
                        fontBuild = null;
                    } else {
                        try {
                            Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(oa30Var.c).setSlant(oa30Var.d ? 1 : 0).setTtcIndex(oa30Var.b);
                            if (!TextUtils.isEmpty(str)) {
                                ttcIndex.setFontVariationSettings(str);
                            }
                            fontBuild = ttcIndex.build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                } catch (IOException unused) {
                }
            }
            if (fontBuild != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(fontBuild);
                } else {
                    builder.addFont(fontBuild);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public Font x1(oa30 oa30Var) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }
}
