package p;

import android.content.Context;
import android.util.SparseArray;
import androidx.media3.common.VideoFrameProcessingException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zj80 {
    public final Context a;
    public final x8h b;
    public final ks40 c;
    public final roj1 d;
    public final sys e;
    public final Executor f;
    public final SparseArray g;
    public final boolean h;
    public rs40 i;
    public o5 j;

    public zj80(Context context, x8h x8hVar, ks40 ks40Var, roj1 roj1Var, Executor executor, sys sysVar, boolean z, boolean z2, boolean z3) {
        this.a = context;
        this.b = x8hVar;
        this.c = ks40Var;
        this.d = roj1Var;
        this.f = executor;
        this.e = sysVar;
        SparseArray sparseArray = new SparseArray();
        this.g = sparseArray;
        this.h = z2;
        yj80 yj80Var = new yj80(new sa10(ks40Var, roj1Var, z, z2));
        sparseArray.put(1, yj80Var);
        sparseArray.put(4, yj80Var);
        sparseArray.put(2, new yj80(new dya(ks40Var, roj1Var, z3)));
        sparseArray.put(3, new yj80(new lzd1(ks40Var, roj1Var)));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.VideoFrameProcessingException */
    public final void a(int i, xj30 xj30Var) throws VideoFrameProcessingException {
        dos dosVarM;
        this.i.getClass();
        String str = zoi1.a;
        SparseArray sparseArray = this.g;
        dm5.x("Input type not registered: %s", i, sparseArray.indexOfKey(i) >= 0);
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ((yj80) sparseArray.get(sparseArray.keyAt(i2))).c(false);
        }
        yj80 yj80Var = (yj80) sparseArray.get(i);
        x8h x8hVar = xj30Var.a.H;
        x8hVar.getClass();
        x8h x8hVar2 = this.b;
        Context context = this.a;
        if (i == 1) {
            dosVarM = dos.m(context, x8hVar, x8hVar2, this.h);
        } else if (i == 2 || i == 3) {
            dosVarM = dos.n(context, x8hVar, x8hVar2, i);
        } else {
            if (i != 4) {
                throw new VideoFrameProcessingException(f4i1.c(i, "Unsupported input type "));
            }
            dosVarM = dos.m(context, x8hVar, x8hVar2, this.h);
        }
        dosVarM.d(this.f, this.e);
        yj80Var.e(dosVarM);
        dos dosVarB = yj80Var.b();
        dosVarB.getClass();
        yj80Var.d(new lls0(this.c, dosVarB, this.i, this.d));
        yj80Var.c(true);
        rs40 rs40Var = this.i;
        lls0 lls0VarA = yj80.a(yj80Var);
        lls0VarA.getClass();
        rs40Var.c(lls0VarA);
        o5 o5Var = yj80Var.a;
        this.j = o5Var;
        o5Var.I(xj30Var, i == 4);
    }
}
