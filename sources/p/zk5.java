package p;

import android.graphics.Paint;
import android.widget.TextView;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class zk5 {
    public static final ydf0 a = new ydf0(30);
    public static Paint b;

    public static int a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    public static String b(TextView textView) {
        return textView.getFontVariationSettings();
    }

    public static void c(TextView textView, int i, int i2, int i3) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, 0);
    }

    public static void d(TextView textView, int[] iArr) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, 0);
    }

    public static void e(TextView textView, String str) {
        if (Objects.equals(textView.getFontVariationSettings(), str)) {
            textView.setFontVariationSettings("");
        }
        textView.setFontVariationSettings(str);
    }
}
