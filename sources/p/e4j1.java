package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e4j1 implements xpw {
    public final Context a;
    public final ajg b;
    public final js20 c = x3p1.m(r6x.a, new hcf1(1, this, e4j1.class, "createState", "createState(Lcom/spotify/settings/platform/api/items/CustomSettingsItem$StandardContent;)Lcom/spotify/versionprovider/settings/version/impl/VersionSettingElement$State;", 0, (byte) 17), new muh1(this, (byte) 10), (o8n) null, new ymg1(this, (byte) 26), 8);
    public final ia00 d = n3o1.q(this).a(k3j1.c, k3j1.d);
    public final psw e;

    public e4j1(Context context, ajg ajgVar) {
        this.a = context;
        this.b = ajgVar;
        j2i j2iVar = iqj.a;
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.d;
    }

    public final jsw c() {
        return this.e;
    }

    public final mqw getBehavior() {
        return this.c;
    }
}
