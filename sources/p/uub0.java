package p;

import androidx.car.app.model.Alert;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class uub0 extends k9 {
    public final boolean c;
    public final qub0 d;
    public final isb0 e;
    public final dvb0 f;
    public final /* synthetic */ vub0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uub0(vub0 vub0Var, boolean z, qub0 qub0Var, isb0 isb0Var, dvb0 dvb0Var) {
        super((byte) 10);
        this.g = vub0Var;
        this.c = z;
        this.d = qub0Var;
        this.e = isb0Var;
        this.f = dvb0Var;
    }

    @Override // p.k9
    public final jsb0 M0(long j, int i, int i2, int i3) {
        qub0 qub0Var = this.d;
        Object objD = qub0Var.d(i);
        Object objW = qub0Var.b.w(i);
        List listV0 = V0(this.e, i, j);
        vub0 vub0Var = this.g;
        return new avb0(i, objD, listV0, vub0Var.f, vub0Var.l, i2, i3, vub0Var.j, vub0Var.k, objW, vub0Var.a.t, j);
    }

    public final avb0 v1(int i, long j) {
        int i2;
        long jH;
        qub0 qub0Var = this.d;
        Object objD = qub0Var.d(i);
        Object objW = qub0Var.b.w(i);
        dvb0 dvb0Var = this.f;
        int[] iArr = dvb0Var.b;
        int length = iArr.length;
        int i3 = (int) (j >> 32);
        int i4 = length - 1;
        if (i3 <= i4) {
            i4 = i3;
        }
        int i5 = ((int) (j & 4294967295L)) - i3;
        int i6 = length - i4;
        if (i5 > i6) {
            i5 = i6;
        }
        if (i5 == 1) {
            i2 = iArr[i4];
        } else {
            int[] iArr2 = dvb0Var.a;
            int i7 = (i4 + i5) - 1;
            i2 = (iArr2[i7] + iArr[i7]) - iArr2[i4];
        }
        if (this.c) {
            if (i2 < 0) {
                sf80.a("width must be >= 0");
            }
            jH = jjl.h(i2, i2, 0, Alert.DURATION_SHOW_INDEFINITELY);
        } else {
            if (i2 < 0) {
                sf80.a("height must be >= 0");
            }
            jH = jjl.h(0, Alert.DURATION_SHOW_INDEFINITELY, i2, i2);
        }
        long j2 = jH;
        List listV0 = V0(this.e, i, j2);
        vub0 vub0Var = this.g;
        return new avb0(i, objD, listV0, vub0Var.f, vub0Var.l, i4, i5, vub0Var.j, vub0Var.k, objW, vub0Var.a.t, j2);
    }
}
