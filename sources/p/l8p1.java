package p;

import com.google.android.recaptcha.internal.zzsg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class l8p1 extends q8p1 {
    public l8p1(String str, String str2) {
        h8p1 h8p1Var = new h8p1(str, str2.toCharArray());
        super(h8p1Var, (Character) '=');
        if (h8p1Var.b.length == 64) {
            return;
        }
        bhn0.q();
        throw null;
    }

    @Override // p.q8p1
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        ulo1.y(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16) | (bArr[i2 + 2] & 255);
            char[] cArr = this.a.b;
            sb.append(cArr[i4 >>> 18]);
            sb.append(cArr[(i4 >>> 12) & 63]);
            sb.append(cArr[(i4 >>> 6) & 63]);
            sb.append(cArr[i4 & 63]);
            i2 += 3;
        }
        if (i2 < i) {
            b(i2, i - i2, sb, bArr);
        }
    }

    public final int e(byte[] bArr, CharSequence charSequence) throws zzsg {
        CharSequence charSequenceC = c(charSequence);
        int length = charSequenceC.length();
        h8p1 h8p1Var = this.a;
        if (!h8p1Var.h[length % h8p1Var.e]) {
            int length2 = charSequenceC.length();
            throw new zzsg(gvg.l(new StringBuilder(String.valueOf(length2).length() + 21), "Invalid input length ", length2));
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequenceC.length()) {
            int i3 = i2 + 1;
            int iA = (h8p1Var.a(charSequenceC.charAt(i + 1)) << 12) | (h8p1Var.a(charSequenceC.charAt(i)) << 18);
            bArr[i2] = (byte) (iA >>> 16);
            int i4 = i + 2;
            if (i4 < charSequenceC.length()) {
                int i5 = i + 3;
                int iA2 = iA | (h8p1Var.a(charSequenceC.charAt(i4)) << 6);
                int i6 = i2 + 2;
                bArr[i3] = (byte) ((iA2 >>> 8) & 255);
                if (i5 < charSequenceC.length()) {
                    i += 4;
                    i2 += 3;
                    bArr[i6] = (byte) ((iA2 | h8p1Var.a(charSequenceC.charAt(i5))) & 255);
                } else {
                    i2 = i6;
                    i = i5;
                }
            } else {
                i = i4;
                i2 = i3;
            }
        }
        return i2;
    }
}
