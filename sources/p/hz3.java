package p;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import j$.time.OffsetDateTime;
import j$.time.format.DateTimeParseException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hz3 implements z1c1 {
    public static final Uri e = Uri.parse("content://amzn_appstore/getUserAgeData");
    public final ContentResolver a;
    public final Uri b;
    public final ihv0 c;
    public final q8n d;

    static {
        Uri.parse("content://amzn_test_appstore/getUserAgeData?testOption=1");
    }

    public hz3(ContentResolver contentResolver, Uri uri, ihv0 ihv0Var, q8n q8nVar) {
        this.a = contentResolver;
        this.b = uri;
        this.c = ihv0Var;
        this.d = q8nVar;
    }

    public static a2c1 b(hz3 hz3Var, int i) {
        hz3Var.getClass();
        return new a2c1(i, 3, null);
    }

    public static String c(Cursor cursor, String str) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str);
        if (cursor.isNull(columnIndexOrThrow)) {
            return null;
        }
        return cursor.getString(columnIndexOrThrow);
    }

    @Override // p.z1c1
    public final Object a(gj2 gj2Var) {
        return fn31.Y(this.d, new kk(this, (lnm) null, (byte) 9), gj2Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:141:0x021d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0130  */
    /* JADX WARN: Code duplicated, block: B:80:0x0132  */
    public final c2c1 d(Cursor cursor) {
        int i;
        int i2;
        String strValueOf;
        int i3;
        int i4;
        String strValueOf2;
        if (!cursor.moveToFirst()) {
            return b(this, 5);
        }
        String strC = c(cursor, "responseStatus");
        if (strC != null) {
            switch (strC) {
                case "INTERNAL_TRANSIENT_ERROR":
                    i = 4;
                    break;
                case "SUCCESS":
                    i = 0;
                    break;
                case "FEATURE_NOT_SUPPORTED":
                    i = 1;
                    break;
                case "INTERNAL_ERROR":
                    i = 6;
                    break;
                case "APP_NOT_OWNED":
                    i = 2;
                    break;
                default:
                    i = 5;
                    break;
            }
        } else {
            i = 5;
        }
        ihv0 ihv0Var = this.c;
        String str = "null";
        if (i != 0) {
            mmr0 mmr0Var = new mmr0("outcome", "failure");
            if (strC == null) {
                strC = "null";
            }
            ihv0Var.a(3, sqg0.J(new mmr0[]{mmr0Var, new mmr0("error_code", strC), new mmr0("mapped_error", h4b1.n(i))}));
            return b(this, i);
        }
        String strC2 = c(cursor, "mostRecentApprovalDate");
        if (strC2 != null && strC2.length() != 0) {
            try {
                OffsetDateTime.parse(strC2);
            } catch (DateTimeParseException unused) {
                ihv0Var.a(3, sqg0.J(new mmr0[]{new mmr0("outcome", "failure"), new mmr0("mapped_error", "PARSE_ERROR")}));
                return b(this, 5);
            }
        }
        String strC3 = c(cursor, "userStatus");
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("ageLower");
        Integer numValueOf = cursor.isNull(columnIndexOrThrow) ? null : Integer.valueOf(cursor.getInt(columnIndexOrThrow));
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("ageUpper");
        Integer numValueOf2 = cursor.isNull(columnIndexOrThrow2) ? null : Integer.valueOf(cursor.getInt(columnIndexOrThrow2));
        String strC4 = c(cursor, "userId");
        if (strC3 == null) {
            i2 = 0;
        } else {
            String str2 = strC3.length() > 0 ? strC3 : null;
            if (str2 != null) {
                switch (str2) {
                    case "CONSENT_NOT_GRANTED":
                    case "SUPERVISED":
                        i2 = 3;
                        break;
                    case "VERIFIED":
                        i2 = 1;
                        break;
                    case "UNKNOWN":
                        i2 = 4;
                        break;
                    default:
                        i2 = 0;
                        break;
                }
            } else {
                i2 = 0;
            }
        }
        mmr0 mmr0Var2 = new mmr0("outcome", "success");
        mmr0 mmr0Var3 = new mmr0("user_status", strC3 == null ? "null" : strC3);
        mmr0 mmr0Var4 = new mmr0("mapped_status", i2 != 0 ? kk0.z(i2) : "fallback_api_not_available");
        if (numValueOf == null || (strValueOf = String.valueOf(numValueOf.intValue())) == null) {
            strValueOf = "null";
        }
        mmr0 mmr0Var5 = new mmr0("age_lower", strValueOf);
        if (numValueOf2 != null && (strValueOf2 = String.valueOf(numValueOf2.intValue())) != null) {
            str = strValueOf2;
        }
        ihv0Var.a(3, sqg0.J(new mmr0[]{mmr0Var2, mmr0Var3, mmr0Var4, mmr0Var5, new mmr0("age_upper", str), new mmr0("has_most_recent_approval_date", String.valueOf(!(strC2 == null || strC2.length() == 0))), new mmr0("has_install_id", String.valueOf(!(strC4 == null || strC4.length() == 0)))}));
        if (i2 == 0) {
            return b(this, 1);
        }
        uh2 uh2Var = numValueOf != null ? new uh2(numValueOf2, numValueOf.intValue()) : null;
        if (strC3 == null) {
            i3 = 3;
            i4 = 4;
        } else {
            int iHashCode = strC3.hashCode();
            if (iHashCode != -1993902006) {
                if (iHashCode != -1212137948) {
                    i3 = 3;
                    i4 = 3;
                } else {
                    i3 = 3;
                    i4 = 3;
                }
            } else if (strC3.equals("CONSENT_NOT_GRANTED")) {
                i3 = 3;
                i4 = 2;
            } else {
                i3 = 3;
                i4 = 4;
            }
        }
        return new b2c1(new ci2(i2, uh2Var, i4, i3));
    }
}
