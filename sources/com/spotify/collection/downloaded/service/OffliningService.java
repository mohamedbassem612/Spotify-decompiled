package com.spotify.collection.downloaded.service;

import android.content.Intent;
import com.spotify.offline_esperanto.proto.EsOffline;
import kotlin.Metadata;
import p.bhn0;
import p.f4i1;
import p.hhg1;
import p.kc20;
import p.kuz;
import p.mpi1;
import p.toz;
import p.u890;
import p.vjp;
import p.vpp0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/spotify/collection/downloaded/service/OffliningService;", "Lp/vjp;", "<init>", "()V", "p/zod", "src_main_java_com_spotify_collection_downloaded-downloaded"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class OffliningService extends vjp {
    public static final /* synthetic */ int b = 0;
    public kuz a;

    public OffliningService() {
        super("OffliningService");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        mpi1 mpi1Var = mpi1.c1;
        String action = intent != null ? intent.getAction() : null;
        if (!"com.spotify.collection.downloaded.service.OffliningService.action.UPDATE".equals(action)) {
            hhg1.f(f4i1.f("Unsupported action ", action, " in OffliningService."));
            return;
        }
        String stringExtra = intent.getStringExtra("uri");
        if (stringExtra == null) {
            bhn0.s(intent, "Unsupported uri in ");
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("state", false);
        kuz kuzVar = this.a;
        if (booleanExtra) {
            if (kuzVar == null) {
                u890.C("offlineInteractor");
                throw null;
            }
            vpp0 vpp0Var = kuzVar.a;
            toz tozVarO = EsOffline.DownloadRequest.o();
            tozVarO.r(stringExtra);
            kuzVar.b.detached(vpp0Var.a(tozVarO.build()).map(mpi1Var));
            return;
        }
        if (kuzVar == null) {
            u890.C("offlineInteractor");
            throw null;
        }
        vpp0 vpp0Var2 = kuzVar.a;
        toz tozVarO2 = EsOffline.DownloadRequest.o();
        tozVarO2.r(stringExtra);
        kuzVar.b.detached(vpp0Var2.callSingle("spotify.offline_esperanto.proto.Offline", "RemoveDownload", tozVarO2.build()).map(kc20.T0).map(mpi1Var));
    }
}
