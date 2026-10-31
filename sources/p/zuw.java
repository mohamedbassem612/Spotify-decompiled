package p;

import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zuw {
    public static final Pattern e = Pattern.compile(" ");
    public final TextView a;
    public final String b;
    public final String c;
    public final xap d;

    public zuw(TextView textView, String str, xap xapVar) {
        this.a = textView;
        this.b = str;
        this.c = l1d.m("… ", e.matcher(str).replaceAll(" "));
        this.d = xapVar;
    }

    public final StaticLayout a(SpannableStringBuilder spannableStringBuilder) {
        TextView textView = this.a;
        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(spannableStringBuilder, 0, spannableStringBuilder.length(), textView.getPaint(), (textView.getWidth() - textView.getPaddingLeft()) - textView.getPaddingRight()).setAlignment(textView.getLayout() != null ? textView.getLayout().getAlignment() : Layout.Alignment.ALIGN_NORMAL).setTextDirection(TextDirectionHeuristics.ANYRTL_LTR).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
        if (Build.VERSION.SDK_INT >= 26) {
            hyphenationFrequency.setJustificationMode(textView.getJustificationMode());
        }
        return hyphenationFrequency.build();
    }
}
