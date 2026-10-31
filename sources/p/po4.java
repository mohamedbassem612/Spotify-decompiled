package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class po4 implements pdy0 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final luk d;
    public final idd1 e = new idd1(new zn4(this, (byte) 11));

    public po4(int i, luk lukVar, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = lukVar;
    }

    public final int a() {
        po4 po4Var = (po4) this.e.getValue();
        return po4Var != null ? po4Var.a() : this.a;
    }

    public final boolean b() {
        po4 po4Var = (po4) this.e.getValue();
        return po4Var != null ? po4Var.b() : this.b;
    }

    public final boolean c() {
        po4 po4Var = (po4) this.e.getValue();
        return po4Var != null ? po4Var.c() : this.c;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("number_of_retries", "android-libs-storage", a(), 0, 15), new fpb("touch_dirs_on_background", "android-libs-storage", b()), new fpb("wait_for_mounted_storage", "android-libs-storage", c()));
    }
}
