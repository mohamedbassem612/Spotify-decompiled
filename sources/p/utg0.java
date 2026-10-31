package p;

import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class utg0 implements d0u0 {
    public final yqg a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final LinkedHashMap d = new LinkedHashMap();
    public final PublishSubject e = new PublishSubject();

    public utg0(yqg yqgVar) {
        this.a = yqgVar;
    }

    @Override // p.d0u0
    public final c0u0 a(m0u0 m0u0Var, oot0 oot0Var, np00 np00Var, String str) {
        String str2 = (String) m0u0Var.b().get("playback_id");
        if (str2 == null) {
            str2 = "";
        }
        stg0 stg0Var = (stg0) this.c.get(str2);
        if (stg0Var == null) {
            ytw0 ytw0Var = jfv.b;
            stg0Var = new stg0(z6x.a, 0L, (jfv) null);
        }
        rtg0 rtg0Var = new rtg0(stg0Var.c(), stg0Var.b(), stg0Var.a(), np00Var, this.a, new dt90(this, m0u0Var, str2, (byte) 17));
        this.b.put(m0u0Var, rtg0Var);
        this.d.put(m0u0Var, rtg0Var.a().subscribe(new w090(this, m0u0Var, (byte) 13)));
        return rtg0Var;
    }
}
