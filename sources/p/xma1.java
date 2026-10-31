package p;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xma1 implements wma1 {
    public final String a;
    public final aip0 b;
    public final long c;
    public final bk20 d;
    public final boolean e;
    public yma1 f;
    public final AtomicBoolean g;
    public final String h;
    public final int i;

    public xma1(String str, aip0 aip0Var, long j, long j2, bk20 bk20Var, String str2, int i) {
        long jA = (i & 4) != 0 ? aip0Var.a() : j;
        long j3 = (i & 8) != 0 ? 0L : j2;
        bk20 bk20Var2 = (i & 16) != 0 ? bk20.P0 : bk20Var;
        String str3 = (i & 32) != 0 ? "" : str2;
        boolean z = (i & 64) == 0;
        this.a = str;
        this.b = aip0Var;
        this.c = jA;
        this.d = bk20Var2;
        this.e = z;
        this.f = new yma1(UUID.randomUUID(), str, jA, j3, new ConcurrentHashMap());
        this.g = new AtomicBoolean(false);
        String strH = z ? gvg.h("oops:", str3, ".", str) : "";
        this.h = strH;
        this.i = z ? bk20Var2.a(strH) : 0;
    }

    @Override // p.wma1
    public final void a(Long l) {
        if (this.g.compareAndSet(false, true)) {
            if (this.e) {
                this.d.b(this.h, this.i);
            }
            yma1 yma1Var = this.f;
            if (l != null) {
                this.f = yma1.a(yma1Var, l.longValue());
            } else {
                this.f = yma1.a(yma1Var, this.b.a());
            }
        }
    }
}
