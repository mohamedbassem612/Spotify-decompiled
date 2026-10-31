package p;

import com.spotify.idj.v1.BodySection;
import com.spotify.idj.v1.MicPermissionPageResponse;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class arj0 implements h0r0 {
    public final erj0 a;
    public final hvj b;
    public final nmk1 c;
    public final lzn0 d;
    public final a1r0 e;
    public final dg30 f;
    public final gw70 g;
    public final drj0 h;
    public final yge0 i;
    public final hrj0 j;
    public final gms0 k;
    public final AtomicBoolean l = new AtomicBoolean(false);
    public final cbr0 m;

    public arj0(erj0 erj0Var, hvj hvjVar, nmk1 nmk1Var, lzn0 lzn0Var, a1r0 a1r0Var, dg30 dg30Var, gw70 gw70Var, drj0 drj0Var, yge0 yge0Var, hrj0 hrj0Var) {
        this.a = erj0Var;
        this.b = hvjVar;
        this.c = nmk1Var;
        this.d = lzn0Var;
        this.e = a1r0Var;
        this.f = dg30Var;
        this.g = gw70Var;
        this.h = drj0Var;
        this.i = yge0Var;
        this.j = hrj0Var;
        this.k = yge0Var.f();
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.m = new cbr0(new dbr0[]{new bn70(yon1.J(), nik1.D4, (nar0) null), new t1r0(true), new s9h1(14, true, false, false), new hgr0(egr0.a, 0, 2)}, false);
    }

    public static boolean c(MicPermissionPageResponse micPermissionPageResponse) {
        h290<BodySection> h290VarN = micPermissionPageResponse.n();
        if (h290VarN.isEmpty()) {
            return false;
        }
        for (BodySection bodySection : h290VarN) {
            if (bodySection.hasDescription() && bodySection.n().q().length() > 0) {
                return true;
            }
        }
        return false;
    }

    public final cbr0 a() {
        return this.m;
    }

    public final p2r0 b() {
        return hvj.b(this.b, f610.e(new p6e0[0], new oxa0(this, (lnm) null, (byte) 16)), apo.j(1305112405, new mbj0(this, (byte) 5), true));
    }
}
