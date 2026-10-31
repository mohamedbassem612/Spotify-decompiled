package p;

import android.content.ContentResolver;
import android.provider.Settings;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jqt {
    public static final bma1 e = bma1.b.q("installation_id");
    public static final Object f = new Object();
    public final ContentResolver a;
    public final dma1 b;
    public String c;
    public String d;

    public jqt(ContentResolver contentResolver, dma1 dma1Var) {
        this.a = contentResolver;
        this.b = dma1Var;
    }

    public final String a() {
        String string = Settings.Secure.getString(this.a, "android_id");
        if (jhc1.F(string)) {
            return "0";
        }
        string.getClass();
        return string;
    }

    public final String b() {
        if (jhc1.F(this.c)) {
            this.c = UUID.randomUUID().toString();
        }
        String str = this.c;
        str.getClass();
        return str;
    }
}
