package p;

import com.google.common.io.BaseEncoding$DecodingException;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class qaa extends raa {
    public final naa c;
    public final Character d;
    public volatile raa e;

    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    public qaa(naa naaVar, Character ch) {
        boolean z;
        naaVar.getClass();
        this.c = naaVar;
        if (ch != null) {
            char cCharValue = ch.charValue();
            byte[] bArr = naaVar.g;
            if (cCharValue >= bArr.length || bArr[cCharValue] == -1) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        dm5.o(z, "Padding character %s was already in alphabet", ch);
        this.d = ch;
    }

    @Override // p.raa
    public int b(byte[] bArr, CharSequence charSequence) throws BaseEncoding$DecodingException {
        CharSequence charSequenceE = e(charSequence);
        int length = charSequenceE.length();
        naa naaVar = this.c;
        boolean[] zArr = naaVar.h;
        int i = naaVar.d;
        int i2 = naaVar.e;
        if (!zArr[length % i2]) {
            throw new BaseEncoding$DecodingException("Invalid input length " + charSequenceE.length());
        }
        int i3 = 0;
        for (int i4 = 0; i4 < charSequenceE.length(); i4 += i2) {
            long jA = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                jA <<= i;
                if (i4 + i6 < charSequenceE.length()) {
                    jA |= (long) naaVar.a(charSequenceE.charAt(i5 + i4));
                    i5++;
                }
            }
            int i7 = naaVar.f;
            int i8 = (i7 * 8) - (i5 * i);
            int i9 = (i7 - 1) * 8;
            while (i9 >= i8) {
                bArr[i3] = (byte) ((jA >>> i9) & 255);
                i9 -= 8;
                i3++;
            }
        }
        return i3;
    }

    @Override // p.raa
    public void d(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        dm5.v(0, i, bArr.length);
        while (i2 < i) {
            naa naaVar = this.c;
            f(i2, Math.min(naaVar.f, i - i2), sb, bArr);
            i2 += naaVar.f;
        }
    }

    @Override // p.raa
    public final CharSequence e(CharSequence charSequence) {
        charSequence.getClass();
        Character ch = this.d;
        if (ch == null) {
            return charSequence;
        }
        char cCharValue = ch.charValue();
        int length = charSequence.length() - 1;
        while (length >= 0 && charSequence.charAt(length) == cCharValue) {
            length--;
        }
        return charSequence.subSequence(0, length + 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qaa) {
            qaa qaaVar = (qaa) obj;
            if (this.c.equals(qaaVar.c) && Objects.equals(this.d, qaaVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final void f(int i, int i2, StringBuilder sb, byte[] bArr) {
        dm5.v(i, i + i2, bArr.length);
        naa naaVar = this.c;
        int i3 = naaVar.f;
        int i4 = naaVar.d;
        int i5 = 0;
        dm5.m(i2 <= i3);
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | ((long) (bArr[i + i6] & 255))) << 8;
        }
        int i7 = ((i2 + 1) * 8) - i4;
        while (i5 < i2 * 8) {
            sb.append(naaVar.b[((int) (j >>> (i7 - i5))) & naaVar.c]);
            i5 += i4;
        }
        Character ch = this.d;
        if (ch != null) {
            while (i5 < naaVar.f * 8) {
                sb.append(ch.charValue());
                i5 += i4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00b5 A[EDGE_INSN: B:46:0x00b5->B:48:0x00bb BREAK  A[LOOP:0: B:5:0x000b->B:47:0x00b7]] */
    public final raa g() {
        boolean z;
        raa raaVarH = this.e;
        if (raaVarH == null) {
            naa naaVar = this.c;
            char[] cArr = naaVar.b;
            for (char c : cArr) {
                if (eth.G(c)) {
                    int length = cArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            z = false;
                            break;
                        }
                        char c2 = cArr[i];
                        if (c2 >= 'a' && c2 <= 'z') {
                            z = true;
                            break;
                        }
                        i++;
                    }
                    dm5.z(!z, "Cannot call lowerCase() on a mixed-case alphabet");
                    char[] cArr2 = new char[cArr.length];
                    for (int i2 = 0; i2 < cArr.length; i2++) {
                        char c3 = cArr[i2];
                        if (eth.G(c3)) {
                            c3 = (char) (c3 ^ ' ');
                        }
                        cArr2[i2] = c3;
                    }
                    naa naaVar2 = new naa(l1d.n(naaVar.a, ".lowerCase()", new StringBuilder()), cArr2);
                    if (!naaVar.i) {
                        naaVar = naaVar2;
                        break;
                    }
                    byte[] bArr = naaVar2.g;
                    if (!naaVar2.i) {
                        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                        for (int i3 = 65; i3 <= 90; i3++) {
                            int i4 = i3 | 32;
                            byte b = bArr[i3];
                            byte b2 = bArr[i4];
                            if (b == -1) {
                                bArrCopyOf[i3] = b2;
                            } else {
                                char c4 = (char) i3;
                                char c5 = (char) i4;
                                if (!(b2 == -1)) {
                                    eg.m(m5n1.L("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c4), Character.valueOf(c5)));
                                    return null;
                                }
                                bArrCopyOf[i4] = b;
                            }
                        }
                        naaVar = new naa(l1d.n(naaVar2.a, ".ignoreCase()", new StringBuilder()), naaVar2.b, bArrCopyOf, true);
                        break;
                    }
                    naaVar = naaVar2;
                    break;
                }
            }
            raaVarH = naaVar == this.c ? this : h(naaVar, this.d);
            this.e = raaVarH;
        }
        return raaVarH;
    }

    public raa h(naa naaVar, Character ch) {
        return new qaa(naaVar, ch);
    }

    public final int hashCode() {
        return Objects.hashCode(this.d) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        naa naaVar = this.c;
        sb.append(naaVar);
        if (8 % naaVar.d != 0) {
            Character ch = this.d;
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

    public qaa(String str, String str2) {
        this(new naa(str, str2.toCharArray()), (Character) '=');
    }
}
