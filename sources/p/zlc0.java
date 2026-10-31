package p;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zlc0 {
    public final dg30 a;

    public zlc0(dg30 dg30Var) {
        this.a = dg30Var;
    }

    public final SpannableString a(String str, Function0 function0) {
        Matcher matcher = Pattern.compile("<mark>(.*?)</mark>").matcher(str);
        if (!matcher.find()) {
            return new SpannableString(str);
        }
        String strGroup = matcher.group(1);
        if (strGroup == null) {
            strGroup = "";
        }
        String strGroup2 = matcher.group(0);
        String strW = nhc1.W(str, strGroup2 != null ? strGroup2 : "", strGroup);
        SpannableString spannableString = new SpannableString(strW);
        int iW0 = ihc1.w0(strW, strGroup, 0, false, 6);
        spannableString.setSpan(new sjc0((byte) 1, this, function0), iW0, strGroup.length() + iW0, 33);
        spannableString.setSpan(new ForegroundColorSpan(this.a.getColor(2131104053)), iW0, strGroup.length() + iW0, 33);
        return spannableString;
    }
}
