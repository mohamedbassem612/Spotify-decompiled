package p;

import android.graphics.Bitmap;
import com.google.protobuf.h;
import com.spotify.culturalmoments.stories.v1.FeaturedCardStory;
import com.spotify.culturalmoments.stories.v1.PlaylistStory;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class u8c1 extends a8d1 implements xu30 {
    public final /* synthetic */ h X;
    public final /* synthetic */ byte a;
    public zda[] b;
    public Object c;
    public Object d;
    public zda[] e;
    public int f;
    public byte g;
    public /* synthetic */ g8c1 h;
    public Object i;
    public Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u8c1(h hVar, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.X = hVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        h hVar = this.X;
        tj41 tj41Var = (tj41) obj;
        g8c1 g8c1Var = (g8c1) obj2;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                u8c1 u8c1Var = new u8c1((PlaylistStory) hVar, lnmVar, (byte) 0);
                u8c1Var.h = g8c1Var;
                return u8c1Var.invokeSuspend(rih1Var);
            default:
                u8c1 u8c1Var2 = new u8c1((FeaturedCardStory) hVar, lnmVar, (byte) 1);
                u8c1Var2.t = tj41Var;
                u8c1Var2.h = g8c1Var;
                return u8c1Var2.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    public final Object invokeSuspend(Object obj) {
        zda[] zdaVarArr;
        hec hecVar;
        Object objG;
        gpr0 gpr0Var;
        zda[] zdaVarArr2;
        Bitmap bitmap;
        Object objG2;
        sk41 sk41Var;
        zda[] zdaVarArr3;
        gpr0 gpr0Var2;
        Object objQ;
        zda[] zdaVarArr4;
        Object objG3;
        vn10 vn10Var;
        sk41 sk41Var2;
        int i;
        zda[] zdaVarArr5;
        Bitmap bitmap2;
        Object objG4;
        Bitmap bitmap3;
        vn10 vn10Var2;
        byte b = this.a;
        int i2 = 0;
        sk41 sk41Var3 = sk41.a;
        d9n d9nVar = d9n.a;
        h hVar = this.X;
        switch (b) {
            case 0:
                PlaylistStory playlistStory = (PlaylistStory) hVar;
                g8c1 g8c1Var = this.h;
                byte b2 = this.g;
                if (b2 != 0) {
                    if (b2 == 1) {
                        i2 = this.f;
                        zda[] zdaVarArr6 = (zda[]) this.d;
                        sk41 sk41Var4 = (sk41) this.c;
                        hec hecVar2 = (hec) this.t;
                        gpr0 gpr0Var3 = (gpr0) this.i;
                        zda[] zdaVarArr7 = this.b;
                        hm5.M(obj);
                        hecVar = hecVar2;
                        zdaVarArr2 = zdaVarArr6;
                        sk41Var3 = sk41Var4;
                        zdaVarArr = zdaVarArr7;
                        gpr0Var = gpr0Var3;
                        objG = obj;
                    } else {
                        if (b2 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = this.f;
                        zdaVarArr3 = this.e;
                        sk41 sk41Var5 = (sk41) this.d;
                        Bitmap bitmap4 = (Bitmap) this.c;
                        hec hecVar3 = (hec) this.t;
                        gpr0 gpr0Var4 = (gpr0) this.i;
                        zda[] zdaVarArr8 = this.b;
                        hm5.M(obj);
                        bitmap = bitmap4;
                        hecVar = hecVar3;
                        gpr0Var2 = gpr0Var4;
                        sk41Var = sk41Var5;
                        zdaVarArr = zdaVarArr8;
                        objG2 = obj;
                    }
                    zdaVarArr3[i2] = new oic(gpr0Var2, bitmap, (Bitmap) objG2, hecVar, g8c1Var.g.a, !g8c1Var.e);
                    sk41Var.getClass();
                    return Collections.singletonList(sk41.a(zdaVarArr));
                }
                hm5.M(obj);
                zdaVarArr = new zda[1];
                gpr0 gpr0VarI = zho1.I(2132018003, playlistStory.r().o(), playlistStory.r().p());
                fec fecVar = new fec(zho1.L(playlistStory.p().q()), playlistStory.p().p(), zho1.L(playlistStory.p().n()));
                hecVar = new hec(fecVar, fecVar, new huz(Boolean.TRUE, (byte) 10), new hp91(g8c1Var, playlistStory, (byte) 19));
                gw70 gw70Var = g8c1Var.c;
                String imageUrl = playlistStory.getImageUrl();
                this.h = g8c1Var;
                this.b = zdaVarArr;
                this.i = gpr0VarI;
                this.t = hecVar;
                this.c = sk41Var3;
                this.d = zdaVarArr;
                this.f = 0;
                this.g = (byte) 1;
                objG = zho1.G(imageUrl, this, gw70Var);
                if (objG == d9nVar) {
                    return d9nVar;
                }
                gpr0Var = gpr0VarI;
                zdaVarArr2 = zdaVarArr;
                bitmap = (Bitmap) objG;
                gw70 gw70Var2 = g8c1Var.c;
                String strN = playlistStory.n();
                this.h = g8c1Var;
                this.b = zdaVarArr;
                this.i = gpr0Var;
                this.t = hecVar;
                this.c = bitmap;
                this.d = sk41Var3;
                this.e = zdaVarArr2;
                this.f = i2;
                this.g = (byte) 2;
                objG2 = zho1.G(strN, this, gw70Var2);
                if (objG2 == d9nVar) {
                    return d9nVar;
                }
                sk41Var = sk41Var3;
                zdaVarArr3 = zdaVarArr2;
                gpr0Var2 = gpr0Var;
                zdaVarArr3[i2] = new oic(gpr0Var2, bitmap, (Bitmap) objG2, hecVar, g8c1Var.g.a, !g8c1Var.e);
                sk41Var.getClass();
                return Collections.singletonList(sk41.a(zdaVarArr));
            default:
                FeaturedCardStory featuredCardStory = (FeaturedCardStory) hVar;
                tj41 tj41Var = (tj41) this.t;
                g8c1 g8c1Var2 = this.h;
                byte b3 = this.g;
                if (b3 != 0) {
                    if (b3 == 1) {
                        hm5.M(obj);
                        objQ = obj;
                    } else if (b3 == 2) {
                        int i3 = this.f;
                        zda[] zdaVarArr9 = (zda[]) this.d;
                        sk41 sk41Var6 = (sk41) this.c;
                        vn10 vn10Var3 = (vn10) this.i;
                        zda[] zdaVarArr10 = this.b;
                        hm5.M(obj);
                        vn10Var = vn10Var3;
                        sk41Var2 = sk41Var6;
                        i = i3;
                        zdaVarArr5 = zdaVarArr9;
                        zdaVarArr4 = zdaVarArr10;
                        objG3 = obj;
                        bitmap2 = (Bitmap) objG3;
                        gw70 gw70Var3 = g8c1Var2.c;
                        String strO = featuredCardStory.o();
                        this.t = null;
                        this.h = g8c1Var2;
                        this.b = zdaVarArr4;
                        this.i = vn10Var;
                        this.c = bitmap2;
                        this.d = sk41Var2;
                        this.e = zdaVarArr5;
                        this.f = i;
                        this.g = (byte) 3;
                        objG4 = zho1.G(strO, this, gw70Var3);
                        if (objG4 == d9nVar) {
                            return d9nVar;
                        }
                        bitmap3 = bitmap2;
                        vn10Var2 = vn10Var;
                    } else {
                        if (b3 != 3) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        int i4 = this.f;
                        zdaVarArr5 = this.e;
                        sk41 sk41Var7 = (sk41) this.d;
                        Bitmap bitmap5 = (Bitmap) this.c;
                        vn10 vn10Var4 = (vn10) this.i;
                        zda[] zdaVarArr11 = this.b;
                        hm5.M(obj);
                        bitmap3 = bitmap5;
                        vn10Var2 = vn10Var4;
                        sk41Var2 = sk41Var7;
                        i = i4;
                        zdaVarArr4 = zdaVarArr11;
                        objG4 = obj;
                    }
                    zdaVarArr5[i] = new yn10(vn10Var2, bitmap3, featuredCardStory.r(), (Bitmap) objG4, zho1.I(2132018023, featuredCardStory.w().o(), featuredCardStory.w().p()), zho1.I(2132018007, featuredCardStory.v().o(), featuredCardStory.v().p()), g8c1Var2.g.a, !g8c1Var2.e, featuredCardStory.n().q());
                    sk41Var2.getClass();
                    return Collections.singletonList(sk41.a(zdaVarArr4));
                }
                hm5.M(obj);
                this.t = tj41Var;
                this.h = g8c1Var2;
                this.g = (byte) 1;
                objQ = eio1.q(featuredCardStory, g8c1Var2, this);
                if (objQ == d9nVar) {
                    return d9nVar;
                }
                zn10 zn10Var = (zn10) objQ;
                tj41Var.b = zn10Var.b;
                tj41Var.a = zn10Var.c;
                zdaVarArr4 = new zda[1];
                vn10 vn10Var5 = zn10Var.a;
                gw70 gw70Var4 = g8c1Var2.c;
                String strP = featuredCardStory.p();
                this.t = null;
                this.h = g8c1Var2;
                this.b = zdaVarArr4;
                this.i = vn10Var5;
                this.c = sk41Var3;
                this.d = zdaVarArr4;
                this.f = 0;
                this.g = (byte) 2;
                objG3 = zho1.G(strP, this, gw70Var4);
                if (objG3 == d9nVar) {
                    return d9nVar;
                }
                vn10Var = vn10Var5;
                sk41Var2 = sk41Var3;
                i = 0;
                zdaVarArr5 = zdaVarArr4;
                bitmap2 = (Bitmap) objG3;
                gw70 gw70Var5 = g8c1Var2.c;
                String strO2 = featuredCardStory.o();
                this.t = null;
                this.h = g8c1Var2;
                this.b = zdaVarArr4;
                this.i = vn10Var;
                this.c = bitmap2;
                this.d = sk41Var2;
                this.e = zdaVarArr5;
                this.f = i;
                this.g = (byte) 3;
                objG4 = zho1.G(strO2, this, gw70Var5);
                if (objG4 == d9nVar) {
                    return d9nVar;
                }
                bitmap3 = bitmap2;
                vn10Var2 = vn10Var;
                zdaVarArr5[i] = new yn10(vn10Var2, bitmap3, featuredCardStory.r(), (Bitmap) objG4, zho1.I(2132018023, featuredCardStory.w().o(), featuredCardStory.w().p()), zho1.I(2132018007, featuredCardStory.v().o(), featuredCardStory.v().p()), g8c1Var2.g.a, !g8c1Var2.e, featuredCardStory.n().q());
                sk41Var2.getClass();
                return Collections.singletonList(sk41.a(zdaVarArr4));
        }
    }
}
