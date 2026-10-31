package p;

import android.content.Context;
import android.icu.text.ListFormatter;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class to4 implements quc0 {
    public final ListFormatter a;
    public final String b;

    public to4(Context context, ListFormatter listFormatter) {
        this.a = listFormatter;
        this.b = context.getString(2131961632);
    }

    @Override // p.quc0
    public final String a(List list) {
        return this.a.format(list);
    }

    @Override // p.quc0
    public final String b() {
        return this.b;
    }
}
