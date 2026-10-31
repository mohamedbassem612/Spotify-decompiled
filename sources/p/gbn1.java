package p;

import android.text.TextUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class gbn1 {
    public static final pue0 a = new pue0("MetadataUtils", (String) null);
    public static final String[] b;
    public static final String c;

    static {
        String[] strArr = {"Z", "+hh", "+hhmm", "+hh:mm"};
        b = strArr;
        c = "yyyyMMdd'T'HHmmss".concat(String.valueOf(strArr[0]));
    }

    public static void a(List list, JSONArray jSONArray) {
        try {
            list.clear();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    list.add(new bil1(jSONArray.getJSONObject(i)));
                } catch (IllegalArgumentException unused) {
                }
            }
        } catch (JSONException unused2) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    /* JADX WARN: Code duplicated, block: B:17:0x003c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0044  */
    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0058  */
    /* JADX WARN: Code duplicated, block: B:28:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x009c  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:63:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static Calendar b(String str) {
        String strSubstring;
        int iIndexOf;
        int i;
        String strSubstring2;
        char cCharAt;
        String[] strArr;
        int length;
        String str2;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        pue0 pue0Var = a;
        if (zIsEmpty) {
            pue0Var.a("Input string is empty or null", new Object[0]);
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            pue0Var.a("Input string is empty or null", new Object[0]);
        } else {
            try {
                strSubstring = str.substring(0, 8);
            } catch (IndexOutOfBoundsException unused) {
                pue0Var.c("Error extracting the date", new Object[0]);
                strSubstring = null;
            }
            if (TextUtils.isEmpty(strSubstring)) {
                pue0Var.a("Invalid date format", new Object[0]);
                return null;
            }
            try {
                if (TextUtils.isEmpty(str)) {
                    pue0Var.a("string is empty or null", new Object[0]);
                } else {
                    iIndexOf = str.indexOf(84);
                    i = iIndexOf + 1;
                    if (iIndexOf != 8) {
                        try {
                            strSubstring2 = str.substring(i);
                            if (strSubstring2.length() != 6) {
                                cCharAt = strSubstring2.charAt(6);
                                strArr = b;
                                if (cCharAt != '+' || cCharAt == '-') {
                                    length = strSubstring2.length();
                                    if (length != strArr[1].length() + 6 || length == strArr[2].length() + 6 || length == strArr[3].length() + 6) {
                                        strSubstring2 = strSubstring2.replaceAll("([\\+\\-]\\d\\d):(\\d\\d)", "$1$2");
                                    }
                                } else if (cCharAt == 'Z' && strSubstring2.length() == strArr[0].length() + 6) {
                                    strSubstring2 = strSubstring2.substring(0, strSubstring2.length() - 1).concat("+0000");
                                }
                            }
                        } catch (IndexOutOfBoundsException unused2) {
                            pue0Var.c("Error extracting the time substring: %s", new Object[0]);
                        }
                        if (TextUtils.isEmpty(strSubstring2)) {
                            str2 = "yyyyMMdd";
                        } else {
                            strSubstring = l1d.q(new StringBuilder(String.valueOf(strSubstring).length() + 1 + String.valueOf(strSubstring2).length()), strSubstring, "T", strSubstring2);
                            if (strSubstring2.length() == 6) {
                                str2 = "yyyyMMdd'T'HHmmss";
                            } else {
                                str2 = c;
                            }
                        }
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(new SimpleDateFormat(str2).parse(strSubstring));
                        return calendar;
                    }
                    pue0Var.a("T delimeter is not found", new Object[0]);
                }
                calendar.setTime(new SimpleDateFormat(str2).parse(strSubstring));
                return calendar;
            } catch (ParseException unused3) {
                pue0Var.c("Error parsing string", new Object[0]);
                return null;
            }
            strSubstring2 = null;
            if (TextUtils.isEmpty(strSubstring2)) {
                strSubstring = l1d.q(new StringBuilder(String.valueOf(strSubstring).length() + 1 + String.valueOf(strSubstring2).length()), strSubstring, "T", strSubstring2);
                if (strSubstring2.length() == 6) {
                    str2 = "yyyyMMdd'T'HHmmss";
                } else {
                    str2 = c;
                }
            } else {
                str2 = "yyyyMMdd";
            }
            Calendar calendar2 = Calendar.getInstance();
        }
        strSubstring = null;
        if (TextUtils.isEmpty(strSubstring)) {
            pue0Var.a("Invalid date format", new Object[0]);
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            pue0Var.a("string is empty or null", new Object[0]);
        } else {
            iIndexOf = str.indexOf(84);
            i = iIndexOf + 1;
            if (iIndexOf != 8) {
                strSubstring2 = str.substring(i);
                if (strSubstring2.length() != 6) {
                    cCharAt = strSubstring2.charAt(6);
                    strArr = b;
                    if (cCharAt != '+') {
                        length = strSubstring2.length();
                        if (length != strArr[1].length() + 6) {
                        }
                        strSubstring2 = strSubstring2.replaceAll("([\\+\\-]\\d\\d):(\\d\\d)", "$1$2");
                    } else {
                        length = strSubstring2.length();
                        if (length != strArr[1].length() + 6) {
                        }
                        strSubstring2 = strSubstring2.replaceAll("([\\+\\-]\\d\\d):(\\d\\d)", "$1$2");
                    }
                }
                if (TextUtils.isEmpty(strSubstring2)) {
                    strSubstring = l1d.q(new StringBuilder(String.valueOf(strSubstring).length() + 1 + String.valueOf(strSubstring2).length()), strSubstring, "T", strSubstring2);
                    if (strSubstring2.length() == 6) {
                        str2 = "yyyyMMdd'T'HHmmss";
                    } else {
                        str2 = c;
                    }
                } else {
                    str2 = "yyyyMMdd";
                }
                Calendar calendar3 = Calendar.getInstance();
                calendar3.setTime(new SimpleDateFormat(str2).parse(strSubstring));
                return calendar3;
            }
            pue0Var.a("T delimeter is not found", new Object[0]);
        }
        strSubstring2 = null;
        if (TextUtils.isEmpty(strSubstring2)) {
            strSubstring = l1d.q(new StringBuilder(String.valueOf(strSubstring).length() + 1 + String.valueOf(strSubstring2).length()), strSubstring, "T", strSubstring2);
            if (strSubstring2.length() == 6) {
                str2 = "yyyyMMdd'T'HHmmss";
            } else {
                str2 = c;
            }
        } else {
            str2 = "yyyyMMdd";
        }
        Calendar calendar4 = Calendar.getInstance();
        calendar4.setTime(new SimpleDateFormat(str2).parse(strSubstring));
        return calendar4;
    }
}
