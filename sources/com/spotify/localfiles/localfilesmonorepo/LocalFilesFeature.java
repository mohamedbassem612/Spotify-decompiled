package com.spotify.localfiles.localfilesmonorepo;

import android.net.Uri;
import kotlin.Metadata;
import p.lnm;
import p.mr20;
import p.rih1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003H¦@¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000e\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lcom/spotify/localfiles/localfilesmonorepo/LocalFilesFeature;", "", "Lp/mr20;", "", "isEnabled", "()Lp/mr20;", "enabled", "Lp/rih1;", "setEnabled", "(ZLp/lnm;)Ljava/lang/Object;", "Landroid/net/Uri;", "uri", "registerTemporaryFile", "(Landroid/net/Uri;)V", "removeTemporaryFile", "Lcom/spotify/localfiles/localfilesmonorepo/AddedLocalFile;", "resolveTemporaryFile", "(Landroid/net/Uri;)Lcom/spotify/localfiles/localfilesmonorepo/AddedLocalFile;", "src_main_java_com_spotify_localfiles_localfiles-android-localfiles"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface LocalFilesFeature {
    mr20 isEnabled();

    void registerTemporaryFile(Uri uri);

    void removeTemporaryFile(Uri uri);

    AddedLocalFile resolveTemporaryFile(Uri uri);

    Object setEnabled(boolean z, lnm<? super rih1> lnmVar);
}
