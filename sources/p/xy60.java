package p;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class xy60 {
    public static final cv50[] a;
    public static final Map b;

    static {
        cv50 cv50Var = new cv50(cv50.i, "");
        rhc rhcVar = cv50.f;
        cv50 cv50Var2 = new cv50(rhcVar, "GET");
        cv50 cv50Var3 = new cv50(rhcVar, "POST");
        rhc rhcVar2 = cv50.g;
        cv50 cv50Var4 = new cv50(rhcVar2, "/");
        cv50 cv50Var5 = new cv50(rhcVar2, "/index.html");
        rhc rhcVar3 = cv50.h;
        cv50 cv50Var6 = new cv50(rhcVar3, "http");
        cv50 cv50Var7 = new cv50(rhcVar3, m3i1.b);
        rhc rhcVar4 = cv50.e;
        cv50[] cv50VarArr = {cv50Var, cv50Var2, cv50Var3, cv50Var4, cv50Var5, cv50Var6, cv50Var7, new cv50(rhcVar4, "200"), new cv50(rhcVar4, "204"), new cv50(rhcVar4, "206"), new cv50(rhcVar4, "304"), new cv50(rhcVar4, "400"), new cv50(rhcVar4, "404"), new cv50(rhcVar4, "500"), new cv50("accept-charset", ""), new cv50("accept-encoding", "gzip, deflate"), new cv50("accept-language", ""), new cv50("accept-ranges", ""), new cv50("accept", ""), new cv50("access-control-allow-origin", ""), new cv50("age", ""), new cv50("allow", ""), new cv50("authorization", ""), new cv50("cache-control", ""), new cv50("content-disposition", ""), new cv50("content-encoding", ""), new cv50("content-language", ""), new cv50("content-length", ""), new cv50("content-location", ""), new cv50("content-range", ""), new cv50("content-type", ""), new cv50("cookie", ""), new cv50("date", ""), new cv50("etag", ""), new cv50("expect", ""), new cv50("expires", ""), new cv50("from", ""), new cv50("host", ""), new cv50("if-match", ""), new cv50("if-modified-since", ""), new cv50("if-none-match", ""), new cv50("if-range", ""), new cv50("if-unmodified-since", ""), new cv50("last-modified", ""), new cv50("link", ""), new cv50("location", ""), new cv50("max-forwards", ""), new cv50("proxy-authenticate", ""), new cv50("proxy-authorization", ""), new cv50("range", ""), new cv50("referer", ""), new cv50("refresh", ""), new cv50("retry-after", ""), new cv50("server", ""), new cv50("set-cookie", ""), new cv50("strict-transport-security", ""), new cv50("transfer-encoding", ""), new cv50("user-agent", ""), new cv50("vary", ""), new cv50("via", ""), new cv50("www-authenticate", "")};
        a = cv50VarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(cv50VarArr[i].a)) {
                linkedHashMap.put(cv50VarArr[i].a, Integer.valueOf(i));
            }
        }
        b = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void a(rhc rhcVar) {
        int iD = rhcVar.d();
        for (int i = 0; i < iD; i++) {
            byte bI = rhcVar.i(i);
            if (65 <= bI && bI < 91) {
                k220.i("PROTOCOL_ERROR response malformed: mixed case name: ".concat(rhcVar.r()));
                return;
            }
        }
    }
}
