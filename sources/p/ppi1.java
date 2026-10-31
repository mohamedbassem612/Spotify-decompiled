package p;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ppi1 {
    public static final Pattern b = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static ppi1 c;
    public final ypa a;

    public ppi1(ypa ypaVar) {
        this.a = ypaVar;
    }

    public final boolean a(s19 s19Var) {
        if (TextUtils.isEmpty(s19Var.c)) {
            return true;
        }
        long j = s19Var.f + s19Var.e;
        this.a.getClass();
        return j < (ypa.g() / 1000) + 3600;
    }
}
