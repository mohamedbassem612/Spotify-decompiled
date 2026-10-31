package com.spotify.localfiles.mediastore;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import p.iu30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B9\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB3\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\f\u0010\u000eJ!\u0010\u000f\u001a\u00020\b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\t\u0010\u0015J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\t\u0010\u0018R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/spotify/localfiles/mediastore/MediaStoreReader$ObservedQueries;", "Landroid/database/ContentObserver;", "", "Landroid/database/Cursor;", "queries", "", "handle", "Lkotlin/Function1;", "Lp/rih1;", "onChange", "Landroid/os/Handler;", "handler", "<init>", "(Ljava/util/List;JLp/iu30;Landroid/os/Handler;)V", "(Ljava/util/List;JLp/iu30;)V", "prepareForShutdown", "(Lp/iu30;)V", "freeHandle", "stop", "", "selfChange", "(Z)V", "Landroid/net/Uri;", "uri", "(ZLandroid/net/Uri;)V", "Ljava/util/List;", "J", "Lp/iu30;", "Landroid/os/Handler;", "src_main_java_com_spotify_localfiles_mediastore-mediastore"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MediaStoreReader$ObservedQueries extends ContentObserver {
    private final long handle;
    private final Handler handler;
    private final iu30 onChange;
    private final List<Cursor> queries;

    /* JADX WARN: Multi-variable type inference failed */
    public MediaStoreReader$ObservedQueries(List<? extends Cursor> list, long j, iu30 iu30Var, Handler handler) {
        super(handler);
        this.queries = list;
        this.handle = j;
        this.onChange = iu30Var;
        this.handler = handler;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Cursor) it.next()).registerContentObserver(this);
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean selfChange, Uri uri) {
        this.onChange.invoke(Long.valueOf(this.handle));
    }

    public final void prepareForShutdown(iu30 prepareForShutdown) {
        prepareForShutdown.invoke(Long.valueOf(this.handle));
    }

    public final void stop(final iu30 freeHandle) {
        Iterator<T> it = this.queries.iterator();
        while (it.hasNext()) {
            ((Cursor) it.next()).unregisterContentObserver(this);
        }
        this.handler.post(new Runnable() { // from class: com.spotify.localfiles.mediastore.MediaStoreReader$ObservedQueries$stop$2
            @Override // java.lang.Runnable
            public final void run() {
                freeHandle.invoke(Long.valueOf(this.handle));
            }
        });
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean selfChange) {
        onChange(selfChange, null);
    }

    public MediaStoreReader$ObservedQueries(List<? extends Cursor> list, long j, iu30 iu30Var) {
        this(list, j, iu30Var, new Handler(Looper.getMainLooper()));
    }
}
