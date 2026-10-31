package p;

import android.view.ViewGroup;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.EnumSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nbx extends r570 {
    public final /* synthetic */ byte a;
    public final Scheduler b;
    public final Object c;
    public final iac0 d;
    public final vx40 e;
    public final u0i f;
    public final Object g;

    public nbx(zfx zfxVar, ag90 ag90Var, Scheduler scheduler, iac0 iac0Var, vx40 vx40Var, zr00 zr00Var) {
        this.a = (byte) 3;
        this.f = zfxVar;
        this.c = ag90Var;
        this.b = scheduler;
        this.d = iac0Var;
        this.e = vx40Var;
        this.g = zr00Var;
    }

    public final int a() {
        switch (this.a) {
            case 0:
                return 2131428303;
            case 1:
                return 2131428304;
            case 2:
                return 2131428327;
            default:
                return 2131428334;
        }
    }

    public final EnumSet c() {
        byte b = this.a;
        ix40 ix40Var = ix40.h;
        switch (b) {
            case 0:
                return EnumSet.of(ix40Var);
            case 1:
                return EnumSet.of(ix40.b);
            case 2:
                return EnumSet.of(ix40Var);
            default:
                return EnumSet.of(ix40.c);
        }
    }

    public final l570 f(ViewGroup viewGroup, l670 l670Var) {
        byte b = this.a;
        Object obj = this.g;
        Object obj2 = this.c;
        hjc hjcVar = this.f;
        switch (b) {
            case 0:
                return new mbx(this.b, hjcVar.a((l0i) null), (ef90) obj2, (da) obj, this.d, this.e);
            case 1:
                iac0 iac0Var = this.d;
                vx40 vx40Var = this.e;
                return new mbx(this.b, hjcVar.a((l0i) null), (ef90) obj2, (p5) obj, iac0Var, vx40Var);
            case 2:
                return new mbx(this.b, hjcVar.a((l0i) null), (ef90) obj2, (vf90) obj, this.d, this.e);
            default:
                return new mbx(((zfx) hjcVar).a(null), this.b, (ag90) obj2, this.d, this.e, (zr00) obj);
        }
    }

    public /* synthetic */ nbx(Scheduler scheduler, u0i u0iVar, ef90 ef90Var, iu30 iu30Var, iac0 iac0Var, vx40 vx40Var, byte b) {
        this.a = b;
        this.b = scheduler;
        this.f = u0iVar;
        this.c = ef90Var;
        this.g = iu30Var;
        this.d = iac0Var;
        this.e = vx40Var;
    }
}
