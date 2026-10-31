package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class v7x0 implements xpw {
    public final psw X;
    public final ia00 Y;
    public final lzn0 a;
    public final kt91 b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final rey0 t;

    public v7x0(lzn0 lzn0Var, kt91 kt91Var, String str) {
        this.a = lzn0Var;
        this.b = kt91Var;
        Set set = s4b1.f;
        String strZ = uic.C(str, (String) null).z();
        strZ.getClass();
        this.c = strZ;
        String strZ2 = uic.x("spotify:edit:profile").z();
        strZ2.getClass();
        this.d = strZ2;
        String strZ3 = uic.C(str, "followers").z();
        strZ3.getClass();
        this.e = strZ3;
        String strZ4 = uic.C(str, "following").z();
        strZ4.getClass();
        this.f = strZ4;
        String strZ5 = uic.x("spotify:edit:profile:bio").z();
        strZ5.getClass();
        this.g = strZ5;
        String strZ6 = uic.x("spotify:edit:profile:privacy-settings").z();
        strZ6.getClass();
        this.h = strZ6;
        this.i = pcf.g(str);
        this.t = new rey0(new dvt0(this, (byte) 16));
        j2i j2iVar = y9j.a;
        ien0 ien0Var = qsw.a;
        this.X = new psw(j2iVar, (byte) 0);
        this.Y = n3o1.q(this).a(new u7x0(this, (byte) 0), new u7x0(this, (byte) 1));
    }

    public final rqw a() {
        return this.Y;
    }

    public final jsw c() {
        return this.X;
    }

    public final mqw getBehavior() {
        return this.t;
    }
}
