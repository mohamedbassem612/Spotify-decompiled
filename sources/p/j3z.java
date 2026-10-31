package p;

import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j3z implements owo0 {
    public final /* synthetic */ byte a;
    public final yyn b;
    public final avp c;
    public final kko d;
    public final lv4 e;

    public /* synthetic */ j3z(yyn yynVar, avp avpVar, kko kkoVar, lv4 lv4Var, byte b) {
        this.a = b;
        this.b = yynVar;
        this.c = avpVar;
        this.d = kkoVar;
        this.e = lv4Var;
    }

    @Override // p.owo0
    public final tka0 e() {
        switch (this.a) {
            case 0:
                return rc11.a.b(bxo0.class);
            default:
                return rc11.a.b(yxo0.class);
        }
    }

    @Override // p.owo0
    public final void f(ji50 ji50Var) {
        byte b = this.a;
        avp avpVar = this.c;
        lv4 lv4Var = this.e;
        switch (b) {
            case 0:
                LinkedHashMap linkedHashMap = ji50Var.b;
                if (!lv4Var.b()) {
                    linkedHashMap.put(bxo0.class, r4o1.Q(lyy.P0, ryn.a, new hzw(this, (byte) 9), yty.X));
                } else {
                    linkedHashMap.put(bxo0.class, new r3r(new wzq(fdg1.m0(avpVar.a(ji50Var.a, new y0(2, 3, 28, false, false)), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), lyy.N0), yty.t, (vu30) null));
                }
                break;
            default:
                LinkedHashMap linkedHashMap2 = ji50Var.b;
                if (!lv4Var.b()) {
                    boolean zD = lv4Var.d();
                    linkedHashMap2.put(yxo0.class, r4o1.Q(rz71.N0, dm61.y0(ryn.a, zD ? ryn.b : w7x.a), new kf2(this, zD, (byte) 23), ea71.Z0));
                } else {
                    linkedHashMap2.put(yxo0.class, new r3r(new wzq(fdg1.m0(avpVar.a(ji50Var.a, new y0(2, 2, 12, false, lv4Var.d())), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), rz71.Y), ea71.Y0, (vu30) null));
                }
                break;
        }
    }
}
