package com.spotify.widgets.npvwidget;

import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import p.a8d1;
import p.beh;
import p.c9n;
import p.d9n;
import p.eg;
import p.fc11;
import p.feh;
import p.fn31;
import p.hm5;
import p.k96;
import p.l2t;
import p.lnm;
import p.rih1;
import p.tv80;
import p.u890;
import p.vu30;
import p.x610;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class d extends a8d1 implements vu30 {
    public l2t a;
    public byte b;
    public /* synthetic */ Object c;
    public final /* synthetic */ k d;
    public final /* synthetic */ tv80 e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(k kVar, tv80 tv80Var, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.d = kVar;
        this.e = tv80Var;
        this.f = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        d dVar = new d(this.d, this.e, this.f, lnmVar);
        dVar.c = obj;
        return dVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0086  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a7 A[RETURN] */
    public final Object invokeSuspend(Object obj) {
        l2t l2tVar;
        beh behVar;
        Object objE;
        c9n c9nVar = (c9n) this.c;
        byte b = this.b;
        k kVar = this.d;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            l2t l2tVarQ = fn31.q(c9nVar, kVar.j, 0, new k96(kVar, (lnm) null, (byte) 28), 2);
            Flowable flowableA = kVar.a.a("npvwidget");
            this.c = null;
            this.a = l2tVarQ;
            this.b = (byte) 1;
            Object objM = u890.m(flowableA, 1, this);
            if (objM != d9nVar) {
                l2tVar = l2tVarQ;
                obj = objM;
            }
            return d9nVar;
        }
        if (b == 1) {
            l2tVar = this.a;
            hm5.M(obj);
        } else {
            if (b != 2) {
                if (b == 3) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l2tVar = this.a;
            hm5.M(obj);
        }
        behVar = (feh) obj;
        if (behVar instanceof beh) {
            String str = behVar.a;
            Logger.d("'Play' command failed: %s", new Object[]{str});
            kVar.g.c(2, this.f, str);
        }
        this.c = null;
        this.a = null;
        this.b = (byte) 3;
        objE = l2tVar.E(this);
        if (objE != d9nVar) {
            return d9nVar;
        }
        return objE;
        Single singleH = ((x610) obj).c().h(LoggingParams.builder().interactionId(this.e.a.a).build());
        this.c = null;
        this.a = l2tVar;
        this.b = (byte) 2;
        obj = fc11.j(singleH, this);
        if (obj != d9nVar) {
            behVar = (feh) obj;
            if (behVar instanceof beh) {
                String str2 = behVar.a;
                Logger.d("'Play' command failed: %s", new Object[]{str2});
                kVar.g.c(2, this.f, str2);
            }
            this.c = null;
            this.a = null;
            this.b = (byte) 3;
            objE = l2tVar.E(this);
            if (objE != d9nVar) {
                return objE;
            }
        }
        return d9nVar;
    }
}
