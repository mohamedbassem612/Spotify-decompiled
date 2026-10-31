package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u7r implements l381 {
    public final /* synthetic */ byte a = 1;
    public final o3r b;

    public u7r(ca3 ca3Var) {
        this.b = w3p1.o(new l4r(pwc0.b, 2, z6w.N0, new j4r(new i5w(ca3Var, (byte) 2)), z6w.O0), g7w.a);
    }

    public final o3r b() {
        byte b = this.a;
        return this.b;
    }

    public final boolean t(Object obj) {
        switch (this.a) {
            case 0:
                CharSequence charSequence = (CharSequence) ((qxc0) obj).X.get("daylist_pretitle");
                return !(charSequence == null || ihc1.y0(charSequence));
            default:
                return ((Boolean) obj).booleanValue();
        }
    }

    public u7r(v7r v7rVar) {
        this.b = v7rVar.c;
    }
}
