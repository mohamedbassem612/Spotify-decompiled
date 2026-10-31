package com.spotify.collection.contentimpl.played;

import android.content.Intent;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.internal.observers.BlockingMultiObserver;
import kotlin.Metadata;
import p.arg0;
import p.f4i1;
import p.hhg1;
import p.u890;
import p.vjp;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/collection/contentimpl/played/PlayedStateService;", "Lp/vjp;", "<init>", "()V", "src_main_java_com_spotify_collection_contentimpl-contentimpl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PlayedStateService extends vjp {
    public arg0 a;

    public PlayedStateService() {
        super("PlayedStateService");
    }

    public final void onHandleIntent(Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (!"PlayedStateService.action.PLAYED".equals(action)) {
            hhg1.f(f4i1.f("Unsupported action ", action, " in PlayedStateService."));
            return;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("uris");
        boolean booleanExtra = intent.getBooleanExtra("played", false);
        arg0 arg0Var = this.a;
        if (booleanExtra) {
            if (arg0Var == null) {
                u890.C("markAsPlayedDataSource");
                throw null;
            }
            stringArrayExtra.getClass();
            Completable completableA = arg0Var.a(stringArrayExtra);
            BlockingMultiObserver blockingMultiObserver = new BlockingMultiObserver();
            completableA.subscribe(blockingMultiObserver);
            blockingMultiObserver.b();
            return;
        }
        if (arg0Var == null) {
            u890.C("markAsPlayedDataSource");
            throw null;
        }
        stringArrayExtra.getClass();
        Completable completableB = arg0Var.b(stringArrayExtra);
        BlockingMultiObserver blockingMultiObserver2 = new BlockingMultiObserver();
        completableB.subscribe(blockingMultiObserver2);
        blockingMultiObserver2.b();
    }
}
