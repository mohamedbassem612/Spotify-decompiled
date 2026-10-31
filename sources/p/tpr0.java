package p;

import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tpr0 extends fho1 {
    public final Method d;
    public final int e;
    public final String f;
    public final boolean g;

    public tpr0(Method method, int i, String str, boolean z) {
        this.d = method;
        this.e = i;
        Objects.requireNonNull(str, "name == null");
        this.f = str;
        this.g = z;
    }

    public final void l(un21 un21Var, Object obj) {
        String strI;
        String str = this.f;
        if (obj == null) {
            throw m5n1.O(this.d, this.e, f4i1.f("Path parameter \"", str, "\" value must not be null."), new Object[0]);
        }
        String str2 = (String) rbc.b.g(obj);
        if (un21Var.c == null) {
            hhg1.c();
            return;
        }
        int length = str2.length();
        int iCharCount = 0;
        while (true) {
            if (iCharCount >= length) {
                strI = str2;
                break;
            }
            int iCodePointAt = str2.codePointAt(iCharCount);
            boolean z = this.g;
            int i = 47;
            int i2 = -1;
            int i3 = 127;
            int i4 = 32;
            if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z && (iCodePointAt == 47 || iCodePointAt == 37))) {
                nac nacVar = new nac();
                nacVar.X(0, iCharCount, str2);
                nac nacVar2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str2.codePointAt(iCharCount);
                    if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 < i4 || iCodePointAt2 >= i3 || " \"<>^`{}|\\?#".indexOf(iCodePointAt2) != i2 || (!z && (iCodePointAt2 == i || iCodePointAt2 == 37))) {
                            if (nacVar2 == null) {
                                nacVar2 = new nac();
                            }
                            nacVar2.Z(iCodePointAt2);
                            long j = nacVar2.b;
                            long j2 = 0;
                            while (j2 < j) {
                                byte bG = nacVar2.g(j2);
                                nacVar.R(37);
                                char[] cArr = un21.l;
                                nacVar.R(cArr[((bG & 255) >> 4) & 15]);
                                nacVar.R(cArr[bG & 15]);
                                j2++;
                                nacVar2 = nacVar2;
                            }
                            nacVar2.a();
                        } else {
                            nacVar.Z(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i = 47;
                    i2 = -1;
                    i3 = 127;
                    i4 = 32;
                }
                strI = nacVar.I();
                break;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strReplace = un21Var.c.replace("{" + str + "}", strI);
        if (un21.m.matcher(strReplace).matches()) {
            hhg1.n("@Path parameters shouldn't perform path traversal ('.' or '..'): ".concat(str2));
        } else {
            un21Var.c = strReplace;
        }
    }
}
