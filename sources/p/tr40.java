package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tr40 implements y2i1 {
    public static final tr40 b = new tr40();

    @Override // p.y2i1
    public final boolean a(String str) {
        return str.length() > 0;
    }

    @Override // p.y2i1
    public final boolean b(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '?' || cCharAt == '#') {
                return false;
            }
        }
        return true;
    }
}
