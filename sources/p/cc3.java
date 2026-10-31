package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cc3 implements fny {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uw81 b;

    public cc3(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new uw81(gn6.b1, gn6.c1, gn6.d1);
                break;
            case 2:
                this.b = new uw81(eno.b1, eno.c1, eno.d1);
                break;
            case 3:
            default:
                this.b = new uw81(ra3.W0, ra3.X0);
                break;
            case 4:
                this.b = new uw81(x0y.e, x0y.f, x0y.g);
                break;
            case 5:
                this.b = new uw81(i330.X0, i330.Y0, i330.Z0);
                break;
            case 6:
                this.b = new uw81(vc40.t, vc40.X, vc40.Y);
                break;
            case 7:
                this.b = new uw81(god0.Y, god0.Z, god0.N0);
                break;
        }
    }

    public final hx21 a(PlayerState playerState) {
        byte b = this.a;
        uw81 uw81Var = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
        }
        return uw81Var.a(playerState);
    }

    public final mr20 b(PlayerState playerState) {
        byte b = this.a;
        uw81 uw81Var = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
        }
        return uw81Var.b(playerState);
    }

    public cc3(bx21 bx21Var, byte b) {
        this.a = b;
        switch (b) {
            case 8:
                this.b = new uw81(new bft(bx21Var, (byte) 1), o5v0.Q0);
                break;
            case 9:
                this.b = new uw81(new hbz0(bx21Var, (byte) 2), gkz0.f, gkz0.g);
                break;
            case 10:
            default:
                this.b = new uw81(new bft(bx21Var, (byte) 0), ket.O0);
                break;
            case 11:
                this.b = new uw81(new bft(bx21Var, (byte) 2), gbm1.Z0);
                break;
            case 12:
                this.b = new uw81(new bft(bx21Var, (byte) 3), gbm1.a1, gbm1.b1);
                break;
        }
    }

    public cc3(bx21 bx21Var, bx21 bx21Var2) {
        this.a = (byte) 13;
        this.b = new uw81(new bft(bx21Var, (byte) 4), new bft(bx21Var2, (byte) 5), dw81.Y0);
    }

    public cc3(hv4 hv4Var) {
        this.a = (byte) 10;
        this.b = new uw81(ej41.R0, new hbz0(hv4Var, (byte) 16));
    }
}
