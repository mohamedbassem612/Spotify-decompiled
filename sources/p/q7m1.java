package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q7m1 extends hab0 implements iu30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ iu30 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7m1(boolean z, List list, Function0 function0, boolean z2, boolean z3, iu30 iu30Var) {
        super(1);
        this.a = z;
        this.b = list;
        this.c = function0;
        this.d = z2;
        this.e = z3;
        this.f = iu30Var;
    }

    public final Object invoke(Object obj) {
        kex kexVar = (kex) obj;
        if (this.a) {
            kexVar.a("notes", new j2i(-924563136, new ie1(this.c, this.d, (byte) 17), true));
        }
        for (jb20 jb20Var : this.b) {
            kexVar.a(l1d.m("selector:", jb20Var.a), new j2i(1971563700, new pa0(u890.j(jb20Var.a, "performances"), jb20Var, this.e, this.f, (byte) 14), true));
        }
        return rih1.a;
    }
}
