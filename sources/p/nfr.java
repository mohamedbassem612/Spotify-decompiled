package p;

import android.os.Bundle;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerQueue;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class nfr implements e9d0, Function, wlh0, akl {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;

    public /* synthetic */ nfr(int i, pa61 pa61Var, Bundle bundle, Bundle bundle2) {
        this.a = (byte) 5;
        this.b = i;
    }

    public void a(rlh0 rlh0Var) {
        if (rlh0Var.p() && rlh0Var.l.get(this.b) != null) {
            bhn0.d();
        }
    }

    public void accept(Object obj) {
        byte b = this.a;
        int i = this.b;
        ffu0 ffu0Var = (ffu0) obj;
        switch (b) {
            case 6:
                ffu0Var.T(i);
                break;
            case 7:
                ffu0Var.B(i);
                break;
            case 8:
                ffu0Var.setRepeatMode(i);
                break;
            default:
                ffu0Var.Y0(i);
                break;
        }
    }

    public Object apply(Object obj) {
        byte b = this.a;
        int i = this.b;
        switch (b) {
            case 3:
                PlayerQueue playerQueue = (PlayerQueue) obj;
                if (i == 0) {
                    return playerQueue.track();
                }
                if (i < 0) {
                    b380 b380VarPrevTracks = playerQueue.prevTracks();
                    if (b380VarPrevTracks.size() + i >= 0) {
                        return spq0.d((ContextTrack) b380VarPrevTracks.get(b380VarPrevTracks.size() + i));
                    }
                } else {
                    b380 b380VarNextTracks = playerQueue.nextTracks();
                    if (b380VarNextTracks.size() >= i) {
                        return spq0.d((ContextTrack) b380VarNextTracks.get(i - 1));
                    }
                }
                return j5.a;
            default:
                mbn mbnVar = (mbn) obj;
                return mbnVar.a.length != i ? Observable.error(new Exception(f4i1.c(i, "Unexpected count data, expected "))) : Observable.just(mbnVar);
        }
    }

    public void invoke(Object obj) {
        byte b = this.a;
        int i = this.b;
        switch (b) {
            case 0:
                ((uz3) obj).u(i);
                break;
            case 1:
                ((o8u0) obj).onRepeatModeChanged(i);
                break;
            case 2:
                ((o8u0) obj).i(i);
                break;
            default:
                ((o8u0) obj).onRepeatModeChanged(i);
                break;
        }
    }

    public /* synthetic */ nfr(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    public /* synthetic */ nfr(tz3 tz3Var, int i, long j) {
        this.a = (byte) 0;
        this.b = i;
    }
}
