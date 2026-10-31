package p;

import android.net.Uri;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ity0 implements h0r0 {
    public final fty0 a;
    public final kyj b;
    public final kty0 c;
    public final jtl1 d;
    public final cbr0 e;

    public ity0(fty0 fty0Var, kyj kyjVar, kty0 kty0Var, jtl1 jtl1Var) {
        this.a = fty0Var;
        this.b = kyjVar;
        this.c = kty0Var;
        this.d = jtl1Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.e = new cbr0(new dbr0[]{new bn70(yon1.G1("PUFFIN_SETUP_UNSUPPORTED", "puffin/setup-unsupported", 1602, "puffin"), nik1.K1, (nar0) null), new zp71(Uri.EMPTY)}, false);
    }

    public final cbr0 a() {
        return this.e;
    }

    public final p2r0 b() {
        return this.b.a(new j2i(1039355344, new ixt0(this, (byte) 22), true), new dx81(new hty0(this), new hox0(this, (byte) 24), hcx0.c, null));
    }

    public final void c(iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1068496941);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(this) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            ago1.g(iu30Var, this.d, (qim0) null, x340Var, i2 & 14);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yvs0(this, iu30Var, i, (byte) 24);
        }
    }
}
