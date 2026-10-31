package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class uim {
    public final bw91 a = new bw91();

    public static void b(uim uimVar, vu30 vu30Var, j2i j2iVar, Function0 function0, int i) {
        if ((i & 8) != 0) {
            j2iVar = null;
        }
        uimVar.a.add(new j2i(-1789283891, new fsb0(vu30Var, uimVar, j2iVar, function0), true));
    }

    public final void a(mdm mdmVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-798501095);
        int i2 = (x340Var.g(mdmVar) ? 4 : 2) | i | (x340Var.g(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            bw91 bw91Var = this.a;
            int size = bw91Var.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((xu30) bw91Var.get(i3)).invoke(mdmVar, x340Var, Integer.valueOf(i2 & 14));
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new f14(this, mdmVar, i, (byte) 7);
        }
    }
}
