package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yx71 extends hab0 implements iu30 {
    public final /* synthetic */ ew71 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ List c;
    public final /* synthetic */ ew71 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ iu30 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx71(ew71 ew71Var, boolean z, List list, ew71 ew71Var2, boolean z2, boolean z3, boolean z4, iu30 iu30Var) {
        super(1);
        this.a = ew71Var;
        this.b = z;
        this.c = list;
        this.d = ew71Var2;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = iu30Var;
    }

    public final Object invoke(Object obj) {
        kex kexVar = (kex) obj;
        boolean z = this.b;
        iu30 iu30Var = this.h;
        ew71 ew71Var = this.a;
        if (ew71Var != null && !z) {
            kexVar.a("clear", new j2i(-701781929, new dj71(new m861(iu30Var, (byte) 24), (byte) 8), true));
        }
        for (ew71 ew71Var2 : this.c) {
            kexVar.a(ew71Var2.name(), new j2i(-113791371, new zp51(ew71Var2, ew71Var, z, iu30Var), true));
        }
        if (this.d == ew71.SONGS) {
            kexVar.a("make-playlist", new j2i(-1200391234, new vdy(new m861(iu30Var, (byte) 25), this.g, this.f, this.e), true));
        }
        return rih1.a;
    }
}
