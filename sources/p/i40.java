package p;

import android.content.Context;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i40 implements xpw, cvl1 {
    public final idd1 N0 = new idd1(new g40(this, (byte) 1));
    public final idd1 O0 = new idd1(new g40(this, (byte) 2));
    public final idd1 P0 = new idd1(new g40(this, (byte) 0));
    public final poy0 Q0 = d4o1.f(new f40(this, (byte) 0), new f40(this, (byte) 1), new ab(this, (byte) 6), new f40(this, (byte) 2), 8);
    public final hy00 R0 = n3o1.r(this).c(h40.b, n1.Q0);
    public final psw S0;
    public final zr00 X;
    public final yh2 Y;
    public final boolean Z;
    public final kko a;
    public final bpb1 b;
    public final myq0 c;
    public final htr d;
    public final ggv e;
    public final ahr f;
    public final Context g;
    public final vgm h;
    public final lo60 i;
    public final gw70 t;

    public i40(kko kkoVar, bpb1 bpb1Var, myq0 myq0Var, htr htrVar, ggv ggvVar, ahr ahrVar, Context context, vgm vgmVar, lo60 lo60Var, gw70 gw70Var, zr00 zr00Var, yh2 yh2Var, boolean z) {
        this.a = kkoVar;
        this.b = bpb1Var;
        this.c = myq0Var;
        this.d = htrVar;
        this.e = ggvVar;
        this.f = ahrVar;
        this.g = context;
        this.h = vgmVar;
        this.i = lo60Var;
        this.t = gw70Var;
        this.X = zr00Var;
        this.Y = yh2Var;
        this.Z = z;
        j2i j2iVar = new j2i(866459238, new r1(this, (byte) 5), true);
        ien0 ien0Var = qsw.a;
        this.S0 = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.R0;
    }

    public final jsw c() {
        return this.S0;
    }

    public final e40 e(d40 d40Var, iix0 iix0Var, boolean z, boolean z2) {
        String strF;
        y30 y30Var;
        String str = d40Var.a;
        String str2 = d40Var.b;
        String str3 = d40Var.c;
        String str4 = d40Var.d;
        if (iix0Var instanceof gix0) {
            gix0 gix0Var = (gix0) iix0Var;
            strF = String.format(this.g.getResources().getString(2131951798), Arrays.copyOf(new Object[]{this.f.a((gix0Var.b - gix0Var.c) / 1000)}, 1));
        } else {
            strF = f4i1.f(this.d.b(d40Var.h), " • ", this.e.a(d40Var.g, new fgv(4, 2)));
        }
        int iOrdinal = d40Var.f.ordinal();
        if (iOrdinal != 1) {
            y30Var = iOrdinal != 3 ? null : new y30(2, z2);
        } else {
            y30Var = new y30(1, z);
        }
        return new e40(str, str2, str3, str4, strF, y30Var);
    }

    public final mqw getBehavior() {
        return this.Q0;
    }
}
