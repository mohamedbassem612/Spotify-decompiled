package p;

import com.spotify.player.model.command.PlayCommand;
import io.reactivex.rxjava3.core.Single;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class muz {
    public final ujm a;
    public final cve0 b;
    public final List c;

    public muz(ujm ujmVar, cve0 cve0Var, List list) {
        this.a = ujmVar;
        this.b = cve0Var;
        this.c = list;
    }

    public final Single a(PlayCommand playCommand) {
        List list = this.c;
        Single singleJust = Single.just(wgt0.a);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            singleJust = singleJust.flatMap(new t7y((jd2) it.next(), playCommand, (byte) 6));
        }
        return singleJust.flatMap(new yfu(this, playCommand, (byte) 5));
    }
}
