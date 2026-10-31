package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w1l0 implements n8h1 {
    public final y6h1 a;

    public w1l0(i3l0 i3l0Var, int i, String str) {
        String str2;
        x6h1 x6h1VarC = i3l0Var.a.c();
        if (i == 1) {
            str2 = "recents";
        } else {
            if (i != 2) {
                throw null;
            }
            str2 = "shortcuts";
        }
        x6h1VarC.i.add(new a7h1("remove_from_section_item", str2, (Integer) null, str, (String) null));
        x6h1VarC.j = false;
        this.a = x6h1VarC.a();
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        return new r6h1(kk0.l(this.a), (u8h1) null);
    }
}
