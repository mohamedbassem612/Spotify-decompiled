package p;

import androidx.media3.common.ParserException;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class j89 {
    public int a;
    public int b;
    public int c;
    public int d;
    public String e;

    public j89(int i, int i2, int i3, int i4, String str) {
        this.a = i;
        this.e = str;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static String a(int i, int i2, int i3, boolean z) {
        StringBuilder sbR = cy30.r(i, "av01.", ".");
        Object[] objArr = {Integer.valueOf(i2)};
        String str = zoi1.a;
        Locale locale = Locale.US;
        sbR.append(String.format(locale, "%02d", objArr));
        sbR.append(z ? "H" : "M");
        sbR.append(".");
        sbR.append(String.format(locale, "%02d", Integer.valueOf(i3)));
        return sbR.toString();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public static j89 b(byte[] bArr) throws ParserException {
        try {
            bae baeVar = new bae(bArr, bArr.length);
            baeVar.n();
            int iG = baeVar.g(7);
            if (iG != 1) {
                oon1.H("Unsupported av1C version: " + iG);
                return null;
            }
            int iG2 = baeVar.g(3);
            int iG3 = baeVar.g(5);
            boolean zF = baeVar.f();
            int i = baeVar.f() ? baeVar.f() ? 12 : 10 : 8;
            baeVar.o(13);
            String strA = a(iG2, iG3, i, zF);
            if (baeVar.b() <= 0) {
                return new j89(i, strA);
            }
            baeVar.n();
            int iG4 = baeVar.g(4);
            if (iG4 != 1) {
                oon1.A("Unsupported obu_type: " + iG4);
                return new j89(i, strA);
            }
            if (baeVar.f()) {
                oon1.A("Unsupported obu_extension_flag");
                return new j89(i, strA);
            }
            boolean zF2 = baeVar.f();
            baeVar.n();
            if (zF2 && baeVar.g(8) > 127) {
                oon1.A("Excessive obu_size");
                return new j89(i, strA);
            }
            int iG5 = baeVar.g(3);
            baeVar.n();
            if (baeVar.f()) {
                oon1.A("Unsupported reduced_still_picture_header");
                return new j89(i, strA);
            }
            if (baeVar.f()) {
                oon1.A("Unsupported timing_info_present_flag");
                return new j89(i, strA);
            }
            if (baeVar.f()) {
                oon1.A("Unsupported initial_display_delay_present_flag");
                return new j89(i, strA);
            }
            int iG6 = baeVar.g(5);
            boolean z = false;
            for (int i2 = 0; i2 <= iG6; i2++) {
                baeVar.o(12);
                if (baeVar.g(5) > 7) {
                    baeVar.n();
                }
            }
            int iG7 = baeVar.g(4);
            int iG8 = baeVar.g(4);
            baeVar.o(iG7 + 1);
            baeVar.o(iG8 + 1);
            if (baeVar.f()) {
                baeVar.o(7);
            }
            baeVar.o(7);
            boolean zF3 = baeVar.f();
            if (zF3) {
                baeVar.o(2);
            }
            if ((baeVar.f() ? 2 : baeVar.g(1)) > 0 && !baeVar.f()) {
                baeVar.o(1);
            }
            if (zF3) {
                baeVar.o(3);
            }
            baeVar.o(3);
            boolean zF4 = baeVar.f();
            if (iG5 == 2 && zF4) {
                baeVar.n();
            }
            if (iG5 != 1 && baeVar.f()) {
                z = true;
            }
            if (!baeVar.f()) {
                return new j89(i, strA);
            }
            int iG9 = baeVar.g(8);
            int iG10 = baeVar.g(8);
            return new j89(i, x8h.i(iG9), ((z || iG9 != 1 || iG10 != 13 || baeVar.g(8) != 0) ? baeVar.g(1) : 1) == 1 ? 1 : 2, x8h.j(iG10), strA);
        } catch (RuntimeException e) {
            throw ParserException.a(e, "Error parsing AV1 config");
        }
    }

    public j89(int i, String str) {
        this(i, -1, -1, -1, str);
    }

    public j89() {
        this.c = 0;
        this.d = 3;
    }
}
