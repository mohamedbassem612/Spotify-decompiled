package com.spotify.localfiles.localfilescore;

import android.content.Context;
import com.spotify.localfiles.mediastore.MediaStoreReaderOptions;
import com.spotify.localfiles.mediastore.OpenedAudioFiles;
import com.spotify.localfiles.mediastoreimpl.LocalFilesProperties;
import com.spotify.localfiles.mediastoreimpl.MediaStoreReaderModule_Companion_ProvideMediaStoreReaderOptionsFactory;
import p.c8o;
import p.luk;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
final class DaggerLocalFilesServiceFactoryComponent {

    public static final class Factory implements LocalFilesServiceFactoryComponent.Factory {
        public /* synthetic */ Factory(int i) {
            this();
        }

        @Override // com.spotify.localfiles.localfilescore.LocalFilesServiceFactoryComponent.Factory
        public LocalFilesServiceFactoryComponent create(LocalFilesServiceDependencies localFilesServiceDependencies) {
            c8o.i(localFilesServiceDependencies);
            return new LocalFilesServiceFactoryComponentImpl(localFilesServiceDependencies);
        }

        private Factory() {
        }
    }

    public static final class LocalFilesServiceFactoryComponentImpl implements LocalFilesServiceFactoryComponent {
        private final LocalFilesServiceDependencies localFilesServiceDependencies;
        private final LocalFilesServiceFactoryComponentImpl localFilesServiceFactoryComponentImpl = this;

        public LocalFilesServiceFactoryComponentImpl(LocalFilesServiceDependencies localFilesServiceDependencies) {
            this.localFilesServiceDependencies = localFilesServiceDependencies;
        }

        public LocalFilesProperties localFilesProperties() {
            luk configurationProvider = this.localFilesServiceDependencies.getConfigurationProvider();
            c8o.l(configurationProvider);
            return new LocalFilesProperties(configurationProvider);
        }

        @Override // com.spotify.localfiles.localfilescore.LocalFilesServiceFactoryComponent
        public LocalFilesService localFilesService() {
            Context context = this.localFilesServiceDependencies.getContext();
            c8o.l(context);
            MediaStoreReaderOptions mediaStoreReaderOptions = mediaStoreReaderOptions();
            OpenedAudioFiles openedAudioFiles = this.localFilesServiceDependencies.getOpenedAudioFiles();
            c8o.l(openedAudioFiles);
            return new LocalFilesService(context, mediaStoreReaderOptions, openedAudioFiles);
        }

        public MediaStoreReaderOptions mediaStoreReaderOptions() {
            return MediaStoreReaderModule_Companion_ProvideMediaStoreReaderOptionsFactory.provideMediaStoreReaderOptions(localFilesProperties());
        }
    }

    private DaggerLocalFilesServiceFactoryComponent() {
    }

    public static LocalFilesServiceFactoryComponent.Factory factory() {
        return new Factory(0);
    }
}
