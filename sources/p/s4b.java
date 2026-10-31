package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s4b implements cn00 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ lzn0 b;
    public final /* synthetic */ String c;

    public s4b(boolean z, lzn0 lzn0Var, String str) {
        this.a = z;
        this.b = lzn0Var;
        this.c = str;
    }

    public final void a() {
        boolean z = this.a;
        lzn0 lzn0Var = this.b;
        if (!z) {
            lzn0Var.c();
            return;
        }
        Set set = s4b1.f;
        String strZ = uic.y(this.c).z();
        strZ.getClass();
        lzn0Var.h(strZ);
    }
}
