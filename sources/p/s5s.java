package p;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class s5s implements quc0 {
    public final Context a;
    public final String b;
    public final String c;

    public s5s(Context context) {
        this.a = context;
        String string = context.getString(2131961632);
        this.b = string;
        this.c = string;
    }

    public final String a(List list) {
        if (list.isEmpty()) {
            return "";
        }
        int i = 0;
        if (list.size() == 1) {
            return (String) list.get(0);
        }
        StringBuilder sb = new StringBuilder();
        while (i < list.size() - 2) {
            sb.append((String) list.get(i));
            sb.append(this.b);
            i++;
        }
        sb.append(this.a.getString(2131961631, list.get(i), list.get(i + 1)));
        return sb.toString();
    }

    public final String b() {
        return this.c;
    }
}
