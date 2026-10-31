package p;

import com.spotify.yourupdates.badgingstate.models.BadgingState;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class j0n1 {
    public final y2n1 a;
    public final BehaviorSubject b = BehaviorSubject.g(BadgingState.HIDE_BADGE);
    public final vku c = new vku();

    public j0n1(y2n1 y2n1Var) {
        this.a = y2n1Var;
    }
}
