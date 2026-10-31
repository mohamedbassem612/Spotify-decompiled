package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kkb implements u9h1 {
    public final i8h1 a;

    public kkb(i8h1 i8h1Var, byte b) {
        switch (b) {
            case 1:
                this.a = i8h1Var;
                r6h1 r6h1Var = r6h1.c;
                break;
            default:
                this.a = i8h1Var;
                break;
        }
    }

    public n8h1 b(zv31 zv31Var, int i, String str) {
        if (jkb.a[((hkb) zv31Var.j).a.ordinal()] == 1) {
            return new byk0(new jpk0(new fyk0()), Integer.valueOf(i), str, (byte) 6);
        }
        return new byk0(new jpk0(new fyk0()), Integer.valueOf(i), str, zv31Var.a, (byte) 0);
    }

    public w7h1 c(zv31 zv31Var, int i, String str) {
        return null;
    }

    public n8h1 f(zv31 zv31Var, int i, String str) {
        return null;
    }
}
