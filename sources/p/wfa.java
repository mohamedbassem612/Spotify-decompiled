package p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wfa extends z031 implements vu30 {
    public Iterator b;
    public mmr0 c;
    public int d;
    public byte e;
    public /* synthetic */ Object f;
    public final /* synthetic */ fp20 g;
    public final /* synthetic */ yfa h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wfa(fp20 fp20Var, yfa yfaVar, int i, int i2, lnm lnmVar) {
        super(2, lnmVar);
        this.g = fp20Var;
        this.h = yfaVar;
        this.i = i;
        this.t = i2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        wfa wfaVar = new wfa(this.g, this.h, this.i, this.t, lnmVar);
        wfaVar.f = obj;
        return wfaVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((r561) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        ArrayList arrayListJ;
        Iterator ep20Var;
        int i;
        r561 r561Var = (r561) this.f;
        byte b = this.e;
        if (b != 0) {
            if (b == 1) {
                i = this.d;
                mmr0 mmr0Var = this.c;
                ep20Var = this.b;
                hm5.M(obj);
                arrayListJ = p7h.O(new mmr0[]{mmr0Var});
            } else {
                if (b != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            return rih1.a;
        }
        arrayListJ = hrt.j(obj);
        ep20Var = new ep20(this.g);
        i = 0;
        while (true) {
            boolean zHasNext = ep20Var.hasNext();
            d9n d9nVar = d9n.a;
            if (!zHasNext) {
                if (arrayListJ.isEmpty()) {
                    break;
                }
                this.f = null;
                this.b = null;
                this.c = null;
                this.e = (byte) 2;
                r561Var.b(arrayListJ, this);
                return d9nVar;
            }
            mmr0 mmr0Var2 = (mmr0) ep20Var.next();
            n700 n700Var = (n700) mmr0Var2.b;
            int size = n700Var.c.size() + n700Var.b.length() + 12;
            int size2 = 0;
            for (mmr0 mmr0Var3 : n700Var.e) {
                size2 += ((phc) mmr0Var3.b).size() + ((String) mmr0Var3.a).length();
            }
            int i2 = size + size2;
            int i3 = this.i;
            if (i2 > i3) {
                ((rc00) this.h.g).d(oc00.MESSAGE_EXCEEDS_BATCH_BYTES);
            } else {
                i += i2;
                if (i > i3 || arrayListJ.size() >= this.t) {
                    this.f = r561Var;
                    this.b = ep20Var;
                    this.c = mmr0Var2;
                    this.d = i2;
                    this.e = (byte) 1;
                    r561Var.b(arrayListJ, this);
                    return d9nVar;
                }
                arrayListJ.add(mmr0Var2);
            }
        }
        return rih1.a;
    }
}
