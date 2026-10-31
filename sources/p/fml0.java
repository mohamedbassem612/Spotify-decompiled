package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fml0 implements n8h1, p8h1 {
    public final y6h1 a;
    public final /* synthetic */ fjl0 b;

    public fml0(fjl0 fjl0Var) {
        this.b = fjl0Var;
        x6h1 x6h1VarC = fjl0Var.c.c();
        x6h1VarC.i.add(new a7h1("video_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        this.a = x6h1VarC.a();
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        r6h1 r6h1Var2 = this.b.b;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(r6h1Var2.a);
        arrayList.add(this.a);
        return new r6h1(arrayList, r6h1Var2.b);
    }

    public final l7h1 e() {
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = this.a;
        ((xjn) k7h1Var).b = this.b.b;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        return k7h1Var.a();
    }

    public final w7h1 h(int i, int i2) {
        Object obj;
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        String str = "off";
        if (i == 1) {
            obj = "off";
        } else {
            if (i != 2) {
                throw null;
            }
            obj = "on";
        }
        mmr0 mmr0Var = new mmr0("state_before_toggle", obj);
        if (i2 != 1) {
            if (i2 != 2) {
                throw null;
            }
            str = "on";
        }
        return new w7h1("", "", z7h1Var, new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{mmr0Var, new mmr0("state_after_toggle", str)})), this.a, this.b.b, System.currentTimeMillis());
    }
}
