package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ujh implements pdy0 {
    public final int a;
    public final luk b;
    public final idd1 c = new idd1(new lwe(this, (byte) 29));

    public ujh(int i, luk lukVar) {
        this.a = i;
        this.b = lukVar;
    }

    public final int a() {
        ujh ujhVar = (ujh) this.c.getValue();
        return ujhVar != null ? ujhVar.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("card_cache_ttl_minutes", "comments-data-impl", a(), 0, 1440));
    }
}
