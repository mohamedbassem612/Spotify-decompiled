package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cqj1 implements zqw {
    public final bk90 a;
    public final nuq b;
    public final vmm c = new vmm();
    public final h5a1 d = new h5a1(this, (byte) 22);
    public final dch1 e = new dch1(this, (byte) 23);

    public cqj1(bk90 bk90Var, nuq nuqVar) {
        this.a = bk90Var;
        this.b = nuqVar;
    }

    @Override // p.zqw
    public final m381 c() {
        return this.c;
    }

    @Override // p.zqw
    public final boolean d(hwq hwqVar) {
        l7e0 l7e0Var = hwqVar.g;
        if (!(l7e0Var instanceof j7e0)) {
            return false;
        }
        k1z k1zVar = ((j7e0) l7e0Var).a.p;
        return (k1zVar instanceof k1z) && k1zVar.o == e1z.b;
    }

    @Override // p.zqw
    public final Function0 e() {
        return this.e;
    }
}
