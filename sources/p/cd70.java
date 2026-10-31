package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cd70 extends uwo1 {
    public final ld70 c;
    public final ld70 d;
    public final j380 e;
    public final String f;
    public final /* synthetic */ dd70 g;

    public cd70(dd70 dd70Var, ld70 ld70Var, ld70 ld70Var2, j380 j380Var, String str) {
        this.g = dd70Var;
        this.c = ld70Var;
        this.d = ld70Var2;
        this.e = j380Var;
        this.f = str;
    }

    public final uwo1 L(String str) {
        if (u890.j(this.f, str)) {
            return this;
        }
        bd70 bd70Var = new bd70(this);
        bd70Var.f = str;
        return bd70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cd70)) {
            return false;
        }
        cd70 cd70Var = (cd70) obj;
        return u890.j(this.c, cd70Var.c) && u890.j(this.d, cd70Var.d) && this.e.equals(cd70Var.e) && u890.j(this.f, cd70Var.f);
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.d, this.e, this.f);
    }

    public final dd70 k() {
        return this.g;
    }
}
