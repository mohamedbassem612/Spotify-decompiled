package p;

import com.spotify.base.java.logging.Logger;
import java.util.EnumSet;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wre0 implements tre0 {
    public final zre0 a;
    public final ete0 b;
    public final ete0 c;
    public final ete0 d;
    public final ete0 e;
    public final ete0 f;
    public final ete0 g;
    public final ete0 h;

    public wre0(zre0 zre0Var, EnumSet enumSet) {
        ete0 ure0Var = new ure0(this, (byte) 0);
        vre0 hod0Var = new hod0(this, (byte) 5);
        vre0 d4e0Var = new d4e0(this, (byte) 3);
        vre0 vre0Var = new vre0(this, (byte) 0);
        vre0 dp5Var = new dp5(this, (byte) 24);
        ete0 ure0Var2 = new ure0(this, (byte) 1);
        vre0 vre0Var2 = new vre0(this, (byte) 1);
        this.a = zre0Var;
        boolean zContains = enumSet.contains(ose0.a);
        vre0 vre0Var3 = ete0.a0;
        this.b = zContains ? hod0Var : vre0Var3;
        this.c = enumSet.contains(ose0.b) ? ure0Var : vre0Var3;
        this.d = enumSet.contains(ose0.c) ? d4e0Var : vre0Var3;
        this.e = enumSet.contains(ose0.d) ? vre0Var : vre0Var3;
        this.f = enumSet.contains(ose0.e) ? dp5Var : vre0Var3;
        this.g = enumSet.contains(ose0.f) ? ure0Var2 : vre0Var3;
        this.h = enumSet.contains(ose0.g) ? vre0Var2 : vre0Var3;
    }

    public static String g(String str, String str2) {
        List list = Logger.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + String.valueOf(str).length() + 3);
        sb.append('[');
        sb.append(str);
        sb.append("] ");
        sb.append(str2);
        return sb.toString();
    }

    public final ete0 a() {
        return this.f;
    }

    public final ete0 b() {
        return this.c;
    }

    public final ete0 breadcrumb() {
        return this.g;
    }

    public final ete0 c() {
        return this.d;
    }

    public final ete0 d() {
        return this.b;
    }

    public final ete0 e() {
        return this.h;
    }

    public final ete0 f() {
        return this.e;
    }
}
