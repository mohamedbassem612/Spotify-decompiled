package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wjh implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final luk d;
    public final idd1 e;

    public wjh(int i, luk lukVar, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = lukVar;
        this.e = new idd1(new vjh(this, (byte) 0));
    }

    public final boolean a() {
        wjh wjhVar = (wjh) this.e.getValue();
        return wjhVar != null ? wjhVar.a() : this.a;
    }

    public final boolean b() {
        wjh wjhVar = (wjh) this.e.getValue();
        return wjhVar != null ? wjhVar.b() : this.b;
    }

    public final int c() {
        wjh wjhVar = (wjh) this.e.getValue();
        return wjhVar != null ? wjhVar.c() : this.c;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("enable_timestamps_for_episodes", "comments-data", a()), new fpb("enable_timestamps_for_passthrough_episodes", "comments-data", b()), new fpb("passthrough_timestamp_mapping_timeout_ms", "comments-data", c(), 100, 10000));
    }

    public wjh(luk lukVar) {
        this(5000, lukVar, false, false);
    }
}
