package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wf9 extends qg9 {
    public final String a;
    public final UUID b;
    public final og9 c;
    public final fi9 d;

    public wf9(String str, UUID uuid, og9 og9Var, fi9 fi9Var) {
        this.a = str;
        this.b = uuid;
        this.c = og9Var;
        this.d = fi9Var;
    }

    @Override // p.qg9
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wf9)) {
            return false;
        }
        wf9 wf9Var = (wf9) obj;
        return u890.j(this.a, wf9Var.a) && u890.j(this.b, wf9Var.b) && u890.j(this.c, wf9Var.c) && this.d == wf9Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
