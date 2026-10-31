package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bg extends yf {
    public static bg c;

    @Override // p.yf
    public final int[] f(int i) {
        int length = m().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && m().charAt(i) == '\n' && (m().charAt(i) == '\n' || (i != 0 && m().charAt(i - 1) != '\n'))) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !v(i2)) {
            i2++;
        }
        return l(i, i2);
    }

    @Override // p.yf
    public final int[] r(int i) {
        int length = m().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && m().charAt(i - 1) == '\n' && !v(i)) {
            i--;
        }
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        while (i2 > 0 && (m().charAt(i2) == '\n' || (i2 != 0 && m().charAt(i2 - 1) != '\n'))) {
            i2--;
        }
        return l(i2, i);
    }

    public final boolean v(int i) {
        if (i <= 0 || m().charAt(i - 1) == '\n') {
            return false;
        }
        return i == m().length() || m().charAt(i) == '\n';
    }
}
