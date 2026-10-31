package p;

import android.content.Context;
import android.net.Uri;
import io.reactivex.rxjava3.core.Single;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tyq0 implements w310 {
    public final Context a;
    public final uw0 b;
    public final zx4 c;
    public final lyq0 d;
    public final lyq0 e;
    public final idd1 f = new idd1(new syq0(this, (byte) 1));
    public final idd1 g = new idd1(new syq0(this, (byte) 0));

    public tyq0(Context context, uw0 uw0Var, zx4 zx4Var, lyq0 lyq0Var, lyq0 lyq0Var2) {
        this.a = context;
        this.b = uw0Var;
        this.c = zx4Var;
        this.d = lyq0Var;
        this.e = lyq0Var2;
    }

    public static u310 c(String str, String str2) {
        Uri uri = Uri.EMPTY;
        return new u310(str, (String) null, str2, (String) null, uri, (Uri) null, uri, uri, uri, (Uri) null, (Uri) null, 2, false, false, false, false, 3, 4, (Double) null, (Integer) null, (Integer) null, false, (String) null, (String) null, (Integer) null, 0, (y310) null, (String) null, (Long) null, (String) null, (Map) null, (String) null, (String) null, (oz0) null, 1073741856, 12);
    }

    public final Single b(r9c r9cVar) {
        r9c r9cVarA = r9c.a(r9cVar, (String) null, (String) null, false, false, (String) null, this.c.c(), 229375);
        return Single.zip(((w310) this.g.getValue()).b(r9c.a(r9cVarA, (String) null, "spotify:genre:0JQ5DAD4lhWdgI5FP4QROh", false, false, (String) null, false, 262141)).map(new m4e0(this, (byte) 26)), ((w310) this.f.getValue()).b(r9cVarA).doOnSuccess(new ixp0(this, (byte) 4)), sa20.V0).map(new mre0(this, (byte) 25));
    }
}
