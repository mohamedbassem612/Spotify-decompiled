package p;

import com.spotify.appstorage.userdirectory.UserDirectoryApi;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.localfiles.localfilesapi.LocalFilesApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hbp0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ io80 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hbp0(io80 io80Var, byte b) {
        super(0);
        this.a = b;
        this.b = io80Var;
    }

    public final Object invoke() {
        byte b = this.a;
        io80 io80Var = this.b;
        switch (b) {
            case 0:
                return (xz11) io80Var.a();
            case 1:
                return (xz11) io80Var.a();
            case 2:
                return new jbp0(io80Var, (byte) 0);
            case 3:
                return (xz11) io80Var.a();
            case 4:
                return (ph61) io80Var.a();
            case 5:
                return (pmy0) io80Var.a();
            case 6:
                return (LocalFilesApi) io80Var.a();
            case 7:
                return (UserDirectoryApi) io80Var.a();
            case 8:
                return (l1v0) io80Var.a();
            case 9:
                return (qz11) io80Var.a();
            case 10:
                return (ncl) io80Var.a();
            case 11:
                return (ph61) io80Var.a();
            case 12:
                return (ph61) io80Var.a();
            case 13:
                return (v5u0) io80Var.a();
            case 14:
                return (mu2) io80Var.a();
            case 15:
                return (cex0) io80Var.a();
            case 16:
                return (rg31) io80Var.a();
            case 17:
                return (lc71) io80Var.a();
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return (mtd1) io80Var.a();
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return (kbd) io80Var.a();
            case 20:
                return (n1u0) io80Var.a();
            case 21:
                return new jbp0(io80Var, (byte) 1);
            case 22:
                return new jbp0(io80Var, (byte) 2);
            case 23:
                return new jbp0(io80Var, (byte) 3);
            case 24:
                return new jbp0(io80Var, (byte) 4);
            case 25:
                return (ez11) io80Var.a();
            case 26:
                return (tau0) io80Var.a();
            case 27:
                return (tjb) io80Var.a();
            case 28:
                return (tau0) io80Var.a();
            default:
                return (tau0) io80Var.a();
        }
    }
}
