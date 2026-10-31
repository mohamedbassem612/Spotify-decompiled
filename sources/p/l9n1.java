package p;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class l9n1 extends q5n1 implements IInterface {
    public final /* synthetic */ bsd1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9n1(o9n1 o9n1Var, bsd1 bsd1Var) {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
        this.l = bsd1Var;
    }

    public final boolean X0(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            p8n1.a(parcel, Status.CREATOR);
            p8n1.c(parcel);
            throw new UnsupportedOperationException();
        }
        if (i == 2) {
            Status statusA = p8n1.a(parcel, Status.CREATOR);
            cjm0 cjm0Var = (cjm0) p8n1.a(parcel, cjm0.CREATOR);
            p8n1.c(parcel);
            boolean zJ = statusA.j();
            bsd1 bsd1Var = this.l;
            if (zJ) {
                bsd1Var.a.t(cjm0Var);
            } else {
                bsd1Var.c(rzn1.r(statusA));
            }
            return true;
        }
        if (i == 3) {
            p8n1.a(parcel, Status.CREATOR);
            p8n1.c(parcel);
            k220.c();
            return false;
        }
        if (i != 4) {
            return false;
        }
        p8n1.a(parcel, Status.CREATOR);
        p8n1.c(parcel);
        k220.c();
        return false;
    }
}
