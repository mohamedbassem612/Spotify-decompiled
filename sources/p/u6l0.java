package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class u6l0 implements n8h1 {
    public final /* synthetic */ byte a;
    public final y6h1 b;
    public final /* synthetic */ g5l0 c;

    public u6l0(g5l0 g5l0Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.c = g5l0Var;
                x6h1 x6h1VarC = g5l0Var.c.c();
                x6h1VarC.i.add(new a7h1("liked_songs", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                this.b = x6h1VarC.a();
                break;
            case 2:
                this.c = g5l0Var;
                x6h1 x6h1VarC2 = g5l0Var.c.c();
                x6h1VarC2.i.add(new a7h1("playlist", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                this.b = x6h1VarC2.a();
                break;
            default:
                this.c = g5l0Var;
                x6h1 x6h1VarC3 = g5l0Var.c.c();
                x6h1VarC3.i.add(new a7h1("album", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                this.b = x6h1VarC3.a();
                break;
        }
    }

    public final r6h1 b() {
        byte b = this.a;
        g5l0 g5l0Var = this.c;
        y6h1 y6h1Var = this.b;
        switch (b) {
            case 0:
                r6h1 r6h1Var = r6h1.c;
                r6h1 r6h1Var2 = g5l0Var.b;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(r6h1Var2.a);
                arrayList.add(y6h1Var);
                return new r6h1(arrayList, r6h1Var2.b);
            case 1:
                r6h1 r6h1Var3 = r6h1.c;
                r6h1 r6h1Var4 = g5l0Var.b;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(r6h1Var4.a);
                arrayList2.add(y6h1Var);
                return new r6h1(arrayList2, r6h1Var4.b);
            default:
                r6h1 r6h1Var5 = r6h1.c;
                r6h1 r6h1Var6 = g5l0Var.b;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(r6h1Var6.a);
                arrayList3.add(y6h1Var);
                return new r6h1(arrayList3, r6h1Var6.b);
        }
    }

    public jpk0 e(String str) {
        return new jpk0(this, str);
    }

    public jpk0 h(String str) {
        return new jpk0(this, str, (byte) 0);
    }

    public jpk0 i(String str) {
        return new jpk0(this, str, (char) 0);
    }

    public sqk0 j(String str) {
        return new sqk0(this, str);
    }

    public v6l0 k(String str) {
        return new v6l0(this, str);
    }

    public w6l0 l(String str) {
        return new w6l0(this, str);
    }
}
