package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class osp0 {
    public final jn60 a;
    public final Map b;

    public osp0(jn60 jn60Var, Map map) {
        this.a = jn60Var;
        this.b = map;
    }

    public final jn60 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof osp0)) {
            return false;
        }
        osp0 osp0Var = (osp0) obj;
        return this.a.equals(osp0Var.a) && this.b.equals(osp0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
