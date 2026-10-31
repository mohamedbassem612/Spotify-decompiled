package com.spotify.localfiles.settings.localfiles.impl;

import com.spotify.localfiles.settings.localfiles.api.LocalFilesLibrarySettingsItemFactory;
import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;
import kotlin.Metadata;
import p.abd1;
import p.c0g;
import p.cxo1;
import p.ibd1;
import p.jgb1;
import p.rc11;
import p.xad1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/spotify/localfiles/settings/localfiles/impl/LocalFilesLibrarySettingsItemFactoryImpl;", "Lcom/spotify/localfiles/settings/localfiles/api/LocalFilesLibrarySettingsItemFactory;", "<init>", "()V", "Lp/jgb1;", "create", "()Lp/jgb1;", "src_main_java_com_spotify_localfiles_settings_localfiles_impl-impl"}, k = 1, mv = {2, 3, 0}, xi = StreamStartRequestOuterClass$StreamStartRequest.PREVIEW_IMPRESSION_URI_FIELD_NUMBER)
public final class LocalFilesLibrarySettingsItemFactoryImpl implements LocalFilesLibrarySettingsItemFactory {
    /* JADX INFO: renamed from: create, reason: merged with bridge method [inline-methods] */
    public jgb1 m0create() {
        Integer numValueOf = Integer.valueOf(R.string.settings_item_local_files_library_title);
        Integer numValueOf2 = Integer.valueOf(R.string.settings_item_local_files_library_description);
        c0g.x.getClass();
        return new jgb1("localFilesLibrary", numValueOf, null, numValueOf2, null, null, null, null, cxo1.P0, null, new ibd1(new xad1(29, false), new abd1(rc11.a.b(LocalFilesSettingsValueAccessor.class))), null, 90042);
    }
}
