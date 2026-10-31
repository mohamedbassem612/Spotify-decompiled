package p;

import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ahm1 implements xgm1 {
    public final q8n a;
    public final a b;
    public final jge c;
    public final qfm1 d;
    public final bpb1 e;
    public Disposable f;
    public final AtomicReference g;
    public final bpb1 h;

    public ahm1(q8n q8nVar, a aVar, jge jgeVar, qfm1 qfm1Var) {
        this.a = q8nVar;
        this.b = aVar;
        this.c = jgeVar;
        this.d = qfm1Var;
        bpb1 bpb1VarB = gio1.b(new wgm1(null, b7x.a, new egm1(null, false, 63), false));
        this.e = bpb1VarB;
        this.g = new AtomicReference(null);
        this.h = bpb1VarB;
    }

    @Override // p.xgm1
    public final void a(vgm1 vgm1Var) {
        this.g.getAndUpdate(new w87(vgm1Var, this, (byte) 2));
    }

    @Override // p.xgm1
    public final zob1 getState() {
        return this.h;
    }
}
