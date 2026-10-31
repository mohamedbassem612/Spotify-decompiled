package p;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class eft implements c4v0 {
    public final CharSequence a(CharSequence charSequence) {
        return Pattern.compile("(\\s*<br>\\s*)+").matcher(ihc1.e1(charSequence)).replaceAll("<br>");
    }
}
