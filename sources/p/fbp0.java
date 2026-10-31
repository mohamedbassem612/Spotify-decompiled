package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fbp0 implements kly0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vuk b;

    public /* synthetic */ fbp0(vuk vukVar, byte b) {
        this.a = b;
        this.b = vukVar;
    }

    public final Object get() {
        byte b = this.a;
        vuk vukVar = this.b;
        switch (b) {
            case 0:
                return vukVar.j();
            default:
                return vukVar.f();
        }
    }
}
