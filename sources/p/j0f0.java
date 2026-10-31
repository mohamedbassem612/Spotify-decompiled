package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j0f0 {
    public final String a;
    public final String b;
    public final hux c;
    public final h0f0 d;
    public final h0f0 e;
    public final i3u f;
    public final Function0 g;
    public final Function0 h;

    public j0f0(String str, String str2, hux huxVar, h0f0 h0f0Var, h0f0 h0f0Var2, i3u i3uVar, Function0 function0, Function0 function1, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        huxVar = (i & 4) != 0 ? null : huxVar;
        h0f0Var2 = (i & 16) != 0 ? null : h0f0Var2;
        i3uVar = (i & 32) != 0 ? new i3u(7, false, false, false) : i3uVar;
        function0 = (i & 64) != 0 ? wce0.e1 : function0;
        function1 = (i & 128) != 0 ? i0f0.b : function1;
        this.a = str;
        this.b = str2;
        this.c = huxVar;
        this.d = h0f0Var;
        this.e = h0f0Var2;
        this.f = i3uVar;
        this.g = function0;
        this.h = function1;
    }

    public final Function0 a() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0f0)) {
            return false;
        }
        j0f0 j0f0Var = (j0f0) obj;
        return u890.j(this.a, j0f0Var.a) && u890.j(this.b, j0f0Var.b) && u890.j(this.c, j0f0Var.c) && this.d.equals(j0f0Var.d) && u890.j(this.e, j0f0Var.e) && this.f.equals(j0f0Var.f) && this.g.equals(j0f0Var.g) && this.h.equals(j0f0Var.h);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        hux huxVar = this.c;
        int iHashCode3 = (this.d.hashCode() + ((iHashCode2 + (huxVar == null ? 0 : huxVar.hashCode())) * 31)) * 31;
        h0f0 h0f0Var = this.e;
        return this.h.hashCode() + rjx.n((this.f.hashCode() + ((iHashCode3 + (h0f0Var != null ? h0f0Var.hashCode() : 0)) * 31)) * 31, 31, this.g);
    }
}
