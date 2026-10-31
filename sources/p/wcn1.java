package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wcn1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pgn1 b;

    public /* synthetic */ wcn1(pgn1 pgn1Var, u9 u9Var, byte b) {
        this.a = b;
        this.b = pgn1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        pgn1 pgn1Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                pgn1Var.b1("onConnectedCapabilityChanged");
                break;
            case 1:
                pgn1Var.b1("onNotificationReceived");
                break;
            case 2:
                pgn1Var.b1("onEntityUpdate");
                break;
            case 3:
                pgn1Var.b1("onMessageReceived");
                break;
            case 4:
                pgn1Var.b1("onPeerConnected");
                break;
            default:
                pgn1Var.b1("onPeerDisconnected");
                break;
        }
    }
}
