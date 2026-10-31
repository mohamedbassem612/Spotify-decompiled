package p;

import android.content.Context;
import com.spotify.preload.logger.LoginTimeReporterWorker;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class q2f0 implements ol8 {
    public final /* synthetic */ yfu a;

    public final void a(ck8 ck8Var) {
        boolean z = ck8Var.a;
        yfu yfuVar = this.a;
        awl1 awl1VarD = awl1.d((Context) yfuVar.b);
        yqg yqgVar = (yqg) yfuVar.c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("afterAccountCreation", Boolean.valueOf(z));
        linkedHashMap.put("timeInMillisWhenCreatedWork", Long.valueOf(yqgVar.b()));
        ewq ewqVar = new ewq(linkedHashMap);
        o0c.N(ewqVar);
        awl1VarD.a(new ciq0(LoginTimeReporterWorker.class).i(ewqVar).b());
    }
}
