package p;

import java.io.IOException;
import kotlin.KotlinNullPointerException;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class d420 implements nyc, d5q0, myc {
    public final /* synthetic */ ohd a;

    public void i(Exception exc) {
        this.a.resumeWith(new m231(exc));
    }

    public void k(jf01 jf01Var, IOException iOException) {
        this.a.resumeWith(new m231(iOException));
    }

    public void n(jf01 jf01Var, ry21 ry21Var) {
        this.a.resumeWith(ry21Var);
    }

    public void u(dxc dxcVar, Throwable th) {
        this.a.resumeWith(new m231(th));
    }

    public void z(dxc dxcVar, sy21 sy21Var) {
        boolean z = sy21Var.a.Q0;
        ohd ohdVar = this.a;
        if (!z) {
            ohdVar.resumeWith(new m231(new HttpException(sy21Var)));
            return;
        }
        Object obj = sy21Var.b;
        if (obj != null) {
            ohdVar.resumeWith(obj);
            return;
        }
        Object objC = dxcVar.m().c(re90.class);
        objC.getClass();
        re90 re90Var = (re90) objC;
        ohdVar.resumeWith(new m231(new KotlinNullPointerException("Response from " + re90Var.a.getName() + '.' + re90Var.c.getName() + " was null but response body type was declared as non-null")));
    }
}
