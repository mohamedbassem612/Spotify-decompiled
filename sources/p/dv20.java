package p;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract /* synthetic */ class dv20 {
    public static int a(int i) {
        switch (i) {
            case 0:
                return 9;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            default:
                return 0;
        }
    }

    public static int b(int i) {
        if (i != 0) {
            return i != 4 ? 0 : 1;
        }
        return 2;
    }

    public static int c(String str) {
        if (str == null) {
            bhn0.i("Name is null");
            return 0;
        }
        if (str.equals("CAPPED")) {
            return 1;
        }
        if (str.equals("ENTITLEMENT_MISSING")) {
            return 2;
        }
        hhg1.n("No enum constant com.spotify.upsells.api.GatedFeatureContext.Reason.".concat(str));
        return 0;
    }

    public static /* synthetic */ float d(int i) {
        if (i == 1) {
            return 0.0f;
        }
        if (i == 2) {
            return 4.0f;
        }
        throw null;
    }

    public static /* synthetic */ float e(int i) {
        if (i == 1) {
            return 4.0f;
        }
        if (i == 2) {
            return 5.0f;
        }
        throw null;
    }

    public static /* synthetic */ long f(String str) {
        int length = str.length();
        if (length == 0) {
            throw new NumberFormatException("empty string");
        }
        int i = 0;
        if (str.charAt(0) == '+' && length > 1) {
            i = 1;
        }
        long j = 0;
        while (i < length) {
            int iDigit = Character.digit(str.charAt(i), 16);
            if (iDigit == -1) {
                throw new NumberFormatException(str.toString());
            }
            if (j < 0 || j > 1152921504606846975L || (j == 1152921504606846975L && iDigit > 15)) {
                throw new NumberFormatException("Too large for unsigned long: ".concat(str.toString()));
            }
            j = (j * 16) + ((long) iDigit);
            i++;
        }
        return j;
    }

    public static StringBuilder g(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        return sb;
    }

    public static mmr0 h(int i, int i2, Integer num) {
        return new mmr0(new a391(i, i2), num);
    }

    public static mmr0 i(int i, q1c q1cVar) {
        return new mmr0(q1cVar, new nlb0(i));
    }

    public static mmr0 j(int i, onl onlVar) {
        return new mmr0(onlVar, new dnl(i));
    }

    public static mmr0 k(int i, gt31 gt31Var) {
        return new mmr0(gt31Var, new nlb0(i));
    }

    public static void l(int i, j2i j2iVar, x340 x340Var, boolean z) {
        j2iVar.invoke(x340Var, Integer.valueOf(i));
        x340Var.r(z);
    }

    public static /* synthetic */ void m(AtomicReference atomicReference, Object obj) {
        while (!atomicReference.compareAndSet(obj, null) && atomicReference.get() == obj) {
        }
    }

    public static /* synthetic */ boolean n(String str) {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (!Character.isWhitespace(iCodePointAt)) {
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return true;
    }

    public static /* synthetic */ boolean o(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String p(int i) {
        switch (i) {
            case 1:
                return "EXPLICIT";
            case 2:
                return "TIMER";
            case 3:
                return "SESSION_CHANGE";
            case 4:
                return "PERSISTED_EVENTS";
            case 5:
                return "EVENT_THRESHOLD";
            case 6:
                return "EAGER_FLUSHING_EVENT";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String q(int i) {
        switch (i) {
            case 1:
                return "BANNER";
            case 2:
                return "BOTTOM_SHEET";
            case 3:
                return "FULLSCREEN";
            case 4:
                return "INLINE_CARD";
            case 5:
                return "MODAL";
            case 6:
                return "SNACKBAR";
            case 7:
                return "TOOLTIP";
            case 8:
                return "WEB_VIEW";
            case 9:
                return "TYPE_NOT_SET";
            default:
                throw null;
        }
    }
}
