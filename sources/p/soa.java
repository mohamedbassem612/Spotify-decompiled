package p;

import android.content.Context;
import android.os.Handler;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.boombox.audiosink.NativeAudioSinkChainFactory;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class soa {
    public ktp0 B;
    public yna D;
    public sr20 E;
    public final Context a;
    public final l270 b;
    public final yqu0 c;
    public final g06 d;
    public final yqg e;
    public final Handler f;
    public final ArrayList g;
    public final a0b h;
    public final qma i;
    public final q8n j;
    public final i5w0 k;
    public final i5w0 l;
    public final spq0 m;
    public final um51 n;
    public final o2p o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i5w0 f109p;
    public final q8n q;
    public final o5n r;
    public final tdj1 s;
    public final cuw t;
    public w2k1 u;
    public String w;
    public boolean x;
    public boolean y;
    public bpa z;
    public ArrayList v = new ArrayList();
    public ArrayList A = new ArrayList(0);
    public un10 C = new tn10(false);

    public soa(Context context, l270 l270Var, yqu0 yqu0Var, g06 g06Var, yqg yqgVar, Handler handler, ArrayList arrayList, a0b a0bVar, qma qmaVar, q8n q8nVar, i5w0 i5w0Var, i5w0 i5w0Var2, spq0 spq0Var, um51 um51Var, o2p o2pVar, i5w0 i5w0Var3, q8n q8nVar2, o5n o5nVar, tdj1 tdj1Var, cuw cuwVar) {
        this.a = context;
        this.b = l270Var;
        this.c = yqu0Var;
        this.d = g06Var;
        this.e = yqgVar;
        this.f = handler;
        this.g = arrayList;
        this.h = a0bVar;
        this.i = qmaVar;
        this.j = q8nVar;
        this.k = i5w0Var;
        this.l = i5w0Var2;
        this.m = spq0Var;
        this.n = um51Var;
        this.o = o2pVar;
        this.f109p = i5w0Var3;
        this.q = q8nVar2;
        this.r = o5nVar;
        this.s = tdj1Var;
        this.t = cuwVar;
    }

    public final uoa a() {
        tdj1 tdj1Var;
        String str = this.w;
        if (str == null || str.length() == 0) {
            eg.m("Feature identifier must be specified");
            return null;
        }
        w2k1 w2k1Var = this.u;
        if (w2k1Var == null) {
            eg.m("Either a VideoSurfaceView or a VideoSurfaceManager must be specified");
            return null;
        }
        if (!this.y) {
            eg.m("withRoyaltyMediaSupport() must be called explicitly. Set to true in almost all cases — Spotify has legal obligations to report consumption. If unsure, reach out to #stream-reporting-support in Slack.");
            return null;
        }
        if (w2k1Var == null) {
            new w2k1();
            throw null;
        }
        qma qmaVar = this.i;
        w2k1Var.h(qmaVar.F1);
        boolean z = qmaVar.f1;
        w2k1Var.g = z;
        Iterator it = w2k1Var.b.iterator();
        while (it.hasNext()) {
            ((VideoSurfaceView) it.next()).setUseExoPlayerSubtitleViewStyling(z);
        }
        smc0 smc0VarN = k4p1.n();
        smc0VarN.addAll(this.g);
        smc0VarN.addAll(this.v);
        smc0 smc0VarK = k4p1.k(smc0VarN);
        un10 tn10Var = qmaVar.h ? this.C : new tn10(false);
        cz10 cz10Var = (cz10) this.k.a;
        String str2 = this.w;
        str2.getClass();
        yfu yfuVar = cz10Var.b.a(str2) ? new yfu(cz10Var.a, cz10Var.c, (byte) 6) : null;
        Long l = (!qmaVar.J1 || (tdj1Var = this.s) == null) ? null : (Long) tdj1Var.a.a.getValue();
        ps6 ps6Var = new ps6(qmaVar.o1 ? vby0.w(g5b1.a(qmaVar, false)) : z6x.a, (byte) 3);
        ArrayList arrayList = this.A;
        ktp0 ktp0Var = this.B;
        sr20 sr20Var = this.E;
        boolean z2 = qmaVar.g;
        bpa bpaVar = this.z;
        bjh0 bjh0Var = new bjh0(tn10Var, qmaVar.X, qmaVar.i, qmaVar.t, qmaVar.Y, qmaVar.Z, qmaVar.V0, qmaVar.W0, qmaVar.Z0, qmaVar.a1, qmaVar.d1, qmaVar.e1, qmaVar.g1, qmaVar.Q1, qmaVar.b1, qmaVar.c1);
        boolean z3 = qmaVar.N0;
        String str3 = this.w;
        str3.getClass();
        s590 s590Var = new s590(this.a, this.b, this.c, this.h, ps6Var, arrayList, ktp0Var, sr20Var, z2, bpaVar, bjh0Var, z3, str3, new yu3(qmaVar.P0, qmaVar.Q0, (NativeAudioSinkChainFactory) this.m.h(), (gma) this.l.a, (byte) 13), yfuVar, this.q, (b2b1) this.f109p.a, qmaVar.h1, qmaVar.i1, qmaVar.v1, qmaVar.w1, qmaVar.K1, qmaVar.M1, qmaVar.P1, this.r, l, qmaVar.T1, qmaVar.U1, qmaVar.V1);
        yfu yfuVar2 = yfuVar;
        String str4 = this.w;
        str4.getClass();
        boolean z4 = qmaVar.S1;
        Handler handler = this.f;
        yqg yqgVar = this.e;
        lgy lgyVar = new lgy(smc0VarK, handler, yqgVar, str4, z4);
        bpa bpaVar2 = this.z;
        a0c0 a0c0Var = new a0c0(s590Var, this.j, yqgVar, this.d, lgyVar, this.D, bpaVar2 instanceof kma ? (kma) bpaVar2 : null, yfuVar2, this.x, qmaVar.O0, qmaVar.G1, this.n, qmaVar.R0, this.o, qmaVar.L1, this.t, qmaVar.U1);
        String str5 = this.w;
        str5.getClass();
        return new uoa(a0c0Var, w2k1Var, str5, qmaVar.U1);
    }
}
