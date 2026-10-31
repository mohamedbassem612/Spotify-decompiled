package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ti7 extends kkn {
    public final /* synthetic */ ui7 e;

    public ti7(ui7 ui7Var) {
        super((byte) 5);
        this.e = ui7Var;
    }

    public final boolean i(int i, int i2) {
        ui7 ui7Var = this.e;
        Object obj = ui7Var.a.get(i);
        Object obj2 = ui7Var.b.get(i2);
        if (obj != null && obj2 != null) {
            return ui7Var.e.b.i().j(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        hhg1.c();
        return false;
    }

    public final boolean j(int i, int i2) {
        ui7 ui7Var = this.e;
        Object obj = ui7Var.a.get(i);
        Object obj2 = ui7Var.b.get(i2);
        if (obj == null || obj2 == null) {
            return obj == null && obj2 == null;
        }
        return ui7Var.e.b.i().k(obj, obj2);
    }

    public final Object o(int i, int i2) {
        ui7 ui7Var = this.e;
        Object obj = ui7Var.a.get(i);
        Object obj2 = ui7Var.b.get(i2);
        if (obj != null && obj2 != null) {
            return ui7Var.e.b.i().y(obj, obj2);
        }
        hhg1.c();
        return null;
    }

    public final int q() {
        return this.e.b.size();
    }

    public final int r() {
        return this.e.a.size();
    }
}
