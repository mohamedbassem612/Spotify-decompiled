package p;

import android.util.Log;
import com.spotify.base.java.logging.Logger;
import java.util.EnumSet;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hxd1 implements tre0 {
    public final nda1 a;
    public final ete0 b;
    public final ete0 c;
    public final ete0 d;
    public final ete0 e;
    public final ete0 f;
    public final ete0 g;
    public final ete0 h;

    public hxd1(jxd1 jxd1Var, EnumSet enumSet) {
        s0u s0uVar = s0u.a;
        this.a = new nda1((byte) 24);
        ete0 fxd1Var = new fxd1(jxd1Var, this, (byte) 0);
        ete0 fxd1Var2 = new fxd1(jxd1Var, this, (byte) 1);
        ete0 exd1Var = new exd1(jxd1Var, this, (byte) 1);
        ete0 gxd1Var = new gxd1(jxd1Var, this, (byte) 1);
        ete0 gxd1Var2 = new gxd1(jxd1Var, this, (byte) 0);
        ete0 exd1Var2 = new exd1(jxd1Var, this, (byte) 0);
        ete0 exd1Var3 = new exd1(jxd1Var, this, (byte) 2);
        boolean zContains = enumSet.contains(ose0.a);
        ete0 ete0Var = ete0.a0;
        this.b = zContains ? fxd1Var2 : ete0Var;
        this.c = enumSet.contains(ose0.b) ? fxd1Var : ete0Var;
        this.d = enumSet.contains(ose0.c) ? exd1Var : ete0Var;
        this.e = enumSet.contains(ose0.d) ? gxd1Var : ete0Var;
        this.f = enumSet.contains(ose0.e) ? gxd1Var2 : ete0Var;
        this.g = enumSet.contains(ose0.f) ? exd1Var2 : ete0Var;
        this.h = enumSet.contains(ose0.g) ? exd1Var3 : ete0Var;
    }

    @Override // p.tre0
    public final ete0 a() {
        return this.f;
    }

    @Override // p.tre0
    public final ete0 b() {
        return this.c;
    }

    @Override // p.tre0
    public final ete0 breadcrumb() {
        return this.g;
    }

    @Override // p.tre0
    public final ete0 c() {
        return this.d;
    }

    @Override // p.tre0
    public final ete0 d() {
        return this.b;
    }

    @Override // p.tre0
    public final ete0 e() {
        return this.h;
    }

    @Override // p.tre0
    public final ete0 f() {
        return this.e;
    }

    public final String g(char c, String str, String str2, Throwable th) {
        String str3 = (String) this.a.invoke();
        int length = str3.length() + 6;
        List list = Logger.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + String.valueOf(str).length() + length);
        sb.append(c);
        sb.append(' ');
        sb.append(str3);
        sb.append(" [");
        sb.append(str);
        sb.append("] ");
        sb.append(str2);
        if (th != null) {
            String stackTraceString = Log.getStackTraceString(th);
            sb.append(' ');
            String strF = Logger.f(stackTraceString, new Object[0]);
            if (strF != null) {
                stackTraceString = strF;
            }
            sb.append(stackTraceString);
        }
        return sb.toString();
    }
}
