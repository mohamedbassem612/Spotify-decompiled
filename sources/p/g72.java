package p;

import android.content.ContentResolver;
import android.provider.Settings;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class g72 implements dwo {
    public final e72 X;
    public final i72 a;
    public final ContentResolver b;
    public final Scheduler c;
    public final o72 d;
    public final eyh0 e;
    public final mwt f;
    public final x8c0 g;
    public final vku h;
    public final llm i;
    public spq0 t;

    public g72(i72 i72Var, ContentResolver contentResolver, Flowable flowable, Scheduler scheduler, q8n q8nVar, o72 o72Var, ark1 ark1Var, eyh0 eyh0Var, mwt mwtVar, x8c0 x8c0Var) {
        this.a = i72Var;
        this.b = contentResolver;
        this.c = scheduler;
        this.d = o72Var;
        this.e = eyh0Var;
        this.f = mwtVar;
        this.g = x8c0Var;
        vku vkuVar = new vku();
        this.h = vkuVar;
        llm llmVarE = smo1.e(q8nVar);
        this.i = llmVarE;
        this.t = j5.a;
        this.X = new e72(this, (byte) 0);
        vkuVar.a(flowable.j(mo9.Y).x(mif1.h).J(qz70.d).L(scheduler).subscribe(new xu(this, (byte) 2)));
        vkuVar.a(ark1Var.a().subscribe(new tg(this, (byte) 13)));
        fn31.T(llmVarE, (o8n) null, 0, new d72(this, ark1Var.c(), (lnm) null), 3);
        vkuVar.a(new CompletableFromAction(new c72(this, (byte) 0)).s(scheduler).subscribe());
    }

    public static final void d(g72 g72Var, ContextTrack contextTrack) {
        ContentResolver contentResolver = g72Var.b;
        o72 o72Var = g72Var.d;
        i72 i72Var = g72Var.a;
        j380 j380VarMetadata = contextTrack.metadata();
        String str = (String) j380VarMetadata.get("is_advertisement");
        String str2 = (String) j380VarMetadata.get("ad_id");
        String str3 = (String) j380VarMetadata.get("duration");
        boolean z = Boolean.parseBoolean(str);
        i5w0 i5w0Var = new i5w0(Boolean.valueOf(z));
        boolean z2 = z && !i72Var.b.equals(str2);
        if (u890.j(g72Var.t, i5w0Var)) {
            if (z2) {
                g72Var.t = i5w0Var;
                if (str2 == null || str3 == null) {
                    return;
                }
                i72Var.a = true;
                i72Var.b = str2;
                o72Var.e = str2;
                return;
            }
            return;
        }
        g72Var.t = i5w0Var;
        if (!z) {
            i72Var.a = false;
            contentResolver.unregisterContentObserver(o72Var);
        } else {
            if (str2 == null || str3 == null) {
                return;
            }
            i72Var.a = true;
            i72Var.b = str2;
            contentResolver.registerContentObserver(Settings.System.CONTENT_URI, true, o72Var);
            o72Var.e = str2;
        }
    }

    public final void shutdown() {
        this.h.c();
        smo1.p(this.i, null);
        smo1.p((llm) ((ycc1) this.e.d).c, null);
        new CompletableFromAction(new f72(this, (byte) 0)).s(this.c).subscribe();
    }
}
