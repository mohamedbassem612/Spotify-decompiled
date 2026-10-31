package com.spotify.localfiles.mediastoreimpl;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.aey0;
import p.cv30;
import p.hab0;
import p.iv30;
import p.luk;
import p.tv30;
import p.u890;
import p.ydy0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/spotify/localfiles/mediastoreimpl/LocalFilesProperties;", "invoke"}, k = 3, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class LocalFilesProperties$dataProps$2 extends hab0 implements Function0 {
    final /* synthetic */ LocalFilesProperties this$0;

    /* JADX INFO: renamed from: com.spotify.localfiles.mediastoreimpl.LocalFilesProperties$dataProps$2$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
    public static final /* synthetic */ class AnonymousClass1 implements ydy0, iv30 {
        final /* synthetic */ LocalFilesProperties $tmp0;

        public AnonymousClass1(LocalFilesProperties localFilesProperties) {
            this.$tmp0 = localFilesProperties;
        }

        @Override // p.ydy0
        public final LocalFilesProperties create(aey0 aey0Var) {
            return this.$tmp0.parse(aey0Var);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p.iv30
        public final cv30 getFunctionDelegate() {
            return new tv30(1, this.$tmp0, LocalFilesProperties.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/localfiles/mediastoreimpl/LocalFilesProperties;", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalFilesProperties$dataProps$2(LocalFilesProperties localFilesProperties) {
        super(0);
        this.this$0 = localFilesProperties;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LocalFilesProperties invoke() {
        luk lukVar = this.this$0.configProvider;
        if (lukVar != null) {
            return (LocalFilesProperties) lukVar.e(new AnonymousClass1(this.this$0));
        }
        return null;
    }
}
