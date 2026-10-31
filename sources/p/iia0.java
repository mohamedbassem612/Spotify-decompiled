package p;

import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class iia0 implements deg {
    public static final ajn0 g;
    public static final heg h;
    public final ajm0 a;
    public final iu30 b;
    public final toe0 c;
    public static final /* synthetic */ mma0[] e = {new cey0(iia0.class, "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;", 0)};
    public static final jma d = new jma((byte) 14);
    public static final kf30 f = sfb1.l;

    static {
        lf30 lf30Var = rfb1.c;
        g = lf30Var.g();
        kf30 kf30VarI = lf30Var.i();
        h = new heg(kf30VarI.b(), kf30VarI.a.g());
    }

    public iia0(voe0 voe0Var, ajm0 ajm0Var) {
        aht ahtVar = aht.R0;
        this.a = ajm0Var;
        this.b = ahtVar;
        this.c = new toe0(voe0Var, new na((Object) this, (Object) voe0Var, (byte) 22));
    }

    @Override // p.deg
    public final Collection a(kf30 kf30Var) {
        if (!kf30Var.equals(f)) {
            return w7x.a;
        }
        mma0 mma0Var = e[0];
        return Collections.singleton((eeg) this.c.invoke());
    }

    @Override // p.deg
    public final boolean b(kf30 kf30Var, ajn0 ajn0Var) {
        return ajn0Var.equals(g) && kf30Var.equals(f);
    }

    @Override // p.deg
    public final beg c(heg hegVar) {
        if (!hegVar.equals(h)) {
            return null;
        }
        mma0 mma0Var = e[0];
        return (eeg) this.c.invoke();
    }
}
