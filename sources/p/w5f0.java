package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class w5f0 implements hfh0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ x5f0 f;

    public w5f0(int i, int i2, Map map, iu30 iu30Var, iu30 iu30Var2, x5f0 x5f0Var) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = iu30Var;
        this.e = iu30Var2;
        this.f = x5f0Var;
    }

    @Override // p.hfh0
    public final void a() {
        this.e.invoke(this.f.P0);
    }

    @Override // p.hfh0
    public final Map c() {
        return this.c;
    }

    @Override // p.hfh0
    public final iu30 e() {
        return this.d;
    }

    @Override // p.hfh0
    public final int getHeight() {
        return this.b;
    }

    @Override // p.hfh0
    public final int getWidth() {
        return this.a;
    }
}
