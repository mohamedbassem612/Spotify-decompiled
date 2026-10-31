package p;

import android.content.Context;
import java.util.List;
import spotify.playlist.local_list_config_esperanto.proto.LocalListConfig;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nfe0 implements jlq0 {
    public final Context a;
    public final jn7 b;
    public final q8n c;
    public final mut0 d;

    public nfe0(Context context, jn7 jn7Var, q8n q8nVar, mut0 mut0Var) {
        this.a = context;
        this.b = jn7Var;
        this.c = q8nVar;
        this.d = mut0Var;
    }

    @Override // p.jlq0
    public final void c() {
        kfe0 kfe0VarN = LocalListConfig.n();
        kfe0VarN.q("spotify:local-files:cover:v1");
        kfe0VarN.s(nik1.K2.a);
        kfe0VarN.r(this.a.getString(2131957653));
        LocalListConfig localListConfig = (LocalListConfig) kfe0VarN.build();
        kfe0 kfe0VarN2 = LocalListConfig.n();
        kfe0VarN2.s("spotify:list:offline-playable:all");
        mut0 mut0Var = this.d;
        kfe0VarN2.r(mut0Var.a);
        kfe0VarN2.n(mut0Var.b);
        kfe0VarN2.q("spotify:cached-files");
        List listM = p7h.M(localListConfig, (LocalListConfig) kfe0VarN2.build());
        if (listM.isEmpty()) {
            return;
        }
        c921.y(smo1.e(this.c), (o8n) null, 0, new q4d0(this, listM, (lnm) null, (byte) 29), 3);
    }

    @Override // p.jlq0
    public final String getName() {
        return "LocalListConfigUpdateOperation";
    }
}
