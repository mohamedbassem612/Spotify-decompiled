package p;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class i501 extends auj {
    public final c1y0 Y1;
    public gw70 Z1;
    public List a2;
    public iu30 b2;

    public i501(c1y0 c1y0Var) {
        this.Y1 = c1y0Var;
    }

    @Override // p.t2u, p.zf30
    public final void F0(Bundle bundle) {
        super.F0(bundle);
        List list = this.a2;
        if (list != null) {
            bundle.putParcelableArray("reactions", (Parcelable[]) list.toArray(new c401[0]));
        } else {
            u890.C("reactions");
            throw null;
        }
    }

    @Override // p.haa
    /* JADX INFO: renamed from: j1 */
    public final boolean getW1() {
        return false;
    }

    @Override // p.haa
    public final void k1(t4n t4nVar) {
        t4nVar.g().L(3);
    }

    @Override // p.auj
    public final void n1(xtj xtjVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2032527480);
        int i2 = (x340Var.i(this) ? 32 : 16) | i;
        if (x340Var.Y(i2 & 1, (i2 & 17) != 16)) {
            qim0 qim0VarY = too1.y(nim0.a, poo1.F(cev0.E(x340Var), 32));
            boolean zI = x340Var.i(this);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new g501(this, (byte) 1);
                x340Var.s0(objT);
            }
            ujo1.d(qim0VarY, (xtb0) null, (vzq0) null, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT, x340Var, 0, NativeMediaProcessor.PROCESS_SAMPLE_RESULT_NON_DIRECT_BUFFER);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kpw0(this, xtjVar, i, (byte) 18);
        }
    }

    @Override // p.t2u, p.zf30
    public final void v0(Context context) {
        this.Y1.f(this);
        super.v0(context);
    }

    @Override // p.t2u, p.zf30
    public final void w0(Bundle bundle) {
        List listL1;
        super.w0(bundle);
        if (bundle != null) {
            Parcelable[] parcelableArray = Build.VERSION.SDK_INT >= 34 ? (Parcelable[]) gg.q(bundle, "reactions", c401.class) : bundle.getParcelableArray("reactions");
            if (parcelableArray != null) {
                ArrayList arrayList = new ArrayList(parcelableArray.length);
                for (Parcelable parcelable : parcelableArray) {
                    arrayList.add((c401) parcelable);
                }
                listL1 = o7h.l1(arrayList);
            } else {
                listL1 = null;
            }
            if (listL1 != null) {
                this.a2 = listL1;
            }
        }
    }
}
