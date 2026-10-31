package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hr4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new rq4(this, (byte) 11));

    public hr4(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        hr4 hr4Var = (hr4) this.d.getValue();
        return hr4Var != null ? hr4Var.a() : this.a;
    }

    public final boolean b() {
        hr4 hr4Var = (hr4) this.d.getValue();
        return hr4Var != null ? hr4Var.b() : this.b;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("enable_made_for_you_destination_page", "android-made-for-you-hub", a()), new fpb("enable_made_for_you_hub_page", "android-made-for-you-hub", b()));
    }
}
