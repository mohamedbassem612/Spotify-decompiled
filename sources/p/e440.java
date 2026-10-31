package p;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class e440 {
    public static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    public final boolean a(String str) {
        Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            String str2 = zoi1.a;
            int i = Integer.parseInt(strGroup, 16);
            int i2 = Integer.parseInt(matcher.group(2), 16);
            if (i <= 0 && i2 <= 0) {
                return false;
            }
            this.a = i;
            this.b = i2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0081  */
    public final void b(hjj0 hjj0Var) {
        rij0 rij0Var;
        hjj0Var.getClass();
        v280 v280VarM = b380.m();
        rij0[] rij0VarArr = hjj0Var.a;
        int length = rij0VarArr.length;
        int i = 0;
        while (true) {
            rij0 rij0Var2 = null;
            if (i >= length) {
                break;
            }
            rij0 rij0Var3 = rij0VarArr[i];
            if (igh.class.isAssignableFrom(rij0Var3.getClass())) {
                rij0 rij0Var4 = (rij0) igh.class.cast(rij0Var3);
                if (((igh) rij0Var4).c.equals("iTunSMPB")) {
                    rij0Var2 = rij0Var4;
                }
            }
            if (rij0Var2 != null) {
                v280VarM.c(rij0Var2);
            }
            i++;
        }
        w280 w280VarR = v280VarM.g().r(0);
        while (w280VarR.hasNext()) {
            if (a(((igh) w280VarR.next()).d)) {
                return;
            }
        }
        fv7 fv7Var = new fv7((byte) 3);
        v280 v280VarM2 = b380.m();
        for (rij0 rij0Var5 : hjj0Var.a) {
            if (z390.class.isAssignableFrom(rij0Var5.getClass())) {
                rij0Var = (rij0) z390.class.cast(rij0Var5);
                if (!fv7Var.apply(rij0Var)) {
                    rij0Var = null;
                }
            } else {
                rij0Var = null;
            }
            if (rij0Var != null) {
                v280VarM2.c(rij0Var);
            }
        }
        w280 w280VarR2 = v280VarM2.g().r(0);
        while (w280VarR2.hasNext() && !a(((z390) w280VarR2.next()).d)) {
        }
    }
}
