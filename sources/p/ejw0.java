package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ejw0 implements ni31 {
    public final v3v0 a;
    public final dk31 b;

    public ejw0(zle1 zle1Var, String str, v3v0 v3v0Var) {
        this.a = v3v0Var;
        this.b = new dk31(zle1Var, "prepare_rive_video_preview", "preview_preparation", str);
    }

    @Override // p.ni31
    public final Object a(String str, si31 si31Var, ri31 ri31Var) {
        return this.b.a(str, si31Var, ri31Var);
    }

    @Override // p.ni31
    public final Object b(String str, ob01 ob01Var, elu0 elu0Var) {
        return this.b.b(str, ob01Var, elu0Var);
    }

    @Override // p.ni31
    public final Object c(ob01 ob01Var, pi31 pi31Var) {
        return this.b.h("rive_file_loading", ob01Var, pi31Var);
    }

    public final boolean d(int i) {
        Map map = b7x.a;
        if (!this.b.f(i, map, map, z6x.a)) {
            return false;
        }
        this.a.invoke(this);
        return true;
    }

    public final Object e(ob01 ob01Var, cm31 cm31Var) {
        return this.b.g("share_id_resolution", ob01Var, cm31Var);
    }

    public final void f(String str) {
        dk31 dk31Var = this.b;
        synchronized (dk31Var.c) {
            if (!dk31Var.j && dk31Var.g == null) {
                dk31Var.g = ek31.b(str);
            }
        }
    }
}
