package p;

import android.opengl.EGLDisplay;
import android.util.SparseArray;
import androidx.media3.common.util.GlUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class tys implements qoj1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ azs b;

    public /* synthetic */ tys(azs azsVar, byte b) {
        this.a = b;
        this.b = azsVar;
    }

    @Override // p.qoj1
    public final void run() {
        byte b = this.a;
        azs azsVar = this.b;
        switch (b) {
            case 0:
                int i = azs.y;
                azsVar.c();
                return;
            case 1:
                EGLDisplay eGLDisplay = azsVar.e;
                ks40 ks40Var = azsVar.c;
                boolean z = azsVar.d;
                ArrayList arrayList = azsVar.l;
                try {
                    try {
                        SparseArray sparseArray = azsVar.f.g;
                        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                            yj80 yj80Var = (yj80) sparseArray.get(sparseArray.keyAt(i2));
                            if (!yj80Var.d) {
                                yj80Var.d = true;
                                yj80Var.a.F();
                                dos dosVar = yj80Var.b;
                                if (dosVar != null) {
                                    dosVar.release();
                                }
                            }
                        }
                        for (int i3 = 0; i3 < arrayList.size(); i3++) {
                            ((rs40) arrayList.get(i3)).release();
                        }
                        azsVar.k.release();
                        break;
                    } catch (Exception e) {
                        oon1.w("Error releasing shader program", e);
                        break;
                    }
                    if (z) {
                        try {
                            return;
                        } catch (GlUtil.GlException e2) {
                            return;
                        }
                    }
                    return;
                } finally {
                    if (z) {
                        try {
                            ks40Var.i(eGLDisplay);
                        } catch (GlUtil.GlException e3) {
                            oon1.w("Error releasing GL objects", e3);
                        }
                        break;
                    }
                }
            case 2:
                cg20 cg20Var = azsVar.k;
                String str = zoi1.a;
                throw null;
            default:
                azsVar.c();
                return;
        }
    }
}
