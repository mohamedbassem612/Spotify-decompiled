package p;

import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uva extends w511 {
    public final /* synthetic */ byte d;
    public final gw70 e;
    public List f;

    public uva(gw70 gw70Var, byte b) {
        this.d = b;
        z6x z6xVar = z6x.a;
        switch (b) {
            case 1:
                this.e = gw70Var;
                this.f = z6xVar;
                break;
            default:
                this.e = gw70Var;
                this.f = z6xVar;
                break;
        }
    }

    public final int e() {
        switch (this.d) {
            case 0:
                break;
        }
        return this.f.size();
    }

    public final void n(int i, w611 w611Var) {
        switch (this.d) {
            case 0:
                vva vvaVar = (vva) w611Var;
                vvaVar.V0.a((hq70) this.f.get(i), vvaVar.U0);
                break;
            default:
                ezd ezdVar = (ezd) w611Var;
                ezdVar.V0.a((hq70) this.f.get(i), ezdVar.U0);
                break;
        }
    }

    public final w611 p(int i, ViewGroup viewGroup) {
        byte b = this.d;
        gw70 gw70Var = this.e;
        switch (b) {
            case 0:
                return new vva(viewGroup, viewGroup.getContext(), gw70Var);
            default:
                return new ezd(viewGroup, viewGroup.getContext(), gw70Var);
        }
    }
}
