package p;

import android.content.Context;
import com.spotify.cosmos.p000servicebasedrouter.AndroidServicebasedrouterProperties$TestHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class knh0 implements sdm {
    public final Context a;
    public final gmt b;
    public final jl21 c;
    public final iir d;
    public final hur e;

    public knh0(Context context, gmt gmtVar, jl21 jl21Var, iir iirVar, hur hurVar) {
        this.a = context;
        this.b = gmtVar;
        this.c = jl21Var;
        this.d = iirVar;
        this.e = hurVar;
    }

    public final /* bridge */ /* synthetic */ Object a(oim oimVar, us0 us0Var) {
        return b((mnh0) oimVar);
    }

    public final kjm b(mnh0 mnh0Var) {
        List list = mnh0Var.c;
        boolean z = mnh0Var.e;
        List list2 = mnh0Var.d;
        List list3 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(new cxu((String) it.next(), 0, 0));
        }
        List list4 = list2;
        ArrayList arrayList2 = new ArrayList(q7h.U(list4, 10));
        Iterator it2 = list4.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new a3v((String) it2.next()));
        }
        int size = mnh0Var.c.size();
        int size2 = list2.size();
        tom tomVar = new tom(mnh0Var.b, mnh0Var.a, w4i1.f, 0L, false, new vol("", null), (rom) null, (ArrayList) null, (ArrayList) null, (nom) null, false, (xo2) null, 4032);
        igm igmVar = new igm(this.a.getString(2131958561), (rzn1) null, (String) null, 6);
        smc0 smc0VarN = k4p1.n();
        if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
            smc0VarN.add(new jhm("campfire_download_media", tmx.c, (fhm) null, 2131958536, (String) null, false, (tm81) null, new ihm(new ygm(2), new ghm(wvu.Z, wvu.N0), new m3n(arrayList, this.b, arrayList2, (byte) 19)), 244));
        }
        if (z != 0) {
            smc0VarN.add(new jhm("campfire_delete_contribution_for_everyone", cmx.c, (fhm) null, 2131958528, (String) null, false, (tm81) null, new ihm(new ygm(3), new ghm(z6t.t, z6t.X), new k8t(size, size2, this.e, tomVar, (byte) 0)), 244));
        }
        smc0VarN.add(new jhm("campfire_delete_contribution_for_me", cmx.c, (fhm) null, 2131958529, (String) null, false, (tm81) null, new ihm(new ygm(3), new ghm(z6t.Y, z6t.Z), new k8t(size, size2, this.d, tomVar, (byte) 1)), 244));
        if (!z) {
            smc0VarN.add(this.c.a("spotify:chat-message:".concat(mnh0Var.b), new lik1(pcf.d(6, mnh0Var.a, (String) null)), Collections.singletonMap("chatFlag", AndroidServicebasedrouterProperties$TestHelper.TRUE)));
        }
        return new kjm(igmVar, k4p1.k(smc0VarN), 4);
    }
}
