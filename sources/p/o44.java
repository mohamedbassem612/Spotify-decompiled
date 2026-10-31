package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class o44 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new m44(this, (byte) 1));

    public o44(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        o44 o44Var = (o44) this.d.getValue();
        return o44Var != null ? o44Var.a() : this.a;
    }

    public final boolean b() {
        o44 o44Var = (o44) this.d.getValue();
        return o44Var != null ? o44Var.b() : this.b;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("clear_stream_slot_on_sponsored_context_mismatch", "android-adsdisplay-sponsorshipimpl", a()), new fpb("clear_stream_slot_on_sponsorship_update", "android-adsdisplay-sponsorshipimpl", b()));
    }
}
