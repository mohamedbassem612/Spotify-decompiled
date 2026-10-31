package p;

import java.io.File;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cim0 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final float[] e;
    public File f;
    public vhm0 g;
    public Runnable h;

    public cim0(String str, String str2, String str3, int i, float[] fArr) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = fArr;
    }

    public final String a() {
        return this.b;
    }

    public final vhm0 b() {
        return this.g;
    }

    public final File c() {
        return this.f;
    }

    public final float[] d() {
        return this.e;
    }

    public final String e() {
        return this.a;
    }

    public final int f() {
        return this.d;
    }

    public final void g(Runnable runnable) {
        this.h = runnable;
    }
}
