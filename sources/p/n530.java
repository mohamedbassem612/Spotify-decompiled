package p;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.mobius.MobiusLoop;
import com.spotify.nowplaying.scroll.ScrollCardType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class n530 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vgr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n530(vgr vgrVar, byte b) {
        super(2);
        this.a = b;
        this.b = vgrVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        cgx0 agx0Var;
        byte b = this.a;
        vgr vgrVar = this.b;
        switch (b) {
            case 0:
                iac0 iac0Var = (iac0) obj2;
                su11 su11Var = (su11) vgrVar.d;
                boolean z = vgrVar.b;
                epb1 epb1Var = new epb1((zob1) obj);
                os11 os11Var = new os11();
                xpn1.p(os11Var, su11Var.c, su11Var.d, su11Var.e, su11Var.f, su11Var.g, su11Var.h, su11Var.i, su11Var.j, su11Var.o, new pu11(su11Var, (byte) 0), new pu11(su11Var, (byte) 1), new pu11(su11Var, (byte) 2), new pu11(su11Var, (byte) 3), new pu11(su11Var, (byte) 4), new pu11(su11Var, (byte) 5), new pu11(su11Var, (byte) 6), su11Var.k, su11Var.l, true, su11Var.m.a(true), (du11) null, (tld1) null, su11Var.b, su11Var.x, (Context) null, false, false, su11Var.z, igu.a, pyf0.a, su11Var.n, false, 242221056, 1);
                os11Var.m = kpc1.a;
                ms11 ms11VarA = os11Var.a();
                zsc zscVar = su11Var.a;
                e50 e50Var = ms11VarA.e;
                vtw vtwVarX = e50Var != null ? two1.x(e50Var, epb1Var, iac0Var) : null;
                e50 e50Var2 = ms11VarA.a;
                vtw vtwVarX2 = e50Var2 != null ? two1.x(e50Var2, epb1Var, iac0Var) : null;
                e50 e50Var3 = ms11VarA.b;
                vtw vtwVarX3 = e50Var3 != null ? two1.x(e50Var3, epb1Var, iac0Var) : null;
                e50 e50Var4 = ms11VarA.c;
                vtw vtwVarX4 = e50Var4 != null ? two1.x(e50Var4, epb1Var, iac0Var) : null;
                e50 e50Var5 = ms11VarA.d;
                vtw vtwVarX5 = e50Var5 != null ? two1.x(e50Var5, epb1Var, iac0Var) : null;
                yt11 yt11Var = ms11VarA.g;
                gc8 gc8Var = new gc8((byte) 1);
                vtw vtwVar = vtwVarX;
                vtw vtwVar2 = vtwVarX2;
                em0 em0Var = new em0(new lh2(3, (w6g1) ms11VarA.l.d, w6g1.class, "extractTraits", "extractTraits(Ljava/lang/String;Ljava/lang/String;Lcom/spotify/listcontentruntime/metadataapi/MetadataValues;)Ljava/lang/Object;", 0, (byte) 19), epb1Var, ms11VarA.i, (iu30) null, (iu30) null, (iu30) null, new pu11(su11Var, (byte) 7), ms11VarA.m, (vu30) null, (vu30) null, 1656);
                mka mkaVar = ms11VarA.k;
                int iG = k4p1.G(ms11VarA.y);
                int i = ms11VarA.z;
                ppc1 ppc1Var = ms11VarA.n;
                boolean z2 = su11Var.y;
                zll zllVar = su11Var.v;
                if (z2) {
                    MobiusLoop mobiusLoop = zllVar.c;
                    if (mobiusLoop == null) {
                        u890.C("loop");
                        throw null;
                    }
                    agx0Var = new cgx0(aym.l(mobiusLoop));
                } else {
                    MobiusLoop mobiusLoop2 = zllVar.c;
                    if (mobiusLoop2 == null) {
                        u890.C("loop");
                        throw null;
                    }
                    agx0Var = new agx0(aym.l(mobiusLoop2));
                }
                return new jpg0(zsc.j(zscVar, em0Var, mkaVar, iG, z, vtwVar, (vtw) null, vtwVar2, vtwVarX3, vtwVarX4, vtwVarX5, yt11Var, gc8Var, (nu11) null, false, 0, z2, ppc1Var, false, false, su11Var.z, agx0Var, i, 1264566432), ou11.g);
            case 1:
                e821 e821Var = (e821) vgrVar.e;
                return new jpg0(new ye31(new nfx(((xfx) e821Var.b).b, (gw70) e821Var.a, (byte) 6), (lzn0) e821Var.c, (af31) null, (x5j1) e821Var.d, (Context) e821Var.e), oe31.f);
            case 2:
                return f6o1.A(new kpg0(new br0(((ae5) vgrVar.f).a), k74.W0), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
            case 3:
                return new jpg0(f6o1.A((maa) ((dt8) vgrVar.h).b.get(), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), svu0.P0);
            case 4:
                return new jpg0(f6o1.A(new w460(((rsm) vgrVar.c).a, false, false, false, (a1r0) null, 60), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), v160.X);
            default:
                t7y t7yVar = (t7y) vgrVar.g;
                p811 p811Var = new p811();
                return new jpg0(new aso(f6o1.A(new br0(new w2z(new evz(((s530) t7yVar.c).d, t7yVar, (byte) 9), p811Var, (byte) 19)), new ViewGroup.LayoutParams(-2, -2), (ScrollCardType) null, 2), new z5z(t7yVar, (byte) 9)), new i3(p811Var, (byte) 6));
        }
    }
}
