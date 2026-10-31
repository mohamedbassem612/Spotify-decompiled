package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class i8n1 {
    public final gi5 a;
    public final pl10 b;

    public /* synthetic */ i8n1(gi5 gi5Var, pl10 pl10Var) {
        this.a = gi5Var;
        this.b = pl10Var;
    }

    public final /* synthetic */ gi5 a() {
        return this.a;
    }

    public final /* synthetic */ pl10 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i8n1)) {
            return false;
        }
        i8n1 i8n1Var = (i8n1) obj;
        return k8p1.h(this.a, i8n1Var.a) && k8p1.h(this.b, i8n1Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        drj0 drj0Var = new drj0(this);
        drj0Var.d(this.a, "key");
        drj0Var.d(this.b, "feature");
        return drj0Var.toString();
    }
}
