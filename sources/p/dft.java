package p;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dft implements c4v0 {
    public static final Pattern a = Pattern.compile("(\\s*\\n\\s*){3,}");

    @Override // p.c4v0
    public final CharSequence a(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        Matcher matcher = a.matcher(charSequence);
        ArrayList<cft> arrayList = new ArrayList();
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            arrayList.add(new cft(iStart, iEnd, iEnd - iStart));
        }
        int i = 0;
        for (cft cftVar : arrayList) {
            int i2 = cftVar.a - i;
            spannableStringBuilder.delete(i2, cftVar.b - i);
            spannableStringBuilder.insert(i2, (CharSequence) "\n\n");
            i += cftVar.c - 2;
        }
        return ihc1.e1(spannableStringBuilder);
    }
}
