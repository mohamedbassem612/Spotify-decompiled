package p;

import android.net.Uri;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class s1o1 implements fzq {
    public final Uri a;
    public final byte[] b;
    public final Map c;

    public s1o1(z2o1 z2o1Var) {
        this.a = z2o1Var.getUri();
        this.b = z2o1Var.getData();
        HashMap map = new HashMap();
        for (Map.Entry entry : ((HashMap) z2o1Var.h()).entrySet()) {
            if (entry.getKey() != null) {
                map.put((String) entry.getKey(), (gzq) ((gzq) entry.getValue()).freeze());
            }
        }
        this.c = Collections.unmodifiableMap(map);
    }

    public final byte[] getData() {
        return this.b;
    }

    public final Uri getUri() {
        return this.a;
    }

    public final Map h() {
        return this.c;
    }

    public final String toString() {
        boolean zIsLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder sb = new StringBuilder("DataItemEntity{ ");
        sb.append("uri=".concat(String.valueOf(this.a)));
        byte[] bArr = this.b;
        sb.append(", dataSz=".concat((bArr == null ? "null" : Integer.valueOf(bArr.length)).toString()));
        Map map = this.c;
        int size = map.size();
        StringBuilder sb2 = new StringBuilder(String.valueOf(size).length() + 12);
        sb2.append(", numAssets=");
        sb2.append(size);
        sb.append(sb2.toString());
        if (zIsLoggable && !map.isEmpty()) {
            sb.append(", assets=[");
            String str = "";
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                String id = ((gzq) entry.getValue()).getId();
                sb.append(rjx.o(new StringBuilder(str.length() + String.valueOf(str2).length() + 2 + String.valueOf(id).length()), str, str2, ": ", id));
                str = ", ";
            }
            sb.append("]");
        }
        sb.append(" }");
        return sb.toString();
    }

    public final /* bridge */ /* synthetic */ Object freeze() {
        return this;
    }
}
