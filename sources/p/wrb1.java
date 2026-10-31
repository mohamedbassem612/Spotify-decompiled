package p;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wrb1 implements xae1 {
    public final TextView a;
    public final int b;

    public wrb1(TextView textView, int i) {
        this.a = textView;
        this.b = i;
    }

    public final int a(String str) {
        TextView textView = this.a;
        Layout.Alignment alignment = textView.getLayout() != null ? textView.getLayout().getAlignment() : Layout.Alignment.ALIGN_NORMAL;
        alignment.getClass();
        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(str, 0, str.length(), textView.getPaint(), this.b).setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
        if (Build.VERSION.SDK_INT >= 26) {
            hyphenationFrequency.setJustificationMode(textView.getJustificationMode());
        }
        return hyphenationFrequency.build().getLineCount();
    }
}
