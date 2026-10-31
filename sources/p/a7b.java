package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a7b {
    public final /* synthetic */ byte a;
    public final Context b;
    public final add c;

    public /* synthetic */ a7b(Context context, add addVar, byte b) {
        this.a = b;
        this.b = context;
        this.c = addVar;
    }

    public final String a(String str) {
        byte b = this.a;
        Context context = this.b;
        add addVar = this.c;
        switch (b) {
            case 0:
                if (addVar.a.h()) {
                    String string = context.getString(2131952760, str);
                    string.getClass();
                    return string;
                }
                String string2 = context.getString(2131952759, str);
                string2.getClass();
                return string2;
            default:
                if (addVar.a.h()) {
                    String string3 = context.getString(2131963474, str);
                    string3.getClass();
                    return string3;
                }
                String string4 = context.getString(2131963473);
                string4.getClass();
                return string4;
        }
    }
}
