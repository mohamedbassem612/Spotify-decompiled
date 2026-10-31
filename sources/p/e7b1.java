package p;

import com.spotify.common.uri.SpotifyUriParserException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class e7b1 {
    public static final String[] f = {"http://spotify.com/", "https://spotify.com/", "http://open.spotify.com/", "https://open.spotify.com/"};
    public final String a;
    public final boolean b;
    public final CharSequence c;
    public final String d;
    public int e;

    public e7b1(String str, boolean z) {
        int length;
        this.b = !z;
        int iIndexOf = str.indexOf("?");
        int i = 0;
        String strSubstring = iIndexOf == -1 ? str : str.substring(0, iIndexOf);
        this.a = strSubstring;
        this.d = iIndexOf == -1 ? null : str.substring(iIndexOf);
        if (strSubstring.startsWith("spotify:")) {
            length = 8;
            if (strSubstring.startsWith("//", 8)) {
                length = 10;
            }
        } else if (strSubstring.startsWith("https://www.spotify.com/")) {
            length = 24;
        } else {
            while (true) {
                if (i >= 4) {
                    throw c("Spotify uri doesn't start with a proper prefix");
                }
                String str2 = f[i];
                if (strSubstring.startsWith(str2)) {
                    length = str2.length();
                    break;
                }
                i++;
            }
        }
        this.e = length;
        String b7b1Var = this.a;
        while (length < b7b1Var.length()) {
            char cCharAt = b7b1Var.charAt(length);
            if (cCharAt == '%' || cCharAt == '+') {
                while (length < b7b1Var.length()) {
                    f(b7b1Var.charAt(length), length);
                    length++;
                }
                b7b1Var = new b7b1(b7b1Var, new a7b1(this));
                break;
            }
            f(b7b1Var.charAt(length), length);
            length++;
        }
        this.c = b7b1Var;
    }

    public final boolean a() {
        return this.e >= this.c.length();
    }

    public final String b() {
        if (a()) {
            throw c("End of Spotify uri reached unexpectedly");
        }
        int i = this.e;
        String str = this.a;
        int iIndexOf = str.indexOf(58, i);
        if (iIndexOf == -1) {
            iIndexOf = str.indexOf(47, this.e);
        }
        CharSequence charSequence = this.c;
        if (iIndexOf == -1) {
            iIndexOf = charSequence.length();
        }
        int iMin = Math.min(iIndexOf, charSequence.length());
        this.e = Math.min(charSequence.length(), iMin + 1);
        return charSequence.subSequence(i, iMin).toString();
    }

    public final SpotifyUriParserException c(String str) {
        return new SpotifyUriParserException(xcg1.i(str, ": ", this.a), this.b);
    }

    public final String d() {
        if (a()) {
            throw c("End of Spotify uri reached unexpectedly");
        }
        int i = this.e;
        CharSequence charSequence = this.c;
        return charSequence.subSequence(i, charSequence.length()).toString();
    }

    public final String e() {
        if (a()) {
            throw c("End of Spotify uri reached unexpectedly");
        }
        int i = this.e;
        CharSequence charSequence = this.c;
        this.e = charSequence.length();
        return charSequence.subSequence(i, charSequence.length()).toString();
    }

    public final void f(int i, int i2) {
        if (i < 33 || i > 126) {
            throw c(i == 32 ? "Spotify uri contained space" : f4i1.c(i2, "Spotify uri contained non-ASCII characters at position "));
        }
    }
}
