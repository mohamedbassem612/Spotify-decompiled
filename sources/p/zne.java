package p;

import android.content.Context;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zne implements p160 {
    public final /* synthetic */ byte a;
    public final ke71 b;
    public final yd91 c;
    public final Object d;
    public final Object e;
    public final Object f;

    public zne(Context context, vne vneVar) {
        this.a = (byte) 0;
        this.d = vneVar;
        Locale locale = Locale.US;
        this.e = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", locale);
        Locale localeB = yoi1.A(context.getResources().getConfiguration()).b(0);
        this.f = DateFormat.getDateInstance(2, localeB != null ? localeB : locale);
        this.b = o381.a;
        this.c = new yd91(3, new ptb(this, (byte) 25));
    }

    public final l381 c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b;
    }

    public final yd91 d() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.c;
    }

    public zne(trq trqVar, yqg yqgVar, ipq ipqVar) {
        this.a = (byte) 1;
        this.d = trqVar;
        this.e = yqgVar;
        this.f = ipqVar;
        this.b = o381.a;
        this.c = new yd91(3, new gga1(this, (byte) 14));
    }
}
