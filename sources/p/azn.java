package p;

import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class azn implements owo0 {
    public final yyn a;
    public final avp b;
    public final kko c;
    public final mv4 d;
    public final lv4 e;

    public azn(yyn yynVar, avp avpVar, kko kkoVar, mv4 mv4Var, lv4 lv4Var) {
        this.a = yynVar;
        this.b = avpVar;
        this.c = kkoVar;
        this.d = mv4Var;
        this.e = lv4Var;
    }

    @Override // p.owo0
    public final tka0 e() {
        return rc11.a.b(uwo0.class);
    }

    @Override // p.owo0
    public final void f(ji50 ji50Var) {
        LinkedHashMap linkedHashMap = ji50Var.b;
        if (this.e.b()) {
            linkedHashMap.put(uwo0.class, new r3r(new wzq(fdg1.m0(this.b.a(ji50Var.a, new y0(2, 1, 24, this.d.c(), false)), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), rwn.d), wmn.f, (vu30) null));
        } else {
            h1m h1mVar = new h1m(this, (byte) 24);
            linkedHashMap.put(uwo0.class, r4o1.Q(rwn.f, ryn.a, h1mVar, wmn.g));
        }
    }
}
