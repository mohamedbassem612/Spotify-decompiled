package p;

import android.view.View;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lyb0 extends a8d1 implements iu30 {
    public vpu0 a;
    public Object b;
    public myb0 c;
    public int d;
    public byte e;
    public final /* synthetic */ myb0 f;
    public final /* synthetic */ vpu0 g;
    public final /* synthetic */ x4i1 h;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lyb0(myb0 myb0Var, vpu0 vpu0Var, x4i1 x4i1Var, String str, lnm lnmVar) {
        super(1, lnmVar);
        this.f = myb0Var;
        this.g = vpu0Var;
        this.h = x4i1Var;
        this.i = str;
    }

    public final lnm create(lnm lnmVar) {
        return new lyb0(this.f, this.g, this.h, this.i, lnmVar);
    }

    public final Object invoke(Object obj) {
        return create((lnm) obj).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a6 A[Catch: all -> 0x001b, CancellationException -> 0x00bd, TryCatch #2 {CancellationException -> 0x00bd, all -> 0x001b, blocks: (B:7:0x0017, B:25:0x0074, B:27:0x00a6, B:28:0x00ac, B:14:0x002f, B:21:0x005a, B:17:0x0040), top: B:38:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
    public final Object invokeSuspend(Object obj) {
        Boolean m231Var;
        vpu0 vpu0Var;
        int i;
        myb0 myb0Var;
        String str;
        vpu0 vpu0Var2;
        myb0 myb0Var2;
        lzn0 lzn0Var;
        byte b = this.e;
        d9n d9nVar = d9n.a;
        try {
            if (b == 0) {
                hm5.M(obj);
                myb0 myb0Var3 = this.f;
                vpu0Var = this.g;
                x4i1 x4i1Var = this.h;
                String str2 = this.i;
                n0a0 n0a0Var = new n0a0(myb0Var3, x4i1Var, str2, (lnm) null, (byte) 4);
                this.a = vpu0Var;
                this.b = str2;
                this.c = myb0Var3;
                i = 0;
                this.d = 0;
                this.e = (byte) 1;
                if (rc2.M(3500L, n0a0Var, this) != d9nVar) {
                    myb0Var = myb0Var3;
                    str = str2;
                }
                return d9nVar;
            }
            if (b == 1) {
                int i2 = this.d;
                myb0Var = this.c;
                str = (String) this.b;
                vpu0 vpu0Var3 = this.a;
                hm5.M(obj);
                i = i2;
                vpu0Var = vpu0Var3;
            } else {
                if (b != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                myb0Var2 = (myb0) this.b;
                vpu0Var2 = this.a;
                hm5.M(obj);
            }
            myb0Var2.e.k(new er91((fs91) null, myb0Var2.a.getString(2131960123, vpu0Var2.b.b), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
            lzn0Var = myb0Var2.b;
            if (vpu0Var2.b.e == wls0.c) {
                lzn0Var.e();
                lzn0Var.e();
            }
            m231Var = Boolean.TRUE;
            if (m231Var instanceof m231) {
                return null;
            }
            return m231Var;
            ss90 ss90Var = new ss90(myb0Var, str, (lnm) null, (byte) 11);
            this.a = vpu0Var;
            this.b = myb0Var;
            this.c = null;
            this.d = i;
            this.e = (byte) 2;
            if (rc2.M(3500L, ss90Var, this) != d9nVar) {
                vpu0Var2 = vpu0Var;
                myb0Var2 = myb0Var;
                myb0Var2.e.k(new er91((fs91) null, myb0Var2.a.getString(2131960123, vpu0Var2.b.b), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                lzn0Var = myb0Var2.b;
                if (vpu0Var2.b.e == wls0.c) {
                    lzn0Var.e();
                    lzn0Var.e();
                }
                m231Var = Boolean.TRUE;
                if (m231Var instanceof m231) {
                    return null;
                }
                return m231Var;
            }
            return d9nVar;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
    }
}
