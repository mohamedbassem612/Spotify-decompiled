package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s4z implements ml90 {
    public final boolean a;
    public final mp4 b;
    public final vbs c;

    public s4z(boolean z, mp4 mp4Var, vbs vbsVar) {
        this.a = z;
        this.b = mp4Var;
        this.c = vbsVar;
    }

    public final Set create() {
        jd11 jd11Var = rc11.a;
        ll90 ll90Var = new ll90(6, jd11Var.b(jo70.class));
        ll90 ll90Var2 = new ll90(6, jd11Var.b(b9v0.class));
        ll90 ll90Var3 = new ll90(6, jd11Var.b(xkk1.class));
        ll90 ll90Var4 = new ll90(6, jd11Var.b(v740.class));
        ll90 ll90Var5 = new ll90(6, jd11Var.b(mtl.class));
        ll90 ll90Var6 = new ll90(6, jd11Var.b(hll.class));
        ll90 ll90Var7 = new ll90(6, jd11Var.b(nst0.class));
        if (!this.b.a()) {
            ll90Var7 = null;
        }
        return dm61.B0(new ll90[]{ll90Var, ll90Var2, ll90Var3, ll90Var4, ll90Var5, ll90Var6, ll90Var7, (this.a || this.c.g) ? new ll90(6, jd11Var.b(dxc0.class)) : null});
    }
}
