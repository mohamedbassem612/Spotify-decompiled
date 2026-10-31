package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nde0 implements anh0 {
    public final Context a;

    public nde0(Context context) {
        this.a = context;
    }

    @Override // p.anh0
    public final qba a(hoh0 hoh0Var, bpa bpaVar, gxu gxuVar, bnh0 bnh0Var, yeg1 yeg1Var) {
        r590 r590Var = bnh0Var instanceof r590 ? (r590) bnh0Var : null;
        if (r590Var != null) {
            r590Var.L();
        }
        String strA = hoh0Var.a();
        return new zjx0(nhc1.Y(strA, "content:", false) ? new ruc0(this, (byte) 7) : new bm00((byte) 4, false)).e(yoh0.d(strA));
    }

    @Override // p.anh0
    public final String b(hoh0 hoh0Var) {
        return hoh0Var.a();
    }

    @Override // p.anh0
    public final boolean c(hoh0 hoh0Var) {
        String strA = hoh0Var.a();
        return nhc1.Y(strA, "file:", false) || nhc1.Y(strA, "content:", false);
    }

    @Override // p.anh0
    public final int getType() {
        return 1;
    }
}
