package p;

import com.spotify.player.model.PlayOrigin;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gc3 implements h0r0 {
    public final uwn a;
    public final lc3 b;
    public final dp5 c;
    public final otu d;
    public final sjq0 e;
    public final mta f;
    public final ioc g;
    public final ip31 h;
    public final x83 i;
    public final myq0 j;
    public final boolean k;
    public final abm l;
    public final cbr0 m;

    public gc3(uwn uwnVar, lc3 lc3Var, dp5 dp5Var, otu otuVar, sjq0 sjq0Var, mta mtaVar, ioc iocVar, ip31 ip31Var, x83 x83Var, myq0 myq0Var, boolean z, abm abmVar) {
        this.a = uwnVar;
        this.b = lc3Var;
        this.c = dp5Var;
        this.d = otuVar;
        this.e = sjq0Var;
        this.f = mtaVar;
        this.g = iocVar;
        this.h = ip31Var;
        this.i = x83Var;
        this.j = myq0Var;
        this.k = z;
        this.l = abmVar;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.m = new cbr0(new dbr0[]{new bn70(yon1.K(), nik1.M.b(lc3Var.getUri()), (nar0) null), new q1r0(false), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    public final cbr0 a() {
        return this.m;
    }

    public final p2r0 b() {
        PlayOrigin playOrigin = this.j.get();
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        h72 h72VarA = uwn.a(this.a, this.f, this.g, playOrigin, yon1.K());
        String uri = this.b.getUri();
        xj61 xj61Var = new xj61();
        if (this.l.a()) {
            xj61Var.add(bql.class);
        }
        kp00 kp00VarC = vqo1.c(cwl1.j(xj61Var), ra3.Y0);
        byte b = 0;
        return h72.s(h72VarA, uri, kp00VarC, new ec3(this, b), new fc3(this, b), new q30(this, (byte) 4), new jm1(this, (byte) 27), 64);
    }
}
