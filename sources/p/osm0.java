package p;

import com.spotify.cosmos.callbackrouter.CallbackRouter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class osm0 {
    public final yqg a;
    public final dlp b;
    public final kly0 c;
    public final fpa d;
    public final ign0 e;
    public final boolean f;
    public final sec1 g;
    public final qt4 h;
    public final d0u0 i;
    public final w2k1 j = new w2k1();

    public osm0(yqg yqgVar, dlp dlpVar, kly0 kly0Var, fpa fpaVar, ign0 ign0Var, boolean z, sec1 sec1Var, qt4 qt4Var, d0u0 d0u0Var) {
        this.a = yqgVar;
        this.b = dlpVar;
        this.c = kly0Var;
        this.d = fpaVar;
        this.e = ign0Var;
        this.f = z;
        this.g = sec1Var;
        this.h = qt4Var;
        this.i = d0u0Var;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    /* JADX WARN: Code duplicated, block: B:19:0x008f  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:26:0x00df  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e7  */
    public final w590 a(esm0 esm0Var, w2k1 w2k1Var, int i, un10 un10Var, List list) {
        String str;
        String str2;
        boolean z;
        w2k1 w2k1Var2;
        un10 sn10Var;
        sec1 sec1Var;
        ynb0 ynb0Var;
        ym21 ym21Var = new ym21(esm0Var.b);
        d0u0 cv7Var = new cv7();
        bas basVarA = ym21Var.a();
        qt4 qt4Var = this.h;
        int iOrdinal = qt4Var.ordinal();
        tec1 tec1Var = null;
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                str2 = null;
            } else {
                str = "config_param:use_multiplayer_sr_module";
            }
            if (str2 != null) {
                sec1Var = this.g;
                ynb0Var = sec1Var.b;
                if (((c25) ynb0Var.get()).a()) {
                    z9q z9qVar = sec1Var.a;
                    boolean zB = ((c25) ynb0Var.get()).b();
                    daq daqVar = z9qVar.a.a;
                    tec1Var = new tec1(str2, cec1.p((CallbackRouter) daqVar.e3.get()), (yqg) daqVar.J1.get(), (q8n) daqVar.V2.get(), (q8n) daqVar.E1.get(), basVarA, (lvw0) daqVar.Z8.get(), zB);
                }
            }
            if (tec1Var == null && qt4Var == qt4.ENABLED) {
                z = true;
            } else {
                z = false;
            }
            woa woaVar = (woa) this.b.get();
            sr20 sr20Var = new sr20();
            if (w2k1Var == null) {
                w2k1Var2 = new w2k1();
            } else {
                w2k1Var2 = w2k1Var;
            }
            kma kmaVar = (kma) this.c.get();
            ArrayList arrayListN0 = o7h.N0(list, f46.i0(new d0u0[]{cv7Var, new cv7(new zem0(cv7Var, (byte) 2), (byte) 9), tec1Var, this.i}));
            boolean z2 = !z;
            if (un10Var == null) {
                sn10Var = new sn10();
            } else {
                sn10Var = un10Var;
            }
            return new w590(esm0Var, new n0g0(this.d, (byte) 10), new c4z(ym21Var, (byte) 28), new c4z(ym21Var, (byte) 29), new nsm0(ym21Var), sr20Var, woaVar.b("multiplayer", (o2u0) null, w2k1Var2, kmaVar, arrayListN0, z2, basVarA, sr20Var, sn10Var), new lbc0(woaVar), cv7Var, tec1Var, z, i);
        }
        str = "config_param:rcs_copy_mode_enabled";
        str2 = str;
        if (str2 != null) {
            sec1Var = this.g;
            ynb0Var = sec1Var.b;
            if (((c25) ynb0Var.get()).a()) {
                z9q z9qVar2 = sec1Var.a;
                boolean zB2 = ((c25) ynb0Var.get()).b();
                daq daqVar2 = z9qVar2.a.a;
                tec1Var = new tec1(str2, cec1.p((CallbackRouter) daqVar2.e3.get()), (yqg) daqVar2.J1.get(), (q8n) daqVar2.V2.get(), (q8n) daqVar2.E1.get(), basVarA, (lvw0) daqVar2.Z8.get(), zB2);
            }
        }
        if (tec1Var == null) {
            z = false;
        } else {
            z = false;
        }
        woa woaVar2 = (woa) this.b.get();
        sr20 sr20Var2 = new sr20();
        if (w2k1Var == null) {
            w2k1Var2 = new w2k1();
        } else {
            w2k1Var2 = w2k1Var;
        }
        kma kmaVar2 = (kma) this.c.get();
        ArrayList arrayListN1 = o7h.N0(list, f46.i0(new d0u0[]{cv7Var, new cv7(new zem0(cv7Var, (byte) 2), (byte) 9), tec1Var, this.i}));
        boolean z3 = !z;
        if (un10Var == null) {
            sn10Var = new sn10();
        } else {
            sn10Var = un10Var;
        }
        return new w590(esm0Var, new n0g0(this.d, (byte) 10), new c4z(ym21Var, (byte) 28), new c4z(ym21Var, (byte) 29), new nsm0(ym21Var), sr20Var2, woaVar2.b("multiplayer", (o2u0) null, w2k1Var2, kmaVar2, arrayListN1, z3, basVarA, sr20Var2, sn10Var), new lbc0(woaVar2), cv7Var, tec1Var, z, i);
    }

    public final utm0 b(esm0 esm0Var, int i) {
        return new utm0(this.a, new acu0(i, new dvg0(this, esm0Var, (byte) 21), this.f), this.e);
    }
}
