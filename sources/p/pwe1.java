package p;

import android.content.Context;
import android.net.Uri;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pwe1 implements s771 {
    public final Context a;
    public final xid b;

    public pwe1(Context context, xid xidVar) {
        this.a = context;
        this.b = xidVar;
    }

    public static u771 c(ybz ybzVar, c871 c871Var, tka0 tka0Var, ez61 ez61Var, z771 z771Var, boolean z, String str) {
        return new u771(new t771(new wa71(ybzVar.b.a, null, null, null, null, null, null, 126), z771Var), new pz61(new y171(tka0Var), c871Var, ez61Var, ybzVar.b.e), new bj71(null, z, str, 1));
    }

    @Override // p.s771
    public final boolean a(ybz ybzVar) {
        return true;
    }

    @Override // p.s771
    public final Object b(ybz ybzVar, String str, lnm lnmVar) {
        String str2;
        jlw0 jlw0Var;
        String str3;
        j1z j1zVar = ybzVar.b;
        j1z j1zVar2 = ybzVar.b;
        llg llgVar = ybzVar.d;
        so71 so71Var = ybzVar.f;
        h281 h281Var = ybzVar.a;
        long jU = jfv.u(fdg1.l0(j1zVar.h, ngv.d), ngv.e);
        int i = (int) (jU / 3600);
        int i2 = ((int) (jU / 60)) - (i * 60);
        long j = jU % 60;
        String str4 = i > 0 ? String.format(Locale.US, "%d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j)}, 3)) : String.format(Locale.US, "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i2), Long.valueOf(j)}, 2));
        if (str != null) {
            return d(ybzVar, str4, str);
        }
        boolean zA = j1zVar.a();
        xid xidVar = this.b;
        Context context = this.a;
        if (!zA) {
            if (j1zVar.f) {
                return d(ybzVar, str4, null);
            }
            llg llgVar2 = ybzVar.d;
            jlw0 jlw0Var2 = j1zVar.c;
            int i3 = so71Var.a;
            int i4 = so71Var.c;
            if (llgVar2 == null || (str2 = llgVar2.b) == null) {
                str2 = j1zVar.b;
            }
            String str5 = str2;
            String str6 = h281Var != null ? h281Var.b : null;
            return c(ybzVar, new mt7(jlw0Var2, i3, i4, str5, str6 == null ? "" : str6, xidVar.n(llgVar2, j1zVar.h, false, j1zVar.i), llgVar2 != null ? llgVar2.c : null, j1zVar.b, new vve1(llgVar != null ? llgVar.d : j1zVar2.h), llgVar2 != null ? new vve1(llgVar2.e) : null, llgVar2 != null ? llgVar2.a : null), rc11.a.b(zs7.class), bz61.d, tyo1.p(blc0.Cg, new String[0]), true, context.getString(2131963218, str4));
        }
        llg llgVar3 = ybzVar.d;
        s171 s171VarN = xidVar.n(llgVar3, j1zVar.h, true, j1zVar.i);
        jlw0 jlw0Var3 = ybzVar.e;
        if (h281Var == null || (jlw0Var = h281Var.c) == null) {
            jlw0Var = j1zVar.c;
        }
        jlw0 jlw0Var4 = jlw0Var;
        int i5 = so71Var.a;
        int i6 = so71Var.c;
        if (llgVar3 == null || (str3 = llgVar3.b) == null) {
            str3 = j1zVar.b;
        }
        String str7 = str3;
        String str8 = h281Var != null ? h281Var.b : null;
        String str9 = str8 == null ? "" : str8;
        long j2 = llgVar != null ? llgVar.d : j1zVar2.h;
        vve1 vve1Var = llgVar3 != null ? new vve1(llgVar3.e) : null;
        Uri uri = j1zVar.d;
        uri.getClass();
        return c(ybzVar, new u5k1(jlw0Var3, jlw0Var4, i5, i6, str7, str9, s171VarN, j2, vve1Var, uri, j1zVar.f, llgVar3 != null ? llgVar3.a : null, ybzVar.g, j1zVar.i), rc11.a.b(h4k1.class), ahl.a, tyo1.p(blc0.Eg, new String[0]), true, context.getString(2131963218, str4));
    }

    public final u771 d(ybz ybzVar, String str, String str2) {
        dee1 eee1Var;
        String str3;
        llg llgVar = ybzVar.d;
        j1z j1zVar = ybzVar.b;
        s171 s171VarN = this.b.n(llgVar, j1zVar.h, j1zVar.a(), j1zVar.i);
        llg llgVar2 = ybzVar.d;
        long j = llgVar2 != null ? llgVar2.d : j1zVar.h;
        if (str2 != null) {
            eee1Var = new dee1(str2);
        } else {
            eee1Var = new eee1(llgVar != null ? new vve1(llgVar.e) : null);
        }
        dee1 dee1Var = eee1Var;
        String str4 = j1zVar.a;
        so71 so71Var = ybzVar.f;
        int i = so71Var.a;
        int i2 = so71Var.c;
        jlw0 jlw0Var = j1zVar.c;
        if (llgVar == null || (str3 = llgVar.b) == null) {
            str3 = j1zVar.b;
        }
        String str5 = str3;
        h281 h281Var = ybzVar.a;
        String str6 = h281Var != null ? h281Var.b : null;
        if (str6 == null) {
            str6 = "";
        }
        return c(ybzVar, new c3e1(j, dee1Var, str4, i, i2, jlw0Var, str5, str6, s171VarN, llgVar != null ? llgVar.a : null, j1zVar.i), rc11.a.b(x1e1.class), az61.d, tyo1.p(str2 != null ? blc0.Fg : blc0.Dg, new String[0]), false, this.a.getString(2131963218, str));
    }
}
