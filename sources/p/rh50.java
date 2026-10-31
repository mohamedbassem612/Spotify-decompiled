package p;

import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rh50 extends emc0 {
    public static final kn5 g = new kn5((byte) 17);
    public final zfx e;
    public final t2b f;

    public rh50(zfx zfxVar, t2b t2bVar) {
        super(g);
        this.e = zfxVar;
        this.f = t2bVar;
    }

    public final void n(int i, w611 w611Var) {
        fi50 fi50Var = (fi50) w611Var;
        r2b r2bVar = (r2b) ((emc0) this).d.f.get(i);
        fi50Var.V0.getClass();
        String str = r2bVar.b;
        String str2 = r2bVar.c;
        String str3 = r2bVar.d;
        if (str3 == null) {
            str3 = "";
        }
        fi50Var.U0.f(new ppi0(str, str2, str3));
    }

    public final w611 p(int i, ViewGroup viewGroup) {
        return new fi50(this.e.a((l0i) null), this.f);
    }
}
