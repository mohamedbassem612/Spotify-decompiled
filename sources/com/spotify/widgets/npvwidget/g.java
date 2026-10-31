package com.spotify.widgets.npvwidget;

import android.content.Context;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.outcome.outcomeapi.exceptions.HttpError;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.CancellationException;
import p.a8d1;
import p.ae5;
import p.beh;
import p.c9n;
import p.d9n;
import p.eg;
import p.fc11;
import p.feh;
import p.fn31;
import p.hm5;
import p.l2t;
import p.lnm;
import p.rih1;
import p.tv80;
import p.u890;
import p.vu30;
import p.x610;
import p.z610;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class g extends a8d1 implements vu30 {
    public l2t a;
    public byte b;
    public /* synthetic */ Object c;
    public final /* synthetic */ k d;
    public final /* synthetic */ WidgetInteraction.ItemClick e;
    public final /* synthetic */ tv80 f;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, WidgetInteraction.ItemClick itemClick, tv80 tv80Var, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.d = kVar;
        this.e = itemClick;
        this.f = tv80Var;
        this.g = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        g gVar = new g(this.d, this.e, this.f, this.g, lnmVar);
        gVar.c = obj;
        return gVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b0 A[Catch: Exception -> 0x0034, HttpError -> 0x0037, CancellationException -> 0x00cf, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00cf, Exception -> 0x0034, HttpError -> 0x0037, blocks: (B:12:0x002d, B:28:0x00aa, B:30:0x00b0, B:19:0x003c, B:25:0x0066, B:22:0x0050), top: B:40:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0105 A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [byte] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [p.l2t] */
    /* JADX WARN: Type inference failed for: r4v7 */
    public final Object invokeSuspend(Object obj) {
        ?? r4;
        Object objE;
        Object objM;
        l2t l2tVar;
        Object objJ;
        beh behVar;
        k kVar = this.d;
        ae5 ae5Var = kVar.g;
        c9n c9nVar = (c9n) this.c;
        ?? r5 = this.b;
        String str = this.g;
        tv80 tv80Var = this.f;
        WidgetInteraction.ItemClick itemClick = this.e;
        d9n d9nVar = d9n.a;
        try {
            if (r5 == 0) {
                hm5.M(obj);
                l2t l2tVarQ = fn31.q(c9nVar, kVar.j, 0, new f(kVar, itemClick, tv80Var, null), 2);
                Flowable flowableA = kVar.a.a("npvwidget");
                this.c = null;
                this.a = l2tVarQ;
                this.b = (byte) 1;
                objM = u890.m(flowableA, 1, this);
                l2tVar = l2tVarQ;
                if (objM == d9nVar) {
                }
                return d9nVar;
            }
            if (r5 == 1) {
                l2t l2tVar2 = this.a;
                hm5.M(obj);
                objM = obj;
                l2tVar = l2tVar2;
            } else {
                if (r5 != 2) {
                    if (r5 == 3) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                l2t l2tVar3 = this.a;
                hm5.M(obj);
                objJ = obj;
                r5 = l2tVar3;
            }
            behVar = (feh) objJ;
            r4 = r5;
            if (behVar instanceof beh) {
                String str2 = behVar.a;
                Logger.k("'Play URI' command failed: %s", new Object[]{str2});
                ae5Var.c(1, str, str2);
                r4 = r5;
            }
            this.c = null;
            this.a = null;
            this.b = (byte) 3;
            objE = r4.E(this);
            if (objE != d9nVar) {
                return d9nVar;
            }
            return objE;
            Single singleE = ((x610) objM).c().e(new z610(itemClick.getUri().toString(), null, null, null, PlayOrigin.create("proactiveplatforms-widget"), LoggingParams.builder().interactionId(tv80Var.a.a).build(), 14));
            this.c = null;
            this.a = l2tVar;
            this.b = (byte) 2;
            objJ = fc11.j(singleE, this);
            r5 = l2tVar;
            if (objJ != d9nVar) {
                behVar = (feh) objJ;
                r4 = r5;
                if (behVar instanceof beh) {
                    String str3 = behVar.a;
                    Logger.k("'Play URI' command failed: %s", new Object[]{str3});
                    ae5Var.c(1, str, str3);
                    r4 = r5;
                }
                this.c = null;
                this.a = null;
                this.b = (byte) 3;
                objE = r4.E(this);
                if (objE != d9nVar) {
                    return objE;
                }
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.k("'Play URI' command failed unexpectedly: %s", new Object[]{e2.getMessage()});
            r4 = r5;
        } catch (HttpError e3) {
            Context context = kVar.e;
            String string = context.getString(2131959293);
            Logger.k(string, new Object[0]);
            Intent intent = new Intent(context, (Class<?>) WidgetUpdateCoordinator.class);
            intent.setAction("com.spotify.widgets.widgets.ACTION_TOOLTIP");
            intent.putExtra("com.spotify.widgets.widgets.EXTRA_WIDGET_TOOLTIP_MESSAGE", string);
            context.sendBroadcast(intent);
            ae5Var.c(1, str, e3.b);
            r4 = r5;
        }
        return d9nVar;
    }
}
