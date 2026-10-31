package p;

import android.graphics.Bitmap;
import com.spotify.culturalmoments.stories.v1.ImageOnImageStory;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s8c1 extends a8d1 implements xu30 {
    public Object[] a;
    public zda[] b;
    public Object[] c;
    public sk41 d;
    public zda[] e;
    public boolean f;
    public byte g;
    public /* synthetic */ g8c1 h;
    public final /* synthetic */ ImageOnImageStory i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8c1(ImageOnImageStory imageOnImageStory, lnm lnmVar) {
        super(3, lnmVar);
        this.i = imageOnImageStory;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        s8c1 s8c1Var = new s8c1(this.i, (lnm) obj3);
        s8c1Var.h = (g8c1) obj2;
        return s8c1Var.invokeSuspend(rih1.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v6 */
    public final Object invokeSuspend(Object obj) {
        vk41[] vk41VarArr;
        Object objG;
        sk41 sk41Var;
        zda[] zdaVarArr;
        zda[] zdaVarArr2;
        vk41[] vk41VarArr2;
        ?? r9;
        zda[] zdaVarArr3;
        Object objG2;
        zda[] zdaVarArr4;
        vk41[] vk41VarArr3;
        g8c1 g8c1Var = this.h;
        byte b = this.g;
        sk41 sk41Var2 = sk41.a;
        ImageOnImageStory imageOnImageStory = this.i;
        ?? r7 = 1;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            vk41VarArr = new vk41[2];
            zda[] zdaVarArr5 = new zda[1];
            gw70 gw70Var = g8c1Var.c;
            String strN = imageOnImageStory.n();
            this.h = g8c1Var;
            this.a = vk41VarArr;
            this.b = zdaVarArr5;
            this.c = vk41VarArr;
            this.d = sk41Var2;
            this.e = zdaVarArr5;
            this.f = false;
            this.g = (byte) 1;
            objG = zho1.G(strN, this, gw70Var);
            if (objG != d9nVar) {
                sk41Var = sk41Var2;
                zdaVarArr = zdaVarArr5;
                zdaVarArr2 = zdaVarArr;
                vk41VarArr2 = vk41VarArr;
                r9 = 0;
            }
            return d9nVar;
        }
        if (b == 1) {
            boolean z = this.f;
            zda[] zdaVarArr6 = this.e;
            sk41 sk41Var3 = this.d;
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
            objG = obj;
        } else {
            if (b != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z2 = this.f;
            zdaVarArr3 = this.e;
            sk41Var2 = this.d;
            vk41VarArr3 = (vk41[]) this.c;
            zdaVarArr4 = this.b;
            vk41[] vk41VarArr6 = (vk41[]) this.a;
            hm5.M(obj);
            vk41VarArr = vk41VarArr6;
            objG2 = obj;
            r7 = z2;
        }
        zdaVarArr3[0] = new qt70((Bitmap) objG2, g8c1Var.g.a, imageOnImageStory.o().q());
        sk41Var2.getClass();
        vk41VarArr3[r7] = sk41.a(zdaVarArr4);
        return p7h.M(vk41VarArr);
        zdaVarArr[0] = new qy9((Bitmap) objG, (byte) 1);
        sk41Var.getClass();
        vk41VarArr2[r9] = sk41.a(zdaVarArr2);
        zdaVarArr3 = new zda[1];
        gw70 gw70Var2 = g8c1Var.c;
        String strQ = imageOnImageStory.q();
        this.h = g8c1Var;
        this.a = vk41VarArr;
        this.b = zdaVarArr3;
        this.c = vk41VarArr;
        this.d = sk41Var2;
        this.e = zdaVarArr3;
        this.f = true;
        this.g = (byte) 2;
        objG2 = zho1.G(strQ, this, gw70Var2);
        if (objG2 != d9nVar) {
            zdaVarArr4 = zdaVarArr3;
            vk41VarArr3 = vk41VarArr;
            zdaVarArr3[0] = new qt70((Bitmap) objG2, g8c1Var.g.a, imageOnImageStory.o().q());
            sk41Var2.getClass();
            vk41VarArr3[r7] = sk41.a(zdaVarArr4);
            return p7h.M(vk41VarArr);
        }
        return d9nVar;
    }
}
