package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wdb1 implements zqw {
    public final d0r a;
    public final bk90 b;
    public final wrq c;
    public final waz0 d;
    public final n381 e = p381.a;
    public final vr51 f = new vr51(this, (byte) 18);
    public final gga1 g = new gga1(this, (byte) 16);

    public wdb1(d0r d0rVar, bk90 bk90Var, wrq wrqVar, waz0 waz0Var) {
        this.a = d0rVar;
        this.b = bk90Var;
        this.c = wrqVar;
        this.d = waz0Var;
    }

    @Override // p.zqw
    public final m381 c() {
        return this.e;
    }

    @Override // p.zqw
    public final boolean d(hwq hwqVar) {
        return true;
    }

    @Override // p.zqw
    public final Function0 e() {
        return this.g;
    }
}
