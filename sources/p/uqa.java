package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uqa extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ xrc0 c;
    public final /* synthetic */ uu00 d;
    public final /* synthetic */ bhf e;
    public final /* synthetic */ wh71 f;
    public final /* synthetic */ gqg g;
    public final /* synthetic */ aru0 h;
    public final /* synthetic */ q8n i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uqa(Context context, xrc0 xrc0Var, uu00 uu00Var, bhf bhfVar, wh71 wh71Var, gqg gqgVar, aru0 aru0Var, q8n q8nVar, byte b) {
        super(1);
        this.a = b;
        this.b = context;
        this.c = xrc0Var;
        this.d = uu00Var;
        this.e = bhfVar;
        this.f = wh71Var;
        this.g = gqgVar;
        this.h = aru0Var;
        this.i = q8nVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        aru0 aru0Var = this.h;
        gqg gqgVar = this.g;
        bhf bhfVar = this.e;
        uu00 uu00Var = this.d;
        xrc0 xrc0Var = this.c;
        Context context = this.b;
        switch (b) {
            case 0:
                oud oudVar = (oud) obj;
                d0r d0rVarA = szq.a();
                upa upaVar = new upa(context, new dn3(context, false));
                z2h z2hVar = new z2h(xrc0Var, uu00Var);
                wh71 wh71Var = this.f;
                vxv0 vxv0Var = new vxv0(bhfVar, wh71Var, gqgVar, aru0Var);
                h3x h3xVar = new h3x(oudVar);
                q8n q8nVar = this.i;
                return new oqa(new f70((byte) 4), new uq7(oudVar, wh71Var, q8nVar, new l0r(d0rVarA, new qka(1, upaVar, upa.class, "create", "create(Lcom/spotify/share/formats/betterscreenshot/impl/BetterScreenshotShareCardElement$Props;)Lcom/spotify/kodiak/dataloader/statement/DataStatement;", 0, (byte) 2), yda.U0, q8nVar, new ew0(z2hVar, (lnm) null, (byte) 7), yda.V0, yda.W0), new xpa(vxv0Var, h3xVar, q8nVar)), upaVar);
            default:
                oud oudVar2 = (oud) obj;
                d0r d0rVarA2 = szq.a();
                rp5 rp5Var = new rp5(context);
                y5h y5hVar = new y5h(context, new dn3(context, false));
                z2h z2hVar2 = new z2h(xrc0Var, uu00Var);
                h3x h3xVar2 = new h3x(oudVar2);
                g3x g3xVar = new g3x(oudVar2);
                wh71 wh71Var2 = this.f;
                vxv0 vxv0Var2 = new vxv0(bhfVar, wh71Var2, gqgVar, aru0Var);
                q8n q8nVar2 = this.i;
                return new t6h(new f70((byte) 5), new uq7(oudVar2, wh71Var2, q8nVar2, new l0r(d0rVarA2, new qka(1, y5hVar, y5h.class, "create", "create(Lcom/spotify/share/formats/collection/impl/CollectionShareCardElement$Props;)Lcom/spotify/kodiak/dataloader/statement/DataStatement;", 0, (byte) 26), tpg.d1, q8nVar2, new b7c(rp5Var, z2hVar2, (lnm) null, (byte) 10), tpg.e1, m4h.b), new c6h(h3xVar2, g3xVar, vxv0Var2, q8nVar2)), y5hVar);
        }
    }
}
