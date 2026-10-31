package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class h3g0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3g0(boolean z, String str, String str2) {
        super(1);
        this.d = z;
        this.b = str;
        this.c = str2;
    }

    public final Object invoke(Object obj) {
        w7h1 w7h1Var;
        byte b = this.a;
        boolean z = this.d;
        String str = this.c;
        String str2 = this.b;
        switch (b) {
            case 0:
                y6h1 y6h1Var = ((col0) obj).a;
                b7x b7xVar = b7x.a;
                if (z) {
                    z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                    if (str2 == null) {
                        str2 = "";
                    }
                    mmr0 mmr0Var = new mmr0("playlist", str2);
                    if (str == null) {
                        str = "";
                    }
                    w7h1Var = new w7h1("", "", z7h1Var, new x7h1("remove_user_as_playlist_collaborator", 1, sqg0.J(new mmr0[]{mmr0Var, new mmr0("user_to_be_removed_as_collaborator", str)})), y6h1Var, r6h1.c, System.currentTimeMillis());
                } else {
                    z7h1 z7h1Var2 = new z7h1("hit", 1, b7xVar);
                    if (str2 == null) {
                        str2 = "";
                    }
                    mmr0 mmr0Var2 = new mmr0("playlist", str2);
                    if (str == null) {
                        str = "";
                    }
                    w7h1Var = new w7h1("", "", z7h1Var2, new x7h1("make_user_a_playlist_collaborator", 1, sqg0.J(new mmr0[]{mmr0Var2, new mmr0("user_to_be_made_collaborator", str)})), y6h1Var, r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var;
            default:
                qv00 qv00Var = (qv00) obj;
                qv00Var.a(str2, zei1.class, false);
                if (str.length() > 0) {
                    qv00Var.a(str, xkk1.class, false);
                    if (z) {
                        qv00Var.a(str, jo70.class, false);
                    }
                    qv00Var.a(str, w281.class, false);
                }
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3g0(String str, String str2, boolean z) {
        super(1);
        this.b = str;
        this.c = str2;
        this.d = z;
    }
}
