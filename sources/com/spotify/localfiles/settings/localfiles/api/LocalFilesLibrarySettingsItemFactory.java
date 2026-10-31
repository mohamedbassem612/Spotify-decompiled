package com.spotify.localfiles.settings.localfiles.api;

import kotlin.Metadata;
import p.sq61;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/spotify/localfiles/settings/localfiles/api/LocalFilesLibrarySettingsItemFactory;", "", "Lp/sq61;", "create", "()Lp/sq61;", "Companion", "src_main_java_com_spotify_localfiles_settings_localfiles_api-api"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface LocalFilesLibrarySettingsItemFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final String ID = "localFilesLibrary";

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/spotify/localfiles/settings/localfiles/api/LocalFilesLibrarySettingsItemFactory$Companion;", "", "<init>", "()V", "ID", "", "src_main_java_com_spotify_localfiles_settings_localfiles_api-api"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String ID = "localFilesLibrary";

        private Companion() {
        }
    }

    sq61 create();
}
