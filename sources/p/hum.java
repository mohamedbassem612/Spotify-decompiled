package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hum {
    public static final /* synthetic */ mma0[] c = {new dey0(hum.class, "contributionNotesDisabledUris", "getContributionNotesDisabledUris(Landroid/content/Context;)Landroidx/datastore/core/DataStore;")};
    public final Context a;
    public final u4r b;

    public hum(Context context, q8n q8nVar) {
        this.a = context;
        this.b = ila0.p("contribution_notes_disabled_uris", pbo1.X0, new ze3(atm.U0, (byte) 3), l1d.x(q8nVar));
    }

    public final mr20 a(String str) {
        return rqt0.u(new ld2(((r4r) this.b.a(this.a, c[0])).getData(), str, (byte) 6));
    }

    public final Object b(String str, a8d1 a8d1Var) {
        Object objA = ((r4r) this.b.a(this.a, c[0])).a(new lm9(str, (lnm) null, (byte) 2), a8d1Var);
        return objA == d9n.a ? objA : rih1.a;
    }
}
