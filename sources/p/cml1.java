package p;

import androidx.media3.common.ParserException;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class cml1 {
    public static final Pattern a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(izr0 izr0Var) {
        String strR = izr0Var.r(StandardCharsets.UTF_8);
        return strR != null && strR.startsWith("WEBVTT");
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        String str2 = zoi1.a;
        String[] strArrSplit = str.split("\\.", 2);
        long j = 0;
        for (String str3 : strArrSplit[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str3);
        }
        long j2 = j * 1000;
        if (strArrSplit.length == 2) {
            String strTrim = strArrSplit[1].trim();
            if (strTrim.length() != 3) {
                hhg1.n("Expected 3 decimal places, got: ".concat(strTrim));
                return 0L;
            }
            j2 += Long.parseLong(strTrim);
        }
        return j2 * 1000;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public static void d(izr0 izr0Var) throws ParserException {
        int i = izr0Var.b;
        if (a(izr0Var)) {
            return;
        }
        izr0Var.R(i);
        throw ParserException.a((RuntimeException) null, "Expected WEBVTT. Got " + izr0Var.r(StandardCharsets.UTF_8));
    }
}
