package p;

import android.database.CursorWindow;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class z2o1 extends pwq implements fzq {
    public final int d;

    public z2o1(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.d = i2;
    }

    public final /* synthetic */ Object freeze() {
        return new s1o1(this);
    }

    public final byte[] getData() {
        DataHolder dataHolder = this.a;
        int i = this.b;
        dataHolder.a0(i, "data");
        return dataHolder.d[this.c].getBlob(i, dataHolder.c.getInt("data"));
    }

    public final Uri getUri() {
        DataHolder dataHolder = this.a;
        int i = this.b;
        dataHolder.a0(i, "path");
        return Uri.parse(dataHolder.d[this.c].getString(i, dataHolder.c.getInt("path")));
    }

    public final Map h() {
        int i = this.d;
        HashMap map = new HashMap(i);
        for (int i2 = 0; i2 < i; i2++) {
            l1o1 l1o1Var = new l1o1(this.a, this.b + i2);
            DataHolder dataHolder = l1o1Var.a;
            int i3 = l1o1Var.b;
            dataHolder.a0(i3, "asset_key");
            CursorWindow[] cursorWindowArr = dataHolder.d;
            int i4 = l1o1Var.c;
            if (cursorWindowArr[i4].getString(i3, dataHolder.c.getInt("asset_key")) != null) {
                dataHolder.a0(i3, "asset_key");
                map.put(dataHolder.d[i4].getString(i3, dataHolder.c.getInt("asset_key")), l1o1Var);
            }
        }
        return map;
    }

    public final String toString() {
        boolean zIsLoggable = Log.isLoggable("DataItem", 3);
        DataHolder dataHolder = this.a;
        int i = this.b;
        dataHolder.a0(i, "data");
        byte[] blob = dataHolder.d[this.c].getBlob(i, dataHolder.c.getInt("data"));
        Map mapH = h();
        StringBuilder sb = new StringBuilder("DataItemRef{ ");
        sb.append("uri=".concat(String.valueOf(getUri())));
        sb.append(", dataSz=".concat((blob == null ? "null" : Integer.valueOf(blob.length)).toString()));
        HashMap map = (HashMap) mapH;
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
}
