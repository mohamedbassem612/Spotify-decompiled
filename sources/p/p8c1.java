package p;

import android.app.Activity;
import android.graphics.Bitmap;
import com.google.protobuf.h;
import com.spotify.fandomcollectibles.protos.ImageTitleSubtitleStory;
import com.spotify.fandomcollectibles.protos.SingleEntityStory;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class p8c1 extends a8d1 implements xu30 {
    public /* synthetic */ f8c1 X;
    public Object Y;
    public final /* synthetic */ h Z;
    public final /* synthetic */ byte a;
    public Object[] b;
    public zda[] c;
    public Object[] d;
    public sk41 e;
    public zda[] f;
    public gpr0 g;
    public gpr0 h;
    public boolean i;
    public byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p8c1(h hVar, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.Z = hVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        h hVar = this.Z;
        f8c1 f8c1Var = (f8c1) obj2;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                p8c1 p8c1Var = new p8c1((ImageTitleSubtitleStory) hVar, lnmVar, (byte) 0);
                p8c1Var.X = f8c1Var;
                return p8c1Var.invokeSuspend(rih1Var);
            default:
                p8c1 p8c1Var2 = new p8c1((SingleEntityStory) hVar, lnmVar, (byte) 1);
                p8c1Var2.X = f8c1Var;
                return p8c1Var2.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    public final Object invokeSuspend(Object obj) {
        vk41[] vk41VarArr;
        Object objU;
        zda[] zdaVarArr;
        zda[] zdaVarArr2;
        sk41 sk41Var;
        ?? r7;
        vk41[] vk41VarArr2;
        zda[] zdaVarArr3;
        gpr0 gpr0VarY;
        gpr0 gpr0VarY2;
        Object objU2;
        zda[] zdaVarArr4;
        boolean z;
        vk41[] vk41VarArr3;
        gpr0 gpr0VarY3;
        Object objU3;
        gpr0 gpr0Var;
        byy byyVar;
        zda[] zdaVarArr5;
        zda fyyVar;
        ?? r10;
        Object objU4;
        zda[] zdaVarArr6;
        zda[] zdaVarArr7;
        ?? r9;
        vk41[] vk41VarArr4;
        vk41[] vk41VarArr5;
        sk41 sk41Var2;
        zda[] zdaVarArr8;
        gpr0 gpr0VarY4;
        Object objU5;
        gpr0 gpr0Var2;
        gpr0 gpr0Var3;
        zda[] zdaVarArr9;
        ?? r2;
        vk41[] vk41VarArr6;
        byte b = this.a;
        d9n d9nVar = d9n.a;
        h hVar = this.Z;
        sk41 sk41Var3 = sk41.a;
        boolean z2 = true;
        switch (b) {
            case 0:
                ImageTitleSubtitleStory imageTitleSubtitleStory = (ImageTitleSubtitleStory) hVar;
                f8c1 f8c1Var = this.X;
                byte b2 = this.t;
                if (b2 == 0) {
                    hm5.M(obj);
                    vk41VarArr = new vk41[2];
                    zda[] zdaVarArr10 = new zda[1];
                    gw70 gw70Var = f8c1Var.c;
                    String strN = imageTitleSubtitleStory.n();
                    this.X = f8c1Var;
                    this.b = vk41VarArr;
                    this.c = zdaVarArr10;
                    this.d = vk41VarArr;
                    this.e = sk41Var3;
                    this.f = zdaVarArr10;
                    this.i = false;
                    this.t = (byte) 1;
                    objU = who1.u(strN, this, gw70Var);
                    if (objU == d9nVar) {
                        return d9nVar;
                    }
                    zdaVarArr = zdaVarArr10;
                    zdaVarArr2 = zdaVarArr;
                    sk41Var = sk41Var3;
                    r7 = 0;
                    vk41VarArr2 = vk41VarArr;
                } else {
                    if (b2 != 1) {
                        if (b2 != 2) {
                            if (b2 != 3) {
                                eg.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            z = this.i;
                            gpr0VarY2 = this.g;
                            gpr0VarY = (gpr0) this.Y;
                            zdaVarArr3 = this.f;
                            sk41Var3 = this.e;
                            vk41VarArr3 = (vk41[]) this.d;
                            zdaVarArr4 = this.c;
                            vk41[] vk41VarArr7 = (vk41[]) this.b;
                            hm5.M(obj);
                            vk41VarArr = vk41VarArr7;
                            objU2 = obj;
                            fyyVar = new mrb1(gpr0VarY, gpr0VarY2, (Bitmap) objU2, (byte) 1);
                            r10 = z;
                            zdaVarArr5 = zdaVarArr4;
                            zdaVarArr3[0] = fyyVar;
                            sk41Var3.getClass();
                            vk41VarArr3[r10] = sk41.a(zdaVarArr5);
                            return p7h.M(vk41VarArr);
                        }
                        boolean z3 = this.i;
                        gpr0VarY3 = this.h;
                        gpr0 gpr0Var4 = this.g;
                        byyVar = (byy) this.Y;
                        zdaVarArr3 = this.f;
                        sk41Var3 = this.e;
                        vk41VarArr3 = (vk41[]) this.d;
                        zdaVarArr5 = this.c;
                        vk41[] vk41VarArr8 = (vk41[]) this.b;
                        hm5.M(obj);
                        vk41VarArr = vk41VarArr8;
                        gpr0Var = gpr0Var4;
                        objU3 = obj;
                        z2 = z3;
                        gpr0 gpr0Var5 = gpr0VarY3;
                        long jS = imageTitleSubtitleStory.o().s();
                        byyVar.getClass();
                        fyyVar = new fyy(gpr0Var, gpr0Var5, (Bitmap) objU3, jS);
                        r10 = z2;
                        zdaVarArr3[0] = fyyVar;
                        sk41Var3.getClass();
                        vk41VarArr3[r10] = sk41.a(zdaVarArr5);
                        return p7h.M(vk41VarArr);
                    }
                    boolean z4 = this.i;
                    zda[] zdaVarArr11 = this.f;
                    sk41Var = this.e;
                    vk41[] vk41VarArr9 = (vk41[]) this.d;
                    zda[] zdaVarArr12 = this.c;
                    vk41[] vk41VarArr10 = (vk41[]) this.b;
                    hm5.M(obj);
                    zdaVarArr2 = zdaVarArr12;
                    vk41VarArr2 = vk41VarArr9;
                    vk41VarArr = vk41VarArr10;
                    zdaVarArr = zdaVarArr11;
                    r7 = z4;
                    objU = obj;
                }
                zdaVarArr[0] = new qy9((Bitmap) objU, (byte) 0);
                sk41Var.getClass();
                vk41VarArr2[r7] = sk41.a(zdaVarArr2);
                zdaVarArr3 = new zda[1];
                ie90 ie90Var = f8c1Var.i;
                gw70 gw70Var2 = f8c1Var.c;
                Activity activity = f8c1Var.a;
                if (!ie90Var.a) {
                    gpr0VarY = who1.y(jon1.p(2132018022, activity), imageTitleSubtitleStory.s().o(), imageTitleSubtitleStory.s().p());
                    gpr0VarY2 = who1.y(jon1.p(2132018003, activity), imageTitleSubtitleStory.r().o(), imageTitleSubtitleStory.r().p());
                    String strQ = imageTitleSubtitleStory.q();
                    this.X = null;
                    this.b = vk41VarArr;
                    this.c = zdaVarArr3;
                    this.d = vk41VarArr;
                    this.e = sk41Var3;
                    this.f = zdaVarArr3;
                    this.Y = gpr0VarY;
                    this.g = gpr0VarY2;
                    this.i = true;
                    this.t = (byte) 3;
                    objU2 = who1.u(strQ, this, gw70Var2);
                    if (objU2 == d9nVar) {
                        return d9nVar;
                    }
                    zdaVarArr4 = zdaVarArr3;
                    z = true;
                    vk41VarArr3 = vk41VarArr;
                    fyyVar = new mrb1(gpr0VarY, gpr0VarY2, (Bitmap) objU2, (byte) 1);
                    r10 = z;
                    zdaVarArr5 = zdaVarArr4;
                    zdaVarArr3[0] = fyyVar;
                    sk41Var3.getClass();
                    vk41VarArr3[r10] = sk41.a(zdaVarArr5);
                    return p7h.M(vk41VarArr);
                }
                gpr0 gpr0VarY5 = who1.y(jon1.p(2132018022, activity), imageTitleSubtitleStory.s().o(), imageTitleSubtitleStory.s().p());
                gpr0VarY3 = who1.y(jon1.p(2132018003, activity), imageTitleSubtitleStory.r().o(), imageTitleSubtitleStory.r().p());
                String strQ2 = imageTitleSubtitleStory.q();
                this.X = null;
                this.b = vk41VarArr;
                this.c = zdaVarArr3;
                this.d = vk41VarArr;
                this.e = sk41Var3;
                this.f = zdaVarArr3;
                byy byyVar2 = byy.a;
                this.Y = byyVar2;
                this.g = gpr0VarY5;
                this.h = gpr0VarY3;
                this.i = true;
                this.t = (byte) 2;
                objU3 = who1.u(strQ2, this, gw70Var2);
                if (objU3 == d9nVar) {
                    return d9nVar;
                }
                gpr0Var = gpr0VarY5;
                byyVar = byyVar2;
                vk41VarArr3 = vk41VarArr;
                zdaVarArr5 = zdaVarArr3;
                gpr0 gpr0Var6 = gpr0VarY3;
                long jS2 = imageTitleSubtitleStory.o().s();
                byyVar.getClass();
                fyyVar = new fyy(gpr0Var, gpr0Var6, (Bitmap) objU3, jS2);
                r10 = z2;
                zdaVarArr3[0] = fyyVar;
                sk41Var3.getClass();
                vk41VarArr3[r10] = sk41.a(zdaVarArr5);
                return p7h.M(vk41VarArr);
            default:
                SingleEntityStory singleEntityStory = (SingleEntityStory) hVar;
                f8c1 f8c1Var2 = this.X;
                byte b3 = this.t;
                if (b3 != 0) {
                    if (b3 == 1) {
                        boolean z5 = this.i;
                        zda[] zdaVarArr13 = this.f;
                        sk41 sk41Var4 = this.e;
                        vk41[] vk41VarArr11 = (vk41[]) this.d;
                        zda[] zdaVarArr14 = this.c;
                        vk41VarArr5 = (vk41[]) this.b;
                        hm5.M(obj);
                        zdaVarArr7 = zdaVarArr14;
                        vk41VarArr4 = vk41VarArr11;
                        sk41Var2 = sk41Var4;
                        zdaVarArr6 = zdaVarArr13;
                        r9 = z5;
                        objU4 = obj;
                    } else {
                        if (b3 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        boolean z6 = this.i;
                        gpr0 gpr0Var7 = (gpr0) this.Y;
                        gpr0VarY4 = this.h;
                        gpr0 gpr0Var8 = this.g;
                        zdaVarArr8 = this.f;
                        sk41Var3 = this.e;
                        vk41VarArr6 = (vk41[]) this.d;
                        zdaVarArr9 = this.c;
                        vk41[] vk41VarArr12 = (vk41[]) this.b;
                        hm5.M(obj);
                        vk41VarArr5 = vk41VarArr12;
                        gpr0Var2 = gpr0Var7;
                        gpr0Var3 = gpr0Var8;
                        objU5 = obj;
                        r2 = z6;
                    }
                    zdaVarArr8[0] = new ty81(gpr0Var3, gpr0VarY4, gpr0Var2, (Bitmap) objU5, singleEntityStory.o().s(), f8c1Var2.i.a, !f8c1Var2.e);
                    sk41Var3.getClass();
                    vk41VarArr6[r2] = sk41.a(zdaVarArr9);
                    return p7h.M(vk41VarArr5);
                }
                hm5.M(obj);
                vk41[] vk41VarArr13 = new vk41[2];
                zda[] zdaVarArr15 = new zda[1];
                gw70 gw70Var3 = f8c1Var2.c;
                String strN2 = singleEntityStory.n();
                this.X = f8c1Var2;
                this.b = vk41VarArr13;
                this.c = zdaVarArr15;
                this.d = vk41VarArr13;
                this.e = sk41Var3;
                this.f = zdaVarArr15;
                this.i = false;
                this.t = (byte) 1;
                objU4 = who1.u(strN2, this, gw70Var3);
                if (objU4 == d9nVar) {
                    return d9nVar;
                }
                zdaVarArr6 = zdaVarArr15;
                zdaVarArr7 = zdaVarArr6;
                r9 = 0;
                vk41VarArr4 = vk41VarArr13;
                vk41VarArr5 = vk41VarArr4;
                sk41Var2 = sk41Var3;
                zdaVarArr6[0] = new qy9((Bitmap) objU4, (byte) 0);
                sk41Var2.getClass();
                vk41VarArr4[r9] = sk41.a(zdaVarArr7);
                zdaVarArr8 = new zda[1];
                String strO = singleEntityStory.s().o();
                String strP = singleEntityStory.s().p();
                Activity activity2 = f8c1Var2.a;
                gpr0 gpr0VarY6 = who1.y(jon1.p(2132018022, activity2), strO, strP);
                gpr0VarY4 = who1.y(jon1.p(2132018003, activity2), singleEntityStory.r().o(), singleEntityStory.r().p());
                gpr0 gpr0VarY7 = who1.y(jon1.p(2132018024, activity2), singleEntityStory.q().p().o(), singleEntityStory.q().p().p());
                gw70 gw70Var4 = f8c1Var2.c;
                String strO2 = singleEntityStory.q().o();
                this.X = f8c1Var2;
                this.b = vk41VarArr5;
                this.c = zdaVarArr8;
                this.d = vk41VarArr5;
                this.e = sk41Var3;
                this.f = zdaVarArr8;
                this.g = gpr0VarY6;
                this.h = gpr0VarY4;
                this.Y = gpr0VarY7;
                this.i = true;
                this.t = (byte) 2;
                objU5 = who1.u(strO2, this, gw70Var4);
                if (objU5 == d9nVar) {
                    return d9nVar;
                }
                gpr0Var2 = gpr0VarY7;
                gpr0Var3 = gpr0VarY6;
                zdaVarArr9 = zdaVarArr8;
                r2 = 1;
                vk41VarArr6 = vk41VarArr5;
                zdaVarArr8[0] = new ty81(gpr0Var3, gpr0VarY4, gpr0Var2, (Bitmap) objU5, singleEntityStory.o().s(), f8c1Var2.i.a, !f8c1Var2.e);
                sk41Var3.getClass();
                vk41VarArr6[r2] = sk41.a(zdaVarArr9);
                return p7h.M(vk41VarArr5);
        }
    }
}
