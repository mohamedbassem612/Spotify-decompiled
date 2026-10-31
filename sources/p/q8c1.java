package p;

import android.app.Activity;
import android.graphics.Bitmap;
import com.google.protobuf.h;
import com.spotify.fandomcollectibles.protos.BoxRevealStory;
import com.spotify.fandomcollectibles.protos.GlobeStory;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class q8c1 extends a8d1 implements xu30 {
    public Object X;
    public final /* synthetic */ h Y;
    public final /* synthetic */ byte a;
    public Object[] b;
    public zda[] c;
    public Object[] d;
    public sk41 e;
    public zda[] f;
    public boolean g;
    public byte h;
    public /* synthetic */ f8c1 i;
    public Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q8c1(h hVar, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.Y = hVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        h hVar = this.Y;
        f8c1 f8c1Var = (f8c1) obj2;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                q8c1 q8c1Var = new q8c1((BoxRevealStory) hVar, lnmVar, (byte) 0);
                q8c1Var.i = f8c1Var;
                return q8c1Var.invokeSuspend(rih1Var);
            default:
                q8c1 q8c1Var2 = new q8c1((GlobeStory) hVar, lnmVar, (byte) 1);
                q8c1Var2.i = f8c1Var;
                return q8c1Var2.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    public final Object invokeSuspend(Object obj) {
        vk41[] vk41VarArr;
        Object objU;
        zda[] zdaVarArr;
        zda[] zdaVarArr2;
        sk41 sk41Var;
        ?? r8;
        vk41[] vk41VarArr2;
        gpr0 gpr0VarY;
        Object objU2;
        gpr0 gpr0Var;
        zda[] zdaVarArr3;
        zda[] zdaVarArr4;
        vk41[] vk41VarArr3;
        gpr0 gpr0VarY2;
        Object objU3;
        gpr0 gpr0Var2;
        zda f2cVar;
        ?? r7;
        Object objU4;
        zda[] zdaVarArr5;
        zda[] zdaVarArr6;
        ?? r10;
        vk41[] vk41VarArr4;
        vk41[] vk41VarArr5;
        sk41 sk41Var2;
        Object objU5;
        gpr0 gpr0Var3;
        gpr0 gpr0Var4;
        zda[] zdaVarArr7;
        zda[] zdaVarArr8;
        vk41[] vk41VarArr6;
        byte b = this.a;
        d9n d9nVar = d9n.a;
        h hVar = this.Y;
        boolean z = true;
        ?? r9 = 1;
        boolean z2 = true;
        sk41 sk41Var3 = sk41.a;
        switch (b) {
            case 0:
                BoxRevealStory boxRevealStory = (BoxRevealStory) hVar;
                f8c1 f8c1Var = this.i;
                byte b2 = this.h;
                if (b2 == 0) {
                    hm5.M(obj);
                    vk41VarArr = new vk41[2];
                    zda[] zdaVarArr9 = new zda[1];
                    gw70 gw70Var = f8c1Var.c;
                    String strN = boxRevealStory.n();
                    this.i = f8c1Var;
                    this.b = vk41VarArr;
                    this.c = zdaVarArr9;
                    this.d = vk41VarArr;
                    this.e = sk41Var3;
                    this.f = zdaVarArr9;
                    this.g = false;
                    this.h = (byte) 1;
                    objU = who1.u(strN, this, gw70Var);
                    if (objU == d9nVar) {
                        return d9nVar;
                    }
                    zdaVarArr = zdaVarArr9;
                    zdaVarArr2 = zdaVarArr;
                    sk41Var = sk41Var3;
                    r8 = 0;
                    vk41VarArr2 = vk41VarArr;
                } else {
                    if (b2 != 1) {
                        if (b2 == 2) {
                            boolean z3 = this.g;
                            gpr0VarY2 = (gpr0) this.X;
                            gpr0 gpr0Var5 = (gpr0) this.t;
                            zdaVarArr3 = this.f;
                            sk41Var3 = this.e;
                            vk41VarArr3 = (vk41[]) this.d;
                            zdaVarArr4 = this.c;
                            vk41[] vk41VarArr7 = (vk41[]) this.b;
                            hm5.M(obj);
                            vk41VarArr = vk41VarArr7;
                            gpr0Var2 = gpr0Var5;
                            objU3 = obj;
                            z2 = z3;
                            f2cVar = new f2c(gpr0Var2, gpr0VarY2, (Bitmap) objU3, boxRevealStory.o().s());
                            r7 = z2;
                            zdaVarArr3[0] = f2cVar;
                            sk41Var3.getClass();
                            vk41VarArr3[r7] = sk41.a(zdaVarArr4);
                            return p7h.M(vk41VarArr);
                        }
                        if (b2 != 3) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        boolean z4 = this.g;
                        gpr0VarY = (gpr0) this.X;
                        gpr0Var = (gpr0) this.t;
                        zdaVarArr3 = this.f;
                        sk41Var3 = this.e;
                        vk41VarArr3 = (vk41[]) this.d;
                        zdaVarArr4 = this.c;
                        vk41[] vk41VarArr8 = (vk41[]) this.b;
                        hm5.M(obj);
                        vk41VarArr = vk41VarArr8;
                        objU2 = obj;
                        z = z4;
                        f2cVar = new mrb1(gpr0Var, gpr0VarY, (Bitmap) objU2, (byte) 0);
                        r7 = z;
                        zdaVarArr3[0] = f2cVar;
                        sk41Var3.getClass();
                        vk41VarArr3[r7] = sk41.a(zdaVarArr4);
                        return p7h.M(vk41VarArr);
                    }
                    boolean z5 = this.g;
                    zda[] zdaVarArr10 = this.f;
                    sk41Var = this.e;
                    vk41[] vk41VarArr9 = (vk41[]) this.d;
                    zda[] zdaVarArr11 = this.c;
                    vk41[] vk41VarArr10 = (vk41[]) this.b;
                    hm5.M(obj);
                    zdaVarArr2 = zdaVarArr11;
                    vk41VarArr2 = vk41VarArr9;
                    vk41VarArr = vk41VarArr10;
                    zdaVarArr = zdaVarArr10;
                    r8 = z5;
                    objU = obj;
                }
                zdaVarArr[0] = new qy9((Bitmap) objU, (byte) 0);
                sk41Var.getClass();
                vk41VarArr2[r8] = sk41.a(zdaVarArr2);
                zda[] zdaVarArr12 = new zda[1];
                ie90 ie90Var = f8c1Var.i;
                gw70 gw70Var2 = f8c1Var.c;
                Activity activity = f8c1Var.a;
                if (!ie90Var.a) {
                    gpr0 gpr0VarY3 = who1.y(jon1.p(2132018022, activity), boxRevealStory.s().o(), boxRevealStory.s().p());
                    gpr0VarY = who1.y(jon1.p(2132018003, activity), boxRevealStory.r().o(), boxRevealStory.r().p());
                    String strQ = boxRevealStory.q();
                    this.i = null;
                    this.b = vk41VarArr;
                    this.c = zdaVarArr12;
                    this.d = vk41VarArr;
                    this.e = sk41Var3;
                    this.f = zdaVarArr12;
                    this.t = gpr0VarY3;
                    this.X = gpr0VarY;
                    this.g = true;
                    this.h = (byte) 3;
                    objU2 = who1.u(strQ, this, gw70Var2);
                    if (objU2 == d9nVar) {
                        return d9nVar;
                    }
                    gpr0Var = gpr0VarY3;
                    zdaVarArr3 = zdaVarArr12;
                    zdaVarArr4 = zdaVarArr3;
                    vk41VarArr3 = vk41VarArr;
                    f2cVar = new mrb1(gpr0Var, gpr0VarY, (Bitmap) objU2, (byte) 0);
                    r7 = z;
                    zdaVarArr3[0] = f2cVar;
                    sk41Var3.getClass();
                    vk41VarArr3[r7] = sk41.a(zdaVarArr4);
                    return p7h.M(vk41VarArr);
                }
                gpr0 gpr0VarY4 = who1.y(jon1.p(2132018022, activity), boxRevealStory.s().o(), boxRevealStory.s().p());
                gpr0VarY2 = who1.y(jon1.p(2132018003, activity), boxRevealStory.r().o(), boxRevealStory.r().p());
                String strQ2 = boxRevealStory.q();
                this.i = null;
                this.b = vk41VarArr;
                this.c = zdaVarArr12;
                this.d = vk41VarArr;
                this.e = sk41Var3;
                this.f = zdaVarArr12;
                this.t = gpr0VarY4;
                this.X = gpr0VarY2;
                this.g = true;
                this.h = (byte) 2;
                objU3 = who1.u(strQ2, this, gw70Var2);
                if (objU3 == d9nVar) {
                    return d9nVar;
                }
                gpr0Var2 = gpr0VarY4;
                zdaVarArr3 = zdaVarArr12;
                zdaVarArr4 = zdaVarArr3;
                vk41VarArr3 = vk41VarArr;
                f2cVar = new f2c(gpr0Var2, gpr0VarY2, (Bitmap) objU3, boxRevealStory.o().s());
                r7 = z2;
                zdaVarArr3[0] = f2cVar;
                sk41Var3.getClass();
                vk41VarArr3[r7] = sk41.a(zdaVarArr4);
                return p7h.M(vk41VarArr);
            default:
                GlobeStory globeStory = (GlobeStory) hVar;
                f8c1 f8c1Var2 = this.i;
                byte b3 = this.h;
                if (b3 != 0) {
                    if (b3 == 1) {
                        boolean z6 = this.g;
                        zda[] zdaVarArr13 = (zda[]) this.d;
                        sk41 sk41Var4 = (sk41) this.X;
                        vk41[] vk41VarArr11 = (vk41[]) this.t;
                        zda[] zdaVarArr14 = this.c;
                        vk41VarArr5 = (vk41[]) this.b;
                        hm5.M(obj);
                        zdaVarArr6 = zdaVarArr14;
                        vk41VarArr4 = vk41VarArr11;
                        sk41Var2 = sk41Var4;
                        zdaVarArr5 = zdaVarArr13;
                        r10 = z6;
                        objU4 = obj;
                    } else {
                        if (b3 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        boolean z7 = this.g;
                        zdaVarArr7 = this.f;
                        sk41Var3 = this.e;
                        vk41VarArr6 = (vk41[]) this.d;
                        gpr0 gpr0Var6 = (gpr0) this.X;
                        gpr0 gpr0Var7 = (gpr0) this.t;
                        zdaVarArr8 = this.c;
                        vk41[] vk41VarArr12 = (vk41[]) this.b;
                        hm5.M(obj);
                        vk41VarArr5 = vk41VarArr12;
                        gpr0Var3 = gpr0Var6;
                        gpr0Var4 = gpr0Var7;
                        objU5 = obj;
                        r9 = z7;
                    }
                    zdaVarArr7[0] = new oly(gpr0Var4, gpr0Var3, (Bitmap) objU5, globeStory.q(), f8c1Var2.i.a, globeStory.o().s());
                    sk41Var3.getClass();
                    vk41VarArr6[r9] = sk41.a(zdaVarArr8);
                    return p7h.M(vk41VarArr5);
                }
                hm5.M(obj);
                vk41[] vk41VarArr13 = new vk41[2];
                zda[] zdaVarArr15 = new zda[1];
                gw70 gw70Var3 = f8c1Var2.c;
                String strN2 = globeStory.n();
                this.i = f8c1Var2;
                this.b = vk41VarArr13;
                this.c = zdaVarArr15;
                this.t = vk41VarArr13;
                this.X = sk41Var3;
                this.d = zdaVarArr15;
                this.g = false;
                this.h = (byte) 1;
                objU4 = who1.u(strN2, this, gw70Var3);
                if (objU4 == d9nVar) {
                    return d9nVar;
                }
                zdaVarArr5 = zdaVarArr15;
                zdaVarArr6 = zdaVarArr5;
                r10 = 0;
                vk41VarArr4 = vk41VarArr13;
                vk41VarArr5 = vk41VarArr4;
                sk41Var2 = sk41Var3;
                zdaVarArr5[0] = new qy9((Bitmap) objU4, (byte) 0);
                sk41Var2.getClass();
                vk41VarArr4[r10] = sk41.a(zdaVarArr6);
                zda[] zdaVarArr16 = new zda[1];
                gpr0 gpr0VarY5 = who1.y(jon1.p(2132018022, f8c1Var2.a), globeStory.t().o(), globeStory.t().p());
                gpr0 gpr0VarY6 = who1.y(jon1.p(2132018003, f8c1Var2.a), globeStory.s().o(), globeStory.s().p());
                gw70 gw70Var4 = f8c1Var2.c;
                String strR = globeStory.r();
                this.i = f8c1Var2;
                this.b = vk41VarArr5;
                this.c = zdaVarArr16;
                this.t = gpr0VarY5;
                this.X = gpr0VarY6;
                this.d = vk41VarArr5;
                this.e = sk41Var3;
                this.f = zdaVarArr16;
                this.g = true;
                this.h = (byte) 2;
                objU5 = who1.u(strR, this, gw70Var4);
                if (objU5 == d9nVar) {
                    return d9nVar;
                }
                gpr0Var3 = gpr0VarY6;
                gpr0Var4 = gpr0VarY5;
                zdaVarArr7 = zdaVarArr16;
                zdaVarArr8 = zdaVarArr7;
                vk41VarArr6 = vk41VarArr5;
                zdaVarArr7[0] = new oly(gpr0Var4, gpr0Var3, (Bitmap) objU5, globeStory.q(), f8c1Var2.i.a, globeStory.o().s());
                sk41Var3.getClass();
                vk41VarArr6[r9] = sk41.a(zdaVarArr8);
                return p7h.M(vk41VarArr5);
        }
    }
}
