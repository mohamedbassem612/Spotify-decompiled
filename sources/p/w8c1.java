package p;

import android.app.Activity;
import android.graphics.Bitmap;
import com.spotify.fandomcollectibles.protos.EntityButtonStory;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class w8c1 extends a8d1 implements xu30 {
    public /* synthetic */ f8c1 X;
    public final /* synthetic */ EntityButtonStory Y;
    public Object[] a;
    public zda[] b;
    public Object c;
    public Object d;
    public Object e;
    public Object[] f;
    public sk41 g;
    public zda[] h;
    public boolean i;
    public byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8c1(EntityButtonStory entityButtonStory, lnm lnmVar) {
        super(3, lnmVar);
        this.Y = entityButtonStory;
    }

    @Override // p.xu30
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        w8c1 w8c1Var = new w8c1(this.Y, (lnm) obj3);
        w8c1Var.X = (f8c1) obj2;
        return w8c1Var.invokeSuspend(rih1.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v2 */
    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        vk41[] vk41VarArr;
        Object objU;
        sk41 sk41Var;
        zda[] zdaVarArr;
        zda[] zdaVarArr2;
        vk41[] vk41VarArr2;
        ?? r9;
        zda[] zdaVarArr3;
        gpr0 gpr0VarY;
        gpr0 gpr0VarY2;
        Object objU2;
        zda[] zdaVarArr4;
        vk41[] vk41VarArr3;
        gpr0 gpr0Var;
        f8c1 f8c1Var = this.X;
        byte b = this.t;
        sk41 sk41Var2 = sk41.a;
        ?? r6 = 1;
        EntityButtonStory entityButtonStory = this.Y;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            vk41VarArr = new vk41[2];
            zda[] zdaVarArr5 = new zda[1];
            gw70 gw70Var = f8c1Var.c;
            String strN = entityButtonStory.n();
            this.X = f8c1Var;
            this.a = vk41VarArr;
            this.b = zdaVarArr5;
            this.c = vk41VarArr;
            this.d = sk41Var2;
            this.e = zdaVarArr5;
            this.i = false;
            this.t = (byte) 1;
            objU = who1.u(strN, this, gw70Var);
            if (objU != d9nVar) {
                sk41Var = sk41Var2;
                zdaVarArr = zdaVarArr5;
                zdaVarArr2 = zdaVarArr;
                vk41VarArr2 = vk41VarArr;
                r9 = 0;
            }
            return d9nVar;
        }
        if (b == 1) {
            boolean z = this.i;
            zda[] zdaVarArr6 = (zda[]) this.e;
            sk41 sk41Var3 = (sk41) this.d;
            vk41[] vk41VarArr4 = (vk41[]) this.c;
            zda[] zdaVarArr7 = this.b;
            vk41[] vk41VarArr5 = (vk41[]) this.a;
            hm5.M(obj);
            vk41VarArr2 = vk41VarArr4;
            vk41VarArr = vk41VarArr5;
            zdaVarArr2 = zdaVarArr7;
            sk41Var = sk41Var3;
            zdaVarArr = zdaVarArr6;
            r9 = z;
            objU = obj;
        } else {
            if (b != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z2 = this.i;
            zdaVarArr3 = this.h;
            sk41Var2 = this.g;
            vk41VarArr3 = (vk41[]) this.f;
            gpr0 gpr0Var2 = (gpr0) this.e;
            gpr0VarY2 = (gpr0) this.d;
            gpr0VarY = (gpr0) this.c;
            zda[] zdaVarArr8 = this.b;
            vk41[] vk41VarArr6 = (vk41[]) this.a;
            hm5.M(obj);
            gpr0Var = gpr0Var2;
            zdaVarArr4 = zdaVarArr8;
            vk41VarArr = vk41VarArr6;
            objU2 = obj;
            r6 = z2;
        }
        zdaVarArr3[0] = new qdy(gpr0VarY, gpr0VarY2, gpr0Var, (Bitmap) objU2, dio1.k(entityButtonStory.p().p(), entityButtonStory.p().q(), entityButtonStory.p().n(), entityButtonStory.p().getUri(), f8c1Var), entityButtonStory.o().s(), dio1.m(f8c1Var));
        sk41Var2.getClass();
        vk41VarArr3[r6] = sk41.a(zdaVarArr4);
        return p7h.M(vk41VarArr);
        zdaVarArr[0] = new qy9((Bitmap) objU, (byte) 0);
        sk41Var.getClass();
        vk41VarArr2[r9] = sk41.a(zdaVarArr2);
        zdaVarArr3 = new zda[1];
        String strO = entityButtonStory.u().o();
        String strP = entityButtonStory.u().p();
        Activity activity = f8c1Var.a;
        gpr0VarY = who1.y(jon1.p(2132018024, activity), strO, strP);
        gpr0VarY2 = who1.y(jon1.p(2132018024, activity), entityButtonStory.t().o(), entityButtonStory.t().p());
        gpr0 gpr0VarY3 = who1.y(jon1.p(2132018003, activity), entityButtonStory.r().o(), entityButtonStory.r().p());
        gw70 gw70Var2 = f8c1Var.c;
        String strS = entityButtonStory.s();
        this.X = f8c1Var;
        this.a = vk41VarArr;
        this.b = zdaVarArr3;
        this.c = gpr0VarY;
        this.d = gpr0VarY2;
        this.e = gpr0VarY3;
        this.f = vk41VarArr;
        this.g = sk41Var2;
        this.h = zdaVarArr3;
        this.i = true;
        this.t = (byte) 2;
        objU2 = who1.u(strS, this, gw70Var2);
        if (objU2 != d9nVar) {
            zdaVarArr4 = zdaVarArr3;
            vk41VarArr3 = vk41VarArr;
            gpr0Var = gpr0VarY3;
            zdaVarArr3[0] = new qdy(gpr0VarY, gpr0VarY2, gpr0Var, (Bitmap) objU2, dio1.k(entityButtonStory.p().p(), entityButtonStory.p().q(), entityButtonStory.p().n(), entityButtonStory.p().getUri(), f8c1Var), entityButtonStory.o().s(), dio1.m(f8c1Var));
            sk41Var2.getClass();
            vk41VarArr3[r6] = sk41.a(zdaVarArr4);
            return p7h.M(vk41VarArr);
        }
        return d9nVar;
    }
}
