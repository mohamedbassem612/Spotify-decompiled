package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xft extends hc11 {
    public static final /* synthetic */ mma0[] e = {new cey0(xft.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", 0), new cey0(xft.class, "annotations", "getAnnotations()Ljava/util/List;", 0)};
    public final lft a;
    public final int b;
    public final int c;
    public final mc11 d;

    public xft(lft lftVar, int i, int i2, Function0 function0) {
        this.a = lftVar;
        this.b = i;
        this.c = i2;
        this.d = jhc1.A((jyc) null, function0);
        jhc1.A((jyc) null, new wft(this, (byte) 0));
    }

    @Override // p.hc11
    public final dc11 e() {
        return this.a;
    }

    public final List getAnnotations() {
        throw null;
    }

    @Override // p.hc11
    public final String getName() {
        lpr0 lpr0VarY = y();
        tsi1 tsi1Var = lpr0VarY instanceof tsi1 ? (tsi1) lpr0VarY : null;
        if (tsi1Var != null && !tsi1Var.z1().Y()) {
            ajn0 name = tsi1Var.getName();
            if (!name.b) {
                return name.b();
            }
        }
        return null;
    }

    @Override // p.hc11
    public final boolean l() {
        lpr0 lpr0VarY = y();
        tsi1 tsi1Var = lpr0VarY instanceof tsi1 ? (tsi1) lpr0VarY : null;
        return tsi1Var != null && tsi1Var.y1();
    }

    @Override // p.hc11
    public final int n() {
        return this.b;
    }

    @Override // p.hc11
    public final int s() {
        return this.c;
    }

    @Override // p.hc11
    public final oma0 t() {
        rgt rgtVar = new rgt(y().getType(), new wft(this, (byte) 1), false);
        lft lftVar = this.a;
        oma0 oma0Var = vma0.b(lftVar.b.b, rgtVar).b;
        if (oma0Var != null) {
            return oma0Var;
        }
        sh10.e(lftVar);
        throw null;
    }

    @Override // p.hc11
    public final boolean w() {
        lpr0 lpr0VarY = y();
        tsi1 tsi1Var = lpr0VarY instanceof tsi1 ? (tsi1) lpr0VarY : null;
        if (tsi1Var != null) {
            return kht.a(tsi1Var);
        }
        return false;
    }

    @Override // p.hc11
    public final boolean x() {
        lpr0 lpr0VarY = y();
        return (lpr0VarY instanceof tsi1) && ((tsi1) lpr0VarY).X != null;
    }

    public final lpr0 y() {
        mma0 mma0Var = e[0];
        return (lpr0) this.d.invoke();
    }
}
