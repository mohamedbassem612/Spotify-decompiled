package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sjn0 implements dk80 {
    public final void i(h4e1 h4e1Var) {
        yzr0 yzr0Var = h4e1Var.c;
        String string = yzr0Var.toString();
        int iCharCount = 0;
        if (string.codePointCount(0, string.length()) > 20) {
            for (int i = 0; iCharCount < string.length() && i < 20; i++) {
                iCharCount += Character.charCount(string.codePointAt(iCharCount));
            }
            h4e1Var.k(iCharCount, yzr0Var.length(), "");
        }
    }
}
