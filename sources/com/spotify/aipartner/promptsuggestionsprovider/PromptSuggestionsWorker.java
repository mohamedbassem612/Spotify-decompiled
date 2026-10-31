package com.spotify.aipartner.promptsuggestionsprovider;

import android.content.Context;
import android.net.Uri;
import androidx.work.WorkerParameters;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.androidx.workmanager.SpotifyCoroutineWorker;
import kotlin.Metadata;
import p.d9n;
import p.eg;
import p.ewq;
import p.g1x0;
import p.hm5;
import p.lnm;
import p.onm;
import p.tzr0;
import p.v8d0;
import p.vwx0;
import p.vyx0;
import p.wyx0;
import p.y8d0;
import p.z8d0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\fB-\b\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/spotify/aipartner/promptsuggestionsprovider/PromptSuggestionsWorker;", "Lcom/spotify/androidx/workmanager/SpotifyCoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "Lp/vyx0;", "store", "Lp/vwx0;", "fetcher", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lp/vyx0;Lp/vwx0;)V", "p/oaq", "src_main_java_com_spotify_aipartner_promptsuggestionsprovider-promptsuggestionsprovider"}, k = 1, mv = {2, 3, SplitInstallErrorCode.NO_ERROR}, xi = 48)
public final class PromptSuggestionsWorker extends SpotifyCoroutineWorker {
    public final vyx0 i;
    public final vwx0 j;

    public PromptSuggestionsWorker(Context context, WorkerParameters workerParameters, vyx0 vyx0Var, vwx0 vwx0Var) {
        super(context, workerParameters);
        this.i = vyx0Var;
        this.j = vwx0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(lnm lnmVar) {
        wyx0 wyx0Var;
        Uri uri;
        if (lnmVar instanceof wyx0) {
            wyx0Var = (wyx0) lnmVar;
            int i = wyx0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wyx0Var.c = i - Integer.MIN_VALUE;
            } else {
                wyx0Var = new wyx0(this, (onm) lnmVar);
            }
        } else {
            wyx0Var = new wyx0(this, (onm) lnmVar);
        }
        Object obj = wyx0Var.a;
        int i2 = wyx0Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            WorkerParameters workerParameters = ((z8d0) this).b;
            ewq ewqVar = workerParameters.b;
            ewq ewqVar2 = workerParameters.b;
            String strC = ewqVar.c("content_uri");
            if (strC == null || (uri = Uri.parse(strC)) == null) {
                return new v8d0();
            }
            String strC2 = ewqVar2.c("request_id");
            if (strC2 == null) {
                return new v8d0();
            }
            String strC3 = ewqVar2.c("calling_package");
            if (strC3 == null) {
                return new v8d0();
            }
            tzr0 tzr0Var = new tzr0((byte) 28, this.i, this.j, new g1x0(this, uri, (byte) 15), strC3);
            wyx0Var.c = 1;
            Object objQ = tzr0Var.q(strC2, wyx0Var);
            d9n d9nVar = d9n.a;
            if (objQ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return y8d0.a();
    }
}
