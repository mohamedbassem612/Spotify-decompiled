package com.spotify.oopsplatform.appintegration;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.spotify.androidx.workmanager.SpotifyCoroutineWorker;
import kotlin.Metadata;
import p.a2u;
import p.d9n;
import p.eg;
import p.ett;
import p.fn31;
import p.hm5;
import p.kly0;
import p.lnm;
import p.onm;
import p.q8n;
import p.ro30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0012BY\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\b¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/spotify/oopsplatform/appintegration/DiagnosticReportUploadWorker;", "Lcom/spotify/androidx/workmanager/SpotifyCoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "Lp/q8n;", "ioDispatcher", "Lp/kly0;", "Lp/w5b1;", "httpProvider", "Lp/nfa0;", "jsonProvider", "Lp/t2j0;", "Lp/s2j0;", "eventPublisher", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lp/q8n;Lp/kly0;Lp/kly0;Lp/kly0;)V", "p/kaq", "src_main_java_com_spotify_oopsplatform_appintegration-appintegration"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DiagnosticReportUploadWorker extends SpotifyCoroutineWorker {
    public final q8n i;
    public final kly0 j;
    public final kly0 k;
    public final ro30 l;

    public DiagnosticReportUploadWorker(Context context, WorkerParameters workerParameters, q8n q8nVar, kly0 kly0Var, kly0 kly0Var2, kly0 kly0Var3) {
        super(context, workerParameters);
        this.i = q8nVar;
        this.j = kly0Var;
        this.k = kly0Var2;
        this.l = new ro30(context, kly0Var3, (byte) 2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(lnm lnmVar) {
        a2u a2uVar;
        if (lnmVar instanceof a2u) {
            a2uVar = (a2u) lnmVar;
            int i = a2uVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                a2uVar.c = i - Integer.MIN_VALUE;
            } else {
                a2uVar = new a2u(this, (onm) lnmVar);
            }
        } else {
            a2uVar = new a2u(this, (onm) lnmVar);
        }
        Object objY = a2uVar.a;
        int i2 = a2uVar.c;
        lnm lnmVar2 = null;
        if (i2 == 0) {
            hm5.M(objY);
            ett ettVar = new ett((Object) this, lnmVar2, (byte) 2);
            a2uVar.c = 1;
            objY = fn31.Y(this.i, ettVar, a2uVar);
            d9n d9nVar = d9n.a;
            if (objY == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objY);
        }
        return objY;
    }
}
