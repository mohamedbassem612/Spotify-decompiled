package p;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Bundle;
import j$.time.LocalDate;
import j$.time.format.DateTimeParseException;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class h741 implements z1c1 {
    public static final Uri e = Uri.parse("content://com.sec.android.app.samsungapps.provider.ASAA/settings");
    public static final Set f = Collections.singleton("TX");
    public final ContentResolver a;
    public final Uri b;
    public final ihv0 c;
    public final q8n d;

    public h741(ContentResolver contentResolver, Uri uri, ihv0 ihv0Var, q8n q8nVar) {
        this.a = contentResolver;
        this.b = uri;
        this.c = ihv0Var;
        this.d = q8nVar;
    }

    public static a2c1 b(int i) {
        return new a2c1(i, 2, null);
    }

    @Override // p.z1c1
    public final Object a(gj2 gj2Var) {
        return fn31.Y(this.d, new kdt0(this, (lnm) null, (byte) 18), gj2Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:104:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:106:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:109:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:110:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:113:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:116:0x01de  */
    /* JADX WARN: Code duplicated, block: B:117:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:58:0x0104  */
    /* JADX WARN: Code duplicated, block: B:59:0x0106  */
    /* JADX WARN: Code duplicated, block: B:62:0x0110  */
    /* JADX WARN: Code duplicated, block: B:63:0x0115  */
    /* JADX WARN: Code duplicated, block: B:68:0x012c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0156  */
    /* JADX WARN: Code duplicated, block: B:88:0x0173  */
    /* JADX WARN: Code duplicated, block: B:91:0x019e  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:95:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:96:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:98:0x01b4  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final c2c1 c(Bundle bundle) {
        int i;
        String str;
        String str2;
        String strZ;
        String strValueOf;
        int i2;
        int i3;
        Integer num;
        uh2 uh2Var;
        int i4;
        String strValueOf2;
        int i5 = 1;
        int i6 = bundle.getInt("result_code", 1);
        ihv0 ihv0Var = this.c;
        if (i6 != 0) {
            String string = bundle.getString("result_message");
            if (string == null || (!ihc1.h0(string, "not a supported method", true) && !ihc1.h0(string, "not registered", true))) {
                i5 = 6;
            }
            ihv0Var.a(2, sqg0.J(new mmr0[]{new mmr0("outcome", "failure"), new mmr0("error_code", f4i1.c(i6, "resultCode=")), new mmr0("mapped_error", h4b1.n(i5))}));
            return b(i5);
        }
        String string2 = bundle.getString("mostRecentApprovalDate");
        if (string2 != null && string2.length() != 0) {
            try {
                LocalDate.parse(string2);
            } catch (DateTimeParseException unused) {
                ihv0Var.a(2, sqg0.J(new mmr0[]{new mmr0("outcome", "failure"), new mmr0("mapped_error", "PARSE_ERROR")}));
                return b(5);
            }
        }
        String string3 = bundle.getString("userStatus");
        String string4 = bundle.getString("ageLower");
        Integer numC0 = string4 != null ? nhc1.c0(string4) : null;
        String string5 = bundle.getString("ageUpper");
        Integer numC1 = string5 != null ? nhc1.c0(string5) : null;
        String string6 = bundle.getString("installID");
        if (string3 != null) {
            String str3 = string3.length() > 0 ? string3 : null;
            if (str3 != null) {
                switch (str3.hashCode()) {
                    case -1212137948:
                        if (str3.equals("SUPERVISED")) {
                            i = 3;
                            break;
                        }
                        break;
                    case -1211756856:
                        if (str3.equals("VERIFIED")) {
                            i = i5;
                        }
                        break;
                    case -54865866:
                        if (str3.equals("SUPERVISED_APPROVAL_PENDING")) {
                            i = 3;
                            break;
                        }
                        break;
                    case 1732894972:
                        if (str3.equals("SUPERVISED_APPROVAL_DENIED")) {
                            i = 3;
                            break;
                        }
                        break;
                }
            }
            mmr0 mmr0Var = new mmr0("outcome", "success");
            str = "null";
            if (string3 == null) {
                str2 = "null";
            } else {
                str2 = string3;
            }
            mmr0 mmr0Var2 = new mmr0("user_status", str2);
            if (i != 0) {
                strZ = kk0.z(i);
            } else {
                strZ = "fallback_api_not_available";
            }
            mmr0 mmr0Var3 = new mmr0("mapped_status", strZ);
            if (numC0 != null || (strValueOf = String.valueOf(numC0.intValue())) == null) {
                strValueOf = "null";
            }
            mmr0 mmr0Var4 = new mmr0("age_lower", strValueOf);
            if (numC1 != null && (strValueOf2 = String.valueOf(numC1.intValue())) != null) {
                str = strValueOf2;
            }
            mmr0 mmr0Var5 = new mmr0("age_upper", str);
            if (string2 != null || string2.length() == 0) {
                i2 = i5;
            } else {
                i2 = 0;
            }
            mmr0 mmr0Var6 = new mmr0("has_most_recent_approval_date", String.valueOf(i2 ^ 1));
            if (string6 != null || string6.length() == 0) {
                i3 = i5;
            } else {
                i3 = 0;
            }
            num = numC0;
            ihv0Var.a(2, sqg0.J(new mmr0[]{mmr0Var, mmr0Var2, mmr0Var3, mmr0Var4, mmr0Var5, mmr0Var6, new mmr0("has_install_id", String.valueOf(i3 ^ 1))}));
            if (i == 0) {
                return b(i5);
            }
            if (num != null) {
                uh2Var = new uh2(numC1, num.intValue());
            } else {
                uh2Var = null;
            }
            if (string3 != null) {
                switch (string3) {
                    case "SUPERVISED":
                    case "VERIFIED":
                        i4 = 3;
                        break;
                    case "SUPERVISED_APPROVAL_PENDING":
                        i4 = i5;
                        break;
                    case "SUPERVISED_APPROVAL_DENIED":
                        i4 = 2;
                        break;
                    default:
                        i4 = 4;
                        break;
                }
            } else {
                i4 = 4;
            }
            return new b2c1(new ci2(i, uh2Var, i4, 2));
        }
        i5 = 1;
        i = 0;
        mmr0 mmr0Var7 = new mmr0("outcome", "success");
        str = "null";
        if (string3 == null) {
            str2 = "null";
        } else {
            str2 = string3;
        }
        mmr0 mmr0Var8 = new mmr0("user_status", str2);
        if (i != 0) {
            strZ = kk0.z(i);
        } else {
            strZ = "fallback_api_not_available";
        }
        mmr0 mmr0Var9 = new mmr0("mapped_status", strZ);
        if (numC0 != null) {
            strValueOf = "null";
        } else {
            strValueOf = "null";
        }
        mmr0 mmr0Var10 = new mmr0("age_lower", strValueOf);
        if (numC1 != null) {
            str = strValueOf2;
        }
        mmr0 mmr0Var11 = new mmr0("age_upper", str);
        if (string2 != null) {
            i2 = i5;
        } else {
            i2 = i5;
        }
        mmr0 mmr0Var12 = new mmr0("has_most_recent_approval_date", String.valueOf(i2 ^ 1));
        if (string6 != null) {
            i3 = i5;
        } else {
            i3 = i5;
        }
        num = numC0;
        ihv0Var.a(2, sqg0.J(new mmr0[]{mmr0Var7, mmr0Var8, mmr0Var9, mmr0Var10, mmr0Var11, mmr0Var12, new mmr0("has_install_id", String.valueOf(i3 ^ 1))}));
        if (i == 0) {
            return b(i5);
        }
        if (num != null) {
            uh2Var = new uh2(numC1, num.intValue());
        } else {
            uh2Var = null;
        }
        if (string3 != null) {
            switch (string3) {
                case -1212137948:
                    if (string3.equals("SUPERVISED")) {
                        i4 = 3;
                    } else {
                        i4 = 4;
                    }
                    break;
                case -1211756856:
                    if (string3.equals("VERIFIED")) {
                        i4 = 4;
                    } else {
                        i4 = 3;
                    }
                    break;
                case -54865866:
                    if (string3.equals("SUPERVISED_APPROVAL_PENDING")) {
                        i4 = i5;
                    } else {
                        i4 = 4;
                    }
                    break;
                case 1732894972:
                    if (string3.equals("SUPERVISED_APPROVAL_DENIED")) {
                        i4 = 2;
                    } else {
                        i4 = 4;
                    }
                    break;
                default:
                    i4 = 4;
                    break;
            }
        } else {
            i4 = 4;
        }
        return new b2c1(new ci2(i, uh2Var, i4, 2));
    }
}
