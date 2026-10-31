package p;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ira {
    public static final String b;
    public static final String c;
    public static final ira d;
    public static final ira e;
    public final boolean a;

    static {
        svh0 svh0Var = a4e1.c;
        b = Character.toString((char) 8206);
        c = Character.toString((char) 8207);
        d = new ira(false);
        e = new ira(true);
    }

    public ira(boolean z) {
        svh0 svh0Var = a4e1.a;
        this.a = z;
    }

    public static int a(CharSequence charSequence) {
        byte directionality;
        hra hraVar = new hra(charSequence);
        hraVar.c = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = hraVar.c;
            if (i4 < hraVar.b && i == 0) {
                CharSequence charSequence2 = hraVar.a;
                char cCharAt = charSequence2.charAt(i4);
                hraVar.d = cCharAt;
                boolean zIsHighSurrogate = Character.isHighSurrogate(cCharAt);
                int i5 = hraVar.c;
                if (zIsHighSurrogate) {
                    int iCodePointAt = Character.codePointAt(charSequence2, i5);
                    hraVar.c = Character.charCount(iCodePointAt) + hraVar.c;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    hraVar.c = i5 + 1;
                    char c2 = hraVar.d;
                    directionality = c2 < 1792 ? hra.e[c2] : Character.getDirectionality(c2);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
        }
        if (i != 0) {
            if (i2 == 0) {
                while (hraVar.c > 0) {
                    switch (hraVar.a()) {
                        case 14:
                        case 15:
                            if (i == i3) {
                                return -1;
                            }
                            i3--;
                            break;
                        case 16:
                        case 17:
                            if (i == i3) {
                                return 1;
                            }
                            i3--;
                            break;
                        case 18:
                            i3++;
                            break;
                        default:
                            break;
                    }
                }
            } else {
                return i2;
            }
        }
        return 0;
    }

    public static int b(CharSequence charSequence) {
        hra hraVar = new hra(charSequence);
        hraVar.c = hraVar.b;
        int i = 0;
        while (true) {
            int i2 = i;
            while (hraVar.c > 0) {
                byte bA = hraVar.a();
                if (bA == 0) {
                    if (i == 0) {
                        return -1;
                    }
                    if (i2 == 0) {
                    }
                } else if (bA == 1 || bA == 2) {
                    if (i == 0) {
                        return 1;
                    }
                    if (i2 == 0) {
                    }
                } else if (bA != 9) {
                    switch (bA) {
                        case 14:
                        case 15:
                            if (i2 == i) {
                                return -1;
                            }
                            i--;
                            break;
                        case 16:
                        case 17:
                            if (i2 == i) {
                                return 1;
                            }
                            i--;
                            break;
                        case 18:
                            i++;
                            break;
                        default:
                            if (i2 != 0) {
                            }
                            break;
                    }
                } else {
                    continue;
                }
            }
            return 0;
        }
    }

    public static ira c() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? e : d;
    }

    public final SpannableStringBuilder d(CharSequence charSequence) {
        String str;
        svh0 svh0Var = a4e1.c;
        if (charSequence == null) {
            return null;
        }
        boolean zP = svh0Var.p(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean zP2 = (zP ? a4e1.b : a4e1.a).p(charSequence.length(), charSequence);
        String str2 = "";
        String str3 = c;
        String str4 = b;
        boolean z = this.a;
        if (z || !(zP2 || a(charSequence) == 1)) {
            str = (!z || (zP2 && a(charSequence) != -1)) ? "" : str3;
        } else {
            str = str4;
        }
        spannableStringBuilder.append((CharSequence) str);
        if (zP != z) {
            spannableStringBuilder.append(zP ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zP3 = (zP ? a4e1.b : a4e1.a).p(charSequence.length(), charSequence);
        if (!z && (zP3 || b(charSequence) == 1)) {
            str2 = str4;
        } else if (z && (!zP3 || b(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }

    public final String e(String str) {
        svh0 svh0Var = a4e1.a;
        if (str == null) {
            return null;
        }
        return d(str).toString();
    }
}
