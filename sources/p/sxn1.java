package p;

import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class sxn1 {
    public final pue0 a;
    public final String b;
    public zrj1 c;
    public final List d;

    public sxn1(String str) {
        o4e.b(str);
        this.b = str;
        this.a = new pue0("MediaControlChannel", null);
        this.d = Collections.synchronizedList(new ArrayList());
    }

    public final void a(mon1 mon1Var) {
        this.d.add(mon1Var);
    }

    public final void b(long j, String str) {
        Object[] objArr = {str, null};
        boolean zEquals = Build.TYPE.equals("user");
        pue0 pue0Var = this.a;
        if (!zEquals && pue0Var.b && Log.isLoggable(pue0Var.a, 2)) {
            pue0Var.c("Sending text message: %s to: %s", objArr);
        }
        zrj1 zrj1Var = this.c;
        if (zrj1Var == null) {
            pue0Var.c("Attempt to send text message without a sink", new Object[0]);
        } else {
            zrj1Var.j(j, this.b, str);
        }
    }

    public final long c() {
        zrj1 zrj1Var = this.c;
        if (zrj1Var != null) {
            return zrj1Var.k();
        }
        this.a.c("Attempt to generate requestId without a sink", new Object[0]);
        return 0L;
    }
}
