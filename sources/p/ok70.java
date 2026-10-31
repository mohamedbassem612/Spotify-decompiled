package p;

import com.spotify.interapp.interappprotocol.NotAuthorizedException;
import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class ok70 implements Action {
    public final /* synthetic */ dbm a;
    public final /* synthetic */ int b;

    public /* synthetic */ ok70(dbm dbmVar, int i) {
        this.a = dbmVar;
        this.b = i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.interapp.interappprotocol.NotAuthorizedException */
    public final void run() throws NotAuthorizedException {
        int i = ((ho41) this.a.a).a;
        int i2 = this.b;
        if ((i & i2) != i2) {
            throw new NotAuthorizedException();
        }
    }
}
