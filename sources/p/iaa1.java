package p;

import android.content.Context;
import android.content.res.Resources;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class iaa1 implements xpw {
    public static final SimpleDateFormat f;
    public final Resources a;
    public final Locale b;
    public final rey0 c;
    public final eih1 d;
    public final psw e;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        f = simpleDateFormat;
    }

    public iaa1(Context context) {
        Resources resources = context.getResources();
        this.a = resources;
        Locale localeB = yoi1.A(resources.getConfiguration()).b(0);
        this.b = localeB == null ? Locale.US : localeB;
        this.c = k1o1.p();
        this.d = new eih1();
        j2i j2iVar = new j2i(-223494466, new u491(this, (byte) 10), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.d;
    }

    public final jsw c() {
        return this.e;
    }

    public final mqw getBehavior() {
        return this.c;
    }
}
