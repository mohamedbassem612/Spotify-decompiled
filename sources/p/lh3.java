package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class lh3 extends ozy {
    public static final Map Y0 = sqg0.J(new mmr0[]{new mmr0("album", 2131953973), new mmr0("audiobook", 2131953974), new mmr0("compilation", 2131953975), new mmr0("ep", 2131953976), new mmr0("single", 2131953977)});
    public final qzh W0;
    public final cce X0;

    public lh3(qzh qzhVar, cce cceVar) {
        super(qzhVar, rc11.a.b(b1h.class));
        this.W0 = qzhVar;
        this.X0 = cceVar;
    }

    @Override // p.ozy
    public final void E(f1h f1hVar, qka qkaVar) {
        this.W0.n(new t6(this, (b1h) f1hVar, qkaVar, (byte) 20));
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0041  */
    @Override // p.ozy
    public final Object F(f1h f1hVar) {
        String strValueOf;
        nb6 nb6Var = ((b1h) f1hVar).b;
        String str = nb6Var.b;
        String str2 = nb6Var.e;
        int i = nb6Var.d;
        Integer num = (Integer) Y0.get(str2);
        if (num != null) {
            int iIntValue = num.intValue();
            qzh qzhVar = this.W0;
            strValueOf = qzhVar.getView().getContext().getString(2131953972, Integer.valueOf(i), qzhVar.getView().getContext().getString(iIntValue));
            if (strValueOf == null) {
                strValueOf = String.valueOf(i);
            }
        } else {
            strValueOf = String.valueOf(i);
        }
        return new if3(str, strValueOf, new g07(nb6Var.c), nb6Var.f);
    }
}
