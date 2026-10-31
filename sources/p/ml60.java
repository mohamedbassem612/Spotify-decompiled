package p;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ml60 {
    public final ll60 a;
    public final HashMap b;
    public final ArrayList c;
    public String d;

    public ml60(ll60 ll60Var, String str, Uri uri, int i) {
        this.a = ll60Var;
        HashMap map = new HashMap();
        this.b = map;
        map.put(str, uri);
        this.d = str;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        if (i != -1) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    public final t380 a() {
        return t380.p(this.b.keySet());
    }

    public final Uri b() {
        Uri uri = (Uri) this.b.get(this.d);
        uri.getClass();
        return uri;
    }
}
