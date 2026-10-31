package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class jqh {
    public final Context a;
    public final String b;

    public jqh(Context context) {
        this.a = context;
        this.b = context.getString(2131954130);
    }

    public final String a(tuw tuwVar) {
        int iOrdinal = tuwVar.ordinal();
        Context context = this.a;
        switch (iOrdinal) {
            case 0:
            case 1:
            case 2:
            case 6:
                return "";
            case 3:
                return context.getString(2131954124);
            case 4:
                return context.getString(2131954126);
            case 5:
                return context.getString(2131954125);
            default:
                eg.o();
                return null;
        }
    }
}
