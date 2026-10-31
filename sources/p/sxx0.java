package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class sxx0 {
    public static final se11 a = new se11("<b\\s([^>]*data-field=\"[^\"]*\"[^>]*)>(.*?)</b>");
    public static final se11 b = new se11("data-([\\w-]+)=\"([^\"]*)");

    public static final String a(String str) {
        return nhc1.W(nhc1.W(nhc1.W(nhc1.W(nhc1.W(str, "&amp;", "&"), "&lt;", "<"), "&gt;", ">"), "&quot;", "\""), "&apos;", "'");
    }
}
