package p;

import com.spotify.wrapped.v1.proto.SceneTemplate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wbf1 extends a8d1 implements vu30 {
    public rbf1 X;
    public qbf1 Y;
    public pbf1 Z;
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ g7m1 d;
    public final /* synthetic */ xbf1 e;
    public SceneTemplate.TopPlaylistsContent.List.PlaylistItem f;
    public String g;
    public ubf1 h;
    public tbf1 i;
    public sbf1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wbf1(int i, Object obj, lnm lnmVar, g7m1 g7m1Var, xbf1 xbf1Var) {
        super(2, lnmVar);
        this.b = i;
        this.c = obj;
        this.d = g7m1Var;
        this.e = xbf1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new wbf1(this.b, this.c, lnmVar, this.d, this.e);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        SceneTemplate.TopPlaylistsContent.List.PlaylistItem playlistItem;
        tbf1 tbf1Var;
        ubf1 ubf1Var;
        Object objE;
        String str;
        sbf1 sbf1Var;
        rbf1 rbf1Var;
        qbf1 qbf1Var;
        pbf1 pbf1Var;
        boolean z = this.a;
        g7m1 g7m1Var = this.d;
        jia jiaVar = null;
        if (!z) {
            hm5.M(obj);
            playlistItem = (SceneTemplate.TopPlaylistsContent.List.PlaylistItem) this.c;
            String strN = playlistItem.n();
            pbf1 pbf1Var2 = new pbf1(playlistItem);
            qbf1 qbf1Var2 = new qbf1(playlistItem);
            rbf1 rbf1Var2 = new rbf1(playlistItem);
            sbf1 sbf1Var2 = new sbf1(playlistItem);
            tbf1Var = new tbf1(playlistItem);
            ubf1Var = new ubf1(playlistItem);
            bju bjuVar = g7m1Var.b;
            String strC = f4i1.c(this.b, "list_playlist_");
            vbf1 vbf1Var = new vbf1(playlistItem, this.e, null);
            this.f = playlistItem;
            this.g = strN;
            this.h = ubf1Var;
            this.i = tbf1Var;
            this.t = sbf1Var2;
            this.X = rbf1Var2;
            this.Y = qbf1Var2;
            this.Z = pbf1Var2;
            this.a = true;
            objE = bjuVar.e(strC, vbf1Var, this);
            d9n d9nVar = d9n.a;
            if (objE == d9nVar) {
                return d9nVar;
            }
            str = strN;
            sbf1Var = sbf1Var2;
            rbf1Var = rbf1Var2;
            qbf1Var = qbf1Var2;
            pbf1Var = pbf1Var2;
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            pbf1 pbf1Var3 = this.Z;
            qbf1 qbf1Var3 = this.Y;
            rbf1 rbf1Var3 = this.X;
            sbf1 sbf1Var3 = this.t;
            tbf1 tbf1Var2 = this.i;
            ubf1 ubf1Var2 = this.h;
            String str2 = this.g;
            SceneTemplate.TopPlaylistsContent.List.PlaylistItem playlistItem2 = this.f;
            hm5.M(obj);
            tbf1Var = tbf1Var2;
            ubf1Var = ubf1Var2;
            str = str2;
            qbf1Var = qbf1Var3;
            rbf1Var = rbf1Var3;
            sbf1Var = sbf1Var3;
            pbf1Var = pbf1Var3;
            playlistItem = playlistItem2;
            objE = obj;
        }
        yj41 yj41Var = (yj41) objE;
        rx7 rx7VarF = playlistItem.w() ? u3k.f(playlistItem.q()) : null;
        str.getClass();
        tnu0 tnu0Var = new tnu0(pbf1Var, qbf1Var, rbf1Var, sbf1Var, tbf1Var, ubf1Var, yj41Var, rx7VarF, str, cy30.p(str, ". ", lbf1.a(playlistItem.o()), ". ", lbf1.a(playlistItem.p())));
        if (playlistItem.w() && playlistItem.q().u()) {
            jiaVar = (jia) g7m1Var.e.invoke(ria.a(playlistItem.q().o()));
        }
        return new mmr0(tnu0Var, jiaVar);
    }
}
