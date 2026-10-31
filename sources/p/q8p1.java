package p;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class q8p1 {
    public static final l8p1 c = new l8p1("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
    public static final l8p1 d = new l8p1("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
    public final h8p1 a;
    public final Character b;

    static {
        new q8p1("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new q8p1("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        int i = j8p1.a;
        h8p1 h8p1Var = new h8p1("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'});
        new q8p1(h8p1Var, (Character) null);
        char[] cArr = h8p1Var.b;
        char[] cArr2 = new char[512];
        if (!(cArr.length == 16)) {
            bhn0.q();
            return;
        }
        for (int i2 = 0; i2 < 256; i2++) {
            cArr2[i2] = cArr[i2 >>> 4];
            cArr2[i2 | 256] = cArr[i2 & 15];
        }
    }

    public q8p1(h8p1 h8p1Var, Character ch) {
        this.a = h8p1Var;
        if (ch == null || h8p1Var.g[61] == -1) {
            this.b = ch;
        } else {
            hhg1.n(jmo1.t("Padding character %s was already in alphabet", ch));
            throw null;
        }
    }

    public void a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        ulo1.y(0, i, bArr.length);
        while (i2 < i) {
            int i3 = this.a.f;
            b(i2, Math.min(i3, i - i2), sb, bArr);
            i2 += i3;
        }
    }

    public final void b(int i, int i2, StringBuilder sb, byte[] bArr) {
        ulo1.y(i, i + i2, bArr.length);
        h8p1 h8p1Var = this.a;
        int i3 = h8p1Var.f;
        if (i2 > i3) {
            bhn0.q();
            return;
        }
        int i4 = 0;
        long j = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            j = (j | ((long) (bArr[i + i5] & 255))) << 8;
        }
        int i6 = (i2 + 1) * 8;
        int i7 = h8p1Var.d;
        while (i4 < i2 * 8) {
            sb.append(h8p1Var.b[h8p1Var.c & ((int) (j >>> ((i6 - i7) - i4)))]);
            i4 += i7;
        }
        if (this.b != null) {
            while (i4 < i3 * 8) {
                sb.append('=');
                i4 += i7;
            }
        }
    }

    public final CharSequence c(CharSequence charSequence) {
        if (this.b == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final String d(byte[] bArr, int i) {
        ulo1.y(0, i, bArr.length);
        h8p1 h8p1Var = this.a;
        int i2 = h8p1Var.f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(h8p1Var.e * hno1.r(i, i2));
        try {
            a(sb, bArr, i);
            return sb.toString();
        } catch (IOException e) {
            eg.f(e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q8p1) {
            q8p1 q8p1Var = (q8p1) obj;
            if (this.a.equals(q8p1Var.a) && Objects.equals(this.b, q8p1Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.b) ^ this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        h8p1 h8p1Var = this.a;
        sb.append(h8p1Var);
        if (8 % h8p1Var.d != 0) {
            Character ch = this.b;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public q8p1(String str, String str2) {
        this(new h8p1(str, str2.toCharArray()), (Character) '=');
    }
}
