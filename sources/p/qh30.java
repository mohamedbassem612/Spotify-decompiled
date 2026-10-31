package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qh30 implements ph30 {
    public final String a;
    public final int b;
    public final boolean c;
    public final /* synthetic */ th30 d;

    /* JADX WARN: Multi-variable type inference failed */
    public qh30(th30 th30Var, String str, int i, int i2) {
        this.d = th30Var;
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        zf30 zf30Var = this.d.A;
        if (zf30Var != null && this.b < 0 && this.a == null && zf30Var.g0().Z(-1, 0)) {
            return false;
        }
        return this.d.a0(arrayList, arrayList2, this.a, this.b, this.c ? 1 : 0);
    }
}
