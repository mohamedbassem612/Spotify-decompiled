package com.spotify.localfiles.localfilescore;

import android.content.Context;
import com.spotify.localfiles.mediastore.OpenedAudioFiles;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.f961;
import p.hab0;
import p.hlm;
import p.io80;
import p.klm;
import p.luk;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aE\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lp/hlm;", "contextRuntime", "Lkotlin/Function0;", "Landroid/content/Context;", "context", "Lp/luk;", "configurationProvider", "Lcom/spotify/localfiles/mediastore/OpenedAudioFiles;", "openedAudioFiles", "Lp/io80;", "Lcom/spotify/localfiles/localfilesapi/LocalFilesApi;", "installLocalFilesService", "(Lp/hlm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lp/io80;", "src_main_java_com_spotify_localfiles_localfilescore-localfilescore"}, k = 2, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class NucleusLocalFilesServiceInstallerKt {

    /* JADX INFO: renamed from: com.spotify.localfiles.localfilescore.NucleusLocalFilesServiceInstallerKt$installLocalFilesService$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp/f961;", "Lcom/spotify/localfiles/localfilesapi/LocalFilesApi;", "invoke", "()Lp/f961;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class AnonymousClass1 extends hab0 implements Function0 {
        final /* synthetic */ Function0 $configurationProvider;
        final /* synthetic */ Function0 $context;
        final /* synthetic */ Function0 $openedAudioFiles;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0 function0, Function0 function1, Function0 function2) {
            super(0);
            this.$context = function0;
            this.$configurationProvider = function1;
            this.$openedAudioFiles = function2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final f961 invoke() {
            return LocalFilesServiceKt.createLocalFilesService(new LocalFilesServiceDependencies((Context) this.$context.invoke(), (luk) this.$configurationProvider.invoke(), (OpenedAudioFiles) this.$openedAudioFiles.invoke()));
        }
    }

    public static final io80 installLocalFilesService(hlm hlmVar, Function0 function0, Function0 function1, Function0 function2) {
        return ((klm) hlmVar).b("LocalFilesService", new AnonymousClass1(function0, function1, function2));
    }
}
