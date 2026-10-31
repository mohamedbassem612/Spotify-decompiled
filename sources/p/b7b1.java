package p;

import com.spotify.common.uri.SpotifyUriParserException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class b7b1 implements CharSequence {
    public final byte[] a;
    public final byte[] b;
    public final a7b1 c;

    public b7b1(String str, a7b1 a7b1Var) {
        byte[] bytes = str.getBytes(StandardCharsets.US_ASCII);
        this.a = bytes;
        this.c = a7b1Var;
        this.b = new byte[bytes.length];
    }

    public static int a(byte b) {
        if (b >= 48 && b <= 57) {
            return b - 48;
        }
        if (b >= 65 && b <= 70) {
            return b - 55;
        }
        if (b < 97 || b > 102) {
            return -1;
        }
        return b - 87;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        throw new UnsupportedOperationException("Unsupported operation");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b7b1.class != obj.getClass()) {
            return false;
        }
        return Objects.deepEquals(this.a, ((b7b1) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.a.length;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.common.uri.SpotifyUriParserException */
    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) throws SpotifyUriParserException {
        e7b1 e7b1Var = this.c.a;
        int i3 = 0;
        while (true) {
            byte[] bArr = this.b;
            if (i >= i2) {
                return new String(bArr, 0, i3, StandardCharsets.UTF_8);
            }
            int i4 = i + 1;
            byte[] bArr2 = this.a;
            byte b = bArr2[i];
            if (b >= 65) {
                i = i4;
            } else {
                if (b == 43) {
                    b = 32;
                } else if (b == 37) {
                    int i5 = i + 3;
                    if (i5 > i2) {
                        throw e7b1Var.c("Badly encoded character in Spotify uri");
                    }
                    int iA = a(bArr2[i4]);
                    int iA2 = a(bArr2[i + 2]);
                    if (iA < 0 || iA2 < 0) {
                        throw e7b1Var.c("Bad hex character in Spotify uri");
                    }
                    b = (byte) ((iA * 16) + iA2);
                    i = i5;
                }
                i = i4;
            }
            bArr[i3] = b;
            i3++;
        }
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return ((String) subSequence(0, this.a.length)).toString();
    }
}
