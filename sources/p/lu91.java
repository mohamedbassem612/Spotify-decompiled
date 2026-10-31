package p;

import android.graphics.Bitmap;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lu91 extends a8d1 implements vu30 {
    public final /* synthetic */ dw91 X;
    public final /* synthetic */ dw91 Y;
    public final /* synthetic */ iu30 Z;
    public Object a;
    public Object b;
    public String c;
    public Object d;
    public iu30 e;
    public Bitmap f;
    public byte g;
    public /* synthetic */ Object h;
    public final /* synthetic */ gw70 i;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu91(gw70 gw70Var, String str, dw91 dw91Var, dw91 dw91Var2, iu30 iu30Var, lnm lnmVar) {
        super(2, lnmVar);
        this.i = gw70Var;
        this.t = str;
        this.X = dw91Var;
        this.Y = dw91Var2;
        this.Z = iu30Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        lu91 lu91Var = new lu91(this.i, this.t, this.X, this.Y, this.Z, lnmVar);
        lu91Var.h = obj;
        return lu91Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        Bitmap m231Var;
        Bitmap bitmap;
        iu30 iu30Var;
        dw91 dw91Var;
        dw91 dw91Var2;
        byte b = this.g;
        String str = this.t;
        d9n d9nVar = d9n.a;
        try {
            if (b == 0) {
                hm5.M(obj);
                gw70 gw70Var = this.i;
                this.h = null;
                this.a = gw70Var;
                this.b = str;
                this.c = null;
                this.d = this;
                this.g = (byte) 1;
                ohd ohdVar = new ohd(1, aym.t(this));
                ohdVar.t();
                ixg ixgVarF = gw70Var.f(str);
                ixgVarF.p(100, 100, 1);
                ixgVarF.g = false;
                ohdVar.n(new vlb(ixgVarF.i().subscribe(new kar(ohdVar, (byte) 3), new kar(ohdVar, (byte) 4)), (byte) 3));
                obj = ohdVar.r();
                if (obj == d9nVar) {
                }
                return d9nVar;
            }
            if (b == 1) {
                c9n c9nVar = this.c;
                hm5.M(obj);
            } else {
                if (b != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bitmap = this.f;
                iu30 iu30Var2 = this.e;
                dw91Var2 = (dw91) this.d;
                String str2 = this.c;
                dw91Var = (dw91) this.b;
                hm5.M(obj);
                iu30Var = iu30Var2;
                str = str2;
            }
            int iIntValue = ((Number) obj).intValue();
            bitmap.getClass();
            dw91Var.put(str, new yk4(bitmap));
            dw91Var2.put(str, new Integer(iIntValue));
            iu30Var.invoke(new kcn(str, iIntValue));
            return rih1.a;
            m231Var = (Bitmap) obj;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null && (thA instanceof CancellationException)) {
            throw thA;
        }
        if (!(m231Var instanceof m231)) {
            bitmap = m231Var;
            fns fnsVar = igu.a;
            kdo kdoVar = new kdo(bitmap, (lnm) null, (byte) 1);
            this.h = null;
            this.a = m231Var;
            dw91 dw91Var3 = this.X;
            this.b = dw91Var3;
            this.c = str;
            dw91 dw91Var4 = this.Y;
            this.d = dw91Var4;
            iu30Var = this.Z;
            this.e = iu30Var;
            this.f = bitmap;
            this.g = (byte) 2;
            Object objY = fn31.Y(fnsVar, kdoVar, this);
            if (objY != d9nVar) {
                obj = objY;
                dw91Var = dw91Var3;
                dw91Var2 = dw91Var4;
                int iIntValue2 = ((Number) obj).intValue();
                bitmap.getClass();
                dw91Var.put(str, new yk4(bitmap));
                dw91Var2.put(str, new Integer(iIntValue2));
                iu30Var.invoke(new kcn(str, iIntValue2));
            }
            return d9nVar;
        }
        return rih1.a;
    }
}
