package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xr4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final wr4 c;
    public final luk d;
    public final idd1 e = new idd1(new rq4(this, (byte) 15));

    public xr4(boolean z, boolean z2, wr4 wr4Var, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = wr4Var;
        this.d = lukVar;
    }

    public final boolean a() {
        xr4 xr4Var = (xr4) this.e.getValue();
        return xr4Var != null ? xr4Var.a() : this.a;
    }

    public final boolean b() {
        xr4 xr4Var = (xr4) this.e.getValue();
        return xr4Var != null ? xr4Var.b() : this.b;
    }

    public final wr4 c() {
        wr4 wr4VarC;
        xr4 xr4Var = (xr4) this.e.getValue();
        return (xr4Var == null || (wr4VarC = xr4Var.c()) == null) ? this.c : wr4VarC;
    }

    @Override // p.pdy0
    public final List models() {
        fpb fpbVar = new fpb("bounded_sync_loads", "android-media-session-image-loader", a());
        fpb fpbVar2 = new fpb("log_image_loading_failures", "android-media-session-image-loader", b());
        String str = c().a;
        wr4[] wr4VarArrValues = wr4.values();
        ArrayList arrayList = new ArrayList(wr4VarArrValues.length);
        for (wr4 wr4Var : wr4VarArrValues) {
            arrayList.add(wr4Var.a);
        }
        return p7h.M(fpbVar, fpbVar2, new fpb("quasar_loader", "android-media-session-image-loader", str, arrayList));
    }
}
