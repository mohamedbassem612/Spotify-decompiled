package com.spotify.share.sheet.sections.preview.previewrow.impl;

import com.spotify.share.sheet.sections.preview.previewrow.api.ShareSheetPreviewSection;
import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.qv61;
import p.rk71;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/spotify/share/sheet/sections/preview/previewrow/impl/ShareSheetPreviewSectionImpl;", "Lcom/spotify/share/sheet/sections/preview/previewrow/api/ShareSheetPreviewSection;", "Lp/rk71;", "shareSheetPreviewSectionElement", "<init>", "(Lp/rk71;)V", "src_main_java_com_spotify_share_sheet_sections_preview_previewrow_impl-impl"}, k = 1, mv = {2, 3, 0}, xi = StreamStartRequestOuterClass$StreamStartRequest.PREVIEW_IMPRESSION_URI_FIELD_NUMBER)
public final class ShareSheetPreviewSectionImpl implements ShareSheetPreviewSection {
    public final rk71 a;

    public ShareSheetPreviewSectionImpl(rk71 rk71Var) {
        this.a = rk71Var;
    }

    public final Function0 b() {
        return new qv61(this, (byte) 13);
    }
}
