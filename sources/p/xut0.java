package p;

import android.os.Parcelable;
import com.spotify.player.esperanto.proto.EsLoggingParams;
import com.spotify.player.esperanto.proto.EsOptional;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xut0 {
    public final q8n a;
    public final ynb0 b;
    public final b7r0 c;
    public final ynb0 d;
    public final ynb0 e;
    public final tp91 f;
    public final yqg g;
    public final ynb0 h;
    public final idd1 i = new idd1(new wut0(this, (byte) 0));
    public final idd1 j = new idd1(new wut0(this, (byte) 1));

    public xut0(q8n q8nVar, Flowable flowable, ynb0 ynb0Var, b7r0 b7r0Var, ynb0 ynb0Var2, ynb0 ynb0Var3, tp91 tp91Var, yqg yqgVar, ynb0 ynb0Var4) {
        this.a = q8nVar;
        this.b = ynb0Var;
        this.c = b7r0Var;
        this.d = ynb0Var2;
        this.e = ynb0Var3;
        this.f = tp91Var;
        this.g = yqgVar;
        this.h = ynb0Var4;
        new ObservableFromPublisher(flowable).map(yz10.W0).distinctUntilChanged().map(new sks0(this, (byte) 3)).onErrorReturnItem(wrt0.c);
    }

    public static feh d(py21 py21Var) {
        if (py21Var instanceof oy21) {
            return new ceh();
        }
        if (py21Var instanceof ly21) {
            return new beh(((ly21) py21Var).a.b());
        }
        eg.o();
        return null;
    }

    public final trc0 a() {
        x2d0 q2d0Var;
        ztc ztcVar = (ztc) ((stk) this.e.get()).a().blockingFirst();
        mia1 mia1Var = ztcVar.a;
        String str = mia1Var.a;
        boolean z = mia1Var.b;
        Parcelable.Creator creator = ztc.CREATOR;
        if (u890.j(str, "name")) {
            q2d0Var = new x2d0(z);
        } else if (u890.j(str, "artist.name")) {
            q2d0Var = new s2d0(z);
        } else {
            q2d0Var = u890.j(str, "album.name") ? new q2d0(z) : u2d0.a;
        }
        x2d0 x2d0Var = q2d0Var;
        List list = ztcVar.c;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new qqc0((String) it.next()));
        }
        return new trc0((PlaylistRequestDecorationPolicy) null, x2d0Var, o7h.p1(arrayList), false, (src0) null, (mqz0) null, (prc0) null, 0, (List) null, 505);
    }

    public final EsLoggingParams.LoggingParams b(String str) {
        coz cozVarR = EsLoggingParams.LoggingParams.r();
        cozVarR.n(str);
        y6r0 y6r0Var = this.c.get();
        String str2 = y6r0Var != null ? y6r0Var.a : null;
        if (str2 == null) {
            str2 = "";
        }
        cozVarR.q(str2);
        qpz qpzVarP = EsOptional.OptionalInt64.p();
        qpzVarP.n(this.g.b());
        cozVarR.t(qpzVarP);
        return cozVarR.build();
    }

    public final Single c(String str) {
        return ((ki91) this.j.getValue()).d((String) this.i.getValue()).firstOrError().flatMap(new zhq0(this, str, (byte) 26)).onErrorReturnItem(new beh("Failed to play"));
    }
}
