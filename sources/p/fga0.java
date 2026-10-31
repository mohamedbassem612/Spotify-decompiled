package p;

import kotlinx.serialization.json.JsonDecodingException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class fga0 {
    public static final mf80 a = p6p1.l("kotlinx.serialization.json.JsonUnquotedLiteral", chc1.a);

    public static final aha0 a(Boolean bool) {
        return bool == null ? rga0.INSTANCE : new nga0(bool, false);
    }

    public static final aha0 b(Number number) {
        return number == null ? rga0.INSTANCE : new nga0(number, false);
    }

    public static final aha0 c(String str) {
        return str == null ? rga0.INSTANCE : new nga0(str, true);
    }

    public static final void d(String str, ega0 ega0Var) {
        throw new IllegalArgumentException("Element " + rc11.a.b(ega0Var.getClass()) + " is not a " + str);
    }

    public static final boolean e(aha0 aha0Var) {
        Boolean bool;
        String strB = aha0Var.b();
        String[] strArr = ahc1.a;
        if (strB.equalsIgnoreCase("true")) {
            bool = Boolean.TRUE;
        } else {
            bool = strB.equalsIgnoreCase("false") ? Boolean.FALSE : null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        tw20.s(aha0Var, " does not represent a Boolean");
        return false;
    }

    public static final Boolean f(aha0 aha0Var) {
        String strB = aha0Var.b();
        String[] strArr = ahc1.a;
        if (strB.equalsIgnoreCase("true")) {
            return Boolean.TRUE;
        }
        if (strB.equalsIgnoreCase("false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final String g(aha0 aha0Var) {
        if (aha0Var instanceof rga0) {
            return null;
        }
        return aha0Var.b();
    }

    public static final double h(aha0 aha0Var) {
        return Double.parseDouble(aha0Var.b());
    }

    public static final int i(aha0 aha0Var) {
        try {
            long jO = o(aha0Var);
            if (-2147483648L <= jO && jO <= 2147483647L) {
                return (int) jO;
            }
            throw new NumberFormatException(aha0Var.b() + " is not an Int");
        } catch (JsonDecodingException e) {
            throw new NumberFormatException(e.getMessage());
        }
    }

    public static final Integer j(aha0 aha0Var) {
        Long lValueOf;
        try {
            lValueOf = Long.valueOf(o(aha0Var));
        } catch (JsonDecodingException unused) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            if (-2147483648L <= jLongValue && jLongValue <= 2147483647L) {
                return Integer.valueOf((int) jLongValue);
            }
        }
        return null;
    }

    public static final pfa0 k(ega0 ega0Var) {
        pfa0 pfa0Var = ega0Var instanceof pfa0 ? (pfa0) ega0Var : null;
        if (pfa0Var != null) {
            return pfa0Var;
        }
        d("JsonArray", ega0Var);
        throw null;
    }

    public static final uga0 l(ega0 ega0Var) {
        uga0 uga0Var = ega0Var instanceof uga0 ? (uga0) ega0Var : null;
        if (uga0Var != null) {
            return uga0Var;
        }
        d("JsonObject", ega0Var);
        throw null;
    }

    public static final aha0 m(ega0 ega0Var) {
        aha0 aha0Var = ega0Var instanceof aha0 ? (aha0) ega0Var : null;
        if (aha0Var != null) {
            return aha0Var;
        }
        d("JsonPrimitive", ega0Var);
        throw null;
    }

    public static final long n(aha0 aha0Var) {
        try {
            return o(aha0Var);
        } catch (JsonDecodingException e) {
            throw new NumberFormatException(e.getMessage());
        }
    }

    public static final long o(aha0 aha0Var) {
        return omo1.f(aha0Var.b(), nfa0.d).m();
    }
}
