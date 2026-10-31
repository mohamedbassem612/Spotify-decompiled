package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k3b extends hab0 implements iu30 {
    public final /* synthetic */ iu30 X;
    public final /* synthetic */ Function0 Y;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ sob1 b;
    public final /* synthetic */ ea61 c;
    public final /* synthetic */ yb20 d;
    public final /* synthetic */ c380 e;
    public final /* synthetic */ ic9 f;
    public final /* synthetic */ iu30 g;
    public final /* synthetic */ vu30 h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ Function0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3b(boolean z, sob1 sob1Var, ea61 ea61Var, yb20 yb20Var, c380 c380Var, ic9 ic9Var, iu30 iu30Var, vu30 vu30Var, boolean z2, Function0 function0, iu30 iu30Var2, Function0 function1) {
        super(1);
        this.a = z;
        this.b = sob1Var;
        this.c = ea61Var;
        this.d = yb20Var;
        this.e = c380Var;
        this.f = ic9Var;
        this.g = iu30Var;
        this.h = vu30Var;
        this.i = z2;
        this.t = function0;
        this.X = iu30Var2;
        this.Y = function1;
    }

    public final Object invoke(Object obj) {
        kex kexVar = (kex) obj;
        boolean z = this.a;
        ic9 ic9Var = this.f;
        if (z) {
            kexVar.a("notes", new j2i(2004561477, new zs((byte) 7, ic9Var, this.t, this.i), true));
        }
        iu30 iu30Var = this.X;
        ea61 ea61Var = this.c;
        kexVar.a("change-vibe", new j2i(1411463552, new zt6(ic9Var, iu30Var, ea61Var, (byte) 21), true));
        sob1 sob1Var = sob1.c;
        sob1 sob1Var2 = this.b;
        if (sob1Var2 == sob1Var) {
            kexVar.a("loading", j9i.a);
        }
        yb20 yb20Var = this.d;
        if (ea61Var != null) {
            kexVar.a("session-".concat(ea61Var.a), new j2i(-614615185, new wb6(ea61Var, ic9Var, yb20Var, this.Y, (byte) 24), true));
        }
        c380 c380Var = yb20Var.b;
        int i = 0;
        if (sob1Var2 == sob1.a) {
            while (i < 3) {
                kexVar.a(f4i1.c(i, "shimmer-"), j9i.b);
                i++;
            }
        } else {
            c380 c380Var2 = this.e;
            kexVar.b(c380Var2.size(), new j2i(-1673449743, new k8(c380Var2, ic9Var, yb20Var, this.g, (byte) 13), true), new s6(c380Var2, (byte) 12));
            for (Object obj2 : c380Var) {
                int i2 = i + 1;
                if (i < 0) {
                    p7h.T();
                    throw null;
                }
                ktc1 ktc1Var = (ktc1) obj2;
                kexVar.a("suggestion-".concat(ktc1Var.a), new j2i(-1222461610, new p1b(ktc1Var, ic9Var, i, this.h), true));
                i = i2;
            }
        }
        return rih1.a;
    }
}
