package p;

import android.app.Activity;
import android.graphics.Bitmap;
import com.google.protobuf.h;
import com.spotify.fandomcollectibles.protos.IntroStory;
import com.spotify.fandomcollectibles.protos.TitleStory;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class r8c1 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public Object[] b;
    public zda[] c;
    public Object[] d;
    public sk41 e;
    public zda[] f;
    public long g;
    public boolean h;
    public /* synthetic */ f8c1 i;
    public final /* synthetic */ h t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r8c1(h hVar, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.t = hVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        h hVar = this.t;
        f8c1 f8c1Var = (f8c1) obj2;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                r8c1 r8c1Var = new r8c1((IntroStory) hVar, lnmVar, (byte) 0);
                r8c1Var.i = f8c1Var;
                return r8c1Var.invokeSuspend(rih1Var);
            default:
                r8c1 r8c1Var2 = new r8c1((TitleStory) hVar, lnmVar, (byte) 1);
                r8c1Var2.i = f8c1Var;
                return r8c1Var2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        vk41[] vk41VarArr;
        zda[] zdaVarArr;
        Object objU;
        long j;
        vk41[] vk41VarArr2;
        zda[] zdaVarArr2;
        qye1 gdf0Var;
        long jS;
        vk41[] vk41VarArr3;
        zda[] zdaVarArr3;
        Object objU2;
        vk41[] vk41VarArr4;
        zda[] zdaVarArr4;
        zda esb1Var;
        byte b = this.a;
        sk41 sk41Var = sk41.a;
        d9n d9nVar = d9n.a;
        h hVar = this.t;
        switch (b) {
            case 0:
                IntroStory introStory = (IntroStory) hVar;
                f8c1 f8c1Var = this.i;
                boolean z = this.h;
                if (!z) {
                    hm5.M(obj);
                    long jS2 = introStory.o().s() / 5;
                    vk41VarArr = new vk41[2];
                    zdaVarArr = new zda[1];
                    gw70 gw70Var = f8c1Var.c;
                    String strN = introStory.n();
                    this.i = f8c1Var;
                    this.b = vk41VarArr;
                    this.c = zdaVarArr;
                    this.d = vk41VarArr;
                    this.e = sk41Var;
                    this.f = zdaVarArr;
                    this.g = jS2;
                    this.h = true;
                    objU = who1.u(strN, this, gw70Var);
                    if (objU == d9nVar) {
                        return d9nVar;
                    }
                    j = jS2;
                    vk41VarArr2 = vk41VarArr;
                    zdaVarArr2 = zdaVarArr;
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j2 = this.g;
                    zdaVarArr2 = this.f;
                    sk41 sk41Var2 = this.e;
                    vk41[] vk41VarArr5 = (vk41[]) this.d;
                    zdaVarArr = this.c;
                    vk41[] vk41VarArr6 = (vk41[]) this.b;
                    hm5.M(obj);
                    j = j2;
                    sk41Var = sk41Var2;
                    vk41VarArr2 = vk41VarArr5;
                    vk41VarArr = vk41VarArr6;
                    objU = obj;
                }
                zdaVarArr2[0] = new qy9((Bitmap) objU, (byte) 0);
                sk41Var.getClass();
                vk41VarArr2[0] = sk41.a(zdaVarArr);
                ie90 ie90Var = f8c1Var.i;
                Activity activity = f8c1Var.a;
                if (ie90Var.a) {
                    gdf0Var = new qye1(who1.y(jon1.p(2132018010, activity), introStory.r().o(), introStory.r().p()), who1.y(jon1.p(2132018003, activity), introStory.q().o(), introStory.q().p()), j, introStory.o().s() - j);
                } else {
                    gdf0Var = new gdf0(who1.y(jon1.p(2132018010, activity), introStory.r().o(), introStory.r().p()), who1.y(jon1.p(2132018003, activity), introStory.q().o(), introStory.q().p()));
                }
                vk41VarArr[1] = new vk41(f46.Q0(new zda[]{gdf0Var}));
                return p7h.M(vk41VarArr);
            default:
                TitleStory titleStory = (TitleStory) hVar;
                f8c1 f8c1Var2 = this.i;
                boolean z2 = this.h;
                if (!z2) {
                    hm5.M(obj);
                    jS = titleStory.o().s();
                    vk41VarArr3 = new vk41[2];
                    zdaVarArr3 = new zda[1];
                    gw70 gw70Var2 = f8c1Var2.c;
                    String strN2 = titleStory.n();
                    this.i = f8c1Var2;
                    this.b = vk41VarArr3;
                    this.c = zdaVarArr3;
                    this.d = vk41VarArr3;
                    this.e = sk41Var;
                    this.f = zdaVarArr3;
                    this.g = jS;
                    this.h = true;
                    objU2 = who1.u(strN2, this, gw70Var2);
                    if (objU2 == d9nVar) {
                        return d9nVar;
                    }
                    vk41VarArr4 = vk41VarArr3;
                    zdaVarArr4 = zdaVarArr3;
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j3 = this.g;
                    zda[] zdaVarArr5 = this.f;
                    sk41 sk41Var3 = this.e;
                    vk41[] vk41VarArr7 = (vk41[]) this.d;
                    zda[] zdaVarArr6 = this.c;
                    vk41[] vk41VarArr8 = (vk41[]) this.b;
                    hm5.M(obj);
                    zdaVarArr4 = zdaVarArr6;
                    zdaVarArr3 = zdaVarArr5;
                    jS = j3;
                    sk41Var = sk41Var3;
                    vk41VarArr4 = vk41VarArr7;
                    vk41VarArr3 = vk41VarArr8;
                    objU2 = obj;
                }
                zdaVarArr3[0] = new qy9((Bitmap) objU2, (byte) 0);
                sk41Var.getClass();
                vk41VarArr4[0] = sk41.a(zdaVarArr4);
                ie90 ie90Var2 = f8c1Var2.i;
                Activity activity2 = f8c1Var2.a;
                if (ie90Var2.a) {
                    esb1Var = new nro(who1.y(jon1.p(2132018010, activity2), titleStory.q().o(), titleStory.q().p()), jS, (byte) 1);
                } else {
                    esb1Var = new esb1(who1.y(jon1.p(2132018010, activity2), titleStory.q().o(), titleStory.q().p()));
                }
                vk41VarArr3[1] = new vk41(f46.Q0(new zda[]{esb1Var}));
                return p7h.M(vk41VarArr3);
        }
    }
}
