package p;

import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ig7 extends clr0 {
    public final /* synthetic */ byte c;
    public final Object d;

    public /* synthetic */ ig7(Object obj, byte b) {
        this.c = b;
        this.d = obj;
    }

    public void c(RecyclerView recyclerView, int i) {
        byte b = this.c;
        n151 n151Var = n151.a;
        Object obj = this.d;
        switch (b) {
            case 2:
                if (i == 1) {
                    ((rw41) obj).a.invoke(n151Var);
                }
                break;
            case 3:
                if (i == 1) {
                    ((h551) obj).b.invoke(n151Var);
                }
                break;
        }
    }

    @Override // p.clr0
    public final boolean i() {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                return true;
            case 1:
                return ((r8e0) ((ojv) obj).b).c();
            case 2:
                b851 b851Var = ((rw41) obj).i;
                return b851Var.a && !b851Var.b;
            default:
                b851 b851Var2 = ((h551) obj).l;
                return b851Var2.a && !b851Var2.b;
        }
    }

    @Override // p.clr0
    public final int j() {
        switch (this.c) {
            case 0:
                return 5;
            case 1:
                return 10;
            case 2:
                return 2;
            default:
                return 2;
        }
    }

    @Override // p.clr0
    public final void k(int i) {
        byte b = this.c;
        pz41 pz41Var = pz41.a;
        Object obj = this.d;
        switch (b) {
            case 0:
                ((Consumer) obj).accept(vf7.a);
                break;
            case 1:
                ((r8e0) ((ojv) obj).b).a(i + 50);
                break;
            case 2:
                ((rw41) obj).a.invoke(pz41Var);
                break;
            default:
                ((h551) obj).b.invoke(pz41Var);
                break;
        }
    }
}
