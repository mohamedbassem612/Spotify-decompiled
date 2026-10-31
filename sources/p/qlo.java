package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qlo implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bpb1 b;

    public /* synthetic */ qlo(bpb1 bpb1Var, byte b) {
        this.a = b;
        this.b = bpb1Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        bpb1 bpb1Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                obj.getClass();
                bpb1Var.m((Object) null, obj);
                break;
            case 1:
                obj.getClass();
                bpb1Var.m((Object) null, obj);
                break;
            case 2:
                obj.getClass();
                bpb1Var.m((Object) null, obj);
                break;
            default:
                obj.getClass();
                bpb1Var.m((Object) null, obj);
                break;
        }
    }
}
