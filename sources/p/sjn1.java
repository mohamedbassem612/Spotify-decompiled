package p;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sjn1 extends q5n1 {
    public final /* synthetic */ byte l;
    public final /* synthetic */ bsd1 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sjn1(non1 non1Var, bsd1 bsd1Var, byte b) {
        super("com.google.android.gms.common.api.internal.IStatusCallback");
        this.l = b;
        this.m = bsd1Var;
    }

    public final boolean X0(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Status statusA = p8n1.a(parcel, Status.CREATOR);
        p8n1.c(parcel);
        byte b = this.l;
        bsd1 bsd1Var = this.m;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                u0p1.u(statusA, null, bsd1Var);
                return true;
            case 1:
                u0p1.u(statusA, Boolean.TRUE, bsd1Var);
                return true;
            default:
                u0p1.u(statusA, null, bsd1Var);
                return true;
        }
    }
}
