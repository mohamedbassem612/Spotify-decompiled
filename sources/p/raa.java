package p;

import com.google.common.io.BaseEncoding$DecodingException;
import java.io.IOException;
import java.math.RoundingMode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class raa {
    public static final paa a = new paa("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
    public static final oaa b;

    static {
        new paa("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new qaa("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new qaa("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        b = new oaa(new naa("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}));
    }

    public final byte[] a(String str) {
        try {
            CharSequence charSequenceE = e(str);
            int length = (int) (((((long) ((qaa) this).c.d) * ((long) charSequenceE.length())) + 7) / 8);
            byte[] bArr = new byte[length];
            int iB = b(bArr, charSequenceE);
            if (iB == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[iB];
            System.arraycopy(bArr, 0, bArr2, 0, iB);
            return bArr2;
        } catch (BaseEncoding$DecodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract int b(byte[] bArr, CharSequence charSequence);

    public final String c(byte[] bArr, int i) {
        dm5.v(0, i, bArr.length);
        naa naaVar = ((qaa) this).c;
        int i2 = naaVar.e;
        int i3 = naaVar.f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(eth.o(i, i3) * i2);
        try {
            d(sb, bArr, i);
            return sb.toString();
        } catch (IOException e) {
            eg.f(e);
            return null;
        }
    }

    public abstract void d(StringBuilder sb, byte[] bArr, int i);

    public abstract CharSequence e(CharSequence charSequence);
}
