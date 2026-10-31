package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t6v implements nku {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public t6v(vjr0 vjr0Var, z0i z0iVar, int i) {
        this.c = vjr0Var;
        this.d = z0iVar;
        this.b = i;
    }

    public final void dispose() {
        byte b = this.a;
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ((dw91) obj2).remove(Integer.valueOf(i));
                ((dw91) obj).remove(Integer.valueOf(i));
                break;
            default:
                ((vjr0) obj2).a(i, (z0i) obj).a(n1i.a);
                break;
        }
    }

    public t6v(dw91 dw91Var, int i, dw91 dw91Var2) {
        this.c = dw91Var;
        this.b = i;
        this.d = dw91Var2;
    }
}
