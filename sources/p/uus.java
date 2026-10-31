package p;

import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uus {
    public final mus a;
    public final WeakReference b;
    public final d3j0 c;
    public final Function0 d;
    public final Function0 e;
    public final iu30 f;

    public uus(mus musVar, WeakReference weakReference, d3j0 d3j0Var, Function0 function0, Function0 function1, iu30 iu30Var) {
        this.a = musVar;
        this.b = weakReference;
        this.c = d3j0Var;
        this.d = function0;
        this.e = function1;
        this.f = iu30Var;
    }

    public final WeakReference a() {
        return this.b;
    }

    public final iu30 b() {
        return this.f;
    }

    public final d3j0 c() {
        return this.c;
    }

    public final mus d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uus) {
            uus uusVar = (uus) obj;
            if (this.a == uusVar.a && this.b.equals(uusVar.b) && this.c.equals(uusVar.c) && u890.j(this.d, uusVar.d) && u890.j(this.e, uusVar.e) && u890.j(this.f, uusVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        Function0 function0 = this.d;
        int iHashCode2 = (iHashCode + (function0 == null ? 0 : function0.hashCode())) * 31;
        Function0 function1 = this.e;
        int iHashCode3 = (iHashCode2 + (function1 == null ? 0 : function1.hashCode())) * 31;
        iu30 iu30Var = this.f;
        return iHashCode3 + (iu30Var != null ? iu30Var.hashCode() : 0);
    }
}
