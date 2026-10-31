package p;

import java.lang.reflect.Type;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class b7 implements h4t, gq20, sx81, c0h1, oma0 {
    public final mc11 a;

    public b7(Function0 function0) {
        mc11 mc11VarA = null;
        mc11 mc11Var = function0 instanceof mc11 ? (mc11) function0 : null;
        if (mc11Var != null) {
            mc11VarA = mc11Var;
        } else if (function0 != null) {
            mc11VarA = jhc1.A((jyc) null, function0);
        }
        this.a = mc11VarA;
    }

    public abstract b7 A(boolean z);

    public b7 B() {
        return null;
    }

    public oma0 e() {
        return null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof b7) && sto1.q(e4x0.f, this, (e8b0) obj);
    }

    public int hashCode() {
        jla0 jla0VarK = k();
        int iHashCode = jla0VarK != null ? jla0VarK.hashCode() : 0;
        return Boolean.hashCode(i()) + ((v().hashCode() + (iHashCode * 31)) * 31);
    }

    public final Type l() {
        mc11 mc11Var = this.a;
        if (mc11Var != null) {
            return (Type) mc11Var.invoke();
        }
        return null;
    }

    public tka0 n() {
        return null;
    }

    public boolean s() {
        return false;
    }

    public boolean t() {
        return false;
    }

    public String toString() {
        return f4x0.r(this, false);
    }

    public boolean w() {
        return false;
    }

    public boolean x() {
        return false;
    }

    public b7 y() {
        return null;
    }

    public b7 z(boolean z) {
        if (!z) {
            return this;
        }
        mna0.d(this, "Definitely not null captured type is not supported yet: ");
        return null;
    }
}
