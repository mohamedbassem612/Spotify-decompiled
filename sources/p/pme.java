package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pme extends xme {
    public final char[] a;

    public pme(String str) {
        char[] charArray = str.toString().toCharArray();
        this.a = charArray;
        Arrays.sort(charArray);
    }

    @Override // p.omv0
    public final boolean apply(Object obj) {
        return d(((Character) obj).charValue());
    }

    @Override // p.xme
    public final boolean d(char c) {
        return Arrays.binarySearch(this.a, c) >= 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
        for (char c : this.a) {
            sb.append(xme.g(c));
        }
        sb.append("\")");
        return sb.toString();
    }
}
