package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class e8h1 {
    public static final ltf1 a = new ltf1("background");
    public static final ltf1 b = new ltf1("unknown");
    public static final ltf1 c = new ltf1("page-metadata-missing");

    public static ltf1 a() {
        return a;
    }

    public static ltf1 b() {
        return b;
    }

    public static String c(String str) {
        if (str == null || str.equals(((u8h1) b.b).a.a) || str.equals(((u8h1) c.b).a.a)) {
            return null;
        }
        return str;
    }
}
