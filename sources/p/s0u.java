package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class s0u {
    public static char b = '?';
    public static String c = "0000";
    public static String d;
    public static String e;
    public static final s0u a = new s0u();
    public static volatile String f = b();

    public static char a(int i) {
        if (i < 0 || i >= 8) {
            return '0';
        }
        return (char) (i + 48);
    }

    public static String b() {
        StringBuilder sb = new StringBuilder();
        sb.append(b);
        sb.append(c);
        String str = d;
        if (str != null) {
            sb.append('t');
            sb.append(str);
        }
        String str2 = e;
        if (str2 != null) {
            sb.append('o');
            sb.append(str2);
        }
        return sb.toString();
    }

    public final synchronized void c(int i, int i2, int i3, int i4) {
        StringBuilder sb = new StringBuilder(4);
        sb.append(a(i));
        sb.append(a(i2));
        sb.append(a(i3));
        sb.append(a(i4));
        c = sb.toString();
        f = b();
    }
}
