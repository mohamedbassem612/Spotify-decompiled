package p;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x3 implements rs61 {
    public final /* synthetic */ byte a;
    public final kly0 b;
    public final p6r0 c;
    public final lik1 d;
    public final Set e;
    public final Set f;

    public x3(thq thqVar, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = thqVar;
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                this.c = yon1.G1("SETTINGS_INTEGRATIONS", "settings/integrations", 1823, "settings");
                this.d = nik1.i1;
                this.e = Collections.singleton(blc0.Vf);
                this.f = f46.S0(new blc0[]{blc0.uj, blc0.j6, blc0.T2, blc0.la});
                break;
            case 2:
                this.b = thqVar;
                AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                this.c = yon1.G1("SETTINGS_CONNECTIVITY", "settings/connectivity", 1811, "settings");
                this.d = nik1.d1;
                this.e = Collections.singleton(blc0.Qf);
                this.f = f46.S0(new blc0[]{blc0.e6, blc0.Wh});
                break;
            case 3:
                this.b = thqVar;
                AtomicReferenceArray atomicReferenceArray3 = p6r0.e;
                this.c = yon1.G1("SETTINGS_CONTENT_PERSONALIZATION", "settings/content-personalization", 1813, "settings");
                this.d = nik1.b1;
                this.e = Collections.singleton(blc0.Rf);
                this.f = f46.S0(new blc0[]{blc0.s5, blc0.I9});
                break;
            case 4:
                this.b = thqVar;
                AtomicReferenceArray atomicReferenceArray4 = p6r0.e;
                this.c = yon1.G1("SETTINGS_MEDIA_QUALITY", "settings/media-quality", 1830, "settings");
                this.d = nik1.c1;
                this.e = Collections.singleton(blc0.ag);
                this.f = f46.S0(new blc0[]{blc0.Oe, blc0.oj});
                break;
            case 5:
                this.b = thqVar;
                AtomicReferenceArray atomicReferenceArray5 = p6r0.e;
                this.c = yon1.G1("SETTINGS_PLAYBACK", "settings/playback", 1842, "settings");
                this.d = nik1.f1;
                this.e = Collections.singleton(blc0.Zf);
                this.f = Collections.singleton(blc0.Uc);
                break;
            case 6:
                this.b = thqVar;
                AtomicReferenceArray atomicReferenceArray6 = p6r0.e;
                this.c = yon1.G1("SETTINGS_SOCIAL", "settings/social", 1846, "settings");
                this.d = nik1.e1;
                this.e = Collections.singleton(blc0.cg);
                this.f = Collections.singleton(blc0.Dh);
                break;
            default:
                this.b = thqVar;
                AtomicReferenceArray atomicReferenceArray7 = p6r0.e;
                this.c = yon1.G1("SETTINGS_ABOUT", "settings/about", 1803, "settings");
                this.d = nik1.a1;
                this.e = Collections.singleton(blc0.Nf);
                this.f = Collections.singleton(blc0.f);
                break;
        }
    }

    public final Set a() {
        byte b = this.a;
        return this.e;
    }

    public final kly0 c() {
        byte b = this.a;
        return this.b;
    }

    public final Set d() {
        byte b = this.a;
        return this.f;
    }

    public final p6r0 e() {
        byte b = this.a;
        return this.c;
    }

    public final lik1 getViewUri() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
        return this.d;
    }
}
