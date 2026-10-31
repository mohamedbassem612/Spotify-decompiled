package p;

import com.spotify.browse.clientnative.mobius.BrowseEffect;
import com.spotify.browse.clientnative.mobius.BrowseEvent;
import com.spotify.browse.clientnative.mobius.Model;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class a1e0 extends a8d1 implements vu30 {
    public s2t a;
    public eww0 b;
    public boolean c;
    public byte d;
    public /* synthetic */ Object e;
    public final /* synthetic */ b1e0 f;
    public final /* synthetic */ BrowseEffect.Load g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1e0(b1e0 b1e0Var, BrowseEffect.Load load, lnm lnmVar) {
        super(2, lnmVar);
        this.f = b1e0Var;
        this.g = load;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        a1e0 a1e0Var = new a1e0(this.f, this.g, lnmVar);
        a1e0Var.e = obj;
        return a1e0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0087  */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        s2t s2tVar;
        eww0 eww0Var;
        Object objE;
        eww0 eww0Var2;
        c9n c9nVar = (c9n) this.e;
        byte b = this.d;
        BrowseEffect.Load load = this.g;
        b1e0 b1e0Var = this.f;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            Observable observableA = b1e0Var.c.a(true);
            this.e = c9nVar;
            this.d = (byte) 1;
            obj = fc11.l(observableA, 1, (Object) null, this);
            if (obj != d9nVar) {
            }
            return d9nVar;
        }
        if (b == 1) {
            hm5.M(obj);
        } else {
            if (b == 2) {
                z = this.c;
                s2tVar = this.a;
                hm5.M(obj);
                eww0Var = (eww0) obj;
                this.e = null;
                this.a = null;
                this.b = eww0Var;
                this.c = z;
                this.d = (byte) 3;
                objE = s2tVar.E(this);
                if (objE != d9nVar) {
                    obj = objE;
                    eww0Var2 = eww0Var;
                }
                return d9nVar;
            }
            if (b != 3) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = this.c;
            eww0Var2 = this.b;
            hm5.M(obj);
        }
        return new BrowseEvent.StructureLoaded(eww0Var2, (Model) obj, load.getLoadingStrategy(), z);
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        s2t s2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new p6d0(b1e0Var, (lnm) null, (byte) 5), 3);
        s2t s2tVarQ2 = fn31.q(c9nVar, (o8n) null, 0, new z0e0(b1e0Var, load, zBooleanValue, null), 3);
        this.e = null;
        this.a = s2tVarQ2;
        this.c = zBooleanValue;
        this.d = (byte) 2;
        Object objQ = s2tVarQ.Q(this);
        if (objQ != d9nVar) {
            z = zBooleanValue;
            obj = objQ;
            s2tVar = s2tVarQ2;
            eww0Var = (eww0) obj;
            this.e = null;
            this.a = null;
            this.b = eww0Var;
            this.c = z;
            this.d = (byte) 3;
            objE = s2tVar.E(this);
            if (objE != d9nVar) {
                obj = objE;
                eww0Var2 = eww0Var;
                return new BrowseEvent.StructureLoaded(eww0Var2, (Model) obj, load.getLoadingStrategy(), z);
            }
        }
        return d9nVar;
    }
}
