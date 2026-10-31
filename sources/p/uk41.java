package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class uk41 implements iv30 {
    public final /* synthetic */ vk41 a;

    public uk41(vk41 vk41Var) {
        this.a = vk41Var;
    }

    public final void a() {
        vk41 vk41Var = this.a;
        List list = vk41Var.a;
        if (tk41.a[l1d.C(1)] != 1) {
            eg.o();
        } else if (vk41Var.b < list.size() - 1) {
            int i = vk41Var.b + 1;
            vk41Var.b = i;
            ((zda) list.get(i)).f(new uk41(vk41Var));
            ((zda) list.get(vk41Var.b)).c(vk41Var.c);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uk41) {
            return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
        }
        return false;
    }

    public final cv30 getFunctionDelegate() {
        return new tv30(1, this.a, vk41.class, "handleSceneEvent", "handleSceneEvent(Lcom/spotify/campaigns/storyscenes/Scene$Event;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
