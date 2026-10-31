package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class c25 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new uz4(this, (byte) 25));

    public c25(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        c25 c25Var = (c25) this.d.getValue();
        return c25Var != null ? c25Var.a() : this.a;
    }

    public final boolean b() {
        c25 c25Var = (c25) this.d.getValue();
        return c25Var != null ? c25Var.b() : this.b;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("enable_stream_reporting_logger_prototype", "android-streamreporting-common-impl", a()), new fpb("enforce_stream_reporting_contract", "android-streamreporting-common-impl", b()));
    }
}
