package p;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ix1 extends z511 {
    public static final List h;
    public final ox1 d;
    public final zfx e;
    public final pia1 f;
    public iu30 g = im1.d1;

    static {
        Parcelable.Creator<pia1> creator = pia1.CREATOR;
        h = pia1.b;
    }

    public ix1(ox1 ox1Var, zfx zfxVar, pia1 pia1Var) {
        this.d = ox1Var;
        this.e = zfxVar;
        this.f = pia1Var;
    }

    public final void A(iu30 iu30Var) {
        this.g = iu30Var;
    }

    public final void n(int i, w611 w611Var) {
        int i2;
        qzh qzhVar = ((jx1) w611Var).U0;
        pia1 pia1Var = (pia1) h.get(i);
        boolean z = pia1Var == this.f;
        Context context = this.d.a;
        int iOrdinal = pia1Var.ordinal();
        if (iOrdinal == 0) {
            i2 = 2131951952;
        } else if (iOrdinal == 1) {
            i2 = 2131951950;
        } else if (iOrdinal == 2) {
            i2 = 2131951954;
        } else {
            if (iOrdinal != 3) {
                eg.o();
                return;
            }
            i2 = 2131951953;
        }
        qzhVar.f(new wia1(context.getString(i2), z));
        qzhVar.n(new d4((Object) this, (Object) pia1Var, (byte) 24));
    }

    public final w611 p(int i, ViewGroup viewGroup) {
        return new jx1(this.e.a((l0i) null));
    }
}
