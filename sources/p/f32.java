package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f32 implements i650 {
    public final /* synthetic */ byte a;

    public static Integer b(String str, int i, boolean z) {
        if (i >= str.length()) {
            return null;
        }
        char cCharAt = str.charAt(i);
        if (cCharAt != 'G' && (!z || cCharAt != 'T')) {
            return null;
        }
        int i2 = i + 1;
        int i3 = i2;
        while (i3 < str.length() && Character.isDigit(str.charAt(i3))) {
            i3++;
        }
        if (i3 == i2) {
            return null;
        }
        while (i3 < str.length() && Character.isLowerCase(str.charAt(i3))) {
            i3++;
        }
        return Integer.valueOf(i3);
    }

    public static y26 c(int i, String str) {
        int i2 = i + 11;
        Integer numB = b(str, i2, false);
        if (numB == null) {
            return null;
        }
        int iIntValue = numB.intValue();
        if (iIntValue >= str.length() || str.charAt(iIntValue) != '-') {
            return new y26("Immortalis-".concat(str.substring(i2, iIntValue)), iIntValue);
        }
        return null;
    }

    public static y26 d(int i, String str) {
        int i2 = i + 5;
        Integer numB = b(str, i2, true);
        if (numB == null) {
            return null;
        }
        int iIntValue = numB.intValue();
        String strSubstring = str.substring(i2, iIntValue);
        if (str.startsWith("-Immortalis", iIntValue)) {
            return new y26("Immortalis-".concat(strSubstring), iIntValue + 11);
        }
        if (strSubstring.equals("G1") && str.startsWith("-Ultra", iIntValue)) {
            return new y26(f4i1.f("Mali-", strSubstring, " Ultra"), iIntValue + 6);
        }
        if (strSubstring.equals("G1") && str.startsWith(" Ultra", iIntValue)) {
            return new y26(f4i1.f("Mali-", strSubstring, " Ultra"), iIntValue + 6);
        }
        if (strSubstring.equals("G2") && str.startsWith("-Ultra-NX", iIntValue)) {
            return new y26(f4i1.f("Mali-", strSubstring, " Ultra NX"), iIntValue + 9);
        }
        if (strSubstring.equals("G2") && str.startsWith(" Ultra NX", iIntValue)) {
            return new y26(f4i1.f("Mali-", strSubstring, " Ultra NX"), iIntValue + 9);
        }
        if (iIntValue >= str.length() || str.charAt(iIntValue) != '-') {
            return new y26("Mali-".concat(strSubstring), iIntValue);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00c6 A[PHI: r1
      0x00c6: PHI (r1v5 java.lang.String) = (r1v4 java.lang.String), (r1v8 java.lang.String) binds: [B:43:0x00bb, B:46:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d1  */
    @Override // p.i650
    public final h650 a(Integer num, String str) {
        String strS;
        int length;
        Integer numC0;
        z26 z26Var;
        int iY;
        String strS2;
        byte b = this.a;
        g650 g650Var = g650.a;
        strK = null;
        String strK = null;
        switch (b) {
            case 0:
                int iW0 = ihc1.w0(str, "Adreno", 0, false, 6);
                Integer numValueOf = Integer.valueOf(iW0);
                if (iW0 < 0) {
                    numValueOf = null;
                }
                Integer numValueOf2 = numValueOf != null ? Integer.valueOf(numValueOf.intValue() + 6) : null;
                if (numValueOf2 == null) {
                    return g650Var;
                }
                int iY2 = w6d1.y(numValueOf2.intValue(), str);
                if (str.startsWith("(TM)", iY2)) {
                    iY2 = w6d1.y(iY2 + 4, str);
                }
                String strT = w6d1.t(iY2, str);
                if (strT == null) {
                    return g650Var;
                }
                for (int i = 0; i < strT.length(); i++) {
                    if (Character.isDigit(strT.charAt(i))) {
                        return new d650("Adreno ".concat(strT));
                    }
                }
                return g650Var;
            case 1:
                int iW1 = ihc1.w0(str, "Mali-", 0, false, 6);
                Integer numValueOf3 = Integer.valueOf(iW1);
                if (iW1 < 0) {
                    numValueOf3 = null;
                }
                int iW2 = ihc1.w0(str, "Immortalis-", 0, false, 6);
                Integer numValueOf4 = Integer.valueOf(iW2);
                if (iW2 < 0) {
                    numValueOf4 = null;
                }
                y26 y26VarD = numValueOf3 == null ? numValueOf4 != null ? c(numValueOf4.intValue(), str) : null : (numValueOf4 != null && numValueOf3.intValue() >= numValueOf4.intValue()) ? c(numValueOf4.intValue(), str) : d(numValueOf3.intValue(), str);
                if (y26VarD == null) {
                    return g650Var;
                }
                String str2 = y26VarD.a;
                int iY3 = w6d1.y(y26VarD.b, str);
                String str3 = "MC";
                if (str.startsWith("MC", iY3)) {
                    int length2 = str3.length() + iY3;
                    strS = w6d1.s(length2, str);
                    if (strS == null && (((length = strS.length() + length2) >= str.length() || !Character.isLetterOrDigit(str.charAt(length))) && (numC0 = nhc1.c0(strS)) != null)) {
                        z26Var = new z26(str3.concat(strS), numC0.intValue());
                    } else {
                        z26Var = null;
                    }
                } else {
                    str3 = "MP";
                    if (str.startsWith("MP", iY3)) {
                        int length3 = str3.length() + iY3;
                        strS = w6d1.s(length3, str);
                        if (strS == null) {
                            z26Var = null;
                        } else {
                            z26Var = new z26(str3.concat(strS), numC0.intValue());
                        }
                    } else {
                        z26Var = null;
                    }
                }
                if (z26Var != null) {
                    return new e650(f4i1.f(str2, " ", z26Var.a), l1d.k(z26Var.b, str2, "@"), str2);
                }
                if (num != null) {
                    if (num.intValue() <= 0) {
                        num = null;
                    }
                    if (num != null) {
                        strK = l1d.k(num.intValue(), str2, "@");
                    }
                }
                return strK != null ? new c650(strK, str2) : new f650(str2);
            default:
                int iW3 = ihc1.w0(str, "Xclipse", 0, false, 6);
                Integer numValueOf5 = Integer.valueOf(iW3);
                if (iW3 < 0) {
                    numValueOf5 = null;
                }
                Integer numValueOf6 = numValueOf5 != null ? Integer.valueOf(numValueOf5.intValue() + 7) : null;
                if (numValueOf6 == null || (strS2 = w6d1.s((iY = w6d1.y(numValueOf6.intValue(), str)), str)) == null) {
                    return g650Var;
                }
                int length4 = strS2.length() + iY;
                return (length4 >= str.length() || !Character.isLetterOrDigit(str.charAt(length4))) ? new d650("Xclipse ".concat(strS2)) : g650Var;
        }
    }
}
