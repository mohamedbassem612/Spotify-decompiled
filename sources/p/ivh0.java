package p;

import java.util.Collection;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class ivh0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mvh0 b;
    public final /* synthetic */ lvh0 c;
    public final /* synthetic */ gvh0 d;
    public final /* synthetic */ Collection e;

    public /* synthetic */ ivh0(mvh0 mvh0Var, lvh0 lvh0Var, gvh0 gvh0Var, Collection collection, byte b) {
        this.a = b;
        this.b = mvh0Var;
        this.c = lvh0Var;
        this.d = gvh0Var;
        this.e = collection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Collection collection = this.e;
        gvh0 gvh0Var = this.d;
        lvh0 lvh0Var = this.c;
        mvh0 mvh0Var = this.b;
        switch (b) {
            case 0:
                lvh0Var.c(mvh0Var, gvh0Var, collection);
                break;
            default:
                lvh0Var.c(mvh0Var, gvh0Var, collection);
                break;
        }
    }
}
