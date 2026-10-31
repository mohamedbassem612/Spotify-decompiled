package p;

import com.google.common.io.BaseEncoding$DecodingException;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class oaa extends qaa {
    public final char[] f;

    public oaa(naa naaVar) {
        super(naaVar, (Character) null);
        this.f = new char[NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS];
        char[] cArr = naaVar.b;
        dm5.m(cArr.length == 16);
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.f;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | 256] = cArr[i & 15];
        }
    }

    @Override // p.qaa, p.raa
    public final int b(byte[] bArr, CharSequence charSequence) throws BaseEncoding$DecodingException {
        if (charSequence.length() % 2 == 1) {
            throw new BaseEncoding$DecodingException("Invalid input length " + charSequence.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            naa naaVar = this.c;
            bArr[i2] = (byte) ((naaVar.a(cCharAt) << 4) | naaVar.a(charSequence.charAt(i + 1)));
            i += 2;
            i2++;
        }
        return i2;
    }

    @Override // p.qaa, p.raa
    public final void d(StringBuilder sb, byte[] bArr, int i) {
        dm5.v(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.f;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | 256]);
        }
    }

    @Override // p.qaa
    public final raa h(naa naaVar, Character ch) {
        return new oaa(naaVar);
    }
}
