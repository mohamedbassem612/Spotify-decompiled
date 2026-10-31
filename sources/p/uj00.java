package p;

import com.spotify.home.evopage.mobius.Event;
import com.spotify.home.evopage.mobius.State;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class uj00 implements Update {
    public final /* synthetic */ boolean a;

    public uj00(boolean z) {
        this.a = z;
    }

    @Override // com.spotify.mobius.Update
    public final Next a(Object obj, Object obj2) {
        State state = (State) obj;
        Event event = (Event) obj2;
        state.getClass();
        event.getClass();
        return com.spotify.home.evopage.mobius.b.a(state, event, this.a);
    }
}
