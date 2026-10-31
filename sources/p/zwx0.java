package p;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class zwx0 {
    static {
        Pattern.compile("<br\\s*/?>", nbc.c(ywx0.i(1)));
    }

    public static final String a(String str) {
        return nhc1.W(nhc1.W(nhc1.W(nhc1.W(nhc1.W(nhc1.W(str, "&lt;", "<"), "&gt;", ">"), "&quot;", "\""), "&apos;", "'"), "&#39;", "'"), "&amp;", "&");
    }
}
