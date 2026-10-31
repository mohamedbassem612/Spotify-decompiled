package p;

import com.spotify.serviceapi.android.quasarworker.QuasarWorker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m0z0 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ QuasarWorker c;
    public final /* synthetic */ l811 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0z0(QuasarWorker quasarWorker, l811 l811Var, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = quasarWorker;
        this.d = l811Var;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        l811 l811Var = this.d;
        QuasarWorker quasarWorker = this.c;
        switch (b) {
            case 0:
                return new m0z0(quasarWorker, l811Var, lnmVar, (byte) 0);
            default:
                return new m0z0(quasarWorker, l811Var, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                QuasarWorker quasarWorker = this.c;
                q8n q8nVar = quasarWorker.j;
                l4f0 l4f0Var = new l4f0(quasarWorker, this.d, (lnm) null, (byte) 24);
                this.b = true;
                Object objY = fn31.Y(q8nVar, l4f0Var, this);
                return objY == d9nVar ? d9nVar : objY;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    QuasarWorker quasarWorker2 = this.c;
                    q8n q8nVar2 = quasarWorker2.j;
                    pew0 pew0Var = new pew0(this.d, quasarWorker2, false, (lnm) null, (byte) 21);
                    this.b = true;
                    if (fn31.Y(q8nVar2, pew0Var, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
        }
    }
}
