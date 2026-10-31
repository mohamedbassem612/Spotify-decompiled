package p;

import android.content.IntentFilter;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gro1 extends qdo1 {
    public dbm l;
    public final IntentFilter[] m;

    public gro1(IntentFilter[] intentFilterArr) {
        this.m = intentFilterArr;
    }

    @Override // p.udo1
    public final boolean A(edo1 edo1Var) {
        return false;
    }

    @Override // p.udo1
    public final void O0(uio1 uio1Var) {
        uio1Var.b.close();
    }

    @Override // p.udo1
    public final void T(DataHolder dataHolder) {
        dbm dbmVar = this.l;
        if (dbmVar != null) {
            dbmVar.h(new owf1(dataHolder, (byte) 23));
        } else {
            dataHolder.close();
        }
    }

    public final void b1() {
        dbm dbmVar = this.l;
        if (dbmVar != null) {
            dbmVar.b = null;
        }
        this.l = null;
    }

    @Override // p.udo1
    public final void I0(ArrayList arrayList) {
    }

    @Override // p.udo1
    public final void N0(rso1 rso1Var) {
    }

    @Override // p.udo1
    public final void R(okn1 okn1Var) {
    }

    @Override // p.udo1
    public final void S(zio1 zio1Var) {
    }

    @Override // p.udo1
    public final void V(pgo1 pgo1Var) {
    }

    @Override // p.udo1
    public final void Z(zio1 zio1Var) {
    }

    @Override // p.udo1
    public final void x(orn1 orn1Var) {
    }

    @Override // p.udo1
    public final void z0(ylo1 ylo1Var) {
    }

    @Override // p.udo1
    public final void H(pgo1 pgo1Var, cdo1 cdo1Var) {
    }
}
