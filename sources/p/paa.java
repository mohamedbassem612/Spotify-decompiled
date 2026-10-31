package p;

import com.google.common.io.BaseEncoding$DecodingException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class paa extends qaa {
    public paa(String str, String str2) {
        this(new naa(str, str2.toCharArray()), (Character) '=');
    }

    @Override // p.qaa, p.raa
    public final int b(byte[] bArr, CharSequence charSequence) throws BaseEncoding$DecodingException {
        CharSequence charSequenceE = e(charSequence);
        int length = charSequenceE.length();
        naa naaVar = this.c;
        if (!naaVar.h[length % naaVar.e]) {
            throw new BaseEncoding$DecodingException("Invalid input length " + charSequenceE.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequenceE.length()) {
            int i3 = i + 2;
            int iA = (naaVar.a(charSequenceE.charAt(i + 1)) << 12) | (naaVar.a(charSequenceE.charAt(i)) << 18);
            int i4 = i2 + 1;
            bArr[i2] = (byte) (iA >>> 16);
            if (i3 < charSequenceE.length()) {
                int i5 = i + 3;
                int iA2 = iA | (naaVar.a(charSequenceE.charAt(i3)) << 6);
                int i6 = i2 + 2;
                bArr[i4] = (byte) ((iA2 >>> 8) & 255);
                if (i5 < charSequenceE.length()) {
                    i += 4;
                    i2 += 3;
                    bArr[i6] = (byte) ((iA2 | naaVar.a(charSequenceE.charAt(i5))) & 255);
                } else {
                    i2 = i6;
                    i = i5;
                }
            } else {
                i2 = i4;
                i = i3;
            }
        }
        return i2;
    }

    @Override // p.qaa, p.raa
    public final void d(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        dm5.v(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = i2 + 2;
            int i5 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16);
            i2 += 3;
            int i6 = i5 | (bArr[i4] & 255);
            naa naaVar = this.c;
            char[] cArr = naaVar.b;
            char[] cArr2 = naaVar.b;
            sb.append(cArr[i6 >>> 18]);
            sb.append(cArr2[(i6 >>> 12) & 63]);
            sb.append(cArr2[(i6 >>> 6) & 63]);
            sb.append(cArr2[i6 & 63]);
        }
        if (i2 < i) {
            f(i2, i - i2, sb, bArr);
        }
    }

    @Override // p.qaa
    public final raa h(naa naaVar, Character ch) {
        return new paa(naaVar, ch);
    }

    public paa(naa naaVar, Character ch) {
        super(naaVar, ch);
        dm5.m(naaVar.b.length == 64);
    }
}
