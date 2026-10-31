package p;

import java.util.HashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sgx extends l570 {
    public final /* synthetic */ byte b;
    public final qzh c;
    public final yqg d;
    public final vx40 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sgx(qzh qzhVar, yqg yqgVar, vx40 vx40Var, byte b) {
        super(qzhVar.getView());
        this.b = b;
        switch (b) {
            case 1:
                super(qzhVar.getView());
                this.c = qzhVar;
                this.d = yqgVar;
                this.e = vx40Var;
                break;
            default:
                this.c = qzhVar;
                this.d = yqgVar;
                this.e = vx40Var;
                break;
        }
    }

    public static void e(String str, l670 l670Var, y570 y570Var) {
        if (y570Var.j().containsKey(str)) {
            l670Var.c.d(new u570(str, y570Var, gg11.g));
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0121 A[PHI: r7
      0x0121: PHI (r7v16 int) = (r7v14 int), (r7v15 int) binds: [B:52:0x011f, B:55:0x0124] A[DONT_GENERATE, DONT_INLINE]] */
    public final void a(y570 y570Var, l670 l670Var, yfu yfuVar) {
        char c;
        int i;
        byte b = this.b;
        vx40 vx40Var = this.e;
        yqg yqgVar = this.d;
        qzh qzhVar = this.c;
        switch (b) {
            case 0:
                qzhVar.f(new ffo(y570Var.g().t(yqgVar.b(), "timestamp")));
                vx40Var.v(y570Var);
                break;
            default:
                String str = y570Var.n().a.a;
                String str2 = str == null ? "" : str;
                String str3 = y570Var.n().a.b;
                String str4 = str3 == null ? "" : str3;
                ld70 ld70Var = y570Var.k().a.c;
                String str5 = ld70Var != null ? ld70Var.a.c : null;
                String str6 = str5 == null ? "" : str5;
                long jT = y570Var.g().t(0L, "eventStartTime");
                String strB = y570Var.g().B("eventTimezone");
                if (strB == null || strB.length() <= 0 || !((HashSet) uhx.d.getValue()).contains(strB)) {
                    strB = null;
                }
                if (strB == null) {
                    strB = yqgVar.g().getID();
                }
                String str7 = strB;
                str7.getClass();
                String strB2 = y570Var.g().B("locationName");
                if (strB2 == null || strB2.length() <= 0) {
                    strB2 = null;
                }
                String strB3 = y570Var.g().B("cityName");
                if (strB3 == null || strB3.length() <= 0) {
                    strB3 = null;
                }
                String strY0 = o7h.y0(f46.i0(new String[]{strB2, strB3}), ", ", (String) null, (String) null, (iu30) null, 62);
                long jB = yqgVar.b();
                long jT2 = y570Var.g().t(0L, "eventEndTime") * 1000;
                long jT3 = y570Var.g().t(0L, "accessStartTime") * 1000;
                long jT4 = y570Var.g().t(0L, "accessEndTime") * 1000;
                String strB4 = y570Var.g().B("rsvpState");
                if (u890.j(strB4, "RSVP_STATE_CONFIRMED")) {
                    c = 2;
                } else {
                    c = u890.j(strB4, "RSVP_STATE_NOT_SELECTED") ? (char) 3 : (char) 1;
                }
                boolean zB = y570Var.g().b("isLocked", false);
                if (jB >= jT2) {
                    i = 1;
                } else {
                    int i2 = 2;
                    if (c == 2) {
                        i = i2;
                    } else {
                        i2 = 3;
                        if (c == 3) {
                            i = i2;
                        } else if (zB) {
                            i = 4;
                        } else if (jB < jT3) {
                            i = 5;
                        } else {
                            i = jB <= jT4 ? 6 : 7;
                        }
                    }
                }
                String strB5 = y570Var.g().B("statusTitle");
                if (strB5 == null) {
                    strB5 = "";
                }
                String strB6 = y570Var.g().B("statusSubtitle");
                qzhVar.f(new jj10(str2, str4, str6, jT, strY0, i, strB5, strB6 == null ? "" : strB6, y570Var.g().B("footerText"), y570Var.g().B("ctaButtonText"), y570Var.g().B("premiumOnlyText"), y570Var.g().B("eventEndedLabelText"), y570Var.g().B("eventEndedDatePrefixText"), str7));
                qzhVar.n(new jy(this, l670Var, y570Var, (byte) 6));
                vx40Var.v(y570Var);
                break;
        }
    }

    public final void b(int... iArr) {
        byte b = this.b;
    }

    private final void c(int... iArr) {
    }

    private final void d(int... iArr) {
    }
}
