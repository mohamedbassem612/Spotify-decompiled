package p;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class yy60 {
    public static final HashMap a;

    static {
        HashMap map = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(yy60.class.getResourceAsStream("/org/commonmark/internal/util/entities.txt"), StandardCharsets.UTF_8));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        map.put("NewLine", "\n");
                        a = map;
                        return;
                    } else if (line.length() != 0) {
                        int iIndexOf = line.indexOf("=");
                        map.put(line.substring(0, iIndexOf), line.substring(iIndexOf + 1));
                    }
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
                k220.p("Failed reading data for HTML named character references", e);
            }
        } catch (IOException e) {
            k220.p("Failed reading data for HTML named character references", e);
        }
    }

    public static String a(String str) {
        int i;
        if (str.startsWith("&") && str.endsWith(";")) {
            String strH = cy30.h(1, 1, str);
            if (strH.startsWith("#")) {
                String strSubstring = strH.substring(1);
                if (strSubstring.startsWith("x") || strSubstring.startsWith("X")) {
                    strSubstring = strSubstring.substring(1);
                    i = 16;
                } else {
                    i = 10;
                }
                try {
                    int i2 = Integer.parseInt(strSubstring, i);
                    return i2 == 0 ? "�" : new String(Character.toChars(i2));
                } catch (IllegalArgumentException unused) {
                    return "�";
                }
            }
            String str2 = (String) a.get(strH);
            if (str2 != null) {
                return str2;
            }
        }
        return str;
    }
}
